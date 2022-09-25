package com.google.android.apps.gsa.staticplugins.avocado;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.fj */
/* compiled from: PG */
public final /* synthetic */ class C94312fj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94315fm f263537a;

    public /* synthetic */ C94312fj(C94315fm fmVar) {
        this.f263537a = fmVar;
    }

    public final void onClick(View view) {
        C94315fm fmVar = this.f263537a;
        dn dnVar = fmVar.f263544f;
        bh bhVar = fmVar.f263541c;
        dnVar.I(bhVar.a == 2 ? (String) bhVar.b : BuildConfig.FLAVOR, 3, false, fmVar.mo88452e());
        fmVar.f263542d = 1;
        fmVar.mo77318iT().mo77312a();
    }
}
