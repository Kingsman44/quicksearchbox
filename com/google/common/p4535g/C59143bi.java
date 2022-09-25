package com.google.common.p4535g;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58597ky;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.common.g.bi */
/* compiled from: PG */
public final class C59143bi implements Comparable, Serializable, C59165cd {

    /* renamed from: a */
    public final List f157177a;

    /* renamed from: b */
    public C59129av f157178b;

    /* renamed from: c */
    public C59129av f157179c;

    /* renamed from: d */
    transient C59203do f157180d;

    /* renamed from: e */
    public boolean f157181e;

    /* renamed from: f */
    public int f157182f;

    /* renamed from: g */
    private final AtomicInteger f157183g;

    public C59143bi() {
        this.f157177a = new ArrayList();
        this.f157183g = new AtomicInteger();
        this.f157181e = false;
        this.f157182f = 0;
        this.f157178b = C59129av.m91622e();
        this.f157179c = C59129av.m91622e();
        mo56521e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01a9  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m91689m(com.google.common.p4535g.C59143bi r26, com.google.common.p4535g.C59143bi r27, boolean r28, com.google.common.p4535g.C59146bl r29) {
        /*
            r0 = r27
            com.google.common.g.do r1 = r0.f157180d
            com.google.common.g.aj r2 = new com.google.common.g.aj
            r2.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = r26
            java.util.List r3 = r3.f157177a
            java.util.Iterator r3 = r3.iterator()
        L_0x0016:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x02c9
            java.lang.Object r4 = r3.next()
            com.google.common.g.az r4 = (com.google.common.p4535g.C59133az) r4
            int r5 = r4.f157143d
            boolean r6 = r4.mo56491s()
            r7 = 1
            if (r7 == r6) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = -1
        L_0x002e:
            r8 = 0
            com.google.common.g.bb r9 = r4.mo56481i(r8)
            boolean r9 = r0.mo56527j(r9)
            if (r6 <= 0) goto L_0x003b
            r10 = 0
            goto L_0x003c
        L_0x003b:
            r10 = r5
        L_0x003c:
            if (r5 <= 0) goto L_0x02c3
            com.google.common.g.bb r11 = r4.mo56481i(r10)
            int r10 = r10 + r6
            com.google.common.g.bb r12 = r4.mo56481i(r10)
            com.google.common.g.do r13 = r2.f157105b
            java.util.List r13 = r13.f157271b
            int r13 = r13.size()
            if (r13 != r7) goto L_0x00da
            com.google.common.g.do r13 = r2.f157105b
            java.util.List r13 = r13.f157271b
            java.lang.Object r13 = r13.get(r8)
            com.google.common.g.cl r13 = (com.google.common.p4535g.C59173cl) r13
            int r14 = r13.mo56420b()
            r15 = 27
            if (r14 > r15) goto L_0x006d
            com.google.common.g.ag r14 = new com.google.common.g.ag
            int r15 = r13.mo56420b()
            r14.<init>(r15)
            goto L_0x00ca
        L_0x006d:
            r2.mo56432a(r11, r12)
            java.util.List r14 = r2.f157106c
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x007b
            com.google.common.g.ae r14 = com.google.common.p4535g.C59117aj.f157104a
            goto L_0x00ca
        L_0x007b:
            java.util.List r14 = r2.f157106c
            int r14 = r14.size()
            if (r14 != r7) goto L_0x00a2
            java.util.List r14 = r2.f157106c
            java.lang.Object r14 = r14.get(r8)
            com.google.common.g.co r14 = (com.google.common.p4535g.C59176co) r14
            com.google.common.g.dl r14 = r14.mo56553d(r13)
            if (r14 == 0) goto L_0x009f
            int r15 = r14.mo56559f()
            if (r15 != 0) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            com.google.common.g.ah r15 = new com.google.common.g.ah
            r15.<init>(r14)
            r14 = r15
            goto L_0x00ca
        L_0x009f:
            com.google.common.g.ae r14 = com.google.common.p4535g.C59117aj.f157104a
            goto L_0x00ca
        L_0x00a2:
            com.google.common.g.af r14 = new com.google.common.g.af
            r14.<init>()
            r15 = 0
        L_0x00a8:
            java.util.List r8 = r2.f157106c
            int r8 = r8.size()
            if (r15 >= r8) goto L_0x00ca
            java.util.List r8 = r2.f157106c
            java.lang.Object r8 = r8.get(r15)
            com.google.common.g.co r8 = (com.google.common.p4535g.C59176co) r8
            com.google.common.g.dl r8 = r8.mo56553d(r13)
            if (r8 == 0) goto L_0x00c7
            int r16 = r8.mo56559f()
            if (r16 == 0) goto L_0x00c7
            r14.mo56429c(r8)
        L_0x00c7:
            int r15 = r15 + 1
            goto L_0x00a8
        L_0x00ca:
            boolean r8 = r14.mo56428b()
            if (r8 == 0) goto L_0x00d5
            java.util.Map r8 = java.util.Collections.emptyMap()
            goto L_0x00e9
        L_0x00d5:
            java.util.Map r8 = java.util.Collections.singletonMap(r13, r14)
            goto L_0x00e9
        L_0x00da:
            r2.mo56432a(r11, r12)
            java.util.List r8 = r2.f157106c
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00ed
            java.util.Map r8 = java.util.Collections.emptyMap()
        L_0x00e9:
            r18 = r2
            goto L_0x019d
        L_0x00ed:
            java.util.List r8 = r2.f157106c
            int r8 = r8.size()
            if (r8 != r7) goto L_0x014d
            java.util.List r8 = r2.f157106c
            r13 = 0
            java.lang.Object r8 = r8.get(r13)
            com.google.common.g.co r8 = (com.google.common.p4535g.C59176co) r8
            int r14 = r8.mo56551b()
            if (r14 != r7) goto L_0x0123
            com.google.common.g.dl r14 = r8.mo56552c(r13)
            int r15 = r14.mo56559f()
            if (r15 != 0) goto L_0x0113
            java.util.Map r8 = java.util.Collections.emptyMap()
            goto L_0x00e9
        L_0x0113:
            com.google.common.g.dl r8 = r8.mo56552c(r13)
            com.google.common.g.cl r8 = r8.f157265b
            com.google.common.g.ah r15 = new com.google.common.g.ah
            r15.<init>(r14)
            java.util.Map r8 = java.util.Collections.singletonMap(r8, r15)
            goto L_0x00e9
        L_0x0123:
            java.util.IdentityHashMap r14 = new java.util.IdentityHashMap
            r14.<init>()
            r15 = 0
        L_0x0129:
            int r13 = r8.mo56551b()
            if (r15 >= r13) goto L_0x0149
            com.google.common.g.dl r13 = r8.mo56552c(r15)
            int r16 = r13.mo56559f()
            if (r16 <= 0) goto L_0x0143
            com.google.common.g.cl r7 = r13.f157265b
            com.google.common.g.ah r0 = new com.google.common.g.ah
            r0.<init>(r13)
            r14.put(r7, r0)
        L_0x0143:
            int r15 = r15 + 1
            r0 = r27
            r7 = 1
            goto L_0x0129
        L_0x0149:
            r18 = r2
            r8 = r14
            goto L_0x019d
        L_0x014d:
            java.util.IdentityHashMap r8 = new java.util.IdentityHashMap
            r8.<init>()
            r0 = 0
        L_0x0153:
            java.util.List r7 = r2.f157106c
            int r7 = r7.size()
            if (r0 >= r7) goto L_0x00e9
            java.util.List r7 = r2.f157106c
            java.lang.Object r7 = r7.get(r0)
            com.google.common.g.co r7 = (com.google.common.p4535g.C59176co) r7
            r13 = 0
        L_0x0164:
            int r14 = r7.mo56551b()
            if (r13 >= r14) goto L_0x0198
            com.google.common.g.dl r14 = r7.mo56552c(r13)
            int r15 = r14.mo56559f()
            if (r15 != 0) goto L_0x0177
            r18 = r2
            goto L_0x0193
        L_0x0177:
            com.google.common.g.cl r15 = r14.f157265b
            java.lang.Object r17 = r8.get(r15)
            com.google.common.g.af r17 = (com.google.common.p4535g.C59113af) r17
            if (r17 != 0) goto L_0x018c
            r18 = r2
            com.google.common.g.af r2 = new com.google.common.g.af
            r2.<init>()
            r8.put(r15, r2)
            goto L_0x0190
        L_0x018c:
            r18 = r2
            r2 = r17
        L_0x0190:
            r2.mo56429c(r14)
        L_0x0193:
            int r13 = r13 + 1
            r2 = r18
            goto L_0x0164
        L_0x0198:
            r18 = r2
            int r0 = r0 + 1
            goto L_0x0153
        L_0x019d:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x01a9
        L_0x01a3:
            r22 = r3
            r23 = r4
            goto L_0x0264
        L_0x01a9:
            com.google.common.g.al r0 = new com.google.common.g.al
            r0.<init>(r11, r12)
            com.google.common.g.ck r2 = new com.google.common.g.ck
            r2.<init>()
            java.util.Set r7 = r8.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x01bb:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01a3
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r15 = r8.getKey()
            com.google.common.g.cl r15 = (com.google.common.p4535g.C59173cl) r15
            java.lang.Object r8 = r8.getValue()
            com.google.common.g.ae r8 = (com.google.common.p4535g.C59112ae) r8
            r17 = -2
        L_0x01d5:
            boolean r19 = r8.mo56428b()
            if (r19 != 0) goto L_0x01bb
            int r13 = r8.mo56427a()
            r15.mo56421c(r13, r2)
            int r14 = r17 + 1
            if (r13 == r14) goto L_0x01eb
            com.google.common.g.bb r14 = r2.f157226a
            r0.mo56436d(r14)
        L_0x01eb:
            com.google.common.g.bb r14 = r2.f157227b
            int r14 = r0.mo56434a(r14)
            if (r14 < 0) goto L_0x01d5
            r21 = r0
            com.google.common.g.bb r0 = r2.f157226a
            r22 = r3
            com.google.common.g.bb r3 = r2.f157227b
            if (r14 <= 0) goto L_0x0211
            com.google.common.g.bb r0 = com.google.common.p4535g.C59123ap.m91590j(r11, r12, r0, r3)
            r14 = r2
            double r2 = com.google.common.p4535g.C59123ap.m91581a(r0, r11, r12)
            r23 = r4
            com.google.common.g.f r4 = new com.google.common.g.f
            r4.<init>(r2, r0)
            r1.add(r4)
            goto L_0x0259
        L_0x0211:
            r14 = r2
            r23 = r4
            boolean r2 = com.google.common.p4535g.C59123ap.m91594n(r11, r12, r0, r3)
            if (r2 == 0) goto L_0x0259
            boolean r2 = r11.mo56506q(r0)
            if (r2 != 0) goto L_0x022a
            boolean r2 = r11.mo56506q(r3)
            if (r2 == 0) goto L_0x0227
            goto L_0x022a
        L_0x0227:
            r24 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x022c
        L_0x022a:
            r24 = 0
        L_0x022c:
            if (r28 != 0) goto L_0x0246
            boolean r2 = r15 instanceof com.google.common.p4535g.C59133az
            if (r2 == 0) goto L_0x023c
            r2 = r15
            com.google.common.g.az r2 = (com.google.common.p4535g.C59133az) r2
            boolean r2 = r2.mo56491s()
            r4 = 1
            if (r4 == r2) goto L_0x023d
        L_0x023c:
            r0 = r3
        L_0x023d:
            boolean r0 = r12.mo56506q(r0)
            if (r0 == 0) goto L_0x0246
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0248
        L_0x0246:
            r2 = r24
        L_0x0248:
            r19 = 0
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0250
            r0 = r11
            goto L_0x0251
        L_0x0250:
            r0 = r12
        L_0x0251:
            com.google.common.g.f r4 = new com.google.common.g.f
            r4.<init>(r2, r0)
            r1.add(r4)
        L_0x0259:
            r17 = r13
            r2 = r14
            r0 = r21
            r3 = r22
            r4 = r23
            goto L_0x01d5
        L_0x0264:
            if (r9 == 0) goto L_0x0270
            com.google.common.g.f r0 = new com.google.common.g.f
            r2 = 0
            r0.<init>(r2, r11)
            r1.add(r0)
        L_0x0270:
            int r0 = r1.size()
            r2 = 1
            r9 = r0 & 1
            if (r9 == 0) goto L_0x0283
            com.google.common.g.f r0 = new com.google.common.g.f
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.<init>(r3, r12)
            r1.add(r0)
        L_0x0283:
            java.util.Collections.sort(r1)
            r0 = 0
        L_0x0287:
            int r3 = r1.size()
            if (r0 >= r3) goto L_0x02b0
            java.lang.Object r3 = r1.get(r0)
            com.google.common.g.f r3 = (com.google.common.p4535g.C59212f) r3
            com.google.common.g.bb r3 = r3.f157287a
            int r4 = r0 + 1
            java.lang.Object r4 = r1.get(r4)
            com.google.common.g.f r4 = (com.google.common.p4535g.C59212f) r4
            com.google.common.g.bb r4 = r4.f157287a
            boolean r7 = r3.mo56506q(r4)
            if (r7 != 0) goto L_0x02ab
            r7 = r29
            r7.mo56534d(r3, r4)
            goto L_0x02ad
        L_0x02ab:
            r7 = r29
        L_0x02ad:
            int r0 = r0 + 2
            goto L_0x0287
        L_0x02b0:
            r7 = r29
            r1.clear()
            int r5 = r5 + -1
            r0 = r27
            r2 = r18
            r3 = r22
            r4 = r23
            r7 = 1
            r8 = 0
            goto L_0x003c
        L_0x02c3:
            r7 = r29
            r0 = r27
            goto L_0x0016
        L_0x02c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59143bi.m91689m(com.google.common.g.bi, com.google.common.g.bi, boolean, com.google.common.g.bl):void");
    }

    /* renamed from: n */
    private final void m91690n() {
        this.f157177a.clear();
        mo56521e();
    }

    /* renamed from: o */
    private final void m91691o(C59133az azVar, int i, Map map) {
        if (azVar != null) {
            azVar.f157147h = i;
            this.f157177a.add(azVar);
        }
        List<C59133az> list = (List) map.get(azVar);
        if (list != null) {
            for (C59133az o : list) {
                m91691o(o, i + 1, map);
            }
        }
    }

    /* renamed from: p */
    private static void m91692p(C59133az azVar, C59133az azVar2, Map map) {
        List<C59133az> list = (List) map.get(azVar2);
        if (list == null) {
            list = new ArrayList<>();
            map.put(azVar2, list);
        }
        for (C59133az azVar3 : list) {
            if (azVar3.mo56487o(azVar)) {
                m91692p(azVar, azVar3, map);
                return;
            }
        }
        List list2 = (List) map.get(azVar);
        int i = 0;
        while (i < list.size()) {
            C59133az azVar4 = (C59133az) list.get(i);
            if (azVar.mo56487o(azVar4)) {
                if (list2 == null) {
                    list2 = new ArrayList();
                    map.put(azVar, list2);
                }
                list2.add(azVar4);
                list.remove(i);
            } else {
                i++;
            }
        }
        list.add(azVar);
    }

    private Object readResolve() {
        mo56521e();
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0125  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double mo56516a() {
        /*
            r24 = this;
            r0 = r24
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0006:
            int r7 = r24.mo56517b()
            if (r4 >= r7) goto L_0x0132
            com.google.common.g.az r7 = r0.mo56518c(r4)
            boolean r8 = r7.mo56489q()
            if (r8 == 0) goto L_0x0023
            boolean r7 = r7.f157146g
            if (r7 == 0) goto L_0x0028
            r1 = 0
            r9 = 4623263855806786840(0x402921fb54442d18, double:12.566370614359172)
            goto L_0x0118
        L_0x0023:
            int r8 = r7.f157143d
            r12 = 3
            if (r8 >= r12) goto L_0x002e
        L_0x0028:
            r1 = 0
            r9 = 0
            goto L_0x0118
        L_0x002e:
            r8 = 0
            r13 = 0
        L_0x0031:
            int r15 = r7.mo56419a()
            if (r8 >= r15) goto L_0x0109
            com.google.common.g.dq r15 = new com.google.common.g.dq
            r15.<init>(r7, r8)
            com.google.common.g.du r11 = new com.google.common.g.du
            r11.<init>()
            int r1 = r15.f157275a
            if (r1 >= r12) goto L_0x0049
            r18 = r7
            goto L_0x00b3
        L_0x0049:
            com.google.common.g.bb r1 = r15.get(r3)
            int r2 = r15.f157275a
            r12 = r1
            r3 = 1
        L_0x0051:
            int r9 = r3 + 1
            if (r9 >= r2) goto L_0x00a2
            com.google.common.g.bb r3 = r15.get(r3)
            com.google.common.g.bb r10 = r15.get(r9)
            double r18 = r10.mo56496a(r12)
            r20 = 4614256634034047711(0x400921f61616cadf, double:3.141582653589793)
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r22 <= 0) goto L_0x0099
            boolean r18 = r12.mo56506q(r1)
            if (r18 == 0) goto L_0x007f
            com.google.common.g.bb r18 = com.google.common.p4535g.C59222p.m91902h(r1, r3)
            com.google.common.g.bb r18 = com.google.common.p4535g.C59136bb.m91671n(r18)
            r23 = r18
            r18 = r7
            r7 = r23
            goto L_0x0094
        L_0x007f:
            double r18 = r3.mo56496a(r1)
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r22 >= 0) goto L_0x008b
            r18 = r7
            r7 = r1
            goto L_0x0094
        L_0x008b:
            r18 = r7
            com.google.common.g.bb r7 = com.google.common.p4535g.C59136bb.m91668k(r1, r12)
            com.google.common.p4535g.C59204dp.m91839a(r1, r12, r7, r11)
        L_0x0094:
            com.google.common.p4535g.C59204dp.m91839a(r12, r3, r7, r11)
            r12 = r7
            goto L_0x009b
        L_0x0099:
            r18 = r7
        L_0x009b:
            com.google.common.p4535g.C59204dp.m91839a(r12, r3, r10, r11)
            r3 = r9
            r7 = r18
            goto L_0x0051
        L_0x00a2:
            r18 = r7
            boolean r3 = r12.mo56506q(r1)
            if (r3 != 0) goto L_0x00b3
            int r2 = r2 + -1
            com.google.common.g.bb r2 = r15.get(r2)
            com.google.common.p4535g.C59204dp.m91839a(r12, r2, r1, r11)
        L_0x00b3:
            int r1 = r15.f157275a
            double r1 = com.google.common.p4535g.C59222p.m91895a(r1)
            double r9 = r11.f157283a
            r11 = 4623263855806786840(0x402921fb54442d18, double:12.566370614359172)
            double r9 = r9 % r11
            r11 = -4604611780675359464(0xc01921fb54442d18, double:-6.283185307179586)
            r19 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x00d1
            r9 = r19
        L_0x00d1:
            double r11 = java.lang.Math.abs(r9)
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0100
            double r1 = com.google.common.p4535g.C59210dv.m91843a(r15)
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x00e4
            r9 = 0
            goto L_0x0100
        L_0x00e4:
            r11 = 0
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x00f3
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f3
            r16 = 1
            r9 = r16
            goto L_0x0100
        L_0x00f3:
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 < 0) goto L_0x0100
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0100
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0100:
            double r13 = r13 + r9
            int r8 = r8 + 1
            r7 = r18
            r3 = 0
            r12 = 3
            goto L_0x0031
        L_0x0109:
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0117
            r7 = 4623263855806786840(0x402921fb54442d18, double:12.566370614359172)
            double r9 = r13 + r7
            goto L_0x0118
        L_0x0117:
            r9 = r13
        L_0x0118:
            com.google.common.g.az r3 = r0.mo56518c(r4)
            boolean r3 = r3.mo56491s()
            r7 = 1
            if (r7 == r3) goto L_0x0125
            r11 = 1
            goto L_0x0126
        L_0x0125:
            r11 = -1
        L_0x0126:
            double r7 = (double) r11
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r9
            double r5 = r5 + r7
            int r4 = r4 + 1
            r3 = 0
            goto L_0x0006
        L_0x0132:
            com.google.common.g.q r1 = new com.google.common.g.q
            r1.<init>(r5)
            double r1 = r1.f157317a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59143bi.mo56516a():double");
    }

    /* renamed from: b */
    public final int mo56517b() {
        return this.f157177a.size();
    }

    /* renamed from: c */
    public final C59133az mo56518c(int i) {
        return (C59133az) this.f157177a.get(i);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C59143bi biVar = (C59143bi) obj;
        if (mo56517b() != biVar.mo56517b()) {
            return mo56517b() - biVar.mo56517b();
        }
        for (int i = 0; i < mo56517b(); i++) {
            int h = ((C59133az) this.f157177a.get(i)).compareTo((C59133az) biVar.f157177a.get(i));
            if (h != 0) {
                return h;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo56520d(C59143bi biVar) {
        this.f157178b = biVar.f157178b;
        this.f157179c = biVar.f157179c;
        this.f157181e = biVar.f157181e;
        this.f157182f = biVar.f157182f;
        for (int i = 0; i < biVar.mo56517b(); i++) {
            this.f157177a.add(new C59133az(biVar.mo56518c(i)));
        }
        mo56521e();
    }

    /* renamed from: e */
    public final void mo56521e() {
        int i = this.f157182f;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.f157183g.set(i2);
        this.f157180d = new C59203do();
        for (int i3 = 0; i3 < mo56517b(); i3++) {
            this.f157180d.mo56571c(mo56518c(i3));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59143bi) {
            C59143bi biVar = (C59143bi) obj;
            if (this.f157182f != biVar.f157182f || !this.f157178b.equals(biVar.f157178b) || !this.f157177a.equals(biVar.f157177a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo56523f() {
        this.f157181e = false;
        this.f157182f = 0;
        C59128au c = C59128au.m91615c();
        for (C59133az azVar : this.f157177a) {
            if (azVar.mo56491s()) {
                this.f157181e = true;
            } else {
                c.mo56462e(azVar.f157144e);
            }
            this.f157182f += azVar.f157143d;
        }
        C59129av d = c.mo56461d();
        this.f157178b = d;
        this.f157179c = C59121an.m91580a(d);
        mo56521e();
    }

    /* renamed from: g */
    public final boolean mo56467g(C59225s sVar) {
        throw null;
    }

    /* renamed from: h */
    public final void mo56524h(List list) {
        m91690n();
        if (list.size() != 1) {
            IdentityHashMap identityHashMap = new IdentityHashMap();
            identityHashMap.put((Object) null, new ArrayList());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m91692p((C59133az) it.next(), (C59133az) null, identityHashMap);
            }
            list.clear();
            for (List sort : identityHashMap.values()) {
                Collections.sort(sort);
            }
            m91691o((C59133az) null, -1, identityHashMap);
            mo56523f();
            return;
        }
        this.f157177a.clear();
        this.f157177a.add((C59133az) list.remove(0));
        C59133az azVar = (C59133az) this.f157177a.get(0);
        azVar.f157147h = 0;
        this.f157181e = false;
        this.f157182f = azVar.f157143d;
        this.f157178b = azVar.f157144e;
        this.f157179c = azVar.f157145f;
        mo56521e();
    }

    public final int hashCode() {
        return this.f157178b.hashCode();
    }

    /* renamed from: i */
    public final void mo56526i() {
        int i;
        if (mo56528k()) {
            this.f157177a.add(new C59133az(Collections.singletonList(C59133az.f157141b)));
        } else if (mo56529l()) {
            m91690n();
        } else {
            boolean z = true;
            double d = C59203do.f157270a;
            int i2 = -1;
            for (int i3 = 1; i3 < mo56517b(); i3++) {
                C59133az c = mo56518c(i3);
                if (c.f157147h == 0) {
                    if (i2 == -1) {
                        d = mo56518c(0).mo56478f();
                        i2 = 0;
                    }
                    double f = c.mo56478f();
                    if (f < d) {
                        i2 = i3;
                        d = f;
                    }
                }
            }
            if (i2 < 0) {
                i2 = 0;
            }
            mo56518c(i2).mo56484l();
            ArrayList d2 = C58597ky.m90213d(mo56517b());
            d2.add(mo56518c(i2));
            if (i2 < 0) {
                i = mo56517b() - 1;
            } else {
                int i4 = mo56518c(i2).f157147h;
                int i5 = i2;
                do {
                    i5++;
                    if (i5 >= mo56517b() || mo56518c(i5).f157147h <= i4) {
                        i = i5 - 1;
                    }
                    i5++;
                    break;
                } while (mo56518c(i5).f157147h <= i4);
                i = i5 - 1;
            }
            for (int i6 = 0; i6 < mo56517b(); i6++) {
                if (i6 < i2 || i6 > i) {
                    C59133az c2 = mo56518c(i6);
                    c2.f157147h++;
                    d2.add(c2);
                }
            }
            for (int i7 = 0; i7 < mo56517b(); i7++) {
                if (i7 > i2 && i7 <= i) {
                    C59133az c3 = mo56518c(i7);
                    c3.f157147h--;
                    d2.add(c3);
                }
            }
            if (this.f157177a.size() != d2.size()) {
                z = false;
            }
            C58838bb.m90883r(z);
            this.f157177a.clear();
            this.f157177a.addAll(d2);
        }
        mo56523f();
    }

    /* renamed from: j */
    public final boolean mo56527j(C59136bb bbVar) {
        if (!this.f157180d.f157272c && !this.f157178b.mo56474o(bbVar)) {
            return false;
        }
        if (this.f157182f <= 32 || (!this.f157180d.f157272c && this.f157183g.decrementAndGet() > 0)) {
            boolean z = false;
            for (int i = 0; i < mo56517b(); i++) {
                z ^= mo56518c(i).mo56485m(bbVar);
            }
            return z;
        }
        C59126as a = this.f157180d.mo56570a();
        if (!a.mo56449i(bbVar)) {
            return false;
        }
        C59176co coVar = (C59176co) a.mo56441c();
        C59119al alVar = new C59119al(C59136bb.m91671n(a.mo56440b().mo56679z()), bbVar);
        boolean z2 = false;
        for (int i2 = 0; i2 < coVar.mo56551b(); i2++) {
            C59200dl c = coVar.mo56552c(i2);
            z2 ^= c.mo56560g();
            int f = c.mo56559f();
            if (f > 0) {
                C59133az azVar = (C59133az) c.f157265b;
                int i3 = -2;
                int i4 = 0;
                while (i4 < f) {
                    int e = c.mo56558e(i4);
                    if (e != i3 + 1) {
                        alVar.mo56436d(azVar.mo56481i(e));
                    }
                    z2 ^= alVar.mo56437e(azVar.mo56481i(e + 1));
                    i4++;
                    i3 = e;
                }
            }
        }
        return z2;
    }

    /* renamed from: k */
    public final boolean mo56528k() {
        return this.f157177a.isEmpty();
    }

    /* renamed from: l */
    public final boolean mo56529l() {
        return this.f157177a.size() == 1 && ((C59133az) this.f157177a.get(0)).mo56490r();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Polygon: (");
        sb.append(mo56517b());
        sb.append(") loops:\n");
        for (int i = 0; i < mo56517b(); i++) {
            C59133az c = mo56518c(i);
            sb.append("loop <\n");
            for (int i2 = 0; i2 < c.f157143d; i2++) {
                sb.append(c.mo56481i(i2).mo56505p());
                sb.append("\n");
            }
            sb.append(">\n");
        }
        return sb.toString();
    }

    public C59143bi(C59133az azVar) {
        ArrayList arrayList = new ArrayList();
        this.f157177a = arrayList;
        this.f157183g = new AtomicInteger();
        this.f157181e = false;
        this.f157182f = 0;
        this.f157182f = azVar.f157143d;
        this.f157178b = azVar.f157144e;
        this.f157179c = azVar.f157145f;
        arrayList.add(azVar);
        mo56521e();
    }
}
