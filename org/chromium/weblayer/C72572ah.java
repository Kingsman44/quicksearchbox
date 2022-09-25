package org.chromium.weblayer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: org.chromium.weblayer.ah */
/* compiled from: PG */
abstract class C72572ah extends Service {

    /* renamed from: a */
    boolean f193102a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C72611bt mo64434a() {
        try {
            return C72611bt.m107418f(getApplication());
        } catch (C72605bn e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public abstract void mo64424b();

    /* renamed from: c */
    public abstract void mo64425c(C72611bt btVar, Intent intent);

    /* renamed from: d */
    public void mo64426d() {
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        if (!C72611bt.m107421i()) {
            stopSelf();
        } else {
            mo64426d();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f193102a) {
            try {
                mo64424b();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C72611bt a = mo64434a();
        if (a == null) {
            stopSelf();
            return 2;
        }
        try {
            mo64425c(a, intent);
            this.f193102a = true;
            return 2;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
