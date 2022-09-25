package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.a */
/* compiled from: PG */
final class C94812a extends C94822aj {

    /* renamed from: a */
    public C58833ax f265117a = C58836b.f156633a;

    /* renamed from: b */
    private C94841p f265118b;

    /* renamed from: a */
    public final C94823ak mo88622a() {
        C94841p pVar = this.f265118b;
        if (pVar != null) {
            return new C94827b(pVar, this.f265117a);
        }
        throw new IllegalStateException("Missing required properties: responseCode");
    }

    /* renamed from: b */
    public final void mo88623b(C94841p pVar) {
        if (pVar != null) {
            this.f265118b = pVar;
            return;
        }
        throw new NullPointerException("Null responseCode");
    }
}
