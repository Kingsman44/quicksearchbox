package com.google.android.gms.cast.framework;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.cast.C143602k;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.cast.framework.l */
/* compiled from: PG */
final class C143465l extends C143602k {

    /* renamed from: a */
    final /* synthetic */ C143466m f389019a;

    public C143465l(C143466m mVar) {
        this.f389019a = mVar;
    }

    /* renamed from: a */
    public final void mo118715a() {
        C143466m mVar = this.f389019a;
        if (mVar.f389022c != null) {
            try {
                C143500bf bfVar = mVar.f389024e;
                if (bfVar != null) {
                    bfVar.mo118785m();
                }
                this.f389019a.f389022c.mo118863j();
            } catch (RemoteException e) {
                C143466m.f389020a.mo118885c(e, "Unable to call %s on %s.", "onConnected", C143551v.class.getSimpleName());
            }
        }
    }

    /* renamed from: b */
    public final void mo118716b(int i) {
        C143551v vVar = this.f389019a.f389022c;
        if (vVar != null) {
            try {
                vVar.mo118860g(new ConnectionResult(1, i, (PendingIntent) null, (String) null));
            } catch (RemoteException e) {
                C143466m.f389020a.mo118885c(e, "Unable to call %s on %s.", "onConnectionFailed", C143551v.class.getSimpleName());
            }
        }
    }

    /* renamed from: c */
    public final void mo118717c(int i) {
        C143551v vVar = this.f389019a.f389022c;
        if (vVar != null) {
            try {
                vVar.mo118861h(i);
            } catch (RemoteException e) {
                C143466m.f389020a.mo118885c(e, "Unable to call %s on %s.", "onConnectionSuspended", C143551v.class.getSimpleName());
            }
        }
    }

    /* renamed from: d */
    public final void mo118718d(int i) {
        C143551v vVar = this.f389019a.f389022c;
        if (vVar != null) {
            try {
                vVar.mo118860g(new ConnectionResult(1, i, (PendingIntent) null, (String) null));
            } catch (RemoteException e) {
                C143466m.f389020a.mo118885c(e, "Unable to call %s on %s.", "onDisconnected", C143551v.class.getSimpleName());
            }
        }
    }
}
