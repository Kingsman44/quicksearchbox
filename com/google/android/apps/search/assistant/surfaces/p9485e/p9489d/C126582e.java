package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.libraries.assistant.p1533o.C18489g;
import com.google.android.libraries.assistant.p1533o.C18490h;
import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.speech.p5208h.C66596bv;
import com.google.speech.p5208h.C66597bw;
import java.util.Iterator;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.e */
/* compiled from: PG */
public final class C126582e {
    /* renamed from: a */
    public static final C18490h m206951a(C69626l lVar) {
        C18489g gVar = (C18489g) C18490h.f52429c.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        lVar.mo5761a(gVar);
        C62942bv build = gVar.build();
        C69664n.m101060f(build, "newBuilder().apply(init).build()");
        return (C18490h) build;
    }

    /* renamed from: b */
    public static final C66597bw m206952b(String str) {
        C66596bv bvVar = (C66596bv) C66597bw.f181154d.createBuilder();
        bvVar.copyOnWrite();
        C66597bw bwVar = (C66597bw) bvVar.instance;
        bwVar.f181156a |= 2;
        bwVar.f181158c = 1;
        bvVar.copyOnWrite();
        C66597bw bwVar2 = (C66597bw) bvVar.instance;
        str.getClass();
        bwVar2.f181156a = 1 | bwVar2.f181156a;
        bwVar2.f181157b = str;
        C62942bv build = bvVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .ap…       }\n        .build()");
        return (C66597bw) build;
    }

    /* renamed from: c */
    public static final String m206953c(C18496n nVar) {
        String str;
        Object obj;
        C62971cq cqVar = nVar.f52440a;
        C69664n.m101060f(cqVar, "cgiParamList");
        Iterator it = cqVar.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C69664n.m101066l(((C18490h) obj).f52431a, "spknlang")) {
                break;
            }
        }
        C18490h hVar = (C18490h) obj;
        if (hVar != null) {
            str = hVar.f52432b;
        }
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: d */
    public static final String m206954d(C18496n nVar) {
        String str;
        Object obj;
        C62971cq cqVar = nVar.f52440a;
        C69664n.m101060f(cqVar, "cgiParamList");
        Iterator it = cqVar.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C69664n.m101066l(((C18490h) obj).f52431a, "hl")) {
                break;
            }
        }
        C18490h hVar = (C18490h) obj;
        if (hVar != null) {
            str = hVar.f52432b;
        }
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
