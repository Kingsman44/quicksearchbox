package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7499a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.staticplugins.bisto.p7492j.C95471a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.a.b */
/* compiled from: PG */
final class C95506b extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C95507c f267246a;

    public C95506b(C95507c cVar) {
        this.f267246a = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C59104x b = C95507c.f267247a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NotificationARHandler");
        ((C59052c) ((C59052c) b).mo56372aa(16028)).mo56386p("Broadcast Receiver: #onReceive");
        String action = intent.getAction();
        if (!"com.google.android.apps.gsa.staticplugins.bisto.notifications.accessrequest.ACTION_NOTIFICATION_ACCESS_REQUEST".equals(action)) {
            C59104x d = C95507c.f267247a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotificationARHandler");
            ((C59052c) ((C59052c) d).mo56372aa(16033)).mo56389s("Got intent that wasn't Notif access request interaction. Action: %s", action);
            return;
        }
        this.f267246a.f267253g.cancel(53);
        int intExtra = intent.getIntExtra("proxied_message_id", 0);
        if (intExtra == 0) {
            this.f267246a.mo89398b(4);
            this.f267246a.f267250d.mo89379a().mo46039a(C95471a.f267158a, C60826bg.f164896a);
        } else if (intExtra == 1) {
            this.f267246a.mo89398b(3);
            Intent c = C83395k.m132732c(context);
            if (c != null) {
                context.startActivity(c);
            }
        } else if (intExtra != 2) {
            C59104x d2 = C95507c.f267247a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NotificationARHandler");
            ((C59052c) ((C59052c) d2).mo56372aa(16029)).mo56386p("No case handled, falling out of broadcast receiver.");
        } else {
            this.f267246a.mo89398b(7);
        }
        C95506b bVar = this.f267246a.f267254h;
        if (bVar != null) {
            context.unregisterReceiver(bVar);
            this.f267246a.f267254h = null;
        }
    }
}
