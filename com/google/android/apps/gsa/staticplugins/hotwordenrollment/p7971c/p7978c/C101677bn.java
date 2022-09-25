package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bn */
/* compiled from: PG */
public final /* synthetic */ class C101677bn implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C101687bx f283711a;

    public /* synthetic */ C101677bn(C101687bx bxVar) {
        this.f283711a = bxVar;
    }

    public final void onClick(View view) {
        C101687bx bxVar = this.f283711a;
        if (bxVar.f283733m == 2) {
            dn dnVar = bxVar.f283725e;
            bh bhVar = bxVar.f283722b;
            dnVar.M(bhVar.a == 2 ? (String) bhVar.b : BuildConfig.FLAVOR, 5, false, bxVar.mo92493a());
        }
        bxVar.f283729i.mo83702b(C89849ae.VOICE_MATCH_SLA_CONSENT_DECLINE);
        bxVar.mo92494b();
    }
}
