package com.google.android.apps.gsa.sidekick.main.entry;

import android.location.Location;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;
import com.google.android.apps.gsa.sidekick.shared.util.C91953ad;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7746ik;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.az */
/* compiled from: PG */
public final class C91321az extends C91953ad {

    /* renamed from: a */
    public static final C59071e f254865a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.entry.az");

    /* renamed from: b */
    public final TriggerConditionEvaluator f254866b;

    /* renamed from: c */
    public final Set f254867c;

    /* renamed from: d */
    public final Set f254868d;

    /* renamed from: e */
    public final C84160c f254869e;

    /* renamed from: f */
    public boolean f254870f;

    /* renamed from: h */
    private final boolean f254871h;

    /* renamed from: i */
    private final EnumSet f254872i = EnumSet.noneOf(C7746ik.class);

    public C91321az(Location location, long j, TriggerConditionEvaluator.APriori aPriori, boolean z, C84160c cVar) {
        this.f254866b = new TriggerConditionEvaluator(location, j, aPriori);
        this.f254871h = z;
        this.f254867c = new HashSet();
        this.f254868d = new HashSet();
        this.f254869e = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C7726hr mo85622a(C7726hr hrVar) {
        return hrVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C7718hj mo85623c(C7718hj hjVar) {
        return hjVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f6, code lost:
        if (r8.contains(com.google.p375ai.p378b.C8173yf.IN_REGION) == false) goto L_0x01f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01fa  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p375ai.p378b.C7744ii mo85624d(com.google.p375ai.p378b.C7744ii r24) {
        /*
            r23 = this;
            r0 = r23
            com.google.protobuf.bn r1 = r24.toBuilder()
            com.google.ai.b.ht r1 = (com.google.p375ai.p378b.C7728ht) r1
            r3 = 0
        L_0x0009:
            com.google.protobuf.bv r4 = r1.instance
            com.google.ai.b.ii r4 = (com.google.p375ai.p378b.C7744ii) r4
            com.google.protobuf.cq r4 = r4.f27060e
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x0261
            com.google.protobuf.bv r4 = r1.instance
            com.google.ai.b.ii r4 = (com.google.p375ai.p378b.C7744ii) r4
            com.google.protobuf.cq r4 = r4.f27060e
            java.lang.Object r4 = r4.get(r3)
            com.google.ai.b.hv r4 = (com.google.p375ai.p378b.C7730hv) r4
            int r5 = r4.f27021a
            r6 = r5 & 4
            if (r6 == 0) goto L_0x025b
            r5 = r5 & 1
            if (r5 == 0) goto L_0x025b
            com.google.ai.b.kj r5 = r4.f27022b
            if (r5 != 0) goto L_0x0031
            com.google.ai.b.kj r5 = com.google.p375ai.p378b.C7799kj.f27263h
        L_0x0031:
            int r5 = r5.f27266b
            int r5 = com.google.p375ai.p378b.C7798ki.m22853a(r5)
            r6 = 1
            if (r5 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            if (r5 != r6) goto L_0x025b
        L_0x003d:
            com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator r5 = r0.f254866b
            com.google.ai.b.yg r7 = r4.f27024d
            if (r7 != 0) goto L_0x0045
            com.google.ai.b.yg r7 = com.google.p375ai.p378b.C8174yg.f28719i
        L_0x0045:
            com.google.protobuf.ch r8 = r7.f28722b
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x005b
            com.google.protobuf.cj r8 = new com.google.protobuf.cj
            com.google.protobuf.ch r9 = r7.f28722b
            com.google.protobuf.ci r10 = com.google.p375ai.p378b.C8174yg.f28718c
            r8.<init>(r9, r10)
            java.util.EnumSet r8 = java.util.EnumSet.copyOf(r8)
            goto L_0x005f
        L_0x005b:
            java.util.Set r8 = java.util.Collections.emptySet()
        L_0x005f:
            int r9 = r7.f28721a
            r9 = r9 & 2
            if (r9 == 0) goto L_0x0072
            long r9 = r5.f255553c
            long r11 = r7.f28725f
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0072
            r5.mo86004b(r11)
            r9 = 0
            goto L_0x0073
        L_0x0072:
            r9 = 1
        L_0x0073:
            if (r9 == 0) goto L_0x0089
            int r10 = r7.f28721a
            r10 = r10 & 4
            if (r10 == 0) goto L_0x0089
            long r9 = r5.f255553c
            long r11 = r7.f28726g
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0085
            r9 = 0
            goto L_0x0089
        L_0x0085:
            r5.mo86004b(r11)
            r9 = 1
        L_0x0089:
            android.location.Location r10 = r5.f255552b
            if (r10 == 0) goto L_0x01db
            com.google.ai.b.yf r10 = com.google.p375ai.p378b.C8173yf.AT_LOCATION
            boolean r10 = r8.contains(r10)
            com.google.ai.b.yf r12 = com.google.p375ai.p378b.C8173yf.NEARING_LOCATION
            boolean r12 = r8.contains(r12)
            if (r10 != 0) goto L_0x00a2
            if (r12 == 0) goto L_0x009f
            r12 = 1
            goto L_0x00a2
        L_0x009f:
            r6 = 0
            r13 = 0
            goto L_0x00e6
        L_0x00a2:
            com.google.protobuf.cq r10 = r7.f28724e
            java.util.Iterator r10 = r10.iterator()
            r13 = 0
        L_0x00a9:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x00e5
            java.lang.Object r14 = r10.next()
            com.google.ai.b.kp r14 = (com.google.p375ai.p378b.C7805kp) r14
            java.lang.String r15 = com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator.m149891a(r14)
            com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator$APriori r2 = r5.f255554d
            com.google.common.b.gu r2 = r2.f255555a
            int r11 = r2.size()
            r6 = 0
        L_0x00c2:
            if (r6 >= r11) goto L_0x00d7
            int r17 = r6 + 1
            java.lang.Object r6 = r2.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r6.endsWith(r15)
            if (r6 == 0) goto L_0x00d4
            r13 = 1
            goto L_0x00dc
        L_0x00d4:
            r6 = r17
            goto L_0x00c2
        L_0x00d7:
            boolean r2 = r5.mo86005c(r7, r14, r13)
            r13 = r2
        L_0x00dc:
            if (r12 == 0) goto L_0x00e3
            com.google.android.apps.gsa.sidekick.main.trigger.c r2 = r5.f255551a
            r6 = 1
            r2.f255564d = r6
        L_0x00e3:
            r6 = 1
            goto L_0x00a9
        L_0x00e5:
            r6 = 1
        L_0x00e6:
            com.google.ai.b.yf r2 = com.google.p375ai.p378b.C8173yf.IN_REGION
            boolean r2 = r8.contains(r2)
            if (r2 == 0) goto L_0x01a5
            com.google.protobuf.cq r2 = r7.f28723d
            java.util.Iterator r2 = r2.iterator()
        L_0x00f4:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x019e
            java.lang.Object r6 = r2.next()
            com.google.ai.b.fw r6 = (com.google.p375ai.p378b.C7677fw) r6
            com.google.protobuf.cq r6 = r6.f26655a
            java.util.Iterator r6 = r6.iterator()
        L_0x0106:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00f4
            java.lang.Object r8 = r6.next()
            com.google.ai.b.fv r8 = (com.google.p375ai.p378b.C7676fv) r8
            com.google.protobuf.ch r10 = r8.f26651b
            r11 = 0
        L_0x0115:
            int r12 = r11 + 1
            int r14 = r10.size()
            if (r12 >= r14) goto L_0x0106
            com.google.ai.b.kp r14 = com.google.p375ai.p378b.C7805kp.f27284h
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.ai.b.ko r14 = (com.google.p375ai.p378b.C7804ko) r14
            java.lang.Object r15 = r10.get(r11)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r14.copyOnWrite()
            r17 = r2
            com.google.protobuf.bv r2 = r14.instance
            com.google.ai.b.kp r2 = (com.google.p375ai.p378b.C7805kp) r2
            r18 = r6
            int r6 = r2.f27286a
            r16 = 1
            r6 = r6 | 1
            r2.f27286a = r6
            r19 = r3
            r20 = r4
            double r3 = (double) r15
            r21 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r21
            r2.f27287b = r3
            java.lang.Object r2 = r10.get(r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r14.copyOnWrite()
            com.google.protobuf.bv r3 = r14.instance
            com.google.ai.b.kp r3 = (com.google.p375ai.p378b.C7805kp) r3
            int r4 = r3.f27286a
            r4 = r4 | 2
            r3.f27286a = r4
            r4 = r1
            double r1 = (double) r2
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r21
            r3.f27288c = r1
            int r1 = r8.f26650a
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.ai.b.kp r2 = (com.google.p375ai.p378b.C7805kp) r2
            int r3 = r2.f27286a
            r3 = r3 | 16
            r2.f27286a = r3
            r12 = r4
            double r3 = (double) r1
            r2.f27291f = r3
            com.google.protobuf.bv r1 = r14.build()
            com.google.ai.b.kp r1 = (com.google.p375ai.p378b.C7805kp) r1
            r2 = 0
            boolean r13 = r5.mo86005c(r2, r1, r13)
            int r11 = r11 + 2
            r1 = r12
            r2 = r17
            r6 = r18
            r3 = r19
            r4 = r20
            goto L_0x0115
        L_0x019e:
            r12 = r1
            r19 = r3
            r20 = r4
            r6 = 1
            goto L_0x01aa
        L_0x01a5:
            r12 = r1
            r19 = r3
            r20 = r4
        L_0x01aa:
            if (r6 == 0) goto L_0x01f8
            if (r9 == 0) goto L_0x01b2
            if (r13 == 0) goto L_0x01b2
            r9 = 1
            goto L_0x01b3
        L_0x01b2:
            r9 = 0
        L_0x01b3:
            com.google.android.apps.gsa.sidekick.main.trigger.c r1 = r5.f255551a
            java.lang.Float r1 = r1.f255563c
            if (r1 == 0) goto L_0x01f8
            android.location.Location r2 = r5.f255552b
            boolean r2 = r2.hasAccuracy()
            if (r2 == 0) goto L_0x01c8
            android.location.Location r2 = r5.f255552b
            float r2 = r2.getAccuracy()
            goto L_0x01ca
        L_0x01c8:
            r2 = 1120403456(0x42c80000, float:100.0)
        L_0x01ca:
            float r1 = r1.floatValue()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x01f8
            long r1 = r5.f255553c
            r3 = 60
            long r1 = r1 + r3
            r5.mo86004b(r1)
            goto L_0x01f8
        L_0x01db:
            r12 = r1
            r19 = r3
            r20 = r4
            com.google.ai.b.yf r1 = com.google.p375ai.p378b.C8173yf.AT_LOCATION
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L_0x0258
            com.google.ai.b.yf r1 = com.google.p375ai.p378b.C8173yf.NEARING_LOCATION
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L_0x0258
            com.google.ai.b.yf r1 = com.google.p375ai.p378b.C8173yf.IN_REGION
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L_0x0258
        L_0x01f8:
            if (r9 == 0) goto L_0x0258
            com.google.android.apps.gsa.sidekick.main.trigger.c r1 = r5.f255551a
            java.util.List r1 = r1.f255566f
            r1.add(r7)
            boolean r1 = r0.f254871h
            r4 = r20
            if (r1 == 0) goto L_0x0227
            com.google.ai.b.kj r1 = r4.f27022b
            if (r1 != 0) goto L_0x020d
            com.google.ai.b.kj r1 = com.google.p375ai.p378b.C7799kj.f27263h
        L_0x020d:
            com.google.protobuf.ch r2 = r1.f27267c
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0224
            java.util.EnumSet r2 = r0.f254872i
            com.google.protobuf.cj r3 = new com.google.protobuf.cj
            com.google.protobuf.ch r1 = r1.f27267c
            com.google.protobuf.ci r5 = com.google.p375ai.p378b.C7799kj.f27262d
            r3.<init>(r1, r5)
            r2.addAll(r3)
            goto L_0x0227
        L_0x0224:
            r1 = 1
            r0.f254870f = r1
        L_0x0227:
            com.google.protobuf.bn r1 = r4.toBuilder()
            com.google.ai.b.hu r1 = (com.google.p375ai.p378b.C7729hu) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.ai.b.hv r2 = (com.google.p375ai.p378b.C7730hv) r2
            r3 = 0
            r2.f27024d = r3
            int r3 = r2.f27021a
            r3 = r3 & -5
            r2.f27021a = r3
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.ai.b.ii r2 = (com.google.p375ai.p378b.C7744ii) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.ai.b.hv r1 = (com.google.p375ai.p378b.C7730hv) r1
            r1.getClass()
            r2.mo16955a()
            com.google.protobuf.cq r2 = r2.f27060e
            r3 = r19
            r2.set(r3, r1)
            goto L_0x025c
        L_0x0258:
            r3 = r19
            goto L_0x025c
        L_0x025b:
            r12 = r1
        L_0x025c:
            int r3 = r3 + 1
            r1 = r12
            goto L_0x0009
        L_0x0261:
            r12 = r1
            com.google.protobuf.bv r1 = r12.build()
            com.google.ai.b.ii r1 = (com.google.p375ai.p378b.C7744ii) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.entry.C91321az.mo85624d(com.google.ai.b.ii):com.google.ai.b.ii");
    }
}
