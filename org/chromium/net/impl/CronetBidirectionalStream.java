package org.chromium.net.impl;

import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.C72387m;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.RequestFinishedInfo;
import p000J.C0000N;

/* compiled from: PG */
public class CronetBidirectionalStream extends ExperimentalBidirectionalStream {

    /* renamed from: a */
    public final C72515cu f192665a;

    /* renamed from: b */
    public final String f192666b;

    /* renamed from: c */
    public final Object f192667c = new Object();

    /* renamed from: d */
    public boolean f192668d;

    /* renamed from: e */
    public int f192669e;

    /* renamed from: f */
    public int f192670f;

    /* renamed from: g */
    public C72513cs f192671g;

    /* renamed from: h */
    private final CronetUrlRequestContext f192672h;

    /* renamed from: i */
    private final Executor f192673i;

    /* renamed from: j */
    private final String f192674j;

    /* renamed from: k */
    private final int f192675k;

    /* renamed from: l */
    private final String[] f192676l;

    /* renamed from: m */
    private final boolean f192677m;

    /* renamed from: n */
    private final Collection f192678n;

    /* renamed from: o */
    private final boolean f192679o;

    /* renamed from: p */
    private final int f192680p;

    /* renamed from: q */
    private final boolean f192681q;

    /* renamed from: r */
    private final int f192682r;

    /* renamed from: s */
    private final long f192683s;

    /* renamed from: t */
    private CronetException f192684t;

    /* renamed from: u */
    private LinkedList f192685u;

    /* renamed from: v */
    private LinkedList f192686v;

    /* renamed from: w */
    private boolean f192687w;

    /* renamed from: x */
    private RequestFinishedInfo.Metrics f192688x;

    /* renamed from: y */
    private long f192689y;

    /* renamed from: z */
    private C72527i f192690z;

