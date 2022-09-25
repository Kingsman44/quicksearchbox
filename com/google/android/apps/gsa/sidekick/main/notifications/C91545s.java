package com.google.android.apps.gsa.sidekick.main.notifications;

import android.content.BroadcastReceiver;
import android.os.PowerManager;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.s */
/* compiled from: PG */
public final /* synthetic */ class C91545s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ NotificationRefreshReceiver f255341a;

    /* renamed from: b */
    public final /* synthetic */ C22869e f255342b;

    /* renamed from: c */
    public final /* synthetic */ BroadcastReceiver.PendingResult f255343c;

    public /* synthetic */ C91545s(NotificationRefreshReceiver notificationRefreshReceiver, C22869e eVar, BroadcastReceiver.PendingResult pendingResult) {
        this.f255341a = notificationRefreshReceiver;
        this.f255342b = eVar;
        this.f255343c = pendingResult;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        NotificationRefreshReceiver notificationRefreshReceiver = this.f255341a;
        C22869e eVar = this.f255342b;
        BroadcastReceiver.PendingResult pendingResult = this.f255343c;
        PowerManager.WakeLock newWakeLock = ((PowerManager) notificationRefreshReceiver.f255192g.mo27525b()).newWakeLock(1, "NotificationRefresh_wakelock");
        newWakeLock.setReferenceCounted(false);
        try {
            newWakeLock.acquire(TimeUnit.MINUTES.toMillis(1));
            eVar.run();
            newWakeLock.release();
            pendingResult.finish();
        } catch (Throwable th) {
            newWakeLock.release();
            throw th;
        }
    }
}
