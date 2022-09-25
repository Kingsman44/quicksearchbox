package com.google.android.apps.gsa.shared.p7192v;

import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.search.googleapp.p10370p.C136853at;
import com.google.android.apps.search.googleapp.p10370p.C136855av;
import com.google.android.apps.search.googleapp.p10370p.C136856aw;
import com.google.android.apps.search.googleapp.p10370p.C136861ba;
import com.google.android.apps.search.googleapp.p10370p.C136862bb;
import com.google.android.apps.search.googleapp.p10370p.C136864bd;
import com.google.android.apps.search.googleapp.p10370p.C136866bf;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.p3045b.C39194a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60545tw;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Instant;
import p3186j$.time.Period;
import p3186j$.time.temporal.ChronoUnit;
import p3186j$.util.Objects;
import p5451f.p5452a.p5453a.p5454a.C69442g;
import p5451f.p5452a.p5453a.p5454a.C69443h;
import p5451f.p5452a.p5453a.p5454a.C69445j;
import p5451f.p5452a.p5453a.p5454a.C69447l;
import p5451f.p5452a.p5453a.p5454a.C69448m;
import p5451f.p5452a.p5453a.p5454a.C69449n;
import p5451f.p5452a.p5453a.p5454a.C69451p;

/* renamed from: com.google.android.apps.gsa.shared.v.r */
/* compiled from: PG */
public final class C91165r {

    /* renamed from: a */
    public static final C58528ij f254530a = C58528ij.m90011K(7, 28);

    /* renamed from: b */
    public static final int f254531b = C39194a.m68626a("and.gsa.monet.minus1").f161425b;

    /* renamed from: c */
    private static final C59071e f254532c = C59071e.m91332i("com.google.android.apps.gsa.shared.v.r");

    /* renamed from: a */
    public static int m148926a(C86124t tVar) {
        return (int) tVar.mo79743a(C89972ak.f246559ag);
    }

    /* renamed from: b */
    public static long m148927b(int i, C42876ab abVar) {
        C60870cx g = C60922j.m93044g(abVar.mo46042d(), new C91152e(i), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        if (C90877ak.m148480n(g)) {
            return ((Long) C90877ak.m148474h(g)).longValue();
        }
        return 0;
    }

    /* renamed from: c */
    public static C136866bf m148928c(int i, C21370a aVar, C86124t tVar, C136864bd bdVar, C136853at atVar) {
        long b = aVar.mo26870b();
        C136855av avVar = (C136855av) C136856aw.f372499e.createBuilder();
        avVar.copyOnWrite();
        C136856aw awVar = (C136856aw) avVar.instance;
        awVar.f372501a |= 1;
        awVar.f372502b = b;
        C136856aw awVar2 = (C136856aw) avVar.build();
        Map unmodifiableMap = Collections.unmodifiableMap(((C136866bf) bdVar.instance).f372521b);
        Integer valueOf = Integer.valueOf(i);
        if (unmodifiableMap.containsKey(valueOf)) {
            awVar2 = (C136856aw) unmodifiableMap.get(valueOf);
        }
        C136855av avVar2 = (C136855av) awVar2.toBuilder();
        if (!m148938m(tVar) || i == 1) {
            bdVar.mo113415a(i, (C136856aw) avVar2.build());
            return (C136866bf) bdVar.build();
        }
        long epochMilli = Instant.ofEpochMilli(b).truncatedTo(ChronoUnit.DAYS).toEpochMilli();
        avVar2.copyOnWrite();
        C136856aw awVar3 = (C136856aw) avVar2.instance;
        awVar3.f372501a |= 2;
        awVar3.f372503c = b;
        C136862bb bbVar = C136862bb.f372511d;
        Map unmodifiableMap2 = Collections.unmodifiableMap(((C136856aw) avVar2.instance).f372504d);
        Long valueOf2 = Long.valueOf(epochMilli);
        if (unmodifiableMap2.containsKey(valueOf2)) {
            bbVar = (C136862bb) unmodifiableMap2.get(valueOf2);
        }
        C136861ba baVar = (C136861ba) bbVar.toBuilder();
        int i2 = ((C136862bb) baVar.instance).f372514b;
        baVar.copyOnWrite();
        C136862bb bbVar2 = (C136862bb) baVar.instance;
        bbVar2.f372513a |= 1;
        bbVar2.f372514b = i2 + 1;
        if ((atVar.f372496a & 1) != 0) {
            int i3 = atVar.f372497b;
            HashSet hashSet = new HashSet(Collections.unmodifiableList(bbVar2.f372515c));
            hashSet.add(Integer.valueOf(i3));
            baVar.copyOnWrite();
            ((C136862bb) baVar.instance).f372515c = C136862bb.emptyIntList();
            baVar.copyOnWrite();
            C136862bb bbVar3 = (C136862bb) baVar.instance;
            C62961ch chVar = bbVar3.f372515c;
            if (!chVar.mo58948c()) {
                bbVar3.f372515c = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) hashSet, (List) bbVar3.f372515c);
        }
        C136862bb bbVar4 = (C136862bb) baVar.build();
        bbVar4.getClass();
        avVar2.copyOnWrite();
        ((C136856aw) avVar2.instance).mo113414a().put(valueOf2, bbVar4);
        bdVar.mo113415a(i, (C136856aw) avVar2.build());
        return (C136866bf) bdVar.build();
    }

