package com.google.android.apps.gsa.staticplugins.opa.worker.p8611f;

import android.content.Context;
import com.google.android.apps.gsa.n.a.l;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6519al.p6532af.C84671a;
import com.google.android.apps.gsa.search.core.p6519al.p6548an.C84712a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90034cm;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p3005i.p3006a.C38406a;
import com.google.android.libraries.search.p3005i.p3007b.C38424a;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.f.o */
/* compiled from: PG */
public final class C114310o extends C86734a implements C84712a {

    /* renamed from: a */
    public static final C59071e f316950a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.f.o");

    /* renamed from: g */
    private static final long f316951g = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public final C38424a f316952b;

    /* renamed from: c */
    public final C22871g f316953c;

    /* renamed from: f */
    public final Context f316954f;

    /* renamed from: h */
    private final C118561t f316955h;

    /* renamed from: i */
    private final C118827a f316956i;

    /* renamed from: j */
    private final C86124t f316957j;

    /* renamed from: k */
    private final C84469a f316958k;

    /* renamed from: l */
    private final l f316959l;

    /* renamed from: m */
    private final C86054o f316960m;

    /* renamed from: n */
    private final C84671a f316961n;

    /* renamed from: o */
    private final com.google.android.apps.gsa.n.g.l f316962o;

    /* renamed from: p */
    private final u f316963p;

    /* renamed from: q */
    private final C86034c f316964q;

    /* renamed from: r */
    private final C84474e f316965r;

    /* renamed from: s */
    private final C130895ag f316966s;

    /* renamed from: t */
    private final C21758b f316967t;

    /* renamed from: u */
    private final boolean f316968u;

    /* renamed from: v */
    private final Map f316969v;

    /* renamed from: w */
    private final Map f316970w;

