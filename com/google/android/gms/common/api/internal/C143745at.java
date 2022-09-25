package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.p060c.C0984n;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143718c;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.internal.C143899ao;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143939n;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.signin.C145989a;
import com.google.android.gms.signin.C145993e;
import com.google.android.gms.signin.C145994f;
import com.google.android.gms.signin.internal.C145999e;
import com.google.android.gms.signin.internal.C146001g;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.at */
/* compiled from: PG */
public final class C143745at implements C143751az {

    /* renamed from: a */
    public final C143755bc f389673a;

    /* renamed from: b */
    public final Lock f389674b;

    /* renamed from: c */
    public final Context f389675c;

    /* renamed from: d */
    public final C143876h f389676d;

    /* renamed from: e */
    public C145993e f389677e;

    /* renamed from: f */
    public boolean f389678f;

    /* renamed from: g */
    public boolean f389679g;

    /* renamed from: h */
    public boolean f389680h;

    /* renamed from: i */
    public boolean f389681i;

    /* renamed from: j */
    public final C143944s f389682j;

    /* renamed from: k */
    public C143899ao f389683k;

    /* renamed from: l */
    private ConnectionResult f389684l;

    /* renamed from: m */
    private int f389685m;

    /* renamed from: n */
    private int f389686n = 0;

    /* renamed from: o */
    private int f389687o;

    /* renamed from: p */
    private final Bundle f389688p = new Bundle();

    /* renamed from: q */
    private final Set f389689q = new HashSet();

    /* renamed from: r */
    private boolean f389690r;

    /* renamed from: s */
    private final Map f389691s;

    /* renamed from: t */
    private final C143707a f389692t;

    /* renamed from: u */
    private final ArrayList f389693u = new ArrayList();

    public C143745at(C143755bc bcVar, C143944s sVar, Map map, C143876h hVar, C143707a aVar, Lock lock, Context context) {
        this.f389673a = bcVar;
        this.f389682j = sVar;
        this.f389691s = map;
        this.f389676d = hVar;
        this.f389692t = aVar;
        this.f389674b = lock;
        this.f389675c = context;
    }

    /* renamed from: p */
    private final void m233533p() {
        ArrayList arrayList = this.f389693u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.f389693u.clear();
    }

