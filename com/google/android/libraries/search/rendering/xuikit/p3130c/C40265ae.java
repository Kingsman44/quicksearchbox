package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.android.libraries.p1730f.C21370a;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.ae */
/* compiled from: PG */
public final class C40265ae {
    /* renamed from: a */
    public static final C63042fg m69882a(C21370a aVar) {
        C63042fg i = C62953e.m95484i(aVar.mo26870b());
        C69664n.m101060f(i, "fromMillis(currentTimeMillis())");
        return i;
    }

    /* renamed from: b */
    public static final Instant m69883b(C21370a aVar) {
        return Instant.ofEpochMilli(aVar.mo26870b());
    }

    /* renamed from: c */
    public static final Instant m69884c(C63042fg fgVar) {
        Instant e = C62950b.m95474e(fgVar);
        C69664n.m101060f(e, "toJavaInstant(this)");
        return e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m69885d(com.google.android.libraries.storage.protostore.C42876ab r4, p5462h.p5473f.p5474a.C69626l r5, p5462h.p5466c.C69577g r6) {
        /*
            boolean r0 = r6 instanceof com.google.android.libraries.search.rendering.xuikit.p3130c.C40263ac
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.rendering.xuikit.c.ac r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40263ac) r0
            int r1 = r0.f105759c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105759c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.c.ac r0 = new com.google.android.libraries.search.rendering.xuikit.c.ac
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f105758b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f105759c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r4 = r0.f105757a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0054
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r6.<init>()
            com.google.android.libraries.search.rendering.xuikit.c.ad r2 = new com.google.android.libraries.search.rendering.xuikit.c.ad
            r2.<init>(r5, r6)
            com.google.common.util.concurrent.bg r5 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r4 = r4.mo46039a(r2, r5)
            java.lang.String r5 = "transform: (T) -> Pair<T…   directExecutor()\n    )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r0.f105757a = r6
            r0.f105759c = r3
            java.lang.Object r4 = kotlinx.coroutines.p5578d.C71663i.m104690c(r4, r0)
            if (r4 == r1) goto L_0x005b
            r4 = r6
        L_0x0054:
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4
            java.lang.Object r4 = r4.get()
            return r4
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40265ae.m69885d(com.google.android.libraries.storage.protostore.ab, h.f.a.l, h.c.g):java.lang.Object");
    }
}
