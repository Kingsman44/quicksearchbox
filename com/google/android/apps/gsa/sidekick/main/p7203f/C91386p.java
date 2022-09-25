package com.google.android.apps.gsa.sidekick.main.p7203f;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.os.RemoteException;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p3723ar.imp.view.C48004n;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.p */
/* compiled from: PG */
public final class C91386p implements C91385o {

    /* renamed from: a */
    private static final C59071e f254958a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.f.p");

    /* renamed from: b */
    private final NotificationManager f254959b;

    public C91386p(NotificationManager notificationManager) {
        this.f254959b = notificationManager;
    }

    /* renamed from: a */
    public final NotificationChannel mo85699a(String str) {
        return this.f254959b.getNotificationChannel(str);
    }

    /* renamed from: b */
    public final List mo85700b() {
        return this.f254959b.getNotificationChannels();
    }

    /* renamed from: c */
    public final void mo85701c(NotificationChannel notificationChannel) {
        try {
            this.f254959b.createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof RemoteException)) {
                C59104x d = f254958a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SystemNotificationMana");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11567)).mo56389s("Calling createNotificationChannel on O with illegal channel name: %s", notificationChannel);
                return;
            }
            C59104x c = f254958a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SystemNotificationMana");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11566)).mo56389s("Calling createNotificationChannel on O with illegal channel name: %s", notificationChannel);
        }
    }

    /* renamed from: e */
    public final void mo85702e(String str) {
        this.f254959b.deleteNotificationChannel(str);
    }

    /* renamed from: f */
    public final boolean mo85703f(String str, int i, Notification notification) {
        if (notification != null) {
            try {
                return C91373c.m149394a(this.f254959b, str, i, notification);
            } catch (SecurityException e) {
                C59104x c = f254958a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SystemNotificationMana");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11568)).mo56386p("Failed to notify");
                return false;
            }
        } else {
            this.f254959b.notify(str, i, (Notification) null);
            return true;
        }
    }

    /* renamed from: g */
    public final void mo85704g() {
        this.f254959b.cancel(C59002s.f156871a, C89885b.S3REQUEST_BUILD_RECOGNIZER_VOCABULARY_CONTEXT_FAILED_VALUE);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85281e((Object) null).mo85279c("notificationsEnabled").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f254959b.areNotificationsEnabled())));
        List<NotificationChannelGroup> notificationChannelGroups = this.f254959b.getNotificationChannelGroups();
        if (notificationChannelGroups != null) {
            for (NotificationChannelGroup next : notificationChannelGroups) {
                C91006f e = fVar.mo85281e((Object) null);
                e.mo85279c("groupId").mo85276a(C90752i.m148229c(next.getId()));
                e.mo85279c("groupIsBlocked").mo85276a(C90752i.m148228b(Boolean.valueOf(next.isBlocked())));
            }
        }
        List<NotificationChannel> notificationChannels = this.f254959b.getNotificationChannels();
        if (notificationChannels != null) {
            for (NotificationChannel next2 : notificationChannels) {
                C91006f e2 = fVar.mo85281e((Object) null);
                e2.mo85279c("channelId").mo85276a(C90752i.m148229c(next2.getId()));
                e2.mo85279c("channelName").mo85276a(C90752i.m148229c(next2.getName()));
                e2.mo85279c("channelImportance").mo85276a(C90752i.m148230d(Integer.valueOf(next2.getImportance())));
                if (next2.getGroup() != null) {
                    e2.mo85279c("channelGroupId").mo85276a(C90752i.m148229c(next2.getGroup()));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo85705h() {
        this.f254959b.cancelAll();
    }

    /* renamed from: i */
    public final void mo85706i(int i) {
        this.f254959b.cancel(C48004n.f124238a, i);
    }
}
