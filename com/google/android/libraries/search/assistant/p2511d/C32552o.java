package com.google.android.libraries.search.assistant.p2511d;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.d.o */
/* compiled from: PG */
public final class C32552o implements C71422aw {

    /* renamed from: a */
    private final /* synthetic */ C71422aw f87183a;

    /* renamed from: b */
    private final AtomicBoolean f87184b = new AtomicBoolean(false);

    /* renamed from: c */
    private final C71816z f87185c;

    public C32552o(C71422aw awVar, C71816z zVar) {
        C69664n.m101061g(awVar, "delegateScope");
        this.f87185c = zVar;
        this.f87183a = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38144b(java.lang.Object r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.p2511d.C32551n
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.d.n r0 = (com.google.android.libraries.search.assistant.p2511d.C32551n) r0
            int r1 = r0.f87182c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87182c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.d.n r0 = new com.google.android.libraries.search.assistant.d.n
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f87180a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87182c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002b:
            p5462h.C69714l.m101134b(r6)
            goto L_0x0048
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r4.f87184b
            boolean r6 = r6.getAndSet(r3)
            if (r6 != 0) goto L_0x004e
            kotlinx.coroutines.z r6 = r4.f87185c
            r6.mo62909P(r5)
            r0.f87182c = r3
            java.lang.Object r5 = kotlinx.coroutines.C71608bi.m104550b(r0)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            h.e r5 = new h.e
            r5.<init>()
            throw r5
        L_0x004e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "completeAndAwaitClose was called multiple times"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2511d.C32552o.mo38144b(java.lang.Object, h.c.g):java.lang.Object");
    }

    /* renamed from: lZ */
    public final C69585o mo5702lZ() {
        return this.f87183a.mo5702lZ();
    }
}
