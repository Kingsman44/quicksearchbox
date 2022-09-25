package org.chromium.net.impl;

import android.os.ConditionVariable;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.C72387m;
import org.chromium.base.C72389o;
import org.chromium.base.C72390p;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.p5647a.C72424h;
import org.chromium.net.p5647a.C72428l;
import p000J.C0000N;

/* compiled from: PG */
public class CronetUrlRequestContext extends C72529k {

    /* renamed from: a */
    static final String f192745a = "CronetUrlRequestContext";

    /* renamed from: h */
    private static final HashSet f192746h = new HashSet();

    /* renamed from: b */
    public final Object f192747b;

    /* renamed from: c */
    public final AtomicInteger f192748c = new AtomicInteger(0);

    /* renamed from: d */
    public long f192749d;

    /* renamed from: e */
    public Thread f192750e;

    /* renamed from: f */
    public final int f192751f = hashCode();

    /* renamed from: g */
    public final C72539u f192752g;

    /* renamed from: i */
    private final ConditionVariable f192753i = new ConditionVariable(false);

    /* renamed from: j */
    private final boolean f192754j;

    /* renamed from: k */
    private final Object f192755k = new Object();

    /* renamed from: l */
    private final Object f192756l = new Object();

    /* renamed from: m */
    private int f192757m = 0;

    /* renamed from: n */
    private int f192758n = -1;

    /* renamed from: o */
    private int f192759o = -1;

    /* renamed from: p */
    private int f192760p = -1;

    /* renamed from: q */
    private final C72390p f192761q = new C72390p();

    /* renamed from: r */
    private final C72390p f192762r = new C72390p();

    /* renamed from: s */
    private final Map f192763s = new HashMap();

    /* renamed from: t */
    private final ConditionVariable f192764t = new ConditionVariable();

    /* renamed from: u */
    private final String f192765u;

    /* renamed from: v */
    private boolean f192766v;

    /* renamed from: w */
    private boolean f192767w;

    /* renamed from: x */
    private long f192768x = -1;

