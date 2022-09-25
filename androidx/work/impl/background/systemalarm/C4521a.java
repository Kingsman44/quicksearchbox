package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* compiled from: PG */
final class C4521a {
    /* renamed from: a */
    static void m12869a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }
}
