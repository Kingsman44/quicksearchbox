package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.search.n.c.a.h.c */
/* compiled from: PG */
public final class C39584c extends C39535a {

    /* renamed from: a */
    public C58833ax f104204a = C58836b.f156633a;

    /* renamed from: b */
    private C37662hi f104205b;

    /* renamed from: a */
    public final C39562b mo41880a() {
        C37662hi hiVar = this.f104205b;
        if (hiVar != null) {
            return new C39585d(hiVar, this.f104204a);
        }
        throw new IllegalStateException("Missing required properties: hotwordMicInputParams");
    }

    /* renamed from: b */
    public final void mo41881b(C37662hi hiVar) {
        if (hiVar != null) {
            this.f104205b = hiVar;
            return;
        }
        throw new NullPointerException("Null hotwordMicInputParams");
    }
}
