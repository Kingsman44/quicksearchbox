package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.t */
/* compiled from: PG */
final class C95576t extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95577u f267460a;

    public C95576t(C95577u uVar) {
        this.f267460a = uVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!"com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.ACTION_POST_ANNOUNCEMENT".equals(intent.getAction())) {
            C59104x d = C95577u.f267461a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CalendarManager");
            ((C59052c) ((C59052c) d).mo56372aa(16144)).mo56389s("Got intent that wasn't for an announcement? Action: %s", intent.getAction());
            return;
        }
        long longExtra = intent.getLongExtra("com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.EXTRA_START_TIME", 0);
        if (longExtra <= 0) {
            C59104x d2 = C95577u.f267461a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "CalendarManager");
            ((C59052c) ((C59052c) d2).mo56372aa(16143)).mo56386p("Got intent that does not have start time.");
            return;
        }
        C95577u uVar = this.f267460a;
        C58976aa aaVar = C58975e.f156826a;
        uVar.mo89513c(new C95572p(uVar, longExtra));
    }
}
