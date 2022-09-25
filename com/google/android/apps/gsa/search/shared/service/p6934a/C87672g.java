package com.google.android.apps.gsa.search.shared.service.p6934a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.shared.service.a.g */
/* compiled from: PG */
public final class C87672g {

    /* renamed from: a */
    public C87666a f236978a;

    /* renamed from: b */
    public int f236979b;

    /* renamed from: c */
    public int f236980c;

    /* renamed from: d */
    private final C69464a f236981d;

    /* renamed from: e */
    private final C22871g f236982e;

    public C87672g(C69464a aVar, C22871g gVar) {
        this.f236981d = aVar;
        this.f236982e = gVar;
    }

    /* renamed from: a */
    public final C87666a mo81928a() {
        if (this.f236979b == 0 && this.f236978a == null) {
            C87666a aVar = (C87666a) this.f236981d.mo17428b();
            aVar.getClass();
            this.f236978a = aVar;
            aVar.mo80247m();
        }
        this.f236979b++;
        C87666a aVar2 = this.f236978a;
        aVar2.getClass();
        return aVar2;
    }

    /* renamed from: b */
    public final void mo81929b() {
        int i = this.f236979b;
        if (i > 0) {
            int i2 = i - 1;
            this.f236979b = i2;
            if (i2 == 0) {
                C87666a aVar = this.f236978a;
                aVar.getClass();
                int i3 = this.f236980c + 1;
                this.f236980c = i3;
                this.f236982e.mo28213m("disposeSingleton", (long) aVar.mo80236a(), new C87671f(this, i3));
            }
        }
    }
}
