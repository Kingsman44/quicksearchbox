package com.google.android.libraries.gsa.actionusermodel;

import android.content.Context;
import android.provider.Telephony;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C16994a;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17003ah;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17039af;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17043aj;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22099b;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22100c;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22101d;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22102e;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.android.libraries.gsa.actionusermodel.p1831d.C22131k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47637j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3745ab.C48313dl;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55084fg;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64650ad;
import com.google.protos.p4985f.p4986a.C64655ai;
import com.google.protos.p4985f.p4986a.C64676bc;
import com.google.protos.p4985f.p4986a.C64680bg;
import com.google.protos.p4985f.p4986a.C64687bn;
import com.google.protos.p4985f.p4986a.C64708r;
import com.google.protos.p4985f.p4986a.C64710t;
import dagger.C68214a;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.y */
/* compiled from: PG */
public final class C22153y implements C22080bj {

    /* renamed from: a */
    public static final C58974d f61118a = C58974d.m91136j();

    /* renamed from: b */
    public final C22068az f61119b;

    /* renamed from: c */
    public final C60950i f61120c;

    /* renamed from: d */
    public final C22871g f61121d;

    /* renamed from: e */
    public final C22087bq f61122e;

    /* renamed from: f */
    public final C42813k f61123f;

    /* renamed from: g */
    private final C22871g f61124g;

    /* renamed from: h */
    private final Object f61125h = new Object();

    /* renamed from: i */
    private String f61126i = BuildConfig.FLAVOR;

    /* renamed from: j */
    private long f61127j = 0;

    /* renamed from: k */
    private final C22083bm f61128k;

    /* renamed from: l */
    private final Context f61129l;

    /* renamed from: m */
    private final C68214a f61130m;

    /* renamed from: n */
    private final C17003ah f61131n;

    /* renamed from: o */
    private final C17039af f61132o;

    public C22153y(Context context, C22068az azVar, C60950i iVar, C22871g gVar, C22871g gVar2, C22083bm bmVar, C22087bq bqVar, C68214a aVar, C17003ah ahVar, C17039af afVar, C42813k kVar) {
        this.f61129l = context;
        this.f61119b = azVar;
        this.f61120c = iVar;
        this.f61121d = gVar;
        this.f61124g = gVar2;
        this.f61128k = bmVar;
        this.f61122e = bqVar;
        this.f61130m = aVar;
        this.f61131n = ahVar;
        this.f61132o = afVar;
        this.f61123f = kVar;
    }

    /* renamed from: a */
    public static C22104g m41403a(C22104g gVar, String str) {
        C22102e eVar = (C22102e) gVar.toBuilder();
        eVar.copyOnWrite();
        C22104g gVar2 = (C22104g) eVar.instance;
        str.getClass();
        gVar2.f60922a |= 8;
        gVar2.f60926e = str;
        return (C22104g) eVar.build();
    }

    /* renamed from: l */
    private final C60870cx m41404l(String str, C64676bc bcVar, String str2, Optional optional) {
        C22102e eVar = (C22102e) C22104g.f60920i.createBuilder();
        eVar.copyOnWrite();
        C22104g gVar = (C22104g) eVar.instance;
        str.getClass();
        gVar.f60922a |= 8;
        gVar.f60926e = str;
        eVar.copyOnWrite();
        C22104g gVar2 = (C22104g) eVar.instance;
        gVar2.f60923b = bcVar.f175326g;
        gVar2.f60922a |= 1;
        C22100c cVar = (C22100c) C22101d.f60914d.createBuilder();
        cVar.copyOnWrite();
        C22101d dVar = (C22101d) cVar.instance;
        str2.getClass();
        dVar.f60916a |= 1;
        dVar.f60917b = str2;
        cVar.copyOnWrite();
        C22101d dVar2 = (C22101d) cVar.instance;
        dVar2.f60916a |= 2;
        dVar2.f60918c = 1.0d;
        eVar.mo27356c((C22101d) cVar.build());
        eVar.copyOnWrite();
        C22104g gVar3 = (C22104g) eVar.instance;
        gVar3.f60922a |= 4;
        gVar3.f60925d = 0;
        eVar.copyOnWrite();
        C22104g gVar4 = (C22104g) eVar.instance;
        gVar4.f60924c = C48313dl.m85218a(7);
        gVar4.f60922a |= 2;
        C22104g gVar5 = (C22104g) eVar.build();
        if (optional.isPresent()) {
            this.f61128k.mo27346b((String) optional.get(), gVar5);
        }
        return C60856cj.m92900i(gVar5);
    }

