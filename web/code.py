import web
from socket import *
import json
import re
def Request(str):
    HOST = "10.147.102.222"
    PORT = 4968
    BUFSIZ = 102400
    ADDR = (HOST,PORT)
    if not str:return None
    tcpClientSock=socket(AF_INET,SOCK_STREAM)
    tcpClientSock.connect(ADDR)
    tcpClientSock.send("[SetCode]" + str.encode())
    str=tcpClientSock.recv(BUFSIZ)
    tcpClientSock.close();
    return str



render = web.template.render('templates/')
urls = (
    '/', 'Upload',
    '/upload', 'Upload'
)

class hello:
    def GET(self):
        name = "Norman"
        return render.hello(name)
    def POST(self):
        return "Post"

        
class Upload:
    def GET(self):
        f = open("static\\index.html")
        html = f.read()
        f.close()
        return html

    def POST(self):
        x = web.input(myfile={})
        render = web.template.render('templates')
        result = Request(x['myfile'].value)
        #web.debug(result)
        web.debug('loading')
        result = json.loads(result)
        web.debug('done')
        web.debug(result['State'])
        #print "good"
        json.dump(result['NetAST'], open("flare.json", "wb"))
        lines = x['myfile'].value.split('\n')
        line_number = 1
        src = ""
        
        if result['State']:
            print ("dumping....")
            json.dump(result['NetAST'], open("static\\ast.json", "wb"))
            json.dump(result['NetSymbol'], open("static\\symbol.json", "wb"))
        
        for line in lines:
            src += "%3d. %s\n" % (line_number, line)
            line_number += 1
        try:
            err = result['NetError'].replace("\\r\\n", "\n").split('\n')
        except:
            err = None
        html = render.index(src, err)
        f = open("static\\index.html", "wb")
        f.write(str(html))
        f.close()
        
        return html

        #raise web.seeother('/upload')
        
if __name__ == "__main__":
    app = web.application(urls, globals())
    app.run()