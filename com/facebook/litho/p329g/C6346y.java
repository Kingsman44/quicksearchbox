package com.facebook.litho.p329g;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.C6106aq;
import com.facebook.litho.C6156cd;
import com.facebook.litho.C6158cf;
import com.facebook.litho.C6165cm;
import com.facebook.litho.C6166cn;
import com.facebook.litho.C6192dl;
import com.facebook.litho.C6193dm;
import com.facebook.litho.C6203dw;
import com.facebook.litho.C6261fd;
import com.facebook.litho.C6278fu;
import com.facebook.litho.C6348ga;
import com.facebook.litho.C6349gb;
import com.facebook.litho.C6381hf;
import com.facebook.litho.p329g.p331b.C6320v;
import com.facebook.litho.p332h.C6375a;
import com.facebook.litho.widget.C6491cw;
import com.facebook.litho.widget.C6494cz;
import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.litho.g.y */
/* compiled from: PG */
public final class C6346y {

    /* renamed from: j */
    private static volatile Looper f18767j;

    /* renamed from: a */
    public volatile boolean f18768a;

    /* renamed from: b */
    public final C6193dm f18769b;

    /* renamed from: c */
    public final C6336o f18770c;

    /* renamed from: d */
    public final String f18771d;

    /* renamed from: e */
    public final C6342u f18772e;

    /* renamed from: f */
    public C6335n f18773f;

    /* renamed from: g */
    public C6335n f18774g;

    /* renamed from: h */
    public final C6156cd f18775h = new C6156cd();

    /* renamed from: i */
    public C6285a f18776i;

    /* renamed from: k */
    private final C6298b f18777k;

    /* renamed from: l */
    private final Map f18778l = new HashMap();

    /* renamed from: m */
    private final C6342u f18779m;

    /* renamed from: n */
    private boolean f18780n;

    /* renamed from: o */
    private int f18781o;

    /* renamed from: p */
    private final C6344w f18782p;

    /* renamed from: q */
    private final List f18783q;

    /* renamed from: r */
    private final AtomicBoolean f18784r;

    /* renamed from: s */
    private final C6158cf f18785s = new C6158cf();

    /* renamed from: t */
    private final C6333l f18786t;

