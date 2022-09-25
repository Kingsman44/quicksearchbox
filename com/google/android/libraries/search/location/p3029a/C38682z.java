package com.google.android.libraries.search.location.p3029a;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.location.a.z */
/* compiled from: PG */
public final /* synthetic */ class C38682z implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f102154a;

    /* renamed from: b */
    public final /* synthetic */ C38632bx f102155b;

    public /* synthetic */ C38682z(C60870cx cxVar, C38632bx bxVar) {
        this.f102154a = cxVar;
        this.f102155b = bxVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r1 != 4) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r1 != 2) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            com.google.common.util.concurrent.cx r0 = r8.f102154a
            com.google.android.libraries.search.location.a.bx r1 = r8.f102155b
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r0)
            com.google.android.libraries.search.location.a.c r0 = (com.google.android.libraries.search.location.p3029a.C38635c) r0
            com.google.android.libraries.search.location.a.aj r2 = com.google.android.libraries.search.location.p3029a.C38590aj.CONSENT_REASON_UNKNOWN
            int r2 = r0.f102092b
            com.google.android.libraries.search.location.a.aj r2 = com.google.android.libraries.search.location.p3029a.C38590aj.m67896a(r2)
            if (r2 != 0) goto L_0x0016
            com.google.android.libraries.search.location.a.aj r2 = com.google.android.libraries.search.location.p3029a.C38590aj.CONSENT_REASON_UNKNOWN
        L_0x0016:
            int r2 = r2.ordinal()
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r6) goto L_0x004e
            r7 = 4
            if (r2 == r5) goto L_0x0035
            if (r2 == r3) goto L_0x0041
            if (r2 == r7) goto L_0x004e
            r7 = 5
            if (r2 != r7) goto L_0x002d
            goto L_0x0041
        L_0x002d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "impossible"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            int r1 = r1.f102082b
            int r1 = com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56739o.m88221a(r1)
            if (r1 != 0) goto L_0x003e
            goto L_0x004e
        L_0x003e:
            if (r1 != r7) goto L_0x004e
            goto L_0x004d
        L_0x0041:
            int r1 = r1.f102082b
            int r1 = com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56739o.m88221a(r1)
            if (r1 != 0) goto L_0x004a
            goto L_0x004d
        L_0x004a:
            if (r1 != r5) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            boolean r1 = r0.f102093c
            int r0 = r0.f102092b
            com.google.android.libraries.search.location.a.aj r0 = com.google.android.libraries.search.location.p3029a.C38590aj.m67896a(r0)
            if (r0 != 0) goto L_0x005a
            com.google.android.libraries.search.location.a.aj r0 = com.google.android.libraries.search.location.p3029a.C38590aj.CONSENT_REASON_UNKNOWN
        L_0x005a:
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x0068
            if (r0 == r5) goto L_0x0065
            com.google.android.libraries.search.location.a.by r0 = com.google.android.libraries.search.location.p3029a.C38633by.ASK_EVERY_TIME
            goto L_0x006a
        L_0x0065:
            com.google.android.libraries.search.location.a.by r0 = com.google.android.libraries.search.location.p3029a.C38633by.DO_NOT_USE
            goto L_0x006a
        L_0x0068:
            com.google.android.libraries.search.location.a.by r0 = com.google.android.libraries.search.location.p3029a.C38633by.ALWAYS_USE
        L_0x006a:
            if (r1 == 0) goto L_0x0089
            com.google.bv.b.a.a.l.j r2 = com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j.f151421c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bv.b.a.a.l.i r2 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56733i) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.bv.b.a.a.l.j r3 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j) r3
            r3.f151424b = r6
            int r5 = r3.f151423a
            r5 = r5 | r6
            r3.f151423a = r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.bv.b.a.a.l.j r2 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j) r2
            goto L_0x00c4
        L_0x0089:
            if (r4 == 0) goto L_0x00a8
            com.google.bv.b.a.a.l.j r2 = com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j.f151421c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bv.b.a.a.l.i r2 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56733i) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.bv.b.a.a.l.j r5 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j) r5
            r5.f151424b = r3
            int r3 = r5.f151423a
            r3 = r3 | r6
            r5.f151423a = r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.bv.b.a.a.l.j r2 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j) r2
            goto L_0x00c4
        L_0x00a8:
            com.google.bv.b.a.a.l.j r2 = com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j.f151421c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bv.b.a.a.l.i r2 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56733i) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.bv.b.a.a.l.j r3 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j) r3
            r3.f151424b = r5
            int r5 = r3.f151423a
            r5 = r5 | r6
            r3.f151423a = r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.bv.b.a.a.l.j r2 = (com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56734j) r2
        L_0x00c4:
            com.google.android.libraries.search.location.a.ae r0 = com.google.android.libraries.search.location.p3029a.C38585ae.m67873g(r4, r1, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.location.p3029a.C38682z.call():java.lang.Object");
    }
}
