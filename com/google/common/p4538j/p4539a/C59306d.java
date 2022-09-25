package com.google.common.p4538j.p4539a;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.j.a.d */
/* compiled from: PG */
public final class C59306d {

    /* renamed from: a */
    public static final C58528ij f157466a = C58528ij.m90015O("applet", "base", "embed", "math", "meta", "object", "svg", "template");

    /* renamed from: b */
    private static final C58528ij f157467b = new C58759qy("script");

    /* renamed from: c */
    private static final C58528ij f157468c = new C58759qy("style");

    /* renamed from: d */
    private static final C58528ij f157469d = C58528ij.m90015O("area", "br", "col", "hr", "img", "input", "link", "param", "source", "track", "wbr");

    /* renamed from: e */
    private static final C58528ij f157470e = C58528ij.m90011K("a", "area");

    /* renamed from: f */
    private static final C58528ij f157471f = C58528ij.m90015O("alternate", "author", "bookmark", "canonical", "cite", "help", "icon", "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", "search", "subresource");

    static {
        new C58759qy("input");
        new C58759qy("form");
        new C58759qy("script");
        C58528ij.m90011K("button", "input");
        C58528ij.m90011K("button", "input");
        new C58759qy("form");
        new C58759qy("input");
        C58528ij.m90011K("input", "textarea");
        C58528ij.m90014N("audio", "img", "input", "source", "video");
        new C58759qy("iframe");
    }

    /* renamed from: a */
    public static final C59305c m92150a(String str, Map map, List list) {
        StringBuilder sb = new StringBuilder("<".concat("a"));
        for (Map.Entry entry : map.entrySet()) {
            sb.append(" " + ((String) entry.getKey()) + "=\"" + C59303a.f157436a.mo56216a((String) entry.getValue()) + "\"");
        }
        boolean contains = f157469d.contains("a");
        sb.append(">");
        if (!contains) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            sb.append("</a>");
        }
        return new C59305c(sb.toString());
    }

    /* renamed from: b */
    public static final void m92151b(String str, String str2, List list) {
        C58838bb.m90884s(!f157469d.contains("a"), "Element \"a\" is a void element and so cannot have content.");
        C58838bb.m90884s(!((C58759qy) f157467b).f156534a.equals("a"), "Element \"a\" requires SafeScript contents, not SafeHTML or text.");
        C58838bb.m90884s(true ^ ((C58759qy) f157468c).f156534a.equals("a"), "Element \"a\" requires SafeStyleSheet contents, not SafeHTML or text.");
        for (C59305c cVar : Arrays.asList(new C59305c[]{new C59305c(C59303a.f157436a.mo56216a(C59303a.m92149a(str)))})) {
            list.add(cVar.f157465a);
        }
    }

    /* renamed from: c */
    public static final void m92152c(C59309g gVar, String str, Map map) {
        C58528ij ijVar = f157470e;
        if (ijVar.contains("a")) {
            map.put("href", C59303a.m92149a(gVar.f157477b));
        } else {
            new StringBuilder("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ").append(ijVar);
            throw new IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(String.valueOf(ijVar)));
        }
    }
}
