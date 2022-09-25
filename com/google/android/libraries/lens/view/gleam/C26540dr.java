package com.google.android.libraries.lens.view.gleam;

import android.os.Build;
import android.os.Trace;
import android.view.Choreographer;
import android.widget.FrameLayout;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.gleam.region.C26618i;
import com.google.android.libraries.lens.view.gleam.region.C26620k;
import com.google.android.libraries.lens.view.livingsurfaces.C27251j;
import com.google.android.libraries.lens.view.main.C27354cq;
import com.google.android.libraries.lens.view.main.C27384dt;
import com.google.android.libraries.lens.view.p2069am.C25293aa;
import com.google.android.libraries.lens.view.p2078at.C25499ae;
import com.google.android.libraries.lens.view.p2082av.C25579c;
import com.google.android.libraries.lens.view.p2082av.C25582f;
import com.google.android.libraries.lens.view.p2082av.C25585i;
import com.google.android.libraries.lens.view.p2082av.C25586j;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.render.C27661c;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3694d.C47601a;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3694d.C47602b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.gleam.dr */
/* compiled from: PG */
public final class C26540dr {

    /* renamed from: a */
    public static final C58974d f72331a = C58974d.m91135i("GleamFragment");

    /* renamed from: b */
    public static final boolean f72332b = "robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A */
    public C58833ax f72333A;

    /* renamed from: B */
    private final C69464a f72334B;

    /* renamed from: C */
    private final boolean f72335C;

    /* renamed from: c */
    final C26510co f72336c;

    /* renamed from: d */
    public final AccountId f72337d;

    /* renamed from: e */
    public final C26526dd f72338e;

    /* renamed from: f */
    public final C21370a f72339f;

    /* renamed from: g */
    public final C25989d f72340g;

    /* renamed from: h */
    public final C27251j f72341h;

    /* renamed from: i */
    public final C26586ff f72342i;

    /* renamed from: j */
    public final C26244b f72343j;

    /* renamed from: k */
    public final C28310af f72344k;

    /* renamed from: l */
    public final C26603l f72345l;

    /* renamed from: m */
    public final C28306ab f72346m;

    /* renamed from: n */
    final C25499ae f72347n;

    /* renamed from: o */
    public final LensConnectivityManager f72348o;

    /* renamed from: p */
    public final boolean f72349p;

    /* renamed from: q */
    public final boolean f72350q;

    /* renamed from: r */
    public final boolean f72351r;

    /* renamed from: s */
    public final Choreographer.FrameCallback f72352s;

    /* renamed from: t */
    public C27661c f72353t;

    /* renamed from: u */
    public C25752a f72354u;

    /* renamed from: v */
    public C26559ej f72355v;

    /* renamed from: w */
    public GleamingView f72356w;

    /* renamed from: x */
    public C26581fa f72357x;

    /* renamed from: y */
    public FrameLayout f72358y;

    /* renamed from: z */
    public C58833ax f72359z;

    public C26540dr(C26510co coVar, AccountId accountId, C26526dd ddVar, C21370a aVar, C25989d dVar, C27251j jVar, C69464a aVar2, C26586ff ffVar, C26244b bVar, C28310af afVar, C26603l lVar, C28306ab abVar, C25499ae aeVar, LensConnectivityManager lensConnectivityManager, boolean z, boolean z2, C47602b bVar2, boolean z3, boolean z4) {
        C58836b bVar3 = C58836b.f156633a;
        this.f72359z = bVar3;
        this.f72333A = bVar3;
        this.f72336c = coVar;
        this.f72337d = accountId;
        this.f72338e = ddVar;
        this.f72339f = aVar;
        this.f72340g = dVar;
        this.f72341h = jVar;
        this.f72334B = aVar2;
        this.f72342i = ffVar;
        this.f72343j = bVar;
        this.f72344k = afVar;
        this.f72345l = lVar;
        this.f72346m = abVar;
        this.f72347n = aeVar;
        this.f72348o = lensConnectivityManager;
        this.f72349p = z;
        this.f72335C = z2;
        this.f72350q = z3;
        this.f72351r = z4;
        this.f72352s = new C47601a(bVar2, new C26529dg(this));
    }

