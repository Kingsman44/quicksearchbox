package com.google.android.libraries.performance.primes.metrics.p2403a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31310m;
import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71317l;

/* renamed from: com.google.android.libraries.performance.primes.metrics.a.i */
/* compiled from: PG */
final class C31276i extends C31274g implements C31209a.C31210a, C31209a.C31218i, C31209a.C31217h, C31313p {

    /* renamed from: b */
    private static final C59071e f84228b = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.a.i");

    /* renamed from: a */
    final AtomicBoolean f84229a = new AtomicBoolean();

    /* renamed from: c */
    private final Context f84230c;

    /* renamed from: d */
    private final C31220b f84231d;

    /* renamed from: e */
    private final Executor f84232e;

    /* renamed from: f */
    private final C31291x f84233f;

    /* renamed from: g */
    private final C31270c f84234g;

    /* renamed from: h */
    private final C31310m f84235h;

    /* renamed from: i */
    private final AtomicBoolean f84236i;

    /* JADX WARNING: type inference failed for: r11v0, types: [java.util.concurrent.Executor] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31276i(com.google.android.libraries.performance.primes.metrics.p2404b.C31311n r3, android.content.Context r4, com.google.android.libraries.performance.primes.p2398c.C31220b r5, com.google.common.util.concurrent.C60888db r6, dagger.C68214a r7, com.google.android.libraries.performance.primes.metrics.p2403a.C31291x r8, com.google.android.libraries.performance.primes.metrics.p2403a.C31270c r9, p5460g.p5461a.C69464a r10, java.util.concurrent.Executor r11) {
        /*
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f84229a = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.f84236i = r0
            com.google.android.libraries.performance.primes.metrics.b.m r3 = r3.mo37026a(r11, r7, r10)
            r2.f84235h = r3
            r2.f84230c = r4
            r2.f84231d = r5
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r6 = r11
        L_0x0029:
            r2.f84232e = r6
            r2.f84233f = r8
            r2.f84234g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2403a.C31276i.<init>(com.google.android.libraries.performance.primes.metrics.b.n, android.content.Context, com.google.android.libraries.performance.primes.c.b, com.google.common.util.concurrent.db, dagger.a, com.google.android.libraries.performance.primes.metrics.a.x, com.google.android.libraries.performance.primes.metrics.a.c, g.a.a, java.util.concurrent.Executor):void");
    }

    /* renamed from: h */
    private final C60870cx m58287h(C71317l lVar) {
        return C60856cj.m92905n(new C31275h(this, lVar), this.f84232e);
    }

    /* renamed from: b */
    public void mo36938b(Activity activity, Bundle bundle) {
        if (!this.f84236i.getAndSet(true)) {
            mo36945c((Activity) null);
        }
    }

    /* renamed from: c */
    public void mo36945c(Activity activity) {
        if (!this.f84229a.get()) {
            mo36990g();
        }
    }

