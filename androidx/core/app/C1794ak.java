package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import java.util.List;

/* renamed from: androidx.core.app.ak */
/* compiled from: PG */
public final class C1794ak {
    /* renamed from: a */
    public static NotificationChannel m4938a(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    /* renamed from: b */
    static String m4939b(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    /* renamed from: c */
    static String m4940c(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }

    /* renamed from: d */
    public static List m4941d(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroups();
    }

    /* renamed from: e */
    public static List m4942e(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    /* renamed from: f */
    public static void m4943f(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* renamed from: g */
    public static void m4944g(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    /* renamed from: h */
    static void m4945h(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    /* renamed from: i */
    static void m4946i(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannels(list);
    }

    /* renamed from: j */
    static void m4947j(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    /* renamed from: k */
    static void m4948k(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }
}
