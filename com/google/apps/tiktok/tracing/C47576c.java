package com.google.apps.tiktok.tracing;

/* renamed from: com.google.apps.tiktok.tracing.c */
/* compiled from: PG */
public final /* synthetic */ class C47576c implements C47573bx {

    /* renamed from: a */
    public final /* synthetic */ C47573bx f123464a;

    /* renamed from: b */
    public final /* synthetic */ C47573bx f123465b;

    public /* synthetic */ C47576c(C47573bx bxVar, C47573bx bxVar2) {
        this.f123464a = bxVar;
        this.f123465b = bxVar2;
    }

    public final void close() {
        C47573bx bxVar = this.f123464a;
        try {
            this.f123465b.close();
            if (bxVar != null) {
                bxVar.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
