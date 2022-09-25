package com.google.android.libraries.geller.p1818f;

import android.accounts.Account;
import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.android.libraries.geller.p1817e.C21778c;
import com.google.android.libraries.geller.p1817e.C21782g;
import com.google.android.libraries.geller.p1817e.C21783h;
import com.google.android.libraries.geller.p1818f.p1819a.C21788c;
import com.google.android.libraries.geller.p1818f.p1819a.C21789d;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5130a.C65720e;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65808cl;
import com.google.protos.p5129p.p5131b.C65813cq;
import com.google.protos.p5129p.p5131b.C65815cs;
import com.google.protos.p5129p.p5131b.C65817cu;
import com.google.protos.p5129p.p5131b.C65852u;
import com.google.protos.p5129p.p5131b.C65853v;
import com.google.protos.p5129p.p5131b.C65854w;
import com.google.protos.p5129p.p5131b.C65855x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.geller.f.bi */
/* compiled from: PG */
public final class C21826bi {

    /* renamed from: a */
    public static final C59071e f60217a = C59071e.m91332i("com.google.android.libraries.geller.f.bi");

    /* renamed from: b */
    public final C58833ax f60218b;

    /* renamed from: c */
    public final Geller f60219c;

    /* renamed from: d */
    public final C21942ah f60220d;

    /* renamed from: e */
    public final Set f60221e;

    /* renamed from: f */
    public final C58817ah f60222f;

    /* renamed from: g */
    public final ExecutorService f60223g;

    /* renamed from: h */
    public final ExecutorService f60224h;

    /* renamed from: i */
    public final ExecutorService f60225i;

    /* renamed from: j */
    public final C62910ar f60226j;

    /* renamed from: k */
    public final C21791aa f60227k;

    /* renamed from: l */
    public final Map f60228l;

    /* renamed from: m */
    public final C58872ci f60229m;

    /* renamed from: n */
    public final C58833ax f60230n;

    /* renamed from: o */
    public final C58833ax f60231o;

    /* renamed from: p */
    public final C58833ax f60232p;

    /* renamed from: q */
    public int f60233q = 0;

    /* renamed from: r */
    public String f60234r;

    /* renamed from: s */
    public String f60235s;

    /* renamed from: t */
    private final String f60236t;

    /* renamed from: u */
    private final C58817ah f60237u;

    /* renamed from: v */
    private String f60238v;

    public C21826bi(C58833ax axVar, Geller geller, C21942ah ahVar, String str, C58817ah ahVar2, Set set, C58817ah ahVar3, C62910ar arVar, C21791aa aaVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map, C58889cz czVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f60218b = axVar;
        this.f60219c = geller;
        this.f60220d = ahVar;
        this.f60236t = str;
        this.f60237u = ahVar2;
        this.f60221e = set;
        this.f60222f = ahVar3;
        this.f60226j = arVar;
        this.f60227k = aaVar;
        this.f60223g = executorService;
        this.f60224h = executorService2;
        this.f60225i = executorService3;
        this.f60228l = map;
        this.f60229m = new C58872ci(czVar);
        this.f60230n = axVar2;
        this.f60231o = axVar3;
        if (axVar4.mo56113h()) {
            this.f60232p = C58833ax.m90834k(new C21782g((C21778c) axVar4.mo56107c(), executorService));
        } else {
            this.f60232p = C58833ax.m90834k(new C21782g(new C21783h(), executorService));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo27127a(C65720e eVar) {
        C58528ij F = C58528ij.m90006F(new C62963cj(eVar.f178553b, C65720e.f178549c));
        String str = eVar.f178554d;
        C65813cq a = C65813cq.m96811a(eVar.f178555e);
        if (a == null) {
            a = C65813cq.UNKNOWN_REQUEST_REASON;
        }
        int a2 = C65815cs.m96813a(eVar.f178556f);
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = C65817cu.m96814a(eVar.f178557g);
        int i = a3 == 0 ? 1 : a3;
        boolean z = eVar.f178558h;
        this.f60238v = eVar.f178559i;
        this.f60234r = eVar.f178560j;
        this.f60235s = eVar.f178561k;
        C21758b a4 = C21789d.m40904a(this.f60222f, str);
        ((C59052c) ((C59052c) f60217a.mo56224b()).mo56372aa(48001)).mo56389s("Starting batch sync for corpora: %s", F);
        if (F.isEmpty()) {
            return C60856cj.m92900i(C58729pv.f156485a);
        }
        for (C21851cg cgVar : this.f60221e) {
            C58800sl lA = F.iterator();
            while (lA.hasNext()) {
                C65753ak akVar = (C65753ak) lA.next();
                Account account = (Account) this.f60218b.mo56111f();
                cgVar.mo17960i();
            }
        }
        this.f60233q = 0;
        C21848cd cdVar = (C21848cd) this.f60237u.apply(str);
        if (cdVar != null) {
            return C60922j.m93044g(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(C47630c.m84724a(new C21811au(this), this.f60224h).mo51506d(new C21812av(this, C60922j.m93045h(C60922j.m93044g(cdVar.mo27146b(C21789d.m40905b(this.f60218b), F, a), C47810es.m84963c(new C21788c(a2)), this.f60223g), C47810es.m84966f(new C21805ao(this, F, a4, i)), this.f60224h), a4, i, z), this.f60224h).mo51507e()), C47810es.m84963c(new C21806ap(this)), this.f60223g), Exception.class, C47810es.m84963c(new C21807aq(this, F)), this.f60223g), C47810es.m84963c(new C21809as(this)), this.f60223g);
        }
        throw new IllegalArgumentException("SyncContextGenerator is null");
    }

