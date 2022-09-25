package com.google.android.apps.gsa.staticplugins.p7761cz;

import com.google.android.apps.gsa.p6487s3.C84294l;
import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84332u;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8889z.p8917f.p8918a.C119072a;
import com.google.android.apps.gsa.search.core.p6519al.p6656cl.C85133a;
import com.google.android.apps.gsa.search.core.p6519al.p6759t.C85598a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.apps.gsa.shared.speech.p7139a.C90518j;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92443g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.C68214a;
import p5488io.grpc.C70761fa;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.apps.gsa.staticplugins.cz.y */
/* compiled from: PG */
public final class C99267y extends C86734a implements C85133a {

    /* renamed from: a */
    public static final C59071e f277700a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cz.y");

    /* renamed from: b */
    public final C89012aj f277701b;

    /* renamed from: c */
    public final C119072a f277702c;

    /* renamed from: f */
    public final C22871g f277703f;

    /* renamed from: g */
    public final String f277704g;

    /* renamed from: h */
    private final C85598a f277705h;

    /* renamed from: i */
    private final C86124t f277706i;

    /* renamed from: j */
    private final C90931ca f277707j;

    /* renamed from: k */
    private final C92302a f277708k;

    /* renamed from: l */
    private final C22871g f277709l;

    /* renamed from: m */
    private final C99248f f277710m;

    public C99267y(C99248f fVar, C89012aj ajVar, C85598a aVar, C119072a aVar2, C86124t tVar, C90931ca caVar, C22871g gVar, String str, C92302a aVar3, C22871g gVar2) {
        super(C118575h.S3CONNECTION, "s3connection");
        this.f277710m = fVar;
        this.f277701b = ajVar;
        this.f277705h = aVar;
        this.f277702c = aVar2;
        this.f277706i = tVar;
        this.f277707j = caVar;
        this.f277703f = gVar;
        this.f277704g = str;
        this.f277708k = aVar3;
        this.f277709l = gVar2;
    }

