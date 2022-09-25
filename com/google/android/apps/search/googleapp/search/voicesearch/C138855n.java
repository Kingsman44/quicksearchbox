package com.google.android.apps.search.googleapp.search.voicesearch;

import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.n */
/* compiled from: PG */
public final /* synthetic */ class C138855n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C138859r f377687a;

    public /* synthetic */ C138855n(C138859r rVar) {
        this.f377687a = rVar;
    }

    public final void run() {
        C138859r rVar = this.f377687a;
        C47558bi a = C47831fm.m85006a("VoiceSearchMainFragmentPeer#onFirstDrawDone");
        try {
            rVar.f377702d.mo115163a();
            ((C89922b) rVar.f377708j.mo27525b()).mo83760d();
            rVar.f377712n.mo41634h();
            a.close();
            return;
        } catch (Throwable th) {
            C138795e.m225448a(th, th);
        }
        throw th;
    }
}
