package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.learning.internal.C144788t;
import com.google.android.gms.learning.internal.p10828b.C144766b;
import com.google.android.gms.learning.internal.p10828b.C144768d;
import com.google.android.gms.p10793f.C144166k;

/* compiled from: PG */
public final class InAppTrainingService extends Service {
    private static final String TAG = "brella.InAppTrngSvc";
    C144817u dynamiteImpl;

    public IBinder onBind(Intent intent) {
        C144817u uVar = this.dynamiteImpl;
        if (uVar != null) {
            try {
                return uVar.onBind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onBind", e);
                }
            }
        }
        return new C144788t("No IInAppTrainingService implementation found");
    }

    public void onCreate() {
        super.onCreate();
        try {
            C144817u uVar = (C144817u) C144768d.m235289a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", C144797ah.f391640a);
            try {
                uVar.onCreate(new C144166k(this));
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during onCreate", e);
                }
            }
            try {
                uVar.addHttpUrlConnectionFactory("cronet", new C144798b(getApplicationContext()));
            } catch (RemoteException e2) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException during addHttpUrlConnectionFactory", e2);
                }
            }
            this.dynamiteImpl = uVar;
        } catch (C144766b e3) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during onCreate", e3);
            }
        }
    }

    public void onDestroy() {
        C144817u uVar = this.dynamiteImpl;
        if (uVar != null) {
            try {
                uVar.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        C144817u uVar = this.dynamiteImpl;
        if (uVar != null) {
            try {
                uVar.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C144817u uVar = this.dynamiteImpl;
        if (uVar != null) {
            try {
                return uVar.onStartCommand(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    public void onTrimMemory(int i) {
        C144817u uVar = this.dynamiteImpl;
        if (uVar != null) {
            try {
                uVar.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onTrimMemory", e);
                }
            }
        }
    }

    public boolean onUnbind(Intent intent) {
        C144817u uVar = this.dynamiteImpl;
        if (uVar != null) {
            try {
                return uVar.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppTrainingService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
