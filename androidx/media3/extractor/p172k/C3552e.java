package androidx.media3.extractor.p172k;

import android.support.p033v7.widget.LinearLayoutManager;
import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3627q;
import java.io.EOFException;

/* renamed from: androidx.media3.extractor.k.e */
/* compiled from: PG */
public final class C3552e implements C3326aa {

    /* renamed from: a */
    private final int f11142a;

    /* renamed from: b */
    private final C3553f f11143b;

    /* renamed from: c */
    private final C2604ac f11144c;

    /* renamed from: d */
    private final C2604ac f11145d;

    /* renamed from: e */
    private final C2603ab f11146e;

    /* renamed from: f */
    private C3329ad f11147f;

    /* renamed from: g */
    private long f11148g;

    /* renamed from: h */
    private long f11149h;

    /* renamed from: i */
    private int f11150i;

    /* renamed from: j */
    private boolean f11151j;

    /* renamed from: k */
    private boolean f11152k;

    /* renamed from: l */
    private boolean f11153l;

    public C3552e() {
        this(0);
    }

    /* renamed from: f */
    private final int m10245f(C3327ab abVar) {
        C3627q qVar;
        int i = 0;
        while (true) {
            qVar = (C3627q) abVar;
            qVar.mo7320o(this.f11145d.f7234a, 0, 10, false);
            this.f11145d.mo6131A(0);
            if (this.f11145d.mo6140h() != 4801587) {
                break;
            }
            C2604ac acVar = this.f11145d;
            acVar.mo6131A(acVar.f7235b + 3);
            int f = this.f11145d.mo6138f();
            i += f + 10;
            qVar.mo7319n(f, false);
        }
        qVar.f11568e = 0;
        qVar.mo7319n(i, false);
        if (this.f11149h == -1) {
            this.f11149h = (long) i;
        }
        return i;
    }

