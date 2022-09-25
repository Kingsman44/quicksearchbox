package com.google.android.libraries.logging.p2185ve.p2188c.p2190b;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.android.libraries.logging.ve.c.b.e */
/* compiled from: PG */
public final /* synthetic */ class C28322e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28326i f77006a;

    public /* synthetic */ C28322e(C28326i iVar) {
        this.f77006a = iVar;
    }

    public final void run() {
        C28326i iVar = this.f77006a;
        iVar.f77017h = null;
        C47558bi a = C47831fm.m85006a("GIL:AutoProcessLogBatch");
        try {
            iVar.f77010a.mo33777c(new C28320c(iVar));
            a.close();
            return;
        } catch (Throwable th) {
            C28319b.m52974a(th, th);
        }
        throw th;
    }
}
