package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C143708aa;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.C143853y;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143900ap;
import com.google.android.gms.common.internal.C143919bh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
public abstract class BasePendingResult extends C143854z {

    /* renamed from: i */
    static final ThreadLocal f389628i = new C143830s();

    /* renamed from: q */
    public static final /* synthetic */ int f389629q = 0;

    /* renamed from: a */
    private final CountDownLatch f389630a;

    /* renamed from: b */
    private final ArrayList f389631b;

    /* renamed from: c */
    private C143712ae f389632c;

    /* renamed from: d */
    private Status f389633d;

    /* renamed from: e */
    private volatile boolean f389634e;

    /* renamed from: f */
    private boolean f389635f;

    /* renamed from: g */
    private boolean f389636g;

    /* renamed from: h */
    private volatile C143812df f389637h;

    /* renamed from: j */
    public final Object f389638j;

    /* renamed from: k */
    protected final C143831t f389639k;

    /* renamed from: l */
    protected final WeakReference f389640l;

    /* renamed from: m */
    public final AtomicReference f389641m;
    private C143832u mResultGuardian;

    /* renamed from: n */
    public C143711ad f389642n;

    /* renamed from: o */
    public boolean f389643o;

    /* renamed from: p */
    public C143900ap f389644p;

    @Deprecated
    BasePendingResult() {
        this.f389638j = new Object();
        this.f389630a = new CountDownLatch(1);
        this.f389631b = new ArrayList();
        this.f389641m = new AtomicReference();
        this.f389643o = false;
        this.f389639k = new C143831t(Looper.getMainLooper());
        this.f389640l = new WeakReference((Object) null);
    }

    /* renamed from: h */
    private final C143711ad mo118739h() {
        C143711ad adVar;
        synchronized (this.f389638j) {
            C143919bh.m233967j(!this.f389634e, "Result has already been consumed.");
            C143919bh.m233967j(mo119114r(), "Result is not ready.");
            adVar = this.f389642n;
            this.f389642n = null;
            this.f389632c = null;
            this.f389634e = true;
        }
        C143813dg dgVar = (C143813dg) this.f389641m.getAndSet((Object) null);
        if (dgVar != null) {
            dgVar.f389867a.f389869b.remove(this);
        }
        C143919bh.m233958a(adVar);
        return adVar;
    }

