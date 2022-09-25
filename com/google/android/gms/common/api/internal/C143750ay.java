package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143888ad;
import com.google.android.gms.common.internal.C143889ae;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143944s;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.ay */
/* compiled from: PG */
public final class C143750ay extends C143851w implements C143774bv {

    /* renamed from: b */
    public final Lock f389698b;

    /* renamed from: c */
    public final C143889ae f389699c;

    /* renamed from: d */
    public final Looper f389700d;

    /* renamed from: e */
    final Queue f389701e = new LinkedList();

    /* renamed from: f */
    C143770br f389702f;

    /* renamed from: g */
    final Map f389703g;

    /* renamed from: h */
    Set f389704h = new HashSet();

    /* renamed from: i */
    final C143944s f389705i;

    /* renamed from: j */
    final Map f389706j;

    /* renamed from: k */
    final C143707a f389707k;

    /* renamed from: l */
    public final C143785cf f389708l = new C143785cf();

    /* renamed from: m */
    final C143814dh f389709m;

    /* renamed from: n */
    private C143775bw f389710n = null;

    /* renamed from: o */
    private final int f389711o;

    /* renamed from: p */
    private final Context f389712p;

    /* renamed from: q */
    private volatile boolean f389713q;

    /* renamed from: r */
    private long f389714r = 120000;

    /* renamed from: s */
    private long f389715s = 5000;

    /* renamed from: t */
    private final C143748aw f389716t;

    /* renamed from: u */
    private final C143875g f389717u;

    /* renamed from: v */
    private final ArrayList f389718v;

    /* renamed from: w */
    private Integer f389719w = null;

    /* renamed from: x */
    private final C143888ad f389720x;

    public C143750ay(Context context, Lock lock, Looper looper, C143944s sVar, C143875g gVar, C143707a aVar, Map map, List list, List list2, Map map2, ArrayList arrayList) {
        C143747av avVar = new C143747av(this);
        this.f389720x = avVar;
        this.f389712p = context;
        this.f389698b = lock;
        this.f389699c = new C143889ae(looper, avVar);
        this.f389700d = looper;
        this.f389716t = new C143748aw(this, looper);
        this.f389717u = gVar;
        this.f389711o = -1;
        this.f389706j = map;
        this.f389703g = map2;
        this.f389718v = arrayList;
        this.f389709m = new C143814dh();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f389699c.mo119397b((C143849u) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f389699c.mo119398c((C143850v) it2.next());
        }
        this.f389705i = sVar;
        this.f389707k = aVar;
    }

