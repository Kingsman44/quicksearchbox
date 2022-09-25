package com.google.android.apps.gsa.staticplugins.p7650cg.p7652b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.sidekick.main.notifications.C91532f;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7681g;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.cg.b.x */
/* compiled from: PG */
public final class C97623x implements C91532f {

    /* renamed from: a */
    private final C58485gu f272665a;

    /* renamed from: a */
    public final int mo85902a() {
        return R.drawable.ic_reminder_set_pressed;
    }

    /* renamed from: b */
    public final PendingIntent mo85903b(Context context, int i, int i2) {
        C58485gu guVar = this.f272665a;
        Intent putExtra = new Intent("com.google.android.apps.gsa.sidekick.main.reminders.ACTION_EXECUTE_REMINDER_ACTION").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.reminders.RemindersBroadcastReceiver").putExtra("com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_REMINDER_ACTION_TO_EXECUTE", 1).putExtra("com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_DELETE_NOTIFICATION_ON_SUCC", true);
        C91978bb.m150940f(putExtra, "com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_REMINDER_ENTRIES", guVar);
        putExtra.setData(Uri.parse("reminder_action://248_" + i));
        return PendingIntent.getBroadcast(context, i, putExtra, 201326592);
    }

    /* renamed from: c */
    public final Bundle mo85904c() {
        return Bundle.EMPTY;
    }

    /* renamed from: d */
    public final C7681g mo85905d() {
        return C7681g.CLICK_NOTIFICATION_ACTION;
    }

    /* renamed from: e */
    public final String mo85906e(Context context) {
        return context.getString(R.string.reminder_done);
    }

    /* renamed from: f */
    public final boolean mo85907f() {
        return true;
    }

    /* renamed from: g */
    public final boolean mo85908g() {
        return true;
    }

    public C97623x(Collection collection) {
        collection.getClass();
        this.f272665a = C58485gu.m89842j(collection);
    }
}
