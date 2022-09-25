package com.google.android.apps.gsa.sidekick.main.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.search.location.C38716v;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.aw */
/* compiled from: PG */
public final /* synthetic */ class C91508aw implements C38716v {

    /* renamed from: a */
    public static final /* synthetic */ C91508aw f255240a = new C91508aw();

    private /* synthetic */ C91508aw() {
    }

    /* renamed from: a */
    public final PendingIntent mo23455a(Context context) {
        Intent intent = new Intent("com.google.android.apps.sidekick.notifications.NOTIFICATION_GEOFENCE_ACTION");
        intent.setClassName(context, "com.google.android.apps.gsa.sidekick.main.notifications.NotificationRefreshReceiver");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, C147798a.m240896b(intent, 201326592, 0), 201326592);
        broadcast.getClass();
        return broadcast;
    }
}
