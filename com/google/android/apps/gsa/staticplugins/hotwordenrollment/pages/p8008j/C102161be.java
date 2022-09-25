package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.be */
/* compiled from: PG */
public final /* synthetic */ class C102161be implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102163bg f284993a;

    /* renamed from: b */
    public final /* synthetic */ int f284994b;

    public /* synthetic */ C102161be(C102163bg bgVar, int i) {
        this.f284993a = bgVar;
        this.f284994b = i;
    }

    public final void run() {
        C102163bg bgVar = this.f284993a;
        int i = this.f284994b;
        C9439b bVar = C9439b.UNKNOWN_ENTRY;
        int i2 = i - 1;
        if (i2 == 1) {
            bgVar.f284997a.mo92920e().setVisibility(4);
            bgVar.f284997a.f285007g.findViewById(R.id.web_view).setBackgroundColor(-1);
            ((C89859i) bgVar.f284997a.f285004d.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_VAA_CONSENT_WEB_VIEW_LOADING_COMPLETE);
        } else if (i2 == 2) {
            bgVar.f284997a.mo92921f(6);
        } else if (i2 != 3) {
            ((C59052c) ((C59052c) C102166bj.f285000a.mo56225c()).mo56372aa(20601)).mo56386p("Should never happen - unknown loading result");
        } else {
            bgVar.f284997a.mo92921f(2);
        }
    }
}
