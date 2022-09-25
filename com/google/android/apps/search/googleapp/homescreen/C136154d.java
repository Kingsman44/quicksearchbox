package com.google.android.apps.search.googleapp.homescreen;

import com.google.android.apps.search.googleapp.homescreen.p10313c.C136150a;
import com.google.p337aa.p338a.C6600b;
import com.google.p337aa.p338a.C6610l;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.d */
/* compiled from: PG */
final class C136154d extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C136193o f370812a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136154d(C136193o oVar) {
        super(1);
        this.f370812a = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C6610l lVar = (C6610l) obj;
        C69664n.m101061g(lVar, "image");
        C136150a aVar = this.f370812a.f370901N;
        if (aVar == null) {
            C69664n.m101065k("headerScrollBehavior");
            aVar = null;
        }
        int a = C6600b.m17998a(lVar.f19639h);
        if (a == 0) {
            a = 1;
        }
        aVar.f370800c = a;
        aVar.mo112803b();
        return C69788q.f186170a;
    }
}
