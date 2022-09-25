package com.google.android.libraries.web.lifecycle.internal;

import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.lifecycle.C43892g;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.lifecycle.internal.h */
/* compiled from: PG */
final class C43900h {

    /* renamed from: a */
    public final Class f114358a;

    /* renamed from: b */
    public C69626l f114359b;

    /* renamed from: c */
    public C69626l f114360c;

    /* renamed from: d */
    public C43892g f114361d;

    /* renamed from: e */
    private C69615a f114362e;

    public C43900h(Class cls) {
        this.f114358a = cls;
    }

    /* renamed from: a */
    public final void mo46906a(C43892g gVar) {
        C43892g gVar2 = this.f114361d;
        C69626l lVar = this.f114359b;
        C69626l lVar2 = this.f114360c;
        if (!(gVar2 == null || lVar2 == null)) {
            C69615a aVar = this.f114362e;
            if (aVar != null) {
                gVar2.mo46410c().mo46897c(aVar);
            }
            C43891f d = gVar2.mo46411d(this.f114358a);
            C69664n.m101060f(d, "previousChild.getPlugin(pluginClass)");
            lVar2.mo5761a(d);
            this.f114361d = null;
        }
        if (gVar != null && lVar != null) {
            C43891f d2 = gVar.mo46411d(this.f114358a);
            C69664n.m101060f(d2, "currentChild.getPlugin(pluginClass)");
            lVar.mo5761a(d2);
            this.f114361d = gVar;
            C43899g gVar3 = new C43899g(this, gVar);
            gVar.mo46410c().mo46896b(gVar3);
            this.f114362e = gVar3;
        }
    }
}
