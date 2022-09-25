package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14746p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.r */
/* compiled from: PG */
final class C14717r extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C14718s f44472a;

    public C14717r(C14718s sVar) {
        this.f44472a = sVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_EXIT_CAR_MODE".equals(intent.getAction())) {
            C58976aa aaVar = C58975e.f156826a;
            intent.getAction();
            ((C14986h) this.f44472a.f44479g.mo17428b()).mo21875g(C14746p.m31073f());
        }
    }
}
