package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143929d;
import com.google.android.gms.common.internal.C143930e;

/* renamed from: com.google.android.gms.measurement.internal.is */
/* compiled from: PG */
public final class C145455is implements ServiceConnection, C143929d, C143930e {

    /* renamed from: a */
    public volatile boolean f393268a;

    /* renamed from: b */
    public volatile C145321dt f393269b;

    /* renamed from: c */
    final /* synthetic */ C145456it f393270c;

    protected C145455is(C145456it itVar) {
        this.f393270c = itVar;
    }

    /* renamed from: a */
    public final void mo119389a(Bundle bundle) {
        C143919bh.m233964g("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C143919bh.m233958a(this.f393269b);
                this.f393270c.f393011w.mo120966as().mo120960h(new C145452ip(this, (C145316do) this.f393269b.mo119451G()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f393269b = null;
                this.f393268a = false;
            }
        }
    }

    /* renamed from: b */
    public final void mo119390b(int i) {
        C143919bh.m233964g("MeasurementServiceConnection.onConnectionSuspended");
        this.f393270c.f393011w.mo120965ar().f392802j.mo120894a("Service connection suspended");
        this.f393270c.f393011w.mo120966as().mo120960h(new C145453iq(this));
    }

    /* renamed from: c */
    public final void mo119391c(ConnectionResult connectionResult) {
        C143919bh.m233964g("MeasurementServiceConnection.onConnectionFailed");
        C145325dx dxVar = this.f393270c.f393011w.f392939i;
        if (dxVar == null || !dxVar.mo121005n()) {
            dxVar = null;
        }
        if (dxVar != null) {
            dxVar.f392798f.mo120895b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f393268a = false;
            this.f393269b = null;
        }
        this.f393270c.f393011w.mo120966as().mo120960h(new C145454ir(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f393270c.f393011w.mo120965ar().f392795c.mo120894a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C143919bh.m233964g(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001c
            r3.f393268a = r4     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.it r4 = r3.f393270c     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392795c     // Catch:{ all -> 0x005d }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo120894a(r5)     // Catch:{ all -> 0x005d }
            monitor-exit(r3)     // Catch:{ all -> 0x005d }
            return
        L_0x001c:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x004d
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x005f }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C145316do     // Catch:{ RemoteException -> 0x005f }
            if (r2 == 0) goto L_0x0037
            com.google.android.gms.measurement.internal.do r1 = (com.google.android.gms.measurement.internal.C145316do) r1     // Catch:{ RemoteException -> 0x005f }
        L_0x0035:
            r0 = r1
            goto L_0x003d
        L_0x0037:
            com.google.android.gms.measurement.internal.dm r1 = new com.google.android.gms.measurement.internal.dm     // Catch:{ RemoteException -> 0x005f }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x0035
        L_0x003d:
            com.google.android.gms.measurement.internal.it r5 = r3.f393270c     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392803k     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo120894a(r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x004d:
            com.google.android.gms.measurement.internal.it r5 = r3.f393270c     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ RemoteException -> 0x005f }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392795c     // Catch:{ RemoteException -> 0x005f }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo120895b(r2, r1)     // Catch:{ RemoteException -> 0x005f }
            goto L_0x006e
        L_0x005d:
            r4 = move-exception
            goto L_0x0094
        L_0x005f:
            com.google.android.gms.measurement.internal.it r5 = r3.f393270c     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.ff r5 = r5.f393011w     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.dx r5 = r5.mo120965ar()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.dv r5 = r5.f392795c     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo120894a(r1)     // Catch:{ all -> 0x005d }
        L_0x006e:
            if (r0 != 0) goto L_0x0082
            r3.f393268a = r4     // Catch:{ all -> 0x005d }
            com.google.android.gms.common.d.a r4 = com.google.android.gms.common.p10781d.C143860a.m233845a()     // Catch:{ IllegalArgumentException -> 0x0092 }
            com.google.android.gms.measurement.internal.it r5 = r3.f393270c     // Catch:{ IllegalArgumentException -> 0x0092 }
            com.google.android.gms.measurement.internal.ff r0 = r5.f393011w     // Catch:{ IllegalArgumentException -> 0x0092 }
            android.content.Context r0 = r0.f392931a     // Catch:{ IllegalArgumentException -> 0x0092 }
            com.google.android.gms.measurement.internal.is r5 = r5.f393271b     // Catch:{ IllegalArgumentException -> 0x0092 }
            r4.mo119311b(r0, r5)     // Catch:{ IllegalArgumentException -> 0x0092 }
            goto L_0x0092
        L_0x0082:
            com.google.android.gms.measurement.internal.it r4 = r3.f393270c     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.ff r4 = r4.f393011w     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.fc r4 = r4.mo120966as()     // Catch:{ all -> 0x005d }
            com.google.android.gms.measurement.internal.in r5 = new com.google.android.gms.measurement.internal.in     // Catch:{ all -> 0x005d }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x005d }
            r4.mo120960h(r5)     // Catch:{ all -> 0x005d }
        L_0x0092:
            monitor-exit(r3)     // Catch:{ all -> 0x005d }
            return
        L_0x0094:
            monitor-exit(r3)     // Catch:{ all -> 0x005d }
            goto L_0x0097
        L_0x0096:
            throw r4
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145455is.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C143919bh.m233964g("MeasurementServiceConnection.onServiceDisconnected");
        this.f393270c.f393011w.mo120965ar().f392802j.mo120894a("Service disconnected");
        this.f393270c.f393011w.mo120966as().mo120960h(new C145451io(this, componentName));
    }
}
