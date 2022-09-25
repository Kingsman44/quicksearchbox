package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.p122k.p123a.C2303a;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.internal.C145325dx;
import com.google.android.gms.measurement.internal.C145343eo;
import com.google.android.gms.measurement.internal.C145361ff;
import com.google.android.gms.measurement.internal.C145508x;

/* compiled from: PG */
public final class AppMeasurementReceiver extends C2303a {

    /* renamed from: c */
    private C145343eo f392202c;

    public final void onReceive(Context context, Intent intent) {
        if (this.f392202c == null) {
            this.f392202c = new C145343eo(this);
        }
        C145343eo eoVar = this.f392202c;
        C145361ff i = C145361ff.m236186i(context, (InitializationParams) null, (Long) null);
        C145325dx ar = i.mo120965ar();
        if (intent == null) {
            ar.f392798f.mo120894a("Receiver called with null intent");
            return;
        }
        C145508x xVar = i.f392936f;
        String action = intent.getAction();
        ar.f392803k.mo120895b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            ar.f392803k.mo120894a("Starting wakeful intent.");
            AppMeasurementReceiver appMeasurementReceiver = eoVar.f392876a;
            synchronized (C2303a.f6450a) {
                int i2 = C2303a.f6451b;
                int i3 = i2 + 1;
                C2303a.f6451b = i3;
                if (i3 <= 0) {
                    C2303a.f6451b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i2);
                className.putExtra("android.support.content.wakelockid", i2);
                ComponentName startService = context.startService(className);
                if (startService != null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000);
                    C2303a.f6450a.put(i2, newWakeLock);
                }
            }
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            ar.f392798f.mo120894a("Install Referrer Broadcasts are deprecated");
        }
    }
}