    public C6346y(C6341t tVar) {
        C6192dl dlVar = new C6192dl(Looper.getMainLooper());
        C6165cm cmVar = C6166cn.f18209a;
        this.f18769b = dlVar;
        C6333l lVar = new C6333l();
        this.f18786t = lVar;
        this.f18768a = false;
        String str = tVar.f18753c;
        this.f18771d = str;
        this.f18777k = new C6298b(tVar.f18752b, lVar, str);
        C6336o oVar = new C6336o(tVar.f18751a);
        oVar.f18742l = this;
        oVar.f18744n = new C6347z(this);
        this.f18770c = oVar;
        this.f18783q = new ArrayList();
        this.f18782p = new C6344w();
        C6193dm dmVar = tVar.f18754d;
        dmVar = dmVar == null ? new C6192dl(m17024a()) : dmVar;
        C6165cm cmVar2 = C6166cn.f18209a;
        this.f18772e = new C6342u(this, dmVar);
        this.f18779m = new C6342u(this, dlVar);
        this.f18784r = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static synchronized Looper m17024a() {
        Looper looper;
        synchronized (C6346y.class) {
            if (f18767j == null) {
                HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
                handlerThread.start();
                f18767j = handlerThread.getLooper();
            }
            looper = f18767j;
        }
        return looper;
    }

    /* renamed from: b */
    public static C6335n m17025b(C6335n nVar, boolean z) {
        if (nVar != null) {
            return nVar.mo13297c(z);
        }
        return null;
    }

    /* renamed from: c */
    public static String m17026c(C6346y yVar) {
        String sb;
        synchronized (yVar) {
            boolean z = yVar.f18768a;
            StringBuilder sb2 = new StringBuilder("tag: ");
            sb2.append(yVar.f18771d);
            sb2.append(", currentSection.size: ");
            C6335n nVar = yVar.f18773f;
            String str = null;
            sb2.append(nVar != null ? Integer.valueOf(nVar.f18738i) : null);
            sb2.append(", currentSection.name: ");
            C6335n nVar2 = yVar.f18773f;
            sb2.append(nVar2 != null ? nVar2.f18735f : null);
            sb2.append(", nextSection.size: ");
            C6335n nVar3 = yVar.f18774g;
            sb2.append(nVar3 != null ? Integer.valueOf(nVar3.f18738i) : null);
            sb2.append(", nextSection.name: ");
            C6335n nVar4 = yVar.f18774g;
            if (nVar4 != null) {
                str = nVar4.f18735f;
            }
            sb2.append(str);
            sb2.append(", pendingChangeSets.size: ");
            sb2.append(yVar.f18783q.size());
            sb2.append(", pendingStateUpdates.size: ");
            sb2.append(yVar.f18782p.f18765a.size());
            sb2.append(", pendingNonLazyStateUpdates.size: ");
            sb2.append(yVar.f18782p.f18766b.size());
            sb2.append("\n");
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: l */
    private final synchronized void m17027l(String str, C6278fu fuVar, boolean z) {
        if (this.f18773f == null) {
            if (this.f18774g == null) {
                throw new IllegalStateException("State set with no attached Section");
            }
        }
        C6344w wVar = this.f18782p;
        C6344w.m17021b(str, fuVar, wVar.f18765a);
        C6344w.m17021b(str, fuVar, wVar.f18766b);
        if (this.f18780n) {
            int i = this.f18781o + 1;
            this.f18781o = i;
            if (i == 50) {
                C6106aq.m15891b(3, "SectionTree:StateUpdatesFromInsideChangeSetCalculateExceedsThreshold", "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
            }
        }
        C6335n nVar = this.f18774g;
        if (nVar == null) {
            this.f18774g = m17025b(this.f18773f, false);
        } else {
            this.f18774g = nVar.mo13297c(false);
        }
    }

    /* renamed from: m */
    private final void m17028m(C6335n nVar) {
        this.f18775h.mo13138b(nVar.f18732c, nVar, nVar.f18740k);
        if (!nVar.mo13291k()) {
            List list = nVar.f18739j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m17028m((C6335n) list.get(i));
            }
        }
    }

    /* renamed from: n */
    private final synchronized void m17029n(C6335n nVar) {
        C6336o oVar = nVar.f18732c;
        List list = nVar.f18739j;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m17029n((C6335n) list.get(i));
            }
        }
    }

    /* renamed from: o */
    private final void m17030o() {
        this.f18780n = false;
        this.f18781o = 0;
    }

    /* renamed from: p */
    private final void m17031p(C6335n nVar) {
        C6336o oVar = nVar.f18732c;
        if (!nVar.mo13291k()) {
            List list = nVar.f18739j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m17031p((C6335n) list.get(i));
            }
        }
    }

