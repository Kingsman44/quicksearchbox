package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60951j;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4479cg.C58072d;
import com.google.p4479cg.p4480a.C58068e;
import com.google.protos.p5145v.C65909m;
import com.google.protos.p5145v.C65911o;
import com.google.protos.p5145v.C65913q;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.p.ao */
/* compiled from: PG */
public final class C136848ao {

    /* renamed from: a */
    public static final C59071e f372475a = C59071e.m91332i("com.google.android.apps.search.googleapp.p.ao");

    /* renamed from: b */
    public static final Duration f372476b = Duration.ofDays(7);

    /* renamed from: c */
    public static final Duration f372477c = Duration.ofDays(28);

    /* renamed from: d */
    public static final Duration f372478d = Duration.ofDays(90);

    /* renamed from: e */
    public final C42876ab f372479e;

    /* renamed from: f */
    public final C60887da f372480f;

    /* renamed from: g */
    public final C69464a f372481g;

    /* renamed from: h */
    public final Executor f372482h;

    /* renamed from: i */
    public final C21370a f372483i;

    /* renamed from: j */
    public final Map f372484j;

    /* renamed from: k */
    public final boolean f372485k;

    public C136848ao(C21370a aVar, C60887da daVar, Executor executor, C69464a aVar2, C42876ab abVar, C65909m mVar, boolean z) {
        this.f372480f = daVar;
        this.f372482h = executor;
        this.f372479e = abVar;
        this.f372481g = aVar2;
        this.f372483i = aVar;
        this.f372484j = Collections.unmodifiableMap(mVar.f179246a);
        this.f372485k = z;
    }

