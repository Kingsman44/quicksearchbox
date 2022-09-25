package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.location.SmartspaceOOBELocationActivity;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.e */
/* compiled from: PG */
final class C110848e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ SmartspaceOOBEActivity f308836a;

    public C110848e(SmartspaceOOBEActivity smartspaceOOBEActivity) {
        this.f308836a = smartspaceOOBEActivity;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = SmartspaceOOBEActivity.f308818j.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ssIntroAct");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(26683)).mo56386p("onFailure(): failed to fetch prefs");
        this.f308836a.finish();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f308836a.finish();
            return;
        }
        SmartspaceOOBEActivity smartspaceOOBEActivity = this.f308836a;
        smartspaceOOBEActivity.startActivity(new Intent(smartspaceOOBEActivity, SmartspaceOOBELocationActivity.class));
        this.f308836a.finish();
    }
}
