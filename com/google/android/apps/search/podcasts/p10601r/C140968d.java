package com.google.android.apps.search.podcasts.p10601r;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97919i;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140642c;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.d */
/* compiled from: PG */
public final class C140968d {
    /* renamed from: a */
    public static final C97920j m228923a(C140642c cVar) {
        C69664n.m101061g(cVar, "<this>");
        C97919i iVar = (C97919i) C97920j.f273426e.createBuilder();
        String b = cVar.mo115812b();
        iVar.copyOnWrite();
        C97920j jVar = (C97920j) iVar.instance;
        b.getClass();
        jVar.f273428a |= 4;
        jVar.f273431d = b;
        String str = cVar.mo115811a().f381995a;
        iVar.copyOnWrite();
        C97920j jVar2 = (C97920j) iVar.instance;
        str.getClass();
        jVar2.f273428a |= 1;
        jVar2.f273429b = str;
        String str2 = cVar.mo115811a().f382001g;
        iVar.copyOnWrite();
        C97920j jVar3 = (C97920j) iVar.instance;
        str2.getClass();
        jVar3.f273428a |= 2;
        jVar3.f273430c = str2;
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "newBuilder()\n    .setGui…w.clusterId)\n    .build()");
        return (C97920j) build;
    }

    /* renamed from: b */
    public static final boolean m228924b(C97920j jVar, C97920j jVar2) {
        C69664n.m101061g(jVar, "<this>");
        C69664n.m101061g(jVar2, "other");
        return C69664n.m101066l(jVar.f273431d, jVar2.f273431d) && m228925c(jVar, jVar2);
    }

    /* renamed from: c */
    public static final boolean m228925c(C97920j jVar, C97920j jVar2) {
        C69664n.m101061g(jVar, "<this>");
        C69664n.m101061g(jVar2, "other");
        if (C69664n.m101066l(jVar.f273429b, jVar2.f273429b)) {
            return true;
        }
        String str = jVar.f273430c;
        C69664n.m101060f(str, "this.clusterId");
        return str.length() > 0 && C69664n.m101066l(jVar.f273430c, jVar2.f273430c);
    }
}