    /* renamed from: x */
    private final C38406a f316971x;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.f.o$a */
    /* compiled from: PG */
    public interface C114311a {
        /* renamed from: id */
        Optional mo101298id();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114310o(Context context, C118561t tVar, C118827a aVar, C86124t tVar2, C84469a aVar2, l lVar, C38424a aVar3, C86054o oVar, C22871g gVar, C84671a aVar4, C21758b bVar, com.google.android.apps.gsa.n.g.l lVar2, u uVar, C86034c cVar, C84474e eVar, C130895ag agVar, Map map, Map map2, C38406a aVar5) {
        super(C118575h.WORKER_GELLER_SYNC, "gellersync");
        Map map3 = map2;
        this.f316955h = tVar;
        this.f316956i = aVar;
        this.f316957j = tVar2;
        this.f316958k = aVar2;
        this.f316952b = aVar3;
        this.f316959l = lVar;
        this.f316960m = oVar;
        this.f316953c = gVar;
        this.f316961n = aVar4;
        this.f316967t = bVar;
        this.f316962o = lVar2;
        this.f316963p = uVar;
        this.f316964q = cVar;
        this.f316954f = context;
        this.f316965r = eVar;
        this.f316966s = agVar;
        this.f316971x = aVar5;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (map3.containsKey(str)) {
                C21758b bVar2 = (C21758b) map3.get(str);
                for (C65753ak put : (Set) entry.getValue()) {
                    hashMap.put(put, bVar2);
                }
            }
        }
        this.f316969v = hashMap;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            for (C65753ak put2 : (Set) entry2.getValue()) {
                hashMap2.put(put2, (String) entry2.getKey());
            }
        }
        this.f316970w = hashMap2;
        this.f316968u = tVar2.mo79746e(C90034cm.f248340F);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02ae  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78437a(byte[] r19) {
        /*
            r18 = this;
            r1 = r18
            com.google.android.apps.gsa.y.a r0 = r1.f316956i
            com.google.android.apps.gsa.u.b r2 = com.google.android.apps.gsa.p8852u.C118569b.GELLER_SYNC_WORKER_VALID_NOTIFICATION_RATE
            com.google.android.apps.gsa.u.h r3 = com.google.android.apps.gsa.p8852u.C118575h.GELLER_PUSH_SYNC
            com.google.android.apps.gsa.y.a.d r2 = r0.mo77944g(r2, r3)
            r3 = 0
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x046e }
            com.google.protos.f.i.a.d r5 = com.google.protos.p4985f.p5007i.p5008a.C64863d.f175765c     // Catch:{ ct -> 0x046e }
            r6 = r19
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r6, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x046e }
            com.google.protos.f.i.a.d r0 = (com.google.protos.p4985f.p5007i.p5008a.C64863d) r0     // Catch:{ ct -> 0x046e }
            com.google.protobuf.cq r5 = r0.f175767a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x002a
            r2.mo104025g(r3)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        L_0x002a:
            r5 = 1
            r2.mo104025g(r5)
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = r1.f316960m
            android.accounts.Account r2 = r2.mo79668a()
            if (r2 != 0) goto L_0x003a
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        L_0x003a:
            com.google.common.b.ih r7 = new com.google.common.b.ih
            r7.<init>()
            com.google.protos.f.i.a.f r8 = r0.f175768b
            if (r8 != 0) goto L_0x0045
            com.google.protos.f.i.a.f r8 = com.google.protos.p4985f.p5007i.p5008a.C64865f.f175770c
        L_0x0045:
            int r8 = r8.f175772a
            r9 = 1
            r8 = r8 & r9
            if (r8 == 0) goto L_0x0056
            com.google.protos.f.i.a.f r8 = r0.f175768b
            if (r8 != 0) goto L_0x0051
            com.google.protos.f.i.a.f r8 = com.google.protos.p4985f.p5007i.p5008a.C64865f.f175770c
        L_0x0051:
            java.lang.String r8 = r8.f175773b
            r7.mo55373c(r8)
        L_0x0056:
            com.google.common.b.ih r8 = new com.google.common.b.ih
            r8.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            com.google.common.b.ih r11 = new com.google.common.b.ih
            r11.<init>()
            com.google.protobuf.cq r0 = r0.f175767a
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r12 = r0.hasNext()
            java.lang.String r13 = "Unable to schedule a background task for corpus %s"
            r14 = 2
            if (r12 == 0) goto L_0x02d2
            java.lang.Object r12 = r0.next()
            com.google.protos.f.i.a.b r12 = (com.google.protos.p4985f.p5007i.p5008a.C64861b) r12
            int r9 = r12.f175762a
            com.google.protos.p.b.ak r9 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r9)
            if (r9 != 0) goto L_0x0084
            com.google.protos.p.b.ak r9 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN
        L_0x0084:
            com.google.android.libraries.search.i.a.a r15 = r1.f316971x
            int r15 = r15.mo41413a(r9)
            long r5 = r12.f175763b
            com.google.android.libraries.geller.b.b r5 = r1.f316967t
            boolean r6 = r1.f316968u
            if (r6 == 0) goto L_0x00aa
            if (r15 == 0) goto L_0x00a8
            if (r15 != r14) goto L_0x00aa
            java.util.Map r6 = r1.f316969v
            boolean r6 = r6.containsKey(r9)
            if (r6 == 0) goto L_0x00aa
            java.util.Map r6 = r1.f316970w
            boolean r6 = r6.containsKey(r9)
            if (r6 == 0) goto L_0x00aa
            r6 = 1
            goto L_0x00ab
        L_0x00a8:
            r0 = 0
            throw r0
        L_0x00aa:
            r6 = 0
        L_0x00ab:
            if (r6 == 0) goto L_0x00b8
            java.util.Map r5 = r1.f316969v
            java.lang.Object r5 = r5.get(r9)
            com.google.android.libraries.geller.b.b r5 = (com.google.android.libraries.geller.p1814b.C21758b) r5
            r5.getClass()
        L_0x00b8:
            boolean r5 = r5.mo27093c(r9)
            if (r5 == 0) goto L_0x01c7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.common.b.ij r15 = r7.mo55486f()
            com.google.common.b.sl r15 = r15.iterator()
        L_0x00cb:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x010a
            java.lang.Object r17 = r15.next()
            r14 = r17
            java.lang.String r14 = (java.lang.String) r14
            com.google.android.apps.gsa.n.g.u r3 = r1.f316963p
            java.lang.String r4 = r2.name
            com.google.android.apps.gsa.n.b r3 = r3.a
            com.google.common.util.concurrent.cx r3 = r3.b()
            r17 = r0
            com.google.android.apps.gsa.n.g.r r0 = new com.google.android.apps.gsa.n.g.r
            r0.<init>(r4, r9, r14)
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r3, r0, r4)
            com.google.android.apps.gsa.shared.s.a.a r3 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            com.google.android.libraries.gsa.k.g r3 = r1.f316953c
            com.google.android.apps.gsa.staticplugins.opa.worker.f.n r4 = com.google.android.apps.gsa.staticplugins.opa.worker.p8611f.C114309n.f316949a
            java.lang.String r14 = "logging Geller write"
            com.google.android.apps.gsa.shared.util.c.ag r3 = com.google.android.apps.gsa.shared.util.p7159c.C90875ai.m148465b(r4, r0, r3, r14)
            com.google.android.apps.gsa.staticplugins.opa.worker.f.b r4 = com.google.android.apps.gsa.staticplugins.opa.worker.p8611f.C114297b.f316937a
            r3.mo85223a(r4)
            r5.add(r0)
            r0 = r17
            r3 = 0
            r14 = 2
            goto L_0x00cb
        L_0x010a:
            r17 = r0
            com.google.android.libraries.gsa.k.g r0 = r1.f316953c
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92906o(r5)
            java.lang.String r4 = "transform version info write"
            com.google.android.apps.gsa.staticplugins.opa.worker.f.c r5 = com.google.android.apps.gsa.staticplugins.opa.worker.p8611f.C114298c.f316938a
            r0.mo28209i(r3, r4, r5)
            com.google.protos.p.b.ak r0 = com.google.protos.p5129p.p5131b.C65753ak.DEVICE_INSTALLED_APPS
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0139
            com.google.android.apps.gsa.search.core.al.af.a r0 = r1.f316961n
            com.google.common.util.concurrent.cx r0 = r0.mo78409a()
            com.google.android.libraries.gsa.k.g r3 = r1.f316953c
            com.google.android.apps.gsa.staticplugins.opa.worker.f.l r4 = com.google.android.apps.gsa.staticplugins.opa.worker.p8611f.C114307l.f316947a
            com.google.android.apps.gsa.shared.util.c.ag r5 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r6 = "[Geller] GellerWorker.clearDeviceInstalledAppsCache"
            r5.<init>(r0, r3, r6, r4)
            com.google.android.apps.gsa.staticplugins.opa.worker.f.m r0 = com.google.android.apps.gsa.staticplugins.opa.worker.p8611f.C114308m.f316948a
            r5.mo85223a(r0)
            goto L_0x02c9
        L_0x0139:
            com.google.protos.p.b.ak r0 = com.google.protos.p5129p.p5131b.C65753ak.CROSS_DEVICE_TIMER
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0176
            com.google.common.f.e r0 = f316950a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r3 = "__SsXDeviceTimer__Step_1: Received cross device timer FCM ping"
            r4 = 28932(0x7104, float:4.0542E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r0 = r1.f316966s
            r0.mo109886V()
            com.google.android.apps.gsa.search.core.ag.a.a r0 = r1.f316958k
            boolean r0 = r0.mo78032f()
            if (r0 == 0) goto L_0x02c9
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r0 = r1.f316964q
            com.google.common.util.concurrent.cx r0 = r0.mo79697b()
            com.google.android.libraries.gsa.k.g r3 = r1.f316953c
            com.google.android.apps.gsa.staticplugins.opa.worker.f.g r4 = new com.google.android.apps.gsa.staticplugins.opa.worker.f.g
            r4.<init>(r1)
            com.google.android.apps.gsa.shared.util.c.ag r5 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r6 = "Creating local channel to retrieve timers"
            r5.<init>(r0, r3, r6, r4)
            com.google.android.apps.gsa.staticplugins.opa.worker.f.h r0 = com.google.android.apps.gsa.staticplugins.opa.worker.p8611f.C114303h.f316942a
            r5.mo85223a(r0)
            goto L_0x02c9
        L_0x0176:
            long r3 = r12.f175763b
            r14 = 0
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x01af
            com.google.protos.p.b.ak r0 = com.google.protos.p5129p.p5131b.C65753ak.PKG_ENTITIES
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x01af
            if (r6 == 0) goto L_0x01ab
            java.util.Map r0 = r1.f316970w
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r3 = r10.containsKey(r0)
            if (r3 != 0) goto L_0x01a1
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r10.put(r0, r3)
        L_0x01a1:
            java.lang.Object r0 = r10.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r9)
            goto L_0x01c9
        L_0x01ab:
            r8.mo55373c(r9)
            goto L_0x01c9
        L_0x01af:
            if (r6 == 0) goto L_0x01c3
            com.google.common.f.e r0 = f316950a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = r9.name()
            r4 = 28931(0x7103, float:4.0541E-41)
            java.lang.String r5 = "Delayed sync not supported for corpus in TNG: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r5, r3)
            goto L_0x01c9
        L_0x01c3:
            r11.mo55373c(r12)
            goto L_0x01c9
        L_0x01c7:
            r17 = r0
        L_0x01c9:
            com.google.protos.p.b.ak r0 = com.google.protos.p5129p.p5131b.C65753ak.WEB_SEARCH
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02c9
            com.google.android.apps.gsa.search.core.ag.a.e r0 = r1.f316965r
            boolean r0 = r0.mo78106at()
            if (r0 == 0) goto L_0x02c9
            com.google.android.apps.gsa.y.a r0 = r1.f316956i
            com.google.android.apps.gsa.u.b r3 = com.google.android.apps.gsa.p8852u.C118569b.GELLER_SYNC_WORKER_WEB_SEARCH_DELETION_NOTIFICATION_COUNT
            com.google.android.apps.gsa.u.h r4 = com.google.android.apps.gsa.p8852u.C118575h.GELLER_PUSH_SYNC
            com.google.android.apps.gsa.y.a.d r0 = r0.mo77944g(r3, r4)
            r14 = 1
            r0.mo104025g(r14)
            com.google.android.libraries.gsa.k.g r0 = r1.f316953c
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r3 = r1.f316964q
            com.google.common.util.concurrent.cx r3 = r3.mo79697b()
            com.google.android.apps.gsa.staticplugins.opa.worker.f.k r4 = new com.google.android.apps.gsa.staticplugins.opa.worker.f.k
            r4.<init>(r1)
            java.lang.String r5 = "TngZpCacheRefreshBgTask"
            com.google.common.util.concurrent.cx r0 = r0.mo28210j(r3, r5, r4)
            java.lang.String r3 = "Failed when starting ZP suggest cache background refresh from geller"
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r0, r3, r5)
            com.google.android.apps.gsa.tasks.ag r0 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.tasks.af r0 = (com.google.android.apps.gsa.tasks.C118471af) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.tasks.ag r3 = (com.google.android.apps.gsa.tasks.C118472ag) r3
            r5 = 1
            r3.f328824d = r5
            int r5 = r3.f328821a
            r5 = r5 | 4
            r3.f328821a = r5
            com.google.android.apps.gsa.tasks.ak r3 = com.google.android.apps.gsa.tasks.C118476ak.f328838a
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.tasks.aj r3 = (com.google.android.apps.gsa.tasks.C118475aj) r3
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.searchbox.p6943b.C88539c.f239298a
            com.google.android.apps.gsa.searchbox.b.b r6 = com.google.android.apps.gsa.searchbox.p6943b.C88538b.f239291f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.searchbox.b.a r6 = (com.google.android.apps.gsa.searchbox.p6943b.C88537a) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.searchbox.b.b r9 = (com.google.android.apps.gsa.searchbox.p6943b.C88538b) r9
            r4 = 1
            r9.f239295c = r4
            int r4 = r9.f239293a
            r16 = 2
            r4 = r4 | 2
            r9.f239293a = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.android.apps.gsa.searchbox.b.b r4 = (com.google.android.apps.gsa.searchbox.p6943b.C88538b) r4
            r9 = 7
            r4.f239297e = r9
            int r9 = r4.f239293a
            r9 = r9 | 8
            r4.f239293a = r9
            com.google.protobuf.bv r4 = r6.build()
            com.google.android.apps.gsa.searchbox.b.b r4 = (com.google.android.apps.gsa.searchbox.p6943b.C88538b) r4
            r3.mo58885m(r5, r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.tasks.ag r4 = (com.google.android.apps.gsa.tasks.C118472ag) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.apps.gsa.tasks.ak r3 = (com.google.android.apps.gsa.tasks.C118476ak) r3
            r3.getClass()
            r4.f328827g = r3
            int r3 = r4.f328821a
            r3 = r3 | 32
            r4.f328821a = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.gsa.tasks.ag r0 = (com.google.android.apps.gsa.tasks.C118472ag) r0
            com.google.android.apps.gsa.n.g.l r3 = r1.f316962o
            int r4 = r12.f175762a
            com.google.protos.p.b.ak r4 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r4)
            if (r4 != 0) goto L_0x0282
            com.google.protos.p.b.ak r4 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN
        L_0x0282:
            com.google.common.b.gu r3 = r3.a(r4)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x02ae
            com.google.common.f.e r0 = f316950a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r3 = 28948(0x7114, float:4.0565E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r3 = r12.f175762a
            com.google.protos.p.b.ak r3 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r3)
            if (r3 != 0) goto L_0x02a6
            com.google.protos.p.b.ak r3 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN
        L_0x02a6:
            java.lang.String r3 = r3.name()
            r0.mo56389s(r13, r3)
            goto L_0x02c3
        L_0x02ae:
            int r4 = r3.size()
            r5 = 0
        L_0x02b3:
            if (r5 >= r4) goto L_0x02c3
            java.lang.Object r6 = r3.get(r5)
            com.google.android.apps.gsa.tasks.by r6 = (com.google.android.apps.gsa.tasks.C118522by) r6
            com.google.android.apps.gsa.tasks.t r9 = r1.f316955h
            r9.mo103754e(r6, r0)
            int r5 = r5 + 1
            goto L_0x02b3
        L_0x02c3:
            r5 = r14
            r0 = r17
            r3 = 0
            goto L_0x02cf
        L_0x02c9:
            r0 = r17
            r3 = 0
            r5 = 1
        L_0x02cf:
            r9 = 1
            goto L_0x006b
        L_0x02d2:
            r14 = r5
            com.google.common.b.ij r0 = r8.mo55486f()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0302
            com.google.protos.p.b.cq r3 = com.google.protos.p5129p.p5131b.C65813cq.PUSH_UPDATES
            com.google.android.apps.gsa.n.a.l r4 = r1.f316959l
            java.lang.String r2 = r2.name
            com.google.common.b.qy r5 = new com.google.common.b.qy
            r5.<init>(r2)
            com.google.common.util.concurrent.cx r2 = r4.a(r0, r5, r3)
            com.google.android.libraries.gsa.k.g r3 = r1.f316953c
            com.google.android.apps.gsa.staticplugins.opa.worker.f.d r4 = new com.google.android.apps.gsa.staticplugins.opa.worker.f.d
            r4.<init>()
            com.google.android.apps.gsa.shared.util.c.ag r5 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r6 = "[Geller] GellerWorker.gellerBatchRefreshExecutor"
            r5.<init>(r2, r3, r6, r4)
            com.google.android.apps.gsa.staticplugins.opa.worker.f.e r2 = new com.google.android.apps.gsa.staticplugins.opa.worker.f.e
            r2.<init>(r0)
            r5.mo85223a(r2)
        L_0x0302:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0324
            r10.values()
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r0 = r1.f316964q
            com.google.common.util.concurrent.cx r0 = r0.mo79697b()
            com.google.android.libraries.gsa.k.g r2 = r1.f316953c
            com.google.android.apps.gsa.staticplugins.opa.worker.f.i r3 = new com.google.android.apps.gsa.staticplugins.opa.worker.f.i
            r3.<init>(r1, r10)
            com.google.android.apps.gsa.shared.util.c.ag r4 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r5 = "Fetching account ID for TNG sync."
            r4.<init>(r0, r2, r5, r3)
            com.google.android.apps.gsa.staticplugins.opa.worker.f.j r0 = com.google.android.apps.gsa.staticplugins.opa.worker.p8611f.C114305j.f316945a
            r4.mo85223a(r0)
        L_0x0324:
            com.google.common.b.ij r0 = r11.mo55486f()
            com.google.common.b.sl r0 = r0.iterator()
        L_0x032c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x046b
            java.lang.Object r2 = r0.next()
            com.google.protos.f.i.a.b r2 = (com.google.protos.p4985f.p5007i.p5008a.C64861b) r2
            com.google.android.apps.gsa.y.a r3 = r1.f316956i
            com.google.android.apps.gsa.u.b r4 = com.google.android.apps.gsa.p8852u.C118569b.GELLER_SYNC_WORKER_DATA_FETCH_SUCCESS_RATE
            com.google.android.apps.gsa.u.h r5 = com.google.android.apps.gsa.p8852u.C118575h.GELLER_PUSH_SYNC
            com.google.android.apps.gsa.y.a.d r3 = r3.mo77944g(r4, r5)
            com.google.android.apps.gsa.n.g.l r4 = r1.f316962o
            int r5 = r2.f175762a
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r5)
            if (r5 != 0) goto L_0x034e
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN
        L_0x034e:
            com.google.common.b.gu r4 = r4.a(r5)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x037f
            com.google.common.f.e r4 = f316950a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 28947(0x7113, float:4.0563E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            int r2 = r2.f175762a
            com.google.protos.p.b.ak r2 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r2)
            if (r2 != 0) goto L_0x0372
            com.google.protos.p.b.ak r2 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN
        L_0x0372:
            java.lang.String r2 = r2.name()
            r4.mo56389s(r13, r2)
            r4 = 0
            r3.mo104025g(r4)
            goto L_0x032c
        L_0x037f:
            int r5 = r2.f175762a
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r5)
            if (r5 != 0) goto L_0x0389
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN
        L_0x0389:
            r5.name()
            com.google.android.apps.gsa.tasks.ag r5 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.tasks.af r5 = (com.google.android.apps.gsa.tasks.C118471af) r5
            long r6 = r2.f175763b
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.android.apps.gsa.tasks.ag r8 = (com.google.android.apps.gsa.tasks.C118472ag) r8
            int r9 = r8.f328821a
            r10 = 1
            r9 = r9 | r10
            r8.f328821a = r9
            r8.f328822b = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.tasks.ag r6 = (com.google.android.apps.gsa.tasks.C118472ag) r6
            r7 = 2
            r6.f328824d = r7
            int r8 = r6.f328821a
            r8 = r8 | 4
            r6.f328821a = r8
            long r8 = f316951g
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.tasks.ag r6 = (com.google.android.apps.gsa.tasks.C118472ag) r6
            int r10 = r6.f328821a
            r10 = r10 | r7
            r6.f328821a = r10
            r6.f328823c = r8
            com.google.android.apps.gsa.tasks.ak r6 = com.google.android.apps.gsa.tasks.C118476ak.f328838a
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.tasks.aj r6 = (com.google.android.apps.gsa.tasks.C118475aj) r6
            com.google.protobuf.bt r7 = com.google.android.apps.gsa.p5879n.p5880e.C74662f.f208847a
            com.google.android.apps.gsa.n.e.e r8 = com.google.android.apps.gsa.n.e.e.h
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.n.e.d r8 = (com.google.android.apps.gsa.n.e.d) r8
            com.google.protos.p.b.cq r9 = com.google.protos.p5129p.p5131b.C65813cq.PUSH_UPDATES
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.apps.gsa.n.e.e r10 = (com.google.android.apps.gsa.n.e.e) r10
            int r9 = r9.f178923h
            r10.f = r9
            int r9 = r10.a
            r11 = 2
            r9 = r9 | r11
            r10.a = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.n.e.e r9 = (com.google.android.apps.gsa.n.e.e) r9
            int r10 = r9.a
            r12 = 1
            r10 = r10 | r12
            r9.a = r10
            java.lang.String r10 = "agsa"
            r9.e = r10
            int r9 = r2.f175762a
            com.google.protos.p.b.ak r9 = com.google.protos.p5129p.p5131b.C65753ak.m96797b(r9)
            if (r9 != 0) goto L_0x0405
            com.google.protos.p.b.ak r9 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN
        L_0x0405:
            r8.b(r9)
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.apps.gsa.n.e.e r8 = (com.google.android.apps.gsa.n.e.e) r8
            r6.mo58885m(r7, r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.android.apps.gsa.tasks.ag r7 = (com.google.android.apps.gsa.tasks.C118472ag) r7
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.apps.gsa.tasks.ak r6 = (com.google.android.apps.gsa.tasks.C118476ak) r6
            r6.getClass()
            r7.f328827g = r6
            int r6 = r7.f328821a
            r6 = r6 | 32
            r7.f328821a = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.android.apps.gsa.tasks.ag r5 = (com.google.android.apps.gsa.tasks.C118472ag) r5
            int r6 = r4.size()
            r7 = 1
            r8 = 0
        L_0x0435:
            if (r8 >= r6) goto L_0x045d
            java.lang.Object r9 = r4.get(r8)
            com.google.android.apps.gsa.tasks.by r9 = (com.google.android.apps.gsa.tasks.C118522by) r9
            com.google.android.apps.gsa.search.core.i.t r10 = r1.f316957j
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90034cm.f248374y
            boolean r10 = r10.mo79746e(r12)
            if (r10 == 0) goto L_0x0453
            com.google.android.apps.gsa.tasks.t r10 = r1.f316955h
            java.lang.Integer r9 = r10.mo103751b(r9, r5)
            if (r9 == 0) goto L_0x0451
            r9 = 1
            goto L_0x0459
        L_0x0451:
            r9 = 0
            goto L_0x0459
        L_0x0453:
            com.google.android.apps.gsa.tasks.t r10 = r1.f316955h
            boolean r9 = r10.mo103754e(r9, r5)
        L_0x0459:
            r7 = r7 & r9
            int r8 = r8 + 1
            goto L_0x0435
        L_0x045d:
            int r2 = r2.f175762a
            r2 = 1
            if (r2 == r7) goto L_0x0465
            r4 = 0
            goto L_0x0466
        L_0x0465:
            r4 = r14
        L_0x0466:
            r3.mo104025g(r4)
            goto L_0x032c
        L_0x046b:
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        L_0x046e:
            r0 = move-exception
            com.google.common.f.e r3 = f316950a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Unable to parse Geller NotificationPayload"
            r5 = 28935(0x7107, float:4.0547E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            r3 = 0
            r2.mo104025g(r3)
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.p8611f.C114310o.mo78437a(byte[]):com.google.common.util.concurrent.cx");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