    /* renamed from: d */
    public void mo36944d(Activity activity) {
        mo36989f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c2, code lost:
        if ((r6 / r8) <= 3.472222222222222E-5d) goto L_0x02c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b A[Catch:{ ct -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e A[Catch:{ ct -> 0x0058 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ com.google.common.util.concurrent.C60870cx mo36988e(p5535j.p5536a.p5562i.p5568b.p5569a.C71317l r18, com.google.android.libraries.performance.primes.C31164au r19) {
        /*
            r17 = this;
            r1 = r17
            com.google.android.libraries.performance.primes.metrics.b.m r0 = r1.f84235h
            r2 = 0
            boolean r0 = r0.mo37024d(r2)
            if (r0 != 0) goto L_0x000e
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            return r0
        L_0x000e:
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()
            com.google.android.libraries.performance.primes.metrics.a.x r3 = r1.f84233f
            monitor-enter(r3)
            com.google.android.libraries.performance.primes.metrics.a.x r0 = r1.f84233f     // Catch:{ all -> 0x04f9 }
            com.google.android.libraries.performance.primes.f.a r0 = r0.f84264a     // Catch:{ all -> 0x04f9 }
            com.google.android.libraries.performance.b.a.a.b r4 = com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b.f83819j     // Catch:{ all -> 0x04f9 }
            com.google.protobuf.eb r4 = r4.getParserForType()     // Catch:{ all -> 0x04f9 }
            java.lang.String r5 = "primes.battery.snapshot"
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()     // Catch:{ all -> 0x04f9 }
            android.content.Context r6 = r0.f84146b     // Catch:{ all -> 0x04f9 }
            boolean r6 = com.google.android.libraries.directboot.C20674d.m38856e(r6)     // Catch:{ all -> 0x04f9 }
            r7 = 0
            if (r6 != 0) goto L_0x002e
            r0 = r2
            goto L_0x0040
        L_0x002e:
            g.a.a r0 = r0.f84147c     // Catch:{ all -> 0x04f9 }
            java.lang.Object r0 = r0.mo17428b()     // Catch:{ all -> 0x04f9 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x04f9 }
            java.lang.String r6 = ""
            java.lang.String r0 = r0.getString(r5, r6)     // Catch:{ all -> 0x04f9 }
            byte[] r0 = android.util.Base64.decode(r0, r7)     // Catch:{ all -> 0x04f9 }
        L_0x0040:
            r5 = 1
            if (r0 == 0) goto L_0x0076
            int r6 = r0.length     // Catch:{ all -> 0x04f9 }
            if (r6 != 0) goto L_0x0047
            goto L_0x0076
        L_0x0047:
            byte r8 = r0[r7]     // Catch:{ all -> 0x04f9 }
            if (r8 != r5) goto L_0x0068
            int r6 = r6 + -1
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0058 }
            java.lang.Object r0 = r4.mo59016o(r0, r5, r6, r8)     // Catch:{ ct -> 0x0058 }
            com.google.protobuf.MessageLite r0 = (com.google.protobuf.MessageLite) r0     // Catch:{ ct -> 0x0058 }
            goto L_0x0077
        L_0x0058:
            r0 = move-exception
            com.google.common.f.e r4 = com.google.android.libraries.performance.primes.p2401f.C31235a.f84145a     // Catch:{ all -> 0x04f9 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x04f9 }
            java.lang.String r6 = "failure reading proto"
            r8 = 50458(0xc51a, float:7.0707E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r8)).mo56386p(r6)     // Catch:{ all -> 0x04f9 }
            goto L_0x0076
        L_0x0068:
            com.google.common.f.e r0 = com.google.android.libraries.performance.primes.p2401f.C31235a.f84145a     // Catch:{ all -> 0x04f9 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x04f9 }
            java.lang.String r4 = "wrong header"
            r6 = 50457(0xc519, float:7.0705E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r4)     // Catch:{ all -> 0x04f9 }
        L_0x0076:
            r0 = r2
        L_0x0077:
            com.google.android.libraries.performance.b.a.a.b r0 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r0     // Catch:{ all -> 0x04f9 }
            if (r0 != 0) goto L_0x007e
            r4 = r2
            goto L_0x00ec
        L_0x007e:
            int r4 = r0.f83821a     // Catch:{ all -> 0x04f9 }
            r4 = r4 & 32
            if (r4 == 0) goto L_0x0090
            int r4 = r0.f83827g     // Catch:{ all -> 0x04f9 }
            j.a.i.b.a.l r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71317l.m103956a(r4)     // Catch:{ all -> 0x04f9 }
            if (r4 != 0) goto L_0x008e
            j.a.i.b.a.l r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71317l.UNKNOWN     // Catch:{ all -> 0x04f9 }
        L_0x008e:
            r14 = r4
            goto L_0x0091
        L_0x0090:
            r14 = r2
        L_0x0091:
            com.google.android.libraries.performance.primes.metrics.a.w r4 = new com.google.android.libraries.performance.primes.metrics.a.w     // Catch:{ all -> 0x04f9 }
            j.a.i.b.a.ae r6 = r0.f83822b     // Catch:{ all -> 0x04f9 }
            if (r6 != 0) goto L_0x0099
            j.a.i.b.a.ae r6 = p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae.f189959an     // Catch:{ all -> 0x04f9 }
        L_0x0099:
            r9 = r6
            int r6 = r0.f83821a     // Catch:{ all -> 0x04f9 }
            r8 = r6 & 2
            if (r8 == 0) goto L_0x00a8
            long r10 = r0.f83823c     // Catch:{ all -> 0x04f9 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x04f9 }
            r10 = r8
            goto L_0x00a9
        L_0x00a8:
            r10 = r2
        L_0x00a9:
            r8 = r6 & 4
            if (r8 == 0) goto L_0x00b5
            long r11 = r0.f83824d     // Catch:{ all -> 0x04f9 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x04f9 }
            r11 = r8
            goto L_0x00b6
        L_0x00b5:
            r11 = r2
        L_0x00b6:
            r8 = r6 & 8
            if (r8 == 0) goto L_0x00c2
            long r12 = r0.f83825e     // Catch:{ all -> 0x04f9 }
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04f9 }
            r12 = r8
            goto L_0x00c3
        L_0x00c2:
            r12 = r2
        L_0x00c3:
            r8 = r6 & 16
            if (r8 == 0) goto L_0x00cf
            long r7 = r0.f83826f     // Catch:{ all -> 0x04f9 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04f9 }
            r13 = r7
            goto L_0x00d0
        L_0x00cf:
            r13 = r2
        L_0x00d0:
            r7 = r6 & 64
            if (r7 == 0) goto L_0x00d8
            java.lang.String r7 = r0.f83828h     // Catch:{ all -> 0x04f9 }
            r15 = r7
            goto L_0x00d9
        L_0x00d8:
            r15 = r2
        L_0x00d9:
            r6 = r6 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x00e6
            j.a.i.b.a.aq r0 = r0.f83829i     // Catch:{ all -> 0x04f9 }
            if (r0 != 0) goto L_0x00e3
            j.a.i.b.a.aq r0 = p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq.f190077a     // Catch:{ all -> 0x04f9 }
        L_0x00e3:
            r16 = r0
            goto L_0x00e8
        L_0x00e6:
            r16 = r2
        L_0x00e8:
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x04f9 }
        L_0x00ec:
            monitor-exit(r3)     // Catch:{ all -> 0x04f9 }
            com.google.android.libraries.performance.primes.metrics.a.c r0 = r1.f84234g
            com.google.android.libraries.f.a r3 = r0.f84218b
            long r6 = r3.mo26871c()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            com.google.android.libraries.f.a r6 = r0.f84218b
            long r6 = r6.mo26870b()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            com.google.android.libraries.performance.primes.metrics.a.z r7 = r0.f84217a
            android.content.Context r7 = r7.f84266a
            java.lang.String r8 = "systemhealth"
            java.lang.Object r7 = r7.getSystemService(r8)
            android.os.health.SystemHealthManager r7 = (android.os.health.SystemHealthManager) r7
            if (r7 == 0) goto L_0x0116
            android.os.health.HealthStats r7 = r7.takeMyUidSnapshot()
            goto L_0x0117
        L_0x0116:
            r7 = r2
        L_0x0117:
            g.a.a r8 = r0.f84220d
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.libraries.performance.primes.metrics.a.f r8 = (com.google.android.libraries.performance.primes.metrics.p2403a.C31273f) r8
            r8.mo36982d()
            r8 = r18
            com.google.android.libraries.performance.primes.metrics.a.w r0 = com.google.android.libraries.performance.primes.metrics.p2403a.C31269b.m58279a(r3, r6, r7, r8, r0)
            com.google.android.libraries.performance.primes.metrics.a.x r6 = r1.f84233f
            monitor-enter(r6)
            com.google.android.libraries.performance.primes.metrics.a.x r3 = r1.f84233f     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r7 = com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b.f83819j     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.a r7 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31122a) r7     // Catch:{ all -> 0x04f6 }
            j.a.i.b.a.ae r8 = r0.f84256a     // Catch:{ all -> 0x04f6 }
            if (r8 == 0) goto L_0x0147
            r7.copyOnWrite()     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r9 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r9     // Catch:{ all -> 0x04f6 }
            r9.f83822b = r8     // Catch:{ all -> 0x04f6 }
            int r8 = r9.f83821a     // Catch:{ all -> 0x04f6 }
            r8 = r8 | r5
            r9.f83821a = r8     // Catch:{ all -> 0x04f6 }
        L_0x0147:
            java.lang.Long r8 = r0.f84257b     // Catch:{ all -> 0x04f6 }
            if (r8 == 0) goto L_0x015e
            long r8 = r8.longValue()     // Catch:{ all -> 0x04f6 }
            r7.copyOnWrite()     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r10 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r10     // Catch:{ all -> 0x04f6 }
            int r11 = r10.f83821a     // Catch:{ all -> 0x04f6 }
            r11 = r11 | 2
            r10.f83821a = r11     // Catch:{ all -> 0x04f6 }
            r10.f83823c = r8     // Catch:{ all -> 0x04f6 }
        L_0x015e:
            java.lang.Long r8 = r0.f84258c     // Catch:{ all -> 0x04f6 }
            if (r8 == 0) goto L_0x0175
            long r8 = r8.longValue()     // Catch:{ all -> 0x04f6 }
            r7.copyOnWrite()     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r10 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r10     // Catch:{ all -> 0x04f6 }
            int r11 = r10.f83821a     // Catch:{ all -> 0x04f6 }
            r11 = r11 | 4
            r10.f83821a = r11     // Catch:{ all -> 0x04f6 }
            r10.f83824d = r8     // Catch:{ all -> 0x04f6 }
        L_0x0175:
            java.lang.Long r8 = r0.f84259d     // Catch:{ all -> 0x04f6 }
            if (r8 == 0) goto L_0x018c
            long r8 = r8.longValue()     // Catch:{ all -> 0x04f6 }
            r7.copyOnWrite()     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r10 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r10     // Catch:{ all -> 0x04f6 }
            int r11 = r10.f83821a     // Catch:{ all -> 0x04f6 }
            r11 = r11 | 8
            r10.f83821a = r11     // Catch:{ all -> 0x04f6 }
            r10.f83825e = r8     // Catch:{ all -> 0x04f6 }
        L_0x018c:
            java.lang.Long r8 = r0.f84260e     // Catch:{ all -> 0x04f6 }
            if (r8 == 0) goto L_0x01a3
            long r8 = r8.longValue()     // Catch:{ all -> 0x04f6 }
            r7.copyOnWrite()     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r10 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r10     // Catch:{ all -> 0x04f6 }
            int r11 = r10.f83821a     // Catch:{ all -> 0x04f6 }
            r11 = r11 | 16
            r10.f83821a = r11     // Catch:{ all -> 0x04f6 }
            r10.f83826f = r8     // Catch:{ all -> 0x04f6 }
        L_0x01a3:
            j.a.i.b.a.l r8 = r0.f84261f     // Catch:{ all -> 0x04f6 }
            if (r8 == 0) goto L_0x01b8
            int r8 = r8.f190464h     // Catch:{ all -> 0x04f6 }
            r7.copyOnWrite()     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r9 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r9     // Catch:{ all -> 0x04f6 }
            int r10 = r9.f83821a     // Catch:{ all -> 0x04f6 }
            r10 = r10 | 32
            r9.f83821a = r10     // Catch:{ all -> 0x04f6 }
            r9.f83827g = r8     // Catch:{ all -> 0x04f6 }
        L_0x01b8:
            java.lang.String r8 = r0.f84262g     // Catch:{ all -> 0x04f6 }
            if (r8 == 0) goto L_0x01cb
            r7.copyOnWrite()     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r9 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r9     // Catch:{ all -> 0x04f6 }
            int r10 = r9.f83821a     // Catch:{ all -> 0x04f6 }
            r10 = r10 | 64
            r9.f83821a = r10     // Catch:{ all -> 0x04f6 }
            r9.f83828h = r8     // Catch:{ all -> 0x04f6 }
        L_0x01cb:
            j.a.i.b.a.aq r8 = r0.f84263h     // Catch:{ all -> 0x04f6 }
            if (r8 == 0) goto L_0x01de
            r7.copyOnWrite()     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r9 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r9     // Catch:{ all -> 0x04f6 }
            r9.f83829i = r8     // Catch:{ all -> 0x04f6 }
            int r8 = r9.f83821a     // Catch:{ all -> 0x04f6 }
            r8 = r8 | 256(0x100, float:3.59E-43)
            r9.f83821a = r8     // Catch:{ all -> 0x04f6 }
        L_0x01de:
            com.google.android.libraries.performance.primes.f.a r3 = r3.f84264a     // Catch:{ all -> 0x04f6 }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ all -> 0x04f6 }
            com.google.android.libraries.performance.b.a.a.b r7 = (com.google.android.libraries.performance.p2392b.p2393a.p2394a.C31123b) r7     // Catch:{ all -> 0x04f6 }
            r7.getClass()
            byte[] r7 = r7.toByteArray()     // Catch:{ all -> 0x04f6 }
            java.lang.String r8 = "primes.battery.snapshot"
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()     // Catch:{ all -> 0x04f6 }
            android.content.Context r9 = r3.f84146b     // Catch:{ all -> 0x04f6 }
            boolean r9 = com.google.android.libraries.directboot.C20674d.m38856e(r9)     // Catch:{ all -> 0x04f6 }
            if (r9 != 0) goto L_0x01fd
            r3 = 0
            r11 = 0
            goto L_0x0220
        L_0x01fd:
            int r9 = r7.length     // Catch:{ all -> 0x04f6 }
            int r10 = r9 + 1
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x04f6 }
            r11 = 0
            r10[r11] = r5     // Catch:{ all -> 0x04f6 }
            java.lang.System.arraycopy(r7, r11, r10, r5, r9)     // Catch:{ all -> 0x04f6 }
            g.a.a r3 = r3.f84147c     // Catch:{ all -> 0x04f6 }
            java.lang.Object r3 = r3.mo17428b()     // Catch:{ all -> 0x04f6 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x04f6 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x04f6 }
            java.lang.String r7 = android.util.Base64.encodeToString(r10, r11)     // Catch:{ all -> 0x04f6 }
            android.content.SharedPreferences$Editor r3 = r3.putString(r8, r7)     // Catch:{ all -> 0x04f6 }
            boolean r3 = r3.commit()     // Catch:{ all -> 0x04f6 }
        L_0x0220:
            monitor-exit(r6)     // Catch:{ all -> 0x04f6 }
            if (r3 != 0) goto L_0x025d
            com.google.android.libraries.performance.primes.c.b r0 = r1.f84231d
            com.google.android.libraries.performance.primes.c.e r0 = r0.f84117a
            r0.mo36958b(r1)
            com.google.android.libraries.performance.primes.metrics.a.x r3 = r1.f84233f
            monitor-enter(r3)
            com.google.android.libraries.performance.primes.metrics.a.x r0 = r1.f84233f     // Catch:{ all -> 0x025a }
            com.google.android.libraries.performance.primes.f.a r0 = r0.f84264a     // Catch:{ all -> 0x025a }
            java.lang.String r2 = "primes.battery.snapshot"
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()     // Catch:{ all -> 0x025a }
            android.content.Context r4 = r0.f84146b     // Catch:{ all -> 0x025a }
            boolean r4 = com.google.android.libraries.directboot.C20674d.m38856e(r4)     // Catch:{ all -> 0x025a }
            if (r4 == 0) goto L_0x0251
            g.a.a r0 = r0.f84147c     // Catch:{ all -> 0x025a }
            java.lang.Object r0 = r0.mo17428b()     // Catch:{ all -> 0x025a }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x025a }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x025a }
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)     // Catch:{ all -> 0x025a }
            r0.commit()     // Catch:{ all -> 0x025a }
        L_0x0251:
            monitor-exit(r3)     // Catch:{ all -> 0x025a }
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Failure storing persistent snapshot and helper data"
            r0.<init>(r2)
            throw r0
        L_0x025a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x025a }
            throw r0
        L_0x025d:
            com.google.android.libraries.performance.primes.metrics.a.c r3 = r1.f84234g
            if (r4 == 0) goto L_0x04d2
            java.lang.Long r6 = r4.f84259d
            java.lang.Long r7 = r0.f84259d
            boolean r6 = p3186j$.util.Objects.equals(r6, r7)
            if (r6 == 0) goto L_0x04d2
            java.lang.Long r6 = r4.f84260e
            java.lang.Long r7 = r0.f84260e
            boolean r6 = p3186j$.util.Objects.equals(r6, r7)
            if (r6 == 0) goto L_0x04d2
            java.lang.Long r6 = r4.f84257b
            if (r6 == 0) goto L_0x04d2
            java.lang.Long r6 = r4.f84258c
            if (r6 == 0) goto L_0x04d2
            java.lang.Long r6 = r0.f84257b
            if (r6 == 0) goto L_0x04d2
            java.lang.Long r7 = r0.f84258c
            if (r7 != 0) goto L_0x0287
            goto L_0x04d2
        L_0x0287:
            long r6 = r6.longValue()
            java.lang.Long r8 = r4.f84257b
            long r8 = r8.longValue()
            long r6 = r6 - r8
            java.lang.Long r8 = r0.f84258c
            long r8 = r8.longValue()
            java.lang.Long r10 = r4.f84258c
            long r12 = r10.longValue()
            long r8 = r8 - r12
            r12 = 0
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x02a7
            goto L_0x04d2
        L_0x02a7:
            long r6 = r6 - r8
            long r6 = java.lang.Math.abs(r6)
            r14 = 25
            int r10 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r10 < 0) goto L_0x02c4
            double r6 = (double) r6
            double r8 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r8)
            double r6 = r6 / r8
            r8 = 4540248920338119903(0x3f023456789abcdf, double:3.472222222222222E-5)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x04d2
        L_0x02c4:
            com.google.android.libraries.performance.primes.metrics.a.z r3 = r3.f84217a
            j.a.i.b.a.ae r6 = r0.f84256a
            j.a.i.b.a.ae r7 = r4.f84256a
            j.a.i.b.a.ae r6 = com.google.android.libraries.performance.primes.metrics.p2403a.C31285r.m58327h(r6, r7)
            if (r6 != 0) goto L_0x02d3
            r3 = r2
            goto L_0x03dd
        L_0x02d3:
            com.google.protobuf.bn r6 = r6.toBuilder()
            j.a.i.b.a.ad r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71194ad) r6
            com.google.android.libraries.performance.primes.metrics.a.k r3 = r3.f84267b
            com.google.protobuf.bv r7 = r6.instance
            j.a.i.b.a.ae r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r7
            com.google.protobuf.cq r7 = r7.f190006g
            java.util.Collections.unmodifiableList(r7)
            r7 = 0
        L_0x02e5:
            com.google.protobuf.bv r8 = r6.instance
            j.a.i.b.a.ae r8 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r8
            com.google.protobuf.cq r8 = r8.f190006g
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x02ff
            j.a.i.b.a.ac r8 = r6.mo62625a(r7)
            j.a.i.b.a.ac r8 = r3.mo36991b(r8)
            r6.mo62645u(r7, r8)
            int r7 = r7 + 1
            goto L_0x02e5
        L_0x02ff:
            com.google.protobuf.bv r7 = r6.instance
            j.a.i.b.a.ae r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r7
            com.google.protobuf.cq r7 = r7.f190007h
            java.util.Collections.unmodifiableList(r7)
            r7 = 0
        L_0x0309:
            com.google.protobuf.bv r8 = r6.instance
            j.a.i.b.a.ae r8 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r8
            com.google.protobuf.cq r8 = r8.f190007h
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0323
            j.a.i.b.a.ac r8 = r6.mo62626b(r7)
            j.a.i.b.a.ac r8 = r3.mo36991b(r8)
            r6.mo62646v(r7, r8)
            int r7 = r7 + 1
            goto L_0x0309
        L_0x0323:
            com.google.protobuf.bv r7 = r6.instance
            j.a.i.b.a.ae r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r7
            com.google.protobuf.cq r7 = r7.f190008i
            java.util.Collections.unmodifiableList(r7)
            r7 = 0
        L_0x032d:
            com.google.protobuf.bv r8 = r6.instance
            j.a.i.b.a.ae r8 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r8
            com.google.protobuf.cq r8 = r8.f190008i
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0347
            j.a.i.b.a.ac r8 = r6.mo62627c(r7)
            j.a.i.b.a.ac r8 = r3.mo36991b(r8)
            r6.mo62647w(r7, r8)
            int r7 = r7 + 1
            goto L_0x032d
        L_0x0347:
            com.google.protobuf.bv r7 = r6.instance
            j.a.i.b.a.ae r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r7
            com.google.protobuf.cq r7 = r7.f190009j
            java.util.Collections.unmodifiableList(r7)
            r7 = 0
        L_0x0351:
            com.google.protobuf.bv r8 = r6.instance
            j.a.i.b.a.ae r8 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r8
            com.google.protobuf.cq r8 = r8.f190009j
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x036b
            j.a.i.b.a.ac r8 = r6.mo62628d(r7)
            j.a.i.b.a.ac r8 = r3.mo36991b(r8)
            r6.mo62644t(r7, r8)
            int r7 = r7 + 1
            goto L_0x0351
        L_0x036b:
            com.google.protobuf.bv r7 = r6.instance
            j.a.i.b.a.ae r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r7
            com.google.protobuf.cq r7 = r7.f190010k
            java.util.Collections.unmodifiableList(r7)
            r7 = 0
        L_0x0375:
            com.google.protobuf.bv r8 = r6.instance
            j.a.i.b.a.ae r8 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r8
            com.google.protobuf.cq r8 = r8.f190010k
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x038f
            j.a.i.b.a.ac r8 = r6.mo62629e(r7)
            j.a.i.b.a.ac r8 = r3.mo36991b(r8)
            r6.mo62643s(r7, r8)
            int r7 = r7 + 1
            goto L_0x0375
        L_0x038f:
            com.google.protobuf.bv r7 = r6.instance
            j.a.i.b.a.ae r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r7
            com.google.protobuf.cq r7 = r7.f190011l
            java.util.Collections.unmodifiableList(r7)
            r7 = 0
        L_0x0399:
            com.google.protobuf.bv r8 = r6.instance
            j.a.i.b.a.ae r8 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r8
            com.google.protobuf.cq r8 = r8.f190011l
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x03b3
            j.a.i.b.a.ac r8 = r6.mo62630f(r7)
            j.a.i.b.a.ac r8 = r3.mo36991b(r8)
            r6.mo62641q(r7, r8)
            int r7 = r7 + 1
            goto L_0x0399
        L_0x03b3:
            com.google.protobuf.bv r7 = r6.instance
            j.a.i.b.a.ae r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r7
            com.google.protobuf.cq r7 = r7.f190013n
            java.util.Collections.unmodifiableList(r7)
            r7 = 0
        L_0x03bd:
            com.google.protobuf.bv r8 = r6.instance
            j.a.i.b.a.ae r8 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r8
            com.google.protobuf.cq r8 = r8.f190013n
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x03d7
            j.a.i.b.a.ac r8 = r6.mo62631g(r7)
            j.a.i.b.a.ac r8 = r3.mo36991b(r8)
            r6.mo62642r(r7, r8)
            int r7 = r7 + 1
            goto L_0x03bd
        L_0x03d7:
            com.google.protobuf.bv r3 = r6.build()
            j.a.i.b.a.ae r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71195ae) r3
        L_0x03dd:
            if (r3 != 0) goto L_0x03e1
            goto L_0x04d2
        L_0x03e1:
            int r6 = r3.f189987a
            r6 = r6 & r5
            if (r6 == 0) goto L_0x04d2
            long r6 = r3.f190002c
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 > 0) goto L_0x03ee
            goto L_0x04d2
        L_0x03ee:
            j.a.i.b.a.m r2 = p5535j.p5536a.p5562i.p5568b.p5569a.C71318m.f190465k
            com.google.protobuf.bn r2 = r2.createBuilder()
            j.a.i.b.a.j r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71315j) r2
            java.lang.Long r6 = r0.f84257b
            r6.getClass()
            long r6 = r6.longValue()
            java.lang.Long r8 = r4.f84257b
            r8.getClass()
            long r8 = r8.longValue()
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            j.a.i.b.a.m r10 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71318m) r10
            int r11 = r10.f190467a
            r11 = r11 | 64
            r10.f190467a = r11
            long r6 = r6 - r8
            r10.f190474h = r6
            j.a.i.b.a.l r6 = r4.f84261f
            if (r6 == 0) goto L_0x042c
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            j.a.i.b.a.m r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71318m) r7
            int r6 = r6.f190464h
            r7.f190468b = r6
            int r6 = r7.f190467a
            r6 = r6 | r5
            r7.f190467a = r6
        L_0x042c:
            java.lang.String r6 = r4.f84262g
            if (r6 == 0) goto L_0x043f
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            j.a.i.b.a.m r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71318m) r7
            int r8 = r7.f190467a
            r8 = r8 | 8
            r7.f190467a = r8
            r7.f190471e = r6
        L_0x043f:
            j.a.i.b.a.aq r4 = r4.f84263h
            if (r4 == 0) goto L_0x0452
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            j.a.i.b.a.m r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71318m) r6
            r6.f190472f = r4
            int r4 = r6.f190467a
            r4 = r4 | 16
            r6.f190467a = r4
        L_0x0452:
            j.a.i.b.a.l r4 = r0.f84261f
            if (r4 == 0) goto L_0x0467
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            j.a.i.b.a.m r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71318m) r6
            int r4 = r4.f190464h
            r6.f190473g = r4
            int r4 = r6.f190467a
            r4 = r4 | 32
            r6.f190467a = r4
        L_0x0467:
            java.lang.Long r4 = r0.f84257b
            if (r4 == 0) goto L_0x047e
            long r6 = r4.longValue()
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            j.a.i.b.a.m r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71318m) r4
            int r8 = r4.f190467a
            r8 = r8 | 256(0x100, float:3.59E-43)
            r4.f190467a = r8
            r4.f190476j = r6
        L_0x047e:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            j.a.i.b.a.m r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71318m) r4
            r4.f190475i = r3
            int r3 = r4.f190467a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r4.f190467a = r3
            j.a.i.b.a.ej r3 = p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej.f190415x
            com.google.protobuf.bn r3 = r3.createBuilder()
            j.a.i.b.a.ei r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei) r3
            j.a.i.b.a.o r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71320o.f190478c
            com.google.protobuf.bn r4 = r4.createBuilder()
            j.a.i.b.a.n r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71319n) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            j.a.i.b.a.o r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71320o) r6
            com.google.protobuf.bv r2 = r2.build()
            j.a.i.b.a.m r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71318m) r2
            r2.getClass()
            r6.f190481b = r2
            int r2 = r6.f190480a
            r2 = r2 | r5
            r6.f190480a = r2
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            j.a.i.b.a.ej r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r2
            com.google.protobuf.bv r4 = r4.build()
            j.a.i.b.a.o r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71320o) r4
            r4.getClass()
            r2.f190425j = r4
            int r4 = r2.f190416a
            r4 = r4 | 256(0x100, float:3.59E-43)
            r2.f190416a = r4
            com.google.protobuf.bv r2 = r3.build()
            j.a.i.b.a.ej r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r2
        L_0x04d2:
            if (r2 != 0) goto L_0x04d7
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            return r0
        L_0x04d7:
            com.google.android.libraries.performance.primes.metrics.b.m r3 = r1.f84235h
            com.google.android.libraries.performance.primes.metrics.b.d r4 = com.google.android.libraries.performance.primes.metrics.p2404b.C31302e.m58363j()
            java.lang.String r6 = r0.f84262g
            r7 = r4
            com.google.android.libraries.performance.primes.metrics.b.a r7 = (com.google.android.libraries.performance.primes.metrics.p2404b.C31295a) r7
            r7.f84268a = r6
            r4.mo37002c(r5)
            r7.f84269b = r2
            j.a.i.b.a.aq r0 = r0.f84263h
            r7.f84270c = r0
            com.google.android.libraries.performance.primes.metrics.b.e r0 = r4.mo37000a()
            com.google.common.util.concurrent.cx r0 = r3.mo37023b(r0)
            return r0
        L_0x04f6:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x04f6 }
            throw r0
        L_0x04f9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04f9 }
            goto L_0x04fd
        L_0x04fc:
            throw r0
        L_0x04fd:
            goto L_0x04fc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2403a.C31276i.mo36988e(j.a.i.b.a.l, com.google.android.libraries.performance.primes.au):com.google.common.util.concurrent.cx");
    }

    /* renamed from: f */
    public C60870cx mo36989f() {
        if (!C20674d.m38856e(this.f84230c)) {
            return C60866ct.f164955a;
        }
        try {
            C58838bb.m90883r(this.f84229a.getAndSet(false));
            return m58287h(C71317l.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: g */
    public C60870cx mo36990g() {
        if (!C20674d.m38856e(this.f84230c)) {
            return C60866ct.f164955a;
        }
        if (!this.f84229a.getAndSet(true)) {
            return m58287h(C71317l.BACKGROUND_TO_FOREGROUND);
        }
        ((C59052c) ((C59052c) f84228b.mo56226d()).mo56372aa(50359)).mo56386p("App is already in the foreground.");
        return C60856cj.m92898g();
    }

    /* renamed from: ln */
    public void mo29159ln() {
        this.f84231d.f84117a.mo36957a(this);
    }
}
