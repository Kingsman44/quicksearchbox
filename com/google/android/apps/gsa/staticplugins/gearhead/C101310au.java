package com.google.android.apps.gsa.staticplugins.gearhead;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.au */
/* compiled from: PG */
final class C101310au extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C101325be f282723a;

    public C101310au(C101325be beVar) {
        this.f282723a = beVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "com.google.android.apps.gsa.staticplugins.gearhead.TRIGGER_ZWIEBACK_DEBUG_INTENT".equals(intent.getAction())) {
            ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(19975)).mo56386p("Received zwieback debug triggering intent.");
            this.f282723a.f282781k.mo23074a();
        }
    }
}
