package com.google.android.apps.gsa.searchbox.p6944c;

import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89207l;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.root.p3199a.C41631e;
import com.google.android.libraries.searchbox.root.p3199a.C41632f;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.searchbox.c.k */
/* compiled from: PG */
public final class C88607k implements C89199d, C89200e, C89204i, C89207l, C89196a {

    /* renamed from: A */
    private int f239468A;

    /* renamed from: a */
    public final C21370a f239469a;

    /* renamed from: b */
    public final AtomicLong f239470b = new AtomicLong(0);

    /* renamed from: c */
    public final Map f239471c = new ConcurrentHashMap();

    /* renamed from: d */
    public List f239472d;

    /* renamed from: e */
    public C88543c f239473e;

    /* renamed from: f */
    public List f239474f;

    /* renamed from: g */
    public C22871g f239475g;

    /* renamed from: h */
    public C41642a f239476h = null;

    /* renamed from: i */
    public Future f239477i = null;

    /* renamed from: j */
    public int f239478j;

    /* renamed from: k */
    public int f239479k;

    /* renamed from: l */
    public int f239480l;

    /* renamed from: m */
    public int f239481m;

    /* renamed from: n */
    public int f239482n;

    /* renamed from: o */
    public int f239483o;

    /* renamed from: p */
    public int f239484p;

    /* renamed from: q */
    public int f239485q;

    /* renamed from: r */
    public int f239486r;

    /* renamed from: s */
    private C88622z f239487s;

    /* renamed from: t */
    private C88546ab f239488t;

    /* renamed from: u */
    private List f239489u;

    /* renamed from: v */
    private List f239490v;

    /* renamed from: w */
    private List f239491w;

    /* renamed from: x */
    private boolean f239492x;

    /* renamed from: y */
    private boolean f239493y;

    /* renamed from: z */
    private int f239494z;

    public C88607k(C21370a aVar) {
        this.f239469a = aVar;
    }

