package com.bumptech.glide.load.p293a;

import android.util.Log;
import androidx.core.p097i.C1971f;
import com.bumptech.glide.C5636l;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.data.C5930e;
import com.bumptech.glide.p291h.C5625l;
import com.bumptech.glide.p291h.p292a.C5610f;
import com.bumptech.glide.p291h.p292a.C5613i;
import com.bumptech.glide.p291h.p292a.C5614j;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.r */
/* compiled from: PG */
public final class C5725r implements Runnable, Comparable, C5718k, C5610f {

    /* renamed from: A */
    private C5637a f17246A;

    /* renamed from: B */
    private C5930e f17247B;

    /* renamed from: C */
    private volatile boolean f17248C;

    /* renamed from: D */
    private boolean f17249D;

    /* renamed from: E */
    private int f17250E;

    /* renamed from: a */
    public final C5720m f17251a = new C5720m();

    /* renamed from: b */
    public final C5722o f17252b = new C5722o();

    /* renamed from: c */
    public final C5723p f17253c = new C5723p();

    /* renamed from: d */
    public C5636l f17254d;

    /* renamed from: e */
    public C5955n f17255e;

    /* renamed from: f */
    public C5997p f17256f;

    /* renamed from: g */
    public C5669al f17257g;

    /* renamed from: h */
    public int f17258h;

    /* renamed from: i */
    public int f17259i;

    /* renamed from: j */
    public C5731x f17260j;

    /* renamed from: k */
    public C5960s f17261k;

    /* renamed from: l */
    public C5721n f17262l;

    /* renamed from: m */
    public int f17263m;

    /* renamed from: n */
    public boolean f17264n;

    /* renamed from: o */
    public C5955n f17265o;

    /* renamed from: p */
    public volatile C5719l f17266p;

    /* renamed from: q */
    public volatile boolean f17267q;

    /* renamed from: r */
    public int f17268r;

    /* renamed from: s */
    public final C5660ac f17269s;

    /* renamed from: t */
    private final List f17270t = new ArrayList();

    /* renamed from: u */
    private final C5614j f17271u = new C5613i();

    /* renamed from: v */
    private final C1971f f17272v;

    /* renamed from: w */
    private long f17273w;

    /* renamed from: x */
    private Thread f17274x;

    /* renamed from: y */
    private C5955n f17275y;

    /* renamed from: z */
    private Object f17276z;

