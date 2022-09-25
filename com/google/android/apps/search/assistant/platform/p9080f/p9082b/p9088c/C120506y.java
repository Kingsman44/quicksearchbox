package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120513j;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120517n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.y */
/* compiled from: PG */
public final class C120506y implements C120513j {

    /* renamed from: a */
    public final C119259a f335146a = new C119259a(new C120517n(0));

    /* renamed from: a */
    public final C119259a mo104778a() {
        return this.f335146a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104779b(com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d r10, kotlinx.coroutines.p5574b.C71587n r11, p5462h.p5466c.C69577g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c.C120504w
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.platform.f.b.c.w r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c.C120504w) r0
            int r1 = r0.f335144d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335144d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.b.c.w r0 = new com.google.android.apps.search.assistant.platform.f.b.c.w
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f335142b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335144d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            java.lang.Object r10 = r0.f335141a
            p5462h.C69714l.m101134b(r12)     // Catch:{ all -> 0x002a }
            goto L_0x0095
        L_0x002a:
            r11 = move-exception
            goto L_0x00a7
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            p5462h.C69714l.m101134b(r12)
            com.google.android.apps.search.assistant.platform.f.b.c r12 = r10.mo104783d()
            p5462h.p5473f.p5475b.C69664n.m101058d(r12)
            int[] r2 = com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c.C120500s.f335140a
            int r12 = r12.ordinal()
            r12 = r2[r12]
            if (r12 != r4) goto L_0x00b4
            com.google.android.apps.search.assistant.platform.f.b.b r12 = r10.mo104782c()
            p5462h.p5473f.p5475b.C69664n.m101058d(r12)
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x0064
            if (r12 != r4) goto L_0x005e
            com.google.android.apps.search.assistant.platform.f.b.c.v r12 = new com.google.android.apps.search.assistant.platform.f.b.c.v
            r12.<init>()
            goto L_0x0069
        L_0x005e:
            h.g r10 = new h.g
            r10.<init>()
            throw r10
        L_0x0064:
            com.google.android.apps.search.assistant.platform.f.b.c.t r12 = new com.google.android.apps.search.assistant.platform.f.b.c.t
            r12.<init>()
        L_0x0069:
            int r2 = r10.mo104781b()
            j$.time.Duration r10 = r10.mo104784e()
            long r5 = r10.toMillis()
            com.google.android.apps.search.assistant.platform.f.b.c.r r10 = new com.google.android.apps.search.assistant.platform.f.b.c.r
            int r2 = r2 * 20
            int r2 = r2 / 1000
            r7 = 20
            long r5 = r5 / r7
            int r6 = (int) r5
            r10.<init>(r9, r12, r2, r6)
            com.google.android.apps.search.assistant.platform.f.b.c.x r12 = new com.google.android.apps.search.assistant.platform.f.b.c.x     // Catch:{ all -> 0x00a4 }
            r12.<init>(r10)     // Catch:{ all -> 0x00a4 }
            r0.f335141a = r9     // Catch:{ all -> 0x00a4 }
            r0.f335144d = r4     // Catch:{ all -> 0x00a4 }
            kotlinx.coroutines.b.a.g r11 = (kotlinx.coroutines.p5574b.p5575a.C71450g) r11     // Catch:{ all -> 0x00a4 }
            java.lang.Object r10 = kotlinx.coroutines.p5574b.p5575a.C71450g.m104241h(r11, r12, r0)     // Catch:{ all -> 0x00a4 }
            if (r10 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r10 = r9
        L_0x0095:
            com.google.android.apps.search.assistant.platform.f.b.c.y r10 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c.C120506y) r10
            com.google.android.apps.search.assistant.libraries.d.a r10 = r10.f335146a
            com.google.android.apps.search.assistant.platform.f.b.n r11 = new com.google.android.apps.search.assistant.platform.f.b.n
            r11.<init>(r3)
            r10.mo104263a(r11)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x00a4:
            r10 = move-exception
            r11 = r10
            r10 = r9
        L_0x00a7:
            com.google.android.apps.search.assistant.platform.f.b.c.y r10 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c.C120506y) r10
            com.google.android.apps.search.assistant.libraries.d.a r10 = r10.f335146a
            com.google.android.apps.search.assistant.platform.f.b.n r12 = new com.google.android.apps.search.assistant.platform.f.b.n
            r12.<init>(r3)
            r10.mo104263a(r12)
            throw r11
        L_0x00b4:
            h.g r10 = new h.g
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c.C120506y.mo104779b(com.google.android.apps.search.assistant.platform.f.b.d, kotlinx.coroutines.b.n, h.c.g):java.lang.Object");
    }
}
