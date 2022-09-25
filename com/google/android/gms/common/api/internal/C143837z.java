package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.p060c.C0977g;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143718c;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.libs.p10835c.C144855c;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.z */
/* compiled from: PG */
final class C143837z implements C143775bw {

    /* renamed from: a */
    public final C143755bc f389903a;

    /* renamed from: b */
    public final C143755bc f389904b;

    /* renamed from: c */
    public Bundle f389905c;

    /* renamed from: d */
    public ConnectionResult f389906d = null;

    /* renamed from: e */
    public ConnectionResult f389907e = null;

    /* renamed from: f */
    public boolean f389908f = false;

    /* renamed from: g */
    public final Lock f389909g;

    /* renamed from: h */
    private final Context f389910h;

    /* renamed from: i */
    private final C143750ay f389911i;

    /* renamed from: j */
    private final Map f389912j;

    /* renamed from: k */
    private final Set f389913k = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: l */
    private final C143839k f389914l;

    /* renamed from: m */
    private int f389915m = 0;

    public C143837z(Context context, C143750ay ayVar, Lock lock, Looper looper, C143876h hVar, Map map, Map map2, C143944s sVar, C143707a aVar, C143839k kVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f389910h = context;
        this.f389911i = ayVar;
        this.f389909g = lock;
        this.f389914l = kVar;
        Context context2 = context;
        C143750ay ayVar2 = ayVar;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C143876h hVar2 = hVar;
        C143755bc bcVar = r2;
        C143755bc bcVar2 = new C143755bc(context2, ayVar2, lock2, looper2, hVar2, map2, (C143944s) null, map4, (C143707a) null, arrayList2, new C143835x(this));
        this.f389903a = bcVar;
        this.f389904b = new C143755bc(context2, ayVar2, lock2, looper2, hVar2, map, sVar, map3, aVar, arrayList, new C143836y(this));
        C0977g gVar = new C0977g();
        for (C143718c put : map2.keySet()) {
            gVar.put(put, this.f389903a);
        }
        for (C143718c put2 : map.keySet()) {
            gVar.put(put2, this.f389904b);
        }
        this.f389912j = Collections.unmodifiableMap(gVar);
    }

    /* renamed from: l */
    private final PendingIntent m233774l() {
        if (this.f389914l == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f389910h, System.identityHashCode(this.f389911i), this.f389914l.mo119244s(), C144855c.f391705a | 134217728);
    }

    /* renamed from: n */
    private final void m233776n() {
        for (C143799ct a : this.f389913k) {
            a.mo119256a();
        }
        this.f389913k.clear();
    }

    /* renamed from: o */
    private final boolean m233777o() {
        ConnectionResult connectionResult = this.f389907e;
        return connectionResult != null && connectionResult.f389574c == 4;
    }

    /* renamed from: p */
    private final boolean m233778p(C143824m mVar) {
        C143755bc bcVar = (C143755bc) this.f389912j.get(mVar.f389885b);
        C143919bh.m233971n(bcVar, "GoogleApiClient is not configured to use the API required for this call.");
        return bcVar.equals(this.f389904b);
    }

    /* renamed from: q */
    private static boolean m233779q(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo119068b();
    }

    /* renamed from: a */
    public final ConnectionResult mo119174a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final ConnectionResult mo119175b(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final C143824m mo119176c(C143824m mVar) {
        if (!m233778p(mVar)) {
            this.f389903a.mo119176c(mVar);
            return mVar;
        } else if (m233777o()) {
            mVar.mo119276l(new Status(1, 4, (String) null, m233774l(), (ConnectionResult) null));
            return mVar;
        } else {
            this.f389904b.mo119176c(mVar);
            return mVar;
        }
    }

    /* renamed from: d */
    public final C143824m mo119177d(C143824m mVar) {
        if (!m233778p(mVar)) {
            return this.f389903a.mo119177d(mVar);
        }
        if (!m233777o()) {
            return this.f389904b.mo119177d(mVar);
        }
        mVar.mo119276l(new Status(1, 4, (String) null, m233774l(), (ConnectionResult) null));
        return mVar;
    }

    /* renamed from: e */
    public final void mo119178e() {
        this.f389915m = 2;
        this.f389908f = false;
        this.f389907e = null;
        this.f389906d = null;
        this.f389903a.mo119178e();
        this.f389904b.mo119178e();
    }

    /* renamed from: f */
    public final void mo119179f() {
        this.f389907e = null;
        this.f389906d = null;
        this.f389915m = 0;
        this.f389903a.mo119179f();
        this.f389904b.mo119179f();
        m233776n();
    }

    /* renamed from: h */
    public final boolean mo119181h() {
        this.f389909g.lock();
        try {
            boolean z = false;
            if ((this.f389903a.f389734k instanceof C143734ai) && ((this.f389904b.f389734k instanceof C143734ai) || m233777o() || this.f389915m == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f389909g.unlock();
        }
    }

    /* renamed from: i */
    public final boolean mo119182i() {
        this.f389909g.lock();
        try {
            return this.f389915m == 2;
        } finally {
            this.f389909g.unlock();
        }
    }

    /* renamed from: j */
    public final void mo119286j(int i) {
        this.f389911i.mo119167s(i);
        this.f389907e = null;
        this.f389906d = null;
    }

    /* renamed from: k */
    public final void mo119184k(String str, PrintWriter printWriter) {
        printWriter.append(BuildConfig.FLAVOR).append("authClient").println(":");
        this.f389904b.mo119184k(BuildConfig.FLAVOR.concat("  "), printWriter);
        printWriter.append(BuildConfig.FLAVOR).append("anonClient").println(":");
        this.f389903a.mo119184k(BuildConfig.FLAVOR.concat("  "), printWriter);
    }

    /* renamed from: m */
    private final void m233775m(ConnectionResult connectionResult) {
        int i = this.f389915m;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f389915m = 0;
            }
            this.f389911i.mo119165q(connectionResult);
        }
        m233776n();
        this.f389915m = 0;
    }

    /* renamed from: g */
    public final void mo119285g() {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2 = this.f389906d;
        if (m233779q(connectionResult2)) {
            ConnectionResult connectionResult3 = this.f389907e;
            if (m233779q(connectionResult3) || m233777o()) {
                int i = this.f389915m;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.f389915m = 0;
                    }
                    this.f389911i.mo119166r(this.f389905c);
                }
                m233776n();
                this.f389915m = 0;
            } else if (connectionResult3 == null) {
            } else {
                if (this.f389915m == 1) {
                    m233776n();
                    return;
                }
                m233775m(connectionResult3);
                this.f389903a.mo119179f();
            }
        } else if (connectionResult2 != null && m233779q(this.f389907e)) {
            this.f389904b.mo119179f();
            ConnectionResult connectionResult4 = this.f389906d;
            C143919bh.m233958a(connectionResult4);
            m233775m(connectionResult4);
        } else if (connectionResult2 != null && (connectionResult = this.f389907e) != null) {
            if (this.f389904b.f389735l < this.f389903a.f389735l) {
                connectionResult2 = connectionResult;
            }
            m233775m(connectionResult2);
        }
    }
}
