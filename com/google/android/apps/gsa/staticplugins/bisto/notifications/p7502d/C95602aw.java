package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.app.AlarmManager;
import android.app.Notification;
import android.content.Context;
import android.content.IntentFilter;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1791ah;
import androidx.core.app.C1832s;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.aw */
/* compiled from: PG */
public final class C95602aw {

    /* renamed from: a */
    static final C58495hd f267540a;

    /* renamed from: b */
    public static final long f267541b = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: c */
    private final Context f267542c;

    /* renamed from: d */
    private final C95601av f267543d;

    /* renamed from: e */
    private final AlarmManager f267544e;

    /* renamed from: f */
    private final C21370a f267545f;

    /* renamed from: g */
    private AlarmManager.AlarmClockInfo f267546g;

    /* renamed from: h */
    private AlarmManager.AlarmClockInfo f267547h;

    /* renamed from: i */
    private StatusBarNotification f267548i;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(Locale.GERMAN, "SCHLUMMERN");
        gzVar.mo55429h(Locale.GERMANY, "SCHLUMMERN");
        gzVar.mo55429h(Locale.FRENCH, "RÉPÉTER");
        gzVar.mo55429h(Locale.FRANCE, "RÉPÉTER");
        gzVar.mo55429h(Locale.JAPANESE, "スヌーズ");
        gzVar.mo55429h(Locale.JAPAN, "スヌーズ");
        gzVar.mo55429h(Locale.forLanguageTag("pt-BR"), "SONECA");
        f267540a = gzVar.mo55427f(false);
    }

    public C95602aw(Context context, C21370a aVar) {
        this.f267542c = context;
        this.f267545f = aVar;
        C95601av avVar = new C95601av(this);
        this.f267543d = avVar;
        context.registerReceiver(avVar, new IntentFilter("android.app.action.NEXT_ALARM_CLOCK_CHANGED"));
        this.f267544e = (AlarmManager) context.getSystemService("alarm");
        mo89554d();
    }

    /* renamed from: b */
    public static synchronized C1832s m158277b(Notification notification) {
        synchronized (C95602aw.class) {
            if (C1791ah.m4933a(notification) <= 0) {
                return null;
            }
            for (int i = 0; i < C1791ah.m4933a(notification); i++) {
                C1832s b = C1791ah.m4934b(notification.actions[i]);
                CharSequence charSequence = b.f5661h;
                if (charSequence != null) {
                    String obj = charSequence.toString();
                    Locale locale = Locale.getDefault();
                    String str = (String) f267540a.get(locale);
                    if (str == null) {
                        str = "snooze";
                    }
                    if (obj.toLowerCase(locale).contains(str.toLowerCase(locale))) {
                        return b;
                    }
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized androidx.core.app.C1832s mo89552a() {
        /*
            r1 = this;
            monitor-enter(r1)
            android.service.notification.StatusBarNotification r0 = r1.f267548i     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0018
            android.app.Notification r0 = r0.getNotification()     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000c
            goto L_0x0018
        L_0x000c:
            android.service.notification.StatusBarNotification r0 = r1.f267548i     // Catch:{ all -> 0x001b }
            android.app.Notification r0 = r0.getNotification()     // Catch:{ all -> 0x001b }
            androidx.core.app.s r0 = m158277b(r0)     // Catch:{ all -> 0x001b }
            monitor-exit(r1)
            return r0
        L_0x0018:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x001b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95602aw.mo89552a():androidx.core.app.s");
    }

    /* renamed from: c */
    public final synchronized void mo89553c() {
        try {
            this.f267542c.unregisterReceiver(this.f267543d);
        } catch (IllegalArgumentException unused) {
        }
        this.f267548i = null;
    }

    /* renamed from: d */
    public final void mo89554d() {
        this.f267546g = this.f267547h;
        AlarmManager alarmManager = this.f267544e;
        this.f267547h = alarmManager == null ? null : alarmManager.getNextAlarmClock();
    }

    /* renamed from: e */
    public final synchronized boolean mo89555e() {
        return this.f267548i != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ae, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00be, code lost:
        return true;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo89556f(android.service.notification.StatusBarNotification r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.service.notification.StatusBarNotification r0 = r9.f267548i     // Catch:{ all -> 0x00bf }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            r0 = r1
            goto L_0x000c
        L_0x0008:
            java.lang.String r0 = r0.getKey()     // Catch:{ all -> 0x00bf }
        L_0x000c:
            java.lang.String r2 = r10.getKey()     // Catch:{ all -> 0x00bf }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00bf }
            r2 = 1
            if (r0 != 0) goto L_0x00b1
            android.service.notification.StatusBarNotification r0 = r9.f267548i     // Catch:{ all -> 0x00bf }
            r1 = 0
            if (r0 != 0) goto L_0x00af
            android.app.AlarmManager$AlarmClockInfo r0 = r9.f267546g     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0038
            long r3 = r0.getTriggerTime()     // Catch:{ all -> 0x00bf }
            com.google.android.libraries.f.a r0 = r9.f267545f     // Catch:{ all -> 0x00bf }
            long r5 = r0.mo26870b()     // Catch:{ all -> 0x00bf }
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x00bf }
            long r5 = f267541b     // Catch:{ all -> 0x00bf }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
            android.app.AlarmManager$AlarmClockInfo r0 = r9.f267546g     // Catch:{ all -> 0x00bf }
            goto L_0x003a
        L_0x0038:
            android.app.AlarmManager$AlarmClockInfo r0 = r9.f267547h     // Catch:{ all -> 0x00bf }
        L_0x003a:
            if (r0 != 0) goto L_0x003e
            monitor-exit(r9)
            return r1
        L_0x003e:
            java.lang.String r3 = r10.getPackageName()     // Catch:{ all -> 0x00bf }
            if (r3 == 0) goto L_0x00ad
            android.app.PendingIntent r3 = r0.getShowIntent()     // Catch:{ all -> 0x00bf }
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = r10.getPackageName()     // Catch:{ all -> 0x00bf }
            android.app.PendingIntent r4 = r0.getShowIntent()     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = r4.getCreatorPackage()     // Catch:{ all -> 0x00bf }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00bf }
            if (r3 == 0) goto L_0x00ad
            android.app.Notification r3 = r10.getNotification()     // Catch:{ all -> 0x00bf }
            if (r3 != 0) goto L_0x0063
            goto L_0x00ad
        L_0x0063:
            long r3 = r0.getTriggerTime()     // Catch:{ all -> 0x00bf }
            com.google.android.libraries.f.a r0 = r9.f267545f     // Catch:{ all -> 0x00bf }
            long r5 = r0.mo26870b()     // Catch:{ all -> 0x00bf }
            long r5 = r3 - r5
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x00bf }
            long r7 = f267541b     // Catch:{ all -> 0x00bf }
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            monitor-exit(r9)
            return r1
        L_0x007b:
            long r5 = r10.getPostTime()     // Catch:{ all -> 0x00bf }
            long r3 = r3 - r5
            long r3 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x00bf }
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x008a
            monitor-exit(r9)
            return r1
        L_0x008a:
            android.app.Notification r0 = r10.getNotification()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r0.category     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x009d
            java.lang.String r3 = "alarm"
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            monitor-exit(r9)
            return r1
        L_0x009d:
            android.app.Notification r0 = r10.getNotification()     // Catch:{ all -> 0x00bf }
            androidx.core.app.s r0 = m158277b(r0)     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x00a9
            monitor-exit(r9)
            return r1
        L_0x00a9:
            r9.f267548i = r10     // Catch:{ all -> 0x00bf }
            monitor-exit(r9)
            return r2
        L_0x00ad:
            monitor-exit(r9)
            return r1
        L_0x00af:
            monitor-exit(r9)
            return r1
        L_0x00b1:
            android.app.Notification r10 = r10.getNotification()     // Catch:{ all -> 0x00bf }
            androidx.core.app.s r10 = m158277b(r10)     // Catch:{ all -> 0x00bf }
            if (r10 != 0) goto L_0x00bd
            r9.f267548i = r1     // Catch:{ all -> 0x00bf }
        L_0x00bd:
            monitor-exit(r9)
            return r2
        L_0x00bf:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d.C95602aw.mo89556f(android.service.notification.StatusBarNotification):boolean");
    }

    /* renamed from: g */
    public final synchronized boolean mo89557g(StatusBarNotification statusBarNotification) {
        String str;
        StatusBarNotification statusBarNotification2 = this.f267548i;
        if (statusBarNotification2 == null) {
            str = null;
        } else {
            str = statusBarNotification2.getKey();
        }
        if (!statusBarNotification.getKey().equals(str)) {
            return false;
        }
        this.f267548i = null;
        return true;
    }
}