    /* renamed from: a */
    public static C26510co m49015a(AccountId accountId) {
        C26510co coVar = new C26510co();
        C68324h.m98669f(coVar);
        C47247a.m84047b(coVar, accountId);
        return coVar;
    }

    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r5v79, types: [com.google.android.libraries.lens.view.gleam.af] */
    /* JADX WARNING: type inference failed for: r5v80, types: [com.google.android.libraries.lens.view.gleam.ar] */
    /* JADX WARNING: type inference failed for: r5v81, types: [com.google.android.libraries.lens.view.gleam.ac] */
    /* JADX WARNING: type inference failed for: r5v82, types: [com.google.android.libraries.lens.view.gleam.ab] */
    /* JADX WARNING: type inference failed for: r5v83, types: [com.google.android.libraries.lens.view.gleam.at] */
    /* JADX WARNING: type inference failed for: r5v84, types: [com.google.android.libraries.lens.view.gleam.bx] */
    /* JADX WARNING: type inference failed for: r5v85, types: [com.google.android.libraries.lens.view.gleam.aq] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0285, code lost:
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0286, code lost:
        if (r6 == null) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0288, code lost:
        r6.mo31660j();
        r5 = com.google.common.base.C58833ax.m90834k(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0290, code lost:
        r5 = com.google.common.base.C58836b.f156633a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0292, code lost:
        r5 = (com.google.android.libraries.lens.view.gleam.C26447af) r5.mo56111f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0298, code lost:
        if (r5 == null) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x029a, code lost:
        r6 = r2.f72405k;
        r7 = com.google.android.libraries.lens.view.p2069am.C25349y.m46667a(r5.f71963a.f68848i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02a4, code lost:
        if (r7 != null) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02a6, code lost:
        r7 = com.google.android.libraries.lens.view.p2069am.C25349y.UNRECOGNIZED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ac, code lost:
        if (r6.mo31778a(r7) == false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02ae, code lost:
        r3 = r5.f71963a.f68845f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b2, code lost:
        r12 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0209, code lost:
        r25 = r14;
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021e, code lost:
        r6 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021f, code lost:
        r25 = r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02d6 A[Catch:{ all -> 0x044a }, LOOP:3: B:118:0x02d0->B:120:0x02d6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0300 A[Catch:{ all -> 0x044a }, LOOP:4: B:122:0x02fe->B:123:0x0300, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0314 A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0315 A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0365 A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03b8 A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03c0 A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080 A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1 A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ad A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf A[Catch:{ all -> 0x044a }, LOOP:1: B:46:0x00c9->B:48:0x00cf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f8 A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0140 A[Catch:{ all -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148 A[Catch:{ all -> 0x044a }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.lens.view.gleam.C26539dq mo31809b(com.google.android.libraries.lens.view.p2069am.C25312at r27, boolean r28) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            boolean r2 = r1.f72335C
            if (r2 == 0) goto L_0x0046
            com.google.android.libraries.lens.view.render.c r2 = r1.f72353t
            if (r2 != 0) goto L_0x0046
            com.google.android.libraries.lens.view.am.ar r2 = r0.f68872a
            if (r2 != 0) goto L_0x0012
            com.google.android.libraries.lens.view.am.ar r2 = com.google.android.libraries.lens.view.p2069am.C25310ar.f68865c
        L_0x0012:
            com.google.protobuf.cq r2 = r2.f68867a
            java.util.Iterator r2 = r2.iterator()
        L_0x0018:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r2.next()
            com.google.android.libraries.lens.view.am.ap r3 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r3
            boolean r3 = com.google.android.libraries.lens.view.gleam.C26551eb.m49040e(r3)
            if (r3 == 0) goto L_0x0018
            if (r28 == 0) goto L_0x0046
            g.a.a r2 = r1.f72334B
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.libraries.lens.view.render.c r2 = (com.google.android.libraries.lens.view.render.C27661c) r2
            r1.f72353t = r2
            android.widget.FrameLayout r3 = r1.f72358y
            com.google.android.libraries.lens.view.gleam.co r4 = r1.f72336c
            android.content.Context r4 = r4.getContext()
            com.google.android.libraries.lens.view.gleam.df r5 = new com.google.android.libraries.lens.view.gleam.df
            r5.<init>(r1)
            r2.mo33159f(r3, r4, r5)
        L_0x0046:
            com.google.android.libraries.lens.view.render.c r2 = r1.f72353t
            r3 = 0
            if (r2 == 0) goto L_0x006d
            if (r28 == 0) goto L_0x006a
            com.google.android.libraries.lens.view.render.p r0 = r2.mo33154a(r0)
            com.google.android.libraries.lens.view.am.at r2 = r0.f75566b
            com.google.lens.k.d r0 = r0.f75565a
            com.google.android.libraries.lens.view.render.c r4 = r1.f72353t
            boolean r4 = r4.mo33158e(r0)
            if (r4 == 0) goto L_0x0068
            com.google.android.libraries.lens.view.gleam.ff r5 = r1.f72342i
            boolean r0 = com.google.android.libraries.lens.view.render.C27660b.m51465a(r0)
            r5.f72477d = r0
            r5.mo31853e()
        L_0x0068:
            r0 = r2
            goto L_0x006e
        L_0x006a:
            r2.mo33155b()
        L_0x006d:
            r4 = 0
        L_0x006e:
            com.google.android.libraries.lens.view.gleam.ej r2 = r1.f72355v
            java.lang.String r5 = "GleamingView:updateGleams"
            android.os.Trace.beginSection(r5)     // Catch:{ all -> 0x044a }
            boolean r5 = r0.f68873b     // Catch:{ all -> 0x044a }
            r15 = 1
            if (r5 == 0) goto L_0x007c
            r2.f72386E = r15     // Catch:{ all -> 0x044a }
        L_0x007c:
            boolean r5 = r2.f72419y     // Catch:{ all -> 0x044a }
            if (r5 == 0) goto L_0x009d
            com.google.android.libraries.lens.view.am.ar r5 = r0.f68872a     // Catch:{ all -> 0x044a }
            if (r5 != 0) goto L_0x0086
            com.google.android.libraries.lens.view.am.ar r5 = com.google.android.libraries.lens.view.p2069am.C25310ar.f68865c     // Catch:{ all -> 0x044a }
        L_0x0086:
            com.google.protobuf.cq r5 = r5.f68867a     // Catch:{ all -> 0x044a }
            int r5 = r5.size()     // Catch:{ all -> 0x044a }
            if (r5 != 0) goto L_0x009d
            com.google.android.libraries.lens.view.am.ar r5 = r2.f72384C     // Catch:{ all -> 0x044a }
            com.google.protobuf.cq r5 = r5.f68867a     // Catch:{ all -> 0x044a }
            int r5 = r5.size()     // Catch:{ all -> 0x044a }
            if (r5 != 0) goto L_0x009d
            android.os.Trace.endSection()
            goto L_0x0444
        L_0x009d:
            com.google.android.libraries.lens.view.am.ar r0 = r0.f68872a     // Catch:{ all -> 0x044a }
            if (r0 != 0) goto L_0x00a3
            com.google.android.libraries.lens.view.am.ar r0 = com.google.android.libraries.lens.view.p2069am.C25310ar.f68865c     // Catch:{ all -> 0x044a }
        L_0x00a3:
            r2.f72384C = r0     // Catch:{ all -> 0x044a }
            com.google.common.base.ax r0 = r2.f72410p     // Catch:{ all -> 0x044a }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x044a }
            if (r0 == 0) goto L_0x00b8
            com.google.common.base.ax r0 = r2.f72410p     // Catch:{ all -> 0x044a }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.aw.a.b r0 = (com.google.android.libraries.lens.view.p2083aw.p2084a.C25591b) r0     // Catch:{ all -> 0x044a }
            r0.mo30688i()     // Catch:{ all -> 0x044a }
        L_0x00b8:
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x044a }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x044a }
            r14.<init>()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.ap r5 = r2.f72398d     // Catch:{ all -> 0x044a }
            com.google.common.b.gu r5 = r5.f72053b     // Catch:{ all -> 0x044a }
            com.google.common.b.sm r5 = r5.listIterator(r3)     // Catch:{ all -> 0x044a }
        L_0x00c9:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x044a }
            if (r6 == 0) goto L_0x00e1
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.af r6 = (com.google.android.libraries.lens.view.gleam.C26447af) r6     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.ap r7 = r6.f71963a     // Catch:{ all -> 0x044a }
            int r7 = r7.f68845f     // Catch:{ all -> 0x044a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x044a }
            r14.put(r7, r6)     // Catch:{ all -> 0x044a }
            goto L_0x00c9
        L_0x00e1:
            java.lang.String r5 = "GleamingView:updateGleams gleam iteration"
            android.os.Trace.beginSection(r5)     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.ar r5 = r2.f72384C     // Catch:{ all -> 0x044a }
            com.google.protobuf.cq r5 = r5.f68867a     // Catch:{ all -> 0x044a }
            java.util.Iterator r19 = r5.iterator()     // Catch:{ all -> 0x044a }
            r13 = -1
            r12 = -1
            r20 = -1
        L_0x00f2:
            boolean r5 = r19.hasNext()     // Catch:{ all -> 0x044a }
            if (r5 == 0) goto L_0x02c1
            java.lang.Object r5 = r19.next()     // Catch:{ all -> 0x044a }
            r9 = r5
            com.google.android.libraries.lens.view.am.ap r9 = (com.google.android.libraries.lens.view.p2069am.C25308ap) r9     // Catch:{ all -> 0x044a }
            int r5 = r9.f68845f     // Catch:{ all -> 0x044a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x044a }
            java.lang.Object r5 = r14.get(r5)     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.af r5 = (com.google.android.libraries.lens.view.gleam.C26447af) r5     // Catch:{ all -> 0x044a }
            if (r5 == 0) goto L_0x014f
            com.google.android.libraries.lens.view.am.ap r6 = r5.f71963a     // Catch:{ all -> 0x044a }
            r5.f71963a = r9     // Catch:{ all -> 0x044a }
            r5.mo31657g()     // Catch:{ all -> 0x044a }
            r5.mo31666n(r6)     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.ap r6 = r5.f71963a     // Catch:{ all -> 0x044a }
            int r6 = r6.f68845f     // Catch:{ all -> 0x044a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x044a }
            r14.remove(r6)     // Catch:{ all -> 0x044a }
            if (r20 == 0) goto L_0x0132
            com.google.android.libraries.lens.view.am.ap r6 = r5.f71963a     // Catch:{ all -> 0x044a }
            int r6 = r6.f68845f     // Catch:{ all -> 0x044a }
            int r7 = r2.f72387F     // Catch:{ all -> 0x044a }
            if (r6 != r7) goto L_0x012d
            goto L_0x0134
        L_0x012d:
            r25 = r14
            r1 = -1
            goto L_0x02b3
        L_0x0132:
            r20 = 0
        L_0x0134:
            com.google.android.libraries.lens.view.gleam.cl r6 = r2.f72405k     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.ap r7 = r5.f71963a     // Catch:{ all -> 0x044a }
            int r7 = r7.f68848i     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.y r7 = com.google.android.libraries.lens.view.p2069am.C25349y.m46667a(r7)     // Catch:{ all -> 0x044a }
            if (r7 != 0) goto L_0x0142
            com.google.android.libraries.lens.view.am.y r7 = com.google.android.libraries.lens.view.p2069am.C25349y.UNRECOGNIZED     // Catch:{ all -> 0x044a }
        L_0x0142:
            boolean r6 = r6.mo31778a(r7)     // Catch:{ all -> 0x044a }
            if (r6 == 0) goto L_0x012d
            com.google.android.libraries.lens.view.am.ap r6 = r5.f71963a     // Catch:{ all -> 0x044a }
            int r6 = r6.f68845f     // Catch:{ all -> 0x044a }
            r20 = r6
            goto L_0x012d
        L_0x014f:
            com.google.android.libraries.lens.view.gleam.GleamingView r5 = r2.f72403i     // Catch:{ all -> 0x044a }
            int r10 = r5.getWidth()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.GleamingView r5 = r2.f72403i     // Catch:{ all -> 0x044a }
            int r11 = r5.getHeight()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.y r5 = com.google.android.libraries.lens.view.p2069am.C25349y.UNKNOWN     // Catch:{ all -> 0x044a }
            int r5 = r9.f68848i     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.y r5 = com.google.android.libraries.lens.view.p2069am.C25349y.m46667a(r5)     // Catch:{ all -> 0x044a }
            if (r5 != 0) goto L_0x0167
            com.google.android.libraries.lens.view.am.y r5 = com.google.android.libraries.lens.view.p2069am.C25349y.UNRECOGNIZED     // Catch:{ all -> 0x044a }
        L_0x0167:
            int r5 = r5.ordinal()     // Catch:{ all -> 0x044a }
            r6 = 0
            switch(r5) {
                case 0: goto L_0x0274;
                case 1: goto L_0x025e;
                case 2: goto L_0x0274;
                case 3: goto L_0x0274;
                case 4: goto L_0x0274;
                case 5: goto L_0x0223;
                case 6: goto L_0x020f;
                case 7: goto L_0x01f7;
                case 8: goto L_0x01c1;
                case 9: goto L_0x0274;
                case 10: goto L_0x0274;
                case 11: goto L_0x0175;
                case 12: goto L_0x0274;
                default: goto L_0x016f;
            }     // Catch:{ all -> 0x044a }
        L_0x016f:
            r3 = r12
            r25 = r14
        L_0x0172:
            r1 = -1
            goto L_0x0286
        L_0x0175:
            com.google.android.libraries.lens.view.flags.b r5 = r2.f72397c     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.a r7 = com.google.android.libraries.lens.view.flags.C26239a.EDUCATION_MATH_GLEAMS_TYPE     // Catch:{ all -> 0x044a }
            long r7 = r5.mo31456b(r7)     // Catch:{ all -> 0x044a }
            r16 = 0
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 != 0) goto L_0x019b
            com.google.android.libraries.lens.view.gleam.af r16 = new com.google.android.libraries.lens.view.gleam.af     // Catch:{ all -> 0x044a }
            android.content.Context r6 = r2.f72412r     // Catch:{ all -> 0x044a }
            com.google.android.libraries.f.a r8 = r2.f72396b     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.b r7 = r2.f72397c     // Catch:{ all -> 0x044a }
            r5 = r16
            r17 = r7
            r7 = r2
            r3 = r12
            r12 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x044a }
            r25 = r14
            r6 = r16
            goto L_0x0172
        L_0x019b:
            r3 = r12
            com.google.android.libraries.lens.view.flags.b r5 = r2.f72397c     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.a r7 = com.google.android.libraries.lens.view.flags.C26239a.EDUCATION_MATH_GLEAMS_TYPE     // Catch:{ all -> 0x044a }
            long r7 = r5.mo31456b(r7)     // Catch:{ all -> 0x044a }
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x01be
            com.google.android.libraries.lens.view.gleam.aq r16 = new com.google.android.libraries.lens.view.gleam.aq     // Catch:{ all -> 0x044a }
            android.content.Context r6 = r2.f72412r     // Catch:{ all -> 0x044a }
            com.google.android.libraries.f.a r8 = r2.f72396b     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.b r12 = r2.f72397c     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.filters.e.d r7 = r2.f72402h     // Catch:{ all -> 0x044a }
            r5 = r16
            r17 = r7
            r7 = r2
            r1 = -1
            r13 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x044a }
            goto L_0x0209
        L_0x01be:
            r1 = -1
            goto L_0x021f
        L_0x01c1:
            r3 = r12
            r1 = -1
            int r5 = r9.f68843d     // Catch:{ all -> 0x044a }
            r7 = 21
            if (r5 != r7) goto L_0x01ce
            java.lang.Object r5 = r9.f68844e     // Catch:{ all -> 0x044a }
            com.google.lens.e.ad r5 = (com.google.lens.p4699e.C62191ad) r5     // Catch:{ all -> 0x044a }
            goto L_0x01d0
        L_0x01ce:
            com.google.lens.e.ad r5 = com.google.lens.p4699e.C62191ad.f167916k     // Catch:{ all -> 0x044a }
        L_0x01d0:
            int r5 = r5.f167919b     // Catch:{ all -> 0x044a }
            r7 = 2
            if (r5 != r7) goto L_0x01e3
            com.google.android.libraries.lens.view.gleam.bx r13 = new com.google.android.libraries.lens.view.gleam.bx     // Catch:{ all -> 0x044a }
            android.content.Context r6 = r2.f72412r     // Catch:{ all -> 0x044a }
            com.google.android.libraries.f.a r8 = r2.f72396b     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.b r12 = r2.f72397c     // Catch:{ all -> 0x044a }
            r5 = r13
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x044a }
            goto L_0x021e
        L_0x01e3:
            boolean r5 = com.google.android.libraries.lens.view.gleam.C26551eb.m49040e(r9)     // Catch:{ all -> 0x044a }
            if (r5 != 0) goto L_0x021f
            com.google.android.libraries.lens.view.gleam.at r13 = new com.google.android.libraries.lens.view.gleam.at     // Catch:{ all -> 0x044a }
            android.content.Context r6 = r2.f72412r     // Catch:{ all -> 0x044a }
            com.google.android.libraries.f.a r8 = r2.f72396b     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.b r12 = r2.f72397c     // Catch:{ all -> 0x044a }
            r5 = r13
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x044a }
            goto L_0x021e
        L_0x01f7:
            r3 = r12
            r1 = -1
            com.google.android.libraries.lens.view.gleam.ab r16 = new com.google.android.libraries.lens.view.gleam.ab     // Catch:{ all -> 0x044a }
            android.content.Context r6 = r2.f72412r     // Catch:{ all -> 0x044a }
            com.google.android.libraries.f.a r8 = r2.f72396b     // Catch:{ all -> 0x044a }
            com.google.apps.tiktok.media.e r12 = r2.f72409o     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.b r13 = r2.f72397c     // Catch:{ all -> 0x044a }
            r5 = r16
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x044a }
        L_0x0209:
            r25 = r14
            r6 = r16
            goto L_0x0286
        L_0x020f:
            r3 = r12
            r1 = -1
            com.google.android.libraries.lens.view.gleam.ac r13 = new com.google.android.libraries.lens.view.gleam.ac     // Catch:{ all -> 0x044a }
            android.content.Context r6 = r2.f72412r     // Catch:{ all -> 0x044a }
            com.google.android.libraries.f.a r8 = r2.f72396b     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.b r12 = r2.f72397c     // Catch:{ all -> 0x044a }
            r5 = r13
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x044a }
        L_0x021e:
            r6 = r13
        L_0x021f:
            r25 = r14
            goto L_0x0286
        L_0x0223:
            r3 = r12
            r1 = -1
            com.google.android.libraries.lens.view.gleam.bw r21 = new com.google.android.libraries.lens.view.gleam.bw     // Catch:{ all -> 0x044a }
            android.content.Context r6 = r2.f72412r     // Catch:{ all -> 0x044a }
            com.google.android.libraries.f.a r8 = r2.f72396b     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.b r12 = r2.f72397c     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.filters.e.d r13 = r2.f72402h     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.filters.translation.dc r5 = r2.f72408n     // Catch:{ all -> 0x044a }
            boolean r16 = r5.mo31318k()     // Catch:{ all -> 0x044a }
            float r7 = r2.f72414t     // Catch:{ all -> 0x044a }
            float r5 = r2.f72415u     // Catch:{ all -> 0x044a }
            android.graphics.Matrix r17 = new android.graphics.Matrix     // Catch:{ all -> 0x044a }
            r17.<init>()     // Catch:{ all -> 0x044a }
            android.graphics.Matrix r18 = new android.graphics.Matrix     // Catch:{ all -> 0x044a }
            r18.<init>()     // Catch:{ all -> 0x044a }
            r22 = r5
            r5 = r21
            r23 = r7
            r7 = r2
            r24 = r13
            r13 = r17
            r25 = r14
            r14 = r18
            r15 = r24
            r17 = r23
            r18 = r22
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x044a }
            r6 = r21
            goto L_0x0286
        L_0x025e:
            r3 = r12
            r25 = r14
            r1 = -1
            boolean r5 = r2.f72418x     // Catch:{ all -> 0x044a }
            if (r5 == 0) goto L_0x0286
            com.google.android.libraries.lens.view.gleam.ar r13 = new com.google.android.libraries.lens.view.gleam.ar     // Catch:{ all -> 0x044a }
            android.content.Context r6 = r2.f72412r     // Catch:{ all -> 0x044a }
            com.google.android.libraries.f.a r8 = r2.f72396b     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.b r12 = r2.f72397c     // Catch:{ all -> 0x044a }
            r5 = r13
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x044a }
            goto L_0x0285
        L_0x0274:
            r3 = r12
            r25 = r14
            r1 = -1
            com.google.android.libraries.lens.view.gleam.af r13 = new com.google.android.libraries.lens.view.gleam.af     // Catch:{ all -> 0x044a }
            android.content.Context r6 = r2.f72412r     // Catch:{ all -> 0x044a }
            com.google.android.libraries.f.a r8 = r2.f72396b     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.flags.b r12 = r2.f72397c     // Catch:{ all -> 0x044a }
            r5 = r13
            r7 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x044a }
        L_0x0285:
            r6 = r13
        L_0x0286:
            if (r6 == 0) goto L_0x0290
            r6.mo31660j()     // Catch:{ all -> 0x044a }
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r6)     // Catch:{ all -> 0x044a }
            goto L_0x0292
        L_0x0290:
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x044a }
        L_0x0292:
            java.lang.Object r5 = r5.mo56111f()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.af r5 = (com.google.android.libraries.lens.view.gleam.C26447af) r5     // Catch:{ all -> 0x044a }
            if (r5 == 0) goto L_0x02b2
            com.google.android.libraries.lens.view.gleam.cl r6 = r2.f72405k     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.ap r7 = r5.f71963a     // Catch:{ all -> 0x044a }
            int r7 = r7.f68848i     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.y r7 = com.google.android.libraries.lens.view.p2069am.C25349y.m46667a(r7)     // Catch:{ all -> 0x044a }
            if (r7 != 0) goto L_0x02a8
            com.google.android.libraries.lens.view.am.y r7 = com.google.android.libraries.lens.view.p2069am.C25349y.UNRECOGNIZED     // Catch:{ all -> 0x044a }
        L_0x02a8:
            boolean r6 = r6.mo31778a(r7)     // Catch:{ all -> 0x044a }
            if (r6 == 0) goto L_0x02b2
            com.google.android.libraries.lens.view.am.ap r3 = r5.f71963a     // Catch:{ all -> 0x044a }
            int r3 = r3.f68845f     // Catch:{ all -> 0x044a }
        L_0x02b2:
            r12 = r3
        L_0x02b3:
            if (r5 == 0) goto L_0x02b8
            r0.mo55395g(r5)     // Catch:{ all -> 0x044a }
        L_0x02b8:
            r1 = r26
            r14 = r25
            r3 = 0
            r13 = -1
            r15 = 1
            goto L_0x00f2
        L_0x02c1:
            r3 = r12
            r25 = r14
            r1 = -1
            android.os.Trace.endSection()     // Catch:{ all -> 0x044a }
            java.util.Collection r5 = r25.values()     // Catch:{ all -> 0x044a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x044a }
        L_0x02d0:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x044a }
            if (r6 == 0) goto L_0x02e0
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.af r6 = (com.google.android.libraries.lens.view.gleam.C26447af) r6     // Catch:{ all -> 0x044a }
            r6.mo31679w()     // Catch:{ all -> 0x044a }
            goto L_0x02d0
        L_0x02e0:
            com.google.android.libraries.lens.view.gleam.ap r5 = r2.f72398d     // Catch:{ all -> 0x044a }
            com.google.common.b.gu r0 = r0.mo55394f()     // Catch:{ all -> 0x044a }
            r5.f72053b = r0     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.cl r0 = r2.f72405k     // Catch:{ all -> 0x044a }
            r0.invalidateRoot()     // Catch:{ all -> 0x044a }
            android.util.SparseArray r5 = r0.f72236b     // Catch:{ all -> 0x044a }
            r5.clear()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.ej r5 = r0.f72235a     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.ap r5 = r5.f72398d     // Catch:{ all -> 0x044a }
            com.google.common.b.gu r5 = r5.f72053b     // Catch:{ all -> 0x044a }
            r6 = r5
            com.google.common.b.pq r6 = (com.google.common.p4522b.C58724pq) r6     // Catch:{ all -> 0x044a }
            int r6 = r6.f156474d     // Catch:{ all -> 0x044a }
            r7 = 0
        L_0x02fe:
            if (r7 >= r6) goto L_0x0312
            java.lang.Object r8 = r5.get(r7)     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.af r8 = (com.google.android.libraries.lens.view.gleam.C26447af) r8     // Catch:{ all -> 0x044a }
            android.util.SparseArray r9 = r0.f72236b     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.am.ap r10 = r8.f71963a     // Catch:{ all -> 0x044a }
            int r10 = r10.f68845f     // Catch:{ all -> 0x044a }
            r9.put(r10, r8)     // Catch:{ all -> 0x044a }
            int r7 = r7 + 1
            goto L_0x02fe
        L_0x0312:
            if (r3 == r1) goto L_0x0315
            goto L_0x0317
        L_0x0315:
            r3 = r20
        L_0x0317:
            if (r3 == r1) goto L_0x032b
            int r0 = r2.f72387F     // Catch:{ all -> 0x044a }
            if (r0 == r3) goto L_0x032b
            boolean r0 = r2.f72382A     // Catch:{ all -> 0x044a }
            if (r0 == 0) goto L_0x032b
            com.google.android.libraries.lens.view.gleam.cl r0 = r2.f72405k     // Catch:{ all -> 0x044a }
            r1 = 32768(0x8000, float:4.5918E-41)
            r0.sendEventForVirtualView$ar$ds(r3, r1)     // Catch:{ all -> 0x044a }
            r2.f72387F = r3     // Catch:{ all -> 0x044a }
        L_0x032b:
            com.google.android.libraries.lens.view.gleam.er r0 = r2.f72399e     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.ap r1 = r2.f72398d     // Catch:{ all -> 0x044a }
            com.google.common.b.gu r1 = r1.f72053b     // Catch:{ all -> 0x044a }
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)     // Catch:{ all -> 0x044a }
            java.lang.Class<com.google.android.libraries.lens.view.gleam.bw> r3 = com.google.android.libraries.lens.view.gleam.C26491bw.class
            p3186j$.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.ef r5 = new com.google.android.libraries.lens.view.gleam.ef     // Catch:{ all -> 0x044a }
            r5.<init>(r3)     // Catch:{ all -> 0x044a }
            j$.util.stream.Stream r1 = r1.filter(r5)     // Catch:{ all -> 0x044a }
            java.lang.Class<com.google.android.libraries.lens.view.gleam.bw> r3 = com.google.android.libraries.lens.view.gleam.C26491bw.class
            p3186j$.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.eg r5 = new com.google.android.libraries.lens.view.gleam.eg     // Catch:{ all -> 0x044a }
            r5.<init>(r3)     // Catch:{ all -> 0x044a }
            j$.util.stream.Stream r1 = r1.map(r5)     // Catch:{ all -> 0x044a }
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ all -> 0x044a }
            java.lang.Object r1 = r1.collect(r3)     // Catch:{ all -> 0x044a }
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1     // Catch:{ all -> 0x044a }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x044a }
            r3.<init>()     // Catch:{ all -> 0x044a }
            int r5 = r1.size()     // Catch:{ all -> 0x044a }
            r6 = 0
        L_0x0363:
            if (r6 >= r5) goto L_0x03b1
            java.lang.Object r7 = r1.get(r6)     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.bw r7 = (com.google.android.libraries.lens.view.gleam.C26491bw) r7     // Catch:{ all -> 0x044a }
            boolean r8 = r7.mo31752O()     // Catch:{ all -> 0x044a }
            if (r8 == 0) goto L_0x03ad
            com.google.common.base.ax r8 = r7.mo31741D()     // Catch:{ all -> 0x044a }
            boolean r8 = r8.mo56113h()     // Catch:{ all -> 0x044a }
            if (r8 != 0) goto L_0x037c
            goto L_0x03ad
        L_0x037c:
            com.google.common.base.ax r7 = r7.mo31741D()     // Catch:{ all -> 0x044a }
            java.lang.Object r7 = r7.mo56107c()     // Catch:{ all -> 0x044a }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x044a }
            long r7 = r7.longValue()     // Catch:{ all -> 0x044a }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x044a }
            boolean r8 = r3.containsKey(r7)     // Catch:{ all -> 0x044a }
            if (r8 == 0) goto L_0x03a2
            java.lang.Object r8 = r3.get(r7)     // Catch:{ all -> 0x044a }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x044a }
            r8.getClass()
            int r8 = r8.intValue()     // Catch:{ all -> 0x044a }
            goto L_0x03a3
        L_0x03a2:
            r8 = 0
        L_0x03a3:
            r9 = 1
            int r8 = r8 + r9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x044a }
            r3.put(r7, r8)     // Catch:{ all -> 0x044a }
            goto L_0x03ae
        L_0x03ad:
            r9 = 1
        L_0x03ae:
            int r6 = r6 + 1
            goto L_0x0363
        L_0x03b1:
            r9 = 1
            boolean r5 = r3.isEmpty()     // Catch:{ all -> 0x044a }
            if (r5 == 0) goto L_0x03c0
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x044a }
            r0.f72430b = r1     // Catch:{ all -> 0x044a }
            goto L_0x0436
        L_0x03c0:
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.ep r5 = com.google.android.libraries.lens.view.gleam.C26569ep.f72427a     // Catch:{ all -> 0x044a }
            java.util.Comparator r5 = p3186j$.util.Comparator.CC.comparing(r5)     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.eq r6 = com.google.android.libraries.lens.view.gleam.C26570eq.f72428a     // Catch:{ all -> 0x044a }
            java.util.Comparator r5 = p3186j$.util.Comparator.EL.thenComparing((java.util.Comparator) r5, (p3186j$.util.function.Function) r6)     // Catch:{ all -> 0x044a }
            java.lang.Object r3 = java.util.Collections.max(r3, r5)     // Catch:{ all -> 0x044a }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x044a }
            java.lang.Object r5 = r3.getKey()     // Catch:{ all -> 0x044a }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x044a }
            r5.getClass()
            long r5 = r5.longValue()     // Catch:{ all -> 0x044a }
            r3.getValue()     // Catch:{ all -> 0x044a }
            r1.size()     // Catch:{ all -> 0x044a }
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x044a }
            int r7 = r1.size()     // Catch:{ all -> 0x044a }
            r8 = 0
        L_0x03f2:
            if (r8 >= r7) goto L_0x0430
            java.lang.Object r10 = r1.get(r8)     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.bw r10 = (com.google.android.libraries.lens.view.gleam.C26491bw) r10     // Catch:{ all -> 0x044a }
            boolean r11 = r10.mo31752O()     // Catch:{ all -> 0x044a }
            if (r11 == 0) goto L_0x042a
            com.google.common.base.ax r11 = r10.mo31741D()     // Catch:{ all -> 0x044a }
            boolean r11 = r11.mo56113h()     // Catch:{ all -> 0x044a }
            if (r11 != 0) goto L_0x040b
            goto L_0x042a
        L_0x040b:
            com.google.common.base.ax r11 = r10.mo31741D()     // Catch:{ all -> 0x044a }
            java.lang.Object r11 = r11.mo56107c()     // Catch:{ all -> 0x044a }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x044a }
            java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x044a }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x044a }
            if (r11 == 0) goto L_0x0425
            r3.mo55395g(r10)     // Catch:{ all -> 0x044a }
            r10.f72171x = r9     // Catch:{ all -> 0x044a }
            goto L_0x0428
        L_0x0425:
            r11 = 0
            r10.f72171x = r11     // Catch:{ all -> 0x044a }
        L_0x0428:
            r11 = 0
            goto L_0x042d
        L_0x042a:
            r11 = 0
            r10.f72171x = r11     // Catch:{ all -> 0x044a }
        L_0x042d:
            int r8 = r8 + 1
            goto L_0x03f2
        L_0x0430:
            com.google.common.b.gu r1 = r3.mo55394f()     // Catch:{ all -> 0x044a }
            r0.f72430b = r1     // Catch:{ all -> 0x044a }
        L_0x0436:
            com.google.android.libraries.lens.view.gleam.HomographyTrackedTextContainerView r0 = r2.f72400f     // Catch:{ all -> 0x044a }
            r0.invalidate()     // Catch:{ all -> 0x044a }
            com.google.android.libraries.lens.view.gleam.HomographyTrackedTextContainerView r0 = r2.f72401g     // Catch:{ all -> 0x044a }
            r0.invalidate()     // Catch:{ all -> 0x044a }
            android.os.Trace.endSection()
            r3 = 1
        L_0x0444:
            com.google.android.libraries.lens.view.gleam.dq r0 = new com.google.android.libraries.lens.view.gleam.dq
            r0.<init>(r3, r4)
            return r0
        L_0x044a:
            r0 = move-exception
            android.os.Trace.endSection()
            goto L_0x0450
        L_0x044f:
            throw r0
        L_0x0450:
            goto L_0x044f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gleam.C26540dr.mo31809b(com.google.android.libraries.lens.view.am.at, boolean):com.google.android.libraries.lens.view.gleam.dq");
    }

    /* renamed from: c */
    public final C26620k mo31810c() {
        C26618i iVar = (C26618i) this.f72336c.getChildFragmentManager().f634a.mo671c("region_fragment_tag");
        if (iVar != null) {
            return iVar.mo17754z();
        }
        return null;
    }

