package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.l */
/* compiled from: PG */
public final /* synthetic */ class C120671l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C120672m f335636a;

    public /* synthetic */ C120671l(C120672m mVar) {
        this.f335636a = mVar;
    }

    public final void run() {
        C120672m mVar = this.f335636a;
        mVar.f335639c = true;
        C47558bi a = C47831fm.m85006a("InteractionController onConfigurationShutDown");
        try {
            ((Optional) mVar.f335638b.f332586a.get()).map(C120664e.f335627a).ifPresent(C120665f.f335628a);
            a.close();
            return;
        } catch (Throwable th) {
            C120662c.m199813a(th, th);
        }
        throw th;
    }
}
