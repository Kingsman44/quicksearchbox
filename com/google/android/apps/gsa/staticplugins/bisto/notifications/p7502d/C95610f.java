package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.app.Notification;
import android.app.NotificationChannel;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1791ah;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.f */
/* compiled from: PG */
public final /* synthetic */ class C95610f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95615k f267576a;

    /* renamed from: b */
    public final /* synthetic */ StatusBarNotification f267577b;

    /* renamed from: c */
    public final /* synthetic */ NotificationListenerService.RankingMap f267578c;

    public /* synthetic */ C95610f(C95615k kVar, StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.f267576a = kVar;
        this.f267577b = statusBarNotification;
        this.f267578c = rankingMap;
    }

    public final void run() {
        C95615k kVar = this.f267576a;
        StatusBarNotification statusBarNotification = this.f267577b;
        NotificationListenerService.RankingMap rankingMap = this.f267578c;
        if (!kVar.f267596i.get()) {
            C58976aa aaVar = C58975e.f156826a;
            synchronized (kVar.f267588a) {
                boolean z = kVar.f267590c && kVar.f267597j.getStreamVolume(3) > 0 && kVar.f267593f.mo83491f(statusBarNotification.getKey(), rankingMap);
                NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
                long[] jArr = null;
                if (true != rankingMap.getRanking(statusBarNotification.getKey(), ranking)) {
                    ranking = null;
                }
                C95625u uVar = kVar.f267594g;
                boolean add = uVar.f267624d.add(C90366ae.m146966e(statusBarNotification));
                if (z) {
                    if (ranking == null || ranking.getImportance() >= 3) {
                        Notification notification = statusBarNotification.getNotification();
                        if (notification.getGroup() != null) {
                            if (C1791ah.m4935c(notification)) {
                                if (notification.getGroupAlertBehavior() != 2) {
                                }
                            } else if (notification.getGroupAlertBehavior() == 1) {
                            }
                        }
                        int i = statusBarNotification.getNotification().flags & 8;
                        if ((add || i == 0) && uVar.f267623c.getRingerMode() != 0) {
                            if (statusBarNotification.getNotification().vibrate != null) {
                                jArr = statusBarNotification.getNotification().vibrate;
                            } else if (ranking != null) {
                                NotificationChannel channel = ranking.getChannel();
                                if (channel.shouldVibrate()) {
                                    jArr = channel.getVibrationPattern() != null ? channel.getVibrationPattern() : C95625u.f267621a;
                                }
                            }
                            boolean l = C90366ae.m146973l(statusBarNotification.getNotification());
                            if (uVar.f267622b.hasVibrator() && (jArr != null || l)) {
                                synchronized (uVar) {
                                    uVar.f267625e = C90366ae.m146966e(statusBarNotification);
                                    if (jArr != null) {
                                        uVar.f267622b.vibrate(jArr, -1);
                                    } else {
                                        uVar.f267622b.vibrate(C95625u.f267621a, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            kVar.mo89571k(statusBarNotification);
        }
    }
}
