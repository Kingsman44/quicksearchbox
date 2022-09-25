package com.google.android.apps.gsa.sidekick.shared.p7243l;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7947pw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.l.f */
/* compiled from: PG */
public final class C91760f {
    /* renamed from: a */
    public static PendingIntent m150326a(Context context, Collection collection) {
        Intent className = new Intent("com.google.android.apps.gsa.sidekick.main.reminders.ACTION_NOTIFICATION_CLICK").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.reminders.RemindersBroadcastReceiver");
        C91978bb.m150940f(className, "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_REMINDER_ENTRIES", collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C7718hj hjVar = (C7718hj) it.next();
            C7947pw pwVar = hjVar.f26979t;
            if (pwVar == null) {
                pwVar = C7947pw.f27896j;
            }
            if (!pwVar.f27899b.isEmpty()) {
                C7947pw pwVar2 = hjVar.f26979t;
                if (pwVar2 == null) {
                    pwVar2 = C7947pw.f27896j;
                }
                arrayList.add(pwVar2.f27899b);
            }
        }
        className.setData(Uri.parse("reminder_notification_click_".concat(String.valueOf(TextUtils.join("_", arrayList)))));
        return PendingIntent.getBroadcast(context, 0, className, 201326592);
    }
}
