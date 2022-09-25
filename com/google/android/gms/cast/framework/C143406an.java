package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.internal.C143439c;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144165j;

/* renamed from: com.google.android.gms.cast.framework.an */
/* compiled from: PG */
public final class C143406an extends Service {

    /* renamed from: a */
    private static final C143566ae f388900a = new C143566ae("ReconnectionService");

    /* renamed from: b */
    private C143555z f388901b;

    public final IBinder onBind(Intent intent) {
        C143555z zVar = this.f388901b;
        if (zVar != null) {
            try {
                return zVar.mo118866f(intent);
            } catch (RemoteException e) {
                f388900a.mo118885c(e, "Unable to call %s on %s.", "onBind", C143555z.class.getSimpleName());
            }
        }
        return null;
    }

    public final void onCreate() {
        C144165j jVar;
        C143429e f = C143429e.m232798f(this);
        C144165j jVar2 = null;
        try {
            jVar = f.mo118637d().f388907b.mo118578f();
        } catch (RemoteException e) {
            C143410ar.f388906a.mo118885c(e, "Unable to call %s on %s.", "getWrappedThis", C143396ad.class.getSimpleName());
            jVar = null;
        }
        C143919bh.m233964g("Must be called from the main thread.");
        try {
            jVar2 = f.f388954g.f389244b.mo118864e();
        } catch (RemoteException e2) {
            C143543n.f389243a.mo118885c(e2, "Unable to call %s on %s.", "getWrappedThis", C143553x.class.getSimpleName());
        }
        C143555z b = C143439c.m232818b(this, jVar, jVar2);
        this.f388901b = b;
        if (b != null) {
            try {
                b.mo118867g();
            } catch (RemoteException e3) {
                f388900a.mo118885c(e3, "Unable to call %s on %s.", "onCreate", C143555z.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    public final void onDestroy() {
        C143555z zVar = this.f388901b;
        if (zVar != null) {
            try {
                zVar.mo118868h();
            } catch (RemoteException e) {
                f388900a.mo118885c(e, "Unable to call %s on %s.", "onDestroy", C143555z.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C143555z zVar = this.f388901b;
        if (zVar != null) {
            try {
                return zVar.mo118865e(intent, i, i2);
            } catch (RemoteException e) {
                f388900a.mo118885c(e, "Unable to call %s on %s.", "onStartCommand", C143555z.class.getSimpleName());
            }
        }
        return 2;
    }
}
