package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.p4527a.C58970a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.x */
/* compiled from: PG */
public final class C11517x extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C11485ag f37396a;

    public C11517x(C11485ag agVar) {
        this.f37396a = agVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (C69664n.m101066l("com.google.android.apps.gsa.staticplugins.gearhead.TRIGGER_ZWIEBACK_DEBUG_INTENT", intent != null ? intent.getAction() : null)) {
            ((C58970a) C11485ag.f37293a.mo56224b()).mo56386p("Received zwieback debug triggering intent.");
            this.f37396a.f37324r.mo23074a();
        }
    }
}
