package com.google.android.apps.search.googleapp.notifications.p10360a.p10362b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.protobuf.C62910ar;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.a.b.n */
/* compiled from: PG */
public final class C136736n {

    /* renamed from: a */
    public final C136730h f372200a;

    /* renamed from: b */
    public final C71422aw f372201b;

    /* renamed from: c */
    public final C62910ar f372202c;

    /* renamed from: d */
    public final boolean f372203d;

    /* renamed from: e */
    private final C21370a f372204e;

    public C136736n(C136730h hVar, C71422aw awVar, C21370a aVar, C62910ar arVar, boolean z) {
        C69664n.m101061g(hVar, "actionUploadDatabase");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "clock");
        this.f372200a = hVar;
        this.f372201b = awVar;
        this.f372204e = aVar;
        this.f372202c = arVar;
        this.f372203d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084 A[PHI: r12 
      PHI: (r12v2 java.lang.Object) = (r12v4 java.lang.Object), (r12v1 java.lang.Object) binds: [B:18:0x0081, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113342a(p5462h.p5466c.C69577g r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136732j
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.googleapp.notifications.a.b.j r0 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136732j) r0
            int r1 = r0.f372190d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f372190d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.notifications.a.b.j r0 = new com.google.android.apps.search.googleapp.notifications.a.b.j
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f372188b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f372190d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r12)
            goto L_0x0084
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0033:
            java.lang.Object r2 = r0.f372187a
            p5462h.C69714l.m101134b(r12)
            goto L_0x0075
        L_0x0039:
            p5462h.C69714l.m101134b(r12)
            com.google.android.libraries.f.a r12 = r11.f372204e
            long r6 = r12.mo26870b()
            com.google.protobuf.ar r12 = com.google.protobuf.p4750c.C62948a.m95459j(r6)
            long r6 = r12.f169860a
            kotlinx.coroutines.be[] r12 = new kotlinx.coroutines.C71604be[r3]
            kotlinx.coroutines.aw r2 = r11.f372201b
            com.google.android.apps.search.googleapp.notifications.a.b.k r8 = new com.google.android.apps.search.googleapp.notifications.a.b.k
            r8.<init>(r11, r6, r5)
            r9 = 0
            r10 = 3
            kotlinx.coroutines.be r2 = kotlinx.coroutines.C71803m.m105042c(r2, r5, r5, r8, r10)
            r12[r9] = r2
            kotlinx.coroutines.aw r2 = r11.f372201b
            com.google.android.apps.search.googleapp.notifications.a.b.l r8 = new com.google.android.apps.search.googleapp.notifications.a.b.l
            r8.<init>(r11, r6, r5)
            kotlinx.coroutines.be r2 = kotlinx.coroutines.C71803m.m105042c(r2, r5, r5, r8, r10)
            r12[r4] = r2
            java.util.List r12 = p5462h.p5463a.C69540x.m100947e(r12)
            r0.f372187a = r11
            r0.f372190d = r4
            java.lang.Object r12 = kotlinx.coroutines.C71760h.m104949a(r12, r0)
            if (r12 == r1) goto L_0x0085
            r2 = r11
        L_0x0075:
            com.google.android.apps.search.googleapp.notifications.a.b.n r2 = (com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136736n) r2
            com.google.android.apps.search.googleapp.notifications.a.b.h r12 = r2.f372200a
            r0.f372187a = r5
            r0.f372190d = r3
            java.lang.Object r12 = r12.mo113338a(r0)
            if (r12 != r1) goto L_0x0084
            return r1
        L_0x0084:
            return r12
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.notifications.p10360a.p10362b.C136736n.mo113342a(h.c.g):java.lang.Object");
    }
}