    /* renamed from: b */
    public final C60870cx mo27335b(C55421x xVar, C55998f fVar, Optional optional, String str, boolean z) {
        if (fVar == null) {
            return C60856cj.m92900i(C22099b.f60908d);
        }
        return this.f61121d.mo28209i(this.f61128k.mo27345a(str), "AumExecutor.logAction using aumSessionId", new C22140l(this, xVar, fVar, optional, z));
    }

    /* renamed from: c */
    public final C60870cx mo27336c(C55421x xVar, String str, String str2, String str3, String str4, List list, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2, boolean z3, boolean z4) {
        C60870cx cxVar;
        String str5 = str;
        Optional optional2 = optional;
        if (!z4) {
            boolean o = C22063au.m41312o(rVar);
            if (list.size() != 1 || o) {
                List list2 = list;
                cxVar = this.f61121d.mo28209i(mo27368k(C22063au.m41299b(list), C22063au.m41314q(str, str2, str3, xVar, 7, mo27366h()), str3, xVar, 7, C64676bc.INSTANCE, Optional.empty(), zVar, z, rVar, z3), "AumExecutor.resolveInstanceInternal", new C22136h(this, optional2, str5));
            } else {
                cxVar = m41404l(str5, C64676bc.INSTANCE, (String) list.get(0), optional2);
            }
            return z2 ? C22063au.m41316s(cxVar, (C22131k) this.f61130m.mo27525b()) : cxVar;
        }
        List list3 = list;
        String str6 = str3;
        C55084fg e = C22063au.m41302e(str6, mo27366h(), z3);
        C60870cx a = this.f61122e.mo27347a();
        C60870cx a2 = ((C22131k) this.f61130m.mo27525b()).mo27362a();
        return C47638k.m84753d(a, a2).mo51521b(new C22137i(this, a, e, list, xVar, str, str2, str6, str4, optional, zVar, z, rVar, z2, a2, z3), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo27337d(C55421x xVar, String str, String str2, String str3, List list, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2, boolean z3, boolean z4) {
        C60870cx cxVar;
        String str4 = str;
        Optional optional2 = optional;
        if (!z4) {
            if (list.size() == 1) {
                cxVar = m41404l(str4, C64676bc.ENDPOINT, (String) list.get(0), optional2);
            } else {
                List list2 = list;
                cxVar = this.f61121d.mo28209i(mo27368k(C22063au.m41299b(list), C22063au.m41314q(str, str2, str3, xVar, 4, mo27366h()), str3, xVar, 4, C64676bc.ENDPOINT, Optional.empty(), zVar, z, rVar, z3), "AumExecutor.resolveInstanceLabelInternal", new C22142n(this, optional2, str4));
            }
            return z2 ? C22063au.m41316s(cxVar, (C22131k) this.f61130m.mo27525b()) : cxVar;
        }
        C60870cx a = this.f61122e.mo27347a();
        C60870cx a2 = ((C22131k) this.f61130m.mo27525b()).mo27362a();
        C47637j d = C47638k.m84753d(a, a2);
        C22138j jVar = r0;
        C22138j jVar2 = new C22138j(this, xVar, str, str2, str3, list, optional, a, zVar, z, rVar, z2, a2, z3);
        return d.mo51521b(jVar, C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo27338e(C55421x xVar, String str, String str2, List list, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2, boolean z3) {
        C60870cx cxVar;
        String str3 = str;
        Optional optional2 = optional;
        if (!z3) {
            if (list.size() == 1) {
                cxVar = m41404l(str3, C64676bc.PROVIDER, (String) list.get(0), optional2);
            } else {
                List list2 = list;
                cxVar = this.f61121d.mo28209i(mo27368k(C22063au.m41299b((C58485gu) Collection.EL.stream(list).map(new C22146r(this)).collect(C58370cn.f155946a)), C22063au.m41314q(str, str2, BuildConfig.FLAVOR, xVar, 2, mo27366h()), BuildConfig.FLAVOR, xVar, 2, C64676bc.PROVIDER, Optional.empty(), zVar, z, rVar, true), "AumExecutor.resolveProviderInternal", new C22147s(this, optional2, str3));
            }
            return z2 ? C22063au.m41316s(cxVar, (C22131k) this.f61130m.mo27525b()) : cxVar;
        }
        C60870cx a = this.f61122e.mo27347a();
        C60870cx a2 = ((C22131k) this.f61130m.mo27525b()).mo27362a();
        C22134f fVar = r0;
        C47637j d = C47638k.m84753d(a, a2);
        C22134f fVar2 = new C22134f(this, xVar, str, str2, list, optional, a, zVar, z, rVar, z2, a2);
        return d.mo51521b(fVar, C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo27364f(C63088z zVar) {
        C64680bg bgVar;
        C64687bn bnVar;
        C64710t f = C22063au.m41303f(zVar);
        boolean z = false;
        for (C64650ad adVar : f.f175416a) {
            if (adVar.f175245a == 6) {
                bgVar = (C64680bg) adVar.f175246b;
            } else {
                bgVar = C64680bg.f175329c;
            }
            if (bgVar.f175331a == 1) {
                bnVar = (C64687bn) bgVar.f175332b;
            } else {
                bnVar = C64687bn.f175340d;
            }
            z |= bnVar.f175343b.equals("/ml/action-user-model-ml-tflite-prod/ucm.linear-callduration-ondevice-v1");
        }
        if (!z) {
            return C60856cj.m92900i(f);
        }
        C22871g gVar = this.f61121d;
        C17043aj ajVar = (C17043aj) C17044ak.f49650c.createBuilder();
        C17036ac acVar = (C17036ac) C16994a.m34087a(this.f61131n).build();
        ajVar.copyOnWrite();
        C17044ak akVar = (C17044ak) ajVar.instance;
        acVar.getClass();
        akVar.f49653b = acVar;
        akVar.f49652a |= 1;
        return gVar.mo28209i(this.f61124g.mo28210j(this.f61132o.mo23172b((C17044ak) ajVar.build()), "AumExecutor.getFiePath with fileGroupStoreViewFutureStub.getFileGroup", new C22143o(this)), "AumExecutor.getAumRequest with getModelFilePath", new C22141m(f));
    }

    /* renamed from: g */
    public final Optional mo27365g(C55421x xVar, C55998f fVar, List list, Optional optional, boolean z) {
        EnumMap enumMap = new EnumMap(C64676bc.class);
        Iterator it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            C22104g gVar = (C22104g) it.next();
            C64676bc a = C64676bc.m96428a(gVar.f60923b);
            if (a == null) {
                a = C64676bc.UNSPECIFIED;
            }
            enumMap.put(a, ((C22101d) gVar.f60927f.get(gVar.f60925d)).f60917b);
            if (str == null && (gVar.f60922a & 8) != 0) {
                str = gVar.f60926e;
            }
        }
        if (str == null) {
            ((C58970a) ((C58970a) f61118a.mo56226d()).mo56372aa(48193)).mo56386p("logAction failed. Cannot find originalQuery.");
            return Optional.empty();
        }
        C55421x xVar2 = xVar;
        Optional k = C22063au.m41308k(xVar2, Optional.ofNullable(fVar), str, Optional.ofNullable((String) enumMap.get(C64676bc.NAME)), Optional.ofNullable((String) enumMap.get(C64676bc.ENDPOINT)), Optional.ofNullable((String) enumMap.get(C64676bc.INSTANCE)), Optional.empty(), Optional.empty(), Optional.ofNullable((String) enumMap.get(C64676bc.PROVIDER)), mo27366h(), this.f61120c, z);
        if (k.isEmpty()) {
            ((C58970a) ((C58970a) f61118a.mo56226d()).mo56372aa(48192)).mo56386p("Failed to create AssistantActionHistoryData.");
            return Optional.empty();
        }
        this.f61122e.mo27349c(C58485gu.m89846n((C64655ai) k.get()), false);
        return Optional.m71637of(C22063au.m41307j(this.f61120c.mo57444a().toEpochMilli(), (C64655ai) k.get(), optional));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo27366h() {
        String str;
        synchronized (this.f61125h) {
            long epochMilli = this.f61120c.mo57444a().toEpochMilli();
            if (epochMilli - this.f61127j > 30000) {
                this.f61126i = Telephony.Sms.getDefaultSmsPackage(this.f61129l);
                this.f61127j = epochMilli;
            }
            str = this.f61126i;
        }
        return str;
    }

    /* renamed from: i */
    public final void mo27367i(Optional optional, C22104g gVar) {
        if (optional.isPresent()) {
            this.f61128k.mo27346b((String) optional.get(), gVar);
        }
    }

    /* renamed from: j */
    public final C60870cx mo27339j(C55421x xVar, String str, List list, Optional optional, C63088z zVar, boolean z, C64708r rVar, boolean z2, boolean z3) {
        C60870cx cxVar;
        String str2 = str;
        List list2 = list;
        Optional optional2 = optional;
        if (!z3) {
            boolean n = C22063au.m41311n(rVar);
            if (list.size() != 1 || n) {
                int[] array = IntStream.CC.range(0, list.size()).filter(new C22097c(list2)).toArray();
                int i = array.length == 1 ? array[0] : -1;
                cxVar = this.f61121d.mo28209i(mo27368k((C58485gu) IntStream.CC.range(0, list.size()).mapToObj(new C22120d(list2, i)).collect(C58370cn.f155946a), C22063au.m41314q(str, BuildConfig.FLAVOR, BuildConfig.FLAVOR, xVar, 3, mo27366h()), BuildConfig.FLAVOR, xVar, 3, C64676bc.NAME, Optional.m71637of(Double.valueOf(0.95d)), zVar, z, rVar, true), "AumExecutor.resolveContactInternal", new C22133e(this, optional2, str2));
            } else {
                cxVar = m41404l(str2, C64676bc.NAME, ((C22021a) list2.get(0)).mo27333e(), optional2);
            }
            if (z2) {
                return C22063au.m41316s(cxVar, (C22131k) this.f61130m.mo27525b());
            }
            return cxVar;
        }
        C60870cx a = this.f61122e.mo27347a();
        C60870cx a2 = ((C22131k) this.f61130m.mo27525b()).mo27362a();
        C60870cx f = mo27364f(zVar);
        C47637j d = C47638k.m84753d(a, a2);
        C22144p pVar = r0;
        C22144p pVar2 = new C22144p(this, xVar, str, list, optional, a, f, z, rVar, z2, a2);
        return d.mo51521b(pVar, C60826bg.f164896a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e2, code lost:
        r0 = th;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo27368k(com.google.common.p4522b.C58485gu r18, java.lang.String r19, java.lang.String r20, com.google.p4152bb.p4153a.C55421x r21, int r22, com.google.protos.p4985f.p4986a.C64676bc r23, p3186j$.util.Optional r24, com.google.protobuf.C63088z r25, boolean r26, com.google.protos.p4985f.p4986a.C64708r r27, boolean r28) {
        /*
            r17 = this;
            r14 = r17
            r0 = r18
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            com.google.android.libraries.gsa.actionusermodel.c.g r1 = com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g.f60920i
            com.google.protobuf.bn r1 = r1.createBuilder()
            r15 = r1
            com.google.android.libraries.gsa.actionusermodel.c.e r15 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22102e) r15
            if (r0 == 0) goto L_0x00e4
            boolean r1 = com.google.common.base.C58837ba.m90859h(r19)
            if (r1 == 0) goto L_0x001a
            goto L_0x00e4
        L_0x001a:
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r1 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r1
            r19.getClass()
            int r2 = r1.f60922a
            r2 = r2 | 8
            r1.f60922a = r2
            r4 = r19
            r1.f60926e = r4
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.android.libraries.gsa.actionusermodel.c.g r1 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r1
            r8 = r23
            int r2 = r8.f175326g
            r1.f60923b = r2
            int r2 = r1.f60922a
            r2 = r2 | 1
            r1.f60922a = r2
            int r1 = r18.size()
            r2 = 0
        L_0x0046:
            if (r2 >= r1) goto L_0x0076
            java.lang.Object r3 = r0.get(r2)
            com.google.protos.f.a.ao r3 = (com.google.protos.p4985f.p4986a.C64661ao) r3
            com.google.android.libraries.gsa.actionusermodel.c.d r5 = com.google.android.libraries.gsa.actionusermodel.p1830c.C22101d.f60914d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.gsa.actionusermodel.c.c r5 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22100c) r5
            java.lang.String r3 = r3.f175267b
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.libraries.gsa.actionusermodel.c.d r6 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22101d) r6
            r3.getClass()
            int r7 = r6.f60916a
            r7 = r7 | 1
            r6.f60916a = r7
            r6.f60917b = r3
            com.google.protobuf.bv r3 = r5.build()
            com.google.android.libraries.gsa.actionusermodel.c.d r3 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22101d) r3
            r15.mo27356c(r3)
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0076:
            com.google.android.libraries.gsa.k.g r13 = r14.f61121d
            com.google.android.libraries.gsa.actionusermodel.az r1 = r14.f61119b
            r2 = r1
            com.google.android.libraries.gsa.actionusermodel.AumNativeResolverImpl r2 = (com.google.android.libraries.gsa.actionusermodel.AumNativeResolverImpl) r2
            java.lang.Object r3 = r2.f60741b
            monitor-enter(r3)
            com.google.android.libraries.gsa.actionusermodel.AumNativeResolverImpl r1 = (com.google.android.libraries.gsa.actionusermodel.AumNativeResolverImpl) r1     // Catch:{ all -> 0x00de }
            boolean r1 = r1.f60742c     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x008e
            com.google.android.apps.gsa.x.c r1 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x00de }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ all -> 0x00de }
            monitor-exit(r3)     // Catch:{ all -> 0x00de }
            goto L_0x00a0
        L_0x008e:
            monitor-exit(r3)     // Catch:{ all -> 0x00de }
            com.google.android.libraries.gsa.k.g r1 = r2.f60743d
            com.google.android.libraries.gsa.actionusermodel.ba r3 = new com.google.android.libraries.gsa.actionusermodel.ba
            r3.<init>(r2)
            java.lang.String r2 = "AumNativeResolverImpl.ensureLibraryIsLoaded"
            com.google.common.util.concurrent.cx r1 = r1.mo28207g(r2, r3)
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.gsa.p8883x.C118826c.m197213c(r1)
        L_0x00a0:
            r12 = r1
            com.google.android.libraries.gsa.actionusermodel.w r11 = new com.google.android.libraries.gsa.actionusermodel.w
            r1 = r11
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r0 = r11
            r11 = r26
            r16 = r15
            r15 = r12
            r12 = r27
            r14 = r13
            r13 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "AumExecutor.resolve with aumNativeResolver.ensureLibraryIsLoaded."
            com.google.common.util.concurrent.cx r0 = r14.mo28210j(r15, r1, r0)
            r1 = r17
            com.google.android.libraries.gsa.k.g r2 = r1.f61121d
            com.google.android.libraries.gsa.actionusermodel.x r3 = new com.google.android.libraries.gsa.actionusermodel.x
            r4 = r26
            r5 = r16
            r3.<init>(r1, r5, r4)
            java.lang.String r4 = "AumExecutor.resolve with getAumRequestFuture."
            com.google.common.util.concurrent.cx r0 = r2.mo28209i(r0, r4, r3)
            return r0
        L_0x00de:
            r0 = move-exception
            r1 = r14
        L_0x00e0:
            monitor-exit(r3)     // Catch:{ all -> 0x00e2 }
            throw r0
        L_0x00e2:
            r0 = move-exception
            goto L_0x00e0
        L_0x00e4:
            r1 = r14
            r5 = r15
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.libraries.gsa.actionusermodel.c.g r0 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g) r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.actionusermodel.C22153y.mo27368k(com.google.common.b.gu, java.lang.String, java.lang.String, com.google.bb.a.x, int, com.google.protos.f.a.bc, j$.util.Optional, com.google.protobuf.z, boolean, com.google.protos.f.a.r, boolean):com.google.common.util.concurrent.cx");
    }
}
