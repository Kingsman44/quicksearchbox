package com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14392hn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14393ho;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.c */
/* compiled from: PG */
final class C109507c extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ DrivingScreenActivity f305010a;

    public C109507c(DrivingScreenActivity drivingScreenActivity) {
        this.f305010a = drivingScreenActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        if (action.equals("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_CREATE_DRIVING_SCREEN_SHORTCUT")) {
            C59104x b = DrivingScreenActivity.f304991j.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.DS.Activity");
            ((C59052c) ((C59052c) b).mo56372aa(24795)).mo56386p("shortcut pinned to home screen");
            C14986h hVar = this.f305010a.f304995n;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14392hn hnVar = (C14392hn) C14393ho.f43534d.createBuilder();
            hnVar.copyOnWrite();
            ((C14393ho) hnVar.instance).f43537b = 9;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14393ho hoVar = (C14393ho) hnVar.build();
            hoVar.getClass();
            lfVar.f43801d = hoVar;
            lfVar.f43800c = 7;
            hVar.mo21875g((C14492lf) gtVar.build());
            return;
        }
        String action2 = intent.getAction();
        action2.getClass();
        if (action2.equals("com.google.android.apps.gsa.INTENT_ACTION_CLOSE_DRIVING_SCREEN")) {
            C59104x b2 = DrivingScreenActivity.f304991j.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.DS.Activity");
            ((C59052c) ((C59052c) b2).mo56372aa(24794)).mo56386p("#closing Driving Screen from intent");
            this.f305010a.finishAndRemoveTask();
        }
    }
}
