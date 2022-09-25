package com.google.android.apps.gsa.staticplugins.avocado;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.fg */
/* compiled from: PG */
public final /* synthetic */ class C94309fg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94315fm f263534a;

    public /* synthetic */ C94309fg(C94315fm fmVar) {
        this.f263534a = fmVar;
    }

    public final void run() {
        C94315fm fmVar = this.f263534a;
        dn dnVar = fmVar.f263544f;
        bh bhVar = fmVar.f263541c;
        dnVar.u(bhVar.a == 2 ? (String) bhVar.b : BuildConfig.FLAVOR, true, fmVar.mo88452e());
        fmVar.mo77318iT().mo77312a();
    }
}