    public CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, BidirectionalStream.Callback callback, Executor executor, String str2, List list, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j) {
        int i4 = i;
        int i5 = 0;
        this.f192669e = 0;
        this.f192670f = 0;
        this.f192672h = cronetUrlRequestContext;
        this.f192674j = str;
        int i6 = 1;
        if (i4 != 0) {
            if (i4 != 1) {
                i6 = 3;
                if (i4 != 2) {
                    if (i4 == 3) {
                        i6 = 4;
                    } else if (i4 == 4) {
                        i6 = 5;
                    } else {
                        throw new IllegalArgumentException("Invalid stream priority.");
                    }
                }
            } else {
                i6 = 2;
            }
        }
        this.f192675k = i6;
        BidirectionalStream.Callback callback2 = callback;
        this.f192665a = new C72515cu(callback);
        this.f192673i = executor;
        this.f192666b = str2;
        int size = list.size();
        String[] strArr = new String[(size + size)];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i7 = i5 + 1;
            strArr[i5] = (String) entry.getKey();
            i5 = i7 + 1;
            strArr[i7] = (String) entry.getValue();
        }
        this.f192676l = strArr;
        this.f192677m = z;
        this.f192685u = new LinkedList();
        this.f192686v = new LinkedList();
        this.f192678n = collection;
        this.f192679o = z2;
        this.f192680p = i2;
        this.f192681q = z3;
        this.f192682r = i3;
        this.f192683s = j;
    }

    /* renamed from: d */
    public static boolean m107120d(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: f */
    private static ArrayList m107121f(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length >> 1);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    /* renamed from: g */
    private final void m107122g(boolean z) {
        C72387m.m107042c(CronetUrlRequestContext.f192745a, "destroyNativeStreamLocked ".concat(String.valueOf(toString())), new Object[0]);
        long j = this.f192689y;
        if (j != 0) {
            C0000N.MS2l1kNx(j, this, z);
            this.f192672h.f192748c.decrementAndGet();
            this.f192689y = 0;
        }
    }

    /* renamed from: h */
    private final void m107123h(CronetException cronetException) {
        m107124i(new C72526h(this, cronetException));
    }

    /* renamed from: i */
    private final void m107124i(Runnable runnable) {
        try {
            this.f192673i.execute(runnable);
        } catch (RejectedExecutionException e) {
            C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception posting task to executor", e);
            synchronized (this.f192667c) {
                this.f192670f = 6;
                this.f192669e = 6;
                m107122g(false);
            }
        }
    }

    /* renamed from: j */
    private final void m107125j() {
        int size = this.f192686v.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f192686v.poll();
            byteBufferArr[i] = byteBuffer;
            iArr[i] = byteBuffer.position();
            iArr2[i] = byteBuffer.limit();
        }
        this.f192670f = 9;
        this.f192668d = true;
        if (!C0000N.MwJCBTMQ(this.f192689y, this, byteBufferArr, iArr, iArr2, this.f192687w && this.f192685u.isEmpty())) {
            this.f192670f = 8;
            throw new IllegalArgumentException("Unable to call native writev.");
        }
    }

    private void onCanceled() {
        m107124i(new C72525g(this));
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        C72513cs csVar = this.f192671g;
        if (csVar != null) {
            csVar.f192954d.set(j);
        }
        if (i == 10 || i == 3) {
            m107123h(new C72508cn("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2, i3));
        } else {
            m107123h(new C72467b("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2));
        }
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.f192667c) {
            if (this.f192688x == null) {
                this.f192688x = new C72541w(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
                int i = this.f192669e;
                this.f192672h.mo64185d(new C72509co(this.f192674j, this.f192678n, this.f192688x, i == 7 ? 0 : i == 5 ? 2 : 1, this.f192671g, this.f192684t));
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.f192671g.f192954d.set(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            m107123h(new C72534p("ByteBuffer modified externally during read", (Throwable) null));
        } else if (i < 0 || (i4 = i2 + i) > i3) {
            m107123h(new C72534p("Invalid number of bytes read", (Throwable) null));
        } else {
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(i4);
            C72527i iVar = this.f192690z;
            iVar.f192976a = byteBuffer;
            iVar.f192977b = i == 0;
            m107124i(iVar);
        }
    }

    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            int i2 = i;
            this.f192671g = new C72513cs(Arrays.asList(new String[]{this.f192674j}), i2, BuildConfig.FLAVOR, m107121f(strArr), false, str, (String) null, j);
            m107124i(new C72523e(this));
        } catch (Exception unused) {
            m107123h(new C72534p("Cannot prepare ResponseInfo", (Throwable) null));
        }
    }

    private void onResponseTrailersReceived(String[] strArr) {
        m107124i(new C72524f(this, new C72512cr(m107121f(strArr))));
    }

    private void onStreamReady(boolean z) {
        m107124i(new C72521d(this, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r2 = r7.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r1 >= r2) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        r3 = r7[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r3.position() != r8[r1]) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r3.limit() == r9[r1]) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        r4 = (java.nio.ByteBuffer) r3.position(r3.limit());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r10 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r1 != (r2 - 1)) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0045, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        m107124i(new org.chromium.net.impl.C72528j(r6, r3, r2));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        m107123h(new org.chromium.net.impl.C72534p("ByteBuffer modified externally during write", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onWritevCompleted(java.nio.ByteBuffer[] r7, int[] r8, int[] r9, boolean r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f192667c
            monitor-enter(r0)
            boolean r1 = r6.mo64166e()     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x000b:
            r1 = 8
            r6.f192670f = r1     // Catch:{ all -> 0x005d }
            java.util.LinkedList r1 = r6.f192686v     // Catch:{ all -> 0x005d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005d }
            if (r1 != 0) goto L_0x001a
            r6.m107125j()     // Catch:{ all -> 0x005d }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            r0 = 0
            r1 = 0
        L_0x001d:
            int r2 = r7.length
            if (r1 >= r2) goto L_0x005c
            r3 = r7[r1]
            int r4 = r3.position()
            r5 = r8[r1]
            if (r4 != r5) goto L_0x0051
            int r4 = r3.limit()
            r5 = r9[r1]
            if (r4 == r5) goto L_0x0033
            goto L_0x0051
        L_0x0033:
            int r4 = r3.limit()
            java.nio.Buffer r4 = r3.position(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            org.chromium.net.impl.j r4 = new org.chromium.net.impl.j
            if (r10 == 0) goto L_0x0047
            int r2 = r2 + -1
            if (r1 != r2) goto L_0x0047
            r2 = 1
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            r4.<init>(r6, r3, r2)
            r6.m107124i(r4)
            int r1 = r1 + 1
            goto L_0x001d
        L_0x0051:
            org.chromium.net.impl.p r7 = new org.chromium.net.impl.p
            java.lang.String r8 = "ByteBuffer modified externally during write"
            r9 = 0
            r7.<init>(r8, r9)
            r6.m107123h(r7)
        L_0x005c:
            return
        L_0x005d:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            goto L_0x0061
        L_0x0060:
            throw r7
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    /* renamed from: a */
    public final void mo64163a(CronetException cronetException) {
        this.f192684t = cronetException;
        synchronized (this.f192667c) {
            if (!mo64166e()) {
                this.f192670f = 6;
                this.f192669e = 6;
                m107122g(false);
                try {
                    C72515cu cuVar = this.f192665a;
                    cuVar.f192961a.onFailed(this, this.f192671g, cronetException);
                } catch (Exception e) {
                    C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception notifying of failed request", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo64164b() {
        synchronized (this.f192667c) {
            if (!mo64166e()) {
                if (this.f192670f == 10) {
                    if (this.f192669e == 4) {
                        this.f192670f = 7;
                        this.f192669e = 7;
                        m107122g(false);
                        try {
                            C72515cu cuVar = this.f192665a;
                            cuVar.f192961a.onSucceeded(this, this.f192671g);
                        } catch (Exception e) {
                            C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception in onSucceeded method", e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo64165c(Exception exc) {
        C72494c cVar = new C72494c("CalledByNative method has thrown an exception", exc);
        C72387m.m107041b(CronetUrlRequestContext.f192745a, "Exception in CalledByNative method", exc);
        mo64163a(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f192667c
            monitor-enter(r0)
            boolean r1 = r2.mo64166e()     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x0019
            int r1 = r2.f192669e     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            r1 = 5
            r2.f192670f = r1     // Catch:{ all -> 0x001b }
            r2.f192669e = r1     // Catch:{ all -> 0x001b }
            r1 = 1
            r2.m107122g(r1)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.cancel():void");
    }

    /* renamed from: e */
    public final boolean mo64166e() {
        return this.f192669e != 0 && this.f192689y == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void flush() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f192667c
            monitor-enter(r0)
            boolean r1 = r4.mo64166e()     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x005c
            int r1 = r4.f192670f     // Catch:{ all -> 0x005e }
            r2 = 8
            r3 = 9
            if (r1 == r2) goto L_0x0013
            if (r1 != r3) goto L_0x005c
        L_0x0013:
            java.util.LinkedList r1 = r4.f192685u     // Catch:{ all -> 0x005e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x003d
            java.util.LinkedList r1 = r4.f192686v     // Catch:{ all -> 0x005e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x003d
            boolean r1 = r4.f192668d     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x003b
            r1 = 1
            r4.f192668d = r1     // Catch:{ all -> 0x005e }
            long r1 = r4.f192689y     // Catch:{ all -> 0x005e }
            p000J.C0000N.MGLIR7Sc(r1, r4)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r4.f192666b     // Catch:{ all -> 0x005e }
            boolean r1 = m107120d(r1)     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x003b
            r1 = 10
            r4.f192670f = r1     // Catch:{ all -> 0x005e }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x003d:
            java.util.LinkedList r1 = r4.f192685u     // Catch:{ all -> 0x005e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0051
            java.util.LinkedList r1 = r4.f192686v     // Catch:{ all -> 0x005e }
            java.util.LinkedList r2 = r4.f192685u     // Catch:{ all -> 0x005e }
            r1.addAll(r2)     // Catch:{ all -> 0x005e }
            java.util.LinkedList r1 = r4.f192685u     // Catch:{ all -> 0x005e }
            r1.clear()     // Catch:{ all -> 0x005e }
        L_0x0051:
            int r1 = r4.f192670f     // Catch:{ all -> 0x005e }
            if (r1 != r3) goto L_0x0057
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0057:
            r4.m107125j()     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.flush():void");
    }

    public final boolean isDone() {
        boolean e;
        synchronized (this.f192667c) {
            e = mo64166e();
        }
        return e;
    }

    public final void read(ByteBuffer byteBuffer) {
        synchronized (this.f192667c) {
            C72507cm.m107215b(byteBuffer);
            C72507cm.m107214a(byteBuffer);
            if (this.f192669e != 2) {
                throw new IllegalStateException("Unexpected read attempt.");
            } else if (!mo64166e()) {
                if (this.f192690z == null) {
                    this.f192690z = new C72527i(this);
                }
                this.f192669e = 3;
                if (!C0000N.Md_rPmgC(this.f192689y, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    this.f192669e = 2;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
        }
    }

    public final void start() {
        synchronized (this.f192667c) {
            if (this.f192669e == 0) {
                try {
                    this.f192689y = C0000N.MqTDYvZd(this, this.f192672h.mo64184c(), !this.f192677m, this.f192679o, this.f192680p, this.f192681q, this.f192682r, this.f192683s);
                    this.f192672h.f192748c.incrementAndGet();
                    long j = this.f192689y;
                    String str = this.f192674j;
                    int i = this.f192675k;
                    String str2 = this.f192666b;
                    int McDUim_I = C0000N.McDUim_I(j, this, str, i, str2, this.f192676l, !m107120d(str2));
                    if (McDUim_I == -1) {
                        throw new IllegalArgumentException("Invalid http method " + this.f192666b);
                    } else if (McDUim_I <= 0) {
                        this.f192670f = 1;
                        this.f192669e = 1;
                    } else {
                        int i2 = McDUim_I - 1;
                        String[] strArr = this.f192676l;
                        throw new IllegalArgumentException("Invalid header " + strArr[i2] + "=" + strArr[i2 + 1]);
                    }
                } catch (RuntimeException e) {
                    m107122g(false);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Stream is already started.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(java.nio.ByteBuffer r3, boolean r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f192667c
            monitor-enter(r0)
            org.chromium.net.impl.C72507cm.m107214a(r3)     // Catch:{ all -> 0x0037 }
            boolean r1 = r3.hasRemaining()     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0017
            if (r4 == 0) goto L_0x000f
            goto L_0x0017
        L_0x000f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "Empty buffer before end of stream."
            r3.<init>(r4)     // Catch:{ all -> 0x0037 }
            throw r3     // Catch:{ all -> 0x0037 }
        L_0x0017:
            boolean r1 = r2.f192687w     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x002f
            boolean r1 = r2.mo64166e()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0023
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0023:
            java.util.LinkedList r1 = r2.f192685u     // Catch:{ all -> 0x0037 }
            r1.add(r3)     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x002d
            r3 = 1
            r2.f192687w = r3     // Catch:{ all -> 0x0037 }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x002f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "Write after writing end of stream."
            r3.<init>(r4)     // Catch:{ all -> 0x0037 }
            throw r3     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetBidirectionalStream.write(java.nio.ByteBuffer, boolean):void");
    }
}
