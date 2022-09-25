package com.google.android.apps.gsa.staticplugins.opa.samson.p8434i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.i.g */
/* compiled from: PG */
public final class C110185g {

    /* renamed from: a */
    private final AtomicBoolean f307023a = new AtomicBoolean();

    /* renamed from: a */
    public final void mo98459a(Context context) {
        if (!this.f307023a.getAndSet(true)) {
            C58976aa aaVar = C58975e.f156826a;
            Intent intent = new Intent("com.google.android.googlequicksearchbox.REGISTER_CHARGING_AMBIENT_NOTIFICATION_LISTENER");
            intent.setPackage("com.google.android.googlequicksearchbox");
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver"));
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: b */
    public final void mo98460b(Context context) {
        if (this.f307023a.getAndSet(false)) {
            C58976aa aaVar = C58975e.f156826a;
            Intent intent = new Intent("com.google.android.googlequicksearchbox.UNREGISTER_CHARGING_AMBIENT_NOTIFICATION_LISTENER");
            intent.setPackage("com.google.android.googlequicksearchbox");
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver"));
            context.sendBroadcast(intent);
        }
    }
}
