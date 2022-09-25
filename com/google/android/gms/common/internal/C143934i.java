package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.i */
/* compiled from: PG */
public final class C143934i extends C143904at {

    /* renamed from: a */
    private C143939n f390125a;

    /* renamed from: b */
    private final int f390126b;

    public C143934i(C143939n nVar, int i) {
        this.f390125a = nVar;
        this.f390126b = i;
    }

    /* renamed from: a */
    public final void mo119419a(int i, IBinder iBinder, Bundle bundle) {
        C143919bh.m233971n(this.f390125a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f390125a.mo118927p(i, iBinder, bundle, this.f390126b);
        this.f390125a = null;
    }

    /* renamed from: b */
    public final void mo119420b(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        C143939n nVar = this.f390125a;
        C143919bh.m233971n(nVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C143919bh.m233958a(connectionInfo);
        nVar.f390141H = connectionInfo;
        if (nVar.mo57748ku()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.f390005d;
            C143922bk a = C143922bk.m233972a();
            if (connectionTelemetryConfiguration == null) {
                rootTelemetryConfiguration = null;
            } else {
                rootTelemetryConfiguration = connectionTelemetryConfiguration.f390006a;
            }
            a.mo119430b(rootTelemetryConfiguration);
        }
        mo119419a(i, iBinder, connectionInfo.f390002a);
    }

    /* renamed from: c */
    public final void mo119421c() {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