    /* renamed from: g */
    private final void m10246g(C3327ab abVar) {
        if (!this.f11151j) {
            this.f11150i = -1;
            C3627q qVar = (C3627q) abVar;
            qVar.f11568e = 0;
            long j = 0;
            if (qVar.f11566c == 0) {
                m10245f(abVar);
            }
            int i = 0;
            while (true) {
                try {
                    if (!abVar.mo7320o(this.f11145d.f7234a, 0, 2, true)) {
                        break;
                    }
                    this.f11145d.mo6131A(0);
                    if (!C3553f.m10252f(this.f11145d.mo6142j())) {
                        i = 0;
                        break;
                    } else if (!abVar.mo7320o(this.f11145d.f7234a, 0, 4, true)) {
                        break;
                    } else {
                        this.f11146e.mo6124i(14);
                        int d = this.f11146e.mo6119d(13);
                        if (d > 6) {
                            j += (long) d;
                            i++;
                            if (i != 1000) {
                                if (!abVar.mo7319n(d - 6, true)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            this.f11151j = true;
                            throw C2599az.m6819a("Malformed ADTS stream", (Throwable) null);
                        }
                    }
                } catch (EOFException unused) {
                }
            }
            qVar.f11568e = 0;
            if (i > 0) {
                this.f11150i = (int) (j / ((long) i));
            } else {
                this.f11150i = -1;
            }
            this.f11151j = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r19, androidx.media3.extractor.C3350ay r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.media3.extractor.ad r2 = r0.f11147f
            androidx.media3.common.p136b.C2601a.m6829a(r2)
            r2 = r1
            androidx.media3.extractor.q r2 = (androidx.media3.extractor.C3627q) r2
            long r2 = r2.f11565b
            int r4 = r0.f11142a
            r5 = r4 & 2
            r6 = 1
            if (r5 != 0) goto L_0x0021
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0024
            r4 = -1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r9 = r4
            goto L_0x0025
        L_0x0021:
            r18.m10246g(r19)
        L_0x0024:
            r9 = r2
        L_0x0025:
            androidx.media3.common.b.ac r2 = r0.f11144c
            byte[] r2 = r2.f7234a
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 0
            int r1 = r1.mo5879a(r2, r4, r3)
            boolean r2 = r0.f11153l
            r3 = -1
            if (r2 != 0) goto L_0x007f
            int r2 = r0.f11142a
            r5 = r2 & 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == 0) goto L_0x0071
            int r14 = r0.f11150i
            if (r14 <= 0) goto L_0x0071
            androidx.media3.extractor.k.f r5 = r0.f11143b
            long r11 = r5.f11155a
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0050
            if (r1 == r3) goto L_0x004f
            goto L_0x007f
        L_0x004f:
            r1 = -1
        L_0x0050:
            int r5 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0071
            androidx.media3.extractor.ad r5 = r0.f11147f
            r2 = r2 & 2
            if (r2 == 0) goto L_0x005c
            r15 = 1
            goto L_0x005d
        L_0x005c:
            r15 = 0
        L_0x005d:
            long r7 = (long) r14
            r16 = 8000000(0x7a1200, double:3.952525E-317)
            long r7 = r7 * r16
            long r7 = r7 / r11
            androidx.media3.extractor.p r2 = new androidx.media3.extractor.p
            long r11 = r0.f11149h
            int r13 = (int) r7
            r8 = r2
            r8.<init>(r9, r11, r13, r14, r15)
            r5.mo6989q(r2)
            goto L_0x007d
        L_0x0071:
            androidx.media3.extractor.ad r2 = r0.f11147f
            androidx.media3.extractor.ba r5 = new androidx.media3.extractor.ba
            r9 = 0
            r5.<init>(r7, r9)
            r2.mo6989q(r5)
        L_0x007d:
            r0.f11153l = r6
        L_0x007f:
            if (r1 != r3) goto L_0x0082
            return r3
        L_0x0082:
            androidx.media3.common.b.ac r2 = r0.f11144c
            r2.mo6131A(r4)
            androidx.media3.common.b.ac r2 = r0.f11144c
            r2.mo6158z(r1)
            boolean r1 = r0.f11152k
            if (r1 != 0) goto L_0x009a
            androidx.media3.extractor.k.f r1 = r0.f11143b
            long r2 = r0.f11148g
            r5 = 4
            r1.mo7469d(r2, r5)
            r0.f11152k = r6
        L_0x009a:
            androidx.media3.extractor.k.f r1 = r0.f11143b
            androidx.media3.common.b.ac r2 = r0.f11144c
            r1.mo7466a(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p172k.C3552e.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        this.f11152k = false;
        this.f11143b.mo7470e();
        this.f11148g = j2;
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        int f = m10245f(abVar);
        int i = f;
        int i2 = 0;
        int i3 = 0;
        do {
            C3627q qVar = (C3627q) abVar;
            qVar.mo7320o(this.f11145d.f7234a, 0, 2, false);
            this.f11145d.mo6131A(0);
            if (!C3553f.m10252f(this.f11145d.mo6142j())) {
                i++;
                qVar.f11568e = 0;
                qVar.mo7319n(i, false);
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                qVar.mo7320o(this.f11145d.f7234a, 0, 4, false);
                this.f11146e.mo6124i(14);
                int d = this.f11146e.mo6119d(13);
                if (d <= 6) {
                    i++;
                    qVar.f11568e = 0;
                    qVar.mo7319n(i, false);
                } else {
                    qVar.mo7319n(d - 6, false);
                    i3 += d;
                }
            }
            i2 = 0;
            i3 = 0;
        } while (i - f < 8192);
        return false;
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f11147f = adVar;
        this.f11143b.mo7467b(adVar, new C3545ar(LinearLayoutManager.INVALID_OFFSET, 0, 1));
        adVar.mo6988fa();
    }

    public C3552e(int i) {
        this.f11142a = (i & 2) != 0 ? i | 1 : i;
        this.f11143b = new C3553f(true, (String) null);
        this.f11144c = new C2604ac(2048);
        this.f11150i = -1;
        this.f11149h = -1;
        C2604ac acVar = new C2604ac(10);
        this.f11145d = acVar;
        byte[] bArr = acVar.f7234a;
        this.f11146e = new C2603ab(bArr, bArr.length);
    }
}
