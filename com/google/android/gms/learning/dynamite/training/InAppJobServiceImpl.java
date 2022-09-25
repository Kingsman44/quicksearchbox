package com.google.android.gms.learning.dynamite.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.common.util.C144005e;
import com.google.android.gms.learning.dynamite.C144655s;
import com.google.android.gms.learning.internal.training.C144804h;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import com.google.common.util.concurrent.C60895di;
import com.google.p3728as.p3729a.p3730a.p3731a.C48021b;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
public class InAppJobServiceImpl extends C144804h {

    /* renamed from: a */
    private C144704bt f391373a;

    public boolean init(C144165j jVar, C144165j jVar2) {
        C144655s.m235152a();
        this.f391373a = new C144704bt(new C144666ai((JobService) C144166k.m234388a(jVar)), C60895di.m92995a((ExecutorService) C144166k.m234388a(jVar2)));
        return true;
    }

    public void onDestroy() {
        C144704bt btVar = this.f391373a;
        try {
            btVar.f391499h.mo120056h(1198);
            synchronized (C144704bt.f391493b) {
                C144703bs bsVar = btVar.f391494c;
                if (bsVar != null) {
                    btVar.mo120169d(bsVar, (C48021b) null, 1, true);
                }
            }
            btVar.f391496e.close();
            btVar.f391496e = null;
        } catch (RuntimeException e) {
            btVar.f391499h.mo120056h(1197);
            C144005e.m234184a(btVar.f391501j.f391420a.getApplicationContext(), e);
            throw e;
        }
    }