    /* renamed from: n */
    public static boolean m143219n(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C60870cx cxVar = (C60870cx) it.next();
            if (!cxVar.isDone()) {
                z = true;
                cxVar.cancel(true);
            }
        }
        return z;
    }

    /* renamed from: q */
    private final void m143220q() {
        mo82261j();
        synchronized (this) {
            this.f239471c.clear();
        }
    }

    /* renamed from: r */
    private final synchronized void m143221r(C41642a aVar) {
        this.f239473e.mo82205y();
        this.f239471c.remove(aVar);
    }

    /* renamed from: s */
    private final void m143222s(C88616t tVar, List list, List list2) {
        Comparator comparator;
        if (this.f239493y) {
            comparator = RootSuggestion.f108831c;
        } else {
            comparator = RootSuggestion.f108830b;
        }
        Collections.sort(list, comparator);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((C41632f) it.next()).mo44214b(tVar, list)) {
                Collections.sort(list, comparator);
            }
        }
    }

    /* renamed from: t */
    private final synchronized boolean m143223t(C41642a aVar) {
        return !this.f239471c.containsKey(aVar);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88614r rVar = (C88614r) obj;
        this.f239473e = rVar.f239530a;
        this.f239472d = rVar.f239539j;
        this.f239487s = rVar.f239535f;
        this.f239488t = rVar.f239536g;
        this.f239489u = rVar.f239542m;
        this.f239490v = rVar.f239543n;
        this.f239491w = rVar.f239544o;
        this.f239474f = rVar.f239545p;
    }

    /* renamed from: e */
    public final void mo78004e() {
        m143220q();
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        C88615s sVar = (C88615s) obj;
        this.f239478j = 3;
        this.f239494z = 200;
        this.f239468A = 200;
        this.f239479k = Math.max(((int) sVar.f239555a.mo79743a(C90085ej.f250143aT)) - this.f239494z, 0);
        this.f239480l = Math.max(500 - this.f239468A, 0);
        this.f239481m = Math.max(2000 - this.f239494z, 0);
        this.f239482n = Math.max(2000 - this.f239468A, 0);
        this.f239483o = Math.max(10000 - this.f239494z, 0);
        this.f239484p = Math.max(10000 - this.f239468A, 0);
        this.f239485q = Math.max((10000 - this.f239481m) - this.f239494z, 0);
        this.f239486r = Math.max((10000 - this.f239482n) - this.f239468A, 0);
        this.f239492x = sVar.f239555a.mo79746e(C90085ej.f250215bq);
        this.f239493y = sVar.f239555a.mo79746e(C90085ej.f250241s);
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        m143220q();
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final void mo82226hG(C22871g gVar) {
        this.f239475g = gVar;
    }

    /* renamed from: i */
    public final void mo82227i() {
        m143220q();
    }

    /* renamed from: j */
    public final void mo82261j() {
        C41642a aVar;
        Future future;
        synchronized (this) {
            aVar = this.f239476h;
            future = this.f239477i;
            this.f239476h = null;
            this.f239477i = null;
        }
        if (aVar != null && future != null) {
            C58976aa aaVar = C58975e.f156826a;
            m143221r(aVar);
            future.cancel(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:228:0x054f, code lost:
        if (r6.f108835g == false) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0637, code lost:
        r22 = r9;
        r15 = r14;
        r35 = r3;
        r3 = r0;
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x063f, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0641, code lost:
        r3 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r3;
        r0.mo44212a(new com.google.android.libraries.searchbox.shared.response.Response(r3.f239556a.mo84352bk(), com.google.common.p4522b.C58485gu.m89845m(), r15, r3.f239557b, r3.f239558c, r3.f239560e, true, r22));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0114, code lost:
        if (r5.isEmpty() != false) goto L_0x0637;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0116, code lost:
        r2 = r1.f239487s;
        r11 = r1.f239469a;
        r12 = new java.util.ArrayList();
        r13 = r5.iterator();
        r15 = new java.util.ArrayList();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012d, code lost:
        if (r13.hasNext() == false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012f, code lost:
        r6 = (com.google.android.libraries.searchbox.root.RootSuggestion) r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013b, code lost:
        if (r6.mo44265s() != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013d, code lost:
        r38 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013f, code lost:
        r4 = r9;
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        r38 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014e, code lost:
        if (com.google.android.apps.gsa.shared.p6990an.C89235z.m145128H(r6.f108906A, r6.f108910k, r6.f108925z, r11, r12) == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0154, code lost:
        if (r6.mo44265s() == false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0156, code lost:
        r4 = r9;
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0162, code lost:
        if (com.google.android.apps.gsa.shared.p6990an.C89235z.m145126F(r6.f108906A, r11.mo26870b()) == false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0164, code lost:
        r15.add(com.google.android.apps.gsa.shared.p6990an.p6992b.C89211b.m145116b(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016c, code lost:
        r4 = r9;
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016e, code lost:
        r13.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017d, code lost:
        if (r6.f108925z.contains(308) == false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017f, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0181, code lost:
        r3 = r39;
        r9 = r4;
        r10 = r7;
        r4 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0189, code lost:
        r38 = r4;
        r4 = r9;
        r7 = r10;
        r3 = (com.google.android.libraries.searchbox.shared.response.C41647b) com.google.android.libraries.searchbox.shared.response.C41648c.f108869b.createBuilder();
        r3.copyOnWrite();
        r6 = (com.google.android.libraries.searchbox.shared.response.C41648c) r3.instance;
        r9 = r6.f108871a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a2, code lost:
        if (r9.mo58948c() != false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a4, code lost:
        r6.f108871a = com.google.protobuf.C62942bv.mutableCopy(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01aa, code lost:
        com.google.protobuf.C62947c.addAll((java.lang.Iterable) r15, (java.util.List) r6.f108871a);
        r14.putByteArray("gsa:as", ((com.google.android.libraries.searchbox.shared.response.C41648c) r3.build()).toByteArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c2, code lost:
        if (r12.isEmpty() != false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c4, code lost:
        r2 = r2.f239584b;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r6 = r2.f239302a.mo83164d("VALID_WINDOW_SUPPRESSION");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cf, code lost:
        if (r6 == null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e3, code lost:
        r3 = (com.google.common.p4552o.aoz) com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) com.google.common.p4552o.aoz.f159538d, ((com.google.android.libraries.gsa.monet.shared.ProtoParcelable) r6).mo28513b(), com.google.protobuf.C62921ba.m95368a());
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x031e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82262k(com.google.android.libraries.searchbox.shared.p3201b.C41642a r37, com.google.android.libraries.searchbox.root.C41626a r38, com.google.android.libraries.searchbox.root.p3199a.C41631e r39) {
        /*
            r36 = this;
            r1 = r36
            r0 = r37
            r2 = r38
            r3 = r39
            monitor-enter(r36)
            boolean r4 = r36.m143223t(r37)     // Catch:{ all -> 0x0667 }
            if (r4 == 0) goto L_0x0011
            monitor-exit(r36)     // Catch:{ all -> 0x0667 }
            return
        L_0x0011:
            java.util.Map r4 = r1.f239471c     // Catch:{ all -> 0x0667 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0667 }
            com.google.android.apps.gsa.searchbox.c.j r4 = (com.google.android.apps.gsa.searchbox.p6944c.C88606j) r4     // Catch:{ all -> 0x0667 }
            r4.getClass()
            com.google.android.libraries.searchbox.shared.b.a r5 = r4.f239466h     // Catch:{ all -> 0x0667 }
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x0667 }
            if (r5 == 0) goto L_0x0037
            r5 = r0
            com.google.android.apps.gsa.searchbox.c.t r5 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r5     // Catch:{ all -> 0x0667 }
            long r5 = r5.f239560e     // Catch:{ all -> 0x0667 }
            com.google.android.libraries.searchbox.shared.b.a r7 = r4.f239466h     // Catch:{ all -> 0x0667 }
            com.google.android.apps.gsa.searchbox.c.t r7 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r7     // Catch:{ all -> 0x0667 }
            long r7 = r7.f239560e     // Catch:{ all -> 0x0667 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0037
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0667 }
            monitor-exit(r36)     // Catch:{ all -> 0x0667 }
            return
        L_0x0037:
            int r5 = r4.f239461c     // Catch:{ all -> 0x0667 }
            r7 = 1
            if (r5 <= 0) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            com.google.common.base.C58838bb.m90883r(r5)     // Catch:{ all -> 0x0667 }
            int r5 = r4.f239461c     // Catch:{ all -> 0x0667 }
            r8 = -1
            int r5 = r5 + r8
            r4.f239461c = r5     // Catch:{ all -> 0x0667 }
            if (r2 == 0) goto L_0x0084
            java.util.List r5 = r4.f239459a     // Catch:{ all -> 0x0667 }
            r5.add(r2)     // Catch:{ all -> 0x0667 }
            android.os.Bundle r5 = r4.f239460b     // Catch:{ all -> 0x0667 }
            android.os.Bundle r9 = r2.f108837b     // Catch:{ all -> 0x0667 }
            r5.putAll(r9)     // Catch:{ all -> 0x0667 }
            java.util.List r5 = r2.f108836a     // Catch:{ all -> 0x0667 }
            int r9 = r4.f239462d     // Catch:{ all -> 0x0667 }
            int r5 = r5.size()     // Catch:{ all -> 0x0667 }
            int r9 = r9 + r5
            r4.f239462d = r9     // Catch:{ all -> 0x0667 }
            com.google.at.h.d.a.at r5 = r4.f239465g     // Catch:{ all -> 0x0667 }
            com.google.protobuf.bn r5 = r5.toBuilder()     // Catch:{ all -> 0x0667 }
            com.google.at.h.d.a.as r5 = (com.google.p4017at.p4060h.p4073d.p4074a.C54230as) r5     // Catch:{ all -> 0x0667 }
            com.google.at.h.d.a.at r9 = r2.f108840e     // Catch:{ all -> 0x0667 }
            r5.mergeFrom(r9)     // Catch:{ all -> 0x0667 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x0667 }
            com.google.at.h.d.a.at r5 = (com.google.p4017at.p4060h.p4073d.p4074a.C54231at) r5     // Catch:{ all -> 0x0667 }
            r4.f239465g = r5     // Catch:{ all -> 0x0667 }
            boolean r5 = r4.f239463e     // Catch:{ all -> 0x0667 }
            boolean r9 = r2.f108839d     // Catch:{ all -> 0x0667 }
            r5 = r5 | r9
            r4.f239463e = r5     // Catch:{ all -> 0x0667 }
            boolean r5 = r4.f239464f     // Catch:{ all -> 0x0667 }
            boolean r2 = r2.f108838c     // Catch:{ all -> 0x0667 }
            r2 = r2 & r5
            r4.f239464f = r2     // Catch:{ all -> 0x0667 }
        L_0x0084:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0667 }
            boolean r2 = r4.mo82260b()     // Catch:{ all -> 0x0667 }
            r2 = r2 ^ r7
            boolean r5 = r4.mo82260b()     // Catch:{ all -> 0x0667 }
            if (r5 == 0) goto L_0x0097
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0667 }
            r5.<init>()     // Catch:{ all -> 0x0667 }
            goto L_0x009b
        L_0x0097:
            java.util.List r5 = r4.mo82259a()     // Catch:{ all -> 0x0667 }
        L_0x009b:
            java.util.Map r9 = r1.f239471c     // Catch:{ all -> 0x0667 }
            java.util.Set r9 = r9.keySet()     // Catch:{ all -> 0x0667 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0667 }
        L_0x00a5:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0667 }
            if (r10 == 0) goto L_0x00c0
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0667 }
            com.google.android.libraries.searchbox.shared.b.a r10 = (com.google.android.libraries.searchbox.shared.p3201b.C41642a) r10     // Catch:{ all -> 0x0667 }
            long r10 = r10.mo44233a()     // Catch:{ all -> 0x0667 }
            r12 = r0
            com.google.android.apps.gsa.searchbox.c.t r12 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r12     // Catch:{ all -> 0x0667 }
            long r12 = r12.f239560e     // Catch:{ all -> 0x0667 }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00c1
        L_0x00c0:
            r9 = 0
        L_0x00c1:
            android.os.Bundle r10 = r4.f239460b     // Catch:{ all -> 0x0667 }
            java.lang.String r11 = "gsa::ad"
            if (r2 == 0) goto L_0x00cc
            if (r9 == 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            r9 = 0
            goto L_0x00cd
        L_0x00cc:
            r9 = 1
        L_0x00cd:
            r10.putBoolean(r11, r9)     // Catch:{ all -> 0x0667 }
            android.os.Bundle r9 = r4.f239460b     // Catch:{ all -> 0x0667 }
            java.lang.String r10 = "gsa:ah"
            java.lang.String r11 = "is:is_committed_query"
            r12 = r0
            com.google.android.apps.gsa.searchbox.c.t r12 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r12     // Catch:{ all -> 0x0667 }
            android.os.Bundle r12 = r12.f239561f     // Catch:{ all -> 0x0667 }
            boolean r11 = r12.getBoolean(r11)     // Catch:{ all -> 0x0667 }
            r9.putBoolean(r10, r11)     // Catch:{ all -> 0x0667 }
            android.os.Bundle r9 = r4.f239460b     // Catch:{ all -> 0x0667 }
            java.lang.String r10 = "gsa::ai"
            r9.putBoolean(r10, r2)     // Catch:{ all -> 0x0667 }
            java.lang.String r9 = "bs:bootstrapping"
            r10 = r0
            com.google.android.apps.gsa.searchbox.c.t r10 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r10     // Catch:{ all -> 0x0667 }
            android.os.Bundle r10 = r10.f239561f     // Catch:{ all -> 0x0667 }
            boolean r9 = r10.getBoolean(r9)     // Catch:{ all -> 0x0667 }
            if (r9 == 0) goto L_0x00fd
            android.os.Bundle r9 = r4.f239460b     // Catch:{ all -> 0x0667 }
            java.lang.String r10 = "gsa:ap"
            r9.putBoolean(r10, r7)     // Catch:{ all -> 0x0667 }
        L_0x00fd:
            android.os.Bundle r14 = r4.f239460b     // Catch:{ all -> 0x0667 }
            com.google.at.h.d.a.at r9 = r4.f239465g     // Catch:{ all -> 0x0667 }
            boolean r10 = r4.f239464f     // Catch:{ all -> 0x0667 }
            boolean r4 = r4.f239463e     // Catch:{ all -> 0x0667 }
            if (r2 == 0) goto L_0x010f
            com.google.android.apps.gsa.searchbox.c.a.c r11 = r1.f239473e     // Catch:{ all -> 0x0667 }
            r11.mo82203w(r0)     // Catch:{ all -> 0x0667 }
            r36.m143221r(r37)     // Catch:{ all -> 0x0667 }
        L_0x010f:
            monitor-exit(r36)     // Catch:{ all -> 0x0667 }
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L_0x0637
            com.google.android.apps.gsa.searchbox.c.z r2 = r1.f239487s
            com.google.android.libraries.f.a r11 = r1.f239469a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r5.iterator()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r8 = 0
        L_0x0129:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x0189
            java.lang.Object r17 = r13.next()
            r6 = r17
            com.google.android.libraries.searchbox.root.RootSuggestion r6 = (com.google.android.libraries.searchbox.root.RootSuggestion) r6
            boolean r17 = r6.mo44265s()
            if (r17 != 0) goto L_0x0142
            r38 = r4
        L_0x013f:
            r4 = r9
            r7 = r10
            goto L_0x0171
        L_0x0142:
            com.google.at.h.d.a.aq r7 = r6.f108906A
            r38 = r4
            int r4 = r6.f108910k
            com.google.common.b.gu r3 = r6.f108925z
            boolean r3 = com.google.android.apps.gsa.shared.p6990an.C89235z.m145128H(r7, r4, r3, r11, r12)
            if (r3 == 0) goto L_0x013f
            boolean r3 = r6.mo44265s()
            if (r3 == 0) goto L_0x016c
            com.google.at.h.d.a.aq r3 = r6.f108906A
            r4 = r9
            r7 = r10
            long r9 = r11.mo26870b()
            boolean r3 = com.google.android.apps.gsa.shared.p6990an.C89235z.m145126F(r3, r9)
            if (r3 == 0) goto L_0x016e
            com.google.android.libraries.searchbox.shared.suggestion.an r3 = com.google.android.apps.gsa.shared.p6990an.p6992b.C89211b.m145116b(r6)
            r15.add(r3)
            goto L_0x016e
        L_0x016c:
            r4 = r9
            r7 = r10
        L_0x016e:
            r13.remove()
        L_0x0171:
            com.google.common.b.gu r3 = r6.f108925z
            r6 = 308(0x134, float:4.32E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L_0x0181
            int r8 = r8 + 1
        L_0x0181:
            r3 = r39
            r9 = r4
            r10 = r7
            r7 = 1
            r4 = r38
            goto L_0x0129
        L_0x0189:
            r38 = r4
            r4 = r9
            r7 = r10
            com.google.android.libraries.searchbox.shared.response.c r3 = com.google.android.libraries.searchbox.shared.response.C41648c.f108869b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.searchbox.shared.response.b r3 = (com.google.android.libraries.searchbox.shared.response.C41647b) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.libraries.searchbox.shared.response.c r6 = (com.google.android.libraries.searchbox.shared.response.C41648c) r6
            com.google.protobuf.cq r9 = r6.f108871a
            boolean r10 = r9.mo58948c()
            if (r10 != 0) goto L_0x01aa
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r6.f108871a = r9
        L_0x01aa:
            com.google.protobuf.cq r6 = r6.f108871a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r15, (java.util.List) r6)
            java.lang.String r6 = "gsa:as"
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.libraries.searchbox.shared.response.c r3 = (com.google.android.libraries.searchbox.shared.response.C41648c) r3
            byte[] r3 = r3.toByteArray()
            r14.putByteArray(r6, r3)
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x0231
            com.google.android.apps.gsa.searchbox.c.a.c r2 = r2.f239584b
            r3 = 0
            com.google.android.apps.gsa.shared.an.a.j r6 = r2.f239302a     // Catch:{ ct -> 0x01e5 }
            java.lang.String r9 = "VALID_WINDOW_SUPPRESSION"
            android.os.Parcelable r6 = r6.mo83164d(r9)     // Catch:{ ct -> 0x01e5 }
            if (r6 == 0) goto L_0x01e6
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r6 = (com.google.android.libraries.gsa.monet.shared.ProtoParcelable) r6     // Catch:{ ct -> 0x01e5 }
            byte[] r6 = r6.mo28513b()     // Catch:{ ct -> 0x01e5 }
            com.google.protobuf.ba r9 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x01e5 }
            com.google.common.o.aoz r10 = com.google.common.p4552o.aoz.f159538d     // Catch:{ ct -> 0x01e5 }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (byte[]) r6, (com.google.protobuf.C62921ba) r9)     // Catch:{ ct -> 0x01e5 }
            com.google.common.o.aoz r6 = (com.google.common.p4552o.aoz) r6     // Catch:{ ct -> 0x01e5 }
            r3 = r6
            goto L_0x01e6
        L_0x01e5:
        L_0x01e6:
            if (r3 == 0) goto L_0x01ef
            int r3 = r3.f159540a
            r6 = 1
            r3 = r3 & r6
            if (r3 == 0) goto L_0x01ef
            goto L_0x0231
        L_0x01ef:
            com.google.android.apps.gsa.shared.an.a.j r2 = r2.f239302a
            com.google.common.o.aoz r3 = com.google.common.p4552o.aoz.f159538d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.aoy r3 = (com.google.common.p4552o.aoy) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.common.o.aoz r6 = (com.google.common.p4552o.aoz) r6
            com.google.protobuf.cq r9 = r6.f159541b
            boolean r10 = r9.mo58948c()
            if (r10 != 0) goto L_0x020e
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r6.f159541b = r9
        L_0x020e:
            com.google.protobuf.cq r6 = r6.f159541b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r12, (java.util.List) r6)
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.common.o.aoz r6 = (com.google.common.p4552o.aoz) r6
            int r9 = r6.f159540a
            r10 = 1
            r9 = r9 | r10
            r6.f159540a = r9
            r6.f159542c = r8
            java.lang.String r6 = "VALID_WINDOW_SUPPRESSION"
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.aoz r3 = (com.google.common.p4552o.aoz) r3
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r3 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43556a(r3)
            r2.mo83174n(r6, r3)
        L_0x0231:
            java.util.List r2 = r1.f239489u
            r3 = r0
            com.google.android.apps.gsa.searchbox.c.t r3 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r3
            r1.m143222s(r3, r5, r2)
            com.google.android.apps.gsa.searchbox.c.z r2 = r1.f239487s
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            int r8 = r5.size()
            boolean[] r8 = new boolean[r8]
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0249:
            int r12 = r5.size()
            if (r9 >= r12) goto L_0x0328
            java.lang.Object r12 = r5.get(r9)
            com.google.android.libraries.searchbox.root.RootSuggestion r12 = (com.google.android.libraries.searchbox.root.RootSuggestion) r12
            java.lang.String r15 = r12.f108913n
            boolean r19 = com.google.common.base.C58837ba.m90859h(r15)
            if (r19 != 0) goto L_0x0297
            boolean r19 = r6.containsKey(r15)
            if (r19 == 0) goto L_0x0297
            java.lang.Object r19 = r6.get(r15)
            java.lang.Integer r19 = (java.lang.Integer) r19
            int r13 = r19.intValue()
            java.lang.Object r19 = r5.get(r13)
            r21 = r13
            r13 = r19
            com.google.android.libraries.searchbox.root.RootSuggestion r13 = (com.google.android.libraries.searchbox.root.RootSuggestion) r13
            int r13 = r13.f108909j
            r0 = 3
            if (r13 != r0) goto L_0x0282
            int r0 = r12.f108909j
            r13 = 1
            if (r0 == r13) goto L_0x028b
            goto L_0x0295
        L_0x0282:
            r0 = 1
            if (r13 != r0) goto L_0x0295
            int r13 = r12.f108909j
            r0 = 3
            if (r13 == r0) goto L_0x028b
            goto L_0x0295
        L_0x028b:
            int r10 = r10 + 1
            int r0 = r12.f108909j
            r13 = 1
            if (r0 != r13) goto L_0x0295
            r0 = r21
            goto L_0x0298
        L_0x0295:
            r0 = r9
            goto L_0x0298
        L_0x0297:
            r0 = -1
        L_0x0298:
            if (r0 < 0) goto L_0x029c
            if (r0 == r9) goto L_0x02a4
        L_0x029c:
            com.google.protobuf.cq r13 = r4.f142372l
            boolean r19 = r13.isEmpty()
            if (r19 == 0) goto L_0x02ab
        L_0x02a4:
            r19 = r0
        L_0x02a6:
            r22 = r4
            r21 = r10
            goto L_0x0308
        L_0x02ab:
            r19 = r0
            int r0 = r12.f108910k
            com.google.common.b.gu r12 = r12.f108925z
            java.util.Iterator r13 = r13.iterator()
        L_0x02b5:
            boolean r20 = r13.hasNext()
            if (r20 == 0) goto L_0x02a6
            java.lang.Object r20 = r13.next()
            r21 = r10
            r10 = r20
            com.google.at.h.d.a.av r10 = (com.google.p4017at.p4060h.p4073d.p4074a.C54233av) r10
            r20 = r13
            int r13 = r10.f142383a
            r17 = 1
            r13 = r13 & 1
            r22 = r4
            com.google.protobuf.ch r4 = r10.f142385c
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x02d9
            r4 = 1
            goto L_0x02da
        L_0x02d9:
            r4 = 0
        L_0x02da:
            if (r13 != 0) goto L_0x02ec
            if (r4 != 0) goto L_0x02ec
            com.google.common.f.e r4 = com.google.android.apps.gsa.searchbox.p6944c.C88622z.f239583a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r10 = "Invalid type to suppress that specified neither type nor subtype."
            r13 = 9941(0x26d5, float:1.393E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r13)).mo56386p(r10)
            goto L_0x02f3
        L_0x02ec:
            if (r13 == 0) goto L_0x02fa
            int r13 = r10.f142384b
            if (r13 != r0) goto L_0x02f3
            goto L_0x02fa
        L_0x02f3:
            r13 = r20
            r10 = r21
            r4 = r22
            goto L_0x02b5
        L_0x02fa:
            if (r4 == 0) goto L_0x0304
            com.google.protobuf.ch r4 = r10.f142385c
            boolean r4 = r12.containsAll(r4)
            if (r4 == 0) goto L_0x02f3
        L_0x0304:
            int r11 = r11 + 1
            r0 = r9
            goto L_0x030a
        L_0x0308:
            r0 = r19
        L_0x030a:
            if (r0 == r9) goto L_0x0319
            boolean r4 = com.google.common.base.C58837ba.m90859h(r15)
            if (r4 != 0) goto L_0x0319
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r6.put(r15, r4)
        L_0x0319:
            if (r0 < 0) goto L_0x031e
            r4 = 1
            r8[r0] = r4
        L_0x031e:
            int r9 = r9 + 1
            r0 = r37
            r10 = r21
            r4 = r22
            goto L_0x0249
        L_0x0328:
            r22 = r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4 = 0
        L_0x0330:
            int r6 = r5.size()
            if (r4 >= r6) goto L_0x0346
            boolean r6 = r8[r4]
            if (r6 != 0) goto L_0x0343
            java.lang.Object r6 = r5.get(r4)
            com.google.android.libraries.searchbox.root.RootSuggestion r6 = (com.google.android.libraries.searchbox.root.RootSuggestion) r6
            r0.add(r6)
        L_0x0343:
            int r4 = r4 + 1
            goto L_0x0330
        L_0x0346:
            r5.clear()
            r5.addAll(r0)
            com.google.android.apps.gsa.searchbox.c.a.c r0 = r2.f239584b
            r0.mo82206z(r10, r11)
            java.util.List r0 = r1.f239490v
            r1.m143222s(r3, r5, r0)
            com.google.android.apps.gsa.searchbox.c.ab r0 = r1.f239488t
            com.google.android.apps.gsa.staticplugins.searchboxroot.c r2 = r0.f239326b
            com.google.android.apps.gsa.shared.search.Query r4 = r3.f239556a
            java.lang.String r4 = r4.mo84352bk()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x037b
            com.google.android.apps.gsa.shared.search.Query r4 = r3.f239556a
            boolean r4 = r4.mo84406cm()
            if (r4 != 0) goto L_0x037b
            com.google.android.apps.gsa.search.core.i.t r2 = r2.f324296a
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250169at
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x037b
            r15 = r14
            goto L_0x0573
        L_0x037b:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.google.common.b.gu r4 = com.google.android.apps.gsa.searchbox.p6944c.C88546ab.f239325a
            r6 = r4
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6
            int r6 = r6.f156474d
            r8 = 0
        L_0x0388:
            if (r8 >= r6) goto L_0x039b
            java.lang.Object r9 = r4.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            com.google.android.apps.gsa.searchbox.c.aa r10 = new com.google.android.apps.gsa.searchbox.c.aa
            r10.<init>()
            r2.put(r9, r10)
            int r8 = r8 + 1
            goto L_0x0388
        L_0x039b:
            java.util.Iterator r4 = r5.iterator()
        L_0x039f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x03df
            java.lang.Object r6 = r4.next()
            com.google.android.libraries.searchbox.root.RootSuggestion r6 = (com.google.android.libraries.searchbox.root.RootSuggestion) r6
            java.lang.Integer r8 = r6.f108915p
            int r8 = r8.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r9 = r2.containsKey(r8)
            if (r9 == 0) goto L_0x039f
            java.lang.Object r8 = r2.get(r8)
            com.google.android.apps.gsa.searchbox.c.aa r8 = (com.google.android.apps.gsa.searchbox.p6944c.C88545aa) r8
            r8.getClass()
            int r9 = r8.f239319a
            r10 = 1
            int r9 = r9 + r10
            r8.f239319a = r9
            boolean r9 = r6.mo44208h()
            if (r9 == 0) goto L_0x03d5
            int r9 = r8.f239320b
            int r9 = r9 + r10
            r8.f239320b = r9
        L_0x03d5:
            boolean r6 = r6.f108835g
            if (r6 == 0) goto L_0x039f
            int r6 = r8.f239321c
            int r6 = r6 + r10
            r8.f239321c = r6
            goto L_0x039f
        L_0x03df:
            java.lang.Integer r4 = com.google.android.libraries.searchbox.shared.suggestion.C41669ai.f108954c
            java.lang.Object r4 = r2.get(r4)
            com.google.android.apps.gsa.searchbox.c.aa r4 = (com.google.android.apps.gsa.searchbox.p6944c.C88545aa) r4
            r4.getClass()
            java.lang.Integer r6 = com.google.android.libraries.searchbox.shared.suggestion.C41669ai.f108958g
            java.lang.Object r6 = r2.get(r6)
            com.google.android.apps.gsa.searchbox.c.aa r6 = (com.google.android.apps.gsa.searchbox.p6944c.C88545aa) r6
            r6.getClass()
            java.lang.Integer r8 = com.google.android.libraries.searchbox.shared.suggestion.C41669ai.f108961j
            java.lang.Object r8 = r2.get(r8)
            com.google.android.apps.gsa.searchbox.c.aa r8 = (com.google.android.apps.gsa.searchbox.p6944c.C88545aa) r8
            r8.getClass()
            com.google.android.apps.gsa.staticplugins.searchboxroot.c r9 = r0.f239326b
            java.util.Iterator r10 = r5.iterator()
        L_0x0406:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x041e
            java.lang.Object r11 = r10.next()
            com.google.android.libraries.searchbox.root.RootSuggestion r11 = (com.google.android.libraries.searchbox.root.RootSuggestion) r11
            java.lang.Integer r12 = com.google.android.libraries.searchbox.shared.suggestion.C41669ai.f108954c
            java.lang.Integer r11 = r11.f108915p
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L_0x0406
            r10 = 1
            goto L_0x041f
        L_0x041e:
            r10 = 0
        L_0x041f:
            com.google.android.apps.gsa.shared.search.Query r11 = r3.f239556a
            java.lang.String r11 = r11.mo84352bk()
            boolean r11 = r11.isEmpty()
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r11 != 0) goto L_0x043e
            if (r10 == 0) goto L_0x043a
            com.google.android.apps.gsa.search.core.i.t r9 = r9.f324296a
            com.google.android.apps.gsa.shared.m.f r10 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250140aQ
            long r9 = r9.mo79743a(r10)
            int r10 = (int) r9
            goto L_0x0440
        L_0x043a:
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0440
        L_0x043e:
            int r10 = r9.f324297b
        L_0x0440:
            com.google.android.apps.gsa.staticplugins.searchboxroot.c r9 = r0.f239326b
            int r9 = r9.f324298c
            android.os.Bundle r11 = r3.f239561f
            java.lang.String r13 = "extra_primary_suggestion_with_fixed_max_rows_to_show"
            int r11 = r11.getInt(r13)
            int r9 = r9 - r11
            r13 = 0
            int r9 = java.lang.Math.max(r9, r13)
            int r13 = r10 - r9
            int r15 = r4.f239320b
            int r13 = java.lang.Math.max(r13, r15)
            com.google.android.apps.gsa.staticplugins.searchboxroot.c r15 = r0.f239326b
            int r15 = r15.mo103031a(r5, r3)
            if (r15 != r12) goto L_0x0463
            goto L_0x046a
        L_0x0463:
            com.google.android.apps.gsa.staticplugins.searchboxroot.c r12 = r0.f239326b
            int r12 = r12.mo103031a(r5, r3)
            int r12 = r12 + r11
        L_0x046a:
            int r11 = r10 - r13
            int r9 = java.lang.Math.min(r11, r9)
            r13 = 2
            if (r9 < r13) goto L_0x047e
            int r11 = r6.f239319a
            com.google.android.apps.gsa.staticplugins.searchboxroot.c r15 = r0.f239326b
            int r15 = r15.f324299d
            int r11 = java.lang.Math.min(r11, r15)
            goto L_0x047f
        L_0x047e:
            r11 = 0
        L_0x047f:
            r6.f239323e = r11
            if (r11 <= 0) goto L_0x049c
            com.google.android.apps.gsa.shared.search.Query r6 = r3.f239556a
            boolean r6 = r6.mo84406cm()
            if (r6 == 0) goto L_0x0499
            com.google.android.apps.gsa.staticplugins.searchboxroot.c r6 = r0.f239326b
            com.google.android.apps.gsa.search.core.i.t r6 = r6.f324296a
            com.google.android.apps.gsa.shared.m.f r11 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250216br
            r15 = r14
            long r13 = r6.mo79743a(r11)
            int r6 = (int) r13
            r13 = r6
            goto L_0x049e
        L_0x0499:
            r15 = r14
            r13 = 2
            goto L_0x049e
        L_0x049c:
            r15 = r14
            r13 = 0
        L_0x049e:
            int r6 = r8.f239319a
            int r9 = r9 - r13
            int r6 = java.lang.Math.min(r6, r9)
            r8.f239323e = r6
            r8 = 3
            int[] r8 = new int[r8]
            r9 = 0
            r8[r9] = r12
            int r9 = r4.f239319a
            r11 = 1
            r8[r11] = r9
            int r13 = r13 + r6
            int r10 = r10 - r13
            r6 = 2
            r8[r6] = r10
            int r6 = com.google.common.p4575r.C60757n.m92747h(r8)
            r4.f239323e = r6
            java.util.Collection r4 = r2.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x04c5:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = r4.next()
            com.google.android.apps.gsa.searchbox.c.aa r6 = (com.google.android.apps.gsa.searchbox.p6944c.C88545aa) r6
            int r8 = r6.f239319a
            int r9 = r6.f239322d
            int r9 = r6.f239323e
            if (r9 < r8) goto L_0x04db
            r8 = 1
            goto L_0x04dc
        L_0x04db:
            r8 = 0
        L_0x04dc:
            r6.f239324f = r8
            goto L_0x04c5
        L_0x04df:
            java.util.Iterator r4 = r5.iterator()
        L_0x04e3:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0517
            java.lang.Object r6 = r4.next()
            com.google.android.libraries.searchbox.root.RootSuggestion r6 = (com.google.android.libraries.searchbox.root.RootSuggestion) r6
            java.lang.Integer r8 = r6.f108915p
            int r8 = r8.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r9 = r2.containsKey(r8)
            if (r9 == 0) goto L_0x04e3
            java.lang.Object r8 = r2.get(r8)
            com.google.android.apps.gsa.searchbox.c.aa r8 = (com.google.android.apps.gsa.searchbox.p6944c.C88545aa) r8
            r8.getClass()
            boolean r9 = r8.f239324f
            if (r9 == 0) goto L_0x04e3
            boolean r6 = r6.f108835g
            if (r6 == 0) goto L_0x04e3
            int r6 = r8.f239321c
            r9 = -1
            int r6 = r6 + r9
            r8.f239321c = r6
            goto L_0x04e3
        L_0x0517:
            java.util.ListIterator r4 = r5.listIterator()
        L_0x051b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0573
            java.lang.Object r6 = r4.next()
            com.google.android.libraries.searchbox.root.RootSuggestion r6 = (com.google.android.libraries.searchbox.root.RootSuggestion) r6
            java.lang.Integer r8 = r6.f108915p
            java.lang.Object r9 = r2.get(r8)
            if (r9 == 0) goto L_0x051b
            java.lang.Object r8 = r2.get(r8)
            com.google.android.apps.gsa.searchbox.c.aa r8 = (com.google.android.apps.gsa.searchbox.p6944c.C88545aa) r8
            r8.getClass()
            int r9 = r8.f239323e
            if (r9 < 0) goto L_0x0554
            if (r9 != 0) goto L_0x053f
            goto L_0x0554
        L_0x053f:
            boolean r10 = r6.mo44208h()
            if (r10 != 0) goto L_0x0552
            boolean r10 = r6.f108834f
            int r10 = r8.f239321c
            if (r9 > r10) goto L_0x0552
            if (r9 != r10) goto L_0x0554
            boolean r9 = r6.f108835g
            if (r9 != 0) goto L_0x0552
            goto L_0x0554
        L_0x0552:
            r9 = 0
            goto L_0x0555
        L_0x0554:
            r9 = 1
        L_0x0555:
            boolean r6 = r6.f108835g
            if (r6 == 0) goto L_0x0560
            int r6 = r8.f239321c
            r10 = -1
            int r6 = r6 + r10
            r8.f239321c = r6
            goto L_0x0561
        L_0x0560:
            r10 = -1
        L_0x0561:
            if (r9 != 0) goto L_0x056f
            com.google.android.apps.gsa.staticplugins.searchboxroot.c r6 = r0.f239326b
            int r6 = r8.f239323e
            if (r6 < 0) goto L_0x056d
            int r6 = r6 + -1
            r8.f239323e = r6
        L_0x056d:
            if (r6 >= 0) goto L_0x051b
        L_0x056f:
            r4.remove()
            goto L_0x051b
        L_0x0573:
            java.util.List r0 = r1.f239491w
            r1.m143222s(r3, r5, r0)
            boolean r0 = r1.f239493y
            if (r0 != 0) goto L_0x0596
            boolean r0 = r1.f239492x
            if (r0 == 0) goto L_0x0596
            int r0 = r3.f239557b
            r2 = 1
            if (r0 != r2) goto L_0x0596
            com.google.android.apps.gsa.shared.search.Query r0 = r3.f239556a
            java.lang.String r0 = r0.mo84352bk()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0596
            com.google.android.apps.gsa.shared.an.b r0 = com.google.android.apps.gsa.shared.p6990an.C89209b.f241838a
            java.util.Collections.sort(r5, r0)
        L_0x0596:
            java.util.Iterator r0 = r5.iterator()
            r13 = 0
        L_0x059b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05b0
            java.lang.Object r2 = r0.next()
            com.google.android.libraries.searchbox.root.RootSuggestion r2 = (com.google.android.libraries.searchbox.root.RootSuggestion) r2
            int r4 = r13 + 1
            r2.f108833e = r13
            r6 = 0
            r2.f108832d = r6
            r13 = r4
            goto L_0x059b
        L_0x05b0:
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r2 = r5.iterator()
        L_0x05b8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0608
            java.lang.Object r4 = r2.next()
            com.google.android.libraries.searchbox.root.RootSuggestion r4 = (com.google.android.libraries.searchbox.root.RootSuggestion) r4
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r5 = new com.google.android.libraries.searchbox.shared.suggestion.Suggestion
            java.lang.CharSequence r6 = r4.f108908i
            int r8 = r4.f108909j
            int r9 = r4.f108910k
            com.google.common.b.gu r10 = r4.f108925z
            android.os.Bundle r11 = new android.os.Bundle
            android.os.Bundle r12 = r4.f108911l
            r11.<init>(r12)
            java.lang.String r12 = r4.f108913n
            int r13 = r4.f108916q
            java.lang.Integer r14 = r4.f108915p
            r16 = r2
            int r2 = r4.f108917r
            r19 = r7
            com.google.at.h.d.a.aq r7 = r4.f108906A
            com.google.android.libraries.searchbox.shared.suggestion.e r4 = r4.f108907B
            r23 = r5
            r24 = r6
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r2
            r33 = r7
            r34 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.mo55395g(r5)
            r2 = r16
            r7 = r19
            goto L_0x05b8
        L_0x0608:
            r19 = r7
            com.google.android.libraries.searchbox.shared.response.Response r2 = new com.google.android.libraries.searchbox.shared.response.Response
            com.google.android.apps.gsa.shared.search.Query r4 = r3.f239556a
            java.lang.String r12 = r4.mo84352bk()
            com.google.common.b.gu r13 = r0.mo55394f()
            int r0 = r3.f239557b
            java.lang.String r4 = r3.f239558c
            long r5 = r3.f239560e
            r11 = r2
            r14 = r15
            r15 = r0
            r16 = r4
            r17 = r5
            r20 = r22
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r20)
            r0 = r39
            r0.mo44212a(r2)
            if (r38 == 0) goto L_0x0666
            com.google.android.apps.gsa.searchbox.c.a.c r0 = r1.f239473e
            r3 = r37
            r0.mo82195o(r3)
            return
        L_0x0637:
            r22 = r9
            r15 = r14
            r35 = r3
            r3 = r0
            r0 = r35
            if (r2 == 0) goto L_0x0666
            com.google.android.libraries.searchbox.shared.response.Response r2 = new com.google.android.libraries.searchbox.shared.response.Response
            com.google.android.apps.gsa.searchbox.c.t r3 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r3
            com.google.android.apps.gsa.shared.search.Query r4 = r3.f239556a
            java.lang.String r12 = r4.mo84352bk()
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            int r4 = r3.f239557b
            java.lang.String r5 = r3.f239558c
            long r6 = r3.f239560e
            r19 = 1
            r11 = r2
            r14 = r15
            r15 = r4
            r16 = r5
            r17 = r6
            r20 = r22
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r20)
            r0.mo44212a(r2)
        L_0x0666:
            return
        L_0x0667:
            r0 = move-exception
            monitor-exit(r36)     // Catch:{ all -> 0x0667 }
            goto L_0x066b
        L_0x066a:
            throw r0
        L_0x066b:
            goto L_0x066a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.C88607k.mo82262k(com.google.android.libraries.searchbox.shared.b.a, com.google.android.libraries.searchbox.root.a, com.google.android.libraries.searchbox.root.a.e):void");
    }

    /* renamed from: l */
    public final void mo82263l(C41642a aVar, List list, C41631e eVar) {
        int i;
        this.f239470b.set(this.f239469a.mo26871c());
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f239469a.mo26871c();
            C60870cx m = ((C88582c) it.next()).mo82236m(aVar);
            if (m == null) {
                C58976aa aaVar = C58975e.f156826a;
            } else {
                arrayList.add(m);
                ((C88616t) aVar).f239556a.mo84352bk();
                this.f239475g.mo28211k(m, "MixerResponseCallback", new C88605i(this, aVar, eVar));
            }
        }
        boolean z = ((C88616t) aVar).f239556a.mo84352bk().length() < this.f239478j;
        C22871g gVar = this.f239475g;
        if (z) {
            i = this.f239494z;
        } else {
            i = this.f239468A;
        }
        gVar.mo28213m("ShortTimeoutRequest", (long) i, new C88602f(this, aVar, arrayList, z));
    }

    /* renamed from: m */
    public final void mo82264m(C41642a aVar, List list, int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f239475g.mo28213m("FinalTimeoutRequest", (long) i, new C88601e(this, aVar, list, i));
    }

    /* renamed from: o */
    public final boolean mo82265o(C41642a aVar) {
        boolean z;
        synchronized (this) {
            C41642a aVar2 = this.f239476h;
            z = true;
            if (aVar2 != null) {
                if (((C88616t) aVar2).f239560e >= ((C88616t) aVar).f239560e) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: p */
    public final synchronized boolean mo82266p(C41642a aVar) {
        return this.f239471c.containsKey(aVar);
    }
}
