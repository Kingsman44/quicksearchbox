package androidx.media3.extractor.p154a;

import androidx.media3.common.C2599az;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.C3363ba;
import androidx.media3.extractor.C3364bb;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3626p;
import androidx.media3.extractor.C3627q;
import java.util.Arrays;

/* renamed from: androidx.media3.extractor.a.a */
/* compiled from: PG */
public final class C3325a implements C3326aa {

    /* renamed from: a */
    private static final int[] f10033a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: b */
    private static final int[] f10034b;

    /* renamed from: c */
    private static final byte[] f10035c = C2612ak.m6961ak("#!AMR\n");

    /* renamed from: d */
    private static final byte[] f10036d = C2612ak.m6961ak("#!AMR-WB\n");

    /* renamed from: e */
    private static final int f10037e;

    /* renamed from: f */
    private final byte[] f10038f;

    /* renamed from: g */
    private final int f10039g;

    /* renamed from: h */
    private boolean f10040h;

    /* renamed from: i */
    private long f10041i;

    /* renamed from: j */
    private int f10042j;

    /* renamed from: k */
    private int f10043k;

    /* renamed from: l */
    private boolean f10044l;

    /* renamed from: m */
    private long f10045m;

    /* renamed from: n */
    private int f10046n;

    /* renamed from: o */
    private int f10047o;

    /* renamed from: p */
    private long f10048p;

    /* renamed from: q */
    private C3329ad f10049q;

    /* renamed from: r */
    private C3368bf f10050r;

    /* renamed from: s */
    private C3364bb f10051s;

