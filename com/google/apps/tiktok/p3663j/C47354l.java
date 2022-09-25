package com.google.apps.tiktok.p3663j;

import com.google.common.base.C58838bb;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.j.l */
/* compiled from: PG */
public final class C47354l {

    /* renamed from: a */
    public C47351i f123076a;

    /* renamed from: b */
    public C47347e f123077b;

    /* renamed from: c */
    public C69464a f123078c;

    /* renamed from: a */
    public final C47355m mo51226a() {
        boolean z = true;
        C58838bb.m90884s(this.f123076a != null, "Every SyncletBinding must have a non-null SyncKey.");
        C58838bb.m90884s(this.f123077b != null, "Every SyncletBinding must have a non-null SyncConfig.");
        if (this.f123078c == null) {
            z = false;
        }
        C58838bb.m90884s(z, "Every SyncletBinding must have a non-null Synclet.");
        return new C47337c(this.f123076a, this.f123077b, this.f123078c);
    }

    @Deprecated
    /* renamed from: b */
    public final void mo51227b(C47352j jVar) {
        this.f123078c = new C47353k(jVar);
    }
}
