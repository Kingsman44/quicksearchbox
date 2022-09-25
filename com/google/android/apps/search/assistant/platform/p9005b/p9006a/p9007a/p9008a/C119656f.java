package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import java.io.Closeable;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.a.a.f */
/* compiled from: PG */
public final class C119656f implements Closeable {

    /* renamed from: a */
    private final C119908e f333450a;

    public C119656f(C119908e eVar) {
        this.f333450a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104471a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a.C119655e
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.platform.b.a.a.a.e r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a.C119655e) r0
            int r1 = r0.f333449c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f333449c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.b.a.a.a.e r0 = new com.google.android.apps.search.assistant.platform.b.a.a.a.e
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f333447a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f333449c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.assistant.platform.b.a.e r5 = r4.f333450a
            com.google.common.util.concurrent.cx r5 = r5.mo104299a()
            java.lang.String r2 = "session.commit()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f333449c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            java.lang.String r0 = "session.commit().await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a.C119656f.mo104471a(h.c.g):java.lang.Object");
    }

    public final void close() {
        this.f333450a.mo104300b();
    }
}
