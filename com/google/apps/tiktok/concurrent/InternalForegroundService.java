package com.google.apps.tiktok.concurrent;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.apps.tiktok.inject.C47266f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* compiled from: PG */
public final class InternalForegroundService extends Service {

    /* renamed from: a */
    public C46472x f121467a;

    /* renamed from: com.google.apps.tiktok.concurrent.InternalForegroundService$a */
    /* compiled from: PG */
    public interface C46412a {
        /* renamed from: rj */
        void mo50390rj(InternalForegroundService internalForegroundService);
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C46472x xVar = this.f121467a;
        synchronized (xVar.f121608e) {
            for (Map.Entry obj : xVar.f121610g.entrySet()) {
                printWriter.println(obj.toString());
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        ((C46412a) C47266f.m84076a(this, C46412a.class)).mo50390rj(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r3, int r4, int r5) {
        /*
            r2 = this;
            com.google.apps.tiktok.concurrent.x r4 = r2.f121467a
            java.lang.Object r0 = r4.f121608e
            monitor-enter(r0)
            if (r3 != 0) goto L_0x0012
            com.google.apps.tiktok.concurrent.w r3 = r4.f121613j     // Catch:{ all -> 0x0046 }
            com.google.apps.tiktok.concurrent.w r4 = com.google.apps.tiktok.concurrent.C46471w.STOPPED     // Catch:{ all -> 0x0046 }
            if (r3 != r4) goto L_0x0010
            r2.stopSelf(r5)     // Catch:{ all -> 0x0046 }
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x0044
        L_0x0012:
            r4.f121612i = r2     // Catch:{ all -> 0x0046 }
            r4.f121614k = r5     // Catch:{ all -> 0x0046 }
            com.google.apps.tiktok.concurrent.w r5 = com.google.apps.tiktok.concurrent.C46471w.STARTED     // Catch:{ all -> 0x0046 }
            r4.f121613j = r5     // Catch:{ all -> 0x0046 }
            java.util.IdentityHashMap r5 = r4.f121610g     // Catch:{ all -> 0x0046 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0046 }
            r1 = 174344743(0xa644a27, float:1.0991747E-32)
            if (r5 == 0) goto L_0x0034
            java.lang.String r5 = "fallback_notification"
            android.os.Parcelable r3 = r3.getParcelableExtra(r5)     // Catch:{ all -> 0x0046 }
            android.app.Notification r3 = (android.app.Notification) r3     // Catch:{ all -> 0x0046 }
            r2.startForeground(r1, r3)     // Catch:{ all -> 0x0046 }
            r4.mo50475c()     // Catch:{ all -> 0x0046 }
            goto L_0x0043
        L_0x0034:
            com.google.apps.tiktok.concurrent.v r3 = r4.f121615l     // Catch:{ all -> 0x0046 }
            com.google.apps.tiktok.concurrent.v r3 = r4.mo50473a(r3)     // Catch:{ all -> 0x0046 }
            r4.f121615l = r3     // Catch:{ all -> 0x0046 }
            com.google.apps.tiktok.concurrent.v r3 = r4.f121615l     // Catch:{ all -> 0x0046 }
            android.app.Notification r3 = r3.f121597a     // Catch:{ all -> 0x0046 }
            r2.startForeground(r1, r3)     // Catch:{ all -> 0x0046 }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
        L_0x0044:
            r3 = 2
            return r3
        L_0x0046:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.concurrent.InternalForegroundService.onStartCommand(android.content.Intent, int, int):int");
    }
}
