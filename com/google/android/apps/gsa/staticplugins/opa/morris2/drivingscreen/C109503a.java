package com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen;

import android.content.IntentFilter;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.a */
/* compiled from: PG */
public final /* synthetic */ class C109503a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DrivingScreenActivity f305002a;

    public /* synthetic */ C109503a(DrivingScreenActivity drivingScreenActivity) {
        this.f305002a = drivingScreenActivity;
    }

    public final void run() {
        DrivingScreenActivity drivingScreenActivity = this.f305002a;
        C58976aa aaVar = C58975e.f156826a;
        drivingScreenActivity.f304998q.mo98021b();
        drivingScreenActivity.f304992k = new C109507c(drivingScreenActivity);
        C59104x b = DrivingScreenActivity.f304991j.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.DS.Activity");
        ((C59052c) ((C59052c) b).mo56372aa(24811)).mo56386p("#registering Driving Screen broadcast receiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.gsa.INTENT_ACTION_CLOSE_DRIVING_SCREEN");
        intentFilter.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_CREATE_DRIVING_SCREEN_SHORTCUT");
        drivingScreenActivity.registerReceiver(drivingScreenActivity.f304992k, intentFilter);
    }
}
