package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.account.data.manager.ce */
/* compiled from: PG */
public final /* synthetic */ class C46286ce implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C46293cl f121266a;

    /* renamed from: b */
    public final /* synthetic */ C46291cj f121267b;

    public /* synthetic */ C46286ce(C46293cl clVar, C46291cj cjVar) {
        this.f121266a = clVar;
        this.f121267b = cjVar;
    }

    public final void run() {
        C46293cl clVar = this.f121266a;
        C46291cj cjVar = this.f121267b;
        C47558bi a = C47831fm.m85006a("unbind");
        try {
            clVar.f121272a.unbindService(cjVar.f123872b);
            a.close();
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
