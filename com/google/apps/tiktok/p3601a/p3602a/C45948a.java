package com.google.apps.tiktok.p3601a.p3602a;

import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.apps.tiktok.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C45948a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f120736a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f120737b;

    public /* synthetic */ C45948a(C47770dh dhVar, Runnable runnable) {
        this.f120736a = dhVar;
        this.f120737b = runnable;
    }

    public final void run() {
        C47770dh dhVar = this.f120736a;
        Runnable runnable = this.f120737b;
        C47538ax c = dhVar.mo51613c("AutoGIL");
        try {
            runnable.run();
            if (c != null) {
                c.close();
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
