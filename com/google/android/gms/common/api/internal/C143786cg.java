package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143922bk;
import com.google.android.gms.common.internal.C143939n;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.C144002b;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146036p;

/* renamed from: com.google.android.gms.common.api.internal.cg */
/* compiled from: PG */
final class C143786cg implements C146036p {

    /* renamed from: a */
    private final C143767bo f389809a;

    /* renamed from: b */
    private final int f389810b;

    /* renamed from: c */
    private final C143820i f389811c;

    /* renamed from: d */
    private final long f389812d;

    /* renamed from: e */
    private final long f389813e;

    public C143786cg(C143767bo boVar, int i, C143820i iVar, long j, long j2) {
        this.f389809a = boVar;
        this.f389810b = i;
        this.f389811c = iVar;
        this.f389812d = j;
        this.f389813e = j2;
    }

    /* renamed from: b */
    public static ConnectionTelemetryConfiguration m233682b(C143763bk bkVar, C143939n nVar, int i) {
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration;
        int[] iArr;
        int[] iArr2;
        ConnectionInfo connectionInfo = nVar.f390141H;
        if (connectionInfo == null) {
            connectionTelemetryConfiguration = null;
        } else {
            connectionTelemetryConfiguration = connectionInfo.f390005d;
        }
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.f390007b || ((iArr = connectionTelemetryConfiguration.f390009d) != null ? !C144002b.m234180a(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f390011f) == null || !C144002b.m234180a(iArr2, i))) || bkVar.f389755i >= connectionTelemetryConfiguration.f390010e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        C143763bk b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        if (this.f389809a.mo119214i()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = C143922bk.m233972a().f390115a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.f390047b) && (b = this.f389809a.mo119207b(this.f389811c)) != null) {
                C143839k kVar = b.f389748b;
                if (kVar instanceof C143939n) {
                    C143939n nVar = (C143939n) kVar;
                    boolean z = true;
                    int i6 = 0;
                    boolean z2 = this.f389812d > 0;
                    int i7 = nVar.f390137D;
                    if (rootTelemetryConfiguration != null) {
                        boolean z3 = z2 & rootTelemetryConfiguration.f390048c;
                        int i8 = rootTelemetryConfiguration.f390049d;
                        int i9 = rootTelemetryConfiguration.f390050e;
                        i3 = rootTelemetryConfiguration.f390046a;
                        if (nVar.mo119461S() && !nVar.mo119468x()) {
                            ConnectionTelemetryConfiguration b2 = m233682b(b, nVar, this.f389810b);
                            if (b2 != null) {
                                if (!b2.f390008c || this.f389812d <= 0) {
                                    z = false;
                                }
                                i9 = b2.f390010e;
                                z3 = z;
                            } else {
                                return;
                            }
                        }
                        i2 = i8;
                        i = i9;
                    } else {
                        i3 = 0;
                        i2 = 5000;
                        i = 100;
                    }
                    C143767bo boVar = this.f389809a;
                    if (abVar.mo122491j()) {
                        i4 = 0;
                    } else {
                        if (((C146014aj) abVar).f394703b) {
                            i6 = 100;
                        } else {
                            Exception f = abVar.mo122487f();
                            if (f instanceof C143842n) {
                                Status status = ((C143842n) f).f389919a;
                                int i10 = status.f389621g;
                                ConnectionResult connectionResult = status.f389624j;
                                i4 = connectionResult == null ? -1 : connectionResult.f389574c;
                                i6 = i10;
                            } else {
                                i6 = 101;
                            }
                        }
                        i4 = -1;
                    }
                    if (z2) {
                        long j3 = this.f389812d;
                        long currentTimeMillis = System.currentTimeMillis();
                        i5 = (int) (SystemClock.elapsedRealtime() - this.f389813e);
                        j2 = j3;
                        j = currentTimeMillis;
                    } else {
                        j2 = 0;
                        j = 0;
                        i5 = -1;
                    }
                    MethodInvocation methodInvocation = new MethodInvocation(this.f389810b, i6, i4, j2, j, (String) null, (String) null, i7, i5);
                    Handler handler = boVar.f389784n;
                    handler.sendMessage(handler.obtainMessage(18, new C143787ch(methodInvocation, i3, (long) i2, i)));
                }
            }
        }
    }
}
