package com.google.android.gms.cast.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.C143557h;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143944s;
import com.google.common.p4535g.C59203do;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.cast.internal.s */
/* compiled from: PG */
public final class C143593s extends C143887ac {

    /* renamed from: a */
    public static final C143566ae f389337a = new C143566ae("CastClientImpl");

    /* renamed from: b */
    public static final Object f389338b = new Object();

    /* renamed from: c */
    public static final Object f389339c = new Object();

    /* renamed from: L */
    private final Bundle f389340L;

    /* renamed from: M */
    private C143592r f389341M;

    /* renamed from: N */
    private Bundle f389342N;

    /* renamed from: O */
    private final Map f389343O;

    /* renamed from: d */
    public ApplicationMetadata f389344d;

    /* renamed from: e */
    public final CastDevice f389345e;

    /* renamed from: f */
    public final C143557h f389346f;

    /* renamed from: g */
    public final Map f389347g = new HashMap();

    /* renamed from: h */
    public String f389348h;

    /* renamed from: i */
    public boolean f389349i;

    /* renamed from: j */
    public boolean f389350j;

    /* renamed from: k */
    public boolean f389351k;

    /* renamed from: l */
    public double f389352l;

    /* renamed from: m */
    public EqualizerSettings f389353m;

    /* renamed from: n */
    public int f389354n;

    /* renamed from: o */
    public int f389355o;

    /* renamed from: p */
    public String f389356p;

    /* renamed from: q */
    public String f389357q;

    public C143593s(Context context, Looper looper, C143944s sVar, CastDevice castDevice, C143557h hVar, Bundle bundle, C143849u uVar, C143850v vVar) {
        super(context, looper, 10, sVar, uVar, vVar);
        this.f389345e = castDevice;
        this.f389346f = hVar;
        this.f389340L = bundle;
        new AtomicLong(0);
        this.f389343O = new HashMap();
        mo118924m();
        mo118929r();
    }

    /* renamed from: W */
    private final void m233247W() {
        f389337a.mo118884b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f389347g) {
            this.f389347g.clear();
        }
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof C143600z ? (C143600z) queryLocalInterface : new C143600z(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        Bundle bundle = new Bundle();
        f389337a.mo118884b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f389356p, this.f389357q);
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this.f389345e);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0);
        Bundle bundle2 = this.f389340L;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.f389341M = new C143592r(this);
        C143592r rVar = this.f389341M;
        rVar.asBinder();
        bundle.putParcelable("listener", new BinderWrapper((IBinder) rVar));
        String str = this.f389356p;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f389357q;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    /* renamed from: l */
    public final Bundle mo118923l() {
        Bundle bundle = this.f389342N;
        if (bundle == null) {
            return null;
        }
        this.f389342N = null;
        return bundle;
    }

    /* renamed from: m */
    public final void mo118924m() {
        this.f389354n = -1;
        this.f389355o = -1;
        this.f389344d = null;
        this.f389348h = null;
        this.f389352l = C59203do.f157270a;
        mo118929r();
        this.f389349i = false;
        this.f389353m = null;
    }

    /* renamed from: n */
    public final void mo118925n() {
        C143566ae aeVar = f389337a;
        aeVar.mo118884b("disconnect(); ServiceListener=%s, isConnected=%b", this.f389341M, Boolean.valueOf(mo119467w()));
        C143592r rVar = this.f389341M;
        this.f389341M = null;
        if (rVar == null || rVar.mo118922p() == null) {
            aeVar.mo118884b("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        m233247W();
        try {
            ((C143600z) mo119451G()).mo118934e();
        } catch (RemoteException | IllegalStateException e) {
            f389337a.mo118885c(e, "Error while disconnecting the controller interface", new Object[0]);
        } finally {
            super.mo118925n();
        }
    }

    /* renamed from: o */
    public final void mo118926o(ConnectionResult connectionResult) {
        super.mo118926o(connectionResult);
        m233247W();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118927p(int r6, android.os.IBinder r7, android.os.Bundle r8, int r9) {
        /*
            r5 = this;
            com.google.android.gms.cast.internal.ae r0 = f389337a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "in onPostInitHandler; statusCode=%d"
            r0.mo118884b(r3, r2)
            r0 = 2300(0x8fc, float:3.223E-42)
            if (r6 == 0) goto L_0x0019
            if (r6 != r0) goto L_0x001d
            r6 = 2300(0x8fc, float:3.223E-42)
        L_0x0019:
            r5.f389350j = r1
            r5.f389351k = r1
        L_0x001d:
            if (r6 != r0) goto L_0x002c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r5.f389342N = r6
            java.lang.String r0 = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"
            r6.putBoolean(r0, r1)
            goto L_0x002d
        L_0x002c:
            r4 = r6
        L_0x002d:
            super.mo118927p(r4, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.internal.C143593s.mo118927p(int, android.os.IBinder, android.os.Bundle, int):void");
    }

    /* renamed from: q */
    public final void mo118928q(long j, int i) {
        C143825n nVar;
        synchronized (this.f389343O) {
            nVar = (C143825n) this.f389343O.remove(Long.valueOf(j));
        }
        if (nVar != null) {
            nVar.mo117682i(new Status(1, i, (String) null, (PendingIntent) null, (ConnectionResult) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo118929r() {
        C143919bh.m233971n(this.f389345e, "device should not be null");
        if (!this.f389345e.mo118384d(2048) && this.f389345e.mo118384d(4) && !this.f389345e.mo118384d(1)) {
            "Chromecast Audio".equals(this.f389345e.f388603e);
        }
    }
}
