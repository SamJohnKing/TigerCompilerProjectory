(function(e){e.fn.stupidtable=function(j){return this.each(function(){var d=e(this);j=j||{};j=e.extend({},{"int":function(b,a){return parseInt(b,10)-parseInt(a,10)},"float":function(b,a){return parseFloat(b)-parseFloat(a)},string:function(b,a){return b<a?-1:b>a?1:0},"string-ins":function(b,a){b=b.toLowerCase();a=a.toLowerCase();return b<a?-1:b>a?1:0}},j);d.on("click","th",function(){var b=d.children("tbody").children("tr"),a=e(this),k=0,n=e.fn.stupidtable.dir;d.find("th").slice(0,a.index()).each(function(){var a=
e(this).attr("colspan")||1;k+=parseInt(a,10)});var m=a.data("sort-dir")===n.ASC?n.DESC:n.ASC,p=m==n.DESC?a.data("sort-desc")||a.data("sort")||null:a.data("sort")||null;null!==p&&(d.trigger("beforetablesort",{column:k,direction:m}),d.css("display"),setTimeout(function(){var l=[],c=j[p];b.each(function(a,b){var c=e(b).children().eq(k),d=c.data("sort-value"),c="undefined"!==typeof d?d:c.text();l.push(c)});var f=[],g=0;if(a.data("sort-dir")&&!a.data("sort-desc"))for(c=l.length-1;0<=c;c--)f.push(c);else for(var h=
l.slice(0).sort(c),c=0;c<l.length;c++){for(g=e.inArray(l[c],h);-1!=e.inArray(g,f);)g++;f.push(g)}d.find("th").data("sort-dir",null).removeClass("sorting-desc sorting-asc");a.data("sort-dir",m).addClass("sorting-"+m);g=b.slice(0);for(h=c=0;h<f.length;h++)c=f[h],g[c]=b[h];f=e(g);d.children("tbody").append(f);d.trigger("aftertablesort",{column:k,direction:m});d.css("display")},10))})})};e.fn.stupidtable.dir={ASC:"asc",DESC:"desc"}})(jQuery);
