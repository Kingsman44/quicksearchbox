package com.google.android.libraries.mdi.download.p2243e.p2245b;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.libraries.mdi.download.foreground.C29423c;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2243e.C29361k;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.libraries.mdi.download.e.b.a */
/* compiled from: PG */
public final class C29351a extends C29352b {

    /* renamed from: a */
    public C29361k f79570a;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C29045l.m53930b("%s: ForegroundDownloadService.onStartCommand.", "MDD Foreground Download Service");
        if (intent.getBooleanExtra("stop-service", false)) {
            C29045l.m53930b("%s: Stopping ForegroundDownloadService.", "MDD Foreground Download Service");
            stopSelf();
            return 2;
        }
        String stringExtra = intent.getStringExtra("key");
        if (C58837ba.m90859h(stringExtra)) {
            C29045l.m53935g("%s: KEY_EXTRA is null or empty!", "MDD Foreground Download Service");
            return 2;
        } else if (intent.hasExtra("cancel-action")) {
            C29045l.m53931c("%s: Cancel notification for: %s", "MDD Foreground Download Service", stringExtra);
            this.f79570a.mo34666b(stringExtra);
            return 2;
        } else {
            C29045l.m53931c("%s: before calling startForeground for Key %s", "MDD Foreground Download Service", stringExtra);
            startForeground(1, C29423c.m54378a(this).mo5013a());
            return 2;
        }
    }
}
