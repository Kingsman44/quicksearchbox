package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.android.apps.gsa.staticplugins.p7815dk.C99639m;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.x */
/* compiled from: PG */
public final /* synthetic */ class C109862x implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109864z f306113a;

    /* renamed from: b */
    public final /* synthetic */ C109864z f306114b;

    /* renamed from: c */
    public final /* synthetic */ C99639m f306115c;

    public /* synthetic */ C109862x(C109864z zVar, C109864z zVar2, C99639m mVar) {
        this.f306113a = zVar;
        this.f306114b = zVar2;
        this.f306115c = mVar;
    }

    public final void run() {
        C109864z zVar = this.f306113a;
        C109864z zVar2 = this.f306114b;
        C99639m mVar = this.f306115c;
        if (!zVar.f306122a.isDone() || !zVar2.f306122a.isDone()) {
            C59104x b = C109782ab.f305901a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OmniConsentReqHelper");
            ((C59052c) ((C59052c) b).mo56372aa(25263)).mo56386p("getSettingsUi timed out");
            mVar.mo91529a();
            zVar.f306122a.cancel(true);
            zVar2.f306122a.cancel(true);
        }
    }
}
