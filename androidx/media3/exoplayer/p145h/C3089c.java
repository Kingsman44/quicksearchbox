package androidx.media3.exoplayer.p145h;

import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3331af;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.exoplayer.h.c */
/* compiled from: PG */
public final class C3089c implements C3073bk {

    /* renamed from: a */
    public C3326aa f9019a;

    /* renamed from: b */
    public C3327ab f9020b;

    /* renamed from: c */
    private final C3331af f9021c;

    public C3089c(C3331af afVar) {
        this.f9021c = afVar;
    }

    /* renamed from: a */
    public final long mo7042a() {
        C3327ab abVar = this.f9020b;
        if (abVar != null) {
            return ((C3627q) abVar).f11566c;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r0.f11566c != r11) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        if (r0.f11566c != r11) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        r0 = false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7043b(androidx.media3.common.C2671o r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, androidx.media3.extractor.C3329ad r15) {
        /*
            r7 = this;
            androidx.media3.extractor.q r6 = new androidx.media3.extractor.q
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f9020b = r6
            androidx.media3.extractor.aa r8 = r7.f9019a
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            androidx.media3.extractor.af r8 = r7.f9021c
            androidx.media3.extractor.aa[] r8 = r8.mo7323b(r9, r10)
            int r9 = r8.length
            r10 = 0
            r13 = 1
            if (r9 != r13) goto L_0x0020
            r8 = r8[r10]
            r7.f9019a = r8
            goto L_0x0076
        L_0x0020:
            r14 = 0
        L_0x0021:
            if (r14 >= r9) goto L_0x0072
            r0 = r8[r14]
            boolean r1 = r0.mo7155e(r6)     // Catch:{ EOFException -> 0x005b, all -> 0x0048 }
            if (r1 == 0) goto L_0x003d
            r7.f9019a = r0     // Catch:{ EOFException -> 0x005b, all -> 0x0048 }
            if (r0 != 0) goto L_0x0037
            long r0 = r6.f11566c
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r13 = 0
        L_0x0037:
            androidx.media3.common.p136b.C2601a.m6832d(r13)
            r6.f11568e = r10
            goto L_0x0072
        L_0x003d:
            androidx.media3.extractor.aa r0 = r7.f9019a
            if (r0 != 0) goto L_0x0069
            long r0 = r6.f11566c
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            goto L_0x0069
        L_0x0048:
            r8 = move-exception
            androidx.media3.extractor.aa r9 = r7.f9019a
            if (r9 != 0) goto L_0x0055
            long r14 = r6.f11566c
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r13 = 0
        L_0x0055:
            androidx.media3.common.p136b.C2601a.m6832d(r13)
            r6.f11568e = r10
            throw r8
        L_0x005b:
            androidx.media3.extractor.aa r0 = r7.f9019a
            if (r0 != 0) goto L_0x0069
            long r0 = r6.f11566c
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r0 = 0
            goto L_0x006a
        L_0x0069:
            r0 = 1
        L_0x006a:
            androidx.media3.common.p136b.C2601a.m6832d(r0)
            r6.f11568e = r10
            int r14 = r14 + 1
            goto L_0x0021
        L_0x0072:
            androidx.media3.extractor.aa r9 = r7.f9019a
            if (r9 == 0) goto L_0x007c
        L_0x0076:
            androidx.media3.extractor.aa r8 = r7.f9019a
            r8.mo7156s(r15)
            return
        L_0x007c:
            androidx.media3.exoplayer.h.cs r9 = new androidx.media3.exoplayer.h.cs
            java.lang.String r8 = androidx.media3.common.p136b.C2612ak.m6932O(r8)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "None of the available extractors ("
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = ") could read the stream."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            goto L_0x009a
        L_0x0099:
            throw r9
        L_0x009a:
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.p145h.C3089c.mo7043b(androidx.media3.common.o, android.net.Uri, java.util.Map, long, long, androidx.media3.extractor.ad):void");
    }
}
