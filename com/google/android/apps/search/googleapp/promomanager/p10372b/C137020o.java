package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63887aa;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63895ai;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63898al;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63919bf;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63921bh;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63927bn;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.o */
/* compiled from: PG */
public final class C137020o {

    /* renamed from: e */
    private static final C59071e f372896e = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.b.o");

    /* renamed from: a */
    public final Executor f372897a;

    /* renamed from: b */
    public C137019n f372898b = new C136945b(C58729pv.f156485a, C63042fg.f170152c);

    /* renamed from: c */
    public C137019n f372899c = new C136945b(C58729pv.f156485a, C63042fg.f170152c);

    /* renamed from: d */
    public C63895ai f372900d = C63895ai.f172768f;

    /* renamed from: f */
    private final C136967bv f372901f;

    /* renamed from: g */
    private final C58528ij f372902g;

    public C137020o(C136967bv bvVar, Executor executor, C65599b bVar) {
        this.f372901f = bvVar;
        this.f372897a = executor;
        this.f372902g = C58528ij.m90006F(bVar.f178301a);
    }

    /* renamed from: c */
    public static boolean m222708c(C63042fg fgVar, Duration duration, Instant instant) {
        return C62950b.m95474e(fgVar).plus(duration).isBefore(instant);
    }

    /* renamed from: d */
    public static boolean m222709d(C63899am amVar, C63887aa aaVar, Instant instant) {
        if (!((amVar.f172782a & 2) == 0 || (aaVar.f172750a & 1) == 0)) {
            C63898al alVar = amVar.f172784c;
            if (alVar == null) {
                alVar = C63898al.f172775d;
            }
            if (m222710e(alVar, aaVar.f172751b, instant)) {
                return true;
            }
        }
        if (!((amVar.f172782a & 4) == 0 || (aaVar.f172750a & 2) == 0)) {
            C63898al alVar2 = amVar.f172785d;
            if (alVar2 == null) {
                alVar2 = C63898al.f172775d;
            }
            if (m222710e(alVar2, aaVar.f172752c, instant)) {
                return true;
            }
        }
        if (!((amVar.f172782a & 8) == 0 || (aaVar.f172750a & 4) == 0)) {
            C63898al alVar3 = amVar.f172786e;
            if (alVar3 == null) {
                alVar3 = C63898al.f172775d;
            }
            if (m222710e(alVar3, aaVar.f172753d, instant)) {
                return true;
            }
        }
        if (!((amVar.f172782a & 16) == 0 || (aaVar.f172750a & 8) == 0)) {
            C63898al alVar4 = amVar.f172787f;
            if (alVar4 == null) {
                alVar4 = C63898al.f172775d;
            }
            if (m222710e(alVar4, aaVar.f172754e, instant)) {
                return true;
            }
        }
        if ((amVar.f172782a & 32) == 0 || (aaVar.f172750a & 16) == 0) {
            return false;
        }
        C63898al alVar5 = amVar.f172788g;
        if (alVar5 == null) {
            alVar5 = C63898al.f172775d;
        }
        if (m222710e(alVar5, aaVar.f172755f, instant)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m222710e(C63898al alVar, int i, Instant instant) {
        C63042fg fgVar = alVar.f172779c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        return alVar.f172778b >= i && instant.isBefore(C62950b.m95474e(fgVar));
    }

    /* renamed from: a */
    public final C137019n mo113478a(C63921bh bhVar, List list, C63042fg fgVar) {
        HashMap hashMap = new HashMap();
        for (C63919bf bfVar : bhVar.f172856a) {
            if (C136968bw.m222637b(bfVar)) {
                C58528ij ijVar = this.f372902g;
                C63909aw awVar = bfVar.f172848b;
                if (awVar == null) {
                    awVar = C63909aw.f172816e;
                }
                if (ijVar.contains(Integer.valueOf(awVar.f172821d))) {
                    C63909aw awVar2 = bfVar.f172848b;
                    if (awVar2 == null) {
                        awVar2 = C63909aw.f172816e;
                    }
                    if (hashMap.containsKey(Integer.valueOf(awVar2.f172820c))) {
                        C59052c cVar = (C59052c) ((C59052c) f372896e.mo56226d()).mo56372aa(40831);
                        C63909aw awVar3 = bfVar.f172848b;
                        if (awVar3 == null) {
                            awVar3 = C63909aw.f172816e;
                        }
                        cVar.mo56387q("promo configuration contains two promos with same deployment Id %d", awVar3.f172820c);
                    }
                    C63909aw awVar4 = bfVar.f172848b;
                    if (awVar4 == null) {
                        awVar4 = C63909aw.f172816e;
                    }
                    hashMap.put(Integer.valueOf(awVar4.f172820c), bfVar);
                }
            }
        }
        EnumMap enumMap = new EnumMap(C63926bm.class);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63919bf bfVar2 = (C63919bf) Map.EL.getOrDefault(hashMap, Integer.valueOf(((Integer) it.next()).intValue()), C63919bf.f172845g);
            if (!bfVar2.f172850d.isEmpty()) {
                for (C63927bn bnVar : bfVar2.f172850d) {
                    C63926bm a = C63926bm.m96318a(bnVar.f172874a);
                    if (a == null) {
                        a = C63926bm.UNSPECIFIED;
                    }
                    if (a != C63926bm.UNSPECIFIED) {
                        List list2 = (List) Map.EL.getOrDefault(enumMap, a, new ArrayList());
                        list2.add(bfVar2);
                        enumMap.put(a, list2);
                    }
                }
            }
        }
        return new C136945b(C58662ni.m90343b(enumMap), fgVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v70, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: com.google.protos.aw.a.a.a.ad} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v79, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: com.google.protos.aw.a.a.a.bd} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (m222708c(r6, com.google.protobuf.p4750c.C62950b.m95473d(r8), r3) != false) goto L_0x0040;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo113479b(com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63915bb r18, com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj r19, com.google.protobuf.C63042fg r20, com.google.common.p4522b.C58495hd r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            j$.time.Instant r3 = com.google.protobuf.p4750c.C62950b.m95474e(r20)
            int r4 = r2.f372882b
            com.google.protos.aw.a.a.a.bm r4 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.m96318a(r4)
            if (r4 != 0) goto L_0x0014
            com.google.protos.aw.a.a.a.bm r4 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63926bm.UNSPECIFIED
        L_0x0014:
            com.google.protos.aw.a.a.a.am r5 = r1.f172829b
            if (r5 != 0) goto L_0x001a
            com.google.protos.aw.a.a.a.am r5 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am.f172780h
        L_0x001a:
            int r6 = r5.f172782a
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0040
            com.google.protos.aw.a.a.a.ai r6 = r0.f372900d
            int r6 = r6.f172770a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0040
            com.google.protobuf.fg r6 = r5.f172783b
            if (r6 != 0) goto L_0x002e
            com.google.protobuf.fg r6 = com.google.protobuf.C63042fg.f170152c
        L_0x002e:
            com.google.protos.aw.a.a.a.ai r8 = r0.f372900d
            com.google.protobuf.ar r8 = r8.f172772c
            if (r8 != 0) goto L_0x0036
            com.google.protobuf.ar r8 = com.google.protobuf.C62910ar.f169858c
        L_0x0036:
            j$.time.Duration r8 = com.google.protobuf.p4750c.C62950b.m95473d(r8)
            boolean r6 = m222708c(r6, r8, r3)
            if (r6 == 0) goto L_0x004e
        L_0x0040:
            com.google.protos.aw.a.a.a.ai r6 = r0.f372900d
            com.google.protos.aw.a.a.a.aa r6 = r6.f172771b
            if (r6 != 0) goto L_0x0048
            com.google.protos.aw.a.a.a.aa r6 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63887aa.f172748g
        L_0x0048:
            boolean r5 = m222709d(r5, r6, r3)
            if (r5 == 0) goto L_0x0057
        L_0x004e:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        L_0x0057:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r21
            java.lang.Object r5 = r6.getOrDefault(r4, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.protos.aw.a.a.a.v[] r6 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v.values()
            j$.util.stream.Stream r6 = p3186j$.util.DesugarArrays.stream((T[]) r6)
            com.google.android.apps.search.googleapp.promomanager.b.j r8 = new com.google.android.apps.search.googleapp.promomanager.b.j
            r8.<init>(r0, r1, r3)
            j$.util.stream.Stream r6 = r6.filter(r8)
            j$.util.stream.Collector r8 = com.google.common.p4522b.C58370cn.f155947b
            java.lang.Object r6 = r6.collect(r8)
            com.google.common.b.ij r6 = (com.google.common.p4522b.C58528ij) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0086:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x02c2
            java.lang.Object r9 = r5.next()
            com.google.protos.aw.a.a.a.bf r9 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63919bf) r9
            com.google.protos.aw.a.a.a.aw r10 = r9.f172848b
            if (r10 != 0) goto L_0x0098
            com.google.protos.aw.a.a.a.aw r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw.f172816e
        L_0x0098:
            int r10 = r10.f172820c
            com.google.protos.aw.a.a.a.bd r11 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63917bd.f172834j
            com.google.protobuf.dn r12 = r1.f172832e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r13 = r12.containsKey(r10)
            if (r13 == 0) goto L_0x00af
            java.lang.Object r10 = r12.get(r10)
            r11 = r10
            com.google.protos.aw.a.a.a.bd r11 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63917bd) r11
        L_0x00af:
            int r10 = r1.f172828a
            r12 = 2
            r10 = r10 & r12
            if (r10 == 0) goto L_0x00c9
            com.google.protos.aw.a.a.a.ao r10 = r1.f172833f
            if (r10 != 0) goto L_0x00bb
            com.google.protos.aw.a.a.a.ao r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63901ao.f172789b
        L_0x00bb:
            com.google.protobuf.cq r10 = r10.f172791a
            com.google.protos.aw.a.a.a.aw r13 = r9.f172848b
            if (r13 != 0) goto L_0x00c3
            com.google.protos.aw.a.a.a.aw r13 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw.f172816e
        L_0x00c3:
            boolean r10 = r10.contains(r13)
            if (r10 != 0) goto L_0x0086
        L_0x00c9:
            com.google.protos.aw.a.a.a.w r10 = r9.f172851e
            if (r10 != 0) goto L_0x00cf
            com.google.protos.aw.a.a.a.w r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w.f172981b
        L_0x00cf:
            int r10 = r10.f172983a
            com.google.protos.aw.a.a.a.v r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v.m96327a(r10)
            if (r10 != 0) goto L_0x00d9
            com.google.protos.aw.a.a.a.v r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63958v.TYPE_UNSPECIFIED
        L_0x00d9:
            boolean r10 = r6.contains(r10)
            if (r10 != 0) goto L_0x0086
            com.google.protos.aw.a.a.a.aw r10 = r9.f172848b
            if (r10 != 0) goto L_0x00e5
            com.google.protos.aw.a.a.a.aw r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw.f172816e
        L_0x00e5:
            int r10 = r10.f172819b
            com.google.protos.aw.a.a.a.am r13 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am.f172780h
            com.google.protobuf.dn r14 = r1.f172831d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r15 = r14.containsKey(r10)
            if (r15 == 0) goto L_0x00fb
            java.lang.Object r13 = r14.get(r10)
            com.google.protos.aw.a.a.a.am r13 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am) r13
        L_0x00fb:
            com.google.protos.aw.a.a.a.ai r14 = r0.f372900d
            com.google.protos.aw.a.a.a.ad r15 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63890ad.f172756d
            com.google.protobuf.dn r14 = r14.f172774e
            boolean r16 = r14.containsKey(r10)
            if (r16 == 0) goto L_0x010e
            java.lang.Object r10 = r14.get(r10)
            r15 = r10
            com.google.protos.aw.a.a.a.ad r15 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63890ad) r15
        L_0x010e:
            int r10 = r13.f172782a
            r10 = r10 & r7
            if (r10 == 0) goto L_0x012f
            int r10 = r15.f172758a
            r10 = r10 & 4
            if (r10 == 0) goto L_0x012f
            com.google.protobuf.fg r10 = r13.f172783b
            if (r10 != 0) goto L_0x011f
            com.google.protobuf.fg r10 = com.google.protobuf.C63042fg.f170152c
        L_0x011f:
            com.google.protobuf.ar r14 = r15.f172760c
            if (r14 != 0) goto L_0x0125
            com.google.protobuf.ar r14 = com.google.protobuf.C62910ar.f169858c
        L_0x0125:
            j$.time.Duration r14 = com.google.protobuf.p4750c.C62950b.m95473d(r14)
            boolean r10 = m222708c(r10, r14, r3)
            if (r10 == 0) goto L_0x0086
        L_0x012f:
            com.google.protos.aw.a.a.a.aa r10 = r15.f172759b
            if (r10 != 0) goto L_0x0135
            com.google.protos.aw.a.a.a.aa r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63887aa.f172748g
        L_0x0135:
            boolean r10 = m222709d(r13, r10, r3)
            if (r10 != 0) goto L_0x0086
            com.google.protos.aw.a.a.a.as r10 = r9.f172852f
            if (r10 != 0) goto L_0x0141
            com.google.protos.aw.a.a.a.as r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63905as.f172804c
        L_0x0141:
            boolean r10 = r10.f172807b
            com.google.protos.aw.a.a.a.by r13 = r9.f172849c
            if (r13 != 0) goto L_0x0149
            com.google.protos.aw.a.a.a.by r13 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63938by.f172910d
        L_0x0149:
            com.google.protos.aw.a.a.a.bp r13 = r13.f172913b
            if (r13 != 0) goto L_0x014f
            com.google.protos.aw.a.a.a.bp r13 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63929bp.f172876i
        L_0x014f:
            int r14 = r13.f172878a
            r14 = r14 & r12
            if (r14 == 0) goto L_0x017b
            com.google.protos.aw.a.a.a.am r14 = r11.f172838c
            if (r14 != 0) goto L_0x015b
            com.google.protos.aw.a.a.a.am r15 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am.f172780h
            goto L_0x015c
        L_0x015b:
            r15 = r14
        L_0x015c:
            int r15 = r15.f172782a
            r15 = r15 & r7
            if (r15 == 0) goto L_0x017b
            if (r14 != 0) goto L_0x0165
            com.google.protos.aw.a.a.a.am r14 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am.f172780h
        L_0x0165:
            com.google.protobuf.fg r14 = r14.f172783b
            if (r14 != 0) goto L_0x016b
            com.google.protobuf.fg r14 = com.google.protobuf.C63042fg.f170152c
        L_0x016b:
            com.google.protobuf.ar r15 = r13.f172880c
            if (r15 != 0) goto L_0x0171
            com.google.protobuf.ar r15 = com.google.protobuf.C62910ar.f169858c
        L_0x0171:
            j$.time.Duration r15 = com.google.protobuf.p4750c.C62950b.m95473d(r15)
            boolean r14 = m222708c(r14, r15, r3)
            if (r14 == 0) goto L_0x0086
        L_0x017b:
            if (r10 == 0) goto L_0x01b4
            int r10 = r13.f172878a
            r10 = r10 & r12
            if (r10 == 0) goto L_0x01a9
            com.google.protos.aw.a.a.a.am r10 = r11.f172840e
            if (r10 != 0) goto L_0x0189
            com.google.protos.aw.a.a.a.am r14 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am.f172780h
            goto L_0x018a
        L_0x0189:
            r14 = r10
        L_0x018a:
            int r14 = r14.f172782a
            r14 = r14 & r7
            if (r14 == 0) goto L_0x01a9
            if (r10 != 0) goto L_0x0193
            com.google.protos.aw.a.a.a.am r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am.f172780h
        L_0x0193:
            com.google.protobuf.fg r10 = r10.f172783b
            if (r10 != 0) goto L_0x0199
            com.google.protobuf.fg r10 = com.google.protobuf.C63042fg.f170152c
        L_0x0199:
            com.google.protobuf.ar r14 = r13.f172880c
            if (r14 != 0) goto L_0x019f
            com.google.protobuf.ar r14 = com.google.protobuf.C62910ar.f169858c
        L_0x019f:
            j$.time.Duration r14 = com.google.protobuf.p4750c.C62950b.m95473d(r14)
            boolean r10 = m222708c(r10, r14, r3)
            if (r10 == 0) goto L_0x0086
        L_0x01a9:
            int r10 = r13.f172878a
            r10 = r10 & r7
            if (r10 == 0) goto L_0x01b4
            int r10 = r11.f172839d
            int r14 = r13.f172879b
            if (r10 >= r14) goto L_0x0086
        L_0x01b4:
            int r10 = r13.f172878a
            r10 = r10 & 16
            if (r10 == 0) goto L_0x01d6
            int r10 = r11.f172836a
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01d6
            com.google.protobuf.fg r10 = r11.f172842g
            if (r10 != 0) goto L_0x01c6
            com.google.protobuf.fg r10 = com.google.protobuf.C63042fg.f170152c
        L_0x01c6:
            com.google.protobuf.ar r14 = r13.f172883f
            if (r14 != 0) goto L_0x01cc
            com.google.protobuf.ar r14 = com.google.protobuf.C62910ar.f169858c
        L_0x01cc:
            j$.time.Duration r14 = com.google.protobuf.p4750c.C62950b.m95473d(r14)
            boolean r10 = m222708c(r10, r14, r3)
            if (r10 == 0) goto L_0x0086
        L_0x01d6:
            int r10 = r13.f172878a
            r10 = r10 & 64
            if (r10 == 0) goto L_0x01f8
            int r10 = r11.f172836a
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x01f8
            com.google.protobuf.fg r10 = r11.f172844i
            if (r10 != 0) goto L_0x01e8
            com.google.protobuf.fg r10 = com.google.protobuf.C63042fg.f170152c
        L_0x01e8:
            com.google.protobuf.ar r14 = r13.f172885h
            if (r14 != 0) goto L_0x01ee
            com.google.protobuf.ar r14 = com.google.protobuf.C62910ar.f169858c
        L_0x01ee:
            j$.time.Duration r14 = com.google.protobuf.p4750c.C62950b.m95473d(r14)
            boolean r10 = m222708c(r10, r14, r3)
            if (r10 == 0) goto L_0x0086
        L_0x01f8:
            com.google.protos.aw.a.a.a.am r10 = r11.f172838c
            if (r10 != 0) goto L_0x01fe
            com.google.protos.aw.a.a.a.am r10 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63899am.f172780h
        L_0x01fe:
            com.google.protos.aw.a.a.a.aa r11 = r13.f172881d
            if (r11 != 0) goto L_0x0204
            com.google.protos.aw.a.a.a.aa r11 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63887aa.f172748g
        L_0x0204:
            boolean r10 = m222709d(r10, r11, r3)
            if (r10 != 0) goto L_0x0086
            com.google.android.apps.search.googleapp.promomanager.b.dh r10 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh.f372869h
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.search.googleapp.promomanager.b.df r10 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137005df) r10
            com.google.protos.aw.a.a.a.w r11 = r9.f172851e
            if (r11 != 0) goto L_0x0218
            com.google.protos.aw.a.a.a.w r11 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w.f172981b
        L_0x0218:
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r13 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r13
            r11.getClass()
            r13.f372873c = r11
            r13.f372872b = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r11 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r11
            int r13 = r4.f172871h
            r11.f372874d = r13
            int r13 = r11.f372871a
            r13 = r13 | 4
            r11.f372871a = r13
            com.google.protos.aw.a.a.a.aw r11 = r9.f172848b
            if (r11 != 0) goto L_0x023d
            com.google.protos.aw.a.a.a.aw r11 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw.f172816e
        L_0x023d:
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r13 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r13
            r11.getClass()
            r13.f372875e = r11
            int r11 = r13.f372871a
            r11 = r11 | 8
            r13.f372871a = r11
            com.google.protos.aw.a.a.a.as r11 = r9.f172852f
            if (r11 != 0) goto L_0x0255
            com.google.protos.aw.a.a.a.as r11 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63905as.f172804c
        L_0x0255:
            boolean r11 = r11.f172807b
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r13 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r13
            int r14 = r13.f372871a
            r14 = r14 | 16
            r13.f372871a = r14
            r13.f372876f = r11
            com.google.protos.aw.a.a.a.as r11 = r9.f172852f
            if (r11 != 0) goto L_0x026c
            com.google.protos.aw.a.a.a.as r11 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63905as.f172804c
        L_0x026c:
            boolean r11 = r11.f172806a
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.android.apps.search.googleapp.promomanager.b.dh r13 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r13
            int r14 = r13.f372871a
            r14 = r14 | 32
            r13.f372871a = r14
            r13.f372877g = r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.apps.search.googleapp.promomanager.b.dh r10 = (com.google.android.apps.search.googleapp.promomanager.p10372b.C137007dh) r10
            com.google.protos.aw.a.a.a.by r9 = r9.f172849c
            if (r9 != 0) goto L_0x028a
            com.google.protos.aw.a.a.a.by r11 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63938by.f172910d
            goto L_0x028b
        L_0x028a:
            r11 = r9
        L_0x028b:
            int r11 = r11.f172912a
            r11 = r11 & r12
            if (r11 == 0) goto L_0x02b4
            com.google.android.apps.search.googleapp.promomanager.b.bv r11 = r0.f372901f
            if (r9 != 0) goto L_0x0296
            com.google.protos.aw.a.a.a.by r9 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63938by.f172910d
        L_0x0296:
            com.google.protos.aw.a.a.a.m r9 = r9.f172914c
            if (r9 != 0) goto L_0x029c
            com.google.protos.aw.a.a.a.m r9 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63949m.f172943c
        L_0x029c:
            com.google.common.util.concurrent.cx r9 = r11.mo113467a(r9, r2)
            com.google.android.apps.search.googleapp.promomanager.b.k r11 = new com.google.android.apps.search.googleapp.promomanager.b.k
            r11.<init>(r10)
            java.util.concurrent.Executor r10 = r0.f372897a
            com.google.common.base.ah r11 = com.google.apps.tiktok.tracing.C47810es.m84963c(r11)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60922j.m93044g(r9, r11, r10)
            r8.add(r9)
            goto L_0x0086
        L_0x02b4:
            com.google.android.apps.search.googleapp.promomanager.b.a r9 = new com.google.android.apps.search.googleapp.promomanager.b.a
            r9.<init>(r10, r7)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            r8.add(r9)
            goto L_0x0086
        L_0x02c2:
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92906o(r8)
            com.google.android.apps.search.googleapp.promomanager.b.l r2 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137017l.f372895a
            java.util.concurrent.Executor r3 = r0.f372897a
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.C137020o.mo113479b(com.google.protos.aw.a.a.a.bb, com.google.android.apps.search.googleapp.promomanager.b.dj, com.google.protobuf.fg, com.google.common.b.hd):com.google.common.util.concurrent.cx");
    }
}
