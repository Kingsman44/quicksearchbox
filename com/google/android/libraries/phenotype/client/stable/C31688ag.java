package com.google.android.libraries.phenotype.client.stable;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.phenotype.client.stable.ag */
/* compiled from: PG */
public final /* synthetic */ class C31688ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31690ai f85207a;

    public /* synthetic */ C31688ag(C31690ai aiVar) {
        this.f85207a = aiVar;
    }

    public final void run() {
        C31690ai aiVar = this.f85207a;
        if (!aiVar.f85196d.equals(BuildConfig.FLAVOR)) {
            C31760t tVar = aiVar.f85194b;
            C60870cx a = C31700as.m59035a(tVar).mo46039a(new C31699ar(aiVar.f85195c), tVar.mo37368h());
            a.mo4106b(new C31689ah(aiVar, a), aiVar.f85194b.mo37368h());
        }
    }
}