    /* renamed from: t */
    private boolean f10052t;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f10034b = iArr;
        f10037e = iArr[8];
    }

    public C3325a() {
        this(0);
    }

    public C3325a(int i) {
        this.f10039g = i;
        this.f10038f = new byte[1];
        this.f10046n = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[Catch:{ EOFException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[Catch:{ EOFException -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m9613f(androidx.media3.extractor.C3327ab r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Illegal AMR "
            java.lang.String r1 = "Invalid padding bits for frame header "
            int r2 = r13.f10043k
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x0095
            r2 = r14
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2     // Catch:{ EOFException -> 0x0094 }
            r2.f11568e = r5     // Catch:{ EOFException -> 0x0094 }
            byte[] r2 = r13.f10038f     // Catch:{ EOFException -> 0x0094 }
            r6 = r14
            androidx.media3.extractor.q r6 = (androidx.media3.extractor.C3627q) r6     // Catch:{ EOFException -> 0x0094 }
            r6.mo7320o(r2, r5, r4, r5)     // Catch:{ EOFException -> 0x0094 }
            byte[] r2 = r13.f10038f     // Catch:{ EOFException -> 0x0094 }
            byte r2 = r2[r5]     // Catch:{ EOFException -> 0x0094 }
            r6 = r2 & 131(0x83, float:1.84E-43)
            r7 = 0
            if (r6 > 0) goto L_0x0083
            int r1 = r2 >> 3
            r1 = r1 & 15
            boolean r2 = r13.f10040h     // Catch:{ EOFException -> 0x0094 }
            if (r2 == 0) goto L_0x0032
            r6 = 10
            if (r1 < r6) goto L_0x003d
            r6 = 13
            if (r1 <= r6) goto L_0x0032
            goto L_0x003d
        L_0x0032:
            if (r2 != 0) goto L_0x0063
            r6 = 12
            if (r1 < r6) goto L_0x003d
            r6 = 14
            if (r1 > r6) goto L_0x003d
            goto L_0x0063
        L_0x003d:
            if (r2 == 0) goto L_0x0044
            int[] r0 = f10034b     // Catch:{ EOFException -> 0x0094 }
            r0 = r0[r1]     // Catch:{ EOFException -> 0x0094 }
            goto L_0x0048
        L_0x0044:
            int[] r0 = f10033a     // Catch:{ EOFException -> 0x0094 }
            r0 = r0[r1]     // Catch:{ EOFException -> 0x0094 }
        L_0x0048:
            r2 = r0
            r13.f10042j = r2     // Catch:{ EOFException -> 0x0094 }
            r13.f10043k = r2
            int r0 = r13.f10046n
            if (r0 != r3) goto L_0x005b
            r0 = r14
            androidx.media3.extractor.q r0 = (androidx.media3.extractor.C3627q) r0
            long r0 = r0.f11566c
            r13.f10045m = r0
            r13.f10046n = r2
            r0 = r2
        L_0x005b:
            if (r0 != r2) goto L_0x0095
            int r0 = r13.f10047o
            int r0 = r0 + r4
            r13.f10047o = r0
            goto L_0x0095
        L_0x0063:
            java.lang.String r14 = "WB"
            java.lang.String r5 = "NB"
            if (r4 == r2) goto L_0x006a
            r14 = r5
        L_0x006a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0094 }
            r2.<init>(r0)     // Catch:{ EOFException -> 0x0094 }
            r2.append(r14)     // Catch:{ EOFException -> 0x0094 }
            java.lang.String r14 = " frame type "
            r2.append(r14)     // Catch:{ EOFException -> 0x0094 }
            r2.append(r1)     // Catch:{ EOFException -> 0x0094 }
            java.lang.String r14 = r2.toString()     // Catch:{ EOFException -> 0x0094 }
            androidx.media3.common.az r14 = androidx.media3.common.C2599az.m6819a(r14, r7)     // Catch:{ EOFException -> 0x0094 }
            throw r14     // Catch:{ EOFException -> 0x0094 }
        L_0x0083:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0094 }
            r14.<init>(r1)     // Catch:{ EOFException -> 0x0094 }
            r14.append(r2)     // Catch:{ EOFException -> 0x0094 }
            java.lang.String r14 = r14.toString()     // Catch:{ EOFException -> 0x0094 }
            androidx.media3.common.az r14 = androidx.media3.common.C2599az.m6819a(r14, r7)     // Catch:{ EOFException -> 0x0094 }
            throw r14     // Catch:{ EOFException -> 0x0094 }
        L_0x0094:
            return r3
        L_0x0095:
            androidx.media3.extractor.bf r0 = r13.f10050r
            int r14 = r0.mo6849a(r14, r2, r4)
            if (r14 != r3) goto L_0x009e
            return r3
        L_0x009e:
            int r0 = r13.f10043k
            int r0 = r0 - r14
            r13.f10043k = r0
            if (r0 <= 0) goto L_0x00a6
            return r5
        L_0x00a6:
            androidx.media3.extractor.bf r6 = r13.f10050r
            long r0 = r13.f10048p
            long r2 = r13.f10041i
            long r7 = r0 + r2
            r9 = 1
            int r10 = r13.f10042j
            r11 = 0
            r12 = 0
            r6.mo6852d(r7, r9, r10, r11, r12)
            long r0 = r13.f10041i
            r2 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r2
            r13.f10041i = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p154a.C3325a.m9613f(androidx.media3.extractor.ab):int");
    }

    /* renamed from: g */
    private static boolean m9614g(C3327ab abVar, byte[] bArr) {
        C3627q qVar = (C3627q) abVar;
        qVar.f11568e = 0;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        qVar.mo7320o(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: h */
    private final boolean m9615h(C3327ab abVar) {
        byte[] bArr = f10035c;
        if (m9614g(abVar, bArr)) {
            this.f10040h = false;
            ((C3627q) abVar).mo7639q(bArr.length);
            return true;
        }
        byte[] bArr2 = f10036d;
        if (!m9614g(abVar, bArr2)) {
            return false;
        }
        this.f10040h = true;
        ((C3627q) abVar).mo7639q(bArr2.length);
        return true;
    }

    /* renamed from: a */
    public final int mo7152a(C3327ab abVar, C3350ay ayVar) {
        int i;
        C2601a.m6829a(this.f10050r);
        int i2 = C2612ak.f7249a;
        C3627q qVar = (C3627q) abVar;
        if (qVar.f11566c != 0 || m9615h(abVar)) {
            if (!this.f10052t) {
                this.f10052t = true;
                boolean z = this.f10040h;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i3 = true != z ? 8000 : 16000;
                C3368bf bfVar = this.f10050r;
                C2679w wVar = new C2679w();
                wVar.f7459k = str;
                wVar.f7460l = f10037e;
                wVar.f7472x = 1;
                wVar.f7473y = i3;
                bfVar.mo6850b(new C2680x(wVar));
            }
            int f = m9613f(abVar);
            long j = qVar.f11565b;
            if (!this.f10044l) {
                if (this.f10039g == 0 || j == -1 || !((i = this.f10046n) == -1 || i == this.f10042j)) {
                    C3363ba baVar = new C3363ba(-9223372036854775807L, 0);
                    this.f10051s = baVar;
                    this.f10049q.mo6989q(baVar);
                    this.f10044l = true;
                } else if (this.f10047o >= 20 || f == -1) {
                    C3626p pVar = new C3626p(j, this.f10045m, (int) ((((long) i) * 8000000) / 20000), i, false);
                    this.f10051s = pVar;
                    this.f10049q.mo6989q(pVar);
                    this.f10044l = true;
                }
            }
            return f;
        }
        throw C2599az.m6819a("Could not find AMR header.", (Throwable) null);
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        this.f10041i = 0;
        this.f10042j = 0;
        this.f10043k = 0;
        if (j != 0) {
            C3364bb bbVar = this.f10051s;
            if (bbVar instanceof C3626p) {
                this.f10048p = ((C3626p) bbVar).mo7634d(j);
                return;
            }
        }
        this.f10048p = 0;
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        return m9615h(abVar);
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f10049q = adVar;
        this.f10050r = adVar.mo6987eZ(0, 1);
        adVar.mo6988fa();
    }
}