    /* renamed from: q */
    private final synchronized boolean m17032q(C6344w wVar) {
        return wVar.f18766b.equals(this.f18782p.f18766b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m17033r(com.facebook.litho.p329g.C6336o r17, com.facebook.litho.p329g.C6335n r18, com.facebook.litho.p329g.C6335n r19, java.util.Map r20, com.facebook.litho.p329g.C6333l r21, java.lang.String r22) {
        /*
            r0 = r17
            r1 = r18
            r7 = r19
            if (r7 == 0) goto L_0x0185
            com.facebook.litho.g.o r2 = com.facebook.litho.p329g.C6336o.m16997o(r0, r7)     // Catch:{ all -> 0x0183 }
            r7.f18732c = r2     // Catch:{ all -> 0x0183 }
            if (r1 == 0) goto L_0x0014
            int r2 = r1.f18738i     // Catch:{ all -> 0x0183 }
            r7.f18738i = r2     // Catch:{ all -> 0x0183 }
        L_0x0014:
            boolean r2 = r19.mo13291k()     // Catch:{ all -> 0x0183 }
            if (r2 != 0) goto L_0x001c
            com.facebook.litho.hf r3 = r0.f19016i     // Catch:{ all -> 0x0183 }
        L_0x001c:
            if (r1 == 0) goto L_0x002e
            java.lang.Class r3 = r18.getClass()     // Catch:{ all -> 0x0183 }
            java.lang.Class r4 = r19.getClass()     // Catch:{ all -> 0x0183 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0183 }
            if (r3 == 0) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r1 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x0034
            goto L_0x003c
        L_0x0034:
            com.facebook.litho.fv r3 = r1.f18736g     // Catch:{ all -> 0x0183 }
            com.facebook.litho.fv r4 = r7.f18736g     // Catch:{ all -> 0x0183 }
            r7.mo13355j(r3, r4)     // Catch:{ all -> 0x0183 }
            goto L_0x0041
        L_0x003c:
            com.facebook.litho.g.o r3 = r7.f18732c     // Catch:{ all -> 0x0183 }
            r7.mo13354i(r3)     // Catch:{ all -> 0x0183 }
        L_0x0041:
            java.lang.String r3 = r7.f18740k     // Catch:{ all -> 0x0183 }
            r9 = r20
            java.lang.Object r3 = r9.get(r3)     // Catch:{ all -> 0x0183 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0183 }
            if (r3 == 0) goto L_0x0075
            com.facebook.litho.fv r4 = r7.f18736g     // Catch:{ all -> 0x0183 }
            int r5 = r3.size()     // Catch:{ all -> 0x0183 }
            r6 = 0
        L_0x0054:
            if (r6 >= r5) goto L_0x0062
            java.lang.Object r10 = r3.get(r6)     // Catch:{ all -> 0x0183 }
            com.facebook.litho.fu r10 = (com.facebook.litho.C6278fu) r10     // Catch:{ all -> 0x0183 }
            r4.mo13275a(r10)     // Catch:{ all -> 0x0183 }
            int r6 = r6 + 1
            goto L_0x0054
        L_0x0062:
            int r3 = r3.size()     // Catch:{ all -> 0x0183 }
            long r3 = (long) r3     // Catch:{ all -> 0x0183 }
            java.util.concurrent.atomic.AtomicLong r5 = com.facebook.litho.p332h.C6375a.f18855f     // Catch:{ all -> 0x0183 }
            r5.addAndGet(r3)     // Catch:{ all -> 0x0183 }
            boolean r3 = com.facebook.litho.p329g.C6335n.m17004q(r18, r19)     // Catch:{ all -> 0x0183 }
            if (r3 == 0) goto L_0x0075
            com.facebook.litho.p329g.C6335n.m16991e(r19)     // Catch:{ all -> 0x0183 }
        L_0x0075:
            if (r2 != 0) goto L_0x0182
            r10 = 0
            if (r1 == 0) goto L_0x0087
            boolean r2 = r18.mo13291k()     // Catch:{ all -> 0x0183 }
            if (r2 == 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            java.util.Map r1 = com.facebook.litho.p329g.C6335n.m16990d(r18)     // Catch:{ all -> 0x0183 }
            r11 = r1
            goto L_0x0088
        L_0x0087:
            r11 = r10
        L_0x0088:
            com.facebook.litho.hf r12 = r0.f19016i     // Catch:{ all -> 0x0183 }
            com.google.android.libraries.elements.h.m r1 = r17.mo13475m()     // Catch:{ all -> 0x0183 }
            r2 = 14
            com.facebook.litho.fd r2 = com.facebook.litho.p329g.C6297aa.m16881a(r0, r2, r10, r7)     // Catch:{ all -> 0x0183 }
            com.facebook.litho.g.o r3 = r7.f18732c     // Catch:{ all -> 0x0183 }
            com.facebook.litho.g.i r3 = r7.mo13352g(r3)     // Catch:{ all -> 0x0183 }
            if (r3 != 0) goto L_0x00a2
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0183 }
            r3.<init>()     // Catch:{ all -> 0x0183 }
            goto L_0x00a4
        L_0x00a2:
            java.util.List r3 = r3.f18724a     // Catch:{ all -> 0x0183 }
        L_0x00a4:
            r7.f18739j = r3     // Catch:{ all -> 0x0183 }
            if (r1 == 0) goto L_0x00ad
            if (r2 == 0) goto L_0x00ad
            com.google.android.libraries.elements.p1729h.C21215m.m39906e(r2)     // Catch:{ all -> 0x0183 }
        L_0x00ad:
            java.util.List r13 = r7.f18739j     // Catch:{ all -> 0x0183 }
            int r14 = r13.size()     // Catch:{ all -> 0x0183 }
            r15 = 0
        L_0x00b4:
            if (r15 >= r14) goto L_0x017c
            java.lang.Object r1 = r13.get(r15)     // Catch:{ all -> 0x0183 }
            r3 = r1
            com.facebook.litho.g.n r3 = (com.facebook.litho.p329g.C6335n) r3     // Catch:{ all -> 0x0183 }
            r3.f18730a = r7     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = r3.f18741l     // Catch:{ all -> 0x0183 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0183 }
            if (r2 != 0) goto L_0x015e
            java.lang.String r2 = r7.f18740k     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r4.<init>()     // Catch:{ all -> 0x0183 }
            r4.append(r2)     // Catch:{ all -> 0x0183 }
            r4.append(r1)     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0183 }
            com.facebook.litho.g.o r2 = r7.f18732c     // Catch:{ all -> 0x0183 }
            com.facebook.litho.g.n r4 = r2.mo13351n()     // Catch:{ all -> 0x0183 }
            if (r4 != 0) goto L_0x00e1
            goto L_0x012b
        L_0x00e1:
            com.facebook.litho.g.o r5 = r4.f18732c     // Catch:{ all -> 0x0183 }
            com.facebook.litho.g.j r5 = r5.f18745o     // Catch:{ all -> 0x0183 }
            java.util.Set r5 = r5.f18725a     // Catch:{ all -> 0x0183 }
            boolean r5 = r5.contains(r1)     // Catch:{ all -> 0x0183 }
            if (r5 != 0) goto L_0x00ee
            goto L_0x012b
        L_0x00ee:
            java.lang.String r5 = r3.f18735f     // Catch:{ all -> 0x0183 }
            java.util.Map r6 = r4.f18734e     // Catch:{ all -> 0x0183 }
            if (r6 != 0) goto L_0x00fb
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0183 }
            r6.<init>()     // Catch:{ all -> 0x0183 }
            r4.f18734e = r6     // Catch:{ all -> 0x0183 }
        L_0x00fb:
            java.util.Map r6 = r4.f18734e     // Catch:{ all -> 0x0183 }
            boolean r6 = r6.containsKey(r5)     // Catch:{ all -> 0x0183 }
            if (r6 == 0) goto L_0x0110
            java.util.Map r6 = r4.f18734e     // Catch:{ all -> 0x0183 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0183 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0183 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0183 }
            goto L_0x0111
        L_0x0110:
            r6 = 0
        L_0x0111:
            java.util.Map r4 = r4.f18734e     // Catch:{ all -> 0x0183 }
            int r16 = r6 + 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0183 }
            r4.put(r5, r8)     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r4.<init>()     // Catch:{ all -> 0x0183 }
            r4.append(r1)     // Catch:{ all -> 0x0183 }
            r4.append(r6)     // Catch:{ all -> 0x0183 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0183 }
        L_0x012b:
            r3.f18740k = r1     // Catch:{ all -> 0x0183 }
            com.facebook.litho.g.j r2 = r2.f18745o     // Catch:{ all -> 0x0183 }
            java.util.Set r2 = r2.f18725a     // Catch:{ all -> 0x0183 }
            r2.add(r1)     // Catch:{ all -> 0x0183 }
            com.facebook.litho.g.o r1 = com.facebook.litho.p329g.C6336o.m16997o(r0, r3)     // Catch:{ all -> 0x0183 }
            r3.f18732c = r1     // Catch:{ all -> 0x0183 }
            if (r11 != 0) goto L_0x013e
            r1 = r10
            goto L_0x0146
        L_0x013e:
            java.lang.String r1 = r3.f18740k     // Catch:{ all -> 0x0183 }
            java.lang.Object r1 = r11.get(r1)     // Catch:{ all -> 0x0183 }
            androidx.core.i.e r1 = (androidx.core.p097i.C1970e) r1     // Catch:{ all -> 0x0183 }
        L_0x0146:
            if (r1 == 0) goto L_0x014e
            java.lang.Object r1 = r1.f5888a     // Catch:{ all -> 0x0183 }
            com.facebook.litho.g.n r1 = (com.facebook.litho.p329g.C6335n) r1     // Catch:{ all -> 0x0183 }
            r2 = r1
            goto L_0x014f
        L_0x014e:
            r2 = r10
        L_0x014f:
            r1 = r17
            r4 = r20
            r5 = r21
            r6 = r22
            m17033r(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0183 }
            int r15 = r15 + 1
            goto L_0x00b4
        L_0x015e:
            java.lang.String r0 = r3.f18735f     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            java.lang.String r2 = "Your Section "
            r1.append(r2)     // Catch:{ all -> 0x0183 }
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = " has an empty key. Please specify a key."
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0183 }
            r1.<init>(r0)     // Catch:{ all -> 0x0183 }
            throw r1     // Catch:{ all -> 0x0183 }
        L_0x017c:
            com.facebook.litho.hf r1 = r0.f19016i     // Catch:{ all -> 0x0183 }
            if (r1 == r12) goto L_0x0182
            r0.f19016i = r12     // Catch:{ all -> 0x0183 }
        L_0x0182:
            return
        L_0x0183:
            r0 = move-exception
            throw r0
        L_0x0185:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't generate a subtree with a null root"
            r0.<init>(r1)
            goto L_0x018e
        L_0x018d:
            throw r0
        L_0x018e:
            goto L_0x018d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.p329g.C6346y.m17033r(com.facebook.litho.g.o, com.facebook.litho.g.n, com.facebook.litho.g.n, java.util.Map, com.facebook.litho.g.l, java.lang.String):void");
    }

    /* renamed from: s */
    private final void m17034s(C6348ga gaVar) {
        if (C6349gb.m17046b()) {
            try {
                mo13369j();
            } catch (IndexOutOfBoundsException e) {
                String c = m17026c(this);
                String message = e.getMessage();
                throw new RuntimeException("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://bit.ly/39Oq0Hs for more information. Debug info: " + c + message, e);
            }
        } else {
            C6339r rVar = new C6339r(this, gaVar);
            if (this.f18784r.compareAndSet(true, false)) {
                ((C6192dl) this.f18769b).postAtFrontOfQueue(rVar);
            } else {
                ((C6192dl) this.f18769b).post(rVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo13363d(C6335n nVar) {
        C6336o oVar = nVar.f18732c;
        if (!nVar.mo13291k()) {
            List list = nVar.f18739j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mo13363d((C6335n) list.get(i));
            }
        }
    }

    /* renamed from: e */
    public final void mo13364e(C6335n nVar, boolean z, boolean z2, long j, C6328g gVar, int i) {
        C6335n nVar2 = nVar;
        if (!nVar.mo13291k()) {
            C6343v vVar = (C6343v) this.f18778l.get(nVar2.f18740k);
            C6336o oVar = nVar2.f18732c;
            List list = nVar2.f18739j;
            int size = list.size();
            int i2 = i;
            for (int i3 = 0; i3 < size; i3++) {
                C6335n nVar3 = (C6335n) list.get(i3);
                mo13364e(nVar3, z, z2, j, gVar, i2);
                i2 += nVar3.f18738i;
            }
        }
    }

    /* renamed from: f */
    public final void mo13365f(C6335n nVar) {
        C6336o oVar = nVar.f18732c;
        nVar.mo13356p();
        if (!nVar.mo13291k()) {
            List list = nVar.f18739j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                mo13365f((C6335n) list.get(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo13366g(String str, C6278fu fuVar, String str2) {
        this.f18779m.mo13360b();
        m17027l(str, fuVar, false);
        this.f18779m.mo13361c(2, str2);
        C6375a.f18856g.addAndGet(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized void mo13367h(String str, C6278fu fuVar, String str2) {
        this.f18772e.mo13360b();
        m17027l(str, fuVar, false);
        this.f18772e.mo13361c(3, str2);
        C6375a.f18857h.addAndGet(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13368i(com.facebook.litho.p329g.C6335n r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            r17 = this;
            r7 = r17
            r0 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            java.util.Map r1 = r7.f18778l
            java.lang.String r2 = r0.f18740k
            java.lang.Object r1 = r1.get(r2)
            com.facebook.litho.g.v r1 = (com.facebook.litho.p329g.C6343v) r1
            int r2 = r0.f18738i
            if (r1 != 0) goto L_0x0029
            com.facebook.litho.g.v r1 = new com.facebook.litho.g.v
            r1.<init>()
            java.util.Map r3 = r7.f18778l
            java.lang.String r4 = r0.f18740k
            r3.put(r4, r1)
        L_0x0026:
            r12 = r23
            goto L_0x0043
        L_0x0029:
            int r3 = r1.f18760a
            if (r3 != r8) goto L_0x0026
            int r3 = r1.f18761b
            if (r3 != r9) goto L_0x0026
            int r3 = r1.f18762c
            if (r3 != r10) goto L_0x0026
            int r3 = r1.f18763d
            if (r3 != r11) goto L_0x0026
            int r3 = r1.f18764e
            if (r3 != r2) goto L_0x0026
            r3 = 1
            r12 = r23
            if (r12 == r3) goto L_0x0043
            return
        L_0x0043:
            r1.f18761b = r9
            r1.f18760a = r8
            r1.f18762c = r10
            r1.f18763d = r11
            r1.f18764e = r2
            com.facebook.litho.g.o r1 = r0.f18732c
            r0.mo13357r(r9, r2)
            boolean r1 = r18.mo13291k()
            if (r1 != 0) goto L_0x00b0
            java.util.List r13 = r0.f18739j
            int r14 = r13.size()
            r0 = 0
            r6 = 0
        L_0x0060:
            if (r6 >= r14) goto L_0x00b0
            java.lang.Object r1 = r13.get(r6)
            com.facebook.litho.g.n r1 = (com.facebook.litho.p329g.C6335n) r1
            int r2 = r8 - r0
            int r3 = r9 - r0
            int r4 = r10 - r0
            int r5 = r11 - r0
            int r15 = r1.f18738i
            r16 = -1
            if (r2 >= r15) goto L_0x0087
            if (r3 >= 0) goto L_0x0079
            goto L_0x0087
        L_0x0079:
            r15 = 0
            int r2 = java.lang.Math.max(r2, r15)
            int r15 = r1.f18738i
            int r15 = r15 + -1
            int r3 = java.lang.Math.min(r3, r15)
            goto L_0x0089
        L_0x0087:
            r2 = -1
            r3 = -1
        L_0x0089:
            int r15 = r1.f18738i
            if (r4 >= r15) goto L_0x009e
            if (r5 >= 0) goto L_0x0090
            goto L_0x009e
        L_0x0090:
            r15 = 0
            int r4 = java.lang.Math.max(r4, r15)
            int r15 = r1.f18738i
            int r15 = r15 + -1
            int r5 = java.lang.Math.min(r5, r15)
            goto L_0x00a0
        L_0x009e:
            r4 = -1
            r5 = -1
        L_0x00a0:
            int r15 = r1.f18738i
            int r15 = r15 + r0
            r0 = r17
            r16 = r6
            r6 = r23
            r0.mo13368i(r1, r2, r3, r4, r5, r6)
            int r6 = r16 + 1
            r0 = r15
            goto L_0x0060
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.p329g.C6346y.mo13368i(com.facebook.litho.g.n, int, int, int, int, int):void");
    }

    /* renamed from: j */
    public final void mo13369j() {
        ArrayList arrayList;
        C6335n nVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C6349gb.m17045a();
        synchronized (this) {
            arrayList = new ArrayList(this.f18783q);
            this.f18783q.clear();
            nVar = this.f18773f;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z = false;
        for (int i8 = 0; i8 < size; i8++) {
            C6326e eVar = (C6326e) arrayList.get(i8);
            if (eVar.mo13336a() > 0) {
                int a = eVar.mo13336a();
                int i9 = 0;
                while (i9 < a) {
                    C6324c b = eVar.mo13337b(i9);
                    int i10 = b.f18702b;
                    if (i10 == -3) {
                        C6298b bVar = this.f18777k;
                        int i11 = b.f18703c;
                        int i12 = b.f18705e;
                        bVar.mo13298a();
                        ((C6320v) bVar.f18577b).f18690a.mo13555G(i11, i12);
                    } else if (i10 == -2) {
                        C6298b bVar2 = this.f18777k;
                        int i13 = b.f18703c;
                        int i14 = b.f18705e;
                        List list = b.f18707g;
                        bVar2.mo13298a();
                        ((C6320v) bVar2.f18577b).f18690a.mo13559K(i13, list);
                        if (C6298b.f18576a) {
                            bVar2.mo13300c(i13, list);
                        }
                    } else if (i10 == -1) {
                        C6298b bVar3 = this.f18777k;
                        int i15 = b.f18703c;
                        int i16 = b.f18705e;
                        List list2 = b.f18707g;
                        bVar3.mo13298a();
                        ((C6320v) bVar3.f18577b).f18690a.mo13568w(i15, list2);
                        if (C6298b.f18576a) {
                            bVar3.mo13299b(i15, list2);
                        }
                    } else if (i10 == 0) {
                        C6298b bVar4 = this.f18777k;
                        int i17 = b.f18703c;
                        int i18 = b.f18704d;
                        bVar4.mo13298a();
                        ((C6320v) bVar4.f18577b).f18690a.mo13552C(i17, i18);
                        if (C6298b.f18576a) {
                            bVar4.f18583h.mo13344c(bVar4.f18579d, i17, i18, Thread.currentThread().getName());
                        }
                    } else if (i10 == 1) {
                        C6298b bVar5 = this.f18777k;
                        int i19 = b.f18703c;
                        C6491cw cwVar = b.f18706f;
                        if (bVar5.f18580e != 1 || i19 < (i = bVar5.f18581f) || i19 > (i3 = i + i2) || i19 < i3) {
                            bVar5.mo13298a();
                            bVar5.f18581f = i19;
                            bVar5.f18582g = 1;
                            bVar5.f18580e = 1;
                            bVar5.f18578c.put(i19, cwVar);
                        } else {
                            bVar5.f18582g = (i2 = bVar5.f18582g) + 1;
                            bVar5.f18581f = Math.min(i19, i);
                            bVar5.f18578c.put(i19, cwVar);
                        }
                    } else if (i10 != 2) {
                        C6298b bVar6 = this.f18777k;
                        int i20 = b.f18703c;
                        if (bVar6.f18580e != 3 || (i7 = bVar6.f18581f) < i20 || i7 > i20 + 1) {
                            bVar6.mo13298a();
                            bVar6.f18581f = i20;
                            bVar6.f18582g = 1;
                            bVar6.f18580e = 3;
                        } else {
                            bVar6.f18582g++;
                            bVar6.f18581f = i20;
                        }
                    } else {
                        C6298b bVar7 = this.f18777k;
                        int i21 = b.f18703c;
                        C6491cw cwVar2 = b.f18706f;
                        if (bVar7.f18580e != 2 || i21 > (i5 = bVar7.f18582g + i4) || (i6 = i21 + 1) < (i4 = bVar7.f18581f)) {
                            bVar7.mo13298a();
                            bVar7.f18581f = i21;
                            bVar7.f18582g = 1;
                            bVar7.f18580e = 2;
                            bVar7.f18578c.put(i21, cwVar2);
                        } else {
                            bVar7.f18581f = Math.min(i21, i4);
                            bVar7.f18582g = Math.max(i5, i6) - bVar7.f18581f;
                            bVar7.f18578c.put(i21, cwVar2);
                        }
                    }
                    i9++;
                    z = true;
                }
                this.f18777k.mo13298a();
            }
            arrayList2.addAll(eVar.f18718a);
        }
        C6328g gVar = new C6328g(arrayList2);
        ((C6320v) this.f18777k.f18577b).f18690a.mo13553D(z, new C6340s(this, gVar, z, nVar));
    }

    /* renamed from: k */
    public final void mo13370k(int i, String str, C6348ga gaVar) {
        C6335n b;
        C6335n b2;
        C21215m m;
        C6344w a;
        C6203dw dwVar;
        ArrayList arrayList;
        C6326e eVar;
        boolean z;
        String str2;
        String str3 = str == null ? this.f18771d : str;
        if (C6494cz.f19262a) {
            synchronized (this) {
                C6335n nVar = this.f18774g;
                str2 = nVar != null ? nVar.f18735f : "<null>";
            }
            Log.d("SectionsDebug", "=== NEW CHANGE SET (" + C6297aa.m16882b(i) + ", S: " + str2 + ", Tree: " + hashCode() + ") ====");
        }
        synchronized (this) {
            b = m17025b(this.f18773f, true);
            b2 = m17025b(this.f18774g, false);
            m = this.f18770c.mo13475m();
            a = this.f18782p.mo13362a();
            this.f18780n = true;
        }
        C6261fd a2 = C6297aa.m16881a(this.f18770c, 15, b, b2);
        boolean z2 = (m == null || a2 == null || !C21215m.m39905d(a2)) ? false : true;
        if (a2 != null) {
            a2.mo13235a("attribution", str3);
            a2.mo13235a("section_set_root_source", C6297aa.m16882b(i));
            C6349gb.m17046b();
        }
        this.f18785s.mo13141a();
        while (b2 != null) {
            C6336o oVar = this.f18770c;
            Map map = a.f18765a;
            C6333l lVar = this.f18786t;
            String str4 = this.f18771d;
            b2.f18740k = b2.f18741l;
            C21215m m2 = oVar.mo13475m();
            C6261fd a3 = C6297aa.m16881a(oVar, 11, b, b2);
            String str5 = str4;
            C6333l lVar2 = lVar;
            C6336o oVar2 = oVar;
            try {
                m17033r(oVar, b, b2, map, lVar, str5);
                if (!(m2 == null || a3 == null)) {
                    C21215m.m39906e(a3);
                }
                int i2 = C6327f.f18722a;
                ArrayList arrayList2 = new ArrayList();
                C21215m m3 = oVar2.mo13475m();
                C6336o oVar3 = oVar2;
                C6261fd a4 = C6297aa.m16881a(oVar3, 13, b, b2);
                if (b == null || b.f18735f.equals(b2.f18735f)) {
                    arrayList = arrayList2;
                    eVar = C6327f.m16979a(oVar3, b, b2, arrayList, lVar2, str5, BuildConfig.FLAVOR, BuildConfig.FLAVOR, Thread.currentThread().getName(), z2);
                } else {
                    arrayList = arrayList2;
                    eVar = C6326e.m16971d(C6327f.m16979a(oVar3, b, (C6335n) null, arrayList2, lVar2, str5, BuildConfig.FLAVOR, BuildConfig.FLAVOR, Thread.currentThread().getName(), z2), C6327f.m16979a(oVar3, (C6335n) null, b2, arrayList, lVar2, str5, BuildConfig.FLAVOR, BuildConfig.FLAVOR, Thread.currentThread().getName(), z2));
                }
                if (!(m3 == null || a4 == null)) {
                    eVar.mo13336a();
                    C21215m.m39906e(a4);
                }
                if ((b == null || b.f18738i >= 0) && b2.f18738i >= 0) {
                    synchronized (this) {
                        boolean z3 = b != null;
                        C6335n nVar2 = this.f18773f;
                        boolean z4 = nVar2 != null;
                        boolean z5 = (z3 && z4 && b.f18737h == nVar2.f18737h) || (!z3 && !z4);
                        C6335n nVar3 = this.f18774g;
                        z = z5 && (nVar3 != null && b2.f18737h == nVar3.f18737h) && m17032q(a);
                        if (z) {
                            C6335n nVar4 = this.f18773f;
                            this.f18773f = b2;
                            this.f18774g = null;
                            m17030o();
                            C6344w wVar = this.f18782p;
                            if (!a.f18765a.isEmpty()) {
                                for (String str6 : a.f18765a.keySet()) {
                                    if (!wVar.f18765a.containsKey(str6)) {
                                        break;
                                    }
                                    C6344w.m17022c(wVar.f18765a, a.f18765a, str6);
                                    C6344w.m17022c(wVar.f18766b, a.f18766b, str6);
                                }
                            }
                            this.f18783q.add(eVar);
                            if (nVar4 != null) {
                                m17031p(nVar4);
                            }
                            m17029n(b2);
                        } else {
                            b2 = null;
                        }
                    }
                    if (z) {
                        m17028m(b2);
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            ArrayList arrayList3 = arrayList;
                            C6343v vVar = (C6343v) this.f18778l.remove(((C6335n) arrayList3.get(i3)).f18740k);
                            i3++;
                            arrayList = arrayList3;
                        }
                        this.f18775h.mo13139c();
                        m17034s(gaVar);
                    } else {
                        C6348ga gaVar2 = gaVar;
                    }
                    synchronized (this) {
                        a.f18765a.clear();
                        a.f18766b.clear();
                        b = m17025b(this.f18773f, true);
                        b2 = m17025b(this.f18774g, false);
                        if (b2 != null) {
                            a = this.f18782p.mo13362a();
                            this.f18780n = true;
                        } else {
                            m17030o();
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Changet count is below 0! Current section: ");
                    if (b == null) {
                        sb.append("null; ");
                    } else {
                        sb.append(b.f18735f + " , key=" + b.f18740k + ", count=" + b.f18738i + ", childrenSize=" + b.f18739j.size() + "; ");
                    }
                    sb.append("Next section: ");
                    sb.append(b2.f18735f + " , key=" + b2.f18740k + ", count=" + b2.f18738i + ", childrenSize=" + b2.f18739j.size() + "; ");
                    sb.append("Changes: [");
                    for (int i4 = 0; i4 < eVar.f18721d; i4++) {
                        C6324c b3 = eVar.mo13337b(i4);
                        sb.append(b3.f18702b + " " + b3.f18703c + " " + b3.f18704d);
                        sb.append(", ");
                    }
                    sb.append("]");
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                C6375a.m17087b();
                if (C6349gb.m17046b()) {
                    C6375a.m17088c();
                }
                throw th;
            }
        }
        C6381hf hfVar = this.f18770c.f19016i;
        if (hfVar == null) {
            dwVar = null;
        } else {
            dwVar = (C6203dw) hfVar.mo13397c(C6203dw.class);
        }
        if (!C6203dw.m16458b(dwVar)) {
            if (!(m == null || a2 == null)) {
                C21215m.m39906e(a2);
            }
            C6375a.m17087b();
            if (C6349gb.m17046b()) {
                C6375a.m17088c();
                return;
            }
            return;
        }
        throw null;
    }
}
