package com.google.android.apps.gsa.search.core.google.p6794d;

import com.google.android.apps.gsa.search.core.p6816p.C86247cc;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p417d.p418a.C8523ac;
import com.google.p395al.p417d.p418a.C8533am;
import com.google.p395al.p417d.p418a.C8594u;
import com.google.p4500cm.p4518d.p4519a.C58178a;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.o */
/* compiled from: PG */
public final class C85948o implements C91043j {

    /* renamed from: c */
    private static final C59071e f232397c = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.d.o");

    /* renamed from: d */
    private static final C63088z f232398d = C63088z.m96143E("/*\"\"*/");

    /* renamed from: a */
    boolean f232399a = false;

    /* renamed from: b */
    public final StringBuilder f232400b = new StringBuilder();

    /* renamed from: e */
    private final C85935b f232401e;

    /* renamed from: f */
    private final C85947n f232402f;

    /* renamed from: g */
    private final AtomicInteger f232403g = new AtomicInteger();

    /* renamed from: h */
    private final C68214a f232404h;

    /* renamed from: i */
    private boolean f232405i;

    /* renamed from: j */
    private boolean f232406j;

    /* renamed from: k */
    private boolean f232407k;

    /* renamed from: l */
    private boolean f232408l;

    /* renamed from: m */
    private String f232409m;

    /* renamed from: n */
    private String f232410n;

    /* renamed from: o */
    private C58179b f232411o = null;

    /* renamed from: p */
    private Boolean f232412p = null;

    /* renamed from: q */
    private boolean f232413q;

    /* renamed from: r */
    private boolean f232414r;

    /* renamed from: s */
    private boolean f232415s;

    /* renamed from: t */
    private boolean f232416t;

    /* renamed from: u */
    private boolean f232417u;

    /* renamed from: v */
    private boolean f232418v;

    /* renamed from: w */
    private boolean f232419w;

    /* renamed from: x */
    private int f232420x = 1;

    public C85948o(C85935b bVar, C85947n nVar, C68214a aVar) {
        bVar.getClass();
        this.f232401e = bVar;
        nVar.getClass();
        this.f232402f = nVar;
        this.f232404h = aVar;
    }

    /* renamed from: e */
    private final void m138170e() {
        if (!this.f232406j) {
            C58976aa aaVar = C58975e.f156826a;
            this.f232406j = true;
            this.f232402f.mo79599i();
        }
    }