    public void onRebind(Intent intent) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r5.f80436e.isEmpty() != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r17) {
        /*
            r16 = this;
            java.lang.String r0 = "Unsupported SchedulingReason: "
            r1 = r16
            com.google.android.gms.learning.dynamite.training.bt r2 = r1.f391373a
            int r4 = r17.getJobId()
            com.google.android.gms.learning.dynamite.training.ai r3 = r2.f391501j
            android.app.job.JobService r3 = r3.f391420a
            android.content.Context r9 = r3.getApplicationContext()
            com.google.android.gms.learning.n r3 = r2.f391499h     // Catch:{ all -> 0x0232 }
            r5 = 1196(0x4ac, float:1.676E-42)
            r3.mo120056h(r5)     // Catch:{ all -> 0x0232 }
            com.google.android.gms.learning.d.ad r3 = r2.f391498g     // Catch:{ all -> 0x0232 }
            com.google.common.util.concurrent.cx r3 = r3.mo120071l(r4)     // Catch:{ all -> 0x0232 }
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92910s(r3)     // Catch:{ all -> 0x0232 }
            com.google.android.libraries.micore.learning.a.p r3 = (com.google.android.libraries.micore.learning.p2258a.C29706p) r3     // Catch:{ all -> 0x0232 }
            r10 = 0
            if (r3 != 0) goto L_0x002a
            goto L_0x022e
        L_0x002a:
            int r5 = r3.f80450a     // Catch:{ all -> 0x0232 }
            r6 = 13
            if (r5 != r6) goto L_0x0058
            java.lang.Object r5 = r3.f80451b     // Catch:{ all -> 0x0232 }
            com.google.android.libraries.micore.learning.a.g r5 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r5     // Catch:{ all -> 0x0232 }
            java.lang.String r5 = r5.f80433b     // Catch:{ all -> 0x0232 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r5 == 0) goto L_0x004f
            int r5 = r3.f80450a     // Catch:{ all -> 0x0232 }
            if (r5 != r6) goto L_0x0045
            java.lang.Object r5 = r3.f80451b     // Catch:{ all -> 0x0232 }
            com.google.android.libraries.micore.learning.a.g r5 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r5     // Catch:{ all -> 0x0232 }
            goto L_0x0047
        L_0x0045:
            com.google.android.libraries.micore.learning.a.g r5 = com.google.android.libraries.micore.learning.p2258a.C29697g.f80430f     // Catch:{ all -> 0x0232 }
        L_0x0047:
            java.lang.String r5 = r5.f80436e     // Catch:{ all -> 0x0232 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r5 == 0) goto L_0x0058
        L_0x004f:
            com.google.android.gms.learning.n r0 = r2.f391499h     // Catch:{ all -> 0x0232 }
            r3 = 1122(0x462, float:1.572E-42)
            r0.mo120056h(r3)     // Catch:{ all -> 0x0232 }
            goto L_0x022e
        L_0x0058:
            com.google.android.gms.learning.b r5 = r2.f391497f     // Catch:{ all -> 0x0232 }
            boolean r5 = r5.mo119977aK()     // Catch:{ all -> 0x0232 }
            r6 = 4
            r7 = 1
            if (r5 == 0) goto L_0x01a3
            com.google.common.o.b.a.af r5 = com.google.common.p4552o.p4554b.p4555a.C59610af.f159830g     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.v r5 = (com.google.common.p4552o.p4554b.p4555a.C59642v) r5     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = r3.f80453d     // Catch:{ all -> 0x0232 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r11 = r5.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.af r11 = (com.google.common.p4552o.p4554b.p4555a.C59610af) r11     // Catch:{ all -> 0x0232 }
            r8.getClass()     // Catch:{ all -> 0x0232 }
            int r12 = r11.f159832a     // Catch:{ all -> 0x0232 }
            r12 = r12 | 32
            r11.f159832a = r12     // Catch:{ all -> 0x0232 }
            r11.f159837f = r8     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.ab r8 = com.google.common.p4552o.p4554b.p4555a.C59606ab.f159820f     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.aa r8 = (com.google.common.p4552o.p4554b.p4555a.C59605aa) r8     // Catch:{ all -> 0x0232 }
            com.google.android.libraries.micore.learning.base.h r11 = r2.f391500i     // Catch:{ all -> 0x0232 }
            long r11 = r11.mo34859a()     // Catch:{ all -> 0x0232 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r13
            r8.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r13 = r8.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.ab r13 = (com.google.common.p4552o.p4554b.p4555a.C59606ab) r13     // Catch:{ all -> 0x0232 }
            int r14 = r13.f159822a     // Catch:{ all -> 0x0232 }
            r14 = r14 | r6
            r13.f159822a = r14     // Catch:{ all -> 0x0232 }
            r13.f159825d = r11     // Catch:{ all -> 0x0232 }
            com.google.protobuf.fg r11 = r3.f80459j     // Catch:{ all -> 0x0232 }
            if (r11 != 0) goto L_0x00a3
            com.google.protobuf.fg r11 = com.google.protobuf.C63042fg.f170152c     // Catch:{ all -> 0x0232 }
        L_0x00a3:
            long r11 = r11.f170154a     // Catch:{ all -> 0x0232 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r13 = r8.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.ab r13 = (com.google.common.p4552o.p4554b.p4555a.C59606ab) r13     // Catch:{ all -> 0x0232 }
            int r14 = r13.f159822a     // Catch:{ all -> 0x0232 }
            r15 = 2
            r14 = r14 | r15
            r13.f159822a = r14     // Catch:{ all -> 0x0232 }
            r13.f159824c = r11     // Catch:{ all -> 0x0232 }
            com.google.protobuf.fg r11 = r3.f80458i     // Catch:{ all -> 0x0232 }
            if (r11 != 0) goto L_0x00ba
            com.google.protobuf.fg r11 = com.google.protobuf.C63042fg.f170152c     // Catch:{ all -> 0x0232 }
        L_0x00ba:
            long r11 = r11.f170154a     // Catch:{ all -> 0x0232 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r13 = r8.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.ab r13 = (com.google.common.p4552o.p4554b.p4555a.C59606ab) r13     // Catch:{ all -> 0x0232 }
            int r14 = r13.f159822a     // Catch:{ all -> 0x0232 }
            r14 = r14 | r7
            r13.f159822a = r14     // Catch:{ all -> 0x0232 }
            r13.f159823b = r11     // Catch:{ all -> 0x0232 }
            int r11 = r3.f80462m     // Catch:{ all -> 0x0232 }
            int r11 = com.google.android.libraries.micore.learning.p2258a.C29705o.m54789b(r11)     // Catch:{ all -> 0x0232 }
            if (r11 != 0) goto L_0x00d3
            r11 = 1
        L_0x00d3:
            com.google.android.libraries.micore.learning.training.util.e r12 = com.google.android.libraries.micore.learning.training.util.C29760e.BATTERY_NOT_OK     // Catch:{ all -> 0x0232 }
            int r12 = r11 + -2
            r13 = 3
            if (r12 == 0) goto L_0x0103
            if (r12 == r7) goto L_0x0101
            if (r12 == r15) goto L_0x00ff
            if (r12 == r13) goto L_0x00fd
            r14 = 5
            if (r12 == r6) goto L_0x0104
            if (r12 != r14) goto L_0x00e7
            r14 = 6
            goto L_0x0104
        L_0x00e7:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0232 }
            int r4 = com.google.android.libraries.micore.learning.p2258a.C29705o.m54788a(r11)     // Catch:{ all -> 0x0232 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0232 }
            r5.<init>(r0)     // Catch:{ all -> 0x0232 }
            r5.append(r4)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0232 }
            r3.<init>(r0)     // Catch:{ all -> 0x0232 }
            throw r3     // Catch:{ all -> 0x0232 }
        L_0x00fd:
            r14 = 4
            goto L_0x0104
        L_0x00ff:
            r14 = 3
            goto L_0x0104
        L_0x0101:
            r14 = 2
            goto L_0x0104
        L_0x0103:
            r14 = 1
        L_0x0104:
            r8.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r0 = r8.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.ab r0 = (com.google.common.p4552o.p4554b.p4555a.C59606ab) r0     // Catch:{ all -> 0x0232 }
            int r14 = r14 + -1
            r0.f159826e = r14     // Catch:{ all -> 0x0232 }
            int r11 = r0.f159822a     // Catch:{ all -> 0x0232 }
            r11 = r11 | 16
            r0.f159822a = r11     // Catch:{ all -> 0x0232 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r0 = r5.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.af r0 = (com.google.common.p4552o.p4554b.p4555a.C59610af) r0     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.ab r8 = (com.google.common.p4552o.p4554b.p4555a.C59606ab) r8     // Catch:{ all -> 0x0232 }
            r8.getClass()     // Catch:{ all -> 0x0232 }
            r0.f159836e = r8     // Catch:{ all -> 0x0232 }
            r0.f159835d = r13     // Catch:{ all -> 0x0232 }
            int r0 = r3.f80450a     // Catch:{ all -> 0x0232 }
            if (r0 != r6) goto L_0x0168
            com.google.common.o.b.a.z r0 = com.google.common.p4552o.p4554b.p4555a.C59646z.f159917c     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.y r0 = (com.google.common.p4552o.p4554b.p4555a.C59645y) r0     // Catch:{ all -> 0x0232 }
            int r8 = r3.f80450a     // Catch:{ all -> 0x0232 }
            if (r8 != r6) goto L_0x013e
            java.lang.Object r8 = r3.f80451b     // Catch:{ all -> 0x0232 }
            com.google.android.libraries.micore.learning.a.e r8 = (com.google.android.libraries.micore.learning.p2258a.C29695e) r8     // Catch:{ all -> 0x0232 }
            goto L_0x0140
        L_0x013e:
            com.google.android.libraries.micore.learning.a.e r8 = com.google.android.libraries.micore.learning.p2258a.C29695e.f80425d     // Catch:{ all -> 0x0232 }
        L_0x0140:
            java.lang.String r8 = r8.f80427a     // Catch:{ all -> 0x0232 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r11 = r0.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.z r11 = (com.google.common.p4552o.p4554b.p4555a.C59646z) r11     // Catch:{ all -> 0x0232 }
            r8.getClass()     // Catch:{ all -> 0x0232 }
            int r12 = r11.f159919a     // Catch:{ all -> 0x0232 }
            r12 = r12 | r7
            r11.f159919a = r12     // Catch:{ all -> 0x0232 }
            r11.f159920b = r8     // Catch:{ all -> 0x0232 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.af r8 = (com.google.common.p4552o.p4554b.p4555a.C59610af) r8     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.z r0 = (com.google.common.p4552o.p4554b.p4555a.C59646z) r0     // Catch:{ all -> 0x0232 }
            r0.getClass()     // Catch:{ all -> 0x0232 }
            r8.f159834c = r0     // Catch:{ all -> 0x0232 }
            r8.f159833b = r7     // Catch:{ all -> 0x0232 }
            goto L_0x0178
        L_0x0168:
            com.google.common.o.b.a.ad r0 = com.google.common.p4552o.p4554b.p4555a.C59608ad.f159827a     // Catch:{ all -> 0x0232 }
            r5.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.af r8 = (com.google.common.p4552o.p4554b.p4555a.C59610af) r8     // Catch:{ all -> 0x0232 }
            r0.getClass()     // Catch:{ all -> 0x0232 }
            r8.f159834c = r0     // Catch:{ all -> 0x0232 }
            r8.f159833b = r15     // Catch:{ all -> 0x0232 }
        L_0x0178:
            com.google.android.gms.learning.n r0 = r2.f391499h     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.h r8 = com.google.common.p4552o.p4554b.p4555a.C59628h.f159873h     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.g r8 = (com.google.common.p4552o.p4554b.p4555a.C59627g) r8     // Catch:{ all -> 0x0232 }
            r8.copyOnWrite()     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r11 = r8.instance     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.h r11 = (com.google.common.p4552o.p4554b.p4555a.C59628h) r11     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.af r5 = (com.google.common.p4552o.p4554b.p4555a.C59610af) r5     // Catch:{ all -> 0x0232 }
            r5.getClass()     // Catch:{ all -> 0x0232 }
            r11.f159881g = r5     // Catch:{ all -> 0x0232 }
            int r5 = r11.f159875a     // Catch:{ all -> 0x0232 }
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r11.f159875a = r5     // Catch:{ all -> 0x0232 }
            com.google.protobuf.bv r5 = r8.build()     // Catch:{ all -> 0x0232 }
            com.google.common.o.b.a.h r5 = (com.google.common.p4552o.p4554b.p4555a.C59628h) r5     // Catch:{ all -> 0x0232 }
            r0.mo120050c(r5)     // Catch:{ all -> 0x0232 }
        L_0x01a3:
            java.lang.String r5 = r3.f80453d     // Catch:{ all -> 0x0232 }
            com.google.android.gms.learning.dynamite.training.bv r0 = com.google.android.gms.learning.dynamite.training.C144704bt.m235207a(r3)     // Catch:{ all -> 0x0232 }
            int r8 = r3.f80450a     // Catch:{ all -> 0x0232 }
            if (r8 != r6) goto L_0x01af
            r6 = 1
            goto L_0x01b0
        L_0x01af:
            r6 = 0
        L_0x01b0:
            java.lang.String r8 = r9.getPackageName()     // Catch:{ all -> 0x0232 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0232 }
            r11.<init>()     // Catch:{ all -> 0x0232 }
            r11.append(r8)     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = "/"
            r11.append(r8)     // Catch:{ all -> 0x0232 }
            r11.append(r5)     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x0232 }
            if (r6 == 0) goto L_0x01d1
            com.google.android.libraries.micore.learning.a.e r11 = r0.mo120139a()     // Catch:{ all -> 0x0232 }
            java.lang.String r11 = r11.f80427a     // Catch:{ all -> 0x0232 }
            goto L_0x01d3
        L_0x01d1:
            java.lang.String r11 = ""
        L_0x01d3:
            java.lang.String r8 = com.google.android.libraries.micore.learning.training.C29728d.m54829a(r8, r11)     // Catch:{ all -> 0x0232 }
            com.google.android.libraries.micore.learning.a.j r11 = r3.f80461l     // Catch:{ all -> 0x0232 }
            if (r11 != 0) goto L_0x01dd
            com.google.android.libraries.micore.learning.a.j r11 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f     // Catch:{ all -> 0x0232 }
        L_0x01dd:
            boolean r6 = r2.mo120170e(r6, r8, r11)     // Catch:{ all -> 0x0232 }
            if (r6 != 0) goto L_0x01f0
            com.google.android.gms.learning.d.ad r3 = r2.f391498g     // Catch:{ all -> 0x0232 }
            r7 = 0
            r8 = 1
            r6 = r0
            com.google.common.util.concurrent.cx r0 = r3.mo120070k(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0232 }
            com.google.common.util.concurrent.C60856cj.m92910s(r0)     // Catch:{ all -> 0x0232 }
            goto L_0x022e
        L_0x01f0:
            java.lang.Object r11 = com.google.android.gms.learning.dynamite.training.C144704bt.f391493b     // Catch:{ all -> 0x0232 }
            monitor-enter(r11)     // Catch:{ all -> 0x0232 }
            com.google.android.gms.learning.dynamite.training.bs r6 = r2.f391494c     // Catch:{ all -> 0x022f }
            if (r6 == 0) goto L_0x020c
            com.google.android.gms.learning.n r3 = r2.f391499h     // Catch:{ all -> 0x022f }
            r6 = 1176(0x498, float:1.648E-42)
            r3.mo120056h(r6)     // Catch:{ all -> 0x022f }
            com.google.android.gms.learning.d.ad r3 = r2.f391498g     // Catch:{ all -> 0x022f }
            r7 = 0
            r8 = 1
            r6 = r0
            com.google.common.util.concurrent.cx r0 = r3.mo120070k(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x022f }
            com.google.common.util.concurrent.C60856cj.m92910s(r0)     // Catch:{ all -> 0x022f }
            monitor-exit(r11)     // Catch:{ all -> 0x022f }
            goto L_0x022e
        L_0x020c:
            com.google.android.gms.learning.dynamite.training.bs r0 = new com.google.android.gms.learning.dynamite.training.bs     // Catch:{ all -> 0x022f }
            r5 = r17
            r0.<init>(r4, r3, r5)     // Catch:{ all -> 0x022f }
            com.google.common.util.concurrent.da r3 = r2.f391495d     // Catch:{ all -> 0x022f }
            com.google.android.gms.learning.dynamite.training.bo r4 = new com.google.android.gms.learning.dynamite.training.bo     // Catch:{ all -> 0x022f }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x022f }
            com.google.common.util.concurrent.cx r3 = r3.mo19398a(r4)     // Catch:{ all -> 0x022f }
            r0.f391489d = r3     // Catch:{ all -> 0x022f }
            r2.f391494c = r0     // Catch:{ all -> 0x022f }
            com.google.common.util.concurrent.da r0 = r2.f391495d     // Catch:{ all -> 0x022f }
            com.google.android.gms.learning.dynamite.training.bp r4 = new com.google.android.gms.learning.dynamite.training.bp     // Catch:{ all -> 0x022f }
            r4.<init>(r3, r9)     // Catch:{ all -> 0x022f }
            r0.execute(r4)     // Catch:{ all -> 0x022f }
            monitor-exit(r11)     // Catch:{ all -> 0x022f }
            r10 = 1
        L_0x022e:
            return r10
        L_0x022f:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x022f }
            throw r0     // Catch:{ all -> 0x0232 }
        L_0x0232:
            r0 = move-exception
            com.google.android.gms.learning.n r2 = r2.f391499h
            r3 = 1195(0x4ab, float:1.675E-42)
            r2.mo120056h(r3)
            com.google.android.gms.common.util.C144005e.m234184a(r9, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        C144704bt btVar = this.f391373a;
        try {
            btVar.f391499h.mo120056h(1194);
            synchronized (C144704bt.f391493b) {
                if (btVar.f391494c == null) {
                    return false;
                }
                btVar.f391499h.mo120056h(1192);
                btVar.mo120169d(btVar.f391494c, (C48021b) null, 1, true);
                return false;
            }
        } catch (Throwable th) {
            btVar.f391499h.mo120056h(1193);
            C144005e.m234184a(btVar.f391501j.f391420a.getApplicationContext(), th);
            throw th;
        }
    }

    public void onTrimMemory(int i) {
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }
}