    /* renamed from: e */
    public static C90523o m164619e(Throwable th) {
        int i;
        if (th instanceof C90523o) {
            return (C90523o) th;
        }
        if (th instanceof C90456c) {
            i = ((C90456c) th).mo79843a();
        } else if (th instanceof StatusException) {
            return new C90518j(th, C90454b.m147152b(((StatusException) th).f186943a.getCode()));
        } else {
            if (th instanceof C70761fa) {
                return new C90518j(th, C90454b.m147152b(((C70761fa) th).f188571a.getCode()));
            }
            i = 65550;
        }
        return new C90523o(th, i);
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [com.google.android.apps.gsa.s3.v, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v3, types: [com.google.android.apps.gsa.s3.s] */
    /* JADX WARNING: type inference failed for: r7v4, types: [com.google.android.apps.gsa.staticplugins.cz.s] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.util.concurrent.C60870cx m164620f(com.google.p4449cd.p4456g.C57981b r17, boolean r18, com.google.android.apps.gsa.shared.p6968aa.C89061q r19, boolean r20, com.google.common.base.C58833ax r21, com.google.common.base.C58833ax r22) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.apps.gsa.staticplugins.cz.e r1 = new com.google.android.apps.gsa.staticplugins.cz.e
            r2 = r17
            r1.<init>(r2)
            com.google.android.apps.gsa.staticplugins.cz.c r2 = new com.google.android.apps.gsa.staticplugins.cz.c
            com.google.android.apps.gsa.speech.helper.a r3 = r0.f277708k
            com.google.android.libraries.gsa.k.g r4 = r0.f277709l
            r2.<init>(r3, r1, r4)
            com.google.android.apps.gsa.z.f.a.a r3 = r0.f277702c
            com.google.common.base.ax r3 = r3.mo104106a()
            boolean r3 = r3.mo56113h()
            if (r3 != 0) goto L_0x005d
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f277706i
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90114fl.f250733g
            boolean r3 = r3.mo79746e(r4)
            if (r3 != 0) goto L_0x0029
            goto L_0x005d
        L_0x0029:
            com.google.common.f.e r3 = f277700a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Using gRPC for connection"
            r5 = 31708(0x7bdc, float:4.4432E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.common.util.concurrent.cx r3 = com.google.android.apps.gsa.staticplugins.p7761cz.C99252j.m164598a(r19)
            com.google.android.libraries.gsa.k.g r4 = r0.f277703f
            com.google.android.apps.gsa.search.core.al.t.a r5 = r0.f277705h
            com.google.common.util.concurrent.cx r5 = r5.mo79089a()
            com.google.android.apps.gsa.staticplugins.cz.k r6 = new com.google.android.apps.gsa.staticplugins.cz.k
            r11 = r19
            r6.<init>(r0, r11)
            java.lang.String r7 = "get gRPC ManagedChannel"
            com.google.common.util.concurrent.cx r4 = r4.mo28210j(r5, r7, r6)
            com.google.android.apps.gsa.staticplugins.cz.l r5 = new com.google.android.apps.gsa.staticplugins.cz.l
            r5.<init>(r0, r1, r2, r3)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r4, r5, r1)
            com.google.android.apps.gsa.shared.s.a.a r2 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            return r1
        L_0x005d:
            r11 = r19
            com.google.common.f.e r3 = f277700a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Using PairHttp for connection"
            r5 = 31707(0x7bdb, float:4.4431E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            boolean r3 = r22.mo56113h()
            if (r3 == 0) goto L_0x008a
            com.google.android.apps.gsa.staticplugins.cz.s r3 = new com.google.android.apps.gsa.staticplugins.cz.s
            com.google.android.apps.gsa.staticplugins.cz.f r8 = r0.f277710m
            com.google.android.apps.gsa.shared.aa.aj r9 = r0.f277701b
            java.lang.Object r4 = r22.mo56107c()
            com.google.android.apps.gsa.s3.u r4 = (com.google.android.apps.gsa.p6487s3.C84332u) r4
            com.google.android.apps.gsa.staticplugins.cz.p r13 = com.google.android.apps.gsa.staticplugins.p7761cz.C99258p.f277677a
            r7 = r3
            r10 = r19
            r11 = r4
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x00a2
        L_0x008a:
            com.google.android.apps.gsa.s3.s r3 = new com.google.android.apps.gsa.s3.s
            com.google.android.apps.gsa.shared.util.c.ca r8 = r0.f277707j
            com.google.android.apps.gsa.z.f.a.a r4 = r0.f277702c
            com.google.al.c.c.b.ay r9 = r4.mo104108d()
            com.google.android.apps.gsa.shared.aa.aj r10 = r0.f277701b
            r13 = 0
            r14 = 3
            com.google.android.apps.gsa.search.core.i.t r15 = r0.f277706i
            r7 = r3
            r11 = r19
            r12 = r18
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a2:
            boolean r4 = r21.mo56113h()
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r21.mo56107c()
            com.google.cd.d.f r4 = (com.google.p4449cd.p4453d.C57960f) r4
            p3186j$.util.Objects.requireNonNull(r3)
            com.google.android.apps.gsa.staticplugins.cz.m r5 = new com.google.android.apps.gsa.staticplugins.cz.m
            r5.<init>(r3)
            r4.mo54567b(r5)
        L_0x00b9:
            com.google.android.apps.gsa.staticplugins.cz.x r4 = new com.google.android.apps.gsa.staticplugins.cz.x
            r4.<init>(r3, r2)
            com.google.android.apps.gsa.staticplugins.cz.r r2 = new com.google.android.apps.gsa.staticplugins.cz.r
            r5 = r20
            r2.<init>(r1, r5)
            r3.mo77827b(r4, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7761cz.C99267y.m164620f(com.google.cd.g.b, boolean, com.google.android.apps.gsa.shared.aa.q, boolean, com.google.common.base.ax, com.google.common.base.ax):com.google.common.util.concurrent.cx");
    }

    /* renamed from: a */
    public final C60870cx mo78727a(C57981b bVar) {
        C89061q b = this.f277701b.mo27510b(C89066v.f241382a);
        C58836b bVar2 = C58836b.f156633a;
        return m164620f(bVar, true, b, !(bVar instanceof C92443g), bVar2, bVar2);
    }

    /* renamed from: b */
    public final C60870cx mo78728b(C57981b bVar, C58833ax axVar, C58833ax axVar2) {
        return m164620f(bVar, false, this.f277701b.mo27510b(C89066v.f241382a), !(bVar instanceof C92443g), axVar, axVar2);
    }

    /* renamed from: c */
    public final C60870cx mo78729c(C84295m mVar, C92439c cVar, C84332u uVar) {
        C84294l a = this.f277710m.mo91390a(mVar, cVar, uVar, this.f277701b);
        a.mo77824a();
        return C60856cj.m92900i(a);
    }

    /* renamed from: d */
    public final C60870cx mo78730d(C84295m mVar, C89061q qVar, C92439c cVar, C84332u uVar, boolean z, C68214a aVar) {
        C84294l b = this.f277710m.mo91391b(mVar, this.f277701b, qVar, cVar, uVar, z, !this.f277702c.mo104106a().mo56113h() && this.f277706i.mo79746e(C90114fl.f250733g), aVar);
        b.mo77824a();
        return C60856cj.m92900i(b);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
