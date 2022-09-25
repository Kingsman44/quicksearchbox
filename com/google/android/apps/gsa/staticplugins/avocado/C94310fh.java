package com.google.android.apps.gsa.staticplugins.avocado;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.fh */
/* compiled from: PG */
public final /* synthetic */ class C94310fh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C94315fm f263535a;

    public /* synthetic */ C94310fh(C94315fm fmVar) {
        this.f263535a = fmVar;
    }

    public final void run() {
        C94315fm fmVar = this.f263535a;
        dn dnVar = fmVar.f263544f;
        bh bhVar = fmVar.f263541c;
        dnVar.I(bhVar.a == 2 ? (String) bhVar.b : BuildConfig.FLAVOR, 3, false, fmVar.mo88452e());
        fmVar.mo77318iT().mo77312a();
    }
}
