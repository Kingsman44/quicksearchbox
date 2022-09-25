package com.google.apps.tiktok.tracing;

/* renamed from: com.google.apps.tiktok.tracing.ay */
/* compiled from: PG */
public final /* synthetic */ class C47539ay implements C47573bx {

    /* renamed from: a */
    public final /* synthetic */ C47550bb f123382a;

    /* renamed from: b */
    public final /* synthetic */ C47573bx f123383b;

    /* renamed from: c */
    public final /* synthetic */ C47573bx f123384c;

    /* renamed from: d */
    public final /* synthetic */ C47572bw f123385d;

    public /* synthetic */ C47539ay(C47550bb bbVar, C47573bx bxVar, C47573bx bxVar2, C47572bw bwVar) {
        this.f123382a = bbVar;
        this.f123383b = bxVar;
        this.f123384c = bxVar2;
        this.f123385d = bwVar;
    }

    public final void close() {
        C47550bb bbVar = this.f123382a;
        C47573bx bxVar = this.f123383b;
        C47573bx bxVar2 = this.f123384c;
        C47572bw bwVar = this.f123385d;
        bxVar.close();
        C47573bx bxVar3 = bbVar.f123401b;
        if (bxVar3 != null) {
            bxVar3.close();
        }
        if (bxVar2 != null) {
            bxVar2.close();
        }
        C47831fm.m85013h(bwVar);
    }
}
