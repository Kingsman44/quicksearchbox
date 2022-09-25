package com.google.android.gms.learning;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.learning.internal.C144772d;
import com.google.android.gms.learning.internal.C144784p;
import com.google.android.gms.learning.internal.C144787s;
import com.google.android.gms.learning.internal.C144788t;
import com.google.android.gms.learning.internal.p10828b.C144766b;
import com.google.android.gms.learning.internal.p10828b.C144768d;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.learning.g */
/* compiled from: PG */
public abstract class C144757g extends Service {

    /* renamed from: a */
    private final C144784p f391605a = new C144756f(this);

    /* renamed from: b */
    private final Object f391606b = new Object();

    /* renamed from: c */
    private C144787s f391607c;

    /* renamed from: b */
    private final C144787s mo92065b() {
        C144787s sVar;
        synchronized (this.f391606b) {
            sVar = this.f391607c;
        }
        return sVar;
    }

    /* renamed from: a */
    public abstract void mo92057a(String str, byte[] bArr, byte[] bArr2, C144772d dVar);

    public final IBinder onBind(Intent intent) {
        C144787s sVar;
        if (!"com.google.android.gms.learning.EXAMPLE_STORE_V2".equals(intent.getAction())) {
            if (Log.isLoggable("brella.InAppExStProxy", 3)) {
                Log.d("brella.InAppExStProxy", "Received connection using V1 protocol");
            }
            return new C144788t("Received connection with unexpected action ".concat(String.valueOf(intent.getAction())));
        }
        if (Log.isLoggable("brella.InAppExStProxy", 3)) {
            Log.d("brella.InAppExStProxy", "Received connection using V2 protocol");
        }
        synchronized (this.f391606b) {
            sVar = this.f391607c;
            if (sVar == null) {
                try {
                    sVar = (C144787s) C144768d.m235289a(this, "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl", C144737e.f391534a);
                    try {
                        sVar.init(new C144166k(this), this.f391605a);
                        this.f391607c = sVar;
                    } catch (RemoteException e) {
                        if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                            Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.init", e);
                        }
                        return new C144788t("No IInAppExampleStoreProxy implementation found");
                    }
                } catch (C144766b e2) {
                    if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                        Log.w("brella.InAppExStProxy", "LoadingException during onBind", e2);
                    }
                    return new C144788t("No IInAppExampleStoreProxy implementation found");
                }
            }
        }
        try {
            return sVar.onBind(intent);
        } catch (RemoteException e3) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onBind", e3);
            }
            return new C144788t("No IInAppExampleStoreProxy implementation found");
        }
    }

    public final void onDestroy() {
        C144787s b = mo92065b();
        if (b != null) {
            try {
                b.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onCreate", e);
                }
            }
        }
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        C144787s b = mo92065b();
        if (b != null) {
            try {
                b.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    public final void onTrimMemory(int i) {
        C144787s b = mo92065b();
        if (b != null) {
            try {
                b.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onTrimMemory", e);
                }
            }
        }
        super.onTrimMemory(i);
    }

    public final boolean onUnbind(Intent intent) {
        C144787s b = mo92065b();
        if (b != null) {
            try {
                return b.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