    /* renamed from: y */
    private final boolean f192769y;

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0133, code lost:
        if (r3 == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0135, code lost:
        r1.f192752g = org.chromium.net.impl.C72540v.f193033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013a, code lost:
        r2 = r0.f192997a;
        m107151e();
        r1.f192752g = org.chromium.net.impl.C72540v.m107236a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.f192752g.mo58625b(r1.f192751f, new org.chromium.net.impl.C72536r(r0), new org.chromium.net.impl.C72538t(getVersionString().split("/")[1].split("@")[0]), m107151e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0171, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0172, code lost:
        org.chromium.base.C72387m.m107041b(f192745a, "Error while trying to log CronetEngine creation: ", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CronetUrlRequestContext(org.chromium.net.impl.C72533o r30) {
        /*
            r29 = this;
            r1 = r29
            r0 = r30
            r29.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f192747b = r2
            android.os.ConditionVariable r3 = new android.os.ConditionVariable
            r4 = 0
            r3.<init>(r4)
            r1.f192753i = r3
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r4)
            r1.f192748c = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r1.f192755k = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r1.f192756l = r3
            r1.f192757m = r4
            r3 = -1
            r1.f192758n = r3
            r1.f192759o = r3
            r1.f192760p = r3
            org.chromium.base.p r3 = new org.chromium.base.p
            r3.<init>()
            r1.f192761q = r3
            org.chromium.base.p r3 = new org.chromium.base.p
            r3.<init>()
            r1.f192762r = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r1.f192763s = r3
            android.os.ConditionVariable r3 = new android.os.ConditionVariable
            r3.<init>()
            r1.f192764t = r3
            r5 = -1
            r1.f192768x = r5
            int r3 = r29.hashCode()
            r1.f192751f = r3
            boolean r3 = r0.f193009m
            r1.f192754j = r3
            android.content.Context r3 = r0.f192997a
            org.chromium.net.impl.CronetLibraryLoader.m107130a(r3, r0)
            r3 = 3
            p000J.C0000N.MnO2u2DQ(r3)
            org.chromium.net.impl.l r3 = r0.f193006j
            int r3 = r3.f192987e
            r5 = 1
            if (r3 != r5) goto L_0x0088
            java.lang.String r3 = r0.f193002f
            r1.f192765u = r3
            java.util.HashSet r6 = f192746h
            monitor-enter(r6)
            boolean r3 = r6.add(r3)     // Catch:{ all -> 0x0085 }
            if (r3 == 0) goto L_0x007d
            monitor-exit(r6)     // Catch:{ all -> 0x0085 }
            goto L_0x008b
        L_0x007d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = "Disk cache storage path already in use"
            r0.<init>(r2)     // Catch:{ all -> 0x0085 }
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0085 }
            throw r0
        L_0x0088:
            r3 = 0
            r1.f192765u = r3
        L_0x008b:
            monitor-enter(r2)
            java.lang.String r6 = r0.f193001e     // Catch:{ all -> 0x019e }
            java.lang.String r7 = r0.f193002f     // Catch:{ all -> 0x019e }
            boolean r8 = r0.f193003g     // Catch:{ all -> 0x019e }
            if (r8 == 0) goto L_0x00ac
            android.content.Context r3 = r0.f192997a     // Catch:{ all -> 0x019e }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r9.<init>()     // Catch:{ all -> 0x019e }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x019e }
            r9.append(r3)     // Catch:{ all -> 0x019e }
            java.lang.String r3 = " Cronet/107.0.5284.2"
            r9.append(r3)     // Catch:{ all -> 0x019e }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x019e }
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r3 = ""
        L_0x00ae:
            r9 = r3
            boolean r10 = r0.f193004h     // Catch:{ all -> 0x019e }
            boolean r11 = r0.f193005i     // Catch:{ all -> 0x019e }
            org.chromium.net.impl.l r3 = r0.f193006j     // Catch:{ all -> 0x019e }
            boolean r12 = r3.f192988f     // Catch:{ all -> 0x019e }
            r12 = r12 ^ r5
            int r13 = r3.f192987e     // Catch:{ all -> 0x019e }
            long r14 = r0.f193007k     // Catch:{ all -> 0x019e }
            java.lang.String r3 = r0.f193008l     // Catch:{ all -> 0x019e }
            boolean r4 = r0.f193009m     // Catch:{ all -> 0x019e }
            boolean r5 = r0.f193000d     // Catch:{ all -> 0x019e }
            r1 = 10
            int r21 = r0.mo64274a(r1)     // Catch:{ all -> 0x019a }
            r17 = 0
            r16 = r3
            r19 = r4
            r20 = r5
            long r3 = p000J.C0000N.MB3ntV7V(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r19, r20, r21)     // Catch:{ all -> 0x019a }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0190
            java.util.List r1 = r0.f192998b     // Catch:{ all -> 0x019a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x019a }
        L_0x00e0:
            boolean r7 = r1.hasNext()     // Catch:{ all -> 0x019a }
            if (r7 == 0) goto L_0x00f6
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x019a }
            org.chromium.net.impl.n r7 = (org.chromium.net.impl.C72532n) r7     // Catch:{ all -> 0x019a }
            java.lang.String r8 = r7.f192993a     // Catch:{ all -> 0x019a }
            int r9 = r7.f192994b     // Catch:{ all -> 0x019a }
            int r7 = r7.f192995c     // Catch:{ all -> 0x019a }
            p000J.C0000N.MyRIv1Ij(r3, r8, r9, r7)     // Catch:{ all -> 0x019a }
            goto L_0x00e0
        L_0x00f6:
            java.util.List r1 = r0.f192999c     // Catch:{ all -> 0x019a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x019a }
        L_0x00fc:
            boolean r7 = r1.hasNext()     // Catch:{ all -> 0x019a }
            if (r7 == 0) goto L_0x0120
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x019a }
            org.chromium.net.impl.m r7 = (org.chromium.net.impl.C72531m) r7     // Catch:{ all -> 0x019a }
            java.lang.String r8 = r7.f192989a     // Catch:{ all -> 0x019a }
            byte[][] r9 = r7.f192990b     // Catch:{ all -> 0x019a }
            boolean r10 = r7.f192991c     // Catch:{ all -> 0x019a }
            java.util.Date r7 = r7.f192992d     // Catch:{ all -> 0x019a }
            long r27 = r7.getTime()     // Catch:{ all -> 0x019a }
            r22 = r3
            r24 = r8
            r25 = r9
            r26 = r10
            p000J.C0000N.Muq3ic6p(r22, r24, r25, r26, r27)     // Catch:{ all -> 0x019a }
            goto L_0x00fc
        L_0x0120:
            long r3 = p000J.C0000N.M135Cu0D(r3)     // Catch:{ all -> 0x019a }
            r1 = r29
            r1.f192749d = r3     // Catch:{ all -> 0x019e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0188
            boolean r3 = p000J.C0000N.Mey_yE9a(r3, r1)     // Catch:{ all -> 0x019e }
            r1.f192769y = r3     // Catch:{ all -> 0x019e }
            monitor-exit(r2)     // Catch:{ all -> 0x019e }
            if (r3 == 0) goto L_0x013a
            org.chromium.net.impl.u r2 = org.chromium.net.impl.C72540v.f193033a
            r1.f192752g = r2
            goto L_0x0145
        L_0x013a:
            android.content.Context r2 = r0.f192997a
            m107151e()
            org.chromium.net.impl.u r2 = org.chromium.net.impl.C72540v.m107236a(r2)
            r1.f192752g = r2
        L_0x0145:
            org.chromium.net.impl.u r2 = r1.f192752g     // Catch:{ RuntimeException -> 0x0171 }
            int r3 = r1.f192751f     // Catch:{ RuntimeException -> 0x0171 }
            org.chromium.net.impl.r r4 = new org.chromium.net.impl.r     // Catch:{ RuntimeException -> 0x0171 }
            r4.<init>(r0)     // Catch:{ RuntimeException -> 0x0171 }
            java.lang.String r0 = r29.getVersionString()     // Catch:{ RuntimeException -> 0x0171 }
            java.lang.String r5 = "/"
            java.lang.String[] r0 = r0.split(r5)     // Catch:{ RuntimeException -> 0x0171 }
            r5 = 1
            r0 = r0[r5]     // Catch:{ RuntimeException -> 0x0171 }
            java.lang.String r5 = "@"
            java.lang.String[] r0 = r0.split(r5)     // Catch:{ RuntimeException -> 0x0171 }
            r5 = 0
            r0 = r0[r5]     // Catch:{ RuntimeException -> 0x0171 }
            org.chromium.net.impl.t r5 = new org.chromium.net.impl.t     // Catch:{ RuntimeException -> 0x0171 }
            r5.<init>(r0)     // Catch:{ RuntimeException -> 0x0171 }
            int r0 = m107151e()     // Catch:{ RuntimeException -> 0x0171 }
            r2.mo58625b(r3, r4, r5, r0)     // Catch:{ RuntimeException -> 0x0171 }
            goto L_0x017f
        L_0x0171:
            r0 = move-exception
            java.lang.String r2 = f192745a
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "Error while trying to log CronetEngine creation: "
            org.chromium.base.C72387m.m107041b(r2, r0, r3)
        L_0x017f:
            org.chromium.net.impl.al r0 = new org.chromium.net.impl.al
            r0.<init>(r1)
            org.chromium.net.impl.CronetLibraryLoader.m107132c(r0)
            return
        L_0x0188:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x019e }
            java.lang.String r3 = "Context Adapter creation failed."
            r0.<init>(r3)     // Catch:{ all -> 0x019e }
            throw r0     // Catch:{ all -> 0x019e }
        L_0x0190:
            r1 = r29
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x019e }
            java.lang.String r3 = "Experimental options parsing failed."
            r0.<init>(r3)     // Catch:{ all -> 0x019e }
            throw r0     // Catch:{ all -> 0x019e }
        L_0x019a:
            r0 = move-exception
            r1 = r29
            goto L_0x019f
        L_0x019e:
            r0 = move-exception
        L_0x019f:
            monitor-exit(r2)     // Catch:{ all -> 0x019e }
            goto L_0x01a2
        L_0x01a1:
            throw r0
        L_0x01a2:
            goto L_0x01a1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequestContext.<init>(org.chromium.net.impl.o):void");
    }

    /* renamed from: e */
    static int m107151e() {
        return CronetEngine.class.getClassLoader().equals(CronetUrlRequest.class.getClassLoader()) ? 2 : 3;
    }

    /* renamed from: f */
    private final void m107152f() {
        if (!m107154h()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    /* renamed from: g */
    private static void m107153g(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            C72387m.m107041b(f192745a, "Exception posting task to executor", e);
        }
    }

    /* renamed from: h */
    private final boolean m107154h() {
        return this.f192749d != 0;
    }

    private void initNetworkThread() {
        this.f192750e = Thread.currentThread();
        this.f192753i.open();
        Thread.currentThread().setName("ChromiumNet");
    }

    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.f192755k) {
            this.f192757m = i;
        }
    }

    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.f192755k) {
            this.f192758n = i;
            this.f192759o = i2;
            this.f192760p = i3;
        }
    }

    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.f192755k) {
            C72389o oVar = new C72389o(this.f192761q);
            while (oVar.hasNext()) {
                C72517cw cwVar = (C72517cw) oVar.next();
                m107153g(cwVar.f192963a.getExecutor(), new C72453am(cwVar, i, j, i2));
            }
        }
    }

    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.f192755k) {
            C72389o oVar = new C72389o(this.f192762r);
            while (oVar.hasNext()) {
                C72518cx cxVar = (C72518cx) oVar.next();
                m107153g(cxVar.f192964a.getExecutor(), new C72454an(cxVar, i, j, i2));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ExperimentalBidirectionalStream mo64182a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j) {
        Object obj;
        long j2 = j == -1 ? this.f192768x : j;
        Object obj2 = this.f192747b;
        synchronized (obj2) {
            try {
                m107152f();
                obj = obj2;
                CronetBidirectionalStream cronetBidirectionalStream = new CronetBidirectionalStream(this, str, i, callback, executor, str2, list, z, collection, z2, i2, z3, i3, j2);
                return cronetBidirectionalStream;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.f192756l) {
            this.f192763s.put(listener, new C72519cy(listener));
        }
    }

    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (this.f192754j) {
            synchronized (this.f192755k) {
                if (this.f192761q.mo63850b()) {
                    synchronized (this.f192747b) {
                        m107152f();
                        C0000N.MpnFLFF2(this.f192749d, this, true);
                    }
                }
                this.f192761q.mo63852d(new C72517cw(networkQualityRttListener));
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (this.f192754j) {
            synchronized (this.f192755k) {
                if (this.f192762r.mo63850b()) {
                    synchronized (this.f192747b) {
                        m107152f();
                        C0000N.MnPUhNKP(this.f192749d, this, true);
                    }
                }
                this.f192762r.mo63852d(new C72518cx(networkQualityThroughputListener));
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    /* renamed from: b */
    public final C72510cp mo64183b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j) {
        Object obj;
        long j2 = j == -1 ? this.f192768x : j;
        Object obj2 = this.f192747b;
        synchronized (obj2) {
            try {
                m107152f();
                obj = obj2;
                CronetUrlRequest cronetUrlRequest = new CronetUrlRequest(this, str, i, callback, executor, collection, z, z2, z3, z4, i2, z5, i3, listener, i4, j2);
                return cronetUrlRequest;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final void bindToNetwork(long j) {
        this.f192768x = j;
    }

    /* renamed from: c */
    public final long mo64184c() {
        long j;
        synchronized (this.f192747b) {
            m107152f();
            j = this.f192749d;
        }
        return j;
    }

    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (this.f192754j) {
            synchronized (this.f192747b) {
                m107152f();
                C0000N.M6sIJDgy_ForTesting(this.f192749d, this, z, z2, z3);
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new C72428l(this);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r2 >= r0) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r3 = (org.chromium.net.impl.C72519cy) r1.get(r2);
        m107153g(r3.f192965a.getExecutor(), new org.chromium.net.impl.C72455ao(r3, r6));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r0 = r1.size();
        r2 = 0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64185d(org.chromium.net.RequestFinishedInfo r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f192756l
            monitor-enter(r0)
            java.util.Map r1 = r5.f192763s     // Catch:{ all -> 0x0038 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x000d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0038 }
            java.util.Map r2 = r5.f192763s     // Catch:{ all -> 0x0038 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0038 }
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            int r0 = r1.size()
            r2 = 0
        L_0x001e:
            if (r2 >= r0) goto L_0x0037
            java.lang.Object r3 = r1.get(r2)
            org.chromium.net.impl.cy r3 = (org.chromium.net.impl.C72519cy) r3
            org.chromium.net.impl.ao r4 = new org.chromium.net.impl.ao
            r4.<init>(r3, r6)
            org.chromium.net.RequestFinishedInfo$Listener r3 = r3.f192965a
            java.util.concurrent.Executor r3 = r3.getExecutor()
            m107153g(r3, r4)
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0037:
            return
        L_0x0038:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            goto L_0x003c
        L_0x003b:
            throw r6
        L_0x003c:
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequestContext.mo64185d(org.chromium.net.RequestFinishedInfo):void");
    }

    public final int getDownstreamThroughputKbps() {
        int i;
        if (this.f192754j) {
            synchronized (this.f192755k) {
                i = this.f192760p;
                if (i == -1) {
                    i = -1;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public final int getEffectiveConnectionType() {
        int i;
        if (this.f192754j) {
            synchronized (this.f192755k) {
                int i2 = this.f192757m;
                if (i2 != 0) {
                    i = 1;
                    if (i2 != 1) {
                        i = 2;
                        if (i2 != 2) {
                            i = 3;
                            if (i2 != 3) {
                                i = 4;
                                if (i2 != 4) {
                                    i = 5;
                                    if (i2 != 5) {
                                        throw new RuntimeException("Internal Error: Illegal EffectiveConnectionType value " + i2);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i = 0;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public final byte[] getGlobalMetricsDeltas() {
        return C0000N.M7CZ_Klr();
    }

    public final int getHttpRttMs() {
        int i;
        if (this.f192754j) {
            synchronized (this.f192755k) {
                i = this.f192758n;
                if (i == -1) {
                    i = -1;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public final int getTransportRttMs() {
        int i;
        if (this.f192754j) {
            synchronized (this.f192755k) {
                i = this.f192759o;
                if (i == -1) {
                    i = -1;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public final String getVersionString() {
        return "Cronet/".concat(C72456ap.m107161a());
    }

    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new C72440a(str, callback, executor, this);
    }

    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new C72511cq(str, callback, executor, this);
    }

    public final URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.f192756l) {
            this.f192763s.remove(listener);
        }
    }

    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (this.f192754j) {
            synchronized (this.f192755k) {
                if (this.f192761q.mo63851c(new C72517cw(networkQualityRttListener)) && this.f192761q.mo63850b()) {
                    synchronized (this.f192747b) {
                        m107152f();
                        C0000N.MpnFLFF2(this.f192749d, this, false);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (this.f192754j) {
            synchronized (this.f192755k) {
                if (this.f192762r.mo63851c(new C72518cx(networkQualityThroughputListener)) && this.f192762r.mo63850b()) {
                    synchronized (this.f192747b) {
                        m107152f();
                        C0000N.MnPUhNKP(this.f192749d, this, false);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    public final void shutdown() {
        if (this.f192765u != null) {
            HashSet hashSet = f192746h;
            synchronized (hashSet) {
                hashSet.remove(this.f192765u);
            }
        }
        synchronized (this.f192747b) {
            m107152f();
            if (this.f192748c.get() != 0) {
                throw new IllegalStateException("Cannot shutdown with active requests.");
            } else if (Thread.currentThread() == this.f192750e) {
                throw new IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.f192753i.block();
        stopNetLog();
        synchronized (this.f192747b) {
            if (m107154h()) {
                C0000N.MeBvNXm5(this.f192749d, this);
                this.f192749d = 0;
            }
        }
    }

    public final void startNetLogToDisk(String str, boolean z, int i) {
        synchronized (this.f192747b) {
            m107152f();
            if (!this.f192766v) {
                C0000N.MTULt02u(this.f192749d, this, str, z, i);
                this.f192766v = true;
            }
        }
    }

    public final void startNetLogToFile(String str, boolean z) {
        synchronized (this.f192747b) {
            m107152f();
            if (this.f192766v) {
                return;
            }
            if (C0000N.MgwJQAH1(this.f192749d, this, str, z)) {
                this.f192766v = true;
                return;
            }
            throw new RuntimeException("Unable to start NetLog");
        }
    }

    public final void stopNetLog() {
        synchronized (this.f192747b) {
            m107152f();
            if (this.f192766v) {
                if (!this.f192767w) {
                    C0000N.MKFm_qQ7(this.f192749d, this);
                    this.f192767w = true;
                    this.f192764t.block();
                    this.f192764t.close();
                    synchronized (this.f192747b) {
                        this.f192767w = false;
                        this.f192766v = false;
                    }
                }
            }
        }
    }

    public void stopNetLogCompleted() {
        this.f192764t.open();
    }

    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() == Proxy.Type.DIRECT) {
            String protocol = url.getProtocol();
            if ("http".equals(protocol) || "https".equals(protocol)) {
                return new C72424h(url, this);
            }
            throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
        }
        throw new UnsupportedOperationException();
    }
}
