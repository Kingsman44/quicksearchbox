package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70344do;

/* renamed from: io.grpc.e.ka */
/* compiled from: PG */
public final class C70628ka extends C70344do {

    /* renamed from: a */
    private final boolean f188277a;

    /* renamed from: b */
    private final C70690u f188278b;

    public C70628ka(boolean z, C70690u uVar) {
        this.f188277a = z;
        C58838bb.m90866a(uVar, "autoLoadBalancerFactory");
        this.f188278b = uVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4 A[Catch:{ RuntimeException -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013f A[Catch:{ RuntimeException -> 0x0249 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0142 A[Catch:{ RuntimeException -> 0x0249 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0144 A[Catch:{ RuntimeException -> 0x0249 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0155 A[Catch:{ RuntimeException -> 0x0249 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a2 A[Catch:{ RuntimeException -> 0x0249 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a4 A[Catch:{ RuntimeException -> 0x0249 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3 A[Catch:{ RuntimeException -> 0x0249 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bc A[Catch:{ RuntimeException -> 0x0249 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p5488io.grpc.C70340dk mo62054a(java.util.Map r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            io.grpc.e.u r0 = r1.f188278b     // Catch:{ RuntimeException -> 0x0249 }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x00ab
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x00a8 }
            r5.<init>()     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r6 = "loadBalancingConfig"
            boolean r7 = r2.containsKey(r6)     // Catch:{ RuntimeException -> 0x00a8 }
            if (r7 == 0) goto L_0x001e
            java.util.List r6 = p5488io.grpc.p5525e.C70495fc.m102945f(r2, r6)     // Catch:{ RuntimeException -> 0x00a8 }
            r5.addAll(r6)     // Catch:{ RuntimeException -> 0x00a8 }
        L_0x001e:
            boolean r6 = r5.isEmpty()     // Catch:{ RuntimeException -> 0x00a8 }
            if (r6 == 0) goto L_0x003d
            java.lang.String r6 = "loadBalancingPolicy"
            java.lang.String r6 = p5488io.grpc.p5525e.C70495fc.m102943d(r2, r6)     // Catch:{ RuntimeException -> 0x00a8 }
            if (r6 == 0) goto L_0x003d
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r6 = r6.toLowerCase(r7)     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.Map r7 = java.util.Collections.emptyMap()     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.Map r6 = java.util.Collections.singletonMap(r6, r7)     // Catch:{ RuntimeException -> 0x00a8 }
            r5.add(r6)     // Catch:{ RuntimeException -> 0x00a8 }
        L_0x003d:
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)     // Catch:{ RuntimeException -> 0x00a8 }
            if (r5 != 0) goto L_0x0044
            goto L_0x00ab
        L_0x0044:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x00a8 }
            r6.<init>()     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RuntimeException -> 0x00a8 }
        L_0x004d:
            boolean r7 = r5.hasNext()     // Catch:{ RuntimeException -> 0x00a8 }
            if (r7 == 0) goto L_0x00a3
            java.lang.Object r7 = r5.next()     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ RuntimeException -> 0x00a8 }
            int r8 = r7.size()     // Catch:{ RuntimeException -> 0x00a8 }
            if (r8 != r3) goto L_0x0080
            java.util.Set r8 = r7.entrySet()     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.Object r8 = r8.next()     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.Object r8 = r8.getKey()     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ RuntimeException -> 0x00a8 }
            io.grpc.e.lh r9 = new io.grpc.e.lh     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.Map r7 = p5488io.grpc.p5525e.C70495fc.m102947h(r7, r8)     // Catch:{ RuntimeException -> 0x00a8 }
            r9.<init>(r8, r7)     // Catch:{ RuntimeException -> 0x00a8 }
            r6.add(r9)     // Catch:{ RuntimeException -> 0x00a8 }
            goto L_0x004d
        L_0x0080:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00a8 }
            r5.<init>()     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r6 = "There are "
            r5.append(r6)     // Catch:{ RuntimeException -> 0x00a8 }
            int r6 = r7.size()     // Catch:{ RuntimeException -> 0x00a8 }
            r5.append(r6)     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r6 = " fields in a LoadBalancingConfig object. Exactly one is expected. Config="
            r5.append(r6)     // Catch:{ RuntimeException -> 0x00a8 }
            r5.append(r7)     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x00a8 }
            r0.<init>(r5)     // Catch:{ RuntimeException -> 0x00a8 }
            throw r0     // Catch:{ RuntimeException -> 0x00a8 }
        L_0x00a3:
            java.util.List r5 = java.util.Collections.unmodifiableList(r6)     // Catch:{ RuntimeException -> 0x00a8 }
            goto L_0x00ac
        L_0x00a8:
            r0 = move-exception
            goto L_0x012c
        L_0x00ab:
            r5 = r4
        L_0x00ac:
            if (r5 == 0) goto L_0x013f
            boolean r6 = r5.isEmpty()     // Catch:{ RuntimeException -> 0x00a8 }
            if (r6 != 0) goto L_0x013f
            io.grpc.cn r0 = r0.f188426a     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x00a8 }
            r11.<init>()     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RuntimeException -> 0x00a8 }
        L_0x00bf:
            boolean r6 = r5.hasNext()     // Catch:{ RuntimeException -> 0x00a8 }
            if (r6 == 0) goto L_0x010a
            java.lang.Object r6 = r5.next()     // Catch:{ RuntimeException -> 0x00a8 }
            r12 = r6
            io.grpc.e.lh r12 = (p5488io.grpc.p5525e.C70662lh) r12     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r6 = r12.f188385a     // Catch:{ RuntimeException -> 0x00a8 }
            io.grpc.cl r13 = r0.mo61971a(r6)     // Catch:{ RuntimeException -> 0x00a8 }
            if (r13 != 0) goto L_0x00d8
            r11.add(r6)     // Catch:{ RuntimeException -> 0x00a8 }
            goto L_0x00bf
        L_0x00d8:
            boolean r0 = r11.isEmpty()     // Catch:{ RuntimeException -> 0x00a8 }
            if (r0 != 0) goto L_0x00f3
            java.lang.Class<io.grpc.e.lj> r0 = p5488io.grpc.p5525e.C70664lj.class
            java.lang.String r0 = r0.getName()     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r0)     // Catch:{ RuntimeException -> 0x00a8 }
            java.util.logging.Level r7 = java.util.logging.Level.FINEST     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r8 = "io.grpc.internal.ServiceConfigUtil"
            java.lang.String r9 = "selectLbPolicyFromList"
            java.lang.String r10 = "{0} specified by Service Config are not available"
            r6.logp(r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x00a8 }
        L_0x00f3:
            java.util.Map r0 = r12.f188386b     // Catch:{ RuntimeException -> 0x00a8 }
            io.grpc.dk r0 = r13.mo61966e()     // Catch:{ RuntimeException -> 0x00a8 }
            io.grpc.Status r5 = r0.f187510a     // Catch:{ RuntimeException -> 0x00a8 }
            if (r5 != 0) goto L_0x0140
            io.grpc.e.li r5 = new io.grpc.e.li     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.Object r0 = r0.f187511b     // Catch:{ RuntimeException -> 0x00a8 }
            r5.<init>(r13, r0)     // Catch:{ RuntimeException -> 0x00a8 }
            io.grpc.dk r0 = new io.grpc.dk     // Catch:{ RuntimeException -> 0x00a8 }
            r0.<init>((java.lang.Object) r5)     // Catch:{ RuntimeException -> 0x00a8 }
            goto L_0x0140
        L_0x010a:
            io.grpc.Status r0 = p5488io.grpc.Status.f186905c     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00a8 }
            r5.<init>()     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r6 = "None of "
            r5.append(r6)     // Catch:{ RuntimeException -> 0x00a8 }
            r5.append(r11)     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r6 = " specified by Service Config are available."
            r5.append(r6)     // Catch:{ RuntimeException -> 0x00a8 }
            java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x00a8 }
            io.grpc.Status r0 = r0.withDescription(r5)     // Catch:{ RuntimeException -> 0x00a8 }
            io.grpc.dk r5 = new io.grpc.dk     // Catch:{ RuntimeException -> 0x00a8 }
            r5.<init>((p5488io.grpc.Status) r0)     // Catch:{ RuntimeException -> 0x00a8 }
            goto L_0x013d
        L_0x012c:
            io.grpc.Status r5 = p5488io.grpc.Status.f186905c     // Catch:{ RuntimeException -> 0x0249 }
            java.lang.String r6 = "can't parse load balancer configuration"
            io.grpc.Status r5 = r5.withDescription(r6)     // Catch:{ RuntimeException -> 0x0249 }
            io.grpc.Status r0 = r5.mo61678e(r0)     // Catch:{ RuntimeException -> 0x0249 }
            io.grpc.dk r5 = new io.grpc.dk     // Catch:{ RuntimeException -> 0x0249 }
            r5.<init>((p5488io.grpc.Status) r0)     // Catch:{ RuntimeException -> 0x0249 }
        L_0x013d:
            r0 = r5
            goto L_0x0140
        L_0x013f:
            r0 = r4
        L_0x0140:
            if (r0 != 0) goto L_0x0144
            r10 = r4
            goto L_0x0151
        L_0x0144:
            io.grpc.Status r5 = r0.f187510a     // Catch:{ RuntimeException -> 0x0249 }
            if (r5 == 0) goto L_0x014e
            io.grpc.dk r0 = new io.grpc.dk     // Catch:{ RuntimeException -> 0x0249 }
            r0.<init>((p5488io.grpc.Status) r5)     // Catch:{ RuntimeException -> 0x0249 }
            return r0
        L_0x014e:
            java.lang.Object r0 = r0.f187511b     // Catch:{ RuntimeException -> 0x0249 }
            r10 = r0
        L_0x0151:
            boolean r0 = r1.f188277a     // Catch:{ RuntimeException -> 0x0249 }
            if (r0 == 0) goto L_0x0195
            if (r2 != 0) goto L_0x0158
            goto L_0x0195
        L_0x0158:
            java.lang.String r6 = "retryThrottling"
            java.util.Map r6 = p5488io.grpc.p5525e.C70495fc.m102947h(r2, r6)     // Catch:{ RuntimeException -> 0x0249 }
            if (r6 != 0) goto L_0x0161
            goto L_0x0195
        L_0x0161:
            java.lang.String r7 = "maxTokens"
            java.lang.Double r7 = p5488io.grpc.p5525e.C70495fc.m102940a(r6, r7)     // Catch:{ RuntimeException -> 0x0249 }
            float r7 = r7.floatValue()     // Catch:{ RuntimeException -> 0x0249 }
            java.lang.String r8 = "tokenRatio"
            java.lang.Double r6 = p5488io.grpc.p5525e.C70495fc.m102940a(r6, r8)     // Catch:{ RuntimeException -> 0x0249 }
            float r6 = r6.floatValue()     // Catch:{ RuntimeException -> 0x0249 }
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x017c
            r9 = 1
            goto L_0x017d
        L_0x017c:
            r9 = 0
        L_0x017d:
            java.lang.String r11 = "maxToken should be greater than zero"
            com.google.common.base.C58838bb.m90884s(r9, r11)     // Catch:{ RuntimeException -> 0x0249 }
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0188
            r8 = 1
            goto L_0x0189
        L_0x0188:
            r8 = 0
        L_0x0189:
            java.lang.String r9 = "tokenRatio should be greater than zero"
            com.google.common.base.C58838bb.m90884s(r8, r9)     // Catch:{ RuntimeException -> 0x0249 }
            io.grpc.e.jx r8 = new io.grpc.e.jx     // Catch:{ RuntimeException -> 0x0249 }
            r8.<init>(r7, r6)     // Catch:{ RuntimeException -> 0x0249 }
            r9 = r8
            goto L_0x0196
        L_0x0195:
            r9 = r4
        L_0x0196:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ RuntimeException -> 0x0249 }
            r7.<init>()     // Catch:{ RuntimeException -> 0x0249 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ RuntimeException -> 0x0249 }
            r8.<init>()     // Catch:{ RuntimeException -> 0x0249 }
            if (r2 != 0) goto L_0x01a4
            r11 = r4
            goto L_0x01ab
        L_0x01a4:
            java.lang.String r6 = "healthCheckConfig"
            java.util.Map r6 = p5488io.grpc.p5525e.C70495fc.m102947h(r2, r6)     // Catch:{ RuntimeException -> 0x0249 }
            r11 = r6
        L_0x01ab:
            java.lang.String r6 = "methodConfig"
            java.util.List r6 = p5488io.grpc.p5525e.C70495fc.m102945f(r2, r6)     // Catch:{ RuntimeException -> 0x0249 }
            if (r6 != 0) goto L_0x01bc
            io.grpc.e.hh r0 = new io.grpc.e.hh     // Catch:{ RuntimeException -> 0x0249 }
            r6 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x0249 }
            goto L_0x0243
        L_0x01bc:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RuntimeException -> 0x0249 }
        L_0x01c0:
            boolean r12 = r6.hasNext()     // Catch:{ RuntimeException -> 0x0249 }
            if (r12 == 0) goto L_0x023c
            java.lang.Object r12 = r6.next()     // Catch:{ RuntimeException -> 0x0249 }
            java.util.Map r12 = (java.util.Map) r12     // Catch:{ RuntimeException -> 0x0249 }
            io.grpc.e.hf r13 = new io.grpc.e.hf     // Catch:{ RuntimeException -> 0x0249 }
            r13.<init>(r12, r0)     // Catch:{ RuntimeException -> 0x0249 }
            java.lang.String r14 = "name"
            java.util.List r12 = p5488io.grpc.p5525e.C70495fc.m102945f(r12, r14)     // Catch:{ RuntimeException -> 0x0249 }
            if (r12 == 0) goto L_0x01c0
            boolean r14 = r12.isEmpty()     // Catch:{ RuntimeException -> 0x0249 }
            if (r14 != 0) goto L_0x01c0
            java.util.Iterator r12 = r12.iterator()     // Catch:{ RuntimeException -> 0x0249 }
        L_0x01e3:
            boolean r14 = r12.hasNext()     // Catch:{ RuntimeException -> 0x0249 }
            if (r14 == 0) goto L_0x01c0
            java.lang.Object r14 = r12.next()     // Catch:{ RuntimeException -> 0x0249 }
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ RuntimeException -> 0x0249 }
            java.lang.String r15 = "service"
            java.lang.String r15 = p5488io.grpc.p5525e.C70495fc.m102943d(r14, r15)     // Catch:{ RuntimeException -> 0x0249 }
            java.lang.String r5 = "method"
            java.lang.String r5 = p5488io.grpc.p5525e.C70495fc.m102943d(r14, r5)     // Catch:{ RuntimeException -> 0x0249 }
            boolean r14 = com.google.common.base.C58837ba.m90859h(r15)     // Catch:{ RuntimeException -> 0x0249 }
            if (r14 == 0) goto L_0x0216
            boolean r14 = com.google.common.base.C58837ba.m90859h(r5)     // Catch:{ RuntimeException -> 0x0249 }
            java.lang.String r15 = "missing service name for method %s"
            com.google.common.base.C58838bb.m90873h(r14, r15, r5)     // Catch:{ RuntimeException -> 0x0249 }
            if (r4 != 0) goto L_0x020e
            r4 = 1
            goto L_0x020f
        L_0x020e:
            r4 = 0
        L_0x020f:
            java.lang.String r5 = "Duplicate default method config in service config %s"
            com.google.common.base.C58838bb.m90873h(r4, r5, r2)     // Catch:{ RuntimeException -> 0x0249 }
            r4 = r13
            goto L_0x01e3
        L_0x0216:
            boolean r14 = com.google.common.base.C58837ba.m90859h(r5)     // Catch:{ RuntimeException -> 0x0249 }
            if (r14 == 0) goto L_0x022a
            boolean r5 = r8.containsKey(r15)     // Catch:{ RuntimeException -> 0x0249 }
            r5 = r5 ^ r3
            java.lang.String r14 = "Duplicate service %s"
            com.google.common.base.C58838bb.m90873h(r5, r14, r15)     // Catch:{ RuntimeException -> 0x0249 }
            r8.put(r15, r13)     // Catch:{ RuntimeException -> 0x0249 }
            goto L_0x01e3
        L_0x022a:
            java.lang.String r5 = p5488io.grpc.C70338di.m102602c(r15, r5)     // Catch:{ RuntimeException -> 0x0249 }
            boolean r14 = r7.containsKey(r5)     // Catch:{ RuntimeException -> 0x0249 }
            r14 = r14 ^ r3
            java.lang.String r15 = "Duplicate method name %s"
            com.google.common.base.C58838bb.m90873h(r14, r15, r5)     // Catch:{ RuntimeException -> 0x0249 }
            r7.put(r5, r13)     // Catch:{ RuntimeException -> 0x0249 }
            goto L_0x01e3
        L_0x023c:
            io.grpc.e.hh r0 = new io.grpc.e.hh     // Catch:{ RuntimeException -> 0x0249 }
            r5 = r0
            r6 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x0249 }
        L_0x0243:
            io.grpc.dk r2 = new io.grpc.dk     // Catch:{ RuntimeException -> 0x0249 }
            r2.<init>((java.lang.Object) r0)     // Catch:{ RuntimeException -> 0x0249 }
            return r2
        L_0x0249:
            r0 = move-exception
            io.grpc.Status r2 = p5488io.grpc.Status.f186905c
            java.lang.String r3 = "failed to parse service config"
            io.grpc.Status r2 = r2.withDescription(r3)
            io.grpc.Status r0 = r2.mo61678e(r0)
            io.grpc.dk r2 = new io.grpc.dk
            r2.<init>((p5488io.grpc.Status) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70628ka.mo62054a(java.util.Map):io.grpc.dk");
    }
}
