package com.google.apps.tiktok.tracing;

/* renamed from: com.google.apps.tiktok.tracing.az */
/* compiled from: PG */
public final /* synthetic */ class C47540az implements C47573bx {

    /* renamed from: a */
    public final /* synthetic */ C47573bx f123386a;

    /* renamed from: b */
    public final /* synthetic */ C47573bx f123387b;

    /* renamed from: c */
    public final /* synthetic */ C47572bw f123388c;

    public /* synthetic */ C47540az(C47573bx bxVar, C47573bx bxVar2, C47572bw bwVar) {
        this.f123386a = bxVar;
        this.f123387b = bxVar2;
        this.f123388c = bwVar;
    }

    public final void close() {
        C47573bx bxVar = this.f123386a;
        C47573bx bxVar2 = this.f123387b;
        C47572bw bwVar = this.f123388c;
        bxVar.close();
        if (bxVar2 != null) {
            bxVar2.close();
        }
        C47831fm.m85013h(bwVar);
    }
}