    public C5725r(C5660ac acVar, C1971f fVar) {
        this.f17269s = acVar;
        this.f17272v = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.bumptech.glide.load.a.au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.bumptech.glide.load.a.au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.bumptech.glide.load.a.au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.bumptech.glide.load.a.au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v20, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: com.bumptech.glide.load.a.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: com.bumptech.glide.load.a.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v24, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: com.bumptech.glide.load.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v12, resolved type: com.bumptech.glide.load.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v13, resolved type: com.bumptech.glide.load.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v14, resolved type: com.bumptech.glide.load.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v41, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v42, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v45, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v46, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v48, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v49, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v16, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v19, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v21, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: com.bumptech.glide.load.a.au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: com.bumptech.glide.load.a.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: com.bumptech.glide.load.a.ax} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v54, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v55, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v56, resolved type: com.bumptech.glide.load.data.e} */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fe, code lost:
        r18 = r18;
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0244, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0245, code lost:
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0246, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0247, code lost:
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0249, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x024a, code lost:
        r18 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x024c, code lost:
        r34 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0250, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0251, code lost:
        r18 = r5;
        r33 = r6;
        r19 = r7;
        r34 = r11;
        r16 = r13;
        r17 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0115, code lost:
        r18 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011d, code lost:
        r18 = r5;
        r16 = r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0244 A[Catch:{ all -> 0x025e, ap -> 0x0272 }, ExcHandler: all (th java.lang.Throwable), PHI: r18 
      PHI: (r18v20 com.bumptech.glide.load.data.e) = (r18v34 int), (r18v36 int), (r18v38 int), (r18v41 com.bumptech.glide.load.data.e), (r18v45 com.bumptech.glide.load.data.e), (r18v48 com.bumptech.glide.load.data.e), (r18v55 com.bumptech.glide.load.data.e) binds: [B:40:0x00fb, B:43:0x0103, B:46:0x0107, B:74:0x0180, B:101:0x01e3, B:102:?, B:49:0x010b] A[DONT_GENERATE, DONT_INLINE], Splitter:B:49:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0249 A[Catch:{ all -> 0x025e, ap -> 0x0272 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:37:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x028a A[LOOP:0: B:30:0x00bf->B:136:0x028a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a7 A[SYNTHETIC, Splitter:B:139:0x02a7] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02da A[SYNTHETIC, Splitter:B:148:0x02da] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079 A[Catch:{ all -> 0x0302 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x02a5 A[EDGE_INSN: B:249:0x02a5->B:138:0x02a5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x029e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1 A[Catch:{ all -> 0x02e9 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14821h() {
        /*
            r35 = this;
            r1 = r35
            java.lang.String r0 = "DecodeJob"
            r2 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r2)
            if (r0 == 0) goto L_0x0042
            long r3 = r1.f17273w
            java.lang.Object r0 = r1.f17276z
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.bumptech.glide.load.n r5 = r1.f17265o
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.bumptech.glide.load.data.e r6 = r1.f17247B
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "data: "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = ", cache key: "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = ", fetcher: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = "Retrieved data"
            java.lang.String r5 = r7.toString()
            r1.m14822i(r0, r3, r5)
        L_0x0042:
            com.bumptech.glide.load.data.e r5 = r1.f17247B     // Catch:{ ap -> 0x0309 }
            java.lang.Object r0 = r1.f17276z     // Catch:{ ap -> 0x0309 }
            com.bumptech.glide.load.a r6 = r1.f17246A     // Catch:{ ap -> 0x0309 }
            if (r0 != 0) goto L_0x0051
            r5.mo11924d()     // Catch:{ ap -> 0x0309 }
            r2 = 0
        L_0x004e:
            r4 = 0
            goto L_0x0318
        L_0x0051:
            long r7 = com.bumptech.glide.p291h.C5625l.m14593b()     // Catch:{ all -> 0x0302 }
            com.bumptech.glide.load.a.m r9 = r1.f17251a     // Catch:{ all -> 0x0302 }
            java.lang.Class r10 = r0.getClass()     // Catch:{ all -> 0x0302 }
            com.bumptech.glide.load.a.as r9 = r9.mo12227b(r10)     // Catch:{ all -> 0x0302 }
            com.bumptech.glide.load.s r10 = r1.f17261k     // Catch:{ all -> 0x0302 }
            com.bumptech.glide.load.a r11 = com.bumptech.glide.load.C5637a.RESOURCE_DISK_CACHE     // Catch:{ all -> 0x0302 }
            if (r6 == r11) goto L_0x006e
            com.bumptech.glide.load.a.m r11 = r1.f17251a     // Catch:{ all -> 0x0302 }
            boolean r11 = r11.f17238q     // Catch:{ all -> 0x0302 }
            if (r11 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r11 = 0
            goto L_0x006f
        L_0x006e:
            r11 = 1
        L_0x006f:
            com.bumptech.glide.load.r r13 = com.bumptech.glide.load.p299c.p300a.C5876y.f17480d     // Catch:{ all -> 0x0302 }
            java.lang.Object r13 = r10.mo12401b(r13)     // Catch:{ all -> 0x0302 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x0302 }
            if (r13 == 0) goto L_0x0083
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x0302 }
            if (r13 == 0) goto L_0x0098
            if (r11 == 0) goto L_0x0082
            goto L_0x0098
        L_0x0082:
            r11 = 0
        L_0x0083:
            com.bumptech.glide.load.s r10 = new com.bumptech.glide.load.s     // Catch:{ all -> 0x0302 }
            r10.<init>()     // Catch:{ all -> 0x0302 }
            com.bumptech.glide.load.s r13 = r1.f17261k     // Catch:{ all -> 0x0302 }
            r10.mo12402c(r13)     // Catch:{ all -> 0x0302 }
            com.bumptech.glide.load.r r13 = com.bumptech.glide.load.p299c.p300a.C5876y.f17480d     // Catch:{ all -> 0x0302 }
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0302 }
            androidx.c.g r14 = r10.f17620b     // Catch:{ all -> 0x0302 }
            r14.put(r13, r11)     // Catch:{ all -> 0x0302 }
        L_0x0098:
            com.bumptech.glide.l r11 = r1.f17254d     // Catch:{ all -> 0x0302 }
            com.bumptech.glide.v r11 = r11.mo12092a()     // Catch:{ all -> 0x0302 }
            com.bumptech.glide.load.data.j r11 = r11.f17684e     // Catch:{ all -> 0x0302 }
            com.bumptech.glide.load.data.g r11 = r11.mo12387a(r0)     // Catch:{ all -> 0x0302 }
            int r13 = r1.f17258h     // Catch:{ all -> 0x02f7 }
            int r14 = r1.f17259i     // Catch:{ all -> 0x02f7 }
            androidx.core.i.f r0 = r9.f17121a     // Catch:{ all -> 0x02f7 }
            java.lang.Object r0 = r0.mo5126a()     // Catch:{ all -> 0x02f7 }
            r15 = r0
            java.util.List r15 = (java.util.List) r15     // Catch:{ all -> 0x02f7 }
            java.lang.String r0 = "Argument must not be null"
            com.bumptech.glide.p291h.C5630q.m14607d(r15, r0)     // Catch:{ all -> 0x02f7 }
            java.util.List r0 = r9.f17122b     // Catch:{ all -> 0x02e9 }
            int r12 = r0.size()     // Catch:{ all -> 0x02e9 }
            r3 = 0
            r21 = 0
        L_0x00bf:
            if (r3 >= r12) goto L_0x029e
            java.util.List r0 = r9.f17122b     // Catch:{ all -> 0x02e9 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x02e9 }
            r2 = r0
            com.bumptech.glide.load.a.s r2 = (com.bumptech.glide.load.p293a.C5726s) r2     // Catch:{ all -> 0x02e9 }
            androidx.core.i.f r0 = r2.f17278b     // Catch:{ ap -> 0x0274 }
            java.lang.Object r0 = r0.mo5126a()     // Catch:{ ap -> 0x0274 }
            r4 = r0
            java.util.List r4 = (java.util.List) r4     // Catch:{ ap -> 0x0274 }
            java.lang.String r0 = "Argument must not be null"
            com.bumptech.glide.p291h.C5630q.m14607d(r4, r0)     // Catch:{ ap -> 0x0274 }
            r23 = r12
            r12 = r15
            r15 = r2
            r16 = r11
            r17 = r13
            r18 = r14
            r19 = r10
            r20 = r4
            com.bumptech.glide.load.a.av r0 = r15.mo12242a(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x025e }
            androidx.core.i.f r15 = r2.f17278b     // Catch:{ ap -> 0x0250, all -> 0x0249 }
            r15.mo5127b(r4)     // Catch:{ ap -> 0x0250, all -> 0x0249 }
            java.lang.Object r4 = r0.mo12160c()     // Catch:{ ap -> 0x0250, all -> 0x0249 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ ap -> 0x0250, all -> 0x0249 }
            com.bumptech.glide.load.a r15 = com.bumptech.glide.load.C5637a.RESOURCE_DISK_CACHE     // Catch:{ ap -> 0x0250, all -> 0x0249 }
            if (r6 == r15) goto L_0x012b
            com.bumptech.glide.load.a.m r15 = r1.f17251a     // Catch:{ ap -> 0x011c, all -> 0x0249 }
            com.bumptech.glide.load.w r15 = r15.mo12226a(r4)     // Catch:{ ap -> 0x011c, all -> 0x0249 }
            r16 = r13
            com.bumptech.glide.l r13 = r1.f17254d     // Catch:{ ap -> 0x0118, all -> 0x0249 }
            r17 = r14
            int r14 = r1.f17258h     // Catch:{ ap -> 0x0114, all -> 0x0249 }
            r18 = r5
            int r5 = r1.f17259i     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.load.a.av r5 = r15.mo12295b(r13, r0, r14, r5)     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            r30 = r15
            goto L_0x0134
        L_0x0114:
            r0 = move-exception
            r18 = r5
            goto L_0x0123
        L_0x0118:
            r0 = move-exception
            r18 = r5
            goto L_0x0121
        L_0x011c:
            r0 = move-exception
            r18 = r5
            r16 = r13
        L_0x0121:
            r17 = r14
        L_0x0123:
            r33 = r6
            r19 = r7
        L_0x0127:
            r34 = r11
            goto L_0x0284
        L_0x012b:
            r18 = r5
            r16 = r13
            r17 = r14
            r5 = r0
            r30 = 0
        L_0x0134:
            boolean r13 = r0.equals(r5)     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            if (r13 != 0) goto L_0x013d
            r0.mo12162e()     // Catch:{ ap -> 0x0246, all -> 0x0244 }
        L_0x013d:
            com.bumptech.glide.load.a.m r0 = r1.f17251a     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.l r0 = r0.f17224c     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.v r0 = r0.mo12092a()     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.e.i r0 = r0.f17683d     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            java.lang.Class r13 = r5.mo12159b()     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.load.v r0 = r0.mo11946a(r13)     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            if (r0 == 0) goto L_0x0174
            com.bumptech.glide.load.a.m r0 = r1.f17251a     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.l r0 = r0.f17224c     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.v r0 = r0.mo12092a()     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.e.i r0 = r0.f17683d     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            java.lang.Class r13 = r5.mo12159b()     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.load.v r0 = r0.mo11946a(r13)     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            if (r0 == 0) goto L_0x016a
            int r13 = r0.mo12325b()     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            goto L_0x0176
        L_0x016a:
            com.bumptech.glide.t r0 = new com.bumptech.glide.t     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            java.lang.Class r2 = r5.mo12159b()     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            r0.<init>(r2)     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            throw r0     // Catch:{ ap -> 0x0246, all -> 0x0244 }
        L_0x0174:
            r13 = 3
            r0 = 0
        L_0x0176:
            com.bumptech.glide.load.a.m r14 = r1.f17251a     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            com.bumptech.glide.load.n r15 = r1.f17265o     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            java.util.List r14 = r14.mo12229d()     // Catch:{ ap -> 0x0246, all -> 0x0244 }
            r19 = r7
            int r7 = r14.size()     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            r8 = 0
        L_0x0185:
            if (r8 >= r7) goto L_0x01a2
            java.lang.Object r24 = r14.get(r8)     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            r25 = r7
            r7 = r24
            com.bumptech.glide.load.b.ao r7 = (com.bumptech.glide.load.p297b.C5763ao) r7     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            com.bumptech.glide.load.n r7 = r7.f17346a     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            boolean r7 = r7.equals(r15)     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            if (r7 == 0) goto L_0x019d
            r7 = 1
            r22 = 1
            goto L_0x01a5
        L_0x019d:
            int r8 = r8 + 1
            r7 = r25
            goto L_0x0185
        L_0x01a2:
            r7 = 1
            r22 = 0
        L_0x01a5:
            r8 = r22 ^ 1
            com.bumptech.glide.load.a.x r7 = r1.f17260j     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            boolean r7 = r7.mo12247d(r8, r6, r13)     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            if (r7 == 0) goto L_0x0232
            if (r0 == 0) goto L_0x0220
            int r7 = r13 + -1
            if (r13 == 0) goto L_0x021a
            if (r7 == 0) goto L_0x0200
            r8 = 1
            if (r7 == r8) goto L_0x01d3
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            if (r13 == r8) goto L_0x01c7
            r2 = 2
            if (r13 == r2) goto L_0x01c4
            java.lang.String r2 = "NONE"
            goto L_0x01c9
        L_0x01c4:
            java.lang.String r2 = "TRANSFORMED"
            goto L_0x01c9
        L_0x01c7:
            java.lang.String r2 = "SOURCE"
        L_0x01c9:
            java.lang.String r4 = "Unknown strategy: "
            java.lang.String r2 = r4.concat(r2)     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            r0.<init>(r2)     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            throw r0     // Catch:{ ap -> 0x023f, all -> 0x0244 }
        L_0x01d3:
            com.bumptech.glide.load.a.ax r7 = new com.bumptech.glide.load.a.ax     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            com.bumptech.glide.load.a.m r8 = r1.f17251a     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            com.bumptech.glide.l r8 = r8.f17224c     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            com.bumptech.glide.load.a.a.b r8 = r8.f16993b     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            com.bumptech.glide.load.n r13 = r1.f17265o     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            com.bumptech.glide.load.n r14 = r1.f17255e     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            int r15 = r1.f17258h     // Catch:{ ap -> 0x023f, all -> 0x0244 }
            r33 = r6
            int r6 = r1.f17259i     // Catch:{ ap -> 0x01fd, all -> 0x0244 }
            r34 = r11
            com.bumptech.glide.load.s r11 = r1.f17261k     // Catch:{ ap -> 0x0272 }
            r24 = r7
            r25 = r8
            r26 = r13
            r27 = r14
            r28 = r15
            r29 = r6
            r31 = r4
            r32 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ ap -> 0x0272 }
            goto L_0x020d
        L_0x01fd:
            r0 = move-exception
            goto L_0x0127
        L_0x0200:
            r33 = r6
            r34 = r11
            com.bumptech.glide.load.a.i r7 = new com.bumptech.glide.load.a.i     // Catch:{ ap -> 0x0272 }
            com.bumptech.glide.load.n r4 = r1.f17265o     // Catch:{ ap -> 0x0272 }
            com.bumptech.glide.load.n r6 = r1.f17255e     // Catch:{ ap -> 0x0272 }
            r7.<init>(r4, r6)     // Catch:{ ap -> 0x0272 }
        L_0x020d:
            com.bumptech.glide.load.a.au r5 = com.bumptech.glide.load.p293a.C5678au.m14739d(r5)     // Catch:{ ap -> 0x0272 }
            com.bumptech.glide.load.a.o r4 = r1.f17252b     // Catch:{ ap -> 0x0272 }
            r4.f17240a = r7     // Catch:{ ap -> 0x0272 }
            r4.f17241b = r0     // Catch:{ ap -> 0x0272 }
            r4.f17242c = r5     // Catch:{ ap -> 0x0272 }
            goto L_0x0236
        L_0x021a:
            r33 = r6
            r34 = r11
            r2 = 0
            throw r2     // Catch:{ ap -> 0x0272 }
        L_0x0220:
            r33 = r6
            r34 = r11
            com.bumptech.glide.t r0 = new com.bumptech.glide.t     // Catch:{ ap -> 0x0272 }
            java.lang.Object r2 = r5.mo12160c()     // Catch:{ ap -> 0x0272 }
            java.lang.Class r2 = r2.getClass()     // Catch:{ ap -> 0x0272 }
            r0.<init>(r2)     // Catch:{ ap -> 0x0272 }
            throw r0     // Catch:{ ap -> 0x0272 }
        L_0x0232:
            r33 = r6
            r34 = r11
        L_0x0236:
            com.bumptech.glide.load.c.f.e r0 = r2.f17277a     // Catch:{ ap -> 0x0272 }
            com.bumptech.glide.load.a.av r0 = r0.mo12371a(r5, r10)     // Catch:{ ap -> 0x0272 }
            r21 = r0
            goto L_0x0287
        L_0x023f:
            r0 = move-exception
            r33 = r6
            goto L_0x0127
        L_0x0244:
            r0 = move-exception
            goto L_0x024c
        L_0x0246:
            r0 = move-exception
            goto L_0x0123
        L_0x0249:
            r0 = move-exception
            r18 = r5
        L_0x024c:
            r34 = r11
            goto L_0x02ef
        L_0x0250:
            r0 = move-exception
            r18 = r5
            r33 = r6
            r19 = r7
            r34 = r11
            r16 = r13
            r17 = r14
            goto L_0x0284
        L_0x025e:
            r0 = move-exception
            r18 = r5
            r33 = r6
            r19 = r7
            r34 = r11
            r16 = r13
            r17 = r14
            r5 = r0
            androidx.core.i.f r0 = r2.f17278b     // Catch:{ ap -> 0x0272 }
            r0.mo5127b(r4)     // Catch:{ ap -> 0x0272 }
            throw r5     // Catch:{ ap -> 0x0272 }
        L_0x0272:
            r0 = move-exception
            goto L_0x0284
        L_0x0274:
            r0 = move-exception
            r18 = r5
            r33 = r6
            r19 = r7
            r34 = r11
            r23 = r12
            r16 = r13
            r17 = r14
            r12 = r15
        L_0x0284:
            r12.add(r0)     // Catch:{ all -> 0x02e7 }
        L_0x0287:
            if (r21 == 0) goto L_0x028a
            goto L_0x02a5
        L_0x028a:
            int r3 = r3 + 1
            r15 = r12
            r13 = r16
            r14 = r17
            r5 = r18
            r7 = r19
            r12 = r23
            r6 = r33
            r11 = r34
            r2 = 2
            goto L_0x00bf
        L_0x029e:
            r18 = r5
            r19 = r7
            r34 = r11
            r12 = r15
        L_0x02a5:
            if (r21 == 0) goto L_0x02da
            androidx.core.i.f r0 = r9.f17121a     // Catch:{ all -> 0x02f5 }
            r0.mo5127b(r12)     // Catch:{ all -> 0x02f5 }
            r34.mo12339b()     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = "DecodeJob"
            r2 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0300 }
            if (r0 == 0) goto L_0x02d3
            java.lang.String r0 = r21.toString()     // Catch:{ all -> 0x0300 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0300 }
            r2.<init>()     // Catch:{ all -> 0x0300 }
            java.lang.String r3 = "Decoded result "
            r2.append(r3)     // Catch:{ all -> 0x0300 }
            r2.append(r0)     // Catch:{ all -> 0x0300 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0300 }
            r2 = r19
            r4 = 0
            r1.m14822i(r0, r2, r4)     // Catch:{ all -> 0x0300 }
        L_0x02d3:
            r18.mo11924d()     // Catch:{ ap -> 0x0309 }
            r2 = r21
            goto L_0x004e
        L_0x02da:
            com.bumptech.glide.load.a.ap r0 = new com.bumptech.glide.load.a.ap     // Catch:{ all -> 0x02e7 }
            java.lang.String r2 = r9.f17123c     // Catch:{ all -> 0x02e7 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x02e7 }
            r3.<init>(r12)     // Catch:{ all -> 0x02e7 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x02e7 }
            throw r0     // Catch:{ all -> 0x02e7 }
        L_0x02e7:
            r0 = move-exception
            goto L_0x02ef
        L_0x02e9:
            r0 = move-exception
            r18 = r5
            r34 = r11
            r12 = r15
        L_0x02ef:
            androidx.core.i.f r2 = r9.f17121a     // Catch:{ all -> 0x02f5 }
            r2.mo5127b(r12)     // Catch:{ all -> 0x02f5 }
            throw r0     // Catch:{ all -> 0x02f5 }
        L_0x02f5:
            r0 = move-exception
            goto L_0x02fc
        L_0x02f7:
            r0 = move-exception
            r18 = r5
            r34 = r11
        L_0x02fc:
            r34.mo12339b()     // Catch:{ all -> 0x0300 }
            throw r0     // Catch:{ all -> 0x0300 }
        L_0x0300:
            r0 = move-exception
            goto L_0x0305
        L_0x0302:
            r0 = move-exception
            r18 = r5
        L_0x0305:
            r18.mo11924d()     // Catch:{ ap -> 0x0309 }
            throw r0     // Catch:{ ap -> 0x0309 }
        L_0x0309:
            r0 = move-exception
            com.bumptech.glide.load.n r2 = r1.f17275y
            com.bumptech.glide.load.a r3 = r1.f17246A
            r4 = 0
            r0.mo12170c(r2, r3, r4)
            java.util.List r2 = r1.f17270t
            r2.add(r0)
            r2 = r4
        L_0x0318:
            if (r2 == 0) goto L_0x044a
            com.bumptech.glide.load.a r0 = r1.f17246A
            boolean r3 = r2 instanceof com.bumptech.glide.load.p293a.C5674aq     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0326
            r3 = r2
            com.bumptech.glide.load.a.aq r3 = (com.bumptech.glide.load.p293a.C5674aq) r3     // Catch:{ all -> 0x0448 }
            r3.mo12176d()     // Catch:{ all -> 0x0448 }
        L_0x0326:
            com.bumptech.glide.load.a.o r3 = r1.f17252b     // Catch:{ all -> 0x0448 }
            boolean r3 = r3.mo12232a()     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0334
            com.bumptech.glide.load.a.au r3 = com.bumptech.glide.load.p293a.C5678au.m14739d(r2)     // Catch:{ all -> 0x0448 }
            r2 = r3
            goto L_0x0335
        L_0x0334:
            r3 = r4
        L_0x0335:
            r35.m14825l()     // Catch:{ all -> 0x0448 }
            com.bumptech.glide.load.a.n r4 = r1.f17262l     // Catch:{ all -> 0x0448 }
            monitor-enter(r4)     // Catch:{ all -> 0x0448 }
            r5 = r4
            com.bumptech.glide.load.a.aj r5 = (com.bumptech.glide.load.p293a.C5667aj) r5     // Catch:{ all -> 0x0445 }
            r5.f17082h = r2     // Catch:{ all -> 0x0445 }
            r2 = r4
            com.bumptech.glide.load.a.aj r2 = (com.bumptech.glide.load.p293a.C5667aj) r2     // Catch:{ all -> 0x0445 }
            r2.f17083i = r0     // Catch:{ all -> 0x0445 }
            monitor-exit(r4)     // Catch:{ all -> 0x0445 }
            monitor-enter(r4)     // Catch:{ all -> 0x0448 }
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.h.a.j r0 = r0.f17076b     // Catch:{ all -> 0x0442 }
            r0.mo12057b()     // Catch:{ all -> 0x0442 }
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            boolean r0 = r0.f17088n     // Catch:{ all -> 0x0442 }
            if (r0 == 0) goto L_0x0367
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.a.av r0 = r0.f17082h     // Catch:{ all -> 0x0442 }
            r0.mo12162e()     // Catch:{ all -> 0x0442 }
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            r0.mo12153f()     // Catch:{ all -> 0x0442 }
            monitor-exit(r4)     // Catch:{ all -> 0x0442 }
            goto L_0x03ec
        L_0x0367:
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.a.ai r0 = r0.f17075a     // Catch:{ all -> 0x0442 }
            boolean r0 = r0.mo12147e()     // Catch:{ all -> 0x0442 }
            if (r0 != 0) goto L_0x043a
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            boolean r0 = r0.f17084j     // Catch:{ all -> 0x0442 }
            if (r0 != 0) goto L_0x0432
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.a.av r0 = r0.f17082h     // Catch:{ all -> 0x0442 }
            r2 = r4
            com.bumptech.glide.load.a.aj r2 = (com.bumptech.glide.load.p293a.C5667aj) r2     // Catch:{ all -> 0x0442 }
            boolean r2 = r2.f17080f     // Catch:{ all -> 0x0442 }
            r5 = r4
            com.bumptech.glide.load.a.aj r5 = (com.bumptech.glide.load.p293a.C5667aj) r5     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.n r5 = r5.f17079e     // Catch:{ all -> 0x0442 }
            r6 = r4
            com.bumptech.glide.load.a.aj r6 = (com.bumptech.glide.load.p293a.C5667aj) r6     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.a.am r6 = r6.f17077c     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.a.an r7 = new com.bumptech.glide.load.a.an     // Catch:{ all -> 0x0442 }
            r7.<init>(r0, r2, r5, r6)     // Catch:{ all -> 0x0442 }
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            r0.f17087m = r7     // Catch:{ all -> 0x0442 }
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            r2 = 1
            r0.f17084j = r2     // Catch:{ all -> 0x0442 }
            r0 = r4
            com.bumptech.glide.load.a.aj r0 = (com.bumptech.glide.load.p293a.C5667aj) r0     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.a.ai r0 = r0.f17075a     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.a.ai r0 = r0.mo12145c()     // Catch:{ all -> 0x0442 }
            int r5 = r0.mo12144a()     // Catch:{ all -> 0x0442 }
            int r5 = r5 + r2
            r2 = r4
            com.bumptech.glide.load.a.aj r2 = (com.bumptech.glide.load.p293a.C5667aj) r2     // Catch:{ all -> 0x0442 }
            r2.mo12152e(r5)     // Catch:{ all -> 0x0442 }
            r2 = r4
            com.bumptech.glide.load.a.aj r2 = (com.bumptech.glide.load.p293a.C5667aj) r2     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.n r2 = r2.f17079e     // Catch:{ all -> 0x0442 }
            r5 = r4
            com.bumptech.glide.load.a.aj r5 = (com.bumptech.glide.load.p293a.C5667aj) r5     // Catch:{ all -> 0x0442 }
            com.bumptech.glide.load.a.an r5 = r5.f17087m     // Catch:{ all -> 0x0442 }
            monitor-exit(r4)     // Catch:{ all -> 0x0442 }
            r6 = r4
            com.bumptech.glide.load.a.aj r6 = (com.bumptech.glide.load.p293a.C5667aj) r6     // Catch:{ all -> 0x0448 }
            com.bumptech.glide.load.a.ak r6 = r6.f17078d     // Catch:{ all -> 0x0448 }
            r7 = r4
            com.bumptech.glide.load.a.aj r7 = (com.bumptech.glide.load.p293a.C5667aj) r7     // Catch:{ all -> 0x0448 }
            r6.mo12139c(r7, r2, r5)     // Catch:{ all -> 0x0448 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0448 }
        L_0x03cb:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0448 }
            if (r2 == 0) goto L_0x03e7
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0448 }
            com.bumptech.glide.load.a.ah r2 = (com.bumptech.glide.load.p293a.C5665ah) r2     // Catch:{ all -> 0x0448 }
            java.util.concurrent.Executor r5 = r2.f17073b     // Catch:{ all -> 0x0448 }
            com.bumptech.glide.load.a.ag r6 = new com.bumptech.glide.load.a.ag     // Catch:{ all -> 0x0448 }
            com.bumptech.glide.f.k r2 = r2.f17072a     // Catch:{ all -> 0x0448 }
            r7 = r4
            com.bumptech.glide.load.a.aj r7 = (com.bumptech.glide.load.p293a.C5667aj) r7     // Catch:{ all -> 0x0448 }
            r6.<init>(r7, r2)     // Catch:{ all -> 0x0448 }
            r5.execute(r6)     // Catch:{ all -> 0x0448 }
            goto L_0x03cb
        L_0x03e7:
            com.bumptech.glide.load.a.aj r4 = (com.bumptech.glide.load.p293a.C5667aj) r4     // Catch:{ all -> 0x0448 }
            r4.mo12151d()     // Catch:{ all -> 0x0448 }
        L_0x03ec:
            r0 = 5
            r1.f17250E = r0     // Catch:{ all -> 0x0448 }
            com.bumptech.glide.load.a.o r2 = r1.f17252b     // Catch:{ all -> 0x042b }
            boolean r0 = r2.mo12232a()     // Catch:{ all -> 0x042b }
            if (r0 == 0) goto L_0x041a
            com.bumptech.glide.load.a.ac r0 = r1.f17269s     // Catch:{ all -> 0x042b }
            com.bumptech.glide.load.s r4 = r1.f17261k     // Catch:{ all -> 0x042b }
            com.bumptech.glide.load.a.b.b r0 = r0.mo12137a()     // Catch:{ all -> 0x0413 }
            com.bumptech.glide.load.n r5 = r2.f17240a     // Catch:{ all -> 0x0413 }
            com.bumptech.glide.load.a.j r6 = new com.bumptech.glide.load.a.j     // Catch:{ all -> 0x0413 }
            com.bumptech.glide.load.v r7 = r2.f17241b     // Catch:{ all -> 0x0413 }
            com.bumptech.glide.load.a.au r8 = r2.f17242c     // Catch:{ all -> 0x0413 }
            r6.<init>(r7, r8, r4)     // Catch:{ all -> 0x0413 }
            r0.mo12193d(r5, r6)     // Catch:{ all -> 0x0413 }
            com.bumptech.glide.load.a.au r0 = r2.f17242c     // Catch:{ all -> 0x042b }
            r0.mo12180f()     // Catch:{ all -> 0x042b }
            goto L_0x041a
        L_0x0413:
            r0 = move-exception
            com.bumptech.glide.load.a.au r2 = r2.f17242c     // Catch:{ all -> 0x042b }
            r2.mo12180f()     // Catch:{ all -> 0x042b }
            throw r0     // Catch:{ all -> 0x042b }
        L_0x041a:
            if (r3 == 0) goto L_0x041f
            r3.mo12180f()     // Catch:{ all -> 0x0448 }
        L_0x041f:
            com.bumptech.glide.load.a.p r0 = r1.f17253c     // Catch:{ all -> 0x0448 }
            boolean r0 = r0.mo12234b()     // Catch:{ all -> 0x0448 }
            if (r0 == 0) goto L_0x042a
            r35.mo12237b()     // Catch:{ all -> 0x0448 }
        L_0x042a:
            return
        L_0x042b:
            r0 = move-exception
            if (r3 == 0) goto L_0x0431
            r3.mo12180f()     // Catch:{ all -> 0x0448 }
        L_0x0431:
            throw r0     // Catch:{ all -> 0x0448 }
        L_0x0432:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0442 }
            java.lang.String r2 = "Already have resource"
            r0.<init>(r2)     // Catch:{ all -> 0x0442 }
            throw r0     // Catch:{ all -> 0x0442 }
        L_0x043a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0442 }
            java.lang.String r2 = "Received a resource without any callbacks to notify"
            r0.<init>(r2)     // Catch:{ all -> 0x0442 }
            throw r0     // Catch:{ all -> 0x0442 }
        L_0x0442:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0442 }
            throw r0     // Catch:{ all -> 0x0448 }
        L_0x0445:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0445 }
            throw r0     // Catch:{ all -> 0x0448 }
        L_0x0448:
            r0 = move-exception
            throw r0
        L_0x044a:
            r35.m14824k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p293a.C5725r.m14821h():void");
    }

    /* renamed from: i */
    private final void m14822i(String str, long j, String str2) {
        double a = C5625l.m14592a(j);
        String valueOf = String.valueOf(this.f17257g);
        String concat = str2 != null ? ", ".concat(str2) : BuildConfig.FLAVOR;
        String name = Thread.currentThread().getName();
        Log.v("DecodeJob", str + " in " + a + ", load key: " + valueOf + concat + ", thread: " + name);
    }

    /* renamed from: j */
    private final void m14823j() {
        m14825l();
        C5673ap apVar = new C5673ap("Failed to load resource", new ArrayList(this.f17270t));
        C5721n nVar = this.f17262l;
        synchronized (nVar) {
            ((C5667aj) nVar).f17085k = apVar;
        }
        synchronized (nVar) {
            ((C5667aj) nVar).f17076b.mo12057b();
            if (((C5667aj) nVar).f17088n) {
                ((C5667aj) nVar).mo12153f();
            } else if (((C5667aj) nVar).f17075a.mo12147e()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!((C5667aj) nVar).f17086l) {
                ((C5667aj) nVar).f17086l = true;
                C5955n nVar2 = ((C5667aj) nVar).f17079e;
                C5666ai c = ((C5667aj) nVar).f17075a.mo12145c();
                ((C5667aj) nVar).mo12152e(c.mo12144a() + 1);
                C5667aj ajVar = (C5667aj) nVar;
                ajVar.f17078d.mo12139c(ajVar, nVar2, (C5671an) null);
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    C5665ah ahVar = (C5665ah) it.next();
                    ahVar.f17073b.execute(new C5663af(ajVar, ahVar.f17072a));
                }
                ajVar.mo12151d();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        if (this.f17253c.mo12235c()) {
            mo12237b();
        }
    }

    /* renamed from: k */
    private final void m14824k() {
        this.f17274x = Thread.currentThread();
        this.f17273w = C5625l.m14593b();
        boolean z = false;
        while (!this.f17267q && this.f17266p != null && !(z = this.f17266p.mo12182b())) {
            this.f17250E = mo12239e(this.f17250E);
            this.f17266p = m14820g();
            if (this.f17250E == 4) {
                mo12240f(2);
                return;
            }
        }
        if ((this.f17250E == 6 || this.f17267q) && !z) {
            m14823j();
        }
    }

    /* renamed from: l */
    private final void m14825l() {
        Throwable th;
        this.f17271u.mo12057b();
        if (this.f17248C) {
            if (this.f17270t.isEmpty()) {
                th = null;
            } else {
                List list = this.f17270t;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f17248C = true;
    }

    /* renamed from: b */
    public final void mo12237b() {
        this.f17253c.mo12233a();
        C5722o oVar = this.f17252b;
        oVar.f17240a = null;
        oVar.f17241b = null;
        oVar.f17242c = null;
        C5720m mVar = this.f17251a;
        mVar.f17224c = null;
        mVar.f17225d = null;
        mVar.f17234m = null;
        mVar.f17228g = null;
        mVar.f17231j = null;
        mVar.f17229h = null;
        mVar.f17235n = null;
        mVar.f17230i = null;
        mVar.f17236o = null;
        mVar.f17222a.clear();
        mVar.f17232k = false;
        mVar.f17223b.clear();
        mVar.f17233l = false;
        this.f17248C = false;
        this.f17254d = null;
        this.f17255e = null;
        this.f17261k = null;
        this.f17256f = null;
        this.f17257g = null;
        this.f17262l = null;
        this.f17250E = 0;
        this.f17266p = null;
        this.f17274x = null;
        this.f17265o = null;
        this.f17276z = null;
        this.f17246A = null;
        this.f17247B = null;
        this.f17273w = 0;
        this.f17267q = false;
        this.f17270t.clear();
        this.f17272v.mo5127b(this);
    }

    /* renamed from: c */
    public final void mo12199c(C5955n nVar, Exception exc, C5930e eVar, C5637a aVar) {
        eVar.mo11924d();
        C5673ap apVar = new C5673ap("Fetching data failed", Collections.singletonList(exc));
        apVar.mo12170c(nVar, aVar, eVar.mo11922b());
        this.f17270t.add(apVar);
        if (Thread.currentThread() != this.f17274x) {
            mo12240f(2);
        } else {
            m14824k();
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C5725r rVar = (C5725r) obj;
        int ordinal = this.f17256f.ordinal() - rVar.f17256f.ordinal();
        return ordinal == 0 ? this.f17263m - rVar.f17263m : ordinal;
    }

    /* renamed from: d */
    public final void mo12200d(C5955n nVar, Object obj, C5930e eVar, C5637a aVar, C5955n nVar2) {
        this.f17265o = nVar;
        this.f17276z = obj;
        this.f17247B = eVar;
        this.f17246A = aVar;
        this.f17275y = nVar2;
        boolean z = false;
        if (nVar != this.f17251a.mo12228c().get(0)) {
            z = true;
        }
        this.f17249D = z;
        if (Thread.currentThread() == this.f17274x) {
            m14821h();
        } else {
            mo12240f(3);
        }
    }

    /* renamed from: f */
    public final void mo12240f(int i) {
        this.f17268r = i;
        ((C5667aj) this.f17262l).mo12149b().execute(this);
    }

    /* renamed from: fC */
    public final C5614j mo12055fC() {
        return this.f17271u;
    }

    /* renamed from: g */
    private final C5719l m14820g() {
        int i = this.f17250E;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return new C5680aw(this.f17251a, this);
        } else {
            if (i2 == 2) {
                C5720m mVar = this.f17251a;
                return new C5715h(mVar.mo12228c(), mVar, this);
            } else if (i2 == 3) {
                return new C5704bb(this.f17251a, this);
            } else {
                if (i2 == 5) {
                    return null;
                }
                throw new IllegalStateException("Unrecognized stage: ".concat(C5724q.m14819a(i)));
            }
        }
    }

    /* renamed from: e */
    public final int mo12239e(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return this.f17264n ? 6 : 4;
                }
                if (i2 == 3 || i2 == 5) {
                    return 6;
                }
                throw new IllegalArgumentException("Unrecognized stage: ".concat(C5724q.m14819a(i)));
            } else if (this.f17260j.mo12244a()) {
                return 3;
            } else {
                return mo12239e(3);
            }
        } else if (this.f17260j.mo12245b()) {
            return 2;
        } else {
            return mo12239e(2);
        }
    }

    public final void run() {
        C5930e eVar = this.f17247B;
        try {
            if (this.f17267q) {
                m14823j();
                if (eVar != null) {
                    eVar.mo11924d();
                    return;
                }
                return;
            }
            int i = this.f17268r;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    this.f17250E = mo12239e(1);
                    this.f17266p = m14820g();
                    m14824k();
                } else if (i2 == 1) {
                    m14824k();
                } else if (i2 != 2) {
                    throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
                } else {
                    m14821h();
                }
                if (eVar != null) {
                    eVar.mo11924d();
                    return;
                }
                return;
            }
            throw null;
        } catch (C5714g e) {
            throw e;
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.mo11924d();
            }
            throw th;
        }
    }
}
