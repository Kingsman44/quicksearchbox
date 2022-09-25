package com.google.android.libraries.mdi.download.foreground.sting;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.foreground.C29423c;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58837ba;

/* compiled from: PG */
public final class ForegroundDownloadService extends C29424a {

    /* renamed from: a */
    public C29409fd f79767a;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C29045l.m53930b("%s: ForegroundDownloadService.onStartCommand.", "MDD Foreground Download Service");
        String stringExtra = intent.getStringExtra("key");
        if (C58837ba.m90859h(stringExtra)) {
            C29045l.m53935g("%s: KEY_EXTRA is null or empty!", "MDD Foreground Download Service");
            return 2;
        } else if (intent.getBooleanExtra("stop-service", false)) {
            C29045l.m53930b("%s: Stopping ForegroundDownloadService.", "MDD Foreground Download Service");
            startForeground(stringExtra.hashCode(), C29423c.m54378a(this).mo5013a());
            stopForeground(true);
            stopSelf(i2);
            return 2;
        } else {
            if (intent.hasExtra("cancel-action")) {
                C29045l.m53931c("%s: Cancel notification for: %s", "MDD Foreground Download Service", stringExtra);
                this.f79767a.mo34725n(stringExtra);
            }
            C29045l.m53930b("%s: before calling startForeground.", "MDD Foreground Download Service");
            startForeground(stringExtra.hashCode(), C29423c.m54378a(this).mo5013a());
            return 2;
        }
    }
}
