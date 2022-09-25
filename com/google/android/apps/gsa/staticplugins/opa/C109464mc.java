package com.google.android.apps.gsa.staticplugins.opa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mc */
/* compiled from: PG */
final class C109464mc extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C109465md f304884a;

    public C109464mc(C109465md mdVar) {
        this.f304884a = mdVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f304884a.f54539k.setResult(10);
            this.f304884a.f54539k.mo24855e();
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f304884a.f54539k.setResult(11);
            this.f304884a.f54539k.mo24855e();
        }
    }
}
