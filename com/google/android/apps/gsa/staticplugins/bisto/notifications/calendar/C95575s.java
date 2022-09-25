package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.s */
/* compiled from: PG */
final class C95575s extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95577u f267459a;

    public C95575s(C95577u uVar) {
        this.f267459a = uVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!"android.intent.action.EVENT_REMINDER".equals(intent.getAction())) {
            C59104x d = C95577u.f267461a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CalendarManager");
            ((C59052c) ((C59052c) d).mo56372aa(16142)).mo56389s("Got intent that wasn't a reminder? Action: %s", intent.getAction());
            return;
        }
        C95577u uVar = this.f267459a;
        C58976aa aaVar = C58975e.f156826a;
        uVar.mo89513c(new C95574r(uVar));
    }
}
