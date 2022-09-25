package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ex */
/* compiled from: PG */
public final /* synthetic */ class C112416ex implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112435fh f311893a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311894b;

    /* renamed from: c */
    public final /* synthetic */ Map f311895c;

    /* renamed from: d */
    public final /* synthetic */ C80007da f311896d;

    /* renamed from: e */
    public final /* synthetic */ long f311897e;

    public /* synthetic */ C112416ex(C112435fh fhVar, C113405ep epVar, Map map, C80007da daVar, long j) {
        this.f311893a = fhVar;
        this.f311894b = epVar;
        this.f311895c = map;
        this.f311896d = daVar;
        this.f311897e = j;
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r0 = "ModelRequest (%d) and ModelResponse (%d) have different number of suggestions: [%s]"
            java.lang.String r2 = "ModelResponse is null"
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.fh r3 = r1.f311893a
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r4 = r1.f311894b
            java.util.Map r5 = r1.f311895c
            com.google.android.apps.gsa.nga.engine.y.e.a.da r6 = r1.f311896d
            long r7 = r1.f311897e
            r9 = r22
            java.util.List r9 = (java.util.List) r9
            com.google.android.apps.search.assistant.platform.i.e.a.f r10 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112435fh.f311928a
            java.lang.String r11 = "model_eval"
            com.google.android.apps.search.assistant.platform.i.e.a.b.q r10 = r10.mo105243l(r11)
            com.google.android.apps.gsa.nga.engine.y.e.a.i r6 = r3.mo99520c(r9, r4, r6)     // Catch:{ all -> 0x028f }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.h.b r11 = r3.f311932e     // Catch:{ all -> 0x028f }
            r11.mo99591a(r6)     // Catch:{ all -> 0x028f }
            com.google.protobuf.bn r11 = r6.toBuilder()     // Catch:{ all -> 0x028f }
            com.google.android.apps.gsa.nga.engine.y.e.a.e r11 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80008e) r11     // Catch:{ all -> 0x028f }
            r11.copyOnWrite()     // Catch:{ all -> 0x028f }
            com.google.protobuf.bv r12 = r11.instance     // Catch:{ all -> 0x028f }
            com.google.android.apps.gsa.nga.engine.y.e.a.i r12 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i) r12     // Catch:{ all -> 0x028f }
            int r13 = r12.f219561a     // Catch:{ all -> 0x028f }
            r13 = r13 | 1024(0x400, float:1.435E-42)
            r12.f219561a = r13     // Catch:{ all -> 0x028f }
            r13 = 1
            r12.f219568h = r13     // Catch:{ all -> 0x028f }
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ all -> 0x028f }
            com.google.android.apps.gsa.nga.engine.y.e.a.i r11 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i) r11     // Catch:{ all -> 0x028f }
            com.google.android.apps.search.assistant.platform.i.e.a.f r12 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112435fh.f311928a     // Catch:{ all -> 0x028f }
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.ea r14 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.ea     // Catch:{ all -> 0x028f }
            r14.<init>(r3, r11)     // Catch:{ all -> 0x028f }
            java.lang.String r11 = "model_run"
            java.lang.Object r11 = r12.mo105236e(r11, r14)     // Catch:{ all -> 0x028f }
            com.google.android.apps.gsa.nga.engine.y.a.a.m r11 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m) r11     // Catch:{ all -> 0x028f }
            java.lang.String r12 = "CortexScoreAdjuster"
            if (r11 != 0) goto L_0x0084
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112435fh.f311929b     // Catch:{ all -> 0x007e }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x007e }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007e }
            r0.mo56378ag(r4, r12)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x007e }
            r4 = 27612(0x6bdc, float:3.8693E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x007e }
            r0.mo56386p(r2)     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.k r0 = r3.f311935h     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.r r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r.CORTEX_LOG     // Catch:{ all -> 0x007e }
            r0.mo99076a(r4, r2)     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112435fh.m186262j(r5, r9)     // Catch:{ all -> 0x007e }
            com.google.android.apps.search.assistant.platform.i.c.b.d.d r0 = r3.mo99523g()     // Catch:{ all -> 0x007e }
            r10.close()
            return r0
        L_0x007e:
            r0 = move-exception
            r1 = r0
            r18 = r10
            goto L_0x0293
        L_0x0084:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x028f }
            r4.mo100033p()     // Catch:{ all -> 0x028f }
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.k r2 = r3.f311935h     // Catch:{ all -> 0x028f }
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.r r14 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r.CORTEX_LOG     // Catch:{ all -> 0x028f }
            java.lang.String r15 = "Prefix: [%s]"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x028f }
            java.lang.String r4 = r4.mo100033p()     // Catch:{ all -> 0x028f }
            r16 = 0
            r1[r16] = r4     // Catch:{ all -> 0x028f }
            java.lang.String r1 = java.lang.String.format(r15, r1)     // Catch:{ all -> 0x028f }
            r2.mo99076a(r14, r1)     // Catch:{ all -> 0x028f }
            com.google.protobuf.cq r1 = r6.f219563c     // Catch:{ all -> 0x028f }
            int r1 = r1.size()     // Catch:{ all -> 0x028f }
            com.google.protobuf.cq r2 = r11.f218978b     // Catch:{ all -> 0x028f }
            int r2 = r2.size()     // Catch:{ all -> 0x028f }
            r4 = 2
            if (r1 == r2) goto L_0x0112
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112435fh.f311929b     // Catch:{ all -> 0x007e }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x007e }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x007e }
            r1.mo56378ag(r2, r12)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x007e }
            r2 = 27611(0x6bdb, float:3.8691E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x007e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x007e }
            com.google.protobuf.cq r2 = r6.f219563c     // Catch:{ all -> 0x007e }
            int r2 = r2.size()     // Catch:{ all -> 0x007e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007e }
            com.google.protobuf.cq r7 = r11.f218978b     // Catch:{ all -> 0x007e }
            int r7 = r7.size()     // Catch:{ all -> 0x007e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r11.f218979c     // Catch:{ all -> 0x007e }
            r1.mo56359L(r0, r2, r7, r8)     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.k r1 = r3.f311935h     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.r r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r.CORTEX_LOG     // Catch:{ all -> 0x007e }
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007e }
            com.google.protobuf.cq r6 = r6.f219563c     // Catch:{ all -> 0x007e }
            int r6 = r6.size()     // Catch:{ all -> 0x007e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007e }
            r7[r16] = r6     // Catch:{ all -> 0x007e }
            com.google.protobuf.cq r6 = r11.f218978b     // Catch:{ all -> 0x007e }
            int r6 = r6.size()     // Catch:{ all -> 0x007e }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007e }
            r7[r13] = r6     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r11.f218979c     // Catch:{ all -> 0x007e }
            r7[r4] = r6     // Catch:{ all -> 0x007e }
            java.lang.String r0 = java.lang.String.format(r0, r7)     // Catch:{ all -> 0x007e }
            r1.mo99076a(r2, r0)     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112435fh.m186262j(r5, r9)     // Catch:{ all -> 0x007e }
            com.google.android.apps.search.assistant.platform.i.c.b.d.d r0 = r3.mo99523g()     // Catch:{ all -> 0x007e }
            r10.close()
            return r0
        L_0x0112:
            com.google.android.apps.gsa.search.core.i.t r0 = r3.f311930c     // Catch:{ all -> 0x028f }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249371cK     // Catch:{ all -> 0x028f }
            boolean r0 = r0.mo79746e(r1)     // Catch:{ all -> 0x028f }
            if (r0 == 0) goto L_0x0182
            com.google.protobuf.bn r0 = r11.toBuilder()     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.nga.engine.y.a.a.h r0 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79886h) r0     // Catch:{ all -> 0x007e }
            r1 = 0
        L_0x0123:
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.nga.engine.y.a.a.m r2 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m) r2     // Catch:{ all -> 0x007e }
            com.google.protobuf.cq r2 = r2.f218978b     // Catch:{ all -> 0x007e }
            int r2 = r2.size()     // Catch:{ all -> 0x007e }
            if (r1 >= r2) goto L_0x017b
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.nga.engine.y.a.a.m r2 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m) r2     // Catch:{ all -> 0x007e }
            com.google.protobuf.cq r2 = r2.f218978b     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.nga.engine.y.a.a.l r2 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l) r2     // Catch:{ all -> 0x007e }
            com.google.protobuf.bn r2 = r2.toBuilder()     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.nga.engine.y.a.a.k r2 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79889k) r2     // Catch:{ all -> 0x007e }
            java.util.Random r11 = r3.f311941n     // Catch:{ all -> 0x007e }
            float r11 = r11.nextFloat()     // Catch:{ all -> 0x007e }
            r2.copyOnWrite()     // Catch:{ all -> 0x007e }
            com.google.protobuf.bv r12 = r2.instance     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.nga.engine.y.a.a.l r12 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l) r12     // Catch:{ all -> 0x007e }
            int r14 = r12.f218970a     // Catch:{ all -> 0x007e }
            r14 = r14 | r4
            r12.f218970a = r14     // Catch:{ all -> 0x007e }
            r12.f218972c = r11     // Catch:{ all -> 0x007e }
            r0.copyOnWrite()     // Catch:{ all -> 0x007e }
            com.google.protobuf.bv r11 = r0.instance     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.nga.engine.y.a.a.m r11 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m) r11     // Catch:{ all -> 0x007e }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x007e }
            com.google.android.apps.gsa.nga.engine.y.a.a.l r2 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l) r2     // Catch:{ all -> 0x007e }
            r2.getClass()     // Catch:{ all -> 0x007e }
            com.google.protobuf.cq r12 = r11.f218978b     // Catch:{ all -> 0x007e }
            boolean r14 = r12.mo58948c()     // Catch:{ all -> 0x007e }
            if (r14 != 0) goto L_0x0173
            com.google.protobuf.cq r12 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r12)     // Catch:{ all -> 0x007e }
            r11.f218978b = r12     // Catch:{ all -> 0x007e }
        L_0x0173:
            com.google.protobuf.cq r11 = r11.f218978b     // Catch:{ all -> 0x007e }
            r11.set(r1, r2)     // Catch:{ all -> 0x007e }
            int r1 = r1 + 1
            goto L_0x0123
        L_0x017b:
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x007e }
            r11 = r0
            com.google.android.apps.gsa.nga.engine.y.a.a.m r11 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m) r11     // Catch:{ all -> 0x007e }
        L_0x0182:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x028f }
            r0.<init>(r9)     // Catch:{ all -> 0x028f }
            com.google.android.apps.search.assistant.platform.i.e.a.f r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112435fh.f311928a     // Catch:{ all -> 0x028f }
            java.lang.String r2 = "update_score"
            com.google.android.apps.search.assistant.platform.i.e.a.b.q r1 = r1.mo105243l(r2)     // Catch:{ all -> 0x028f }
            r2 = 0
            r12 = 0
        L_0x0191:
            com.google.protobuf.cq r14 = r6.f219563c     // Catch:{ all -> 0x0281 }
            int r14 = r14.size()     // Catch:{ all -> 0x0281 }
            if (r2 >= r14) goto L_0x0215
            boolean r14 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0281 }
            if (r14 == 0) goto L_0x01b0
            com.google.android.apps.search.assistant.platform.i.c.b.d.d r0 = r3.mo99523g()     // Catch:{ all -> 0x01aa }
            r1.close()     // Catch:{ all -> 0x007e }
            r10.close()
            return r0
        L_0x01aa:
            r0 = move-exception
            r2 = r0
            r18 = r10
            goto L_0x0285
        L_0x01b0:
            com.google.protobuf.cq r14 = r11.f218978b     // Catch:{ all -> 0x0281 }
            java.lang.Object r14 = r14.get(r2)     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.nga.engine.y.a.a.l r14 = (com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l) r14     // Catch:{ all -> 0x0281 }
            float r14 = r14.f218972c     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.k r15 = r3.f311935h     // Catch:{ all -> 0x0281 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.r r13 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r.CORTEX_LOG     // Catch:{ all -> 0x0281 }
            r17 = r11
            java.lang.String r11 = "Suggestion: [%s] score: %s"
            r18 = r10
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0213 }
            java.lang.Object r19 = r9.get(r2)     // Catch:{ all -> 0x0213 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r19 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez) r19     // Catch:{ all -> 0x0213 }
            java.lang.String r19 = r19.mo100199L()     // Catch:{ all -> 0x0213 }
            r10[r16] = r19     // Catch:{ all -> 0x0213 }
            java.lang.Float r19 = java.lang.Float.valueOf(r14)     // Catch:{ all -> 0x0213 }
            r20 = 1
            r10[r20] = r19     // Catch:{ all -> 0x0213 }
            java.lang.String r10 = java.lang.String.format(r11, r10)     // Catch:{ all -> 0x0213 }
            r15.mo99076a(r13, r10)     // Catch:{ all -> 0x0213 }
            java.lang.Object r10 = r9.get(r2)     // Catch:{ all -> 0x0213 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez) r10     // Catch:{ all -> 0x0213 }
            double r10 = r10.mo100201a()     // Catch:{ all -> 0x0213 }
            double r13 = (double) r14     // Catch:{ all -> 0x0213 }
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x01f2
            int r12 = r12 + 1
        L_0x01f2:
            java.lang.Object r10 = r9.get(r2)     // Catch:{ all -> 0x0213 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r10 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez) r10     // Catch:{ all -> 0x0213 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r10 = r3.mo99423k(r10, r13)     // Catch:{ all -> 0x0213 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ey r10 = r10.mo100208h()     // Catch:{ all -> 0x0213 }
            r10.mo100170o(r2)     // Catch:{ all -> 0x0213 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r10 = r10.mo100156a()     // Catch:{ all -> 0x0213 }
            r0.set(r2, r10)     // Catch:{ all -> 0x0213 }
            int r2 = r2 + 1
            r11 = r17
            r10 = r18
            r13 = 1
            goto L_0x0191
        L_0x0213:
            r0 = move-exception
            goto L_0x0284
        L_0x0215:
            r18 = r10
            r1.close()     // Catch:{ all -> 0x027f }
            com.google.android.apps.search.assistant.platform.i.e.a.f r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112435fh.f311928a     // Catch:{ all -> 0x027f }
            java.lang.String r2 = "update_groups"
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.eb r4 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.eb     // Catch:{ all -> 0x027f }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x027f }
            r1.mo105241j(r2, r4)     // Catch:{ all -> 0x027f }
            com.google.android.apps.search.assistant.platform.i.e.a.f r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112435fh.f311928a     // Catch:{ all -> 0x027f }
            java.lang.String r1 = "buildResult"
            com.google.android.apps.search.assistant.platform.i.e.a.b.q r1 = r0.mo105243l(r1)     // Catch:{ all -> 0x027f }
            com.google.android.apps.search.assistant.platform.i.c.b.d.c r0 = com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d.m200684a()     // Catch:{ all -> 0x0273 }
            com.google.common.o.a.bt r2 = com.google.common.p4552o.p4553a.C59496bt.f157860g     // Catch:{ all -> 0x0273 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0273 }
            com.google.common.o.a.br r2 = (com.google.common.p4552o.p4553a.C59494br) r2     // Catch:{ all -> 0x0273 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0273 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x0273 }
            com.google.common.o.a.bt r4 = (com.google.common.p4552o.p4553a.C59496bt) r4     // Catch:{ all -> 0x0273 }
            int r5 = r4.f157862a     // Catch:{ all -> 0x0273 }
            r9 = 1
            r5 = r5 | r9
            r4.f157862a = r5     // Catch:{ all -> 0x0273 }
            r4.f157863b = r12     // Catch:{ all -> 0x0273 }
            com.google.android.libraries.f.a r4 = r3.f311933f     // Catch:{ all -> 0x0273 }
            long r4 = r4.mo26870b()     // Catch:{ all -> 0x0273 }
            long r4 = r4 - r7
            r2.copyOnWrite()     // Catch:{ all -> 0x0273 }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x0273 }
            com.google.common.o.a.bt r7 = (com.google.common.p4552o.p4553a.C59496bt) r7     // Catch:{ all -> 0x0273 }
            int r8 = r7.f157862a     // Catch:{ all -> 0x0273 }
            r8 = r8 | 8
            r7.f157862a = r8     // Catch:{ all -> 0x0273 }
            r7.f157867f = r4     // Catch:{ all -> 0x0273 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x0273 }
            com.google.common.o.a.bt r2 = (com.google.common.p4552o.p4553a.C59496bt) r2     // Catch:{ all -> 0x0273 }
            r0.mo105147b(r2)     // Catch:{ all -> 0x0273 }
            com.google.android.apps.search.assistant.platform.i.c.b.d.d r0 = r3.mo99522f(r0, r6)     // Catch:{ all -> 0x0273 }
            r1.close()     // Catch:{ all -> 0x027f }
            r18.close()
            return r0
        L_0x0273:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch:{ all -> 0x0279 }
            goto L_0x027e
        L_0x0279:
            r0 = move-exception
            r1 = r0
            com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112294dz.m186129a(r2, r1)     // Catch:{ all -> 0x027f }
        L_0x027e:
            throw r2     // Catch:{ all -> 0x027f }
        L_0x027f:
            r0 = move-exception
            goto L_0x0292
        L_0x0281:
            r0 = move-exception
            r18 = r10
        L_0x0284:
            r2 = r0
        L_0x0285:
            r1.close()     // Catch:{ all -> 0x0289 }
            goto L_0x028e
        L_0x0289:
            r0 = move-exception
            r1 = r0
            com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112294dz.m186129a(r2, r1)     // Catch:{ all -> 0x027f }
        L_0x028e:
            throw r2     // Catch:{ all -> 0x027f }
        L_0x028f:
            r0 = move-exception
            r18 = r10
        L_0x0292:
            r1 = r0
        L_0x0293:
            r18.close()     // Catch:{ all -> 0x0297 }
            goto L_0x029c
        L_0x0297:
            r0 = move-exception
            r2 = r0
            com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112294dz.m186129a(r1, r2)
        L_0x029c:
            goto L_0x029e
        L_0x029d:
            throw r1
        L_0x029e:
            goto L_0x029d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.C112416ex.mo17879a(java.lang.Object):java.lang.Object");
    }
}
