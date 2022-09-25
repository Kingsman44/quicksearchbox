package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96461as;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.jc */
/* compiled from: PG */
public final /* synthetic */ class C96315jc implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ OobeActivity f269516a;

    /* renamed from: b */
    public final /* synthetic */ String f269517b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f269518c;

    public /* synthetic */ C96315jc(OobeActivity oobeActivity, String str, Bundle bundle) {
        this.f269516a = oobeActivity;
        this.f269517b = str;
        this.f269518c = bundle;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        String string;
        C60870cx cxVar;
        OobeActivity oobeActivity = this.f269516a;
        String str = this.f269517b;
        Bundle bundle = this.f269518c;
        C124548d dVar = (C124548d) obj;
        int i = oobeActivity.f268962m;
        if ((oobeActivity.mo89928C() || i == 1) && dVar != null && C96461as.m159827d(dVar) && oobeActivity.f268968s.mo56113h()) {
            C109029a aVar = (C109029a) oobeActivity.f268968s.mo56107c();
            if (aVar.mo97404i(aVar.mo97402g(oobeActivity.f268969t.mo79668a()))) {
                C58976aa aaVar = C58975e.f156826a;
                oobeActivity.mo89931y();
                return;
            }
        }
        if (oobeActivity.f268962m == 5) {
            Bundle bundle2 = bundle.getBundle("deeplink_context");
            if (bundle2 == null || !bundle2.getBoolean("enable_wear_data_layer_api") || bundle2.getBoolean("FORCE_OOBE", false) || (string = bundle2.getString("node_id")) == null) {
                oobeActivity.mo89926A(str, dVar, bundle);
                return;
            }
            if (dVar.mo106521s() == C124636bb.OPA_ENABLED && dVar.mo106520r() == C124633az.OOBE_FINISHED) {
                cxVar = C60922j.m93044g(((C96428nh) oobeActivity.f268974y).mo90113c(string, 0), C96314jb.f269515a, C60826bg.f164896a);
            } else {
                cxVar = C60856cj.m92900i(false);
            }
            new C90873ag(cxVar, oobeActivity.f268965p, "isAlreadyEnabled", new C96321ji(oobeActivity, str, dVar, bundle)).mo85223a(new C96322jj(oobeActivity, str, dVar, bundle));
            return;
        }
        oobeActivity.mo89926A(str, dVar, bundle);
    }
}
