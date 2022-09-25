package com.google.android.libraries.onegoogle.accountmenu.features.p2359a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.a.a */
/* compiled from: PG */
public final class C30496a extends C30507d {

    /* renamed from: a */
    public C58833ax f82364a;

    /* renamed from: b */
    private C58485gu f82365b;

    /* renamed from: c */
    private final C58833ax f82366c;

    public C30496a() {
        C58836b bVar = C58836b.f156633a;
        this.f82364a = bVar;
        this.f82366c = bVar;
    }

    /* renamed from: a */
    public final C30508e mo36138a() {
        C58485gu guVar = this.f82365b;
        if (guVar != null) {
            return new C30505b(this.f82364a, guVar, this.f82366c);
        }
        throw new IllegalStateException("Missing required properties: flavorCustomActions");
    }

    /* renamed from: b */
    public final void mo36139b(C58485gu guVar) {
        if (guVar != null) {
            this.f82365b = guVar;
            return;
        }
        throw new NullPointerException("Null flavorCustomActions");
    }
}
