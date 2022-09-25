package com.google.apps.tiktok.inject;

import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.inject.j */
/* compiled from: PG */
public final /* synthetic */ class C47270j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47272l f122913a;

    public /* synthetic */ C47270j(C47272l lVar) {
        this.f122913a = lVar;
    }

    public final void run() {
        C47272l lVar = this.f122913a;
        if (C47831fm.m85027v()) {
            lVar.mo51155c(false);
            return;
        }
        C47538ax c = ((C47770dh) lVar.f122921f.mo17428b()).mo51613c("StartupAfterPackageReplacedUnlock");
        try {
            lVar.mo51155c(false);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47268h.m84078a(th, th);
        }
        throw th;
    }
}
