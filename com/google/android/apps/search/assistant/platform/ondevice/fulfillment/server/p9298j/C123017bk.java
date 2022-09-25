package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.bk */
/* compiled from: PG */
public final /* synthetic */ class C123017bk implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C123024br f340564a;

    public /* synthetic */ C123017bk(C123024br brVar) {
        this.f340564a = brVar;
    }

    public final void run() {
        C123024br brVar = this.f340564a;
        C47538ax c = brVar.f340575c.mo51613c("PhoenixInstanceProvider.onSchedule");
        try {
            brVar.f340574b.ifPresent(new C123012bf(brVar));
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
