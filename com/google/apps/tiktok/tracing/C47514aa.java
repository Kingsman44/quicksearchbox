package com.google.apps.tiktok.tracing;

/* renamed from: com.google.apps.tiktok.tracing.aa */
/* compiled from: PG */
public final /* synthetic */ class C47514aa implements C47573bx {

    /* renamed from: a */
    public final /* synthetic */ C47573bx f123351a;

    /* renamed from: b */
    public final /* synthetic */ C47573bx f123352b;

    public /* synthetic */ C47514aa(C47573bx bxVar, C47573bx bxVar2) {
        this.f123351a = bxVar;
        this.f123352b = bxVar2;
    }

    public final void close() {
        C47573bx bxVar = this.f123351a;
        C47573bx bxVar2 = this.f123352b;
        bxVar.close();
        bxVar2.close();
        C47831fm.m85019n();
    }
}
