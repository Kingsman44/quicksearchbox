package com.airbnb.lottie.p234a.p235a;

import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p238c.p240b.C4875r;
import com.airbnb.lottie.p238c.p241c.C4878b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.t */
/* compiled from: PG */
public final class C4801t implements C4785d, C4802a {

    /* renamed from: a */
    public final boolean f15286a;

    /* renamed from: b */
    public final C4807f f15287b;

    /* renamed from: c */
    public final C4807f f15288c;

    /* renamed from: d */
    public final C4807f f15289d;

    /* renamed from: e */
    public final int f15290e;

    /* renamed from: f */
    private final List f15291f = new ArrayList();

    public C4801t(C4878b bVar, C4875r rVar) {
        this.f15286a = rVar.f15533d;
        this.f15290e = rVar.f15534e;
        C4807f a = rVar.f15530a.mo9797a();
        this.f15287b = a;
        C4807f a2 = rVar.f15531b.mo9797a();
        this.f15288c = a2;
        C4807f a3 = rVar.f15532c.mo9797a();
        this.f15289d = a3;
        bVar.mo9811h(a);
        bVar.mo9811h(a2);
        bVar.mo9811h(a3);
        a.mo9740g(this);
        a2.mo9740g(this);
        a3.mo9740g(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9727a(C4802a aVar) {
        this.f15291f.add(aVar);
    }

    /* renamed from: d */
    public final void mo9717d() {
        for (int i = 0; i < this.f15291f.size(); i++) {
            ((C4802a) this.f15291f.get(i)).mo9717d();
        }
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
    }

    /* renamed from: g */
    public final String mo9722g() {
        throw null;
    }
}
