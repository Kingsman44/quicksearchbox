package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58800sl;
import com.google.p4272br.C56442k;
import com.google.p4272br.C56449r;
import java.util.Map;
import java.util.Set;
import p001a.p014d.p015a.p016a.C0080y;
import p001a.p014d.p015a.p016a.C0081z;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.bn */
/* compiled from: PG */
public final class C79204bn {

    /* renamed from: a */
    public static final /* synthetic */ int f217670a = 0;

    /* renamed from: b */
    private static final C56449r f217671b = C56449r.m88180a(String.format("(%s|%s)(?::(<|>|<=|>=)([0-9\\.\\-e]+))?", new Object[]{"\\$app", "\\$collection:(?:/[a-zA-Z0-9_]+)+"}), 1);

    /* renamed from: a */
    public static C79214bx m127148a(C0081z zVar) {
        C58485gu guVar;
        C58485gu guVar2;
        C79321s sVar = new C79321s();
        sVar.mo73839c(C0081z.f222d);
        sVar.mo73838b(C58485gu.m89845m());
        sVar.mo73837a(C58485gu.m89845m());
        sVar.mo73839c(zVar);
        String str = zVar.f225b;
        C0080y a = C0080y.m34a(zVar.f224a);
        if (a == null) {
            a = C0080y.UNRECOGNIZED;
        }
        sVar.mo73838b(m127153f(str, a));
        if (zVar.f226c.size() == 1) {
            String str2 = (String) zVar.f226c.get(0);
            C0080y a2 = C0080y.m34a(zVar.f224a);
            if (a2 == null) {
                a2 = C0080y.UNRECOGNIZED;
            }
            sVar.mo73837a(m127153f(str2, a2));
        } else if (zVar.f226c.size() > 1) {
            String str3 = "(?:" + ((String) Collection.EL.stream(zVar.f226c).collect(Collectors.joining("|"))) + ")";
            C0080y a3 = C0080y.m34a(zVar.f224a);
            if (a3 == null) {
                a3 = C0080y.UNRECOGNIZED;
            }
            sVar.mo73837a(m127153f(str3, a3));
        }
        C0081z zVar2 = sVar.f217824a;
        if (zVar2 != null && (guVar = sVar.f217825b) != null && (guVar2 = sVar.f217826c) != null) {
            return new C79322t(zVar2, guVar, guVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (sVar.f217824a == null) {
            sb.append(" source");
        }
        if (sVar.f217825b == null) {
            sb.append(" patterns");
        }
        if (sVar.f217826c == null) {
            sb.append(" exceptions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public static C58485gu m127149b(C80047aa aaVar, Set set) {
        C80053ag agVar;
        if (Collection.EL.stream(set).noneMatch(new C79184au(aaVar))) {
            return C58485gu.m89845m();
        }
        C80080z a = C80080z.m128077a(aaVar.f219659c);
        if (a == null) {
            a = C80080z.UNRECOGNIZED;
        }
        if (!a.equals(C80080z.APP)) {
            C80080z a2 = C80080z.m128077a(aaVar.f219659c);
            if (a2 == null) {
                a2 = C80080z.UNRECOGNIZED;
            }
            if (!a2.equals(C80080z.URL)) {
                C80080z a3 = C80080z.m128077a(aaVar.f219659c);
                if (a3 == null) {
                    a3 = C80080z.UNRECOGNIZED;
                }
                if (!a3.equals(C80080z.WEBREF)) {
                    return C58485gu.m89845m();
                }
                if (aaVar.f219657a == 10) {
                    agVar = (C80053ag) aaVar.f219658b;
                } else {
                    agVar = C80053ag.f219675f;
                }
                return (C58485gu) Collection.EL.stream(agVar.f219679c).map(C79185av.f217649a).filter(new C79186aw(set)).collect(C58370cn.f155946a);
            }
        }
        return C58485gu.m89846n("$app");
    }

    /* renamed from: c */
    public static Optional m127150c(C79298f fVar, C79212bv bvVar) {
        C56442k kVar = new C56442k(bvVar.mo73836b(), fVar.mo73864j());
        while (kVar.mo54386g()) {
            if (!kVar.mo54384e(0).isEmpty()) {
                if (!fVar.mo73865k()) {
                    return Optional.m71637of(kVar);
                }
                C58800sl lA = bvVar.mo73835a().entrySet().iterator();
                while (lA.hasNext()) {
                    Map.Entry entry = (Map.Entry) lA.next();
                    int d = kVar.mo54383d((String) entry.getKey());
                    int b = kVar.mo54381b((String) entry.getKey());
                    if (d >= 0 && b >= 0 && d >= kVar.mo54382c(0) && b <= kVar.mo54380a(0) && !kVar.mo54385f((String) entry.getKey()).isEmpty()) {
                        C79211bu buVar = (C79211bu) entry.getValue();
                        Stream filter = Collection.EL.stream(fVar.mo73862h()).filter(new C79182as(d, b));
                        Objects.requireNonNull(buVar);
                        if (filter.noneMatch(new C79183at(buVar))) {
                        }
                    }
                }
                return Optional.m71637of(kVar);
            }
        }
        return Optional.empty();
    }

    /* renamed from: d */
    public static Optional m127151d(String str, C79214bx bxVar) {
        return m127152e(C79298f.m127227c(str, C58485gu.m89845m()), bxVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02be, code lost:
        r12 = r15;
        r3 = r11;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p3186j$.util.Optional m127152e(com.google.android.apps.gsa.nga.engine.understanding.teleport.C79298f r15, com.google.android.apps.gsa.nga.engine.understanding.teleport.C79214bx r16) {
        /*
            com.google.common.b.gu r0 = r16.mo73842c()
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.common.b.gu r1 = r16.mo73841b()
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            j$.util.stream.Stream r0 = p3186j$.util.stream.Stream.CC.concat(r0, r1)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.aq r1 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79180aq.f217643a
            j$.util.stream.Stream r0 = r0.flatMap(r1)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155947b
            java.lang.Object r0 = r0.collect(r1)
            com.google.common.b.ij r0 = (com.google.common.p4522b.C58528ij) r0
            com.google.common.b.gu r1 = r15.mo73862h()
            com.google.common.b.gu r1 = m127154g(r1, r0)
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ba r2 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ba
            r2.<init>(r0)
            j$.util.stream.Stream r1 = r1.flatMap(r2)
            long r1 = r1.count()
            r3 = 63
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0047
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x004c
        L_0x0047:
            r3 = 1
            int r2 = (int) r1
            long r1 = r3 << r2
        L_0x004c:
            r3 = 64
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x02cc
            java.lang.String r1 = r15.mo73864j()
            com.google.common.b.gu r2 = r15.mo73862h()
            com.google.common.b.gu r2 = m127154g(r2, r0)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.f r1 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79298f.m127227c(r1, r2)
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
            r2.mo55395g(r1)
            boolean r3 = r1.mo73865k()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0077
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r1)
            goto L_0x0150
        L_0x0077:
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = r1
            com.google.android.apps.gsa.nga.engine.understanding.teleport.n r7 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79316n) r7
            com.google.common.b.gu r7 = r7.f217815b
            int r7 = r7.size()
            java.lang.Boolean[] r7 = new java.lang.Boolean[r7]
            java.util.List r7 = java.util.Arrays.asList(r7)
            r6.<init>(r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            java.util.Collections.fill(r6, r7)
        L_0x0094:
            r7 = 0
        L_0x0095:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x014c
            java.lang.Object r8 = r6.get(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00af
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r6.set(r7, r8)
            int r7 = r7 + 1
            goto L_0x0095
        L_0x00af:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r6.set(r7, r8)
            int r7 = r6.size()
            j$.util.stream.IntStream r7 = p3186j$.util.stream.IntStream.CC.range(r4, r7)
            p3186j$.util.Objects.requireNonNull(r6)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ap r8 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ap
            r8.<init>(r6)
            j$.util.stream.IntStream r7 = r7.filter(r8)
            p3186j$.util.Objects.requireNonNull(r1)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ar r8 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ar
            r8.<init>(r1)
            j$.util.stream.Stream r7 = r7.mapToObj(r8)
            j$.util.stream.Collector r8 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r7 = r7.collect(r8)
            com.google.common.b.gu r7 = (com.google.common.p4522b.C58485gu) r7
            r8 = 0
        L_0x00dd:
            int r9 = r7.size()
            if (r8 >= r9) goto L_0x0109
            int r9 = r8 + 1
            r10 = r9
        L_0x00e6:
            int r11 = r7.size()
            if (r10 >= r11) goto L_0x0107
            java.lang.Object r11 = r7.get(r8)
            com.google.android.apps.gsa.nga.shared.a.aa r11 = (com.google.android.apps.gsa.nga.shared.p6274a.C80047aa) r11
            java.lang.Object r12 = r7.get(r10)
            com.google.android.apps.gsa.nga.shared.a.aa r12 = (com.google.android.apps.gsa.nga.shared.p6274a.C80047aa) r12
            int r13 = r11.f219660d
            int r14 = r12.f219661e
            if (r13 >= r14) goto L_0x0104
            int r12 = r12.f219660d
            int r11 = r11.f219661e
            if (r12 < r11) goto L_0x0094
        L_0x0104:
            int r10 = r10 + 1
            goto L_0x00e6
        L_0x0107:
            r8 = r9
            goto L_0x00dd
        L_0x0109:
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89846n(r1)
            com.google.common.b.gu r7 = r7.mo55401lD()
            int r9 = r7.size()
            r10 = 0
            r11 = 0
        L_0x0117:
            if (r10 >= r9) goto L_0x0141
            java.lang.Object r12 = r7.get(r10)
            com.google.android.apps.gsa.nga.shared.a.aa r12 = (com.google.android.apps.gsa.nga.shared.p6274a.C80047aa) r12
            j$.util.stream.Stream r13 = p3186j$.util.Collection.EL.stream(r8)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ag r14 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ag
            r14.<init>(r12, r0)
            j$.util.stream.Stream r12 = r13.flatMap(r14)
            j$.util.stream.Collector r13 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r12 = r12.collect(r13)
            com.google.common.b.gu r12 = (com.google.common.p4522b.C58485gu) r12
            boolean r13 = r12.isEmpty()
            r14 = r13 ^ 1
            r11 = r11 | r14
            if (r5 == r13) goto L_0x013e
            r8 = r12
        L_0x013e:
            int r10 = r10 + 1
            goto L_0x0117
        L_0x0141:
            if (r11 != 0) goto L_0x0147
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0147:
            r3.mo55396h(r8)
            goto L_0x0094
        L_0x014c:
            com.google.common.b.gu r0 = r3.mo55394f()
        L_0x0150:
            r2.mo55396h(r0)
            com.google.common.b.gu r0 = r2.mo55394f()
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ax r3 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ax
            r6 = r16
            r3.<init>(r6)
            boolean r2 = r2.anyMatch(r3)
            if (r2 != 0) goto L_0x02c7
            r2 = r0
            com.google.common.b.pq r2 = (com.google.common.p4522b.C58724pq) r2
            int r2 = r2.f156474d
            r3 = 0
        L_0x016e:
            if (r3 >= r2) goto L_0x02c2
            java.lang.Object r7 = r0.get(r3)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.f r7 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79298f) r7
            com.google.common.b.gu r8 = r16.mo73842c()
            int r9 = r8.size()
            r10 = 0
        L_0x017f:
            int r11 = r3 + 1
            if (r10 >= r9) goto L_0x02be
            java.lang.Object r11 = r8.get(r10)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bv r11 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79212bv) r11
            j$.util.Optional r12 = m127150c(r7, r11)
            int r10 = r10 + 1
            boolean r13 = r12.isPresent()
            if (r13 == 0) goto L_0x02bb
            java.lang.Object r0 = r12.get()
            com.google.br.k r0 = (com.google.p4272br.C56442k) r0
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.hd r3 = r11.mo73835a()
            com.google.common.b.ij r3 = r3.keySet()
            com.google.common.b.sl r3 = r3.iterator()
        L_0x01ab:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            int r8 = r0.mo54383d(r6)
            int r9 = r0.mo54381b(r6)
            if (r8 < 0) goto L_0x01ab
            if (r9 < 0) goto L_0x01ab
            java.lang.String r6 = r0.mo54385f(r6)
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x01ab
            com.google.android.apps.gsa.nga.engine.understanding.teleport.g r6 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79309g.m127241c(r8, r9)
            com.google.common.b.gu r10 = r7.mo73862h()
            j$.util.stream.Stream r10 = p3186j$.util.Collection.EL.stream(r10)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ah r12 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ah
            r12.<init>(r8, r9)
            j$.util.stream.Stream r8 = r10.filter(r12)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ai r9 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79172ai.f217635a
            j$.util.stream.Stream r8 = r8.map(r9)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.aj r9 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.aj
            r9.<init>(r1)
            j$.util.stream.Stream r8 = r8.map(r9)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ak r9 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ak
            r9.<init>(r1)
            j$.util.stream.Stream r8 = r8.map(r9)
            j$.util.Optional r8 = r8.findFirst()
            boolean r9 = r8.isPresent()
            if (r9 == 0) goto L_0x01ab
            java.lang.Object r8 = r8.get()
            java.lang.String r8 = (java.lang.String) r8
            com.google.common.base.az r9 = new com.google.common.base.az
            r9.<init>(r6, r8)
            r2.mo55395g(r9)
            goto L_0x01ab
        L_0x0213:
            com.google.common.b.gu r1 = r2.mo55394f()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
        L_0x021d:
            int r6 = r0.f150755a
            int r6 = r6 + r5
            if (r3 >= r6) goto L_0x0242
            int r6 = r0.mo54382c(r3)
            int r7 = r0.mo54380a(r3)
            if (r6 < 0) goto L_0x023f
            if (r7 < 0) goto L_0x023f
            java.lang.String r6 = r0.mo54384e(r3)
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x023f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r2.add(r6)
        L_0x023f:
            int r3 = r3 + 1
            goto L_0x021d
        L_0x0242:
            com.google.common.b.hd r3 = r11.mo73835a()
            com.google.common.b.ij r3 = r3.keySet()
            com.google.common.b.sl r3 = r3.iterator()
        L_0x024e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x029e
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r0.mo54383d(r5)
            int r7 = r0.mo54381b(r5)
            java.lang.String r5 = r0.mo54385f(r5)
            if (r6 < 0) goto L_0x024e
            if (r7 < 0) goto L_0x024e
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L_0x024e
            r8 = 0
        L_0x0271:
            int r9 = r2.size()
            if (r8 >= r9) goto L_0x024e
            java.lang.Object r9 = r2.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r10 = r0.mo54382c(r9)
            int r11 = r0.mo54380a(r9)
            if (r10 != r6) goto L_0x029b
            if (r11 != r7) goto L_0x029b
            java.lang.String r9 = r0.mo54384e(r9)
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x029b
            r2.remove(r8)
            goto L_0x024e
        L_0x029b:
            int r8 = r8 + 1
            goto L_0x0271
        L_0x029e:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bq r3 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.bq
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.mo55395g(r4)
            r5.mo55396h(r2)
            com.google.common.b.gu r2 = r5.mo55394f()
            r12 = r15
            r3.<init>(r0, r15, r1, r2)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r3)
            return r0
        L_0x02bb:
            r12 = r15
            goto L_0x017f
        L_0x02be:
            r12 = r15
            r3 = r11
            goto L_0x016e
        L_0x02c2:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x02c7:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x02cc:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.understanding.teleport.C79204bn.m127152e(com.google.android.apps.gsa.nga.engine.understanding.teleport.f, com.google.android.apps.gsa.nga.engine.understanding.teleport.bx):j$.util.Optional");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0113  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.common.p4522b.C58485gu m127153f(java.lang.String r20, p001a.p014d.p015a.p016a.C0080y r21) {
        /*
            r0 = r20
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gz r2 = new com.google.common.b.gz
            r3 = 4
            r2.<init>(r3)
            java.lang.String r4 = "(?i)"
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L_0x0018
            java.lang.String r0 = r0.substring(r3)
        L_0x0018:
            com.google.br.r r4 = f217671b
            com.google.br.k r5 = new com.google.br.k
            r5.<init>(r4, r0)
            java.lang.String r4 = ""
            r6 = 0
            r7 = r4
            r8 = 0
        L_0x0024:
            boolean r9 = r0.isEmpty()
            r10 = 3
            r11 = 2
            r12 = 1
            if (r9 != 0) goto L_0x01a5
            boolean r9 = r5.mo54386g()
            if (r9 == 0) goto L_0x01a5
            int r9 = r8 + 1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "teleport_token_"
            r13.<init>(r14)
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            java.lang.String r13 = r5.mo54384e(r12)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "(?P<"
            r14.<init>(r15)
            r14.append(r8)
            java.lang.String r15 = ">\\"
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = ")"
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = r5.mo54384e(r6)
            java.lang.String r15 = r5.mo54384e(r12)
            java.lang.String r3 = r5.mo54384e(r11)
            java.lang.String r16 = r5.mo54384e(r10)
            if (r15 != 0) goto L_0x0077
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bc r15 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79193bc.f217659a
            goto L_0x0098
        L_0x0077:
            java.lang.String r6 = "$app"
            boolean r6 = r15.startsWith(r6)
            if (r6 == 0) goto L_0x0082
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bd r15 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79194bd.f217660a
            goto L_0x0098
        L_0x0082:
            java.lang.String r6 = "$collection:"
            boolean r6 = r15.startsWith(r6)
            if (r6 == 0) goto L_0x0096
            r6 = 12
            java.lang.String r6 = r15.substring(r6)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.be r15 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.be
            r15.<init>(r6)
            goto L_0x0098
        L_0x0096:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bf r15 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79196bf.f217662a
        L_0x0098:
            if (r3 != 0) goto L_0x00a0
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bh r3 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79198bh.f217664a
            r16 = r7
            goto L_0x0118
        L_0x00a0:
            r17 = 0
            if (r16 == 0) goto L_0x00b2
            boolean r19 = r16.isEmpty()
            if (r19 != 0) goto L_0x00b2
            java.lang.Double r16 = java.lang.Double.valueOf(r16)
            double r17 = r16.doubleValue()
        L_0x00b2:
            r16 = r7
            r6 = r17
            int r10 = r3.hashCode()
            r11 = 60
            if (r10 == r11) goto L_0x00e9
            r11 = 62
            if (r10 == r11) goto L_0x00df
            r11 = 1921(0x781, float:2.692E-42)
            if (r10 == r11) goto L_0x00d5
            r11 = 1983(0x7bf, float:2.779E-42)
            if (r10 == r11) goto L_0x00cb
            goto L_0x00f3
        L_0x00cb:
            java.lang.String r10 = ">="
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x00f3
            r3 = 3
            goto L_0x00f4
        L_0x00d5:
            java.lang.String r10 = "<="
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x00f3
            r3 = 1
            goto L_0x00f4
        L_0x00df:
            java.lang.String r10 = ">"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x00f3
            r3 = 2
            goto L_0x00f4
        L_0x00e9:
            java.lang.String r10 = "<"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x00f3
            r3 = 0
            goto L_0x00f4
        L_0x00f3:
            r3 = -1
        L_0x00f4:
            if (r3 == 0) goto L_0x0113
            if (r3 == r12) goto L_0x010d
            r10 = 2
            if (r3 == r10) goto L_0x0107
            r10 = 3
            if (r3 == r10) goto L_0x0101
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bm r3 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79203bm.f217669a
            goto L_0x0118
        L_0x0101:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bl r3 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.bl
            r3.<init>(r6)
            goto L_0x0118
        L_0x0107:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bk r3 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.bk
            r3.<init>(r6)
            goto L_0x0118
        L_0x010d:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bj r3 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.bj
            r3.<init>(r6)
            goto L_0x0118
        L_0x0113:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bi r3 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.bi
            r3.<init>(r6)
        L_0x0118:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.u r6 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.u
            r6.<init>()
            r6.f217830a = r4
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bs r7 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79209bs.f217679a
            r6.mo73831a(r7)
            if (r14 == 0) goto L_0x019d
            r6.f217830a = r14
            j$.util.function.Predicate r3 = r15.and(r3)
            r6.mo73831a(r3)
            java.lang.String r3 = r6.f217830a
            if (r3 == 0) goto L_0x0176
            j$.util.function.Predicate r7 = r6.f217831b
            if (r7 != 0) goto L_0x0138
            goto L_0x0176
        L_0x0138:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.v r6 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.v
            r6.<init>(r3, r7)
            r2.mo55429h(r8, r6)
            r3 = 0
            int r6 = r5.mo54382c(r3)
            r7 = -1
            int r6 = r6 + r7
            java.lang.String r6 = r0.substring(r3, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r16
            r7.append(r8)
            r7.append(r6)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            int r6 = r5.mo54380a(r3)
            java.lang.String r0 = r0.substring(r6)
            com.google.br.l r3 = new com.google.br.l
            r3.<init>(r0)
            r5.f150756b = r3
            r5.mo54388i()
            r8 = r9
            r3 = 4
            r6 = 0
            goto L_0x0024
        L_0x0176:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f217830a
            if (r1 != 0) goto L_0x0184
            java.lang.String r1 = " source"
            r0.append(r1)
        L_0x0184:
            j$.util.function.Predicate r1 = r6.f217831b
            if (r1 != 0) goto L_0x018d
            java.lang.String r1 = " predicate"
            r0.append(r1)
        L_0x018d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x019d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null source"
            r0.<init>(r1)
            throw r0
        L_0x01a5:
            r8 = r7
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r8.concat(r0)
            r3 = 0
            com.google.common.b.hd r2 = r2.mo55427f(r3)
            a.d.a.a.y r3 = p001a.p014d.p015a.p016a.C0080y.UNDEFINED_PLACEMENT
            int r3 = r21.ordinal()
            r4 = 2
            if (r3 == r4) goto L_0x024c
            r4 = 3
            if (r3 == r4) goto L_0x0231
            r4 = 4
            if (r3 == r4) goto L_0x01fc
            r4 = 5
            if (r3 == r4) goto L_0x01dd
            com.google.android.apps.gsa.nga.engine.understanding.teleport.br r3 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79212bv.m127167c()
            com.google.br.r r0 = com.google.p4272br.C56449r.m88180a(r0, r12)
            r4 = r3
            com.google.android.apps.gsa.nga.engine.understanding.teleport.q r4 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79319q) r4
            r4.f217820a = r0
            r4.f217821b = r2
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bv r0 = r3.mo73830a()
            r1.mo55395g(r0)
            goto L_0x0266
        L_0x01dd:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.br r3 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79212bv.m127167c()
            java.lang.String r0 = m127155h(r0)
            java.lang.String r0 = m127156i(r0)
            com.google.br.r r0 = com.google.p4272br.C56449r.m88180a(r0, r12)
            r4 = r3
            com.google.android.apps.gsa.nga.engine.understanding.teleport.q r4 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79319q) r4
            r4.f217820a = r0
            r4.f217821b = r2
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bv r0 = r3.mo73830a()
            r1.mo55395g(r0)
            goto L_0x0266
        L_0x01fc:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.br r3 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79212bv.m127167c()
            java.lang.String r4 = m127156i(r0)
            com.google.br.r r4 = com.google.p4272br.C56449r.m88180a(r4, r12)
            r5 = r3
            com.google.android.apps.gsa.nga.engine.understanding.teleport.q r5 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79319q) r5
            r5.f217820a = r4
            r5.f217821b = r2
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bv r3 = r3.mo73830a()
            r1.mo55395g(r3)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.br r3 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79212bv.m127167c()
            java.lang.String r0 = m127155h(r0)
            com.google.br.r r0 = com.google.p4272br.C56449r.m88180a(r0, r12)
            r4 = r3
            com.google.android.apps.gsa.nga.engine.understanding.teleport.q r4 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79319q) r4
            r4.f217820a = r0
            r4.f217821b = r2
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bv r0 = r3.mo73830a()
            r1.mo55395g(r0)
            goto L_0x0266
        L_0x0231:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.br r3 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79212bv.m127167c()
            java.lang.String r0 = m127155h(r0)
            com.google.br.r r0 = com.google.p4272br.C56449r.m88180a(r0, r12)
            r4 = r3
            com.google.android.apps.gsa.nga.engine.understanding.teleport.q r4 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79319q) r4
            r4.f217820a = r0
            r4.f217821b = r2
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bv r0 = r3.mo73830a()
            r1.mo55395g(r0)
            goto L_0x0266
        L_0x024c:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.br r3 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79212bv.m127167c()
            java.lang.String r0 = m127156i(r0)
            com.google.br.r r0 = com.google.p4272br.C56449r.m88180a(r0, r12)
            r4 = r3
            com.google.android.apps.gsa.nga.engine.understanding.teleport.q r4 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79319q) r4
            r4.f217820a = r0
            r4.f217821b = r2
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bv r0 = r3.mo73830a()
            r1.mo55395g(r0)
        L_0x0266:
            com.google.common.b.gu r0 = r1.mo55394f()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.understanding.teleport.C79204bn.m127153f(java.lang.String, a.d.a.a.y):com.google.common.b.gu");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r3.equals(com.google.android.apps.gsa.nga.shared.p6274a.C80080z.URL) != false) goto L_0x009b;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.common.p4522b.C58485gu m127154g(java.util.Collection r6, java.util.Set r7) {
        /*
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r6)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.al r0 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79175al.f217638a
            j$.util.stream.Stream r6 = r6.filter(r0)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.am r0 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.am
            r0.<init>(r7)
            j$.util.stream.Stream r6 = r6.filter(r0)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.an r7 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79177an.f217640a
            j$.util.stream.Stream r6 = r6.sorted(r7)
            j$.util.stream.Collector r7 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r6 = r6.collect(r7)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
            r0 = 0
        L_0x0025:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x00a2
            java.lang.Object r1 = r6.get(r0)
            com.google.android.apps.gsa.nga.shared.a.aa r1 = (com.google.android.apps.gsa.nga.shared.p6274a.C80047aa) r1
            int r0 = r0 + 1
            int r2 = r1.f219659c
            com.google.android.apps.gsa.nga.shared.a.z r2 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.m128077a(r2)
            if (r2 != 0) goto L_0x003d
            com.google.android.apps.gsa.nga.shared.a.z r2 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.UNRECOGNIZED
        L_0x003d:
            com.google.android.apps.gsa.nga.shared.a.z r3 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.APP
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0058
            int r2 = r1.f219659c
            com.google.android.apps.gsa.nga.shared.a.z r2 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.m128077a(r2)
            if (r2 != 0) goto L_0x004f
            com.google.android.apps.gsa.nga.shared.a.z r2 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.UNRECOGNIZED
        L_0x004f:
            com.google.android.apps.gsa.nga.shared.a.z r3 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.URL
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0058
            goto L_0x0025
        L_0x0058:
            r2 = r0
        L_0x0059:
            int r3 = r6.size()
            if (r2 >= r3) goto L_0x0025
            java.lang.Object r3 = r6.get(r2)
            com.google.android.apps.gsa.nga.shared.a.aa r3 = (com.google.android.apps.gsa.nga.shared.p6274a.C80047aa) r3
            int r3 = r3.f219660d
            int r4 = r1.f219660d
            if (r3 != r4) goto L_0x0025
            java.lang.Object r3 = r6.get(r2)
            com.google.android.apps.gsa.nga.shared.a.aa r3 = (com.google.android.apps.gsa.nga.shared.p6274a.C80047aa) r3
            int r4 = r3.f219661e
            int r5 = r1.f219661e
            if (r4 != r5) goto L_0x009f
            int r4 = r3.f219659c
            com.google.android.apps.gsa.nga.shared.a.z r4 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.m128077a(r4)
            if (r4 != 0) goto L_0x0081
            com.google.android.apps.gsa.nga.shared.a.z r4 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.UNRECOGNIZED
        L_0x0081:
            com.google.android.apps.gsa.nga.shared.a.z r5 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.APP
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x009b
            int r3 = r3.f219659c
            com.google.android.apps.gsa.nga.shared.a.z r3 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.m128077a(r3)
            if (r3 != 0) goto L_0x0093
            com.google.android.apps.gsa.nga.shared.a.z r3 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.UNRECOGNIZED
        L_0x0093:
            com.google.android.apps.gsa.nga.shared.a.z r4 = com.google.android.apps.gsa.nga.shared.p6274a.C80080z.URL
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x009f
        L_0x009b:
            r6.remove(r2)
            goto L_0x0059
        L_0x009f:
            int r2 = r2 + 1
            goto L_0x0059
        L_0x00a2:
            int r0 = r6.size()
            j$.util.stream.IntStream r7 = p3186j$.util.stream.IntStream.CC.range(r7, r0)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ao r0 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ao
            r0.<init>(r6)
            j$.util.stream.Stream r6 = r7.mapToObj(r0)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r6 = r6.collect(r7)
            com.google.common.b.gu r6 = (com.google.common.p4522b.C58485gu) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.understanding.teleport.C79204bn.m127154g(java.util.Collection, java.util.Set):com.google.common.b.gu");
    }

    /* renamed from: h */
    private static String m127155h(String str) {
        return str.endsWith("$") ? str : str.concat("$");
    }

    /* renamed from: i */
    private static String m127156i(String str) {
        return str.startsWith("^") ? str : "^".concat(str);
    }
}