    /* renamed from: d */
    public static C60870cx m148929d(C86124t tVar, C42876ab abVar, C21370a aVar) {
        if (!m148940o(tVar)) {
            return C118826c.f331423b;
        }
        C60870cx h = C60922j.m93045h(abVar.mo46042d(), new C91151d(Instant.ofEpochMilli(aVar.mo26870b()).truncatedTo(ChronoUnit.DAYS), tVar, abVar), C60826bg.f164896a);
        C90476a aVar2 = C91018d.f254254a;
        return h;
    }

    /* renamed from: e */
    public static C60870cx m148930e(Instant instant, C86124t tVar, C42876ab abVar) {
        if (!m148938m(tVar)) {
            return C60856cj.m92900i(C60545tw.f164030b);
        }
        C69449n g = m148932g(tVar);
        if (g == null) {
            return C60856cj.m92900i(C60545tw.f164030b);
        }
        C60870cx g2 = C60922j.m93044g(abVar.mo46042d(), new C91148a(g, instant, tVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g2;
    }

    /* renamed from: f */
    public static C69448m m148931f(C69449n nVar, int i) {
        for (C69448m mVar : nVar.f185851a) {
            if (mVar.f185846c == i) {
                return mVar;
            }
        }
        return C69448m.f185842e;
    }

    /* renamed from: g */
    public static C69449n m148932g(C86124t tVar) {
        if (!tVar.mo79746e(C89972ak.f246580u)) {
            return null;
        }
        C69443h hVar = (C69443h) C69449n.f185849b.createBuilder();
        try {
            for (String decode : tVar.mo79745c(C89972ak.f246538M)) {
                for (C69448m mVar : ((C69449n) C62942bv.parseFrom((C62942bv) C69449n.f185849b, Base64.decode(decode, 0))).f185851a) {
                    if (C69447l.m100760a(mVar.f185846c) != null) {
                        Iterator it = mVar.f185844a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C59743a.m92497a(((Integer) it.next()).intValue()) == null) {
                                    break;
                                }
                            } else {
                                Iterator it2 = mVar.f185845b.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C69445j jVar = (C69445j) it2.next();
                                        if (C89849ae.m146281a(jVar.f185823a) != null) {
                                            if (C89849ae.m146281a(jVar.f185824b) == null) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        hVar.copyOnWrite();
                                        C69449n nVar = (C69449n) hVar.instance;
                                        mVar.getClass();
                                        C62971cq cqVar = nVar.f185851a;
                                        if (!cqVar.mo58948c()) {
                                            nVar.f185851a = C62942bv.mutableCopy(cqVar);
                                        }
                                        nVar.f185851a.add(mVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return (C69449n) hVar.build();
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f254532c.mo56225c()).mo56382g(e)).mo56372aa(10626)).mo56386p("Failed to parse growth proto.");
            return null;
        }
    }

    /* renamed from: h */
    public static C69451p m148933h(C69442g gVar, int i) {
        if (gVar.equals(C69442g.f185816c)) {
            return C69451p.UNKNOWN_ACTIVITY;
        }
        if (i == -1) {
            return C69451p.PENDING_ACTIVITY;
        }
        if (i == 0) {
            return C69451p.NO_ACTIVITY;
        }
        if (i < gVar.f185818a) {
            return C69451p.LOW_ACTIVITY;
        }
        if (i >= gVar.f185819b) {
            return C69451p.HIGH_ACTIVITY;
        }
        return C69451p.MEDIUM_ACTIVITY;
    }

    /* renamed from: i */
    public static Period m148934i(int i, C86124t tVar) {
        return Period.ofDays(Math.min(i, (int) tVar.mo79743a(C89972ak.f246559ag)));
    }

    /* renamed from: j */
    public static String m148935j(Map map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(Math.min(((Integer) entry.getValue()).intValue(), 99));
            sb.append(";");
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static String m148936k(String str, Map map) {
        StringBuilder sb = new StringBuilder("[");
        if (C58837ba.m90859h(str) || map.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        sb.append(str);
        sb.append("|");
        sb.append(m148935j(map));
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: l */
    public static Map m148937l(C86124t tVar, C42876ab abVar) {
        C69449n g;
        HashMap hashMap = new HashMap();
        if (tVar.mo79746e(C89972ak.f246580u) && (g = m148932g(tVar)) != null && !Objects.equals(g, C69449n.f185849b)) {
            for (C69448m mVar : g.f185851a) {
                int i = mVar.f185846c;
                hashMap.put(Integer.valueOf(i), Long.valueOf(m148927b(i, abVar)));
            }
            hashMap.put(1, Long.valueOf(m148927b(1, abVar)));
        }
        return hashMap;
    }

    /* renamed from: m */
    public static boolean m148938m(C86124t tVar) {
        return tVar.mo79746e(C89972ak.f246580u) && tVar.mo79746e(C89972ak.f246569j);
    }

    /* renamed from: n */
    public static boolean m148939n(C21370a aVar, C86124t tVar, C42876ab abVar) {
        if (aVar.mo26870b() - m148927b(1, abVar) < TimeUnit.MINUTES.toMillis(tVar.mo79743a(C89972ak.f246549X))) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m148940o(C86124t tVar) {
        return m148938m(tVar) && tVar.mo79746e(C89972ak.f246534I);
    }

    /* renamed from: p */
    public static boolean m148941p(long j, Instant instant) {
        return j != 0 && !instant.isBefore(Instant.ofEpochMilli(j).truncatedTo(ChronoUnit.DAYS));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.google.android.apps.search.googleapp.p.aw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m148942q(com.google.android.apps.search.googleapp.p10370p.C136866bf r3, p3186j$.time.Instant r4) {
        /*
            com.google.android.apps.search.googleapp.p.aw r0 = com.google.android.apps.search.googleapp.p10370p.C136856aw.f372499e
            com.google.protobuf.dn r3 = r3.f372521b
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L_0x0016
            java.lang.Object r3 = r3.get(r1)
            r0 = r3
            com.google.android.apps.search.googleapp.p.aw r0 = (com.google.android.apps.search.googleapp.p10370p.C136856aw) r0
        L_0x0016:
            long r0 = r0.f372502b
            boolean r3 = m148941p(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7192v.C91165r.m148942q(com.google.android.apps.search.googleapp.p.bf, j$.time.Instant):boolean");
    }

    /* renamed from: r */
    public static C60870cx m148943r(C21370a aVar, C86124t tVar, C42876ab abVar, int i) {
        return m148950y(aVar, tVar, abVar, i, C91159l.f254515a);
    }

    /* renamed from: s */
    public static C60870cx m148944s(C21370a aVar, C86124t tVar, C42876ab abVar, int i) {
        return m148950y(aVar, tVar, abVar, i, C91163p.f254524a);
    }

    /* renamed from: t */
    public static void m148945t(int i, C21370a aVar, C86124t tVar, C42876ab abVar, C136853at atVar) {
        if (tVar.mo79746e(C89972ak.f246580u) || i == 1) {
            C118826c.m197213c(abVar.mo46039a(new C91157j(i, aVar, tVar, atVar), C60826bg.f164896a));
        } else {
            C118826c cVar = C118826c.f331422a;
        }
    }

    /* renamed from: u */
    public static void m148946u(C21370a aVar, C86124t tVar, C42876ab abVar) {
        if (!tVar.mo79746e(C89972ak.f246580u)) {
            C118826c cVar = C118826c.f331422a;
        } else {
            C118826c.m197213c(abVar.mo46039a(new C91154g(aVar, tVar), C60826bg.f164896a));
        }
    }

    /* renamed from: v */
    public static C60870cx m148947v(C86124t tVar, C42876ab abVar, C21370a aVar, C69447l lVar, int i, int i2) {
        if (!m148940o(tVar)) {
            return C60856cj.m92900i(C69451p.UNKNOWN_ACTIVITY);
        }
        if (lVar == null || i == 0 || i2 == 0) {
            return C60856cj.m92900i(C69451p.UNKNOWN_ACTIVITY);
        }
        C60870cx h = C60922j.m93045h(abVar.mo46042d(), new C91156i(Instant.ofEpochMilli(aVar.mo26870b()).truncatedTo(ChronoUnit.DAYS).toEpochMilli(), tVar, abVar, aVar, lVar, i, i2), C60826bg.f164896a);
        C90476a aVar2 = C91018d.f254254a;
        return h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.apps.search.googleapp.p.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.googleapp.p.az} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p5451f.p5452a.p5453a.p5454a.C69451p m148948w(com.google.android.apps.search.googleapp.p10370p.C136866bf r1, long r2, p5451f.p5452a.p5453a.p5454a.C69447l r4, int r5, int r6) {
        /*
            com.google.android.apps.search.googleapp.p.az r0 = com.google.android.apps.search.googleapp.p10370p.C136859az.f372506b
            com.google.protobuf.dn r1 = r1.f372524e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L_0x0015
            java.lang.Object r1 = r1.get(r2)
            r0 = r1
            com.google.android.apps.search.googleapp.p.az r0 = (com.google.android.apps.search.googleapp.p10370p.C136859az) r0
        L_0x0015:
            int r1 = r4.f185841o
            com.google.android.apps.search.googleapp.p.ar r2 = com.google.android.apps.search.googleapp.p10370p.C136851ar.f372487f
            com.google.protobuf.dn r3 = r0.f372508a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r4 = r3.containsKey(r1)
            if (r4 == 0) goto L_0x002c
            java.lang.Object r1 = r3.get(r1)
            r2 = r1
            com.google.android.apps.search.googleapp.p.ar r2 = (com.google.android.apps.search.googleapp.p10370p.C136851ar) r2
        L_0x002c:
            r1 = 2
            if (r5 != r1) goto L_0x003d
            if (r6 != r1) goto L_0x003c
            int r1 = r2.f372490b
            f.a.a.a.p r1 = p5451f.p5452a.p5453a.p5454a.C69451p.m100761a(r1)
            if (r1 != 0) goto L_0x003b
            f.a.a.a.p r1 = p5451f.p5452a.p5453a.p5454a.C69451p.UNKNOWN_ACTIVITY
        L_0x003b:
            return r1
        L_0x003c:
            r5 = 2
        L_0x003d:
            r3 = 3
            if (r5 != r1) goto L_0x004d
            if (r6 != r3) goto L_0x004d
            int r1 = r2.f372491c
            f.a.a.a.p r1 = p5451f.p5452a.p5453a.p5454a.C69451p.m100761a(r1)
            if (r1 != 0) goto L_0x004c
            f.a.a.a.p r1 = p5451f.p5452a.p5453a.p5454a.C69451p.UNKNOWN_ACTIVITY
        L_0x004c:
            return r1
        L_0x004d:
            if (r5 != r3) goto L_0x005c
            if (r6 != r1) goto L_0x005c
            int r1 = r2.f372492d
            f.a.a.a.p r1 = p5451f.p5452a.p5453a.p5454a.C69451p.m100761a(r1)
            if (r1 != 0) goto L_0x005b
            f.a.a.a.p r1 = p5451f.p5452a.p5453a.p5454a.C69451p.UNKNOWN_ACTIVITY
        L_0x005b:
            return r1
        L_0x005c:
            if (r5 != r3) goto L_0x006b
            if (r6 != r3) goto L_0x006b
            int r1 = r2.f372493e
            f.a.a.a.p r1 = p5451f.p5452a.p5453a.p5454a.C69451p.m100761a(r1)
            if (r1 != 0) goto L_0x006a
            f.a.a.a.p r1 = p5451f.p5452a.p5453a.p5454a.C69451p.UNKNOWN_ACTIVITY
        L_0x006a:
            return r1
        L_0x006b:
            f.a.a.a.p r1 = p5451f.p5452a.p5453a.p5454a.C69451p.UNKNOWN_ACTIVITY
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7192v.C91165r.m148948w(com.google.android.apps.search.googleapp.p.bf, long, f.a.a.a.l, int, int):f.a.a.a.p");
    }

    /* renamed from: x */
    public static void m148949x(C21370a aVar, C42876ab abVar) {
        abVar.mo46039a(new C91153f(aVar), C60826bg.f164896a);
    }

    /* renamed from: y */
    private static C60870cx m148950y(C21370a aVar, C86124t tVar, C42876ab abVar, int i, C58817ah ahVar) {
        C69449n g = m148932g(tVar);
        if (g == null) {
            return C60856cj.m92899h(new C62974ct("Null proto returned."));
        }
        if (!m148938m(tVar)) {
            return C60856cj.m92899h(new C62974ct("Feature is not enabled."));
        }
        C60870cx g2 = C60922j.m93044g(abVar.mo46042d(), new C91150c(g, aVar, i, tVar, ahVar), C60826bg.f164896a);
        C90476a aVar2 = C91018d.f254254a;
        return g2;
    }
}
