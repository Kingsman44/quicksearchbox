package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.storage.p3315b.C42827am;
import com.google.android.libraries.storage.p3315b.C42835au;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.apps.tiktok.account.p3606d.C46087e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.y */
/* compiled from: PG */
public final class C136747y {

    /* renamed from: a */
    public final String f372236a = "user_interactions";

    /* renamed from: b */
    public final String f372237b = "thread_id";

    /* renamed from: c */
    public final String f372238c = "expiration_timestamp_seconds";

    /* renamed from: d */
    public final String f372239d = ("\n        CREATE TABLE " + "user_interactions" + "\n        (\n          _id INTEGER PRIMARY KEY,\n          " + "thread_id" + " STRING NOT NULL,\n          " + "expiration_timestamp_seconds" + " INTEGER NOT NULL\n        )\n      ");

    /* renamed from: e */
    private final C39141kp f372240e;

    /* renamed from: f */
    private final String f372241f = "suppression_store";

    /* renamed from: g */
    private final C42835au f372242g;

    /* renamed from: h */
    private final C42850e f372243h;

    public C136747y(C46087e eVar, C39141kp kpVar) {
        C69664n.m101061g(kpVar, "clientStreamz");
        this.f372240e = kpVar;
        C42827am amVar = new C42827am();
        amVar.f112108a.mo55395g(new C136737o(this));
        C42835au a = amVar.mo45914a();
        this.f372242g = a;
        this.f372243h = eVar.mo50195a("suppression_store", a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113343a(long r6, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136738p
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.notifications.a.b.p r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136738p) r0
            int r1 = r0.f372209d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f372209d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.notifications.a.b.p r0 = new com.google.android.apps.search.googleapp.notifications.a.b.p
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f372207b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f372209d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0064
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.f372206a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0056
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.storage.b.e r8 = r5.f372243h
            com.google.android.apps.search.googleapp.notifications.a.b.q r2 = new com.google.android.apps.search.googleapp.notifications.a.b.q
            r2.<init>(r5, r6)
            com.google.common.util.concurrent.cx r6 = r8.mo45937a(r2)
            java.lang.String r7 = "suspend fun deleteOldExp…logStoreSizeStreamz()\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r0.f372206a = r5
            r0.f372209d = r4
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 == r1) goto L_0x0067
            r6 = r5
        L_0x0056:
            r7 = 0
            r0.f372206a = r7
            r0.f372209d = r3
            com.google.android.apps.search.googleapp.notifications.a.b.y r6 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136747y) r6
            java.lang.Object r6 = r6.mo113345c(r0)
            if (r6 != r1) goto L_0x0064
            return r1
        L_0x0064:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136747y.mo113343a(long, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113344b(java.lang.String r6, long r7, p5462h.p5466c.C69577g r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136740r
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.googleapp.notifications.a.b.r r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136740r) r0
            int r1 = r0.f372215d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f372215d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.notifications.a.b.r r0 = new com.google.android.apps.search.googleapp.notifications.a.b.r
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f372213b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f372215d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0064
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.f372212a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0056
        L_0x0038:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.storage.b.e r9 = r5.f372243h
            com.google.android.apps.search.googleapp.notifications.a.b.s r2 = new com.google.android.apps.search.googleapp.notifications.a.b.s
            r2.<init>(r5, r6, r7)
            com.google.common.util.concurrent.cx r6 = r9.mo45938b(r2)
            java.lang.String r7 = "suspend fun insertUserIn…logStoreSizeStreamz()\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r0.f372212a = r5
            r0.f372215d = r4
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 == r1) goto L_0x0067
            r6 = r5
        L_0x0056:
            r7 = 0
            r0.f372212a = r7
            r0.f372215d = r3
            com.google.android.apps.search.googleapp.notifications.a.b.y r6 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136747y) r6
            java.lang.Object r6 = r6.mo113345c(r0)
            if (r6 != r1) goto L_0x0064
            return r1
        L_0x0064:
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136747y.mo113344b(java.lang.String, long, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113345c(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136742t
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.notifications.a.b.t r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136742t) r0
            int r1 = r0.f372222d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f372222d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.notifications.a.b.t r0 = new com.google.android.apps.search.googleapp.notifications.a.b.t
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f372220b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f372222d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f372219a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.logging.d.kp r6 = r5.f372240e
            r0.f372219a = r6
            r0.f372222d = r3
            java.lang.Object r0 = r5.mo113346d(r0)
            if (r0 == r1) goto L_0x005d
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0043:
            java.lang.Number r6 = (java.lang.Number) r6
            long r1 = r6.longValue()
            com.google.android.libraries.search.logging.d.kp r0 = (com.google.android.libraries.search.logging.p3041d.C39141kp) r0
            com.google.common.base.cr r6 = r0.f102841aY
            java.lang.Object r6 = r6.mo6453a()
            com.google.android.libraries.au.f r6 = (com.google.android.libraries.p1635au.C19569f) r6
            double r0 = (double) r1
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r6.mo24824b(r0, r2)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136747y.mo113345c(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113346d(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136743u
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.notifications.a.b.u r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136743u) r0
            int r1 = r0.f372225c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f372225c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.notifications.a.b.u r0 = new com.google.android.apps.search.googleapp.notifications.a.b.u
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f372223a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f372225c
            java.lang.String r3 = "private suspend fun numE…     }\n      .await()\n  }"
            r4 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r4) goto L_0x0029
            p5462h.C69714l.m101134b(r6)
            goto L_0x004b
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.storage.b.e r6 = r5.f372243h
            com.google.android.apps.search.googleapp.notifications.a.b.v r2 = new com.google.android.apps.search.googleapp.notifications.a.b.v
            r2.<init>(r5)
            com.google.common.util.concurrent.cx r6 = r6.mo45937a(r2)
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r3)
            r0.f372225c = r4
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136747y.mo113346d(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113347e(java.lang.String r7, long r8, p5462h.p5466c.C69577g r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136745w
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.notifications.a.b.w r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136745w) r0
            int r1 = r0.f372232f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f372232f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.notifications.a.b.w r0 = new com.google.android.apps.search.googleapp.notifications.a.b.w
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f372230d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f372232f
            java.lang.String r3 = "suspend fun shouldSuppre…     }\n      .await()\n  }"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r5) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            p5462h.C69714l.m101134b(r10)
            goto L_0x0070
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            long r8 = r0.f372229c
            java.lang.Object r7 = r0.f372228b
            java.lang.Object r2 = r0.f372227a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0050
        L_0x003e:
            p5462h.C69714l.m101134b(r10)
            r0.f372227a = r6
            r0.f372228b = r7
            r0.f372229c = r8
            r0.f372232f = r5
            java.lang.Object r10 = r6.mo113343a(r8, r0)
            if (r10 == r1) goto L_0x0074
            r2 = r6
        L_0x0050:
            com.google.android.apps.search.googleapp.notifications.a.b.y r2 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136747y) r2
            com.google.android.libraries.storage.b.e r10 = r2.f372243h
            com.google.android.apps.search.googleapp.notifications.a.b.x r5 = new com.google.android.apps.search.googleapp.notifications.a.b.x
            java.lang.String r7 = (java.lang.String) r7
            r5.<init>(r2, r7, r8)
            com.google.common.util.concurrent.cx r7 = r10.mo45937a(r5)
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)
            r8 = 0
            r0.f372227a = r8
            r0.f372228b = r8
            r0.f372232f = r4
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r10 != r1) goto L_0x0070
            return r1
        L_0x0070:
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)
            return r10
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136747y.mo113347e(java.lang.String, long, h.c.g):java.lang.Object");
    }
}
