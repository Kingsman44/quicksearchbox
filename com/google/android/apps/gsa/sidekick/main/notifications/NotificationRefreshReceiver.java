package com.google.android.apps.gsa.sidekick.main.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* compiled from: PG */
public class NotificationRefreshReceiver extends C91531e {

    /* renamed from: c */
    static final C58528ij f255187c = C58528ij.m90015O("com.google.android.apps.sidekick.notifications.NOTIFICATION_EXPIRE_NOTIFICATIONS", "com.google.android.apps.sidekick.notifications.NOTIFICATION_DISMISS_ACTION", "com.google.android.apps.sidekick.notifications.NOTIFICATION_GEOFENCE_ACTION", "com.google.android.apps.sidekick.notifications.REFRESH", "com.google.android.apps.sidekick.notifications.REFRESH_ALL_NOTIFICATIONS", "com.google.android.apps.sidekick.notifications.SHOW_NOTIFICATIONS", new String[0]);

    /* renamed from: h */
    private static final C59071e f255188h = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.notifications.NotificationRefreshReceiver");

    /* renamed from: d */
    public C22871g f255189d;

    /* renamed from: e */
    public C68214a f255190e;

    /* renamed from: f */
    public C68214a f255191f;

    /* renamed from: g */
    public C68214a f255192g;

    /* renamed from: c */
    private final void m149629c(C22869e eVar) {
        this.f255189d.mo28212l("executeAsyncTask", new C91545s(this, eVar, goAsync()));
    }

    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(27);
        mo85901b(context);
        if (intent.getAction() == null || !f255187c.contains(intent.getAction())) {
            C59104x c = f255188h.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotifRefreshReceiver");
            ((C59052c) ((C59052c) c).mo56372aa(11625)).mo56389s("onReceive intent with unexpected action: %s", intent.getAction());
        } else if (((C85651bb) this.f255191f.mo27525b()).mo79134G()) {
            if ("com.google.android.apps.sidekick.notifications.NOTIFICATION_EXPIRE_NOTIFICATIONS".equals(intent.getAction())) {
                m149629c(new C91546t(this));
            } else if ("com.google.android.apps.sidekick.notifications.NOTIFICATION_DISMISS_ACTION".equals(intent.getAction())) {
                m149629c(new C91547u(this, intent));
            } else if ("com.google.android.apps.sidekick.notifications.NOTIFICATION_GEOFENCE_ACTION".equals(intent.getAction())) {
                m149629c(new C91548v(this, intent));
            } else if ("com.google.android.apps.sidekick.notifications.REFRESH".equals(intent.getAction())) {
                m149629c(new C91549w(this));
            } else if ("com.google.android.apps.sidekick.notifications.REFRESH_ALL_NOTIFICATIONS".equals(intent.getAction())) {
                m149629c(new C91550x(this));
            } else if ("com.google.android.apps.sidekick.notifications.SHOW_NOTIFICATIONS".equals(intent.getAction())) {
                m149629c(new C91551y(this));
            }
        }
    }
}