    /* renamed from: o */
    public static void m233473o(C143711ad adVar) {
        if (adVar instanceof C143708aa) {
            try {
                ((C143708aa) adVar).mo119102b();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(adVar))), e);
            }
        }
    }

    /* renamed from: s */
    private final void m233474s(C143711ad adVar) {
        this.f389642n = adVar;
        this.f389633d = adVar.mo117629a();
        this.f389644p = null;
        this.f389630a.countDown();
        if (this.f389635f) {
            this.f389632c = null;
        } else {
            C143712ae aeVar = this.f389632c;
            if (aeVar != null) {
                this.f389639k.removeMessages(2);
                this.f389639k.mo119282a(aeVar, mo118739h());
            } else if (this.f389642n instanceof C143708aa) {
                this.mResultGuardian = new C143832u(this);
            }
        }
        ArrayList arrayList = this.f389631b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C143853y) arrayList.get(i)).mo119124a(this.f389633d);
        }
        this.f389631b.clear();
    }

    /* renamed from: a */
    public final C143711ad mo117316a() {
        C143919bh.m233965h("await must not be called on the UI thread");
        C143919bh.m233967j(!this.f389634e, "Result has already been consumed");
        try {
            this.f389630a.await();
        } catch (InterruptedException unused) {
            mo119110m(Status.f389616b);
        }
        C143919bh.m233967j(mo119114r(), "Result is not ready.");
        return mo118739h();
    }

    /* renamed from: b */
    public final C143711ad mo117317b(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C143919bh.m233965h("await must not be called on the UI thread when time is greater than zero.");
        }
        C143919bh.m233967j(!this.f389634e, "Result has already been consumed.");
        try {
            if (!this.f389630a.await(j, timeUnit)) {
                mo119110m(Status.f389618d);
            }
        } catch (InterruptedException unused) {
            mo119110m(Status.f389616b);
        }
        C143919bh.m233967j(mo119114r(), "Result is not ready.");
        return mo118739h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C143711ad mo117683c(Status status);

    /* renamed from: d */
    public final void mo117319d(C143853y yVar) {
        C143919bh.m233960c(yVar != null, "Callback cannot be null.");
        synchronized (this.f389638j) {
            if (mo119114r()) {
                yVar.mo119124a(this.f389633d);
            } else {
                this.f389631b.add(yVar);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117320e() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f389638j
            monitor-enter(r0)
            boolean r1 = r2.f389635f     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f389634e     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            com.google.android.gms.common.internal.ap r1 = r2.f389644p     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.mo119416e()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            com.google.android.gms.common.api.ad r1 = r2.f389642n     // Catch:{ all -> 0x0028 }
            m233473o(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f389635f = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f389619e     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.ad r1 = r2.mo117683c(r1)     // Catch:{ all -> 0x0028 }
            r2.m233474s(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo117320e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117321f(com.google.android.gms.common.api.C143712ae r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f389638j
            monitor-enter(r0)
            if (r4 != 0) goto L_0x000a
            r4 = 0
            r3.f389632c = r4     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x000a:
            boolean r1 = r3.f389634e     // Catch:{ all -> 0x002f }
            r1 = r1 ^ 1
            java.lang.String r2 = "Result has already been consumed."
            com.google.android.gms.common.internal.C143919bh.m233967j(r1, r2)     // Catch:{ all -> 0x002f }
            boolean r1 = r3.mo119113q()     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x001b
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x001b:
            boolean r1 = r3.mo119114r()     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002b
            com.google.android.gms.common.api.internal.t r1 = r3.f389639k     // Catch:{ all -> 0x002f }
            com.google.android.gms.common.api.ad r2 = r3.mo118739h()     // Catch:{ all -> 0x002f }
            r1.mo119282a(r4, r2)     // Catch:{ all -> 0x002f }
            goto L_0x002d
        L_0x002b:
            r3.f389632c = r4     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo117321f(com.google.android.gms.common.api.ae):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117322g(com.google.android.gms.common.api.C143712ae r4, java.util.concurrent.TimeUnit r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f389638j
            monitor-enter(r0)
            boolean r1 = r3.f389634e     // Catch:{ all -> 0x0038 }
            r1 = r1 ^ 1
            java.lang.String r2 = "Result has already been consumed."
            com.google.android.gms.common.internal.C143919bh.m233967j(r1, r2)     // Catch:{ all -> 0x0038 }
            boolean r1 = r3.mo119113q()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x0014:
            boolean r1 = r3.mo119114r()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.common.api.internal.t r5 = r3.f389639k     // Catch:{ all -> 0x0038 }
            com.google.android.gms.common.api.ad r1 = r3.mo118739h()     // Catch:{ all -> 0x0038 }
            r5.mo119282a(r4, r1)     // Catch:{ all -> 0x0038 }
            goto L_0x0036
        L_0x0024:
            r3.f389632c = r4     // Catch:{ all -> 0x0038 }
            com.google.android.gms.common.api.internal.t r4 = r3.f389639k     // Catch:{ all -> 0x0038 }
            r1 = 3
            long r1 = r5.toMillis(r1)     // Catch:{ all -> 0x0038 }
            r5 = 2
            android.os.Message r5 = r4.obtainMessage(r5, r3)     // Catch:{ all -> 0x0038 }
            r4.sendMessageDelayed(r5, r1)     // Catch:{ all -> 0x0038 }
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x0038:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo117322g(com.google.android.gms.common.api.ae, java.util.concurrent.TimeUnit):void");
    }

    @Deprecated
    /* renamed from: m */
    public final void mo119110m(Status status) {
        synchronized (this.f389638j) {
            if (!mo119114r()) {
                mo119112p(mo117683c(status));
                this.f389636g = true;
            }
        }
    }

    /* renamed from: n */
    public final void mo119111n() {
        boolean z = true;
        if (!this.f389643o && !((Boolean) f389628i.get()).booleanValue()) {
            z = false;
        }
        this.f389643o = z;
    }

    /* renamed from: q */
    public final boolean mo119113q() {
        boolean z;
        synchronized (this.f389638j) {
            z = this.f389635f;
        }
        return z;
    }

    /* renamed from: r */
    public final boolean mo119114r() {
        return this.f389630a.getCount() == 0;
    }

    /* renamed from: p */
    public final void mo119112p(C143711ad adVar) {
        synchronized (this.f389638j) {
            if (this.f389636g || this.f389635f) {
                m233473o(adVar);
                return;
            }
            mo119114r();
            C143919bh.m233967j(!mo119114r(), "Results have already been set");
            C143919bh.m233967j(!this.f389634e, "Result has already been consumed");
            m233474s(adVar);
        }
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.f389638j = new Object();
        this.f389630a = new CountDownLatch(1);
        this.f389631b = new ArrayList();
        this.f389641m = new AtomicReference();
        this.f389643o = false;
        this.f389639k = new C143831t(looper);
        this.f389640l = new WeakReference((Object) null);
    }

    protected BasePendingResult(C143851w wVar) {
        this.f389638j = new Object();
        this.f389630a = new CountDownLatch(1);
        this.f389631b = new ArrayList();
        this.f389641m = new AtomicReference();
        this.f389643o = false;
        this.f389639k = new C143831t(wVar != null ? wVar.mo119158a() : Looper.getMainLooper());
        this.f389640l = new WeakReference(wVar);
    }
}
