package com.google.apps.tiktok.tracing;

import com.google.common.base.C58833ax;

/* renamed from: com.google.apps.tiktok.tracing.l */
/* compiled from: PG */
public final /* synthetic */ class C47852l implements C47573bx {

    /* renamed from: a */
    public final /* synthetic */ C47573bx f123916a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f123917b;

    public /* synthetic */ C47852l(C47573bx bxVar, C58833ax axVar) {
        this.f123916a = bxVar;
        this.f123917b = axVar;
    }

    public final void close() {
        C47573bx bxVar = this.f123916a;
        C58833ax axVar = this.f123917b;
        bxVar.close();
        if (axVar.mo56113h()) {
            ((C47573bx) axVar.mo56107c()).close();
        }
    }
}
