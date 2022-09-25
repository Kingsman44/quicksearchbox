package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123051cr;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.d */
/* compiled from: PG */
public final /* synthetic */ class C122952d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122960l f340477a;

    public /* synthetic */ C122952d(C122960l lVar) {
        this.f340477a = lVar;
    }

    public final void run() {
        C123051cr crVar;
        C122960l lVar = this.f340477a;
        C47538ax c = lVar.f340490a.mo51613c("SelfUpdatedGroup.onSchedule");
        try {
            synchronized (lVar) {
                crVar = null;
                lVar.f340493d = null;
                C123051cr crVar2 = lVar.f340492c;
                if (crVar2 != null) {
                    lVar.f340492c = null;
                    crVar = crVar2;
                }
                lVar.mo105798a();
            }
            if (crVar != null) {
                crVar.f340614a.cancel(false);
            }
            if (c != null) {
                c.close();
            }
        } catch (Throwable th) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }
}
