package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.p060c.C0977g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143716ai;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143939n;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.common.internal.p10783a.C143884e;
import com.google.android.gms.signin.C145989a;
import com.google.android.gms.signin.C145993e;
import com.google.android.gms.signin.C145994f;
import com.google.android.gms.tasks.C146010af;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.bk */
/* compiled from: PG */
public final class C143763bk implements C143849u, C143850v, C143834w {

    /* renamed from: a */
    public final Queue f389747a = new LinkedList();

    /* renamed from: b */
    public final C143839k f389748b;

    /* renamed from: c */
    public final C143820i f389749c;

    /* renamed from: d */
    public final C143729ad f389750d;

    /* renamed from: e */
    public final Map f389751e = new HashMap();

    /* renamed from: f */
    public final int f389752f;

    /* renamed from: g */
    public boolean f389753g;

    /* renamed from: h */
    public final List f389754h = new ArrayList();

    /* renamed from: i */
    public int f389755i = 0;

    /* renamed from: j */
    public final /* synthetic */ C143767bo f389756j;

    /* renamed from: k */
    private final Set f389757k = new HashSet();

    /* renamed from: l */
    private final C143802cw f389758l;

    /* renamed from: m */
    private ConnectionResult f389759m = null;

    public C143763bk(C143767bo boVar, C143847s sVar) {
        this.f389756j = boVar;
        Looper looper = boVar.f389784n.getLooper();
        C143944s a = sVar.mo119289t().mo119475a();
        C143707a aVar = sVar.f389933y.f389916a;
        C143919bh.m233958a(aVar);
        C143839k b = aVar.mo57743b(sVar.f389931w, looper, a, sVar.f389934z, this, this);
        String str = sVar.f389932x;
        if (str != null && (b instanceof C143939n)) {
            ((C143939n) b).f390138E = str;
        }
        if (str == null || !(b instanceof C143788ci)) {
            this.f389748b = b;
            this.f389749c = sVar.f389926A;
            this.f389750d = new C143729ad();
            this.f389752f = sVar.f389928C;
            if (b.mo117790j()) {
                this.f389758l = new C143802cw(boVar.f389776f, boVar.f389784n, sVar.mo119289t().mo119475a());
            } else {
                this.f389758l = null;
            }
        } else {
            C143788ci ciVar = (C143788ci) b;
            throw null;
        }
    }