    /* renamed from: j */
    public static int m233561j(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            C143839k kVar = (C143839k) it.next();
            z2 |= kVar.mo117790j();
            z3 |= kVar.mo119250y();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: l */
    static String m233562l(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: a */
    public final Looper mo119158a() {
        return this.f389700d;
    }

    /* renamed from: b */
    public final ConnectionResult mo119129b() {
        boolean z = false;
        C143919bh.m233967j(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f389698b.lock();
        try {
            if (this.f389711o >= 0) {
                if (this.f389719w != null) {
                    z = true;
                }
                C143919bh.m233967j(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f389719w;
                if (num == null) {
                    this.f389719w = Integer.valueOf(m233561j(this.f389703g.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f389719w;
            C143919bh.m233958a(num2);
            m233563p(num2.intValue());
            this.f389699c.f390068e = true;
            C143775bw bwVar = this.f389710n;
            C143919bh.m233958a(bwVar);
            return bwVar.mo119174a();
        } finally {
            this.f389698b.unlock();
        }
    }

    /* renamed from: c */
    public final ConnectionResult mo119130c(long j, TimeUnit timeUnit) {
        C143919bh.m233967j(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        C143919bh.m233971n(timeUnit, "TimeUnit must not be null");
        this.f389698b.lock();
        try {
            Integer num = this.f389719w;
            if (num == null) {
                this.f389719w = Integer.valueOf(m233561j(this.f389703g.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.f389719w;
            C143919bh.m233958a(num2);
            m233563p(num2.intValue());
            this.f389699c.f390068e = true;
            C143775bw bwVar = this.f389710n;
            C143919bh.m233958a(bwVar);
            return bwVar.mo119175b(j, timeUnit);
        } finally {
            this.f389698b.unlock();
        }
    }

    /* renamed from: d */
    public final C143824m mo119159d(C143824m mVar) {
        Lock lock;
        C143841m mVar2 = mVar.f389886c;
        boolean containsKey = this.f389703g.containsKey(mVar.f389885b);
        String str = mVar2 != null ? mVar2.f389918c : "the API";
        C143919bh.m233960c(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.f389698b.lock();
        try {
            C143775bw bwVar = this.f389710n;
            if (bwVar == null) {
                this.f389701e.add(mVar);
                lock = this.f389698b;
            } else {
                mVar = bwVar.mo119176c(mVar);
                lock = this.f389698b;
            }
            lock.unlock();
            return mVar;
        } catch (Throwable th) {
            this.f389698b.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public final C143824m mo119160e(C143824m mVar) {
        Lock lock;
        C143841m mVar2 = mVar.f389886c;
        boolean containsKey = this.f389703g.containsKey(mVar.f389885b);
        String str = mVar2 != null ? mVar2.f389918c : "the API";
        C143919bh.m233960c(containsKey, "GoogleApiClient is not configured to use " + str + " required for this call.");
        this.f389698b.lock();
        try {
            C143775bw bwVar = this.f389710n;
            if (bwVar != null) {
                if (this.f389713q) {
                    this.f389701e.add(mVar);
                    while (!this.f389701e.isEmpty()) {
                        C143824m mVar3 = (C143824m) this.f389701e.remove();
                        this.f389709m.mo119261a(mVar3);
                        mVar3.mo119276l(Status.f389617c);
                    }
                    lock = this.f389698b;
                } else {
                    mVar = bwVar.mo119177d(mVar);
                    lock = this.f389698b;
                }
                lock.unlock();
                return mVar;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f389698b.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo119131f() {
        this.f389698b.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f389711o >= 0) {
                C143919bh.m233967j(this.f389719w != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f389719w;
                if (num == null) {
                    this.f389719w = Integer.valueOf(m233561j(this.f389703g.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f389719w;
            C143919bh.m233958a(num2);
            int intValue = num2.intValue();
            this.f389698b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                C143919bh.m233960c(z, "Illegal sign-in mode: " + i);
                m233563p(i);
                mo119162m();
            }
            z = true;
            C143919bh.m233960c(z, "Illegal sign-in mode: " + i);
            m233563p(i);
            mo119162m();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f389698b.unlock();
        }
    }

    /* renamed from: g */
    public final void mo119132g() {
        Lock lock;
        boolean q;
        this.f389698b.lock();
        try {
            C143814dh dhVar = this.f389709m;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) dhVar.f389869b.toArray(new BasePendingResult[0])) {
                basePendingResult.f389641m.set((Object) null);
                synchronized (basePendingResult.f389638j) {
                    if (((C143851w) basePendingResult.f389640l.get()) == null || !basePendingResult.f389643o) {
                        basePendingResult.mo117320e();
                    }
                    q = basePendingResult.mo119113q();
                }
                if (q) {
                    dhVar.f389869b.remove(basePendingResult);
                }
            }
            C143775bw bwVar = this.f389710n;
            if (bwVar != null) {
                bwVar.mo119179f();
            }
            C143785cf cfVar = this.f389708l;
            for (C143784ce ceVar : cfVar.f389808a) {
                ceVar.f389805a = null;
                ceVar.f389806b = null;
            }
            cfVar.f389808a.clear();
            for (C143824m mVar : this.f389701e) {
                mVar.f389641m.set((Object) null);
                mVar.mo117320e();
            }
            this.f389701e.clear();
            if (this.f389710n == null) {
                lock = this.f389698b;
            } else {
                mo119164o();
                this.f389699c.mo119396a();
                lock = this.f389698b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f389698b.unlock();
            throw th;
        }
    }

    /* renamed from: h */
    public final boolean mo119133h() {
        C143775bw bwVar = this.f389710n;
        return bwVar != null && bwVar.mo119181h();
    }

    /* renamed from: i */
    public final boolean mo119134i() {
        C143775bw bwVar = this.f389710n;
        return bwVar != null && bwVar.mo119182i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo119161k() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append(BuildConfig.FLAVOR).append("mContext=").println(this.f389712p);
        printWriter.append(BuildConfig.FLAVOR).append("mResuming=").print(this.f389713q);
        printWriter.append(" mWorkQueue.size()=").print(this.f389701e.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f389709m.f389869b.size());
        C143775bw bwVar = this.f389710n;
        if (bwVar != null) {
            bwVar.mo119184k(BuildConfig.FLAVOR, printWriter);
        }
        return stringWriter.toString();
    }

    /* renamed from: m */
    public final void mo119162m() {
        this.f389699c.f390068e = true;
        C143775bw bwVar = this.f389710n;
        C143919bh.m233958a(bwVar);
        bwVar.mo119178e();
    }

    /* renamed from: n */
    public final void mo119163n() {
        this.f389698b.lock();
        try {
            if (this.f389713q) {
                mo119162m();
            }
        } finally {
            this.f389698b.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo119164o() {
        if (!this.f389713q) {
            return false;
        }
        this.f389713q = false;
        this.f389716t.removeMessages(2);
        this.f389716t.removeMessages(1);
        C143770br brVar = this.f389702f;
        if (brVar != null) {
            brVar.mo119216a();
            this.f389702f = null;
        }
        return true;
    }

    /* renamed from: q */
    public final void mo119165q(ConnectionResult connectionResult) {
        if (!C143700ab.m233445g(this.f389712p, connectionResult.f389574c)) {
            mo119164o();
        }
        if (!this.f389713q) {
            C143889ae aeVar = this.f389699c;
            C143919bh.m233963f(aeVar.f390071h, "onConnectionFailure must only be called on the Handler thread");
            aeVar.f390071h.removeMessages(1);
            synchronized (aeVar.f390072i) {
                ArrayList arrayList = new ArrayList(aeVar.f390067d);
                int i = aeVar.f390069f.get();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C143850v vVar = (C143850v) it.next();
                    if (!aeVar.f390068e) {
                        break;
                    } else if (aeVar.f390069f.get() != i) {
                        break;
                    } else if (aeVar.f390067d.contains(vVar)) {
                        vVar.mo26993d(connectionResult);
                    }
                }
            }
            this.f389699c.mo119396a();
        }
    }

    /* renamed from: r */
    public final void mo119166r(Bundle bundle) {
        while (!this.f389701e.isEmpty()) {
            mo119160e((C143824m) this.f389701e.remove());
        }
        C143889ae aeVar = this.f389699c;
        C143919bh.m233963f(aeVar.f390071h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (aeVar.f390072i) {
            C143919bh.m233966i(!aeVar.f390070g);
            aeVar.f390071h.removeMessages(1);
            aeVar.f390070g = true;
            C143919bh.m233966i(aeVar.f390066c.isEmpty());
            ArrayList arrayList = new ArrayList(aeVar.f390065b);
            int i = aeVar.f390069f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C143849u uVar = (C143849u) it.next();
                if (!aeVar.f390068e || !((C143747av) aeVar.f390064a).f389695a.mo119133h()) {
                    break;
                } else if (aeVar.f390069f.get() != i) {
                    break;
                } else if (!aeVar.f390066c.contains(uVar)) {
                    uVar.mo26991kq(bundle);
                }
            }
            aeVar.f390066c.clear();
            aeVar.f390070g = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.gms.common.api.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m233563p(int r19) {
        /*
            r18 = this;
            r15 = r18
            java.lang.Integer r0 = r15.f389719w
            if (r0 != 0) goto L_0x000d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r15.f389719w = r0
            goto L_0x0015
        L_0x000d:
            int r0 = r0.intValue()
            r1 = r19
            if (r0 != r1) goto L_0x0196
        L_0x0015:
            com.google.android.gms.common.api.internal.bw r0 = r15.f389710n
            if (r0 == 0) goto L_0x001a
            return
        L_0x001a:
            java.util.Map r0 = r15.f389703g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x0026:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r0.next()
            com.google.android.gms.common.api.k r4 = (com.google.android.gms.common.api.C143839k) r4
            boolean r5 = r4.mo117790j()
            r2 = r2 | r5
            boolean r4 = r4.mo119250y()
            r3 = r3 | r4
            goto L_0x0026
        L_0x003d:
            java.lang.Integer r0 = r15.f389719w
            int r0 = r0.intValue()
            r4 = 1
            if (r0 == r4) goto L_0x0162
            r3 = 2
            if (r0 == r3) goto L_0x004c
        L_0x0049:
            r12 = r15
            goto L_0x0167
        L_0x004c:
            if (r2 == 0) goto L_0x0049
            android.content.Context r2 = r15.f389712p
            java.util.concurrent.locks.Lock r3 = r15.f389698b
            android.os.Looper r5 = r15.f389700d
            com.google.android.gms.common.g r6 = r15.f389717u
            java.util.Map r0 = r15.f389703g
            com.google.android.gms.common.internal.s r8 = r15.f389705i
            java.util.Map r7 = r15.f389706j
            com.google.android.gms.common.api.a r9 = r15.f389707k
            java.util.ArrayList r10 = r15.f389718v
            androidx.c.g r11 = new androidx.c.g
            r11.<init>()
            androidx.c.g r12 = new androidx.c.g
            r12.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r13 = 0
        L_0x0073:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x00ac
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r16 = r14.getValue()
            r1 = r16
            com.google.android.gms.common.api.k r1 = (com.google.android.gms.common.api.C143839k) r1
            r16 = r0
            boolean r0 = r1.mo119250y()
            if (r4 != r0) goto L_0x0090
            r13 = r1
        L_0x0090:
            boolean r0 = r1.mo117790j()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r14.getKey()
            com.google.android.gms.common.api.c r0 = (com.google.android.gms.common.api.C143718c) r0
            r11.put(r0, r1)
            goto L_0x00a9
        L_0x00a0:
            java.lang.Object r0 = r14.getKey()
            com.google.android.gms.common.api.c r0 = (com.google.android.gms.common.api.C143718c) r0
            r12.put(r0, r1)
        L_0x00a9:
            r0 = r16
            goto L_0x0073
        L_0x00ac:
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ r4
            java.lang.String r1 = "CompositeGoogleApiClient should not be used without any APIs that require sign-in."
            com.google.android.gms.common.internal.C143919bh.m233967j(r0, r1)
            androidx.c.g r14 = new androidx.c.g
            r14.<init>()
            androidx.c.g r4 = new androidx.c.g
            r4.<init>()
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0102
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.m r1 = (com.google.android.gms.common.api.C143841m) r1
            r16 = r0
            com.google.android.gms.common.api.l r0 = r1.f389917b
            boolean r17 = r11.containsKey(r0)
            if (r17 == 0) goto L_0x00ea
            java.lang.Object r0 = r7.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r14.put(r1, r0)
        L_0x00e7:
            r0 = r16
            goto L_0x00c8
        L_0x00ea:
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r7.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r4.put(r1, r0)
            goto L_0x00e7
        L_0x00fa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each API in the isOptionalMap must have a corresponding client in the clients map."
            r0.<init>(r1)
            throw r0
        L_0x0102:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r0 = r10.size()
            r15 = 0
        L_0x0111:
            if (r15 >= r0) goto L_0x0145
            java.lang.Object r16 = r10.get(r15)
            r19 = r0
            r0 = r16
            com.google.android.gms.common.api.internal.v r0 = (com.google.android.gms.common.api.internal.C143833v) r0
            r16 = r10
            com.google.android.gms.common.api.m r10 = r0.f389898a
            boolean r10 = r14.containsKey(r10)
            if (r10 == 0) goto L_0x012b
            r7.add(r0)
            goto L_0x0136
        L_0x012b:
            com.google.android.gms.common.api.m r10 = r0.f389898a
            boolean r10 = r4.containsKey(r10)
            if (r10 == 0) goto L_0x013d
            r1.add(r0)
        L_0x0136:
            int r15 = r15 + 1
            r0 = r19
            r10 = r16
            goto L_0x0111
        L_0x013d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each ClientCallbacks must have a corresponding API in the isOptionalMap"
            r0.<init>(r1)
            throw r0
        L_0x0145:
            com.google.android.gms.common.api.internal.z r15 = new com.google.android.gms.common.api.internal.z
            r0 = r15
            r16 = r1
            r1 = r2
            r2 = r18
            r17 = r4
            r4 = r5
            r5 = r6
            r6 = r11
            r11 = r7
            r7 = r12
            r10 = r13
            r12 = r16
            r13 = r14
            r14 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r12 = r18
            r12.f389710n = r15
            return
        L_0x0162:
            r12 = r15
            if (r2 == 0) goto L_0x018e
            if (r3 != 0) goto L_0x0186
        L_0x0167:
            com.google.android.gms.common.api.internal.bc r13 = new com.google.android.gms.common.api.internal.bc
            android.content.Context r1 = r12.f389712p
            java.util.concurrent.locks.Lock r3 = r12.f389698b
            android.os.Looper r4 = r12.f389700d
            com.google.android.gms.common.g r5 = r12.f389717u
            java.util.Map r6 = r12.f389703g
            com.google.android.gms.common.internal.s r7 = r12.f389705i
            java.util.Map r8 = r12.f389706j
            com.google.android.gms.common.api.a r9 = r12.f389707k
            java.util.ArrayList r10 = r12.f389718v
            r0 = r13
            r2 = r18
            r11 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f389710n = r13
            return
        L_0x0186:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead."
            r0.<init>(r1)
            throw r0
        L_0x018e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead."
            r0.<init>(r1)
            throw r0
        L_0x0196:
            r12 = r15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Integer r2 = r12.f389719w
            int r2 = r2.intValue()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot use sign-in mode: "
            r3.<init>(r4)
            java.lang.String r1 = m233562l(r19)
            r3.append(r1)
            java.lang.String r1 = ". Mode was already set to "
            r3.append(r1)
            java.lang.String r1 = m233562l(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            goto L_0x01c2
        L_0x01c1:
            throw r0
        L_0x01c2:
            goto L_0x01c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C143750ay.m233563p(int):void");
    }

    /* renamed from: s */
    public final void mo119167s(int i) {
        if (i == 1) {
            if (!this.f389713q) {
                this.f389713q = true;
                if (this.f389702f == null) {
                    try {
                        this.f389702f = this.f389717u.mo119356d(this.f389712p.getApplicationContext(), new C143749ax(this));
                    } catch (SecurityException unused) {
                    }
                }
                C143748aw awVar = this.f389716t;
                awVar.sendMessageDelayed(awVar.obtainMessage(1), this.f389714r);
                C143748aw awVar2 = this.f389716t;
                awVar2.sendMessageDelayed(awVar2.obtainMessage(2), this.f389715s);
            }
            i = 1;
        }
        for (BasePendingResult m : (BasePendingResult[]) this.f389709m.f389869b.toArray(new BasePendingResult[0])) {
            m.mo119110m(C143814dh.f389868a);
        }
        C143889ae aeVar = this.f389699c;
        C143919bh.m233963f(aeVar.f390071h, "onUnintentionalDisconnection must only be called on the Handler thread");
        aeVar.f390071h.removeMessages(1);
        synchronized (aeVar.f390072i) {
            aeVar.f390070g = true;
            ArrayList arrayList = new ArrayList(aeVar.f390065b);
            int i2 = aeVar.f390069f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C143849u uVar = (C143849u) it.next();
                if (!aeVar.f390068e) {
                    break;
                } else if (aeVar.f390069f.get() != i2) {
                    break;
                } else if (aeVar.f390065b.contains(uVar)) {
                    uVar.mo26992kr(i);
                }
            }
            aeVar.f390066c.clear();
            aeVar.f390070g = false;
        }
        this.f389699c.mo119396a();
        if (i == 2) {
            mo119162m();
        }
    }
}