    /* renamed from: b */
    public final C60870cx mo27128b(Set set, C21758b bVar, int i) {
        C60870cx cxVar;
        if (i == 2) {
            cxVar = C60856cj.m92900i(C58733pz.f156496a);
        } else {
            C58480gp e = C58485gu.m89837e();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C65753ak akVar = (C65753ak) it.next();
                C21800aj ajVar = new C21800aj(this, bVar, akVar);
                e.mo55395g(C60922j.m93044g(C60856cj.m92905n(C47810es.m84965e(ajVar), this.f60223g), C47810es.m84963c(new C21801ak(akVar)), this.f60223g));
            }
            cxVar = C60922j.m93044g(C60856cj.m92906o(e.mo55394f()), C47810es.m84963c(C21802al.f60141a), this.f60223g);
        }
        return C60922j.m93044g(C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(cxVar), C47810es.m84966f(new C21820bc(this)), this.f60223g), C47810es.m84966f(new C21821bd(this)), this.f60223g), C47810es.m84963c(C21822be.f60212a), this.f60223g);
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [io.grpc.i.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo27129c(com.google.android.libraries.geller.p1818f.C21876z r14, com.google.android.libraries.geller.p1814b.C21758b r15, int r16, com.google.protos.p5129p.p5131b.C65855x r17, java.util.Map r18, java.util.Map r19, java.util.Map r20) {
        /*
            r13 = this;
            r10 = r13
            r0 = r14
            r4 = r17
            int r1 = r10.f60233q
            r2 = 1
            int r1 = r1 + r2
            r10.f60233q = r1
            com.google.common.base.ci r1 = r10.f60229m
            r1.mo56160e()
            r1.mo56161f()
            com.google.protobuf.cq r1 = r4.f179023b
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0031
            com.google.common.f.e r1 = f60217a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "Created batch sync request with no parts, returning immediately."
            r3 = 47998(0xbb7e, float:6.726E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.protos.p.b.ab r1 = com.google.protos.p5129p.p5131b.C65744ab.f178605b
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x002e:
            r11 = r1
            goto L_0x00bd
        L_0x0031:
            java.lang.String r1 = r10.f60238v
            io.grpc.co r3 = r0.f60367a
            com.google.protos.p.b.bs r3 = com.google.protos.p5129p.p5131b.C65789bt.m96808a(r3)
            com.google.protobuf.ar r5 = r0.f60368b
            long r5 = com.google.protobuf.p4750c.C62948a.m95453d(r5)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.grpc.i.e r3 = r3.mo62575n(r5, r7)
            com.google.protos.p.b.bs r3 = (com.google.protos.p5129p.p5131b.C65788bs) r3
            io.grpc.j r5 = r3.f189039a
            io.grpc.i r3 = r3.f189040b
            io.grpc.i r6 = new io.grpc.i
            r6.<init>(r3)
            java.lang.String r3 = "gzip"
            r6.f189019e = r3
            com.google.protos.p.b.bs r3 = new com.google.protos.p.b.bs
            r3.<init>(r5, r6)
            if (r1 == 0) goto L_0x0074
            com.google.h.a.a r5 = new com.google.h.a.a
            r6 = 0
            r5.<init>(r1, r6)
            com.google.h.a.d r1 = new com.google.h.a.d
            r1.<init>(r5)
            io.grpc.a.d r5 = new io.grpc.a.d
            io.grpc.a.b r6 = p5488io.grpc.p5520a.C70136d.f186958b
            r5.<init>(r1, r6)
            io.grpc.i.e r1 = r3.mo62574m(r5)
            r3 = r1
            com.google.protos.p.b.bs r3 = (com.google.protos.p5129p.p5131b.C65788bs) r3
        L_0x0074:
            io.grpc.j r1 = r3.f189039a
            io.grpc.di r5 = com.google.protos.p5129p.p5131b.C65789bt.f178839b
            if (r5 != 0) goto L_0x00b1
            java.lang.Class<com.google.protos.p.b.bt> r6 = com.google.protos.p5129p.p5131b.C65789bt.class
            monitor-enter(r6)
            io.grpc.di r5 = com.google.protos.p5129p.p5131b.C65789bt.f178839b     // Catch:{ all -> 0x00ae }
            if (r5 != 0) goto L_0x00ac
            io.grpc.df r5 = p5488io.grpc.C70338di.m102603d()     // Catch:{ all -> 0x00ae }
            io.grpc.dh r7 = p5488io.grpc.C70337dh.UNARY     // Catch:{ all -> 0x00ae }
            r5.f187487c = r7     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = "geller.oneplatform.GellerService"
            java.lang.String r8 = "BatchSync"
            java.lang.String r7 = p5488io.grpc.C70338di.m102602c(r7, r8)     // Catch:{ all -> 0x00ae }
            r5.f187488d = r7     // Catch:{ all -> 0x00ae }
            r5.f187489e = r2     // Catch:{ all -> 0x00ae }
            com.google.protos.p.b.x r2 = com.google.protos.p5129p.p5131b.C65855x.f179020f     // Catch:{ all -> 0x00ae }
            io.grpc.dg r2 = p5488io.grpc.p5531h.p5532a.C70850d.m103697c(r2)     // Catch:{ all -> 0x00ae }
            r5.f187485a = r2     // Catch:{ all -> 0x00ae }
            com.google.protos.p.b.ab r2 = com.google.protos.p5129p.p5131b.C65744ab.f178605b     // Catch:{ all -> 0x00ae }
            io.grpc.dg r2 = p5488io.grpc.p5531h.p5532a.C70850d.m103697c(r2)     // Catch:{ all -> 0x00ae }
            r5.f187486b = r2     // Catch:{ all -> 0x00ae }
            io.grpc.di r2 = r5.mo62040a()     // Catch:{ all -> 0x00ae }
            com.google.protos.p5129p.p5131b.C65789bt.f178839b = r2     // Catch:{ all -> 0x00ae }
            r5 = r2
        L_0x00ac:
            monitor-exit(r6)     // Catch:{ all -> 0x00ae }
            goto L_0x00b1
        L_0x00ae:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00ae }
            throw r0
        L_0x00b1:
            io.grpc.i r2 = r3.f189040b
            io.grpc.m r1 = r1.mo39510a(r5, r2)
            com.google.common.util.concurrent.cx r1 = p5488io.grpc.p5533i.C70876o.m103760a(r1, r4)
            goto L_0x002e
        L_0x00bd:
            com.google.android.libraries.geller.f.am r12 = new com.google.android.libraries.geller.f.am
            r1 = r12
            r2 = r13
            r3 = r20
            r4 = r17
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r18
            r9 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            com.google.common.util.concurrent.s r0 = com.google.apps.tiktok.tracing.C47810es.m84966f(r12)
            java.util.concurrent.ExecutorService r1 = r10.f60223g
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r11, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.p1818f.C21826bi.mo27129c(com.google.android.libraries.geller.f.z, com.google.android.libraries.geller.b.b, int, com.google.protos.p.b.x, java.util.Map, java.util.Map, java.util.Map):com.google.common.util.concurrent.cx");
    }

    /* renamed from: d */
    public final C65855x mo27130d(Set set, C65808cl clVar, int i, Map map, Map map2, C58833ax axVar, C58833ax axVar2) {
        Map map3 = map;
        Map map4 = map2;
        HashMap hashMap = new HashMap();
        if (axVar.mo56113h()) {
            for (C65854w wVar : ((C65855x) axVar.mo56107c()).f179023b) {
                C65753ak b = C65753ak.m96797b(wVar.f179014b);
                if (b == null) {
                    b = C65753ak.UNKNOWN;
                }
                hashMap.put(b, wVar);
            }
        }
        C65852u uVar = (C65852u) C65855x.f179020f.createBuilder();
        String str = this.f60236t;
        uVar.copyOnWrite();
        C65855x xVar = (C65855x) uVar.instance;
        str.getClass();
        int i2 = 1;
        xVar.f179022a |= 1;
        xVar.f179024c = str;
        uVar.copyOnWrite();
        C65855x xVar2 = (C65855x) uVar.instance;
        clVar.getClass();
        xVar2.f179025d = clVar;
        xVar2.f179022a |= 2;
        uVar.copyOnWrite();
        C65855x xVar3 = (C65855x) uVar.instance;
        xVar3.f179026e = i - 1;
        xVar3.f179022a |= 4;
        Iterator it = set.iterator();
        long j = 0;
        while (it.hasNext()) {
            C65753ak akVar = (C65753ak) it.next();
            if (map3.containsKey(akVar) || map4.containsKey(akVar)) {
                C65853v vVar = (C65853v) C65854w.f179011g.createBuilder();
                if (map4.containsKey(akVar)) {
                    vVar.copyOnWrite();
                    C65854w wVar2 = (C65854w) vVar.instance;
                    wVar2.f179014b = akVar.f178757bE;
                    wVar2.f179013a |= i2;
                }
                if (map3.containsKey(akVar)) {
                    vVar.mergeFrom((C65854w) map3.get(akVar));
                }
                if (map4.containsKey(akVar) && ((double) (((long) ((C65854w) map4.get(akVar)).getSerializedSize()) + j)) <= 3670016.0d) {
                    vVar.mergeFrom((C65854w) map4.get(akVar));
                }
                C58838bb.m90869d(i2 == (((C65854w) vVar.instance).f179013a & i2), "Part.Builder#corpus is required");
                C65753ak b2 = C65753ak.m96797b(((C65854w) vVar.instance).f179014b);
                if (b2 == null) {
                    b2 = C65753ak.UNKNOWN;
                }
                C58485gu e = this.f60219c.mo27178e(C21789d.m40905b(this.f60218b), b2, "_sync_token");
                if (e.isEmpty() || ((String) e.get(0)).isEmpty()) {
                    ((C59052c) ((C59052c) f60217a.mo56224b()).mo56372aa(48007)).mo56389s("No previous syncToken for corpus %s found.", b2.name());
                } else {
                    ((C59052c) ((C59052c) f60217a.mo56224b()).mo56372aa(48008)).mo56354G("The syncToken for corpus %s is %s.", b2.name(), e.get(0));
                    String str2 = (String) e.get(0);
                    vVar.copyOnWrite();
                    C65854w wVar3 = (C65854w) vVar.instance;
                    str2.getClass();
                    wVar3.f179013a |= 2;
                    wVar3.f179015c = str2;
                }
                C65854w wVar4 = (C65854w) vVar.build();
                C58833ax j2 = C58833ax.m90833j((C65854w) hashMap.get(akVar));
                if (!wVar4.equals(C65854w.f179011g)) {
                    if (j2.mo56113h() && wVar4.equals(j2.mo56107c())) {
                        ((C59052c) ((C59052c) f60217a.mo56226d()).mo56372aa(48009)).mo56386p("Detected duplicate batch sync request part, removing duplicate part from sync.");
                        if (axVar2.mo56113h()) {
                            C21855e eVar = new C21855e();
                            eVar.mo27148b().mo55395g(new C21827bj("Duplicate batch sync request part detected, sync aborted early to prevent infinite looping for this corpus."));
                            C21850cf a = eVar.mo27147a();
                            C65753ak b3 = C65753ak.m96797b(wVar4.f179014b);
                            if (b3 == null) {
                                b3 = C65753ak.UNKNOWN;
                            }
                            if (((Map) axVar2.mo56107c()).containsKey(b3)) {
                                ((Map) axVar2.mo56107c()).put(b3, ((C21850cf) ((Map) axVar2.mo56107c()).get(b3)).mo27155e(a));
                            } else {
                                ((Map) axVar2.mo56107c()).put(b3, a);
                            }
                        }
                    } else {
                        j += (long) wVar4.getSerializedSize();
                        uVar.copyOnWrite();
                        C65855x xVar4 = (C65855x) uVar.instance;
                        wVar4.getClass();
                        C62971cq cqVar = xVar4.f179023b;
                        if (!cqVar.mo58948c()) {
                            xVar4.f179023b = C62942bv.mutableCopy(cqVar);
                        }
                        xVar4.f179023b.add(wVar4);
                    }
                }
                i2 = 1;
            }
        }
        return (C65855x) uVar.build();
    }
}
