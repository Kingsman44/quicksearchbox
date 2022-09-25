package com.google.android.apps.gsa.search.core.p6809l;

import com.google.common.p4526f.C59071e;
import p5591n.p5592a.p5593a.C71853d;
import p5591n.p5592a.p5593a.C71855f;

/* renamed from: com.google.android.apps.gsa.search.core.l.d */
/* compiled from: PG */
public final class C86155d {

    /* renamed from: a */
    public static final C59071e f232823a = C59071e.m91332i("com.google.android.apps.gsa.search.core.l.d");

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0243, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0243 A[ExcHandler: ct (e com.google.protobuf.ct), Splitter:B:7:0x0033] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p4242bp.p4243a.p4247d.C56166f m138570a(p5591n.p5592a.p5593a.C71853d r17) {
        /*
            r0 = r17
            java.lang.String r1 = "size"
            java.lang.String r2 = "context_type"
            java.lang.String r3 = "."
            com.google.bp.a.d.f r4 = com.google.p4242bp.p4243a.p4247d.C56166f.f149643c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.bp.a.d.e r4 = (com.google.p4242bp.p4243a.p4247d.C56165e) r4
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.google.protobuf.cq r6 = r0.f191393a
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0033
            java.lang.Object r7 = r6.next()
            n.a.a.b r7 = (p5591n.p5592a.p5593a.C71851b) r7
            java.lang.String r8 = r7.f191389b
            n.a.a.f r7 = r7.f191390c
            if (r7 != 0) goto L_0x002f
            n.a.a.f r7 = p5591n.p5592a.p5593a.C71855f.f191394d
        L_0x002f:
            r5.put(r8, r7)
            goto L_0x001b
        L_0x0033:
            boolean r6 = r5.containsKey(r2)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            if (r6 != 0) goto L_0x0093
            com.google.protobuf.cq r0 = r0.f191393a     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
        L_0x003f:
            boolean r1 = r0.hasNext()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r0.next()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            n.a.a.b r1 = (p5591n.p5592a.p5593a.C71851b) r1     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            n.a.a.f r2 = r1.f191390c     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            if (r2 != 0) goto L_0x0051
            n.a.a.f r2 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ c -> 0x0245, ct -> 0x0243 }
        L_0x0051:
            int r2 = r2.f191396a     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            r2 = r2 & 16
            if (r2 == 0) goto L_0x003f
            int r2 = r1.f191388a     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0064
            n.a.a.f r2 = r1.f191390c     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            if (r2 != 0) goto L_0x0065
            n.a.a.f r2 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            java.lang.String r1 = r1.f191389b     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            r3.<init>()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            java.lang.String r5 = "Fail to parse "
            r3.append(r5)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            r3.append(r1)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            java.lang.String r1 = r3.toString()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            n.a.a.d r1 = m138573d(r2, r1)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.bp.a.d.f r1 = m138570a(r1)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            byte[] r1 = r1.toByteArray()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            r4.mergeFrom((byte[]) r1, (com.google.protobuf.C62921ba) r2)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            goto L_0x003f
        L_0x008c:
            com.google.protobuf.bv r0 = r4.build()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.bp.a.d.f r0 = (com.google.p4242bp.p4243a.p4247d.C56166f) r0     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            return r0
        L_0x0093:
            java.lang.Object r0 = r5.get(r2)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            n.a.a.f r0 = (p5591n.p5592a.p5593a.C71855f) r0     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            java.lang.String r2 = "Cannot parse developer context type name."
            java.lang.String r0 = m138572c(r0, r2)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            java.lang.String r2 = "APP_STATE"
            boolean r2 = android.text.TextUtils.equals(r2, r0)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r0 = "value"
            java.lang.Object r0 = r5.get(r0)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            n.a.a.f r0 = (p5591n.p5592a.p5593a.C71855f) r0     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            java.lang.String r1 = "Cannot parse the state value."
            java.lang.String r0 = m138572c(r0, r1)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            r4.mo54329a(r0)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            goto L_0x023c
        L_0x00ba:
            java.lang.String r2 = "DYNAMIC_TYPE"
            boolean r0 = android.text.TextUtils.equals(r2, r0)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            if (r0 == 0) goto L_0x023c
            com.google.assistant.o.g r0 = com.google.assistant.p3988o.C53037g.f139008e     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.assistant.o.d r0 = (com.google.assistant.p3988o.C53034d) r0     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            java.lang.String r2 = "custom_type_name"
            java.lang.Object r2 = r5.get(r2)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            n.a.a.f r2 = (p5591n.p5592a.p5593a.C71855f) r2     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r6 = "Cannot parse dynamic custom type name."
            java.lang.String r2 = m138572c(r2, r6)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r0.copyOnWrite()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.bv r6 = r0.instance     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.assistant.o.g r6 = (com.google.assistant.p3988o.C53037g) r6     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r2.getClass()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            int r7 = r6.f139010a     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r8 = 1
            r7 = r7 | r8
            r6.f139010a = r7     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r6.f139011b = r2     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r0.copyOnWrite()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.assistant.o.g r2 = (com.google.assistant.p3988o.C53037g) r2     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            int r6 = r2.f139010a     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r6 = r6 | 2
            r2.f139010a = r6     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r2.f139013d = r8     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.Object r2 = r5.get(r1)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            n.a.a.f r2 = (p5591n.p5592a.p5593a.C71855f) r2     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r6 = "Cannot parse the item size."
            int r2 = m138571b(r2, r6)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r6 = 0
            r7 = 0
        L_0x0107:
            if (r7 >= r2) goto L_0x0207
            com.google.assistant.o.f r9 = com.google.assistant.p3988o.C53036f.f139002d     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.assistant.o.e r9 = (com.google.assistant.p3988o.C53035e) r9     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.Object r10 = r5.get(r10)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            n.a.a.f r10 = (p5591n.p5592a.p5593a.C71855f) r10     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r11.<init>()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r12 = "Cannot parse the item "
            r11.append(r12)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r11.append(r7)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r11.append(r3)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r11 = r11.toString()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            n.a.a.d r10 = m138573d(r10, r11)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r11.<init>()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.cq r10 = r10.f191393a     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
        L_0x013e:
            boolean r12 = r10.hasNext()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            if (r12 == 0) goto L_0x0156
            java.lang.Object r12 = r10.next()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            n.a.a.b r12 = (p5591n.p5592a.p5593a.C71851b) r12     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r13 = r12.f191389b     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            n.a.a.f r12 = r12.f191390c     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            if (r12 != 0) goto L_0x0152
            n.a.a.f r12 = p5591n.p5592a.p5593a.C71855f.f191394d     // Catch:{ c -> 0x0233, ct -> 0x0243 }
        L_0x0152:
            r11.put(r13, r12)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            goto L_0x013e
        L_0x0156:
            java.lang.String r10 = "key"
            java.lang.Object r10 = r11.get(r10)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            n.a.a.f r10 = (p5591n.p5592a.p5593a.C71855f) r10     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r12 = "Cannot parse the item key."
            java.lang.String r10 = m138572c(r10, r12)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r9.copyOnWrite()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.bv r12 = r9.instance     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.assistant.o.f r12 = (com.google.assistant.p3988o.C53036f) r12     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r10.getClass()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            int r13 = r12.f139004a     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r13 = r13 | r8
            r12.f139004a = r13     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r12.f139005b = r10     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.Object r10 = r11.get(r1)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            n.a.a.f r10 = (p5591n.p5592a.p5593a.C71855f) r10     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r12.<init>()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r13 = "Cannot parse the item value size for the item "
            r12.append(r13)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r12.append(r7)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r12.append(r3)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r12 = r12.toString()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            int r10 = m138571b(r10, r12)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r12 = 0
        L_0x0194:
            if (r12 >= r10) goto L_0x01e0
            java.lang.String r13 = java.lang.String.valueOf(r12)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.Object r13 = r11.get(r13)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            n.a.a.f r13 = (p5591n.p5592a.p5593a.C71855f) r13     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r14.<init>()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r15 = "Cannot parse value "
            r14.append(r15)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r14.append(r12)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r15 = " of the item "
            r14.append(r15)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r14.append(r7)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r14.append(r3)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r14 = r14.toString()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            java.lang.String r13 = m138572c(r13, r14)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r9.copyOnWrite()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.bv r14 = r9.instance     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.assistant.o.f r14 = (com.google.assistant.p3988o.C53036f) r14     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r13.getClass()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.cq r15 = r14.f139006c     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            boolean r16 = r15.mo58948c()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            if (r16 != 0) goto L_0x01d8
            com.google.protobuf.cq r15 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r15)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r14.f139006c = r15     // Catch:{ c -> 0x0233, ct -> 0x0243 }
        L_0x01d8:
            com.google.protobuf.cq r14 = r14.f139006c     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r14.add(r13)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            int r12 = r12 + 1
            goto L_0x0194
        L_0x01e0:
            r0.copyOnWrite()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.bv r10 = r0.instance     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.assistant.o.g r10 = (com.google.assistant.p3988o.C53037g) r10     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.assistant.o.f r9 = (com.google.assistant.p3988o.C53036f) r9     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r9.getClass()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            com.google.protobuf.cq r11 = r10.f139012c     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            boolean r12 = r11.mo58948c()     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            if (r12 != 0) goto L_0x01fe
            com.google.protobuf.cq r11 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r11)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r10.f139012c = r11     // Catch:{ c -> 0x0233, ct -> 0x0243 }
        L_0x01fe:
            com.google.protobuf.cq r10 = r10.f139012c     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            r10.add(r9)     // Catch:{ c -> 0x0233, ct -> 0x0243 }
            int r7 = r7 + 1
            goto L_0x0107
        L_0x0207:
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.assistant.o.g r0 = (com.google.assistant.p3988o.C53037g) r0     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.assistant.o.g r1 = com.google.assistant.p3988o.C53037g.f139008e     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            boolean r1 = r0.equals(r1)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            if (r1 != 0) goto L_0x023c
            r4.copyOnWrite()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.protobuf.bv r1 = r4.instance     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.bp.a.d.f r1 = (com.google.p4242bp.p4243a.p4247d.C56166f) r1     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            r0.getClass()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            com.google.protobuf.cq r2 = r1.f149645a     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            boolean r3 = r2.mo58948c()     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            if (r3 != 0) goto L_0x022d
            com.google.protobuf.cq r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r2)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            r1.f149645a = r2     // Catch:{ c -> 0x0245, ct -> 0x0243 }
        L_0x022d:
            com.google.protobuf.cq r1 = r1.f149645a     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            r1.add(r0)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            goto L_0x023c
        L_0x0233:
            r0 = move-exception
            com.google.android.apps.gsa.search.core.l.c r1 = new com.google.android.apps.gsa.search.core.l.c     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            java.lang.String r2 = "The developer reported dynmatic type is not in the correct format."
            r1.<init>(r2, r0)     // Catch:{ c -> 0x0245, ct -> 0x0243 }
            throw r1     // Catch:{ c -> 0x0245, ct -> 0x0243 }
        L_0x023c:
            com.google.protobuf.bv r0 = r4.build()
            com.google.bp.a.d.f r0 = (com.google.p4242bp.p4243a.p4247d.C56166f) r0
            return r0
        L_0x0243:
            r0 = move-exception
            goto L_0x0246
        L_0x0245:
            r0 = move-exception
        L_0x0246:
            com.google.android.apps.gsa.search.core.l.c r1 = new com.google.android.apps.gsa.search.core.l.c
            java.lang.String r2 = "Cannot parse developer provided context."
            r1.<init>(r2, r0)
            goto L_0x024f
        L_0x024e:
            throw r1
        L_0x024f:
            goto L_0x024e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6809l.C86155d.m138570a(n.a.a.d):com.google.bp.a.d.f");
    }

    /* renamed from: b */
    private static int m138571b(C71855f fVar, String str) {
        if (fVar != null) {
            try {
                return Integer.parseInt(fVar.f191397b);
            } catch (NumberFormatException e) {
                throw new C86154c(str, e);
            }
        } else {
            throw new C86154c(str);
        }
    }

    /* renamed from: c */
    private static String m138572c(C71855f fVar, String str) {
        if (fVar != null && !fVar.f191397b.isEmpty()) {
            return fVar.f191397b;
        }
        throw new C86154c(str);
    }

    /* renamed from: d */
    private static C71853d m138573d(C71855f fVar, String str) {
        if (fVar == null || (fVar.f191396a & 16) == 0) {
            throw new C86154c(str);
        }
        C71853d dVar = fVar.f191398c;
        return dVar == null ? C71853d.f191391b : dVar;
    }
}
