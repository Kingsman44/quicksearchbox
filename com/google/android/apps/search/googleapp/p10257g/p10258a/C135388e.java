package com.google.android.apps.search.googleapp.p10257g.p10258a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.cache.C46407v;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.a.e */
/* compiled from: PG */
public final class C135388e {

    /* renamed from: a */
    private final C46407v f368872a;

    /* renamed from: b */
    private final C21370a f368873b;

    /* renamed from: c */
    private final C135405v f368874c;

    public C135388e(C46407v vVar, C21370a aVar, C135405v vVar2) {
        C69664n.m101061g(vVar, "doodleDataCache");
        C69664n.m101061g(aVar, "clock");
        this.f368872a = vVar;
        this.f368873b = aVar;
        this.f368874c = vVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112304a(p5462h.p5466c.C69577g r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.googleapp.p10257g.p10258a.C135385b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.googleapp.g.a.b r0 = (com.google.android.apps.search.googleapp.p10257g.p10258a.C135385b) r0
            int r1 = r0.f368866d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368866d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.g.a.b r0 = new com.google.android.apps.search.googleapp.g.a.b
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f368864b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368866d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f368863a
            com.google.aa.d r0 = (com.google.p337aa.C6617d) r0
            p5462h.C69714l.m101134b(r13)
            goto L_0x00c4
        L_0x002f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0037:
            java.lang.Object r2 = r0.f368863a
            com.google.android.apps.search.googleapp.g.a.e r2 = (com.google.android.apps.search.googleapp.p10257g.p10258a.C135388e) r2
            p5462h.C69714l.m101134b(r13)
            goto L_0x00a5
        L_0x003f:
            p5462h.C69714l.m101134b(r13)
            com.google.android.apps.search.googleapp.g.a.v r13 = r12.f368874c
            com.google.android.libraries.search.d.j r2 = r13.f368908c
            com.google.common.util.concurrent.cx r6 = r2.mo17428b()
            com.google.android.apps.search.googleapp.config.d r2 = r13.f368912g
            com.google.common.util.concurrent.cx r7 = r2.mo111320a()
            com.google.android.apps.search.googleapp.v.a.b r2 = r13.f368913h
            com.google.common.util.concurrent.cx r8 = r2.mo115317a(r4, r4)
            com.google.android.apps.gsa.w.i.c r2 = r13.f368914i
            com.google.common.util.concurrent.cx r9 = r2.mo103971a()
            com.google.android.apps.search.googleapp.s.a.a r2 = r13.f368907b
            com.google.common.util.concurrent.cx r10 = r2.mo103984d()
            r2 = 5
            com.google.common.util.concurrent.cx[] r2 = new com.google.common.util.concurrent.C60870cx[r2]
            r5 = 0
            r2[r5] = r6
            r2[r4] = r7
            r2[r3] = r8
            r5 = 3
            r2[r5] = r9
            r5 = 4
            r2[r5] = r10
            com.google.apps.tiktok.tracing.contrib.b.h r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47636i.m84746e(r2)
            com.google.android.apps.search.googleapp.g.a.s r11 = new com.google.android.apps.search.googleapp.g.a.s
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            com.google.common.util.concurrent.bg r5 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r2.mo51518a(r11, r5)
            com.google.frameworks.client.data.android.o r5 = r13.f368911f
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.search.googleapp.g.a.t r6 = new com.google.android.apps.search.googleapp.g.a.t
            r6.<init>(r5)
            java.util.concurrent.Executor r5 = r13.f368909d
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r2.mo51516i(r6, r5)
            com.google.android.apps.search.googleapp.g.a.u r5 = com.google.android.apps.search.googleapp.p10257g.p10258a.C135404u.f368905a
            java.util.concurrent.Executor r13 = r13.f368910e
            com.google.apps.tiktok.tracing.contrib.b.f r13 = r2.mo51515h(r5, r13)
            r0.f368863a = r12
            r0.f368866d = r4
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x00ca
            r2 = r12
        L_0x00a5:
            com.google.aa.d r13 = (com.google.p337aa.C6617d) r13
            com.google.apps.tiktok.cache.v r2 = r2.f368872a
            com.google.protobuf.at r4 = com.google.protobuf.C62912at.f169862a
            com.google.android.apps.search.googleapp.g.a.c r5 = new com.google.android.apps.search.googleapp.g.a.c
            r5.<init>(r13)
            com.google.common.util.concurrent.cx r2 = r2.mo50348h(r4, r5)
            java.lang.String r4 = "val currentDoodle = dood…e.modify(currentDoodle) }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            r0.f368863a = r13
            r0.f368866d = r3
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r0 == r1) goto L_0x00ca
            r0 = r13
        L_0x00c4:
            java.lang.String r13 = "currentDoodle"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r13)
            return r0
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10257g.p10258a.C135388e.mo112304a(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo112305b(p5462h.p5466c.C69577g r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.apps.search.googleapp.p10257g.p10258a.C135387d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.apps.search.googleapp.g.a.d r0 = (com.google.android.apps.search.googleapp.p10257g.p10258a.C135387d) r0
            int r1 = r0.f368871d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f368871d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.g.a.d r0 = new com.google.android.apps.search.googleapp.g.a.d
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f368869b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f368871d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f368868a
            p5462h.C69714l.m101134b(r14)
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0031:
            p5462h.C69714l.m101134b(r14)
            com.google.apps.tiktok.cache.v r14 = r13.f368872a
            com.google.protobuf.at r2 = com.google.protobuf.C62912at.f169862a
            com.google.common.util.concurrent.cx r14 = r14.mo50345e(r2)
            java.lang.String r2 = "doodleDataCache.getIfPresent(empty())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r2)
            r0.f368868a = r13
            r0.f368871d = r3
            java.lang.Object r14 = kotlinx.coroutines.p5578d.C71663i.m104690c(r14, r0)
            if (r14 == r1) goto L_0x0095
            r0 = r13
        L_0x004c:
            com.google.common.base.ax r14 = (com.google.common.base.C58833ax) r14
            java.lang.Object r14 = r14.mo56111f()
            com.google.apps.tiktok.cache.ah r14 = (com.google.apps.tiktok.cache.C46370ah) r14
            r1 = 0
            if (r14 != 0) goto L_0x0058
            return r1
        L_0x0058:
            java.lang.Object r2 = r14.f121384a
            com.google.aa.d r2 = (com.google.p337aa.C6617d) r2
            long r3 = r14.f121385b
            com.google.android.apps.search.googleapp.g.a.e r0 = (com.google.android.apps.search.googleapp.p10257g.p10258a.C135388e) r0
            com.google.android.libraries.f.a r14 = r0.f368873b
            long r5 = r14.mo26870b()
            long r5 = r5 - r3
            r7 = 1
            j$.time.Duration r14 = p3186j$.time.Duration.ofHours(r7)
            long r7 = r14.toMillis()
            com.google.aa.d r14 = com.google.p337aa.C6617d.f19649y
            boolean r14 = p5462h.p5473f.p5475b.C69664n.m101066l(r14, r2)
            if (r14 != 0) goto L_0x0086
            long r9 = r2.f19661k
            r11 = 0
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x0086
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 >= 0) goto L_0x0086
            r7 = r9
        L_0x0086:
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 >= 0) goto L_0x0095
            com.google.android.apps.search.googleapp.g.a.a r14 = new com.google.android.apps.search.googleapp.g.a.a
            java.lang.String r0 = "doodle"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r0)
            r14.<init>(r2, r3)
            return r14
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10257g.p10258a.C135388e.mo112305b(h.c.g):java.lang.Object");
    }
}