    /* renamed from: d */
    public final void mo31811d() {
        C26581fa faVar = this.f72357x;
        if (faVar != null) {
            Collection.EL.forEach(faVar.f72459e, C26579ez.f72451a);
            faVar.f72459e.clear();
        }
    }

    /* renamed from: e */
    public final void mo31812e() {
        if (!f72332b) {
            Choreographer instance = Choreographer.getInstance();
            Choreographer.FrameCallback frameCallback = this.f72352s;
            frameCallback.getClass();
            instance.postFrameCallback(frameCallback);
        }
        C26581fa faVar = this.f72357x;
        faVar.getClass();
        faVar.f72465k = null;
        if (faVar.f72460f) {
            try {
                Trace.beginSection("GleamingView:updateViewsTriggering");
                long micros = TimeUnit.NANOSECONDS.toMicros(faVar.f72458d.mo26872d());
                if (faVar.f72461g != 0) {
                    if (((long) faVar.f72459e.size()) < 5) {
                        if (!faVar.f72459e.isEmpty() && ((C28097c) faVar.f72459e.element()).f76484b <= faVar.f72462h) {
                            Trace.beginSection("Past timestamp.");
                            faVar.mo31840a(faVar.f72462h);
                            Trace.endSection();
                        }
                        if (faVar.f72463i) {
                            Trace.beginSection("AlreadyUpdatedThisFrame");
                            Trace.endSection();
                            faVar.mo31841b(true);
                            Trace.endSection();
                            return;
                        } else if (faVar.f72459e.isEmpty()) {
                            Trace.beginSection("Empty");
                            Trace.endSection();
                            faVar.mo31841b(true);
                            Trace.endSection();
                            return;
                        } else {
                            long j = (C26581fa.f72456b + micros) - faVar.f72461g;
                            long j2 = ((C28097c) faVar.f72459e.element()).f76484b - faVar.f72462h;
                            long j3 = j - j2;
                            Trace.beginSection("Diff");
                            long j4 = C26581fa.f72456b;
                            long j5 = (-j4) / 2;
                            if (j3 > j5) {
                                faVar.f72463i = true;
                                faVar.mo31840a(((C28097c) faVar.f72459e.element()).f76484b);
                            } else if (micros - faVar.f72464j > C26581fa.f72455a && j3 + j4 > j5) {
                                Trace.beginSection("Reduce");
                                faVar.f72463i = true;
                                faVar.f72464j = micros;
                                faVar.mo31840a(((C28097c) faVar.f72459e.element()).f76484b);
                                Trace.endSection();
                            } else if (j2 > C26581fa.f72457c) {
                                faVar.f72463i = true;
                                faVar.mo31840a(((C28097c) faVar.f72459e.element()).f76484b);
                            }
                            faVar.mo31841b(true);
                            Trace.endSection();
                            Trace.endSection();
                            return;
                        }
                    }
                }
                Trace.beginSection("CleanUp");
                while (!faVar.f72459e.isEmpty()) {
                    faVar.f72465k = (C28097c) faVar.f72459e.remove();
                    faVar.mo31841b(false);
                }
                faVar.mo31841b(true);
                Trace.endSection();
            } finally {
                Trace.endSection();
            }
        } else if (!faVar.f72459e.isEmpty()) {
            faVar.mo31842c((C28097c) faVar.f72459e.remove());
        }
    }

