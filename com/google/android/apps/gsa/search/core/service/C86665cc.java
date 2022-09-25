package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.search.core.service.cc */
/* compiled from: PG */
public final class C86665cc extends C89859i {

    /* renamed from: a */
    private final C89859i f234130a;

    /* renamed from: b */
    private String f234131b;

    public C86665cc(C89859i iVar) {
        this.f234130a = iVar;
    }

    /* renamed from: c */
    public final void mo80266c(long j) {
        C58838bb.m90884s(this.f234131b == null, "SessionAppFlowLogger#onStart called more than once.");
        this.f234131b = String.valueOf(j);
    }

    /* renamed from: a */
    public final void mo74236a(C89857g gVar) {
        if (this.f234131b != null) {
            C89856f fVar = new C89856f();
            fVar.mo83700b(gVar);
            fVar.mo83701c("SessionLoggerId", this.f234131b);
            this.f234130a.mo74236a(fVar.mo83699a());
            return;
        }
        throw new IllegalStateException("SessionAppFlowLogger is not started, usually due to the related session hasn't been started yet.");
    }
}
