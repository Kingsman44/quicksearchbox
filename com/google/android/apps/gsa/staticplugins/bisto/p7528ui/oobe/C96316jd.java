package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.jd */
/* compiled from: PG */
public final /* synthetic */ class C96316jd implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ OobeActivity f269519a;

    /* renamed from: b */
    public final /* synthetic */ String f269520b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f269521c;

    public /* synthetic */ C96316jd(OobeActivity oobeActivity, String str, Bundle bundle) {
        this.f269519a = oobeActivity;
        this.f269520b = str;
        this.f269521c = bundle;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        OobeActivity oobeActivity = this.f269519a;
        String str = this.f269520b;
        Bundle bundle = this.f269521c;
        Exception exc = (Exception) obj;
        int i = oobeActivity.f268962m;
        if (i == 5 || i == 6) {
            C59104x b = OobeActivity.f268955k.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OobeActivity");
            ((C59052c) ((C59052c) b).mo56372aa(17056)).mo56354G("New GACS Device %s %s", oobeActivity.f268961l, str);
        } else {
            C59104x d = OobeActivity.f268955k.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OobeActivity");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(exc)).mo56372aa(17057)).mo56386p("No Device");
        }
        oobeActivity.mo89926A(str, (C124548d) null, bundle);
    }
}