    /* renamed from: a */
    public static C136847an m222535a(Map map, Instant instant, Instant instant2) {
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            long longValue = ((Long) entry.getKey()).longValue();
            int intValue = ((Integer) entry.getValue()).intValue();
            if (longValue >= instant.toEpochMilli() && longValue <= instant2.toEpochMilli()) {
                i += intValue > 0 ? 1 : 0;
                i2 += intValue;
            }
        }
        return new C136833a(i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.google.android.apps.search.googleapp.p.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: com.google.android.apps.search.googleapp.p.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4522b.C58485gu m222536b(com.google.android.apps.search.googleapp.p10370p.C136881q r9, long r10) {
        /*
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.protobuf.dn r1 = r9.f372554a
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0012:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01ba
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            com.google.android.apps.search.googleapp.p.k r4 = com.google.android.apps.search.googleapp.p10370p.C136875k.f372537e
            com.google.protobuf.dn r5 = r9.f372554a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r6 = r5.containsKey(r3)
            if (r6 == 0) goto L_0x0037
            java.lang.Object r3 = r5.get(r3)
            r4 = r3
            com.google.android.apps.search.googleapp.p.k r4 = (com.google.android.apps.search.googleapp.p10370p.C136875k) r4
        L_0x0037:
            com.google.protos.v.x r3 = com.google.protos.p5145v.C65920x.f179266m
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.protos.v.w r3 = (com.google.protos.p5145v.C65919w) r3
            com.google.android.apps.search.googleapp.p.f r5 = com.google.android.apps.search.googleapp.p10370p.C136870f.f372528b
            com.google.protobuf.dn r6 = r9.f372555b
            java.lang.Long r7 = java.lang.Long.valueOf(r10)
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x0053
            java.lang.Object r5 = r6.get(r7)
            com.google.android.apps.search.googleapp.p.f r5 = (com.google.android.apps.search.googleapp.p10370p.C136870f) r5
        L_0x0053:
            com.google.android.apps.search.googleapp.p.f r6 = com.google.android.apps.search.googleapp.p10370p.C136870f.f372528b
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x01af
            com.google.android.apps.search.googleapp.p.k r6 = com.google.android.apps.search.googleapp.p10370p.C136875k.f372537e
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L_0x01af
            int r6 = r2.intValue()
            com.google.protobuf.dn r7 = r5.f372530a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto L_0x01af
            int r6 = r2.intValue()
            com.google.android.apps.search.googleapp.p.m r7 = com.google.android.apps.search.googleapp.p10370p.C136877m.f372543f
            com.google.protobuf.dn r5 = r5.f372530a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r8 = r5.containsKey(r6)
            if (r8 == 0) goto L_0x008c
            java.lang.Object r5 = r5.get(r6)
            r7 = r5
            com.google.android.apps.search.googleapp.p.m r7 = (com.google.android.apps.search.googleapp.p10370p.C136877m) r7
        L_0x008c:
            int r2 = r2.intValue()
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.protos.v.x r5 = (com.google.protos.p5145v.C65920x) r5
            int r6 = r5.f179268a
            r6 = r6 | 1
            r5.f179268a = r6
            r5.f179269b = r2
            com.google.cg.d r2 = r4.f372540b
            if (r2 != 0) goto L_0x00a5
            com.google.cg.d r2 = com.google.p4479cg.C58072d.f155218d
        L_0x00a5:
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.protos.v.x r5 = (com.google.protos.p5145v.C65920x) r5
            r2.getClass()
            r5.f179270c = r2
            int r2 = r5.f179268a
            r2 = r2 | 2
            r5.f179268a = r2
            com.google.cg.d r2 = r4.f372541c
            if (r2 != 0) goto L_0x00bd
            com.google.cg.d r2 = com.google.p4479cg.C58072d.f155218d
        L_0x00bd:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.v.x r4 = (com.google.protos.p5145v.C65920x) r4
            r2.getClass()
            r4.f179271d = r2
            int r2 = r4.f179268a
            r2 = r2 | 4
            r4.f179268a = r2
            com.google.android.apps.search.googleapp.p.h r2 = r7.f372546b
            if (r2 != 0) goto L_0x00d5
            com.google.android.apps.search.googleapp.p.h r2 = com.google.android.apps.search.googleapp.p10370p.C136872h.f372531d
        L_0x00d5:
            int r2 = r2.f372535c
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.v.x r4 = (com.google.protos.p5145v.C65920x) r4
            int r5 = r4.f179268a
            r5 = r5 | 8
            r4.f179268a = r5
            r4.f179272e = r2
            com.google.android.apps.search.googleapp.p.h r2 = r7.f372547c
            if (r2 != 0) goto L_0x00ec
            com.google.android.apps.search.googleapp.p.h r2 = com.google.android.apps.search.googleapp.p10370p.C136872h.f372531d
        L_0x00ec:
            int r2 = r2.f372535c
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.v.x r4 = (com.google.protos.p5145v.C65920x) r4
            int r5 = r4.f179268a
            r5 = r5 | 16
            r4.f179268a = r5
            r4.f179273f = r2
            com.google.android.apps.search.googleapp.p.h r2 = r7.f372548d
            if (r2 != 0) goto L_0x0103
            com.google.android.apps.search.googleapp.p.h r2 = com.google.android.apps.search.googleapp.p10370p.C136872h.f372531d
        L_0x0103:
            int r2 = r2.f372535c
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.v.x r4 = (com.google.protos.p5145v.C65920x) r4
            int r5 = r4.f179268a
            r5 = r5 | 32
            r4.f179268a = r5
            r4.f179274g = r2
            com.google.android.apps.search.googleapp.p.h r2 = r7.f372549e
            if (r2 != 0) goto L_0x011a
            com.google.android.apps.search.googleapp.p.h r2 = com.google.android.apps.search.googleapp.p10370p.C136872h.f372531d
        L_0x011a:
            int r2 = r2.f372535c
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.v.x r4 = (com.google.protos.p5145v.C65920x) r4
            int r5 = r4.f179268a
            r5 = r5 | 64
            r4.f179268a = r5
            r4.f179275h = r2
            com.google.android.apps.search.googleapp.p.h r2 = r7.f372546b
            if (r2 != 0) goto L_0x0131
            com.google.android.apps.search.googleapp.p.h r2 = com.google.android.apps.search.googleapp.p10370p.C136872h.f372531d
        L_0x0131:
            int r2 = r2.f372534b
            com.google.protos.v.q r2 = com.google.protos.p5145v.C65913q.m96825a(r2)
            if (r2 != 0) goto L_0x013b
            com.google.protos.v.q r2 = com.google.protos.p5145v.C65913q.UNKNOWN_ACTIVITY
        L_0x013b:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.v.x r4 = (com.google.protos.p5145v.C65920x) r4
            int r2 = r2.f179260g
            r4.f179276i = r2
            int r2 = r4.f179268a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r4.f179268a = r2
            com.google.android.apps.search.googleapp.p.h r2 = r7.f372547c
            if (r2 != 0) goto L_0x0152
            com.google.android.apps.search.googleapp.p.h r2 = com.google.android.apps.search.googleapp.p10370p.C136872h.f372531d
        L_0x0152:
            int r2 = r2.f372534b
            com.google.protos.v.q r2 = com.google.protos.p5145v.C65913q.m96825a(r2)
            if (r2 != 0) goto L_0x015c
            com.google.protos.v.q r2 = com.google.protos.p5145v.C65913q.UNKNOWN_ACTIVITY
        L_0x015c:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.v.x r4 = (com.google.protos.p5145v.C65920x) r4
            int r2 = r2.f179260g
            r4.f179278k = r2
            int r2 = r4.f179268a
            r2 = r2 | 512(0x200, float:7.175E-43)
            r4.f179268a = r2
            com.google.android.apps.search.googleapp.p.h r2 = r7.f372548d
            if (r2 != 0) goto L_0x0173
            com.google.android.apps.search.googleapp.p.h r2 = com.google.android.apps.search.googleapp.p10370p.C136872h.f372531d
        L_0x0173:
            int r2 = r2.f372534b
            com.google.protos.v.q r2 = com.google.protos.p5145v.C65913q.m96825a(r2)
            if (r2 != 0) goto L_0x017d
            com.google.protos.v.q r2 = com.google.protos.p5145v.C65913q.UNKNOWN_ACTIVITY
        L_0x017d:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.v.x r4 = (com.google.protos.p5145v.C65920x) r4
            int r2 = r2.f179260g
            r4.f179277j = r2
            int r2 = r4.f179268a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r4.f179268a = r2
            com.google.android.apps.search.googleapp.p.h r2 = r7.f372549e
            if (r2 != 0) goto L_0x0194
            com.google.android.apps.search.googleapp.p.h r2 = com.google.android.apps.search.googleapp.p10370p.C136872h.f372531d
        L_0x0194:
            int r2 = r2.f372534b
            com.google.protos.v.q r2 = com.google.protos.p5145v.C65913q.m96825a(r2)
            if (r2 != 0) goto L_0x019e
            com.google.protos.v.q r2 = com.google.protos.p5145v.C65913q.UNKNOWN_ACTIVITY
        L_0x019e:
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.protos.v.x r4 = (com.google.protos.p5145v.C65920x) r4
            int r2 = r2.f179260g
            r4.f179279l = r2
            int r2 = r4.f179268a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r4.f179268a = r2
        L_0x01af:
            com.google.protobuf.bv r2 = r3.build()
            com.google.protos.v.x r2 = (com.google.protos.p5145v.C65920x) r2
            r0.mo55395g(r2)
            goto L_0x0012
        L_0x01ba:
            com.google.common.b.gu r9 = r0.mo55394f()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10370p.C136848ao.m222536b(com.google.android.apps.search.googleapp.p.q, long):com.google.common.b.gu");
    }

    /* renamed from: e */
    static final C136872h m222537e(C58072d dVar, Instant instant, Duration duration, int i, C65911o oVar) {
        C65913q qVar;
        ((C59052c) ((C59052c) f372475a.mo56224b()).mo56372aa(40684)).mo56386p("#calculateFeatureUsage");
        if (oVar.equals(C65911o.f179247c)) {
            C136871g gVar = (C136871g) C136872h.f372531d.createBuilder();
            C65913q qVar2 = C65913q.UNKNOWN_ACTIVITY;
            gVar.copyOnWrite();
            C136872h hVar = (C136872h) gVar.instance;
            hVar.f372534b = qVar2.f179260g;
            hVar.f372533a |= 1;
            gVar.copyOnWrite();
            C136872h hVar2 = (C136872h) gVar.instance;
            hVar2.f372533a |= 2;
            hVar2.f372535c = -1;
            return (C136872h) gVar.build();
        }
        if (instant.minus(duration).isAfter(C58068e.m88826d(dVar).atStartOfDay(C60951j.f165070a).toInstant())) {
            C65913q qVar3 = C65913q.UNKNOWN_ACTIVITY;
            if (i == 0) {
                qVar = C65913q.NO_ACTIVITY;
                i = 0;
            } else {
                qVar = i < oVar.f179249a ? C65913q.LOW_ACTIVITY : i < oVar.f179250b ? C65913q.MEDIUM_ACTIVITY : C65913q.HIGH_ACTIVITY;
            }
            C136871g gVar2 = (C136871g) C136872h.f372531d.createBuilder();
            gVar2.copyOnWrite();
            C136872h hVar3 = (C136872h) gVar2.instance;
            hVar3.f372534b = qVar.f179260g;
            hVar3.f372533a |= 1;
            gVar2.copyOnWrite();
            C136872h hVar4 = (C136872h) gVar2.instance;
            hVar4.f372533a |= 2;
            hVar4.f372535c = i;
            return (C136872h) gVar2.build();
        }
        C136871g gVar3 = (C136871g) C136872h.f372531d.createBuilder();
        C65913q qVar4 = C65913q.PENDING_ACTIVITY;
        gVar3.copyOnWrite();
        C136872h hVar5 = (C136872h) gVar3.instance;
        hVar5.f372534b = qVar4.f179260g;
        hVar5.f372533a |= 1;
        gVar3.copyOnWrite();
        C136872h hVar6 = (C136872h) gVar3.instance;
        hVar6.f372533a |= 2;
        hVar6.f372535c = -1;
        return (C136872h) gVar3.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.googleapp.p.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protos.p5145v.C65913q m222538f(com.google.android.apps.search.googleapp.p10370p.C136881q r1, int r2, long r3) {
        /*
            com.google.android.apps.search.googleapp.p.f r0 = com.google.android.apps.search.googleapp.p10370p.C136870f.f372528b
            com.google.protobuf.dn r1 = r1.f372555b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r4 = r1.containsKey(r3)
            if (r4 == 0) goto L_0x0015
            java.lang.Object r1 = r1.get(r3)
            r0 = r1
            com.google.android.apps.search.googleapp.p.f r0 = (com.google.android.apps.search.googleapp.p10370p.C136870f) r0
        L_0x0015:
            com.google.android.apps.search.googleapp.p.m r1 = com.google.android.apps.search.googleapp.p10370p.C136877m.f372543f
            com.google.protobuf.dn r3 = r0.f372530a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r4 = r3.containsKey(r2)
            if (r4 == 0) goto L_0x0029
            java.lang.Object r1 = r3.get(r2)
            com.google.android.apps.search.googleapp.p.m r1 = (com.google.android.apps.search.googleapp.p10370p.C136877m) r1
        L_0x0029:
            com.google.android.apps.search.googleapp.p.h r1 = r1.f372548d
            if (r1 != 0) goto L_0x002f
            com.google.android.apps.search.googleapp.p.h r1 = com.google.android.apps.search.googleapp.p10370p.C136872h.f372531d
        L_0x002f:
            int r1 = r1.f372534b
            com.google.protos.v.q r1 = com.google.protos.p5145v.C65913q.m96825a(r1)
            if (r1 != 0) goto L_0x0039
            com.google.protos.v.q r1 = com.google.protos.p5145v.C65913q.UNKNOWN_ACTIVITY
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10370p.C136848ao.m222538f(com.google.android.apps.search.googleapp.p.q, int, long):com.google.protos.v.q");
    }

    /* renamed from: c */
    public final C60870cx mo113412c() {
        return this.f372479e.mo46039a(new C136846am(this, Instant.ofEpochMilli(this.f372483i.mo26870b()).truncatedTo(ChronoUnit.DAYS)), this.f372480f);
    }

    /* renamed from: d */
    public final C60870cx mo113413d(C58485gu guVar) {
        if (guVar.isEmpty()) {
            return C60866ct.f164955a;
        }
        ((C59052c) ((C59052c) f372475a.mo56224b()).mo56372aa(40690)).mo56389s("Marking usage for %s", guVar);
        return this.f372479e.mo46039a(new C136887w(this, guVar), this.f372480f);
    }
}
