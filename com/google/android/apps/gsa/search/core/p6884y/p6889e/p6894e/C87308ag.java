package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7020bd.C89409b;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.ag */
/* compiled from: PG */
public class C87308ag extends C87305ad {

    /* renamed from: a */
    private final int f235789a;

    /* renamed from: b */
    private final boolean f235790b;

    /* renamed from: c */
    private final C85536a f235791c;

    /* renamed from: d */
    private final C89409b f235792d;

    /* renamed from: e */
    private final C86124t f235793e;

    public C87308ag(int i, boolean z, C85536a aVar, C89409b bVar, C86124t tVar) {
        this.f235789a = i;
        this.f235790b = z;
        this.f235791c = aVar;
        this.f235792d = bVar;
        this.f235793e = tVar;
    }

    /* renamed from: b */
    public void mo80953b(int i) {
        if (i != 3) {
            this.f235791c.mo79059k(this.f235789a, 2);
        }
    }

    /* renamed from: c */
    public final void mo80954c() {
        if (!this.f235793e.mo79746e(C89972ak.f246529D)) {
            this.f235791c.mo79055g(this.f235789a);
        }
    }

    /* renamed from: d */
    public final boolean mo80955d() {
        if (!this.f235792d.mo83328d(this.f235789a)) {
            return false;
        }
        if (this.f235790b) {
            this.f235791c.mo79055g(this.f235789a);
            return false;
        } else if (!this.f235793e.mo79746e(C89972ak.f246529D)) {
            return true;
        } else {
            this.f235791c.mo79055g(this.f235789a);
            return true;
        }
    }
}
