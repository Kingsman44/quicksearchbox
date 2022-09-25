package com.google.android.libraries.search.assistant.p2486aa.p2490b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5537a.p5539b.p5540a.C70929n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71085ed;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71086ee;

/* renamed from: com.google.android.libraries.search.assistant.aa.b.a */
/* compiled from: PG */
public final class C32255a {
    /* renamed from: a */
    public static final C71086ee m60036a(C32849cq cqVar, C32796ar arVar) {
        C71085ed edVar = (C71085ed) C71086ee.f189587d.createBuilder();
        C69664n.m101060f(edVar, "newBuilder()");
        C69664n.m101061g(edVar, "builder");
        String b = C32941s.m60951b(cqVar);
        edVar.copyOnWrite();
        C71086ee eeVar = (C71086ee) edVar.instance;
        eeVar.f189590a |= 1;
        eeVar.f189591b = b;
        if (arVar != null) {
            C70929n a = C32941s.f88258a.mo38354a(arVar);
            C69664n.m101060f(a, "convertToLogsContextKey(contextKey)");
            C69664n.m101061g(a, "value");
            edVar.copyOnWrite();
            C71086ee eeVar2 = (C71086ee) edVar.instance;
            a.getClass();
            eeVar2.f189592c = a;
            eeVar2.f189590a |= 4;
        }
        C62942bv build = edVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C71086ee) build;
    }

    /* renamed from: b */
    public static final String m60037b(C32849cq cqVar, int i) {
        C69664n.m101061g(cqVar, "sessionToken");
        String b = C32941s.m60951b(cqVar);
        return b + "(" + i + ")";
    }
}
