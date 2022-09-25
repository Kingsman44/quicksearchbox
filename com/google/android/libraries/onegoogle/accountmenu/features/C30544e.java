package com.google.android.libraries.onegoogle.accountmenu.features;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.e */
/* compiled from: PG */
public final class C30544e extends C30628k {

    /* renamed from: a */
    public C58833ax f82513a;

    /* renamed from: b */
    public C58833ax f82514b;

    /* renamed from: c */
    private boolean f82515c;

    /* renamed from: d */
    private byte f82516d;

    public C30544e() {
        C58836b bVar = C58836b.f156633a;
        this.f82513a = bVar;
        this.f82514b = bVar;
    }

    /* renamed from: a */
    public final C30629l mo36204a() {
        if (this.f82516d == 1) {
            return new C30602f(this.f82513a, this.f82514b, this.f82515c);
        }
        throw new IllegalStateException("Missing required properties: isMinimizable");
    }

    /* renamed from: b */
    public final void mo36205b(boolean z) {
        this.f82515c = z;
        this.f82516d = 1;
    }
}
