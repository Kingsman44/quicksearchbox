package com.google.android.apps.search.googleapp.search.voicesearch;

import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.af */
/* compiled from: PG */
public final /* synthetic */ class C138701af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C138705aj f377232a;

    public /* synthetic */ C138701af(C138705aj ajVar) {
        this.f377232a = ajVar;
    }

    public final void run() {
        C138705aj ajVar = this.f377232a;
        C47558bi a = C47831fm.m85006a("VoiceSearchMainFragmentPeer#onFirstDrawDone");
        try {
            ajVar.f377240e.mo115163a();
            a.close();
            return;
        } catch (Throwable th) {
            C138917y.m225752a(th, th);
        }
        throw th;
    }
}
