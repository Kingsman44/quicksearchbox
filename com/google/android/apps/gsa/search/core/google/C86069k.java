package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.shared.search.C90504l;

/* renamed from: com.google.android.apps.gsa.search.core.google.k */
/* compiled from: PG */
final class C86069k extends C85931cy {

    /* renamed from: a */
    public C90504l f232653a;

    /* renamed from: b */
    private int f232654b;

    /* renamed from: c */
    private byte f232655c;

    /* renamed from: a */
    public final C85932cz mo79582a() {
        if (this.f232655c == 1) {
            return new C86070l(this.f232654b, this.f232653a);
        }
        throw new IllegalStateException("Missing required properties: urlType");
    }

    /* renamed from: b */
    public final void mo79583b(int i) {
        this.f232654b = i;
        this.f232655c = 1;
    }
}