    /* renamed from: f */
    private static boolean m138171f(C8523ac acVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C8594u.f29736g);
        acVar.mo58887l(r0);
        Object l = acVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C8594u uVar = (C8594u) obj;
        return uVar.f29739b && (uVar.f29738a & 2) == 0;
    }

    /* renamed from: g */
    private final boolean m138172g(C8523ac acVar, boolean z) {
        Object obj;
        Object obj2;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r0 = C62942bv.checkIsLite(C8594u.f29736g);
        acVar.mo58887l(r0);
        Object l = acVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C58179b bVar = ((C8594u) obj).f29742e;
        if (bVar == null) {
            bVar = C58179b.f155534j;
        }
        boolean z2 = bVar.f155542g;
        C58179b bVar2 = this.f232411o;
        if (bVar2 == null) {
            bVar2 = bVar;
        } else if (bVar != null) {
            try {
                bVar2 = (C58179b) ((C58178a) ((C58178a) bVar2.toBuilder()).mergeFrom(bVar.toByteArray(), C62921ba.m95368a())).build();
            } catch (C62974ct e) {
                C59104x d = f232397c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PelletDemultiplexer");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8100)).mo56386p("Re-encoding protobuf should not cause exception");
                int i = C90755l.f253831a;
            }
        } else {
            C59104x d2 = f232397c.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PelletDemultiplexer");
            ((C59052c) ((C59052c) d2).mo56372aa(8099)).mo56386p("No card metadata received - this affects logging.");
        }
        this.f232411o = bVar2;
        C62940bt r3 = C62942bv.checkIsLite(C8533am.f29593t);
        acVar.mo58887l(r3);
        Object l2 = acVar.f169962ag.mo58854l(r3.f169971d);
        if (l2 == null) {
            obj2 = r3.f169969b;
        } else {
            obj2 = r3.mo58889c(l2);
        }
        C8533am amVar = (C8533am) obj2;
        if (this.f232412p == null && (amVar.f29595a & 8) != 0) {
            this.f232412p = Boolean.valueOf(amVar.f29598d);
        }
        if (z2) {
            return true;
        }
        if (z) {
            String str = (amVar.f29595a & 4) != 0 ? amVar.f29597c : null;
            if ((bVar2.f155536a & 2) != 0) {
                str = bVar2.f155538c;
            }
            this.f232402f.mo79611u(new C86247cc(acVar.f29567b, str, bVar2, this.f232412p));
            this.f232411o = null;
            this.f232412p = null;
            return false;
        }
        this.f232402f.mo79615y(bVar);
        return false;
    }

    /* renamed from: b */
    public final void mo79616b(Throwable th) {
        this.f232402f.mo79595c();
        try {
            mo79617c(th == null);
        } catch (C90457d e) {
            if (th == null) {
                th = e;
            } else {
                C59104x d = f232397c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PelletDemultiplexer");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(8114)).mo56386p("Suppressing additional exception in finally block.");
            }
        }
        if (th != null) {
            this.f232402f.mo79594b(th);
        }
    }

    /* renamed from: c */
    public final void mo79617c(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        m138170e();
        boolean z2 = this.f232416t;
        if (z2 && this.f232410n == null && !this.f232418v) {
            throw new C90457d(C89885b.GWS_MISSING_CONTENT_TYPE_VALUE);
        } else if (this.f232415s && !z2 && !this.f232419w && !this.f232417u) {
            throw new C90457d(C89885b.GWS_RESPONSE_EMPTY_VALUE);
        } else if (this.f232417u && !this.f232418v) {
            throw new C90457d(C89885b.GWS_FETCH_INTERRUPTED_VALUE);
        } else if (z) {
            C58838bb.m90884s(!this.f232414r, "onEndOfResponse should not be called twice");
            this.f232414r = true;
            if (this.f232415s && !this.f232413q) {
                C59104x d = f232397c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PelletDemultiplexer");
                ((C59052c) ((C59052c) d).mo56372aa(8115)).mo56386p("#endOfResponse before web search data complete");
            }
            this.f232401e.mo79587e();
            this.f232402f.mo79594b((Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:332:0x085e  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x087f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17709a(com.google.android.apps.gsa.search.core.google.p6794d.C85945l r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = 0
            if (r2 != 0) goto L_0x0008
            return r3
        L_0x0008:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protobuf.MessageLite r0 = r2.f232395c
            boolean r5 = r0 instanceof com.google.p4017at.p4060h.p4068b.p4069a.C54196m
            if (r5 == 0) goto L_0x0018
            com.google.at.h.b.a.m r0 = (com.google.p4017at.p4060h.p4068b.p4069a.C54196m) r0
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r5 = 1
            if (r0 == 0) goto L_0x0022
            com.google.android.apps.gsa.search.core.google.d.n r2 = r1.f232402f
            r2.mo79605o(r0)
            return r5
        L_0x0022:
            com.google.al.d.a.ac r7 = r21.mo79592a()
            java.lang.String r8 = "PelletDemultiplexer"
            if (r7 != 0) goto L_0x003d
            com.google.common.f.e r0 = f232397c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r8)
            java.lang.String r2 = "Received a PelletData without either a GetRenderedCardsStreamingResponse or ResponseChunk"
            r4 = 8123(0x1fbb, float:1.1383E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r2)
            return r3
        L_0x003d:
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8533am.f29593t
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r9 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r9 = r9.mo58857o(r0)
            com.google.protobuf.MessageLite r0 = r2.f232395c
            boolean r10 = r0 instanceof com.google.p395al.p417d.p418a.C8523ac
            r11 = 3
            if (r10 == 0) goto L_0x005a
            com.google.al.d.a.ac r0 = (com.google.p395al.p417d.p418a.C8523ac) r0
            int r0 = r0.f29568c
            goto L_0x006d
        L_0x005a:
            boolean r10 = r0 instanceof com.google.p4017at.p4060h.p4068b.p4069a.C54196m
            if (r10 == 0) goto L_0x006c
            com.google.at.h.b.a.m r0 = (com.google.p4017at.p4060h.p4068b.p4069a.C54196m) r0
            int r10 = r0.f142234b
            if (r10 != r11) goto L_0x006c
            java.lang.Object r0 = r0.f142235c
            com.google.at.h.b.a.u r0 = (com.google.p4017at.p4060h.p4068b.p4069a.C54204u) r0
            long r12 = r0.f142258f
            int r0 = (int) r12
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 <= 0) goto L_0x0074
            com.google.android.apps.gsa.search.core.google.d.n r10 = r1.f232402f
            r10.mo79613w(r0)
        L_0x0074:
            com.google.android.apps.gsa.search.core.google.d.n r0 = r1.f232402f
            int r10 = r2.f232396d
            r0.mo79601k(r10)
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8521aa.f29559e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r10 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r10.mo58857o(r0)
            java.lang.String r10 = "P"
            if (r0 == 0) goto L_0x00cd
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8521aa.f29559e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r12 = r7.f169962ag
            com.google.protobuf.bs r13 = r0.f169971d
            java.lang.Object r12 = r12.mo58854l(r13)
            if (r12 != 0) goto L_0x00a6
            java.lang.Object r0 = r0.f169969b
            goto L_0x00aa
        L_0x00a6:
            java.lang.Object r0 = r0.mo58889c(r12)
        L_0x00aa:
            com.google.al.d.a.aa r0 = (com.google.p395al.p417d.p418a.C8521aa) r0
            com.google.android.apps.gsa.search.core.google.d.n r12 = r1.f232402f
            r12.mo79608r(r0)
            com.google.protobuf.cq r12 = r0.f29563c
            int r12 = r12.size()
            if (r12 == 0) goto L_0x00c8
            com.google.android.apps.gsa.search.core.google.d.n r12 = r1.f232402f
            com.google.protobuf.cq r0 = r0.f29563c
            java.lang.String[] r13 = new java.lang.String[r3]
            java.lang.Object[] r0 = r0.toArray(r13)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r12.mo79609s(r0)
        L_0x00c8:
            r4.append(r10)
            r0 = 1
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            com.google.protobuf.bt r12 = com.google.p395al.p417d.p418a.C8598y.f29751g
            com.google.protobuf.bt r12 = com.google.protobuf.C62942bv.checkIsLite(r12)
            r7.mo58887l(r12)
            com.google.protobuf.bf r13 = r7.f169962ag
            com.google.protobuf.bs r12 = r12.f169971d
            boolean r12 = r13.mo58857o(r12)
            if (r12 == 0) goto L_0x0110
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8598y.f29751g
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r12 = r7.f169962ag
            com.google.protobuf.bs r13 = r0.f169971d
            java.lang.Object r12 = r12.mo58854l(r13)
            if (r12 != 0) goto L_0x00f7
            java.lang.Object r0 = r0.f169969b
            goto L_0x00fb
        L_0x00f7:
            java.lang.Object r0 = r0.mo58889c(r12)
        L_0x00fb:
            com.google.al.d.a.y r0 = (com.google.p395al.p417d.p418a.C8598y) r0
            com.google.android.apps.gsa.search.core.google.d.n r12 = r1.f232402f
            java.lang.String r13 = r7.f29567b
            r12.mo79607q(r0, r13)
            r1.f232417u = r5
            boolean r0 = r0.f29757e
            if (r0 == 0) goto L_0x010c
            r1.f232418v = r5
        L_0x010c:
            r4.append(r10)
            r0 = 1
        L_0x0110:
            com.google.protobuf.bt r10 = com.google.p395al.p417d.p418a.C8527ag.f29576e
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r7.mo58887l(r10)
            com.google.protobuf.bf r12 = r7.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r10 = r12.mo58857o(r10)
            if (r10 == 0) goto L_0x0174
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8527ag.f29576e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r10 = r7.f169962ag
            com.google.protobuf.bs r12 = r0.f169971d
            java.lang.Object r10 = r10.mo58854l(r12)
            if (r10 != 0) goto L_0x0139
            java.lang.Object r0 = r0.f169969b
            goto L_0x013d
        L_0x0139:
            java.lang.Object r0 = r0.mo58889c(r10)
        L_0x013d:
            com.google.al.d.a.ag r0 = (com.google.p395al.p417d.p418a.C8527ag) r0
            com.google.protobuf.z r10 = r0.f29580c
            int r0 = r10.mo59031d()
            if (r0 == 0) goto L_0x016e
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x015b }
            com.google.at.h.d.a.ar r12 = com.google.p4017at.p4060h.p4073d.p4074a.C54229ar.f142352d     // Catch:{ ct -> 0x015b }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r12, (com.google.protobuf.C63088z) r10, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x015b }
            com.google.at.h.d.a.ar r0 = (com.google.p4017at.p4060h.p4073d.p4074a.C54229ar) r0     // Catch:{ ct -> 0x015b }
            com.google.android.apps.gsa.search.core.google.d.n r12 = r1.f232402f     // Catch:{ ct -> 0x015b }
            java.lang.String r13 = r7.f29567b     // Catch:{ ct -> 0x015b }
            r12.mo79598g(r13, r0)     // Catch:{ ct -> 0x015b }
            goto L_0x016e
        L_0x015b:
            r0 = move-exception
            com.google.common.f.e r12 = f232397c
            com.google.common.f.x r12 = r12.mo56225c()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r13, r8)
            java.lang.String r13 = "Failed to create SuggestResponse. SuggestProtoBytes: %s"
            r14 = 8110(0x1fae, float:1.1365E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56382g(r0)).mo56372aa(r14)).mo56389s(r13, r10)
        L_0x016e:
            java.lang.String r0 = "S"
            r4.append(r0)
            r0 = 1
        L_0x0174:
            boolean r10 = m138171f(r7)
            if (r10 == 0) goto L_0x01bf
            r20.m138170e()
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8594u.f29736g
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r10 = r7.f169962ag
            com.google.protobuf.bs r12 = r0.f169971d
            java.lang.Object r10 = r10.mo58854l(r12)
            if (r10 != 0) goto L_0x0193
            java.lang.Object r0 = r0.f169969b
            goto L_0x0197
        L_0x0193:
            java.lang.Object r0 = r0.mo58889c(r10)
        L_0x0197:
            com.google.al.d.a.u r0 = (com.google.p395al.p417d.p418a.C8594u) r0
            int r0 = r0.f29738a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01a6
            boolean r0 = r1.m138172g(r7, r5)
            r1.f232399a = r0
            goto L_0x01b8
        L_0x01a6:
            com.google.common.f.e r0 = f232397c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r10, r8)
            java.lang.String r10 = "EOC pellet had null card metadata. This is not expected!"
            r12 = 8103(0x1fa7, float:1.1355E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r12)).mo56386p(r10)
        L_0x01b8:
            java.lang.String r0 = "E"
            r4.append(r0)
            r10 = 1
            goto L_0x01c0
        L_0x01bf:
            r10 = r0
        L_0x01c0:
            java.lang.String r12 = "]"
            if (r9 == 0) goto L_0x0742
            java.lang.String r14 = r2.f232393a
            boolean r0 = r2.f232394b
            com.google.protobuf.bt r2 = com.google.p395al.p417d.p418a.C8533am.f29593t
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r15 = r7.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r15.mo58857o(r2)
            com.google.common.base.C58838bb.m90868c(r2)
            com.google.protobuf.bt r2 = com.google.p395al.p417d.p418a.C8533am.f29593t
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r7.mo58887l(r2)
            com.google.protobuf.bf r15 = r7.f169962ag
            com.google.protobuf.bs r6 = r2.f169971d
            java.lang.Object r6 = r15.mo58854l(r6)
            if (r6 != 0) goto L_0x01f2
            java.lang.Object r2 = r2.f169969b
            goto L_0x01f6
        L_0x01f2:
            java.lang.Object r2 = r2.mo58889c(r6)
        L_0x01f6:
            com.google.al.d.a.am r2 = (com.google.p395al.p417d.p418a.C8533am) r2
            r1.f232415s = r5
            int r6 = r2.f29595a
            r6 = r6 & 32
            if (r6 == 0) goto L_0x020a
            com.google.protobuf.z r6 = r2.f29602h
            int r6 = r6.mo59031d()
            if (r6 <= 0) goto L_0x020a
            r1.f232416t = r5
        L_0x020a:
            java.lang.String r6 = r1.f232409m
            r15 = 4
            if (r6 != 0) goto L_0x021d
            int r6 = r2.f29595a
            r6 = r6 & r15
            if (r6 == 0) goto L_0x021d
            java.lang.String r6 = r2.f29597c
            r1.f232409m = r6
            com.google.android.apps.gsa.search.core.google.d.n r15 = r1.f232402f
            r15.mo79597f(r6)
        L_0x021d:
            java.lang.String r6 = r1.f232410n
            if (r6 != 0) goto L_0x0230
            int r6 = r2.f29595a
            r6 = r6 & 64
            if (r6 == 0) goto L_0x0230
            java.lang.String r6 = r2.f29603i
            r1.f232410n = r6
            com.google.android.apps.gsa.search.core.google.d.n r15 = r1.f232402f
            r15.mo79596e(r6)
        L_0x0230:
            int r6 = r2.f29595a
            r15 = 2097152(0x200000, float:2.938736E-39)
            r6 = r6 & r15
            if (r6 == 0) goto L_0x0242
            com.google.android.apps.gsa.search.core.google.d.n r6 = r1.f232402f
            com.google.knowledge.d.f r15 = r2.f29612r
            if (r15 != 0) goto L_0x023f
            com.google.knowledge.d.f r15 = com.google.knowledge.p4682d.C61995f.f167540a
        L_0x023f:
            r6.mo79610t(r15)
        L_0x0242:
            com.google.protobuf.bt r6 = com.google.p395al.p417d.p418a.C8594u.f29736g
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r7.mo58887l(r6)
            com.google.protobuf.bf r15 = r7.f169962ag
            com.google.protobuf.bs r11 = r6.f169971d
            java.lang.Object r11 = r15.mo58854l(r11)
            if (r11 != 0) goto L_0x0258
            java.lang.Object r6 = r6.f169969b
            goto L_0x025c
        L_0x0258:
            java.lang.Object r6 = r6.mo58889c(r11)
        L_0x025c:
            com.google.al.d.a.u r6 = (com.google.p395al.p417d.p418a.C8594u) r6
            int r6 = r6.f29738a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x029c
            boolean r6 = m138171f(r7)
            if (r6 != 0) goto L_0x029c
            boolean r6 = r1.f232399a
            if (r6 == 0) goto L_0x0289
            boolean r6 = r1.m138172g(r7, r5)
            r1.f232399a = r3
            if (r6 == 0) goto L_0x02b0
            com.google.common.f.e r6 = f232397c
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r11, r8)
            java.lang.String r11 = "SRP pellet expects continuation. This is not expected!"
            r15 = 8132(0x1fc4, float:1.1395E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r15)).mo56386p(r11)
            goto L_0x02b0
        L_0x0289:
            com.google.common.f.e r6 = f232397c
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r11, r8)
            java.lang.String r11 = "SRP metadata pellet arriving with no prior EOC pellet"
            r15 = 8129(0x1fc1, float:1.1391E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r15)).mo56386p(r11)
            goto L_0x02b0
        L_0x029c:
            int r6 = r7.f29566a
            r6 = r6 & r5
            if (r6 == 0) goto L_0x02b0
            java.lang.String r6 = r7.f29567b
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x02b0
            com.google.android.apps.gsa.search.core.google.d.n r6 = r1.f232402f
            java.lang.String r11 = r7.f29567b
            r6.mo79604n(r11)
        L_0x02b0:
            int r6 = r2.f29595a
            r6 = r6 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x02c5
            boolean r6 = r2.f29605k
            boolean r11 = r1.f232405i
            if (r11 != 0) goto L_0x02c5
            if (r6 == 0) goto L_0x02c5
            r1.f232405i = r5
            com.google.android.apps.gsa.search.core.google.d.n r6 = r1.f232402f
            r6.mo79602l()
        L_0x02c5:
            boolean r6 = r1.f232407k
            if (r6 != 0) goto L_0x0314
            com.google.protobuf.ch r6 = r2.f29599e
            int r6 = r6.size()
            if (r6 != 0) goto L_0x02d5
            boolean r6 = r2.f29596b
            if (r6 == 0) goto L_0x0314
        L_0x02d5:
            r1.f232407k = r5
            com.google.android.apps.gsa.search.core.google.d.n r6 = r1.f232402f
            com.google.protobuf.ch r11 = r2.f29599e
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x02e6
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x0311
        L_0x02e6:
            com.google.common.b.gp r15 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r11 = r11.iterator()
        L_0x02ee:
            boolean r16 = r11.hasNext()
            if (r16 == 0) goto L_0x030d
            java.lang.Object r16 = r11.next()
            java.lang.Integer r16 = (java.lang.Integer) r16
            int r16 = r16.intValue()
            com.google.al.d.b r16 = com.google.p395al.p417d.C8600b.m23279a(r16)
            if (r16 != 0) goto L_0x0306
            com.google.al.d.b r16 = com.google.p395al.p417d.C8600b.NO_MODES
        L_0x0306:
            r3 = r16
            r15.mo55395g(r3)
            r3 = 0
            goto L_0x02ee
        L_0x030d:
            com.google.common.b.gu r11 = r15.mo55394f()
        L_0x0311:
            r6.mo79603m(r11)
        L_0x0314:
            boolean r3 = r1.f232408l
            if (r3 != 0) goto L_0x03bb
            com.google.protobuf.cq r3 = r2.f29608n
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0324
            boolean r3 = r2.f29596b
            if (r3 == 0) goto L_0x03bb
        L_0x0324:
            r1.f232408l = r5
            com.google.al.d.a.bc r3 = com.google.p395al.p417d.p418a.C8575bc.f29690g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.al.d.a.az r3 = (com.google.p395al.p417d.p418a.C8546az) r3
            com.google.protobuf.cq r11 = r2.f29608n
            java.util.Iterator r11 = r11.iterator()
        L_0x0334:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0394
            java.lang.Object r15 = r11.next()
            java.lang.String r15 = (java.lang.String) r15
            com.google.al.d.a.bb r16 = com.google.p395al.p417d.p418a.C8574bb.f29685d
            com.google.protobuf.bn r16 = r16.createBuilder()
            r6 = r16
            com.google.al.d.a.ba r6 = (com.google.p395al.p417d.p418a.C8573ba) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r13 = r6.instance
            com.google.al.d.a.bb r13 = (com.google.p395al.p417d.p418a.C8574bb) r13
            r15.getClass()
            r17 = r11
            int r11 = r13.f29687a
            r11 = r11 | r5
            r13.f29687a = r11
            r13.f29688b = r15
            r6.copyOnWrite()
            com.google.protobuf.bv r11 = r6.instance
            com.google.al.d.a.bb r11 = (com.google.p395al.p417d.p418a.C8574bb) r11
            int r13 = r11.f29687a
            r15 = 2
            r13 = r13 | r15
            r11.f29687a = r13
            r13 = 71
            r11.f29689c = r13
            com.google.protobuf.bv r6 = r6.build()
            com.google.al.d.a.bb r6 = (com.google.p395al.p417d.p418a.C8574bb) r6
            r3.copyOnWrite()
            com.google.protobuf.bv r11 = r3.instance
            com.google.al.d.a.bc r11 = (com.google.p395al.p417d.p418a.C8575bc) r11
            r6.getClass()
            com.google.protobuf.cq r13 = r11.f29694c
            boolean r15 = r13.mo58948c()
            if (r15 != 0) goto L_0x038c
            com.google.protobuf.cq r13 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r13)
            r11.f29694c = r13
        L_0x038c:
            com.google.protobuf.cq r11 = r11.f29694c
            r11.add(r6)
            r11 = r17
            goto L_0x0334
        L_0x0394:
            int r6 = r2.f29595a
            r11 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 & r11
            if (r6 == 0) goto L_0x03b0
            java.lang.String r6 = r2.f29610p
            r3.copyOnWrite()
            com.google.protobuf.bv r11 = r3.instance
            com.google.al.d.a.bc r11 = (com.google.p395al.p417d.p418a.C8575bc) r11
            r6.getClass()
            int r13 = r11.f29692a
            r15 = 2
            r13 = r13 | r15
            r11.f29692a = r13
            r11.f29695d = r6
        L_0x03b0:
            com.google.android.apps.gsa.search.core.google.d.n r6 = r1.f232402f
            com.google.protobuf.bv r3 = r3.build()
            com.google.al.d.a.bc r3 = (com.google.p395al.p417d.p418a.C8575bc) r3
            r6.mo79614x(r3)
        L_0x03bb:
            boolean r3 = r1.f232408l
            if (r3 != 0) goto L_0x040b
            int r3 = r2.f29595a
            r6 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x03c6
            goto L_0x03ca
        L_0x03c6:
            boolean r6 = r2.f29596b
            if (r6 == 0) goto L_0x040b
        L_0x03ca:
            r1.f232408l = r5
            r6 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r6
            if (r3 == 0) goto L_0x0400
            com.google.android.apps.gsa.search.core.google.d.n r3 = r1.f232402f
            com.google.al.d.a.bc r6 = r2.f29609o
            if (r6 != 0) goto L_0x03da
            com.google.al.d.a.bc r6 = com.google.p395al.p417d.p418a.C8575bc.f29690g
        L_0x03da:
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.al.d.a.az r6 = (com.google.p395al.p417d.p418a.C8546az) r6
            java.lang.String r11 = r2.f29610p
            r6.copyOnWrite()
            com.google.protobuf.bv r13 = r6.instance
            com.google.al.d.a.bc r13 = (com.google.p395al.p417d.p418a.C8575bc) r13
            r11.getClass()
            int r15 = r13.f29692a
            r16 = 2
            r15 = r15 | 2
            r13.f29692a = r15
            r13.f29695d = r11
            com.google.protobuf.bv r6 = r6.build()
            com.google.al.d.a.bc r6 = (com.google.p395al.p417d.p418a.C8575bc) r6
            r3.mo79614x(r6)
            goto L_0x040b
        L_0x0400:
            com.google.android.apps.gsa.search.core.google.d.n r3 = r1.f232402f
            com.google.al.d.a.bc r6 = r2.f29609o
            if (r6 != 0) goto L_0x0408
            com.google.al.d.a.bc r6 = com.google.p395al.p417d.p418a.C8575bc.f29690g
        L_0x0408:
            r3.mo79614x(r6)
        L_0x040b:
            boolean r3 = r1.f232408l
            if (r3 != 0) goto L_0x0447
            int r3 = r2.f29595a
            r6 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r6
            if (r3 == 0) goto L_0x0418
            goto L_0x041c
        L_0x0418:
            boolean r3 = r2.f29596b
            if (r3 == 0) goto L_0x0447
        L_0x041c:
            r1.f232408l = r5
            com.google.android.apps.gsa.search.core.google.d.n r3 = r1.f232402f
            com.google.al.d.a.bc r6 = com.google.p395al.p417d.p418a.C8575bc.f29690g
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.al.d.a.az r6 = (com.google.p395al.p417d.p418a.C8546az) r6
            java.lang.String r11 = r2.f29610p
            r6.copyOnWrite()
            com.google.protobuf.bv r13 = r6.instance
            com.google.al.d.a.bc r13 = (com.google.p395al.p417d.p418a.C8575bc) r13
            r11.getClass()
            int r15 = r13.f29692a
            r16 = 2
            r15 = r15 | 2
            r13.f29692a = r15
            r13.f29695d = r11
            com.google.protobuf.bv r6 = r6.build()
            com.google.al.d.a.bc r6 = (com.google.p395al.p417d.p418a.C8575bc) r6
            r3.mo79614x(r6)
        L_0x0447:
            int r3 = r2.f29595a
            r6 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 & r6
            if (r3 == 0) goto L_0x0455
            com.google.al.d.a.m r3 = r2.f29611q
            if (r3 != 0) goto L_0x0456
            com.google.al.d.a.m r3 = com.google.p395al.p417d.p418a.C8586m.f29714d
            goto L_0x0456
        L_0x0455:
            r3 = 0
        L_0x0456:
            int r6 = r1.f232420x
            int r11 = r6 + -1
            if (r6 == 0) goto L_0x0740
            if (r11 == 0) goto L_0x0496
            if (r11 == r5) goto L_0x048b
            r6 = 2
            if (r11 == r6) goto L_0x0476
            com.google.common.f.e r3 = f232397c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r6, r8)
            java.lang.String r6 = "Unexpected value of mLocationPromptMetadataStatus."
            r11 = 8106(0x1faa, float:1.1359E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r11)).mo56386p(r6)
            goto L_0x04aa
        L_0x0476:
            if (r3 == 0) goto L_0x04aa
            com.google.common.f.e r3 = f232397c
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r6, r8)
            java.lang.String r6 = "Unexpected LocationPromptMetadata set in WebSearchData."
            r11 = 8107(0x1fab, float:1.136E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r11)).mo56386p(r6)
            goto L_0x04aa
        L_0x048b:
            if (r3 == 0) goto L_0x04aa
            r6 = 3
            r1.f232420x = r6
            com.google.android.apps.gsa.search.core.google.d.n r6 = r1.f232402f
            r6.mo79606p(r3)
            goto L_0x04aa
        L_0x0496:
            if (r3 == 0) goto L_0x04a1
            boolean r3 = r3.f29717b
            if (r3 != 0) goto L_0x049d
            goto L_0x04a1
        L_0x049d:
            r3 = 2
            r1.f232420x = r3
            goto L_0x04aa
        L_0x04a1:
            r3 = 3
            r1.f232420x = r3
            com.google.android.apps.gsa.search.core.google.d.n r3 = r1.f232402f
            r6 = 0
            r3.mo79606p(r6)
        L_0x04aa:
            int r3 = r2.f29604j
            com.google.al.d.a.al r3 = com.google.p395al.p417d.p418a.C8532al.m23273a(r3)
            if (r3 != 0) goto L_0x04b4
            com.google.al.d.a.al r3 = com.google.p395al.p417d.p418a.C8532al.HTML
        L_0x04b4:
            com.google.al.d.a.al r6 = com.google.p395al.p417d.p418a.C8532al.JESR
            if (r3 != r6) goto L_0x06a2
            if (r0 == 0) goto L_0x0694
            java.lang.String r3 = r7.f29567b
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8533am.f29593t
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r6 = r7.f169962ag
            com.google.protobuf.bs r11 = r0.f169971d
            java.lang.Object r6 = r6.mo58854l(r11)
            if (r6 != 0) goto L_0x04d2
            java.lang.Object r0 = r0.f169969b
            goto L_0x04d6
        L_0x04d2:
            java.lang.Object r0 = r0.mo58889c(r6)
        L_0x04d6:
            com.google.al.d.a.am r0 = (com.google.p395al.p417d.p418a.C8533am) r0
            com.google.protobuf.bt r6 = com.google.p395al.p417d.p418a.C8594u.f29736g
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r7.mo58887l(r6)
            com.google.protobuf.bf r11 = r7.f169962ag
            com.google.protobuf.bs r13 = r6.f169971d
            java.lang.Object r11 = r11.mo58854l(r13)
            if (r11 != 0) goto L_0x04ee
            java.lang.Object r6 = r6.f169969b
            goto L_0x04f2
        L_0x04ee:
            java.lang.Object r6 = r6.mo58889c(r11)
        L_0x04f2:
            com.google.al.d.a.u r6 = (com.google.p395al.p417d.p418a.C8594u) r6
            com.google.protobuf.bt r11 = com.google.p395al.p417d.p418a.C8533am.f29593t
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r7.mo58887l(r11)
            com.google.protobuf.bf r13 = r7.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r13.mo58857o(r11)
            if (r11 == 0) goto L_0x051b
            boolean r11 = r0.f29596b
            r11 = r11 ^ r5
            java.lang.String r11 = com.google.android.apps.gsa.search.core.google.p6794d.C85949p.m138177b(r11)
            com.google.protobuf.z r13 = r0.f29602h
            java.nio.charset.Charset r15 = com.google.protobuf.C62972cr.f170009a
            java.lang.String r13 = r13.mo59170I(r15)
            java.lang.String r13 = org.json.JSONObject.quote(r13)
            goto L_0x0569
        L_0x051b:
            com.google.protobuf.bt r11 = com.google.p395al.p417d.p418a.C8594u.f29736g
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r7.mo58887l(r11)
            com.google.protobuf.bf r13 = r7.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r13.mo58857o(r11)
            if (r11 == 0) goto L_0x0540
            boolean r11 = r6.f29739b
            r11 = r11 ^ r5
            java.lang.String r11 = com.google.android.apps.gsa.search.core.google.p6794d.C85949p.m138177b(r11)
            com.google.bb.a.pb r13 = r6.f29740c
            if (r13 != 0) goto L_0x053b
            com.google.bb.a.pb r13 = com.google.p4152bb.p4153a.C55349pb.f145830g
        L_0x053b:
            java.lang.String r13 = com.google.android.apps.gsa.search.core.google.p6794d.C85949p.m138178c(r13)
            goto L_0x0569
        L_0x0540:
            com.google.protobuf.bt r11 = com.google.p395al.p417d.p418a.C8596w.f29745e
            com.google.protobuf.bt r11 = com.google.protobuf.C62942bv.checkIsLite(r11)
            r7.mo58887l(r11)
            com.google.protobuf.bf r13 = r7.f169962ag
            com.google.protobuf.bs r11 = r11.f169971d
            boolean r11 = r13.mo58857o(r11)
            if (r11 == 0) goto L_0x0558
            java.lang.String r11 = "-1"
            java.lang.String r13 = "\"\""
            goto L_0x0569
        L_0x0558:
            com.google.common.f.e r11 = com.google.android.apps.gsa.search.core.google.p6794d.C85949p.f232421a
            com.google.common.f.x r11 = r11.mo56225c()
            java.lang.String r13 = "No SRP or action in pellet"
            r15 = 8142(0x1fce, float:1.141E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r15)).mo56386p(r13)
            java.lang.String r11 = "0"
            java.lang.String r13 = ""
        L_0x0569:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r5 = r6.f29738a
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0587
            com.google.cm.d.a.b r5 = r6.f29742e
            if (r5 != 0) goto L_0x057a
            com.google.cm.d.a.b r5 = com.google.p4500cm.p4518d.p4519a.C58179b.f155534j
        L_0x057a:
            java.lang.String r6 = "\"ectcm\":"
            java.lang.String r5 = com.google.android.apps.gsa.search.core.google.p6794d.C85949p.m138178c(r5)
            java.lang.String r5 = r6.concat(r5)
            r15.add(r5)
        L_0x0587:
            com.google.protobuf.ch r5 = r0.f29599e
            int r5 = r5.size()
            r6 = 44
            if (r5 <= 0) goto L_0x05b2
            com.google.common.base.ar r5 = com.google.common.base.C58827ar.m90818c(r6)
            com.google.protobuf.ch r6 = r0.f29599e
            java.lang.String r5 = r5.mo56097d(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r18 = r9
            java.lang.String r9 = "\"modes\":["
            r6.<init>(r9)
            r6.append(r5)
            r6.append(r12)
            java.lang.String r5 = r6.toString()
            r15.add(r5)
            goto L_0x05b4
        L_0x05b2:
            r18 = r9
        L_0x05b4:
            int r5 = r0.f29595a
            r5 = r5 & 16
            java.lang.String r6 = "\""
            if (r5 == 0) goto L_0x05d5
            java.lang.String r5 = r0.f29600f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r19 = r12
            java.lang.String r12 = "\"fp\":\""
            r9.<init>(r12)
            r9.append(r5)
            r9.append(r6)
            java.lang.String r5 = r9.toString()
            r15.add(r5)
            goto L_0x05d7
        L_0x05d5:
            r19 = r12
        L_0x05d7:
            com.google.protobuf.cq r5 = r0.f29601g
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x05ff
            r5 = 44
            com.google.common.base.ar r9 = com.google.common.base.C58827ar.m90818c(r5)
            com.google.protobuf.cq r0 = r0.f29601g
            java.lang.String r0 = r9.mo56097d(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "\"fpil\":\""
            r5.<init>(r9)
            r5.append(r0)
            r5.append(r6)
            java.lang.String r0 = r5.toString()
            r15.add(r0)
        L_0x05ff:
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8596w.f29745e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r5 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r5.mo58857o(r0)
            if (r0 == 0) goto L_0x0668
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8596w.f29745e
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r5 = r7.f169962ag
            com.google.protobuf.bs r6 = r0.f169971d
            java.lang.Object r5 = r5.mo58854l(r6)
            if (r5 != 0) goto L_0x0628
            java.lang.Object r0 = r0.f169969b
            goto L_0x062c
        L_0x0628:
            java.lang.Object r0 = r0.mo58889c(r5)
        L_0x062c:
            com.google.al.d.a.w r0 = (com.google.p395al.p417d.p418a.C8596w) r0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x065a }
            r5.<init>()     // Catch:{ JSONException -> 0x065a }
            java.lang.String r6 = "rcfl"
            int r9 = r0.f29748b     // Catch:{ JSONException -> 0x065a }
            r5.put(r6, r9)     // Catch:{ JSONException -> 0x065a }
            java.lang.String r6 = "er"
            java.lang.String r0 = r0.f29749c     // Catch:{ JSONException -> 0x065a }
            r5.put(r6, r0)     // Catch:{ JSONException -> 0x065a }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x065a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x065a }
            r5.<init>()     // Catch:{ JSONException -> 0x065a }
            java.lang.String r6 = "\"ed\":"
            r5.append(r6)     // Catch:{ JSONException -> 0x065a }
            r5.append(r0)     // Catch:{ JSONException -> 0x065a }
            java.lang.String r0 = r5.toString()     // Catch:{ JSONException -> 0x065a }
            r15.add(r0)     // Catch:{ JSONException -> 0x065a }
            goto L_0x0668
        L_0x065a:
            r0 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.search.core.google.p6794d.C85949p.f232421a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "Failed to create error pellet JSON."
            r9 = 8143(0x1fcf, float:1.1411E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r9)).mo56386p(r6)
        L_0x0668:
            r5 = 44
            com.google.common.base.ar r0 = com.google.common.base.C58827ar.m90818c(r5)
            java.lang.String r0 = r0.mo56097d(r15)
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r3
            r3 = 1
            r5[r3] = r11
            r3 = 2
            r5[r3] = r14
            r3 = 3
            r5[r3] = r13
            r3 = 4
            r5[r3] = r0
            r0 = 5
            java.lang.String r3 = "/*\"\"*/"
            r5[r0] = r3
            java.lang.String r0 = "{\"e\":\"%s\",\"c\":%s,\"u\":\"%s\",\"d\":%s,\"a\":{%s}}%s"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96143E(r0)
            goto L_0x06c2
        L_0x0694:
            r18 = r9
            r19 = r12
            r6 = 0
            com.google.protobuf.z r0 = r2.f29602h
            com.google.protobuf.z r3 = f232398d
            com.google.protobuf.z r0 = r0.mo59177x(r3)
            goto L_0x06c2
        L_0x06a2:
            r18 = r9
            r19 = r12
            r6 = 0
            com.google.al.d.a.al r0 = com.google.p395al.p417d.p418a.C8532al.HTML
            if (r3 != r0) goto L_0x06ae
            com.google.protobuf.z r0 = r2.f29602h
            goto L_0x06c2
        L_0x06ae:
            com.google.common.f.e r0 = f232397c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r5, r8)
            java.lang.String r5 = "Unexpected stream id: %s"
            r9 = 8125(0x1fbd, float:1.1386E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56389s(r5, r3)
            com.google.protobuf.z r0 = r2.f29602h
        L_0x06c2:
            java.util.concurrent.atomic.AtomicInteger r3 = r1.f232403g
            int r3 = r3.getAndIncrement()
            boolean r5 = r1.f232413q
            if (r5 == 0) goto L_0x06f5
            dagger.a r0 = r1.f232404h
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r0 = (com.google.android.apps.gsa.shared.logger.C89911f) r0
            r2 = 18014502(0x112e126, float:2.69775E-38)
            r3 = 29
            r5 = 0
            com.google.android.apps.gsa.shared.logger.e r0 = r0.mo83755a(r5, r2, r3)
            r0.mo83721a()
            com.google.common.f.e r0 = f232397c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r8)
            java.lang.String r2 = "Extra data chunk received after the last chunk for WebSearchData."
            r3 = 8127(0x1fbf, float:1.1388E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x06f3:
            r0 = 1
            goto L_0x0739
        L_0x06f5:
            com.google.android.apps.gsa.search.core.google.d.b r5 = r1.f232401e
            com.google.android.apps.gsa.search.core.aj.i r9 = new com.google.android.apps.gsa.search.core.aj.i
            r9.<init>(r0, r3)
            boolean r0 = r5.mo78289c(r9)
            if (r0 != 0) goto L_0x0704
            r0 = 0
            goto L_0x0739
        L_0x0704:
            boolean r0 = r2.f29596b
            if (r0 == 0) goto L_0x06f3
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8529ai.f29584b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r2 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r2.mo58857o(r0)
            if (r0 != 0) goto L_0x06f3
            r2 = 1
            r1.f232413q = r2
            boolean r0 = r1.f232416t
            if (r0 == 0) goto L_0x06f3
            java.lang.String r0 = r1.f232410n
            if (r0 != 0) goto L_0x06f3
            com.google.common.f.e r0 = f232397c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r8)
            java.lang.String r2 = "WebSearchData claims to be complete, but no content-type was received."
            r3 = 8126(0x1fbe, float:1.1387E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x06f3
        L_0x0739:
            r10 = r10 | r0
            java.lang.String r0 = "W"
            r4.append(r0)
            goto L_0x0747
        L_0x0740:
            r2 = 0
            throw r2
        L_0x0742:
            r18 = r9
            r19 = r12
            r6 = 0
        L_0x0747:
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8525ae.f29572b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r2 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r2.mo58857o(r0)
            if (r0 == 0) goto L_0x078d
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8525ae.f29572b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r2 = r7.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x0770
            java.lang.Object r0 = r0.f169969b
            goto L_0x0774
        L_0x0770:
            java.lang.Object r0 = r0.mo58889c(r2)
        L_0x0774:
            com.google.al.d.a.ae r0 = (com.google.p395al.p417d.p418a.C8525ae) r0
            if (r0 == 0) goto L_0x077a
            r3 = 1
            goto L_0x077b
        L_0x077a:
            r3 = 0
        L_0x077b:
            com.google.common.base.C58838bb.m90868c(r3)
            r2 = 1
            r1.f232419w = r2
            com.google.android.apps.gsa.search.core.google.d.n r2 = r1.f232402f
            r2.mo79612v(r0)
            java.lang.String r0 = "D"
            r4.append(r0)
            r3 = 1
            goto L_0x078e
        L_0x078d:
            r3 = r10
        L_0x078e:
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8594u.f29736g
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r2 = r7.f169962ag
            com.google.protobuf.bs r5 = r0.f169971d
            java.lang.Object r2 = r2.mo58854l(r5)
            if (r2 != 0) goto L_0x07a4
            java.lang.Object r0 = r0.f169969b
            goto L_0x07a8
        L_0x07a4:
            java.lang.Object r0 = r0.mo58889c(r2)
        L_0x07a8:
            com.google.al.d.a.u r0 = (com.google.p395al.p417d.p418a.C8594u) r0
            int r0 = r0.f29738a
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0820
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8594u.f29736g
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r2 = r7.f169962ag
            com.google.protobuf.bs r3 = r0.f169971d
            java.lang.Object r2 = r2.mo58854l(r3)
            if (r2 != 0) goto L_0x07c6
            java.lang.Object r0 = r0.f169969b
            goto L_0x07ca
        L_0x07c6:
            java.lang.Object r0 = r0.mo58889c(r2)
        L_0x07ca:
            com.google.al.d.a.u r0 = (com.google.p395al.p417d.p418a.C8594u) r0
            boolean r2 = r7.f29569d
            if (r2 == 0) goto L_0x07f4
            com.google.common.o.uf r2 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.tz r2 = (com.google.common.p4552o.C60548tz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r5 = r3.f164093a
            r6 = 2
            r5 = r5 | r6
            r3.f164093a = r5
            r5 = 494(0x1ee, float:6.92E-43)
            r3.f164258m = r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.common.o.uf r2 = (com.google.common.p4552o.C60555uf) r2
            r3 = 0
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r2, r3, r3, r3)
            goto L_0x07f5
        L_0x07f4:
            r3 = 0
        L_0x07f5:
            com.google.android.apps.gsa.search.core.google.d.n r2 = r1.f232402f
            com.google.bb.a.pb r5 = r0.f29740c
            if (r5 != 0) goto L_0x07fd
            com.google.bb.a.pb r5 = com.google.p4152bb.p4153a.C55349pb.f145830g
        L_0x07fd:
            r9 = r5
            int r5 = r0.f29738a
            r5 = r5 & 8
            if (r5 == 0) goto L_0x080c
            com.google.cm.d.a.b r6 = r0.f29742e
            if (r6 != 0) goto L_0x080a
            com.google.cm.d.a.b r6 = com.google.p4500cm.p4518d.p4519a.C58179b.f155534j
        L_0x080a:
            r10 = r6
            goto L_0x080d
        L_0x080c:
            r10 = r3
        L_0x080d:
            java.lang.String r11 = r7.f29567b
            r12 = 0
            dagger.a r13 = r1.f232404h
            r14 = 0
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = com.google.android.apps.gsa.search.shared.actions.ActionData.m141431u(r9, r10, r11, r12, r13, r14)
            r2.mo79600j(r0)
            java.lang.String r0 = "A"
            r4.append(r0)
            goto L_0x0845
        L_0x0820:
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0846
            if (r18 != 0) goto L_0x0846
            boolean r0 = r1.f232399a
            boolean r0 = r1.m138172g(r7, r0)
            if (r0 == 0) goto L_0x0840
            com.google.common.f.e r0 = f232397c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r8)
            java.lang.String r2 = "MDP proto expects continuation. This is not expected!"
            r3 = 8102(0x1fa6, float:1.1353E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x0840:
            java.lang.String r0 = "M"
            r4.append(r0)
        L_0x0845:
            r3 = 1
        L_0x0846:
            com.google.protobuf.bt r0 = com.google.p395al.p417d.p418a.C8529ai.f29584b
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r7.mo58887l(r0)
            com.google.protobuf.bf r2 = r7.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r2.mo58857o(r0)
            r0 = r0 | r3
            int r2 = r4.length()
            if (r2 != 0) goto L_0x0875
            java.lang.String r2 = "?"
            r4.append(r2)
            com.google.common.f.e r2 = f232397c
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r8)
            java.lang.String r3 = "Unknown pellet type: %s"
            r5 = 8119(0x1fb7, float:1.1377E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56389s(r3, r7)
        L_0x0875:
            java.lang.StringBuilder r2 = r1.f232400b
            int r3 = r4.length()
            r5 = 1
            if (r3 != r5) goto L_0x087f
            goto L_0x0896
        L_0x087f:
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "["
            r4.<init>(r5)
            r4.append(r3)
            r3 = r19
            r4.append(r3)
            java.lang.String r4 = r4.toString()
        L_0x0896:
            r2.append(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.google.p6794d.C85948o.mo17709a(com.google.android.apps.gsa.search.core.google.d.l):boolean");
    }
}