    /* renamed from: f */
    public final void mo31813f(C28097c cVar) {
        GleamingView gleamingView = this.f72356w;
        gleamingView.mo31637f();
        gleamingView.f71933a.mo31827f();
        mo31815h(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo31814g(C26447af afVar) {
        if (afVar == null) {
            this.f72342i.mo31852d(C58836b.f156633a);
        } else {
            this.f72342i.mo31852d(C58833ax.m90833j(Integer.valueOf(afVar.f71963a.f68845f)));
        }
        if (afVar != null && !(afVar instanceof C26491bw)) {
            C26603l lVar = this.f72345l;
            C25293aa aaVar = afVar.f71963a.f68855p;
            if (aaVar == null) {
                aaVar = C25293aa.f68800c;
            }
            lVar.mo31871c(aaVar.f68802a);
        }
    }

    /* renamed from: h */
    public final void mo31815h(C28097c cVar) {
        try {
            Trace.beginSection("GleamFragment:updateGleams sync rendering");
            C27354cq cqVar = (C27354cq) this.f72333A.mo56111f();
            if (cqVar != null) {
                C27384dt dtVar = cqVar.f74846a;
                dtVar.f74951au = C58833ax.m90834k(Long.valueOf(cVar.f76484b));
                C25582f fVar = dtVar.f74916aL;
                if (fVar != null) {
                    C25586j a = fVar.mo17754z();
                    C58838bb.m90883r(a.f69618d.mo56113h());
                    if (!((C25579c) a.f69618d.mo56107c()).mo30666f(cVar)) {
                        ((C58970a) ((C58970a) C25586j.f69615a.mo56226d()).mo56372aa(50184)).mo56386p("changeCameraView called with invalid frame.");
                    } else if (!a.f69620f) {
                        ((C58970a) ((C58970a) C25586j.f69615a.mo56226d()).mo56372aa(50183)).mo56386p("changeCameraView called before textures are available");
                    } else {
                        for (C25585i iVar : a.f69619e) {
                            iVar.f69613a.setVisibility(4);
                        }
                        a.f69619e[cVar.f76486d].f69613a.setVisibility(0);
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }
}