    /* renamed from: q */
    private final void m233534q(boolean z) {
        C145993e eVar = this.f389677e;
        if (eVar != null) {
            if (eVar.mo119248w() && z) {
                try {
                    C145999e eVar2 = (C145999e) ((C143939n) eVar).mo119451G();
                    Integer num = ((C146001g) eVar).f394690a;
                    C143919bh.m233958a(num);
                    int intValue = num.intValue();
                    Parcel gA = eVar2.mo17260gA();
                    gA.writeInt(intValue);
                    eVar2.mo17262he(7, gA);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            eVar.mo118925n();
            C143919bh.m233958a(this.f389682j);
            this.f389683k = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: r */
    private final void m233535r() {
        Bundle bundle;
        C143755bc bcVar = this.f389673a;
        bcVar.f389724a.lock();
        try {
            bcVar.f389736m.mo119164o();
            bcVar.f389734k = new C143734ai(bcVar);
            bcVar.f389734k.mo119137b();
            bcVar.f389725b.signalAll();
            bcVar.f389724a.unlock();
            C143756bd.f389739a.execute(new C143735aj(this));
            C145993e eVar = this.f389677e;
            if (eVar != null) {
                if (this.f389680h) {
                    C143899ao aoVar = this.f389683k;
                    C143919bh.m233958a(aoVar);
                    boolean z = this.f389681i;
                    try {
                        C145999e eVar2 = (C145999e) ((C143939n) eVar).mo119451G();
                        Integer num = ((C146001g) eVar).f394690a;
                        C143919bh.m233958a(num);
                        int intValue = num.intValue();
                        Parcel gA = eVar2.mo17260gA();
                        C8850c.m23499h(gA, aoVar);
                        gA.writeInt(intValue);
                        C8850c.m23495d(gA, z);
                        eVar2.mo17262he(9, gA);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                m233534q(false);
            }
            for (C143718c cVar : this.f389673a.f389730g.keySet()) {
                C143839k kVar = (C143839k) this.f389673a.f389729f.get(cVar);
                C143919bh.m233958a(kVar);
                kVar.mo118925n();
            }
            if (this.f389688p.isEmpty()) {
                bundle = null;
            } else {
                bundle = this.f389688p;
            }
            this.f389673a.f389737n.mo119166r(bundle);
        } catch (Throwable th) {
            bcVar.f389724a.unlock();
            throw th;
        }
    }

    /* renamed from: s */
    private static final String m233536s(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: a */
    public final C143824m mo119136a(C143824m mVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public final void mo119137b() {
        this.f389673a.f389730g.clear();
        this.f389678f = false;
        this.f389684l = null;
        this.f389686n = 0;
        this.f389690r = true;
        this.f389679g = false;
        this.f389680h = false;
        HashMap hashMap = new HashMap();
        for (C143841m mVar : this.f389691s.keySet()) {
            C143839k kVar = (C143839k) this.f389673a.f389729f.get(mVar.f389917b);
            C143919bh.m233958a(kVar);
            C143707a aVar = mVar.f389916a;
            boolean booleanValue = ((Boolean) this.f389691s.get(mVar)).booleanValue();
            if (kVar.mo117790j()) {
                this.f389678f = true;
                if (booleanValue) {
                    this.f389689q.add(mVar.f389917b);
                } else {
                    this.f389690r = false;
                }
            }
            hashMap.put(kVar, new C143736ak(this, mVar, booleanValue));
        }
        if (this.f389678f) {
            C143919bh.m233958a(this.f389682j);
            C143919bh.m233958a(this.f389692t);
            this.f389682j.f390176h = Integer.valueOf(System.identityHashCode(this.f389673a.f389736m));
            C143743ar arVar = new C143743ar(this);
            Context context = this.f389675c;
            Looper looper = this.f389673a.f389736m.f389700d;
            C143944s sVar = this.f389682j;
            C145994f fVar = sVar.f390175g;
            this.f389677e = C145989a.m237769c(context, looper, sVar, arVar, arVar);
        }
        this.f389687o = ((C0984n) this.f389673a.f389729f).f3122d;
        this.f389693u.add(C143756bd.f389739a.submit(new C143739an(this, hashMap)));
    }

    /* renamed from: c */
    public final void mo119138c() {
    }

    /* renamed from: d */
    public final void mo119139d(Bundle bundle) {
        if (mo119153m(1)) {
            if (bundle != null) {
                this.f389688p.putAll(bundle);
            }
            if (mo119154n()) {
                m233535r();
            }
        }
    }

    /* renamed from: e */
    public final void mo119140e(ConnectionResult connectionResult, C143841m mVar, boolean z) {
        if (mo119153m(1)) {
            mo119151k(connectionResult, mVar, z);
            if (mo119154n()) {
                m233535r();
            }
        }
    }

    /* renamed from: f */
    public final void mo119141f(int i) {
        mo119150j(new ConnectionResult(1, 8, (PendingIntent) null, (String) null));
    }

    /* renamed from: g */
    public final boolean mo119142g() {
        m233533p();
        m233534q(true);
        this.f389673a.mo119180g((ConnectionResult) null);
        return true;
    }

    /* renamed from: h */
    public final void mo119143h(C143824m mVar) {
        this.f389673a.f389736m.f389701e.add(mVar);
    }

    /* renamed from: i */
    public final void mo119149i() {
        this.f389678f = false;
        this.f389673a.f389736m.f389704h = Collections.emptySet();
        for (C143718c cVar : this.f389689q) {
            if (!this.f389673a.f389730g.containsKey(cVar)) {
                this.f389673a.f389730g.put(cVar, new ConnectionResult(1, 17, (PendingIntent) null, (String) null));
            }
        }
    }

    /* renamed from: j */
    public final void mo119150j(ConnectionResult connectionResult) {
        m233533p();
        m233534q(!connectionResult.mo119067a());
        this.f389673a.mo119180g(connectionResult);
        this.f389673a.f389737n.mo119165q(connectionResult);
    }

    /* renamed from: k */
    public final void mo119151k(ConnectionResult connectionResult, C143841m mVar, boolean z) {
        C143707a aVar = mVar.f389916a;
        if ((!z || connectionResult.mo119067a() || this.f389676d.mo119363k((Context) null, connectionResult.f389574c, (String) null) != null) && this.f389684l == null) {
            this.f389684l = connectionResult;
            this.f389685m = Integer.MAX_VALUE;
        }
        this.f389673a.f389730g.put(mVar.f389917b, connectionResult);
    }

    /* renamed from: l */
    public final void mo119152l() {
        if (this.f389687o == 0) {
            if (!this.f389678f || this.f389679g) {
                ArrayList arrayList = new ArrayList();
                this.f389686n = 1;
                Map map = this.f389673a.f389729f;
                this.f389687o = ((C0984n) map).f3122d;
                for (C143718c cVar : map.keySet()) {
                    if (!this.f389673a.f389730g.containsKey(cVar)) {
                        arrayList.add((C143839k) this.f389673a.f389729f.get(cVar));
                    } else if (mo119154n()) {
                        m233535r();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f389693u.add(C143756bd.f389739a.submit(new C143740ao(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: m */
    public final boolean mo119153m(int i) {
        if (this.f389686n == i) {
            return true;
        }
        Log.w("GACConnecting", this.f389673a.f389736m.mo119161k());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.f389687o;
        Log.w("GACConnecting", "mRemainingConnections=" + i2);
        int i3 = this.f389686n;
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + m233536s(i3) + " but received callback for step " + m233536s(i), new Exception());
        mo119150j(new ConnectionResult(1, 8, (PendingIntent) null, (String) null));
        return false;
    }

    /* renamed from: n */
    public final boolean mo119154n() {
        int i = this.f389687o - 1;
        this.f389687o = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f389673a.f389736m.mo119161k());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            mo119150j(new ConnectionResult(1, 8, (PendingIntent) null, (String) null));
            return false;
        }
        ConnectionResult connectionResult = this.f389684l;
        if (connectionResult == null) {
            return true;
        }
        this.f389673a.f389735l = this.f389685m;
        mo119150j(connectionResult);
        return false;
    }

    /* renamed from: o */
    public final boolean mo119155o(ConnectionResult connectionResult) {
        return this.f389690r && !connectionResult.mo119067a();
    }
}