    /* renamed from: p */
    private final Feature m233608p(Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] A = this.f389748b.mo119237A();
            if (A == null) {
                A = new Feature[0];
            }
            C0977g gVar = new C0977g(r3);
            for (Feature feature : A) {
                gVar.put(feature.f389577a, Long.valueOf(feature.mo119073a()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) gVar.get(feature2.f389577a);
                if (l == null || l.longValue() < feature2.mo119073a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: q */
    private final void m233609q(ConnectionResult connectionResult) {
        Iterator it = this.f389757k.iterator();
        if (it.hasNext()) {
            C143821j jVar = (C143821j) it.next();
            if (C143912ba.m233950b(connectionResult, ConnectionResult.f389572a)) {
                this.f389748b.mo119240D();
            }
            throw null;
        }
        this.f389757k.clear();
    }

    /* renamed from: r */
    private final void m233610r(Status status, Exception exc, boolean z) {
        C143919bh.m233962e(this.f389756j.f389784n);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.f389747a.iterator();
            while (it.hasNext()) {
                C143818g gVar = (C143818g) it.next();
                if (!z || gVar.f389875c == 2) {
                    if (status != null) {
                        gVar.mo119169d(status);
                    } else {
                        gVar.mo119170e(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: s */
    private final void m233611s(C143818g gVar) {
        gVar.mo119172g(this.f389750d, mo119200o());
        try {
            gVar.mo119171f(this);
        } catch (DeadObjectException unused) {
            mo26992kr(1);
            this.f389748b.mo117783f("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: t */
    private final boolean m233612t(C143818g gVar) {
        if (!(gVar instanceof C143725a)) {
            m233611s(gVar);
            return true;
        }
        C143725a aVar = (C143725a) gVar;
        Feature p = m233608p(aVar.mo119123b(this));
        if (p == null) {
            m233611s(gVar);
            return true;
        }
        String name = this.f389748b.getClass().getName();
        String str = p.f389577a;
        long a = p.mo119073a();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + str + ", " + a + ").");
        if (!this.f389756j.f389785o || !aVar.mo119122a(this)) {
            aVar.mo119170e(new C143716ai(p));
            return true;
        }
        C143764bl blVar = new C143764bl(this.f389749c, p);
        int indexOf = this.f389754h.indexOf(blVar);
        if (indexOf >= 0) {
            C143764bl blVar2 = (C143764bl) this.f389754h.get(indexOf);
            this.f389756j.f389784n.removeMessages(15, blVar2);
            Handler handler = this.f389756j.f389784n;
            handler.sendMessageDelayed(Message.obtain(handler, 15, blVar2), 5000);
            return false;
        }
        this.f389754h.add(blVar);
        Handler handler2 = this.f389756j.f389784n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, blVar), 5000);
        Handler handler3 = this.f389756j.f389784n;
        handler3.sendMessageDelayed(Message.obtain(handler3, 16, blVar), 120000);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, (PendingIntent) null, (String) null);
        if (m233613u(connectionResult)) {
            return false;
        }
        this.f389756j.mo119215j(connectionResult, this.f389752f);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        return false;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m233613u(com.google.android.gms.common.ConnectionResult r5) {
        /*
            r4 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C143767bo.f389772c
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.bo r1 = r4.f389756j     // Catch:{ all -> 0x003e }
            com.google.android.gms.common.api.internal.ae r2 = r1.f389782l     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x003b
            java.util.Set r1 = r1.f389783m     // Catch:{ all -> 0x003e }
            com.google.android.gms.common.api.internal.i r2 = r4.f389749c     // Catch:{ all -> 0x003e }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.bo r1 = r4.f389756j     // Catch:{ all -> 0x003e }
            com.google.android.gms.common.api.internal.ae r1 = r1.f389782l     // Catch:{ all -> 0x003e }
            int r2 = r4.f389752f     // Catch:{ all -> 0x003e }
            com.google.android.gms.common.api.internal.o r3 = new com.google.android.gms.common.api.internal.o     // Catch:{ all -> 0x003e }
            r3.<init>(r5, r2)     // Catch:{ all -> 0x003e }
            java.util.concurrent.atomic.AtomicReference r5 = r1.f389894b     // Catch:{ all -> 0x003e }
        L_0x0020:
            r2 = 0
            boolean r2 = r5.compareAndSet(r2, r3)     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0032
            android.os.Handler r5 = r1.f389895c     // Catch:{ all -> 0x003e }
            com.google.android.gms.common.api.internal.q r2 = new com.google.android.gms.common.api.internal.q     // Catch:{ all -> 0x003e }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x003e }
            r5.post(r2)     // Catch:{ all -> 0x003e }
            goto L_0x0038
        L_0x0032:
            java.lang.Object r2 = r5.get()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0020
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            r5 = 1
            return r5
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            r5 = 0
            return r5
        L_0x003e:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            goto L_0x0042
        L_0x0041:
            throw r5
        L_0x0042:
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C143763bk.m233613u(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* renamed from: a */
    public final void mo119189a() {
        C143919bh.m233962e(this.f389756j.f389784n);
        this.f389759m = null;
    }

    /* renamed from: b */
    public final void mo119190b() {
        C143919bh.m233962e(this.f389756j.f389784n);
        if (!this.f389748b.mo119248w() && !this.f389748b.mo119249x()) {
            try {
                C143767bo boVar = this.f389756j;
                int a = boVar.f389778h.mo119414a(boVar.f389776f, this.f389748b);
                if (a != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(1, a, (PendingIntent) null, (String) null);
                    String name = this.f389748b.getClass().getName();
                    String obj = connectionResult.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    mo119195j(connectionResult, (Exception) null);
                    return;
                }
                C143767bo boVar2 = this.f389756j;
                C143839k kVar = this.f389748b;
                C143766bn bnVar = new C143766bn(boVar2, kVar, this.f389749c);
                if (kVar.mo117790j()) {
                    C143802cw cwVar = this.f389758l;
                    C143919bh.m233958a(cwVar);
                    C145993e eVar = cwVar.f389848e;
                    if (eVar != null) {
                        eVar.mo118925n();
                    }
                    cwVar.f389847d.f390176h = Integer.valueOf(System.identityHashCode(cwVar));
                    Context context = cwVar.f389844a;
                    Looper looper = cwVar.f389845b.getLooper();
                    C143944s sVar = cwVar.f389847d;
                    C145994f fVar = sVar.f390175g;
                    cwVar.f389848e = C145989a.m237769c(context, looper, sVar, cwVar, cwVar);
                    cwVar.f389849f = bnVar;
                    Set set = cwVar.f389846c;
                    if (set == null || set.isEmpty()) {
                        cwVar.f389845b.post(new C143800cu(cwVar));
                    } else {
                        cwVar.f389848e.mo122463e();
                    }
                }
                try {
                    this.f389748b.mo119247v(bnVar);
                } catch (SecurityException e) {
                    mo119195j(new ConnectionResult(1, 10, (PendingIntent) null, (String) null), e);
                }
            } catch (IllegalStateException e2) {
                mo119195j(new ConnectionResult(1, 10, (PendingIntent) null, (String) null), e2);
            }
        }
    }

    /* renamed from: d */
    public final void mo26993d(ConnectionResult connectionResult) {
        mo119195j(connectionResult, (Exception) null);
    }

    /* renamed from: f */
    public final void mo119191f(C143818g gVar) {
        C143919bh.m233962e(this.f389756j.f389784n);
        if (!this.f389748b.mo119248w()) {
            this.f389747a.add(gVar);
            ConnectionResult connectionResult = this.f389759m;
            if (connectionResult == null || !connectionResult.mo119067a()) {
                mo119190b();
            } else {
                mo119195j(connectionResult, (Exception) null);
            }
        } else if (m233612t(gVar)) {
            mo119197l();
        } else {
            this.f389747a.add(gVar);
        }
    }

    /* renamed from: g */
    public final void mo119192g(Status status) {
        C143919bh.m233962e(this.f389756j.f389784n);
        m233610r(status, (Exception) null, false);
    }

    /* renamed from: h */
    public final void mo119193h() {
        ArrayList arrayList = new ArrayList(this.f389747a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C143818g gVar = (C143818g) arrayList.get(i);
            if (this.f389748b.mo119248w()) {
                if (m233612t(gVar)) {
                    this.f389747a.remove(gVar);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo119194i() {
        mo119189a();
        m233609q(ConnectionResult.f389572a);
        mo119199n();
        Iterator it = this.f389751e.values().iterator();
        while (it.hasNext()) {
            C143792cm cmVar = (C143792cm) it.next();
            if (m233608p(cmVar.f389825a.f389822b) != null) {
                it.remove();
            } else {
                try {
                    cmVar.f389825a.mo119252a(this.f389748b, new C146010af());
                } catch (DeadObjectException unused) {
                    mo26992kr(3);
                    this.f389748b.mo117783f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        mo119193h();
        mo119197l();
    }

    /* renamed from: j */
    public final void mo119195j(ConnectionResult connectionResult, Exception exc) {
        C145993e eVar;
        C143919bh.m233962e(this.f389756j.f389784n);
        C143802cw cwVar = this.f389758l;
        if (!(cwVar == null || (eVar = cwVar.f389848e) == null)) {
            eVar.mo118925n();
        }
        mo119189a();
        this.f389756j.f389778h.f390102a.clear();
        m233609q(connectionResult);
        if ((this.f389748b instanceof C143884e) && connectionResult.f389574c != 24) {
            C143767bo boVar = this.f389756j;
            boVar.f389775e = true;
            Handler handler = boVar.f389784n;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
        }
        if (connectionResult.f389574c == 4) {
            mo119192g(C143767bo.f389771b);
        } else if (this.f389747a.isEmpty()) {
            this.f389759m = connectionResult;
        } else if (exc != null) {
            C143919bh.m233962e(this.f389756j.f389784n);
            m233610r((Status) null, exc, false);
        } else if (this.f389756j.f389785o) {
            m233610r(C143767bo.m233632a(this.f389749c, connectionResult), (Exception) null, true);
            if (!this.f389747a.isEmpty() && !m233613u(connectionResult) && !this.f389756j.mo119215j(connectionResult, this.f389752f)) {
                if (connectionResult.f389574c == 18) {
                    this.f389753g = true;
                }
                if (this.f389753g) {
                    Handler handler2 = this.f389756j.f389784n;
                    handler2.sendMessageDelayed(Message.obtain(handler2, 9, this.f389749c), 5000);
                    return;
                }
                mo119192g(C143767bo.m233632a(this.f389749c, connectionResult));
            }
        } else {
            mo119192g(C143767bo.m233632a(this.f389749c, connectionResult));
        }
    }

    /* renamed from: k */
    public final void mo119196k(int i) {
        mo119189a();
        this.f389753g = true;
        C143729ad adVar = this.f389750d;
        String t = this.f389748b.mo119245t();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (t != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(t);
        }
        adVar.mo119125a(true, new Status(1, 20, sb.toString(), (PendingIntent) null, (ConnectionResult) null));
        Handler handler = this.f389756j.f389784n;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.f389749c), 5000);
        Handler handler2 = this.f389756j.f389784n;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.f389749c), 120000);
        this.f389756j.f389778h.f390102a.clear();
        for (C143792cm cmVar : this.f389751e.values()) {
            cmVar.f389827c.run();
        }
    }

    /* renamed from: kq */
    public final void mo26991kq(Bundle bundle) {
        if (Looper.myLooper() == this.f389756j.f389784n.getLooper()) {
            mo119194i();
        } else {
            this.f389756j.f389784n.post(new C143759bg(this));
        }
    }

    /* renamed from: kr */
    public final void mo26992kr(int i) {
        if (Looper.myLooper() == this.f389756j.f389784n.getLooper()) {
            mo119196k(i);
        } else {
            this.f389756j.f389784n.post(new C143760bh(this, i));
        }
    }

    /* renamed from: l */
    public final void mo119197l() {
        this.f389756j.f389784n.removeMessages(12, this.f389749c);
        Handler handler = this.f389756j.f389784n;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.f389749c), this.f389756j.f389774d);
    }

    /* renamed from: m */
    public final void mo119198m() {
        C143919bh.m233962e(this.f389756j.f389784n);
        mo119192g(C143767bo.f389770a);
        this.f389750d.mo119125a(false, C143767bo.f389770a);
        for (C143782cc fVar : (C143782cc[]) this.f389751e.keySet().toArray(new C143782cc[0])) {
            mo119191f(new C143817f(fVar, new C146010af()));
        }
        m233609q(new ConnectionResult(1, 4, (PendingIntent) null, (String) null));
        if (this.f389748b.mo119248w()) {
            this.f389748b.mo119238B(new C143762bj(this));
        }
    }

    /* renamed from: n */
    public final void mo119199n() {
        if (this.f389753g) {
            this.f389756j.f389784n.removeMessages(11, this.f389749c);
            this.f389756j.f389784n.removeMessages(9, this.f389749c);
            this.f389753g = false;
        }
    }

    /* renamed from: o */
    public final boolean mo119200o() {
        return this.f389748b.mo117790j();
    }
}
