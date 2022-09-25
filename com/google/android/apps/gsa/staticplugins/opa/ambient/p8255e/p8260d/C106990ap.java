package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106593e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106595g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.d.ap */
/* compiled from: PG */
public final class C106990ap {

    /* renamed from: a */
    private final C106593e f297995a = ((C106593e) C106596h.f297204n.createBuilder());

    /* renamed from: b */
    private final C21370a f297996b;

    public C106990ap(C21370a aVar) {
        this.f297996b = aVar;
    }

    /* renamed from: a */
    public final synchronized C106596h mo95727a() {
        return (C106596h) this.f297995a.build();
    }

    /* renamed from: b */
    public final synchronized void mo95728b() {
        this.f297995a.clear();
    }

    /* renamed from: c */
    public final synchronized void mo95729c(C106596h hVar) {
        this.f297995a.mergeFrom(hVar);
    }

    /* renamed from: d */
    public final synchronized void mo95730d(C106532f fVar) {
        C106529c a = C106529c.m177304a(fVar.f297081b);
        if (a == null) {
            a = C106529c.UNSPECIFIED;
        }
        boolean equals = a.equals(C106529c.CONNECTED);
        C106593e eVar = this.f297995a;
        eVar.copyOnWrite();
        C106596h hVar = (C106596h) eVar.instance;
        C106596h hVar2 = C106596h.f297204n;
        hVar.f297206a |= 4;
        hVar.f297208c = equals;
        C106593e eVar2 = this.f297995a;
        C106531e a2 = C106531e.m177306a(fVar.f297082c);
        if (a2 == null) {
            a2 = C106531e.UNKNOWN;
        }
        eVar2.copyOnWrite();
        C106596h hVar3 = (C106596h) eVar2.instance;
        hVar3.f297207b = a2.f297077e;
        hVar3.f297206a |= 1;
        C106593e eVar3 = this.f297995a;
        String str = fVar.f297083d;
        eVar3.copyOnWrite();
        C106596h hVar4 = (C106596h) eVar3.instance;
        str.getClass();
        hVar4.f297206a |= 64;
        hVar4.f297212g = str;
        C106593e eVar4 = this.f297995a;
        String str2 = fVar.f297085f;
        eVar4.copyOnWrite();
        C106596h hVar5 = (C106596h) eVar4.instance;
        str2.getClass();
        hVar5.f297206a |= 128;
        hVar5.f297213h = str2;
        C106593e eVar5 = this.f297995a;
        long j = fVar.f297084e;
        eVar5.copyOnWrite();
        C106596h hVar6 = (C106596h) eVar5.instance;
        hVar6.f297206a |= 32;
        hVar6.f297211f = j;
        if (equals) {
            C106593e eVar6 = this.f297995a;
            long b = this.f297996b.mo26870b();
            eVar6.copyOnWrite();
            C106596h hVar7 = (C106596h) eVar6.instance;
            hVar7.f297206a |= 8;
            hVar7.f297209d = b;
            C106593e eVar7 = this.f297995a;
            eVar7.copyOnWrite();
            C106596h hVar8 = (C106596h) eVar7.instance;
            hVar8.f297206a |= 16;
            hVar8.f297210e = 0;
            return;
        }
        C106593e eVar8 = this.f297995a;
        eVar8.copyOnWrite();
        C106596h hVar9 = (C106596h) eVar8.instance;
        hVar9.f297206a |= 8;
        hVar9.f297209d = 0;
        C106593e eVar9 = this.f297995a;
        long b2 = this.f297996b.mo26870b();
        eVar9.copyOnWrite();
        C106596h hVar10 = (C106596h) eVar9.instance;
        hVar10.f297206a |= 16;
        hVar10.f297210e = b2;
    }

    /* renamed from: e */
    public final synchronized void mo95731e(C106595g gVar) {
        C106593e eVar = this.f297995a;
        eVar.copyOnWrite();
        C106596h hVar = (C106596h) eVar.instance;
        C106596h hVar2 = C106596h.f297204n;
        hVar.f297218m = gVar.f297203i;
        hVar.f297206a |= 32768;
    }

    /* renamed from: f */
    public final synchronized void mo95732f(long j) {
        C106593e eVar = this.f297995a;
        eVar.copyOnWrite();
        C106596h hVar = (C106596h) eVar.instance;
        C106596h hVar2 = C106596h.f297204n;
        hVar.f297206a |= 512;
        hVar.f297215j = j;
    }
}
