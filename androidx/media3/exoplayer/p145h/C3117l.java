package androidx.media3.exoplayer.p145h;

import android.os.Handler;

/* renamed from: androidx.media3.exoplayer.h.l */
/* compiled from: PG */
public final /* synthetic */ class C3117l implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C3128w f9135a;

    public /* synthetic */ C3117l(C3128w wVar) {
        this.f9135a = wVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d9 A[LOOP:1: B:28:0x00d7->B:29:0x00d9, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            androidx.media3.exoplayer.h.w r0 = r8.f9135a
            int r1 = r9.what
            r2 = 1
            if (r1 == 0) goto L_0x0104
            if (r1 == r2) goto L_0x00aa
            r3 = 2
            if (r1 == r3) goto L_0x003e
            r3 = 3
            if (r1 == r3) goto L_0x002b
            r3 = 4
            if (r1 == r3) goto L_0x0026
            r3 = 5
            if (r1 != r3) goto L_0x0020
            java.lang.Object r9 = r9.obj
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            java.util.Set r9 = (java.util.Set) r9
            r0.mo7116J(r9)
            goto L_0x012a
        L_0x0020:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x0026:
            r0.mo7119M()
            goto L_0x012a
        L_0x002b:
            java.lang.Object r9 = r9.obj
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            androidx.media3.exoplayer.h.q r9 = (androidx.media3.exoplayer.p145h.C3122q) r9
            java.lang.Object r1 = r9.f9150b
            androidx.media3.exoplayer.h.ci r1 = (androidx.media3.exoplayer.p145h.C3098ci) r1
            r0.f9178d = r1
            androidx.media3.exoplayer.h.o r9 = r9.f9151c
            r0.mo7120N()
            goto L_0x012a
        L_0x003e:
            java.lang.Object r9 = r9.obj
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            androidx.media3.exoplayer.h.q r9 = (androidx.media3.exoplayer.p145h.C3122q) r9
            androidx.media3.exoplayer.h.ci r1 = r0.f9178d
            int r3 = r9.f9149a
            int r4 = r3 + 1
            androidx.media3.exoplayer.h.ci r1 = r1.mo7092c(r3, r4)
            r0.f9178d = r1
            androidx.media3.exoplayer.h.ci r1 = r0.f9178d
            java.lang.Object r3 = r9.f9150b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            androidx.media3.exoplayer.h.ci r1 = r1.mo7091b(r3, r2)
            r0.f9178d = r1
            int r1 = r9.f9149a
            java.lang.Object r3 = r9.f9150b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = java.lang.Math.min(r1, r3)
            int r5 = java.lang.Math.max(r1, r3)
            java.util.List r6 = r0.f9176b
            java.lang.Object r6 = r6.get(r4)
            androidx.media3.exoplayer.h.p r6 = (androidx.media3.exoplayer.p145h.C3121p) r6
            int r6 = r6.f9147e
            java.util.List r7 = r0.f9176b
            java.lang.Object r1 = r7.remove(r1)
            androidx.media3.exoplayer.h.p r1 = (androidx.media3.exoplayer.p145h.C3121p) r1
            r7.add(r3, r1)
        L_0x0087:
            if (r4 > r5) goto L_0x00a3
            java.util.List r1 = r0.f9176b
            java.lang.Object r1 = r1.get(r4)
            androidx.media3.exoplayer.h.p r1 = (androidx.media3.exoplayer.p145h.C3121p) r1
            r1.f9146d = r4
            r1.f9147e = r6
            androidx.media3.exoplayer.h.an r1 = r1.f9143a
            androidx.media3.exoplayer.h.al r1 = r1.f8786a
            androidx.media3.common.bm r1 = r1.f8765a
            int r1 = r1.mo6022c()
            int r6 = r6 + r1
            int r4 = r4 + 1
            goto L_0x0087
        L_0x00a3:
            androidx.media3.exoplayer.h.o r9 = r9.f9151c
            r0.mo7120N()
            goto L_0x012a
        L_0x00aa:
            java.lang.Object r9 = r9.obj
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            androidx.media3.exoplayer.h.q r9 = (androidx.media3.exoplayer.p145h.C3122q) r9
            int r1 = r9.f9149a
            java.lang.Object r3 = r9.f9150b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r1 != 0) goto L_0x00cc
            androidx.media3.exoplayer.h.ci r1 = r0.f9178d
            int[] r4 = r1.f9065a
            int r4 = r4.length
            r5 = 0
            if (r3 != r4) goto L_0x00cb
            androidx.media3.exoplayer.h.ci r1 = r1.mo7090a()
            r0.f9178d = r1
            goto L_0x00d5
        L_0x00cb:
            r1 = 0
        L_0x00cc:
            androidx.media3.exoplayer.h.ci r4 = r0.f9178d
            androidx.media3.exoplayer.h.ci r4 = r4.mo7092c(r1, r3)
            r0.f9178d = r4
            r5 = r1
        L_0x00d5:
            r1 = -1
            int r3 = r3 + r1
        L_0x00d7:
            if (r3 < r5) goto L_0x00fe
            java.util.List r4 = r0.f9176b
            java.lang.Object r4 = r4.remove(r3)
            androidx.media3.exoplayer.h.p r4 = (androidx.media3.exoplayer.p145h.C3121p) r4
            java.util.Map r6 = r0.f9177c
            java.lang.Object r7 = r4.f9144b
            r6.remove(r7)
            androidx.media3.exoplayer.h.an r6 = r4.f9143a
            androidx.media3.exoplayer.h.al r6 = r6.f8786a
            androidx.media3.common.bm r6 = r6.f8765a
            int r6 = r6.mo6022c()
            int r6 = -r6
            r0.mo7115I(r3, r1, r6)
            r4.f9148f = r2
            r0.mo7117K(r4)
            int r3 = r3 + -1
            goto L_0x00d7
        L_0x00fe:
            androidx.media3.exoplayer.h.o r9 = r9.f9151c
            r0.mo7120N()
            goto L_0x012a
        L_0x0104:
            java.lang.Object r9 = r9.obj
            int r1 = androidx.media3.common.p136b.C2612ak.f7249a
            androidx.media3.exoplayer.h.q r9 = (androidx.media3.exoplayer.p145h.C3122q) r9
            androidx.media3.exoplayer.h.ci r1 = r0.f9178d
            int r3 = r9.f9149a
            java.lang.Object r4 = r9.f9150b
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            androidx.media3.exoplayer.h.ci r1 = r1.mo7091b(r3, r4)
            r0.f9178d = r1
            int r1 = r9.f9149a
            java.lang.Object r3 = r9.f9150b
            java.util.Collection r3 = (java.util.Collection) r3
            r0.mo7114H(r1, r3)
            androidx.media3.exoplayer.h.o r9 = r9.f9151c
            r0.mo7120N()
        L_0x012a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3117l.handleMessage(android.os.Message):boolean");
    }
}
