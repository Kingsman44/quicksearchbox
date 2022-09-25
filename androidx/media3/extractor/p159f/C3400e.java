package androidx.media3.extractor.p159f;

import android.util.SparseArray;
import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2634v;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3347av;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3369bg;
import androidx.media3.extractor.C3627q;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.f.e */
/* compiled from: PG */
public final class C3400e implements C3326aa {

    /* renamed from: a */
    public static final byte[] f10348a = C2612ak.m6961ak("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: b */
    public static final UUID f10349b = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: c */
    public static final Map f10350c;

    /* renamed from: d */
    private static final byte[] f10351d = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e */
    private static final byte[] f10352e = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: f */
    private static final byte[] f10353f = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: A */
    private boolean f10354A;

    /* renamed from: B */
    private int f10355B;

    /* renamed from: C */
    private long f10356C;

    /* renamed from: D */
    private boolean f10357D;

    /* renamed from: E */
    private long f10358E;

    /* renamed from: F */
    private long f10359F;

    /* renamed from: G */
    private long f10360G;

    /* renamed from: H */
    private C2634v f10361H;

    /* renamed from: I */
    private C2634v f10362I;

    /* renamed from: J */
    private boolean f10363J;

    /* renamed from: K */
    private boolean f10364K;

    /* renamed from: L */
    private int f10365L;

    /* renamed from: M */
    private long f10366M;

    /* renamed from: N */
    private long f10367N;

    /* renamed from: O */
    private int f10368O;

    /* renamed from: P */
    private int f10369P;

    /* renamed from: Q */
    private int[] f10370Q;

    /* renamed from: R */
    private int f10371R;

    /* renamed from: S */
    private int f10372S;

    /* renamed from: T */
    private int f10373T;

    /* renamed from: U */
    private int f10374U;

    /* renamed from: V */
    private boolean f10375V;

    /* renamed from: W */
    private long f10376W;

    /* renamed from: X */
    private int f10377X;

    /* renamed from: Y */
    private int f10378Y;

    /* renamed from: Z */
    private int f10379Z;

    /* renamed from: aa */
    private boolean f10380aa;

    /* renamed from: ab */
    private boolean f10381ab;

    /* renamed from: ac */
    private boolean f10382ac;

    /* renamed from: ad */
    private int f10383ad;

    /* renamed from: ae */
    private byte f10384ae;

    /* renamed from: af */
    private boolean f10385af;

    /* renamed from: ag */
    private C3329ad f10386ag;

    /* renamed from: ah */
    private final C3397b f10387ah;

    /* renamed from: g */
    private final C3402g f10388g;

    /* renamed from: h */
    private final SparseArray f10389h;

    /* renamed from: i */
    private final boolean f10390i;

    /* renamed from: j */
    private final C2604ac f10391j;

    /* renamed from: k */
    private final C2604ac f10392k;

    /* renamed from: l */
    private final C2604ac f10393l;

    /* renamed from: m */
    private final C2604ac f10394m;

    /* renamed from: n */
    private final C2604ac f10395n;

    /* renamed from: o */
    private final C2604ac f10396o;

    /* renamed from: p */
    private final C2604ac f10397p;

    /* renamed from: q */
    private final C2604ac f10398q;

    /* renamed from: r */
    private final C2604ac f10399r;

    /* renamed from: s */
    private final C2604ac f10400s;

    /* renamed from: t */
    private ByteBuffer f10401t;

    /* renamed from: u */
    private long f10402u;

    /* renamed from: v */
    private long f10403v;

    /* renamed from: w */
    private long f10404w;

    /* renamed from: x */
    private long f10405x;

    /* renamed from: y */
    private long f10406y;

    /* renamed from: z */
    private C3399d f10407z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f10350c = Collections.unmodifiableMap(hashMap);
    }

    public C3400e() {
        this(0);
    }

    /* renamed from: g */
    private final int m9822g(C3327ab abVar, C3399d dVar, int i, boolean z) {
        int i2;
        if ("S_TEXT/UTF8".equals(dVar.f10323b)) {
            m9830o(abVar, f10351d, i);
            int i3 = this.f10378Y;
            m9829n();
            return i3;
        } else if ("S_TEXT/ASS".equals(dVar.f10323b)) {
            m9830o(abVar, f10352e, i);
            int i4 = this.f10378Y;
            m9829n();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(dVar.f10323b)) {
            m9830o(abVar, f10353f, i);
            int i5 = this.f10378Y;
            m9829n();
            return i5;
        } else {
            C3368bf bfVar = dVar.f10320X;
            boolean z2 = true;
            if (!this.f10380aa) {
                if (dVar.f10329h) {
                    this.f10373T &= -1073741825;
                    int i6 = 128;
                    if (!this.f10381ab) {
                        ((C3627q) abVar).mo7321p(this.f10393l.f7234a, 0, 1, false);
                        this.f10377X++;
                        byte b = this.f10393l.f7234a[0];
                        if ((b & 128) != 128) {
                            this.f10384ae = b;
                            this.f10381ab = true;
                        } else {
                            throw C2599az.m6819a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b2 = this.f10384ae;
                    if ((b2 & 1) == 1) {
                        byte b3 = b2 & 2;
                        this.f10373T |= 1073741824;
                        if (!this.f10385af) {
                            ((C3627q) abVar).mo7321p(this.f10398q.f7234a, 0, 8, false);
                            this.f10377X += 8;
                            this.f10385af = true;
                            C2604ac acVar = this.f10393l;
                            byte[] bArr = acVar.f7234a;
                            if (b3 != 2) {
                                i6 = 0;
                            }
                            bArr[0] = (byte) (i6 | 8);
                            acVar.mo6131A(0);
                            bfVar.mo6854f(this.f10393l, 1);
                            this.f10378Y++;
                            this.f10398q.mo6131A(0);
                            bfVar.mo6854f(this.f10398q, 8);
                            this.f10378Y += 8;
                        }
                        if (b3 == 2) {
                            if (!this.f10382ac) {
                                ((C3627q) abVar).mo7321p(this.f10393l.f7234a, 0, 1, false);
                                this.f10377X++;
                                this.f10393l.mo6131A(0);
                                this.f10383ad = this.f10393l.mo6139g();
                                this.f10382ac = true;
                            }
                            int i7 = this.f10383ad * 4;
                            this.f10393l.mo6156x(i7);
                            ((C3627q) abVar).mo7321p(this.f10393l.f7234a, 0, i7, false);
                            this.f10377X += i7;
                            int i8 = (this.f10383ad >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.f10401t;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.f10401t = ByteBuffer.allocate(i9);
                            }
                            this.f10401t.position(0);
                            this.f10401t.putShort((short) i8);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i2 = this.f10383ad;
                                if (i10 >= i2) {
                                    break;
                                }
                                int i12 = this.f10393l.mo6141i();
                                if (i10 % 2 == 0) {
                                    this.f10401t.putShort((short) (i12 - i11));
                                } else {
                                    this.f10401t.putInt(i12 - i11);
                                }
                                i10++;
                                i11 = i12;
                            }
                            int i13 = (i - this.f10377X) - i11;
                            if ((i2 & 1) == 1) {
                                this.f10401t.putInt(i13);
                            } else {
                                this.f10401t.putShort((short) i13);
                                this.f10401t.putInt(0);
                            }
                            this.f10399r.mo6157y(this.f10401t.array(), i9);
                            bfVar.mo6854f(this.f10399r, i9);
                            this.f10378Y += i9;
                        }
                    }
                } else {
                    byte[] bArr2 = dVar.f10330i;
                    if (bArr2 != null) {
                        this.f10396o.mo6157y(bArr2, bArr2.length);
                    }
                }
                if (!"A_OPUS".equals(dVar.f10323b) ? dVar.f10327f > 0 : z) {
                    this.f10373T |= 268435456;
                    this.f10400s.mo6156x(0);
                    int i14 = (this.f10396o.f7236c + i) - this.f10377X;
                    this.f10393l.mo6156x(4);
                    C2604ac acVar2 = this.f10393l;
                    byte[] bArr3 = acVar2.f7234a;
                    bArr3[0] = (byte) ((i14 >> 24) & PrivateKeyType.INVALID);
                    bArr3[1] = (byte) ((i14 >> 16) & PrivateKeyType.INVALID);
                    bArr3[2] = (byte) ((i14 >> 8) & PrivateKeyType.INVALID);
                    bArr3[3] = (byte) (i14 & PrivateKeyType.INVALID);
                    bfVar.mo6854f(acVar2, 4);
                    this.f10378Y += 4;
                }
                this.f10380aa = true;
            }
            int i15 = i + this.f10396o.f7236c;
            if (!"V_MPEG4/ISO/AVC".equals(dVar.f10323b) && !"V_MPEGH/ISO/HEVC".equals(dVar.f10323b)) {
                if (dVar.f10316T != null) {
                    if (this.f10396o.f7236c != 0) {
                        z2 = false;
                    }
                    C2601a.m6832d(z2);
                    dVar.f10316T.mo7361d(abVar);
                }
                while (true) {
                    int i16 = this.f10377X;
                    if (i16 >= i15) {
                        break;
                    }
                    int h = m9823h(abVar, bfVar, i15 - i16);
                    this.f10377X += h;
                    this.f10378Y += h;
                }
            } else {
                byte[] bArr4 = this.f10392k.f7234a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i17 = dVar.f10321Y;
                int i18 = 4 - i17;
                while (this.f10377X < i15) {
                    int i19 = this.f10379Z;
                    if (i19 == 0) {
                        C2604ac acVar3 = this.f10396o;
                        int min = Math.min(i17, acVar3.f7236c - acVar3.f7235b);
                        ((C3627q) abVar).mo7321p(bArr4, i18 + min, i17 - min, false);
                        if (min > 0) {
                            this.f10396o.mo6155w(bArr4, i18, min);
                        }
                        this.f10377X += i17;
                        this.f10392k.mo6131A(0);
                        this.f10379Z = this.f10392k.mo6141i();
                        this.f10391j.mo6131A(0);
                        bfVar.mo6851c(this.f10391j, 4);
                        this.f10378Y += 4;
                    } else {
                        int h2 = m9823h(abVar, bfVar, i19);
                        this.f10377X += h2;
                        this.f10378Y += h2;
                        this.f10379Z -= h2;
                    }
                }
            }
            if ("A_VORBIS".equals(dVar.f10323b)) {
                this.f10394m.mo6131A(0);
                bfVar.mo6851c(this.f10394m, 4);
                this.f10378Y += 4;
            }
            int i20 = this.f10378Y;
            m9829n();
            return i20;
        }
    }

    /* renamed from: h */
    private final int m9823h(C3327ab abVar, C3368bf bfVar, int i) {
        C2604ac acVar = this.f10396o;
        int i2 = acVar.f7236c - acVar.f7235b;
        if (i2 <= 0) {
            return bfVar.mo6849a(abVar, i, false);
        }
        int min = Math.min(i, i2);
        bfVar.mo6851c(this.f10396o, min);
        return min;
    }

    /* renamed from: i */
    private final long m9824i(long j) {
        long j2 = this.f10404w;
        if (j2 != -9223372036854775807L) {
            return C2612ak.m7000y(j, j2, 1000);
        }
        throw C2599az.m6819a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    /* renamed from: j */
    private final void m9825j(int i) {
        if (this.f10361H == null || this.f10362I == null) {
            throw C2599az.m6819a("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* renamed from: k */
    private final void m9826k(int i) {
        if (this.f10407z == null) {
            throw C2599az.m6819a("Element " + i + " must be in a TrackEntry", (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d4 A[EDGE_INSN: B:58:0x00d4->B:48:0x00d4 ?: BREAK  , SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9827l(androidx.media3.extractor.p159f.C3399d r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.media3.extractor.bg r2 = r1.f10316T
            r9 = 1
            if (r2 == 0) goto L_0x001c
            androidx.media3.extractor.bf r3 = r1.f10320X
            androidx.media3.extractor.be r8 = r1.f10331j
            r1 = r2
            r2 = r3
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.mo7360c(r2, r3, r5, r6, r7, r8)
            goto L_0x010d
        L_0x001c:
            java.lang.String r2 = r1.f10323b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            java.lang.String r4 = "S_TEXT/WEBVTT"
            java.lang.String r5 = "S_TEXT/ASS"
            r6 = 0
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = r1.f10323b
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003b
            java.lang.String r2 = r1.f10323b
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0057
        L_0x003b:
            int r2 = r0.f10369P
            java.lang.String r7 = "MatroskaExtractor"
            if (r2 <= r9) goto L_0x0047
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            androidx.media3.common.p136b.C2633u.m7050e(r7, r2)
            goto L_0x0057
        L_0x0047:
            long r10 = r0.f10367N
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            androidx.media3.common.p136b.C2633u.m7050e(r7, r2)
        L_0x0057:
            r2 = r22
            goto L_0x00e3
        L_0x005b:
            java.lang.String r2 = r1.f10323b
            androidx.media3.common.b.ac r7 = r0.f10397p
            byte[] r7 = r7.f7234a
            int r8 = r2.hashCode()
            r12 = 738597099(0x2c0618eb, float:1.9056378E-12)
            r13 = 2
            if (r8 == r12) goto L_0x0086
            r5 = 1045209816(0x3e4ca2d8, float:0.19983995)
            if (r8 == r5) goto L_0x007e
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r8 == r4) goto L_0x0076
            goto L_0x008e
        L_0x0076:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008e
            r2 = 0
            goto L_0x008f
        L_0x007e:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x008e
            r2 = 2
            goto L_0x008f
        L_0x0086:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x008e
            r2 = 1
            goto L_0x008f
        L_0x008e:
            r2 = -1
        L_0x008f:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00b1
            if (r2 == r9) goto L_0x00a6
            if (r2 != r13) goto L_0x00a0
            java.lang.String r2 = "%02d:%02d:%02d.%03d"
            byte[] r2 = m9831p(r10, r2, r3)
            r3 = 25
            goto L_0x00b9
        L_0x00a0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x00a6:
            java.lang.String r2 = "%01d:%02d:%02d:%02d"
            r3 = 10000(0x2710, double:4.9407E-320)
            byte[] r2 = m9831p(r10, r2, r3)
            r3 = 21
            goto L_0x00b9
        L_0x00b1:
            java.lang.String r2 = "%02d:%02d:%02d,%03d"
            byte[] r2 = m9831p(r10, r2, r3)
            r3 = 19
        L_0x00b9:
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r6, r7, r3, r4)
            androidx.media3.common.b.ac r2 = r0.f10397p
            int r2 = r2.f7235b
        L_0x00c1:
            androidx.media3.common.b.ac r3 = r0.f10397p
            int r4 = r3.f7236c
            if (r2 >= r4) goto L_0x00d4
            byte[] r4 = r3.f7234a
            byte r4 = r4[r2]
            if (r4 != 0) goto L_0x00d1
            r3.mo6158z(r2)
            goto L_0x00d4
        L_0x00d1:
            int r2 = r2 + 1
            goto L_0x00c1
        L_0x00d4:
            androidx.media3.extractor.bf r2 = r1.f10320X
            androidx.media3.common.b.ac r3 = r0.f10397p
            int r4 = r3.f7236c
            r2.mo6851c(r3, r4)
            androidx.media3.common.b.ac r2 = r0.f10397p
            int r2 = r2.f7236c
            int r2 = r22 + r2
        L_0x00e3:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto L_0x00fd
            int r3 = r0.f10369P
            if (r3 <= r9) goto L_0x00f3
            androidx.media3.common.b.ac r3 = r0.f10400s
            r3.mo6156x(r6)
            goto L_0x00fd
        L_0x00f3:
            androidx.media3.common.b.ac r3 = r0.f10400s
            int r4 = r3.f7236c
            androidx.media3.extractor.bf r5 = r1.f10320X
            r5.mo6854f(r3, r4)
            int r2 = r2 + r4
        L_0x00fd:
            r14 = r2
            androidx.media3.extractor.bf r10 = r1.f10320X
            androidx.media3.extractor.be r1 = r1.f10331j
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.mo6852d(r11, r13, r14, r15, r16)
        L_0x010d:
            r0.f10364K = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p159f.C3400e.m9827l(androidx.media3.extractor.f.d, long, int, int, int):void");
    }

    /* renamed from: m */
    private final void m9828m(C3327ab abVar, int i) {
        C2604ac acVar = this.f10393l;
        if (acVar.f7236c < i) {
            int length = acVar.f7234a.length;
            if (length < i) {
                acVar.mo6153u(Math.max(length + length, i));
            }
            C2604ac acVar2 = this.f10393l;
            byte[] bArr = acVar2.f7234a;
            int i2 = acVar2.f7236c;
            ((C3627q) abVar).mo7321p(bArr, i2, i - i2, false);
            this.f10393l.mo6158z(i);
        }
    }

    /* renamed from: n */
    private final void m9829n() {
        this.f10377X = 0;
        this.f10378Y = 0;
        this.f10379Z = 0;
        this.f10380aa = false;
        this.f10381ab = false;
        this.f10382ac = false;
        this.f10383ad = 0;
        this.f10384ae = 0;
        this.f10385af = false;
        this.f10396o.mo6156x(0);
    }

    /* renamed from: o */
    private final void m9830o(C3327ab abVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        C2604ac acVar = this.f10397p;
        byte[] bArr2 = acVar.f7234a;
        if (bArr2.length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            acVar.mo6157y(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        ((C3627q) abVar).mo7321p(this.f10397p.f7234a, length, i, false);
        this.f10397p.mo6131A(0);
        this.f10397p.mo6158z(i2);
    }

    /* renamed from: p */
    private static byte[] m9831p(long j, String str, long j2) {
        C2601a.m6830b(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return C2612ak.m6961ak(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: q */
    private static int[] m9832q(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r3v2, types: [boolean, int, byte] */
    /* JADX WARNING: type inference failed for: r3v97 */
    /* JADX WARNING: type inference failed for: r3v100 */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x043a, code lost:
        throw androidx.media3.common.C2599az.m6819a("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        if (r5 == 1) goto L_0x00c4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo7152a(androidx.media3.extractor.C3327ab r28, androidx.media3.extractor.C3350ay r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = 0
            r0.f10364K = r3
        L_0x0009:
            boolean r4 = r0.f10364K
            if (r4 != 0) goto L_0x090f
            androidx.media3.extractor.f.b r4 = r0.f10387ah
            androidx.media3.extractor.f.c r5 = r4.f10295g
            androidx.media3.common.p136b.C2601a.m6829a(r5)
        L_0x0014:
            java.util.ArrayDeque r5 = r4.f10290b
            java.lang.Object r5 = r5.peek()
            androidx.media3.extractor.f.a r5 = (androidx.media3.extractor.p159f.C3396a) r5
            r6 = -1
            r8 = 1
            if (r5 == 0) goto L_0x0040
            r9 = r1
            androidx.media3.extractor.q r9 = (androidx.media3.extractor.C3627q) r9
            long r9 = r9.f11566c
            long r11 = r5.f10288b
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x0040
            androidx.media3.extractor.f.c r5 = r4.f10295g
            java.util.ArrayDeque r4 = r4.f10290b
            java.lang.Object r4 = r4.pop()
            androidx.media3.extractor.f.a r4 = (androidx.media3.extractor.p159f.C3396a) r4
            int r4 = r4.f10287a
            androidx.media3.extractor.f.e r5 = r5.f10296a
            r5.mo7373f(r4)
        L_0x003d:
            r0 = 0
            goto L_0x08b5
        L_0x0040:
            int r5 = r4.f10292d
            r9 = 524531317(0x1f43b675, float:4.144378E-20)
            r10 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            r12 = 4
            r13 = -1
            r14 = 2
            if (r5 != 0) goto L_0x00c2
            androidx.media3.extractor.f.g r5 = r4.f10291c
            long r15 = r5.mo7375c(r1, r8, r3, r12)
            r17 = -2
            int r5 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r5 != 0) goto L_0x0095
            r5 = r1
            androidx.media3.extractor.q r5 = (androidx.media3.extractor.C3627q) r5
            r5.f11568e = r3
        L_0x005e:
            byte[] r15 = r4.f10289a
            r5.mo7320o(r15, r3, r12, r3)
            byte[] r15 = r4.f10289a
            byte r15 = r15[r3]
            int r15 = androidx.media3.extractor.p159f.C3402g.m9840a(r15)
            if (r15 == r13) goto L_0x0090
            if (r15 > r12) goto L_0x0090
            byte[] r12 = r4.f10289a
            long r11 = androidx.media3.extractor.p159f.C3402g.m9841b(r12, r15, r3)
            int r12 = (int) r11
            androidx.media3.extractor.f.c r11 = r4.f10295g
            androidx.media3.extractor.f.e r11 = r11.f10296a
            r11 = 357149030(0x1549a966, float:4.072526E-26)
            if (r12 == r11) goto L_0x008b
            if (r12 == r9) goto L_0x008b
            if (r12 == r10) goto L_0x008b
            r11 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r12 != r11) goto L_0x0090
            r12 = 374648427(0x1654ae6b, float:1.718026E-25)
        L_0x008b:
            r5.mo7639q(r15)
            long r11 = (long) r12
            goto L_0x0096
        L_0x0090:
            r5.mo7639q(r8)
            r12 = 4
            goto L_0x005e
        L_0x0095:
            r11 = r15
        L_0x0096:
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00bc
        L_0x009a:
            android.util.SparseArray r1 = r0.f10389h
            int r1 = r1.size()
            if (r3 >= r1) goto L_0x00bb
            android.util.SparseArray r1 = r0.f10389h
            java.lang.Object r1 = r1.valueAt(r3)
            androidx.media3.extractor.f.d r1 = (androidx.media3.extractor.p159f.C3399d) r1
            androidx.media3.extractor.bf r2 = r1.f10320X
            r2.getClass()
            androidx.media3.extractor.bg r4 = r1.f10316T
            if (r4 == 0) goto L_0x00b8
            androidx.media3.extractor.be r1 = r1.f10331j
            r4.mo7358a(r2, r1)
        L_0x00b8:
            int r3 = r3 + 1
            goto L_0x009a
        L_0x00bb:
            return r13
        L_0x00bc:
            int r5 = (int) r11
            r4.f10293e = r5
            r4.f10292d = r8
            goto L_0x00c4
        L_0x00c2:
            if (r5 != r8) goto L_0x00d0
        L_0x00c4:
            androidx.media3.extractor.f.g r5 = r4.f10291c
            r11 = 8
            long r9 = r5.mo7375c(r1, r3, r8, r11)
            r4.f10294f = r9
            r4.f10292d = r14
        L_0x00d0:
            androidx.media3.extractor.f.c r5 = r4.f10295g
            int r9 = r4.f10293e
            androidx.media3.extractor.f.e r10 = r5.f10296a
            r19 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r21 = 8
            r11 = 3
            r23 = 1
            java.lang.String r12 = " not supported"
            r15 = 0
            switch(r9) {
                case 131: goto L_0x064b;
                case 134: goto L_0x05ba;
                case 136: goto L_0x064b;
                case 155: goto L_0x064b;
                case 159: goto L_0x064b;
                case 160: goto L_0x04ef;
                case 161: goto L_0x01c1;
                case 163: goto L_0x01c1;
                case 165: goto L_0x01c1;
                case 166: goto L_0x04ef;
                case 174: goto L_0x04ef;
                case 176: goto L_0x064b;
                case 179: goto L_0x064b;
                case 181: goto L_0x00f5;
                case 183: goto L_0x04ef;
                case 186: goto L_0x064b;
                case 187: goto L_0x04ef;
                case 215: goto L_0x064b;
                case 224: goto L_0x04ef;
                case 225: goto L_0x04ef;
                case 231: goto L_0x064b;
                case 238: goto L_0x064b;
                case 241: goto L_0x064b;
                case 251: goto L_0x064b;
                case 16868: goto L_0x04ef;
                case 16871: goto L_0x064b;
                case 16877: goto L_0x01c1;
                case 16980: goto L_0x064b;
                case 16981: goto L_0x01c1;
                case 17026: goto L_0x05ba;
                case 17029: goto L_0x064b;
                case 17143: goto L_0x064b;
                case 17545: goto L_0x00f5;
                case 18401: goto L_0x064b;
                case 18402: goto L_0x01c1;
                case 18407: goto L_0x04ef;
                case 18408: goto L_0x064b;
                case 19899: goto L_0x04ef;
                case 20529: goto L_0x064b;
                case 20530: goto L_0x064b;
                case 20532: goto L_0x04ef;
                case 20533: goto L_0x04ef;
                case 21358: goto L_0x05ba;
                case 21419: goto L_0x01c1;
                case 21420: goto L_0x064b;
                case 21432: goto L_0x064b;
                case 21680: goto L_0x064b;
                case 21682: goto L_0x064b;
                case 21690: goto L_0x064b;
                case 21930: goto L_0x064b;
                case 21936: goto L_0x04ef;
                case 21945: goto L_0x064b;
                case 21946: goto L_0x064b;
                case 21947: goto L_0x064b;
                case 21948: goto L_0x064b;
                case 21949: goto L_0x064b;
                case 21968: goto L_0x04ef;
                case 21969: goto L_0x00f5;
                case 21970: goto L_0x00f5;
                case 21971: goto L_0x00f5;
                case 21972: goto L_0x00f5;
                case 21973: goto L_0x00f5;
                case 21974: goto L_0x00f5;
                case 21975: goto L_0x00f5;
                case 21976: goto L_0x00f5;
                case 21977: goto L_0x00f5;
                case 21978: goto L_0x00f5;
                case 21998: goto L_0x064b;
                case 22186: goto L_0x064b;
                case 22203: goto L_0x064b;
                case 25152: goto L_0x04ef;
                case 25188: goto L_0x064b;
                case 25506: goto L_0x01c1;
                case 28032: goto L_0x04ef;
                case 30113: goto L_0x04ef;
                case 30114: goto L_0x064b;
                case 30320: goto L_0x04ef;
                case 30321: goto L_0x064b;
                case 30322: goto L_0x01c1;
                case 30323: goto L_0x00f5;
                case 30324: goto L_0x00f5;
                case 30325: goto L_0x00f5;
                case 2274716: goto L_0x05ba;
                case 2352003: goto L_0x064b;
                case 2807729: goto L_0x064b;
                case 290298740: goto L_0x04ef;
                case 357149030: goto L_0x04ef;
                case 374648427: goto L_0x04ef;
                case 408125543: goto L_0x04ef;
                case 440786851: goto L_0x04ef;
                case 475249515: goto L_0x04ef;
                case 524531317: goto L_0x04ef;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            r5 = r0
            long r6 = r4.f10294f
            r0 = r1
            androidx.media3.extractor.q r0 = (androidx.media3.extractor.C3627q) r0
            int r3 = (int) r6
            r0.mo7639q(r3)
            r0 = 0
            r4.f10292d = r0
            r0 = r5
            r3 = 0
            goto L_0x0014
        L_0x00f5:
            long r6 = r4.f10294f
            r10 = 4
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0115
            int r10 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r10 != 0) goto L_0x0102
            goto L_0x0115
        L_0x0102:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid float size: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r15)
            throw r1
        L_0x0115:
            int r7 = (int) r6
            long r10 = r4.mo7371a(r1, r7)
            r6 = 4
            if (r7 != r6) goto L_0x0124
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            double r6 = (double) r6
            goto L_0x0128
        L_0x0124:
            double r6 = java.lang.Double.longBitsToDouble(r10)
        L_0x0128:
            androidx.media3.extractor.f.e r5 = r5.f10296a
            r10 = 181(0xb5, float:2.54E-43)
            if (r9 == r10) goto L_0x01b5
            r10 = 17545(0x4489, float:2.4586E-41)
            if (r9 == r10) goto L_0x01b1
            switch(r9) {
                case 21969: goto L_0x01a8;
                case 21970: goto L_0x019f;
                case 21971: goto L_0x0196;
                case 21972: goto L_0x018d;
                case 21973: goto L_0x0184;
                case 21974: goto L_0x017b;
                case 21975: goto L_0x0172;
                case 21976: goto L_0x0169;
                case 21977: goto L_0x0160;
                case 21978: goto L_0x0157;
                default: goto L_0x0135;
            }
        L_0x0135:
            switch(r9) {
                case 30323: goto L_0x014e;
                case 30324: goto L_0x0144;
                case 30325: goto L_0x013a;
                default: goto L_0x0138;
            }
        L_0x0138:
            goto L_0x01bd
        L_0x013a:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10342u = r6
            goto L_0x01bd
        L_0x0144:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10341t = r6
            goto L_0x01bd
        L_0x014e:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10340s = r6
            goto L_0x01bd
        L_0x0157:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10309M = r6
            goto L_0x01bd
        L_0x0160:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10308L = r6
            goto L_0x01bd
        L_0x0169:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10307K = r6
            goto L_0x01bd
        L_0x0172:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10306J = r6
            goto L_0x01bd
        L_0x017b:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10305I = r6
            goto L_0x01bd
        L_0x0184:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10304H = r6
            goto L_0x01bd
        L_0x018d:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10303G = r6
            goto L_0x01bd
        L_0x0196:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10302F = r6
            goto L_0x01bd
        L_0x019f:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10301E = r6
            goto L_0x01bd
        L_0x01a8:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            float r6 = (float) r6
            r5.f10300D = r6
            goto L_0x01bd
        L_0x01b1:
            long r6 = (long) r6
            r5.f10405x = r6
            goto L_0x01bd
        L_0x01b5:
            r5.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r5.f10407z
            int r6 = (int) r6
            r5.f10313Q = r6
        L_0x01bd:
            r4.f10292d = r3
            goto L_0x003d
        L_0x01c1:
            long r6 = r4.f10294f
            int r5 = (int) r6
            r6 = 161(0xa1, float:2.26E-43)
            r7 = 163(0xa3, float:2.28E-43)
            if (r9 == r6) goto L_0x02c7
            if (r9 == r7) goto L_0x02c7
            r6 = 165(0xa5, float:2.31E-43)
            if (r9 == r6) goto L_0x0291
            r6 = 16877(0x41ed, float:2.365E-41)
            if (r9 == r6) goto L_0x026b
            r6 = 16981(0x4255, float:2.3795E-41)
            if (r9 == r6) goto L_0x0259
            r6 = 18402(0x47e2, float:2.5787E-41)
            if (r9 == r6) goto L_0x0244
            r6 = 21419(0x53ab, float:3.0014E-41)
            if (r9 == r6) goto L_0x0221
            r6 = 25506(0x63a2, float:3.5742E-41)
            if (r9 == r6) goto L_0x020e
            r6 = 30322(0x7672, float:4.249E-41)
            if (r9 != r6) goto L_0x01fb
            r10.m9826k(r9)
            androidx.media3.extractor.f.d r6 = r10.f10407z
            byte[] r7 = new byte[r5]
            r6.f10343v = r7
            byte[] r6 = r6.f10343v
            r7 = r1
            androidx.media3.extractor.q r7 = (androidx.media3.extractor.C3627q) r7
            r7.mo7321p(r6, r3, r5, r3)
            goto L_0x02c4
        L_0x01fb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected id: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6819a(r1, r15)
            throw r1
        L_0x020e:
            r10.m9826k(r9)
            androidx.media3.extractor.f.d r6 = r10.f10407z
            byte[] r7 = new byte[r5]
            r6.f10332k = r7
            byte[] r6 = r6.f10332k
            r7 = r1
            androidx.media3.extractor.q r7 = (androidx.media3.extractor.C3627q) r7
            r7.mo7321p(r6, r3, r5, r3)
            goto L_0x02c4
        L_0x0221:
            androidx.media3.common.b.ac r6 = r10.f10395n
            byte[] r6 = r6.f7234a
            java.util.Arrays.fill(r6, r3)
            androidx.media3.common.b.ac r6 = r10.f10395n
            byte[] r6 = r6.f7234a
            r7 = r1
            androidx.media3.extractor.q r7 = (androidx.media3.extractor.C3627q) r7
            int r9 = 4 - r5
            r7.mo7321p(r6, r9, r5, r3)
            androidx.media3.common.b.ac r5 = r10.f10395n
            r5.mo6131A(r3)
            androidx.media3.common.b.ac r5 = r10.f10395n
            long r5 = r5.mo6146n()
            int r6 = (int) r5
            r10.f10355B = r6
            goto L_0x02c4
        L_0x0244:
            byte[] r6 = new byte[r5]
            r7 = r1
            androidx.media3.extractor.q r7 = (androidx.media3.extractor.C3627q) r7
            r7.mo7321p(r6, r3, r5, r3)
            r10.m9826k(r9)
            androidx.media3.extractor.f.d r5 = r10.f10407z
            androidx.media3.extractor.be r7 = new androidx.media3.extractor.be
            r7.<init>(r8, r6, r3, r3)
            r5.f10331j = r7
            goto L_0x02c4
        L_0x0259:
            r10.m9826k(r9)
            androidx.media3.extractor.f.d r6 = r10.f10407z
            byte[] r7 = new byte[r5]
            r6.f10330i = r7
            byte[] r6 = r6.f10330i
            r7 = r1
            androidx.media3.extractor.q r7 = (androidx.media3.extractor.C3627q) r7
            r7.mo7321p(r6, r3, r5, r3)
            goto L_0x02c4
        L_0x026b:
            r10.m9826k(r9)
            androidx.media3.extractor.f.d r6 = r10.f10407z
            int r7 = r6.f10328g
            r9 = 1685485123(0x64767643, float:1.8185683E22)
            if (r7 == r9) goto L_0x0284
            r9 = 1685480259(0x64766343, float:1.8180206E22)
            if (r7 != r9) goto L_0x027d
            goto L_0x0284
        L_0x027d:
            r6 = r1
            androidx.media3.extractor.q r6 = (androidx.media3.extractor.C3627q) r6
            r6.mo7639q(r5)
            goto L_0x02c4
        L_0x0284:
            byte[] r7 = new byte[r5]
            r6.f10310N = r7
            byte[] r6 = r6.f10310N
            r7 = r1
            androidx.media3.extractor.q r7 = (androidx.media3.extractor.C3627q) r7
            r7.mo7321p(r6, r3, r5, r3)
            goto L_0x02c4
        L_0x0291:
            int r6 = r10.f10365L
            if (r6 != r14) goto L_0x02c4
            android.util.SparseArray r6 = r10.f10389h
            int r7 = r10.f10371R
            java.lang.Object r6 = r6.get(r7)
            androidx.media3.extractor.f.d r6 = (androidx.media3.extractor.p159f.C3399d) r6
            int r7 = r10.f10374U
            r9 = 4
            if (r7 != r9) goto L_0x02be
            java.lang.String r7 = "V_VP9"
            java.lang.String r6 = r6.f10323b
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x02be
            androidx.media3.common.b.ac r6 = r10.f10400s
            r6.mo6156x(r5)
            androidx.media3.common.b.ac r6 = r10.f10400s
            byte[] r6 = r6.f7234a
            r7 = r1
            androidx.media3.extractor.q r7 = (androidx.media3.extractor.C3627q) r7
            r7.mo7321p(r6, r3, r5, r3)
            goto L_0x02c4
        L_0x02be:
            r6 = r1
            androidx.media3.extractor.q r6 = (androidx.media3.extractor.C3627q) r6
            r6.mo7639q(r5)
        L_0x02c4:
            r0 = 0
            goto L_0x04eb
        L_0x02c7:
            int r6 = r10.f10365L
            if (r6 != 0) goto L_0x02ea
            androidx.media3.extractor.f.g r6 = r10.f10388g
            r12 = 8
            long r13 = r6.mo7375c(r1, r3, r8, r12)
            int r6 = (int) r13
            r10.f10371R = r6
            androidx.media3.extractor.f.g r6 = r10.f10388g
            int r6 = r6.f10411a
            r10.f10372S = r6
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10.f10367N = r12
            r10.f10365L = r8
            androidx.media3.common.b.ac r6 = r10.f10393l
            r6.mo6156x(r3)
        L_0x02ea:
            android.util.SparseArray r6 = r10.f10389h
            int r12 = r10.f10371R
            java.lang.Object r6 = r6.get(r12)
            androidx.media3.extractor.f.d r6 = (androidx.media3.extractor.p159f.C3399d) r6
            if (r6 != 0) goto L_0x0302
            int r6 = r10.f10372S
            r7 = r1
            androidx.media3.extractor.q r7 = (androidx.media3.extractor.C3627q) r7
            int r5 = r5 - r6
            r7.mo7639q(r5)
            r10.f10365L = r3
            goto L_0x02c4
        L_0x0302:
            androidx.media3.extractor.bf r12 = r6.f10320X
            r12.getClass()
            int r12 = r10.f10365L
            if (r12 != r8) goto L_0x0495
            r10.m9828m(r1, r11)
            androidx.media3.common.b.ac r12 = r10.f10393l
            byte[] r12 = r12.f7234a
            r13 = 2
            byte r12 = r12[r13]
            r12 = r12 & 6
            int r12 = r12 >> r8
            r13 = 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x032f
            r10.f10369P = r8
            int[] r11 = r10.f10370Q
            int[] r11 = m9832q(r11, r8)
            r10.f10370Q = r11
            int r12 = r10.f10372S
            int r5 = r5 - r12
            int r5 = r5 + -3
            r11[r3] = r5
            goto L_0x044c
        L_0x032f:
            r14 = 4
            r10.m9828m(r1, r14)
            androidx.media3.common.b.ac r14 = r10.f10393l
            byte[] r14 = r14.f7234a
            byte r14 = r14[r11]
            r14 = r14 & r13
            int r14 = r14 + r8
            r10.f10369P = r14
            int[] r7 = r10.f10370Q
            int[] r7 = m9832q(r7, r14)
            r10.f10370Q = r7
            r14 = 2
            if (r12 != r14) goto L_0x0355
            int r11 = r10.f10372S
            int r12 = r10.f10369P
            int r5 = r5 - r11
            int r5 = r5 + -4
            int r5 = r5 / r12
            java.util.Arrays.fill(r7, r3, r12, r5)
            goto L_0x044c
        L_0x0355:
            if (r12 != r8) goto L_0x038b
            r7 = 0
            r11 = 0
            r12 = 4
        L_0x035a:
            int r14 = r10.f10369P
            r15 = -1
            int r14 = r14 + r15
            if (r7 >= r14) goto L_0x0380
            int[] r14 = r10.f10370Q
            r14[r7] = r3
        L_0x0364:
            int r12 = r12 + r8
            r10.m9828m(r1, r12)
            androidx.media3.common.b.ac r14 = r10.f10393l
            byte[] r14 = r14.f7234a
            int r15 = r12 + -1
            byte r14 = r14[r15]
            r14 = r14 & r13
            int[] r15 = r10.f10370Q
            r17 = r15[r7]
            int r17 = r17 + r14
            r15[r7] = r17
            if (r14 == r13) goto L_0x0364
            int r11 = r11 + r17
            int r7 = r7 + 1
            goto L_0x035a
        L_0x0380:
            int[] r7 = r10.f10370Q
            int r15 = r10.f10372S
            int r5 = r5 - r15
            int r5 = r5 - r12
            int r5 = r5 - r11
            r7[r14] = r5
            goto L_0x044c
        L_0x038b:
            if (r12 != r11) goto L_0x048d
            r7 = 0
            r11 = 0
            r12 = 4
        L_0x0390:
            int r14 = r10.f10369P
            r17 = -1
            int r14 = r14 + -1
            if (r7 >= r14) goto L_0x0443
            int[] r14 = r10.f10370Q
            r14[r7] = r3
            int r12 = r12 + 1
            r10.m9828m(r1, r12)
            int r14 = r12 + -1
            androidx.media3.common.b.ac r3 = r10.f10393l
            byte[] r3 = r3.f7234a
            byte r3 = r3[r14]
            if (r3 == 0) goto L_0x043b
            r3 = 0
        L_0x03ac:
            r15 = 8
            if (r3 >= r15) goto L_0x040b
            int r15 = 7 - r3
            int r15 = r8 << r15
            androidx.media3.common.b.ac r8 = r10.f10393l
            byte[] r8 = r8.f7234a
            byte r8 = r8[r14]
            r8 = r8 & r15
            if (r8 == 0) goto L_0x0401
            int r12 = r12 + r3
            r10.m9828m(r1, r12)
            int r8 = r14 + 1
            androidx.media3.common.b.ac r13 = r10.f10393l
            byte[] r13 = r13.f7234a
            byte r13 = r13[r14]
            r14 = 255(0xff, float:3.57E-43)
            r13 = r13 & r14
            r14 = r15 ^ -1
            r13 = r13 & r14
            long r13 = (long) r13
        L_0x03d0:
            if (r8 >= r12) goto L_0x03ed
            int r15 = r8 + 1
            r18 = 8
            long r13 = r13 << r18
            r22 = r12
            androidx.media3.common.b.ac r12 = r10.f10393l
            byte[] r12 = r12.f7234a
            byte r8 = r12[r8]
            r12 = 255(0xff, float:3.57E-43)
            r8 = r8 & r12
            long r0 = (long) r8
            long r13 = r13 | r0
            r0 = r27
            r1 = r28
            r8 = r15
            r12 = r22
            goto L_0x03d0
        L_0x03ed:
            r22 = r12
            if (r7 <= 0) goto L_0x03fe
            int r3 = r3 * 7
            int r3 = r3 + 6
            long r0 = r23 << r3
            r25 = -1
            long r0 = r0 + r25
            long r0 = r13 - r0
            r13 = r0
        L_0x03fe:
            r12 = r22
            goto L_0x040d
        L_0x0401:
            int r3 = r3 + 1
            r0 = r27
            r1 = r28
            r8 = 1
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x03ac
        L_0x040b:
            r13 = 0
        L_0x040d:
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0433
            int r0 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r0 > 0) goto L_0x0433
            int r0 = (int) r13
            int[] r1 = r10.f10370Q
            if (r7 != 0) goto L_0x041e
            goto L_0x0423
        L_0x041e:
            int r3 = r7 + -1
            r3 = r1[r3]
            int r0 = r0 + r3
        L_0x0423:
            r1[r7] = r0
            int r11 = r11 + r0
            int r7 = r7 + 1
            r3 = 0
            r13 = 255(0xff, float:3.57E-43)
            r15 = 0
            r0 = r27
            r1 = r28
            r8 = 1
            goto L_0x0390
        L_0x0433:
            java.lang.String r0 = "EBML lacing sample size out of range."
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x043b:
            r1 = r15
            java.lang.String r0 = "No valid varint length mask found"
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x0443:
            int[] r0 = r10.f10370Q
            int r1 = r10.f10372S
            int r5 = r5 - r1
            int r5 = r5 - r12
            int r5 = r5 - r11
            r0[r14] = r5
        L_0x044c:
            androidx.media3.common.b.ac r0 = r10.f10393l
            byte[] r0 = r0.f7234a
            r1 = 0
            byte r3 = r0[r1]
            r1 = 1
            byte r0 = r0[r1]
            long r7 = r10.f10360G
            r1 = 8
            int r1 = r3 << 8
            r3 = 255(0xff, float:3.57E-43)
            r0 = r0 & r3
            r0 = r0 | r1
            long r0 = (long) r0
            long r0 = r10.m9824i(r0)
            long r7 = r7 + r0
            r10.f10366M = r7
            int r0 = r6.f10325d
            r1 = 2
            if (r0 == r1) goto L_0x0484
            r0 = 163(0xa3, float:2.28E-43)
            if (r9 != r0) goto L_0x0482
            androidx.media3.common.b.ac r0 = r10.f10393l
            byte[] r0 = r0.f7234a
            byte r0 = r0[r1]
            r3 = 128(0x80, float:1.794E-43)
            r0 = r0 & r3
            if (r0 != r3) goto L_0x047e
            r0 = 1
            goto L_0x047f
        L_0x047e:
            r0 = 0
        L_0x047f:
            r9 = 163(0xa3, float:2.28E-43)
            goto L_0x0485
        L_0x0482:
            r0 = 0
            goto L_0x0485
        L_0x0484:
            r0 = 1
        L_0x0485:
            r10.f10373T = r0
            r10.f10365L = r1
            r0 = 0
            r10.f10368O = r0
            goto L_0x0495
        L_0x048d:
            java.lang.String r0 = "Unexpected lacing value: 2"
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x0495:
            r0 = 163(0xa3, float:2.28E-43)
            if (r9 != r0) goto L_0x04d2
        L_0x0499:
            int r0 = r10.f10368O
            int r1 = r10.f10369P
            if (r0 >= r1) goto L_0x04cb
            int[] r1 = r10.f10370Q
            r0 = r1[r0]
            r1 = r28
            r3 = 0
            int r24 = r10.m9822g(r1, r6, r0, r3)
            long r7 = r10.f10366M
            int r0 = r10.f10368O
            int r3 = r6.f10326e
            int r0 = r0 * r3
            int r0 = r0 / 1000
            long r11 = (long) r0
            long r21 = r7 + r11
            int r0 = r10.f10373T
            r25 = 0
            r19 = r10
            r20 = r6
            r23 = r0
            r19.m9827l(r20, r21, r23, r24, r25)
            int r0 = r10.f10368O
            r3 = 1
            int r0 = r0 + r3
            r10.f10368O = r0
            goto L_0x0499
        L_0x04cb:
            r1 = r28
            r0 = 0
            r3 = 1
            r10.f10365L = r0
            goto L_0x04eb
        L_0x04d2:
            r1 = r28
        L_0x04d4:
            r3 = 1
            int r0 = r10.f10368O
            int r5 = r10.f10369P
            if (r0 >= r5) goto L_0x02c4
            int[] r5 = r10.f10370Q
            r7 = r5[r0]
            int r7 = r10.m9822g(r1, r6, r7, r3)
            r5[r0] = r7
            int r0 = r10.f10368O
            int r0 = r0 + r3
            r10.f10368O = r0
            goto L_0x04d4
        L_0x04eb:
            r4.f10292d = r0
            goto L_0x08b5
        L_0x04ef:
            r0 = r1
            androidx.media3.extractor.q r0 = (androidx.media3.extractor.C3627q) r0
            long r5 = r0.f11566c
            long r7 = r4.f10294f
            java.util.ArrayDeque r0 = r4.f10290b
            androidx.media3.extractor.f.a r3 = new androidx.media3.extractor.f.a
            long r7 = r7 + r5
            r3.<init>(r9, r7)
            r0.push(r3)
            androidx.media3.extractor.f.c r0 = r4.f10295g
            int r3 = r4.f10293e
            long r7 = r4.f10294f
            androidx.media3.extractor.f.e r0 = r0.f10296a
            androidx.media3.extractor.ad r9 = r0.f10386ag
            androidx.media3.common.p136b.C2601a.m6829a(r9)
            r9 = 160(0xa0, float:2.24E-43)
            if (r3 == r9) goto L_0x05af
            r9 = 174(0xae, float:2.44E-43)
            if (r3 == r9) goto L_0x05a6
            r9 = 187(0xbb, float:2.62E-43)
            if (r3 == r9) goto L_0x05a2
            r9 = 19899(0x4dbb, float:2.7884E-41)
            if (r3 == r9) goto L_0x059a
            r9 = 20533(0x5035, float:2.8773E-41)
            if (r3 == r9) goto L_0x0591
            r9 = 21968(0x55d0, float:3.0784E-41)
            if (r3 == r9) goto L_0x0588
            r9 = 408125543(0x18538067, float:2.7335937E-24)
            if (r3 == r9) goto L_0x056e
            r9 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r3 == r9) goto L_0x055e
            r5 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r3 == r5) goto L_0x0538
        L_0x0535:
            r3 = 0
            goto L_0x05b6
        L_0x0538:
            boolean r3 = r0.f10354A
            if (r3 != 0) goto L_0x0535
            boolean r3 = r0.f10390i
            if (r3 == 0) goto L_0x054c
            long r5 = r0.f10358E
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x054c
            r3 = 1
            r0.f10357D = r3
            goto L_0x0535
        L_0x054c:
            r3 = 1
            androidx.media3.extractor.ad r5 = r0.f10386ag
            androidx.media3.extractor.ba r6 = new androidx.media3.extractor.ba
            long r7 = r0.f10406y
            r9 = 0
            r6.<init>(r7, r9)
            r5.mo6989q(r6)
            r0.f10354A = r3
            goto L_0x0535
        L_0x055e:
            androidx.media3.common.b.v r3 = new androidx.media3.common.b.v
            r9 = 0
            r3.<init>(r9)
            r0.f10361H = r3
            androidx.media3.common.b.v r3 = new androidx.media3.common.b.v
            r3.<init>(r9)
            r0.f10362I = r3
            goto L_0x0535
        L_0x056e:
            r9 = 0
            long r10 = r0.f10403v
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0583
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x057c
            goto L_0x0583
        L_0x057c:
            java.lang.String r0 = "Multiple Segment elements not supported"
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r9)
            throw r0
        L_0x0583:
            r0.f10403v = r5
            r0.f10402u = r7
            goto L_0x0535
        L_0x0588:
            r0.m9826k(r3)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r5 = 1
            r0.f10345x = r5
            goto L_0x0535
        L_0x0591:
            r5 = 1
            r0.m9826k(r3)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10329h = r5
            goto L_0x0535
        L_0x059a:
            r3 = -1
            r0.f10355B = r3
            r5 = -1
            r0.f10356C = r5
            goto L_0x0535
        L_0x05a2:
            r3 = 0
            r0.f10363J = r3
            goto L_0x05b6
        L_0x05a6:
            r3 = 0
            androidx.media3.extractor.f.d r5 = new androidx.media3.extractor.f.d
            r5.<init>()
            r0.f10407z = r5
            goto L_0x05b6
        L_0x05af:
            r3 = 0
            r0.f10375V = r3
            r5 = 0
            r0.f10376W = r5
        L_0x05b6:
            r4.f10292d = r3
            goto L_0x003d
        L_0x05ba:
            long r6 = r4.f10294f
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 > 0) goto L_0x0637
            int r0 = (int) r6
            if (r0 != 0) goto L_0x05c6
            java.lang.String r0 = ""
            goto L_0x05de
        L_0x05c6:
            byte[] r6 = new byte[r0]
            r7 = r1
            androidx.media3.extractor.q r7 = (androidx.media3.extractor.C3627q) r7
            r7.mo7321p(r6, r3, r0, r3)
        L_0x05ce:
            if (r0 <= 0) goto L_0x05d8
            int r7 = r0 + -1
            byte r8 = r6[r7]
            if (r8 != 0) goto L_0x05d8
            r0 = r7
            goto L_0x05ce
        L_0x05d8:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6, r3, r0)
            r0 = r7
        L_0x05de:
            androidx.media3.extractor.f.e r3 = r5.f10296a
            r5 = 134(0x86, float:1.88E-43)
            if (r9 == r5) goto L_0x062b
            r5 = 17026(0x4282, float:2.3859E-41)
            if (r9 == r5) goto L_0x0603
            r5 = 21358(0x536e, float:2.9929E-41)
            if (r9 == r5) goto L_0x05fb
            r5 = 2274716(0x22b59c, float:3.187556E-39)
            if (r9 == r5) goto L_0x05f3
        L_0x05f1:
            r0 = 0
            goto L_0x0633
        L_0x05f3:
            r3.m9826k(r9)
            androidx.media3.extractor.f.d r3 = r3.f10407z
            r3.f10319W = r0
            goto L_0x05f1
        L_0x05fb:
            r3.m9826k(r9)
            androidx.media3.extractor.f.d r3 = r3.f10407z
            r3.f10322a = r0
            goto L_0x05f1
        L_0x0603:
            java.lang.String r3 = "webm"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x05f1
            java.lang.String r3 = "matroska"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0614
            goto L_0x05f1
        L_0x0614:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DocType "
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x062b:
            r3.m9826k(r9)
            androidx.media3.extractor.f.d r3 = r3.f10407z
            r3.f10323b = r0
            goto L_0x05f1
        L_0x0633:
            r4.f10292d = r0
            goto L_0x08b5
        L_0x0637:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "String element size: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x064b:
            long r6 = r4.f10294f
            int r0 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x08f9
            int r0 = (int) r6
            long r6 = r4.mo7371a(r1, r0)
            androidx.media3.extractor.f.e r0 = r5.f10296a
            r3 = 20529(0x5031, float:2.8767E-41)
            if (r9 == r3) goto L_0x08ab
            r3 = 20530(0x5032, float:2.8769E-41)
            if (r9 == r3) goto L_0x088e
            switch(r9) {
                case 131: goto L_0x0884;
                case 136: goto L_0x0874;
                case 155: goto L_0x086c;
                case 159: goto L_0x0862;
                case 176: goto L_0x0858;
                case 179: goto L_0x084a;
                case 186: goto L_0x0840;
                case 215: goto L_0x0836;
                case 231: goto L_0x082e;
                case 238: goto L_0x0829;
                case 241: goto L_0x0818;
                case 251: goto L_0x0813;
                case 16871: goto L_0x0809;
                case 16980: goto L_0x07ea;
                case 17029: goto L_0x07c7;
                case 17143: goto L_0x07aa;
                case 18401: goto L_0x078b;
                case 18408: goto L_0x076e;
                case 21420: goto L_0x0767;
                case 21432: goto L_0x073c;
                case 21680: goto L_0x0732;
                case 21682: goto L_0x0728;
                case 21690: goto L_0x071e;
                case 21930: goto L_0x070e;
                case 21998: goto L_0x0704;
                case 22186: goto L_0x06fb;
                case 22203: goto L_0x06f2;
                case 25188: goto L_0x06e8;
                case 30114: goto L_0x06e4;
                case 30321: goto L_0x06c0;
                case 2352003: goto L_0x06b7;
                case 2807729: goto L_0x06b4;
                default: goto L_0x0663;
            }
        L_0x0663:
            switch(r9) {
                case 21945: goto L_0x069e;
                case 21946: goto L_0x068e;
                case 21947: goto L_0x067b;
                case 21948: goto L_0x0672;
                case 21949: goto L_0x0669;
                default: goto L_0x0666;
            }
        L_0x0666:
            r0 = 0
            goto L_0x08b3
        L_0x0669:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10299C = r3
            goto L_0x0666
        L_0x0672:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10298B = r3
            goto L_0x0666
        L_0x067b:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r3 = 1
            r0.f10345x = r3
            int r3 = (int) r6
            int r3 = androidx.media3.common.C2670n.m7234a(r3)
            r5 = -1
            if (r3 == r5) goto L_0x0666
            r0.f10346y = r3
            goto L_0x0666
        L_0x068e:
            r5 = -1
            r0.m9826k(r9)
            int r3 = (int) r6
            int r3 = androidx.media3.common.C2670n.m7235b(r3)
            if (r3 == r5) goto L_0x0666
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10347z = r3
            goto L_0x0666
        L_0x069e:
            r0.m9826k(r9)
            int r3 = (int) r6
            r5 = 1
            if (r3 == r5) goto L_0x06ae
            r6 = 2
            if (r3 == r6) goto L_0x06a9
            goto L_0x0666
        L_0x06a9:
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10297A = r5
            goto L_0x0666
        L_0x06ae:
            r6 = 2
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10297A = r6
            goto L_0x0666
        L_0x06b4:
            r0.f10404w = r6
            goto L_0x0666
        L_0x06b7:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10326e = r3
            goto L_0x0666
        L_0x06c0:
            r0.m9826k(r9)
            int r3 = (int) r6
            if (r3 == 0) goto L_0x06de
            r5 = 1
            if (r3 == r5) goto L_0x06d9
            r6 = 2
            if (r3 == r6) goto L_0x06d4
            if (r3 == r11) goto L_0x06cf
            goto L_0x0666
        L_0x06cf:
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10339r = r11
            goto L_0x0666
        L_0x06d4:
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10339r = r6
            goto L_0x0666
        L_0x06d9:
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10339r = r5
            goto L_0x0666
        L_0x06de:
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r3 = 0
            r0.f10339r = r3
            goto L_0x0666
        L_0x06e4:
            r0.f10376W = r6
            goto L_0x0666
        L_0x06e8:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10312P = r3
            goto L_0x0666
        L_0x06f2:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10315S = r6
            goto L_0x0666
        L_0x06fb:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10314R = r6
            goto L_0x0666
        L_0x0704:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10327f = r3
            goto L_0x0666
        L_0x070e:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r3 != 0) goto L_0x0719
            r3 = 1
            goto L_0x071a
        L_0x0719:
            r3 = 0
        L_0x071a:
            r0.f10317U = r3
            goto L_0x0666
        L_0x071e:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10337p = r3
            goto L_0x0666
        L_0x0728:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10338q = r3
            goto L_0x0666
        L_0x0732:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10336o = r3
            goto L_0x0666
        L_0x073c:
            r0.m9826k(r9)
            int r3 = (int) r6
            if (r3 == 0) goto L_0x0760
            r5 = 1
            if (r3 == r5) goto L_0x0759
            if (r3 == r11) goto L_0x0753
            r6 = 15
            if (r3 == r6) goto L_0x074d
            goto L_0x0666
        L_0x074d:
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10344w = r11
            goto L_0x0666
        L_0x0753:
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r0.f10344w = r5
            goto L_0x0666
        L_0x0759:
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r3 = 2
            r0.f10344w = r3
            goto L_0x0666
        L_0x0760:
            androidx.media3.extractor.f.d r0 = r0.f10407z
            r3 = 0
            r0.f10344w = r3
            goto L_0x0666
        L_0x0767:
            long r8 = r0.f10403v
            long r6 = r6 + r8
            r0.f10356C = r6
            goto L_0x0666
        L_0x076e:
            int r0 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x0774
            goto L_0x0666
        L_0x0774:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AESSettingsCipherMode "
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x078b:
            r8 = 5
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0793
            goto L_0x0666
        L_0x0793:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentEncAlgo "
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r3 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r3)
            throw r0
        L_0x07aa:
            r3 = 0
            int r0 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x07b1
            goto L_0x0666
        L_0x07b1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EBMLReadVersion "
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r3)
            throw r0
        L_0x07c7:
            int r0 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r0 < 0) goto L_0x07d3
            r8 = 2
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x07d3
            goto L_0x0666
        L_0x07d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DocTypeReadVersion "
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x07ea:
            r8 = 3
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x07f2
            goto L_0x0666
        L_0x07f2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentCompAlgo "
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x0809:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10328g = r3
            goto L_0x0666
        L_0x0813:
            r3 = 1
            r0.f10375V = r3
            goto L_0x0666
        L_0x0818:
            r3 = 1
            boolean r5 = r0.f10363J
            if (r5 != 0) goto L_0x0666
            r0.m9825j(r9)
            androidx.media3.common.b.v r5 = r0.f10362I
            r5.mo6208b(r6)
            r0.f10363J = r3
            goto L_0x0666
        L_0x0829:
            int r3 = (int) r6
            r0.f10374U = r3
            goto L_0x0666
        L_0x082e:
            long r5 = r0.m9824i(r6)
            r0.f10360G = r5
            goto L_0x0666
        L_0x0836:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10324c = r3
            goto L_0x0666
        L_0x0840:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10335n = r3
            goto L_0x0666
        L_0x084a:
            r0.m9825j(r9)
            androidx.media3.common.b.v r3 = r0.f10361H
            long r5 = r0.m9824i(r6)
            r3.mo6208b(r5)
            goto L_0x0666
        L_0x0858:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10334m = r3
            goto L_0x0666
        L_0x0862:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10311O = r3
            goto L_0x0666
        L_0x086c:
            long r5 = r0.m9824i(r6)
            r0.f10367N = r5
            goto L_0x0666
        L_0x0874:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r3 != 0) goto L_0x087f
            r3 = 1
            goto L_0x0880
        L_0x087f:
            r3 = 0
        L_0x0880:
            r0.f10318V = r3
            goto L_0x0666
        L_0x0884:
            r0.m9826k(r9)
            androidx.media3.extractor.f.d r0 = r0.f10407z
            int r3 = (int) r6
            r0.f10325d = r3
            goto L_0x0666
        L_0x088e:
            int r0 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x0894
            goto L_0x0666
        L_0x0894:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentEncodingScope "
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x08ab:
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x08e0
            goto L_0x0666
        L_0x08b3:
            r4.f10292d = r0
        L_0x08b5:
            r3 = r1
            androidx.media3.extractor.q r3 = (androidx.media3.extractor.C3627q) r3
            long r3 = r3.f11566c
            r5 = r27
            boolean r6 = r5.f10357D
            if (r6 == 0) goto L_0x08ca
            r5.f10359F = r3
            long r3 = r5.f10358E
            r2.f10122a = r3
            r5.f10357D = r0
        L_0x08c8:
            r0 = 1
            goto L_0x08db
        L_0x08ca:
            boolean r0 = r5.f10354A
            if (r0 == 0) goto L_0x08dc
            long r3 = r5.f10359F
            r6 = -1
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x08dc
            r2.f10122a = r3
            r5.f10359F = r6
            goto L_0x08c8
        L_0x08db:
            return r0
        L_0x08dc:
            r0 = r5
            r3 = 0
            goto L_0x0009
        L_0x08e0:
            r5 = r27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentEncodingOrder "
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x08f9:
            r5 = r27
            r1 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid integer size: "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x090f:
            r5 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p159f.C3400e.mo7152a(androidx.media3.extractor.ab, androidx.media3.extractor.ay):int");
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        this.f10360G = -9223372036854775807L;
        this.f10365L = 0;
        C3397b bVar = this.f10387ah;
        bVar.f10292d = 0;
        bVar.f10290b.clear();
        bVar.f10291c.mo7376d();
        this.f10388g.mo7376d();
        m9829n();
        for (int i = 0; i < this.f10389h.size(); i++) {
            C3369bg bgVar = ((C3399d) this.f10389h.valueAt(i)).f10316T;
            if (bgVar != null) {
                bgVar.mo7359b();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        C3327ab abVar2 = abVar;
        C3401f fVar = new C3401f();
        C3627q qVar = (C3627q) abVar2;
        long j = qVar.f11565b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        qVar.mo7320o(fVar.f10408a.f7234a, 0, 4, false);
        long n = fVar.f10408a.mo6146n();
        fVar.f10409b = 4;
        while (true) {
            if (n != 440786851) {
                int i2 = fVar.f10409b + 1;
                fVar.f10409b = i2;
                if (i2 == i) {
                    break;
                }
                qVar.mo7320o(fVar.f10408a.f7234a, 0, 1, false);
                n = ((n << 8) & -256) | ((long) (fVar.f10408a.f7234a[0] & 255));
            } else {
                long a = fVar.mo7374a(abVar2);
                long j3 = (long) fVar.f10409b;
                if (a != Long.MIN_VALUE && (j == -1 || j3 + a < j)) {
                    while (true) {
                        long j4 = (long) fVar.f10409b;
                        long j5 = j3 + a;
                        if (j4 < j5) {
                            if (fVar.mo7374a(abVar2) == Long.MIN_VALUE) {
                                break;
                            }
                            long a2 = fVar.mo7374a(abVar2);
                            if (a2 < 0) {
                                break;
                            } else if (a2 != 0) {
                                int i3 = (int) a2;
                                qVar.mo7319n(i3, false);
                                fVar.f10409b += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v19, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x053e, code lost:
        r1 = null;
        r2 = -1;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0576, code lost:
        r17 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x05a6, code lost:
        r1 = null;
        r2 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0664, code lost:
        r6 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0666, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0680, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0681, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0682, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0683, code lost:
        r14 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0684, code lost:
        r9 = r0.f10310N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0686, code lost:
        if (r9 == null) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0688, code lost:
        r9 = androidx.media3.extractor.C3633w.m10477a(new androidx.media3.common.p136b.C2604ac(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0691, code lost:
        if (r9 == null) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0693, code lost:
        r6 = r9.f11579a;
        r17 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0697, code lost:
        r9 = r17;
        r10 = r0.f10318V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x069d, code lost:
        if (true == r0.f10317U) goto L_0x06a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x069f, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06a1, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06a2, code lost:
        r10 = r10 | r12;
        r12 = new androidx.media3.common.C2679w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06ac, code lost:
        if (androidx.media3.common.C2598ay.m6813l(r9) == false) goto L_0x06bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06ae, code lost:
        r12.f7472x = r0.f10311O;
        r12.f7473y = r0.f10313Q;
        r12.f7474z = r14;
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06bf, code lost:
        if (androidx.media3.common.C2598ay.m6817p(r9) == false) goto L_0x084d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06c3, code lost:
        if (r0.f10338q != 0) goto L_0x06d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06c5, code lost:
        r8 = r0.f10336o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x06c7, code lost:
        if (r8 != -1) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x06c9, code lost:
        r8 = r0.f10334m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06cb, code lost:
        r0.f10336o = r8;
        r8 = r0.f10337p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x06cf, code lost:
        if (r8 != -1) goto L_0x06d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06d1, code lost:
        r8 = r0.f10335n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06d3, code lost:
        r0.f10337p = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06d5, code lost:
        r8 = r0.f10336o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x06d9, code lost:
        if (r8 == -1) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06db, code lost:
        r14 = r0.f10337p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06dd, code lost:
        if (r14 == -1) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x06df, code lost:
        r8 = ((float) (r0.f10335n * r8)) / ((float) (r0.f10334m * r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x06eb, code lost:
        r8 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x06ef, code lost:
        if (r0.f10345x == false) goto L_0x07c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x06f5, code lost:
        if (r0.f10300D == -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06fb, code lost:
        if (r0.f10301E == -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0701, code lost:
        if (r0.f10302F == -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0707, code lost:
        if (r0.f10303G == -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x070d, code lost:
        if (r0.f10304H == -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0713, code lost:
        if (r0.f10305I == -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0719, code lost:
        if (r0.f10306J == -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x071f, code lost:
        if (r0.f10307K == -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0725, code lost:
        if (r0.f10308L == -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x072b, code lost:
        if (r0.f10309M != -1.0f) goto L_0x072f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x072f, code lost:
        r4 = new byte[25];
        r13 = java.nio.ByteBuffer.wrap(r4).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r13.put((byte) 0);
        r13.putShort((short) ((int) ((r0.f10300D * 50000.0f) + 0.5f)));
        r13.putShort((short) ((int) ((r0.f10301E * 50000.0f) + 0.5f)));
        r13.putShort((short) ((int) ((r0.f10302F * 50000.0f) + 0.5f)));
        r13.putShort((short) ((int) ((r0.f10303G * 50000.0f) + 0.5f)));
        r13.putShort((short) ((int) ((r0.f10304H * 50000.0f) + 0.5f)));
        r13.putShort((short) ((int) ((r0.f10305I * 50000.0f) + 0.5f)));
        r13.putShort((short) ((int) ((r0.f10306J * 50000.0f) + 0.5f)));
        r13.putShort((short) ((int) ((r0.f10307K * 50000.0f) + 0.5f)));
        r13.putShort((short) ((int) (r0.f10308L + 0.5f)));
        r13.putShort((short) ((int) (r0.f10309M + 0.5f)));
        r13.putShort((short) r0.f10298B);
        r13.putShort((short) r0.f10299C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x07bb, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07bc, code lost:
        r13 = new androidx.media3.common.C2670n(r0.f10346y, r0.f10297A, r0.f10347z, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x07c8, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x07c9, code lost:
        r4 = r0.f10322a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x07cb, code lost:
        if (r4 == null) goto L_0x07e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x07cd, code lost:
        r11 = f10350c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x07d3, code lost:
        if (r11.containsKey(r4) == false) goto L_0x07e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x07d5, code lost:
        r11 = ((java.lang.Integer) r11.get(r0.f10322a)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x07e2, code lost:
        r11 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x07e5, code lost:
        if (r0.f10339r != 0) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x07ee, code lost:
        if (java.lang.Float.compare(r0.f10340s, 0.0f) != 0) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x07f6, code lost:
        if (java.lang.Float.compare(r0.f10341t, 0.0f) != 0) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x07fe, code lost:
        if (java.lang.Float.compare(r0.f10342u, 0.0f) != 0) goto L_0x0802;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0800, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x080a, code lost:
        if (java.lang.Float.compare(r0.f10341t, 90.0f) != 0) goto L_0x080f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x080c, code lost:
        r4 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0817, code lost:
        if (java.lang.Float.compare(r0.f10341t, -180.0f) == 0) goto L_0x0831;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0821, code lost:
        if (java.lang.Float.compare(r0.f10341t, 180.0f) != 0) goto L_0x0824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x082c, code lost:
        if (java.lang.Float.compare(r0.f10341t, -90.0f) != 0) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x082e, code lost:
        r4 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0831, code lost:
        r4 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0834, code lost:
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0835, code lost:
        r12.f7464p = r0.f10334m;
        r12.f7465q = r0.f10335n;
        r12.f7468t = r8;
        r12.f7467s = r4;
        r12.f7469u = r0.f10343v;
        r12.f7470v = r0.f10344w;
        r12.f7471w = r13;
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0853, code lost:
        if ("application/x-subrip".equals(r9) != false) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x085b, code lost:
        if ("text/x-ssa".equals(r9) != false) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0863, code lost:
        if ("text/vtt".equals(r9) != false) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x086b, code lost:
        if ("application/vobsub".equals(r9) != false) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0873, code lost:
        if ("application/pgs".equals(r9) != false) goto L_0x0886;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x087b, code lost:
        if ("application/dvbsubs".equals(r9) == false) goto L_0x087e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0885, code lost:
        throw androidx.media3.common.C2599az.m6819a("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0886, code lost:
        r4 = r0.f10322a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0888, code lost:
        if (r4 == null) goto L_0x0896;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0890, code lost:
        if (f10350c.containsKey(r4) != false) goto L_0x0896;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0892, code lost:
        r12.f7450b = r0.f10322a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0896, code lost:
        r12.f7449a = java.lang.Integer.toString(r5);
        r12.f7459k = r9;
        r12.f7460l = r2;
        r12.f7451c = r0.f10319W;
        r12.f7452d = r10;
        r12.f7461m = r1;
        r12.f7456h = r6;
        r12.f7462n = r0.f10333l;
        r1 = new androidx.media3.common.C2680x(r12);
        r0.f10320X = r3.mo6987eZ(r0.f10324c, r15);
        r0.f10320X.mo6850b(r1);
        r7.f10389h.put(r0.f10324c, r0);
        r1 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7373f(int r22) {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            androidx.media3.extractor.ad r1 = r7.f10386ag
            androidx.media3.common.p136b.C2601a.m6829a(r1)
            r1 = 160(0xa0, float:2.24E-43)
            java.lang.String r2 = "A_OPUS"
            r6 = 8
            r8 = 1
            if (r0 == r1) goto L_0x08d3
            r1 = 174(0xae, float:2.44E-43)
            java.lang.String r10 = "MatroskaExtractor"
            r11 = -1
            r12 = 0
            if (r0 == r1) goto L_0x0176
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r2 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x015e
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x012e
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0119
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x0101
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00ec
            if (r0 == r2) goto L_0x003c
            goto L_0x016e
        L_0x003c:
            boolean r0 = r7.f10354A
            if (r0 != 0) goto L_0x00e7
            androidx.media3.extractor.ad r0 = r7.f10386ag
            androidx.media3.common.b.v r1 = r7.f10361H
            androidx.media3.common.b.v r2 = r7.f10362I
            long r13 = r7.f10403v
            r15 = -1
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x00d9
            long r13 = r7.f10406y
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d9
            int r5 = r1.f7304a
            if (r5 == 0) goto L_0x00d9
            if (r2 == 0) goto L_0x00d9
            int r6 = r2.f7304a
            if (r6 == r5) goto L_0x0062
            goto L_0x00d9
        L_0x0062:
            int[] r6 = new int[r5]
            long[] r13 = new long[r5]
            long[] r14 = new long[r5]
            long[] r15 = new long[r5]
            r9 = 0
        L_0x006b:
            if (r9 >= r5) goto L_0x0080
            long r17 = r1.mo6207a(r9)
            r15[r9] = r17
            long r3 = r7.f10403v
            long r19 = r2.mo6207a(r9)
            long r3 = r3 + r19
            r13[r9] = r3
            int r9 = r9 + 1
            goto L_0x006b
        L_0x0080:
            r9 = 0
        L_0x0081:
            int r1 = r5 + -1
            if (r9 >= r1) goto L_0x009a
            int r1 = r9 + 1
            r2 = r13[r1]
            r19 = r13[r9]
            long r2 = r2 - r19
            int r3 = (int) r2
            r6[r9] = r3
            r2 = r15[r1]
            r19 = r15[r9]
            long r2 = r2 - r19
            r14[r9] = r2
            r9 = r1
            goto L_0x0081
        L_0x009a:
            long r2 = r7.f10403v
            long r4 = r7.f10402u
            long r2 = r2 + r4
            r4 = r13[r1]
            long r2 = r2 - r4
            int r3 = (int) r2
            r6[r1] = r3
            long r2 = r7.f10406y
            r4 = r15[r1]
            long r2 = r2 - r4
            r14[r1] = r2
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x00d3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Discarding last cue point with unexpected duration: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r10, r2)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r13 = java.util.Arrays.copyOf(r13, r1)
            long[] r14 = java.util.Arrays.copyOf(r14, r1)
            long[] r15 = java.util.Arrays.copyOf(r15, r1)
        L_0x00d3:
            androidx.media3.extractor.o r1 = new androidx.media3.extractor.o
            r1.<init>(r6, r13, r14, r15)
            goto L_0x00e2
        L_0x00d9:
            androidx.media3.extractor.ba r1 = new androidx.media3.extractor.ba
            long r2 = r7.f10406y
            r4 = 0
            r1.<init>(r2, r4)
        L_0x00e2:
            r0.mo6989q(r1)
            r7.f10354A = r8
        L_0x00e7:
            r7.f10361H = r12
            r7.f10362I = r12
            return
        L_0x00ec:
            android.util.SparseArray r0 = r7.f10389h
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00fa
            androidx.media3.extractor.ad r0 = r7.f10386ag
            r0.mo6988fa()
            return
        L_0x00fa:
            java.lang.String r0 = "No valid tracks were found"
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r12)
            throw r0
        L_0x0101:
            long r0 = r7.f10404w
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x010c
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.f10404w = r0
        L_0x010c:
            long r0 = r7.f10405x
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x016e
            long r0 = r7.m9824i(r0)
            r7.f10406y = r0
            return
        L_0x0119:
            r21.m9826k(r22)
            androidx.media3.extractor.f.d r0 = r7.f10407z
            boolean r1 = r0.f10329h
            if (r1 == 0) goto L_0x016e
            byte[] r0 = r0.f10330i
            if (r0 != 0) goto L_0x0127
            goto L_0x016e
        L_0x0127:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r12)
            throw r0
        L_0x012e:
            r21.m9826k(r22)
            androidx.media3.extractor.f.d r0 = r7.f10407z
            boolean r1 = r0.f10329h
            if (r1 == 0) goto L_0x016e
            androidx.media3.extractor.be r1 = r0.f10331j
            if (r1 == 0) goto L_0x0157
            androidx.media3.common.DrmInitData r1 = new androidx.media3.common.DrmInitData
            androidx.media3.common.DrmInitData$SchemeData[] r2 = new androidx.media3.common.DrmInitData.SchemeData[r8]
            androidx.media3.common.DrmInitData$SchemeData r3 = new androidx.media3.common.DrmInitData$SchemeData
            java.util.UUID r4 = androidx.media3.common.C2669m.f7428a
            androidx.media3.extractor.f.d r5 = r7.f10407z
            androidx.media3.extractor.be r5 = r5.f10331j
            byte[] r5 = r5.f10177b
            java.lang.String r6 = "video/webm"
            r3.<init>(r4, r12, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r12, r8, r2)
            r0.f10333l = r1
            return
        L_0x0157:
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r12)
            throw r0
        L_0x015e:
            int r0 = r7.f10355B
            if (r0 == r11) goto L_0x016f
            long r3 = r7.f10356C
            r5 = -1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x016f
            if (r0 != r2) goto L_0x016e
            r7.f10358E = r3
        L_0x016e:
            return
        L_0x016f:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r12)
            throw r0
        L_0x0176:
            androidx.media3.extractor.f.d r0 = r7.f10407z
            androidx.media3.common.p136b.C2601a.m6829a(r0)
            java.lang.String r1 = r0.f10323b
            if (r1 == 0) goto L_0x08cb
            int r3 = r1.hashCode()
            r4 = 25
            r9 = 16
            r13 = 32
            r14 = 4
            r15 = 3
            switch(r3) {
                case -2095576542: goto L_0x02ff;
                case -2095575984: goto L_0x02f5;
                case -1985379776: goto L_0x02ea;
                case -1784763192: goto L_0x02df;
                case -1730367663: goto L_0x02d4;
                case -1482641358: goto L_0x02c9;
                case -1482641357: goto L_0x02be;
                case -1373388978: goto L_0x02b3;
                case -933872740: goto L_0x02a8;
                case -538363189: goto L_0x029d;
                case -538363109: goto L_0x0292;
                case -425012669: goto L_0x0286;
                case -356037306: goto L_0x027a;
                case 62923557: goto L_0x026e;
                case 62923603: goto L_0x0262;
                case 62927045: goto L_0x0256;
                case 82318131: goto L_0x024b;
                case 82338133: goto L_0x0240;
                case 82338134: goto L_0x0235;
                case 99146302: goto L_0x0229;
                case 444813526: goto L_0x021d;
                case 542569478: goto L_0x0211;
                case 635596514: goto L_0x0205;
                case 725948237: goto L_0x01f9;
                case 725957860: goto L_0x01ed;
                case 738597099: goto L_0x01e1;
                case 855502857: goto L_0x01d5;
                case 1045209816: goto L_0x01c9;
                case 1422270023: goto L_0x01bd;
                case 1809237540: goto L_0x01b2;
                case 1950749482: goto L_0x01a6;
                case 1950789798: goto L_0x019a;
                case 1951062397: goto L_0x0190;
                default: goto L_0x018e;
            }
        L_0x018e:
            goto L_0x0309
        L_0x0190:
            boolean r3 = r1.equals(r2)
            if (r3 == 0) goto L_0x0309
            r3 = 11
            goto L_0x030a
        L_0x019a:
            java.lang.String r3 = "A_FLAC"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 22
            goto L_0x030a
        L_0x01a6:
            java.lang.String r3 = "A_EAC3"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 17
            goto L_0x030a
        L_0x01b2:
            java.lang.String r3 = "V_MPEG2"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 3
            goto L_0x030a
        L_0x01bd:
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 27
            goto L_0x030a
        L_0x01c9:
            java.lang.String r3 = "S_TEXT/WEBVTT"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 29
            goto L_0x030a
        L_0x01d5:
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 8
            goto L_0x030a
        L_0x01e1:
            java.lang.String r3 = "S_TEXT/ASS"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 28
            goto L_0x030a
        L_0x01ed:
            java.lang.String r3 = "A_PCM/INT/LIT"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 24
            goto L_0x030a
        L_0x01f9:
            java.lang.String r3 = "A_PCM/INT/BIG"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 25
            goto L_0x030a
        L_0x0205:
            java.lang.String r3 = "A_PCM/FLOAT/IEEE"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 26
            goto L_0x030a
        L_0x0211:
            java.lang.String r3 = "A_DTS/EXPRESS"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 20
            goto L_0x030a
        L_0x021d:
            java.lang.String r3 = "V_THEORA"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 10
            goto L_0x030a
        L_0x0229:
            java.lang.String r3 = "S_HDMV/PGS"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 31
            goto L_0x030a
        L_0x0235:
            java.lang.String r3 = "V_VP9"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 1
            goto L_0x030a
        L_0x0240:
            java.lang.String r3 = "V_VP8"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 0
            goto L_0x030a
        L_0x024b:
            java.lang.String r3 = "V_AV1"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 2
            goto L_0x030a
        L_0x0256:
            java.lang.String r3 = "A_DTS"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 19
            goto L_0x030a
        L_0x0262:
            java.lang.String r3 = "A_AC3"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 16
            goto L_0x030a
        L_0x026e:
            java.lang.String r3 = "A_AAC"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 13
            goto L_0x030a
        L_0x027a:
            java.lang.String r3 = "A_DTS/LOSSLESS"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 21
            goto L_0x030a
        L_0x0286:
            java.lang.String r3 = "S_VOBSUB"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 30
            goto L_0x030a
        L_0x0292:
            java.lang.String r3 = "V_MPEG4/ISO/AVC"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 7
            goto L_0x030a
        L_0x029d:
            java.lang.String r3 = "V_MPEG4/ISO/ASP"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 5
            goto L_0x030a
        L_0x02a8:
            java.lang.String r3 = "S_DVBSUB"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 32
            goto L_0x030a
        L_0x02b3:
            java.lang.String r3 = "V_MS/VFW/FOURCC"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 9
            goto L_0x030a
        L_0x02be:
            java.lang.String r3 = "A_MPEG/L3"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 15
            goto L_0x030a
        L_0x02c9:
            java.lang.String r3 = "A_MPEG/L2"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 14
            goto L_0x030a
        L_0x02d4:
            java.lang.String r3 = "A_VORBIS"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 12
            goto L_0x030a
        L_0x02df:
            java.lang.String r3 = "A_TRUEHD"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 18
            goto L_0x030a
        L_0x02ea:
            java.lang.String r3 = "A_MS/ACM"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 23
            goto L_0x030a
        L_0x02f5:
            java.lang.String r3 = "V_MPEG4/ISO/SP"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 4
            goto L_0x030a
        L_0x02ff:
            java.lang.String r3 = "V_MPEG4/ISO/AP"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0309
            r3 = 6
            goto L_0x030a
        L_0x0309:
            r3 = -1
        L_0x030a:
            switch(r3) {
                case 0: goto L_0x0310;
                case 1: goto L_0x0310;
                case 2: goto L_0x0310;
                case 3: goto L_0x0310;
                case 4: goto L_0x0310;
                case 5: goto L_0x0310;
                case 6: goto L_0x0310;
                case 7: goto L_0x0310;
                case 8: goto L_0x0310;
                case 9: goto L_0x0310;
                case 10: goto L_0x0310;
                case 11: goto L_0x0310;
                case 12: goto L_0x0310;
                case 13: goto L_0x0310;
                case 14: goto L_0x0310;
                case 15: goto L_0x0310;
                case 16: goto L_0x0310;
                case 17: goto L_0x0310;
                case 18: goto L_0x0310;
                case 19: goto L_0x0310;
                case 20: goto L_0x0310;
                case 21: goto L_0x0310;
                case 22: goto L_0x0310;
                case 23: goto L_0x0310;
                case 24: goto L_0x0310;
                case 25: goto L_0x0310;
                case 26: goto L_0x0310;
                case 27: goto L_0x0310;
                case 28: goto L_0x0310;
                case 29: goto L_0x0310;
                case 30: goto L_0x0310;
                case 31: goto L_0x0310;
                case 32: goto L_0x0310;
                default: goto L_0x030d;
            }
        L_0x030d:
            r1 = r12
            goto L_0x08c8
        L_0x0310:
            androidx.media3.extractor.ad r3 = r7.f10386ag
            int r5 = r0.f10324c
            int r17 = r1.hashCode()
            switch(r17) {
                case -2095576542: goto L_0x048c;
                case -2095575984: goto L_0x0482;
                case -1985379776: goto L_0x0477;
                case -1784763192: goto L_0x046c;
                case -1730367663: goto L_0x0461;
                case -1482641358: goto L_0x0456;
                case -1482641357: goto L_0x044b;
                case -1373388978: goto L_0x0440;
                case -933872740: goto L_0x0435;
                case -538363189: goto L_0x042a;
                case -538363109: goto L_0x041f;
                case -425012669: goto L_0x0413;
                case -356037306: goto L_0x0407;
                case 62923557: goto L_0x03fb;
                case 62923603: goto L_0x03ef;
                case 62927045: goto L_0x03e3;
                case 82318131: goto L_0x03d8;
                case 82338133: goto L_0x03cd;
                case 82338134: goto L_0x03c2;
                case 99146302: goto L_0x03b6;
                case 444813526: goto L_0x03aa;
                case 542569478: goto L_0x039e;
                case 635596514: goto L_0x0392;
                case 725948237: goto L_0x0386;
                case 725957860: goto L_0x037a;
                case 738597099: goto L_0x036e;
                case 855502857: goto L_0x0362;
                case 1045209816: goto L_0x0356;
                case 1422270023: goto L_0x034a;
                case 1809237540: goto L_0x033f;
                case 1950749482: goto L_0x0333;
                case 1950789798: goto L_0x0327;
                case 1951062397: goto L_0x031d;
                default: goto L_0x031b;
            }
        L_0x031b:
            goto L_0x0496
        L_0x031d:
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 12
            goto L_0x0497
        L_0x0327:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 22
            goto L_0x0497
        L_0x0333:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 17
            goto L_0x0497
        L_0x033f:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 3
            goto L_0x0497
        L_0x034a:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 27
            goto L_0x0497
        L_0x0356:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 29
            goto L_0x0497
        L_0x0362:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 8
            goto L_0x0497
        L_0x036e:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 28
            goto L_0x0497
        L_0x037a:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 24
            goto L_0x0497
        L_0x0386:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 25
            goto L_0x0497
        L_0x0392:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 26
            goto L_0x0497
        L_0x039e:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 20
            goto L_0x0497
        L_0x03aa:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 10
            goto L_0x0497
        L_0x03b6:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 31
            goto L_0x0497
        L_0x03c2:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 1
            goto L_0x0497
        L_0x03cd:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 0
            goto L_0x0497
        L_0x03d8:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 2
            goto L_0x0497
        L_0x03e3:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 19
            goto L_0x0497
        L_0x03ef:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 16
            goto L_0x0497
        L_0x03fb:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 13
            goto L_0x0497
        L_0x0407:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 21
            goto L_0x0497
        L_0x0413:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 30
            goto L_0x0497
        L_0x041f:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 7
            goto L_0x0497
        L_0x042a:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 5
            goto L_0x0497
        L_0x0435:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 32
            goto L_0x0497
        L_0x0440:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 9
            goto L_0x0497
        L_0x044b:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 15
            goto L_0x0497
        L_0x0456:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 14
            goto L_0x0497
        L_0x0461:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 11
            goto L_0x0497
        L_0x046c:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 18
            goto L_0x0497
        L_0x0477:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 23
            goto L_0x0497
        L_0x0482:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 4
            goto L_0x0497
        L_0x048c:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0496
            r2 = 6
            goto L_0x0497
        L_0x0496:
            r2 = -1
        L_0x0497:
            java.lang.String r17 = "audio/raw"
            java.lang.String r18 = "audio/x-unknown"
            java.lang.String r12 = ". Setting mimeType to audio/x-unknown"
            switch(r2) {
                case 0: goto L_0x067e;
                case 1: goto L_0x067b;
                case 2: goto L_0x0678;
                case 3: goto L_0x0675;
                case 4: goto L_0x0668;
                case 5: goto L_0x0668;
                case 6: goto L_0x0668;
                case 7: goto L_0x064d;
                case 8: goto L_0x0635;
                case 9: goto L_0x061d;
                case 10: goto L_0x061a;
                case 11: goto L_0x060c;
                case 12: goto L_0x05ca;
                case 13: goto L_0x05ad;
                case 14: goto L_0x05a4;
                case 15: goto L_0x05a1;
                case 16: goto L_0x059d;
                case 17: goto L_0x0599;
                case 18: goto L_0x058e;
                case 19: goto L_0x058a;
                case 20: goto L_0x058a;
                case 21: goto L_0x0586;
                case 22: goto L_0x057a;
                case 23: goto L_0x0543;
                case 24: goto L_0x051f;
                case 25: goto L_0x04fb;
                case 26: goto L_0x04e0;
                case 27: goto L_0x04dc;
                case 28: goto L_0x04ce;
                case 29: goto L_0x04ca;
                case 30: goto L_0x04be;
                case 31: goto L_0x04ba;
                case 32: goto L_0x04a8;
                default: goto L_0x04a0;
            }
        L_0x04a0:
            java.lang.String r0 = "Unrecognized codec identifier."
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x04a8:
            byte[] r2 = new byte[r14]
            byte[] r1 = r0.mo7372d(r1)
            r6 = 0
            java.lang.System.arraycopy(r1, r6, r2, r6, r14)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r2)
            java.lang.String r17 = "application/dvbsubs"
            goto L_0x0681
        L_0x04ba:
            java.lang.String r17 = "application/pgs"
            goto L_0x0680
        L_0x04be:
            byte[] r1 = r0.mo7372d(r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            java.lang.String r17 = "application/vobsub"
            goto L_0x0681
        L_0x04ca:
            java.lang.String r17 = "text/vtt"
            goto L_0x0680
        L_0x04ce:
            byte[] r2 = f10348a
            byte[] r1 = r0.mo7372d(r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89847o(r2, r1)
            java.lang.String r17 = "text/x-ssa"
            goto L_0x0681
        L_0x04dc:
            java.lang.String r17 = "application/x-subrip"
            goto L_0x0680
        L_0x04e0:
            int r1 = r0.f10312P
            if (r1 != r13) goto L_0x04e5
            goto L_0x053e
        L_0x04e5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Unsupported floating point PCM bit depth: "
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r10, r1)
            goto L_0x0576
        L_0x04fb:
            int r1 = r0.f10312P
            if (r1 != r6) goto L_0x0505
            r1 = 0
            r2 = -1
            r6 = 0
            r14 = 3
            goto L_0x0684
        L_0x0505:
            if (r1 != r9) goto L_0x050a
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x053e
        L_0x050a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Unsupported big endian PCM bit depth: "
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r10, r1)
            goto L_0x0576
        L_0x051f:
            int r1 = r0.f10312P
            int r14 = androidx.media3.common.p136b.C2612ak.m6988m(r1)
            if (r14 != 0) goto L_0x053e
            int r1 = r0.f10312P
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Unsupported little endian PCM bit depth: "
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r10, r1)
            goto L_0x0576
        L_0x053e:
            r1 = 0
            r2 = -1
            r6 = 0
            goto L_0x0684
        L_0x0543:
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            byte[] r1 = r0.mo7372d(r1)
            r2.<init>((byte[]) r1)
            boolean r1 = androidx.media3.extractor.p159f.C3399d.m9820c(r2)
            if (r1 == 0) goto L_0x0571
            int r1 = r0.f10312P
            int r14 = androidx.media3.common.p136b.C2612ak.m6988m(r1)
            if (r14 != 0) goto L_0x053e
            int r1 = r0.f10312P
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Unsupported PCM bit depth: "
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = r2.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r10, r1)
            goto L_0x0576
        L_0x0571:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            androidx.media3.common.p136b.C2633u.m7050e(r10, r1)
        L_0x0576:
            r17 = r18
            goto L_0x0680
        L_0x057a:
            byte[] r1 = r0.mo7372d(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r17 = "audio/flac"
            goto L_0x0681
        L_0x0586:
            java.lang.String r17 = "audio/vnd.dts.hd"
            goto L_0x0680
        L_0x058a:
            java.lang.String r17 = "audio/vnd.dts"
            goto L_0x0680
        L_0x058e:
            androidx.media3.extractor.bg r1 = new androidx.media3.extractor.bg
            r1.<init>()
            r0.f10316T = r1
            java.lang.String r17 = "audio/true-hd"
            goto L_0x0680
        L_0x0599:
            java.lang.String r17 = "audio/eac3"
            goto L_0x0680
        L_0x059d:
            java.lang.String r17 = "audio/ac3"
            goto L_0x0680
        L_0x05a1:
            java.lang.String r17 = "audio/mpeg"
            goto L_0x05a6
        L_0x05a4:
            java.lang.String r17 = "audio/mpeg-L2"
        L_0x05a6:
            r1 = 4096(0x1000, float:5.74E-42)
            r1 = 0
            r2 = 4096(0x1000, float:5.74E-42)
            goto L_0x0682
        L_0x05ad:
            byte[] r1 = r0.mo7372d(r1)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.f10332k
            androidx.media3.extractor.a r2 = androidx.media3.extractor.C3352b.m9711a(r2)
            int r6 = r2.f10030a
            r0.f10313Q = r6
            int r6 = r2.f10031b
            r0.f10311O = r6
            java.lang.String r2 = r2.f10032c
            java.lang.String r17 = "audio/mp4a-latm"
            r6 = r2
            goto L_0x0666
        L_0x05ca:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r15)
            java.lang.String r2 = r0.f10323b
            byte[] r2 = r0.mo7372d(r2)
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r6)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r9)
            long r9 = r0.f10314R
            java.nio.ByteBuffer r2 = r2.putLong(r9)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r6)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r6)
            long r9 = r0.f10315S
            java.nio.ByteBuffer r2 = r2.putLong(r9)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.lang.String r17 = "audio/opus"
            r2 = 5760(0x1680, float:8.071E-42)
            goto L_0x0682
        L_0x060c:
            byte[] r1 = r0.mo7372d(r1)
            java.util.List r1 = androidx.media3.extractor.p159f.C3399d.m9819b(r1)
            java.lang.String r17 = "audio/vorbis"
            r2 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0682
        L_0x061a:
            java.lang.String r17 = "video/x-unknown"
            goto L_0x0680
        L_0x061d:
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            byte[] r1 = r0.mo7372d(r1)
            r2.<init>((byte[]) r1)
            android.util.Pair r1 = androidx.media3.extractor.p159f.C3399d.m9818a(r2)
            java.lang.Object r2 = r1.first
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
            goto L_0x0681
        L_0x0635:
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            byte[] r1 = r0.mo7372d(r1)
            r2.<init>((byte[]) r1)
            androidx.media3.extractor.ao r1 = androidx.media3.extractor.C3340ao.m9682a(r2)
            java.util.List r2 = r1.f10075a
            int r6 = r1.f10076b
            r0.f10321Y = r6
            java.lang.String r1 = r1.f10078d
            java.lang.String r17 = "video/hevc"
            goto L_0x0664
        L_0x064d:
            androidx.media3.common.b.ac r2 = new androidx.media3.common.b.ac
            byte[] r1 = r0.mo7372d(r1)
            r2.<init>((byte[]) r1)
            androidx.media3.extractor.f r1 = androidx.media3.extractor.C3395f.m9815a(r2)
            java.util.List r2 = r1.f10281a
            int r6 = r1.f10282b
            r0.f10321Y = r6
            java.lang.String r1 = r1.f10286f
            java.lang.String r17 = "video/avc"
        L_0x0664:
            r6 = r1
            r1 = r2
        L_0x0666:
            r2 = -1
            goto L_0x0683
        L_0x0668:
            byte[] r1 = r0.f10332k
            if (r1 != 0) goto L_0x066e
            r1 = 0
            goto L_0x0672
        L_0x066e:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x0672:
            java.lang.String r17 = "video/mp4v-es"
            goto L_0x0681
        L_0x0675:
            java.lang.String r17 = "video/mpeg2"
            goto L_0x0680
        L_0x0678:
            java.lang.String r17 = "video/av01"
            goto L_0x0680
        L_0x067b:
            java.lang.String r17 = "video/x-vnd.on2.vp9"
            goto L_0x0680
        L_0x067e:
            java.lang.String r17 = "video/x-vnd.on2.vp8"
        L_0x0680:
            r1 = 0
        L_0x0681:
            r2 = -1
        L_0x0682:
            r6 = 0
        L_0x0683:
            r14 = -1
        L_0x0684:
            byte[] r9 = r0.f10310N
            if (r9 == 0) goto L_0x0697
            androidx.media3.common.b.ac r10 = new androidx.media3.common.b.ac
            r10.<init>((byte[]) r9)
            androidx.media3.extractor.w r9 = androidx.media3.extractor.C3633w.m10477a(r10)
            if (r9 == 0) goto L_0x0697
            java.lang.String r6 = r9.f11579a
            java.lang.String r17 = "video/dolby-vision"
        L_0x0697:
            r9 = r17
            boolean r10 = r0.f10318V
            boolean r12 = r0.f10317U
            if (r8 == r12) goto L_0x06a1
            r12 = 0
            goto L_0x06a2
        L_0x06a1:
            r12 = 2
        L_0x06a2:
            r10 = r10 | r12
            androidx.media3.common.w r12 = new androidx.media3.common.w
            r12.<init>()
            boolean r13 = androidx.media3.common.C2598ay.m6813l(r9)
            if (r13 == 0) goto L_0x06bb
            int r4 = r0.f10311O
            r12.f7472x = r4
            int r4 = r0.f10313Q
            r12.f7473y = r4
            r12.f7474z = r14
            r15 = 1
            goto L_0x0886
        L_0x06bb:
            boolean r8 = androidx.media3.common.C2598ay.m6817p(r9)
            if (r8 == 0) goto L_0x084d
            int r8 = r0.f10338q
            if (r8 != 0) goto L_0x06d5
            int r8 = r0.f10336o
            if (r8 != r11) goto L_0x06cb
            int r8 = r0.f10334m
        L_0x06cb:
            r0.f10336o = r8
            int r8 = r0.f10337p
            if (r8 != r11) goto L_0x06d3
            int r8 = r0.f10335n
        L_0x06d3:
            r0.f10337p = r8
        L_0x06d5:
            int r8 = r0.f10336o
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == r11) goto L_0x06eb
            int r14 = r0.f10337p
            if (r14 == r11) goto L_0x06eb
            int r15 = r0.f10335n
            int r15 = r15 * r8
            float r8 = (float) r15
            int r15 = r0.f10334m
            int r15 = r15 * r14
            float r14 = (float) r15
            float r8 = r8 / r14
            goto L_0x06ed
        L_0x06eb:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x06ed:
            boolean r14 = r0.f10345x
            if (r14 == 0) goto L_0x07c8
            float r14 = r0.f10300D
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x07bb
            float r14 = r0.f10301E
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x07bb
            float r14 = r0.f10302F
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x07bb
            float r14 = r0.f10303G
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x07bb
            float r14 = r0.f10304H
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x07bb
            float r14 = r0.f10305I
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x07bb
            float r14 = r0.f10306J
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x07bb
            float r14 = r0.f10307K
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x07bb
            float r14 = r0.f10308L
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x07bb
            float r14 = r0.f10309M
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x072f
            goto L_0x07bb
        L_0x072f:
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r4)
            java.nio.ByteOrder r14 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r13 = r13.order(r14)
            r14 = 0
            r13.put(r14)
            float r14 = r0.f10300D
            r15 = 1195593728(0x47435000, float:50000.0)
            float r14 = r14 * r15
            r17 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            float r14 = r0.f10301E
            float r14 = r14 * r15
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            float r14 = r0.f10302F
            float r14 = r14 * r15
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            float r14 = r0.f10303G
            float r14 = r14 * r15
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            float r14 = r0.f10304H
            float r14 = r14 * r15
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            float r14 = r0.f10305I
            float r14 = r14 * r15
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            float r14 = r0.f10306J
            float r14 = r14 * r15
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            float r14 = r0.f10307K
            float r14 = r14 * r15
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            float r14 = r0.f10308L
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            float r14 = r0.f10309M
            float r14 = r14 + r17
            int r14 = (int) r14
            short r14 = (short) r14
            r13.putShort(r14)
            int r14 = r0.f10298B
            short r14 = (short) r14
            r13.putShort(r14)
            int r14 = r0.f10299C
            short r14 = (short) r14
            r13.putShort(r14)
            goto L_0x07bc
        L_0x07bb:
            r4 = 0
        L_0x07bc:
            androidx.media3.common.n r13 = new androidx.media3.common.n
            int r14 = r0.f10346y
            int r15 = r0.f10297A
            int r11 = r0.f10347z
            r13.<init>(r14, r15, r11, r4)
            goto L_0x07c9
        L_0x07c8:
            r13 = 0
        L_0x07c9:
            java.lang.String r4 = r0.f10322a
            if (r4 == 0) goto L_0x07e2
            java.util.Map r11 = f10350c
            boolean r4 = r11.containsKey(r4)
            if (r4 == 0) goto L_0x07e2
            java.lang.String r4 = r0.f10322a
            java.lang.Object r4 = r11.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r11 = r4.intValue()
            goto L_0x07e3
        L_0x07e2:
            r11 = -1
        L_0x07e3:
            int r4 = r0.f10339r
            if (r4 != 0) goto L_0x0834
            float r4 = r0.f10340s
            r14 = 0
            int r4 = java.lang.Float.compare(r4, r14)
            if (r4 != 0) goto L_0x0834
            float r4 = r0.f10341t
            int r4 = java.lang.Float.compare(r4, r14)
            if (r4 != 0) goto L_0x0834
            float r4 = r0.f10342u
            int r4 = java.lang.Float.compare(r4, r14)
            if (r4 != 0) goto L_0x0802
            r4 = 0
            goto L_0x0835
        L_0x0802:
            float r4 = r0.f10341t
            r14 = 1119092736(0x42b40000, float:90.0)
            int r4 = java.lang.Float.compare(r4, r14)
            if (r4 != 0) goto L_0x080f
            r4 = 90
            goto L_0x0835
        L_0x080f:
            float r4 = r0.f10341t
            r14 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r4 = java.lang.Float.compare(r4, r14)
            if (r4 == 0) goto L_0x0831
            float r4 = r0.f10341t
            r14 = 1127481344(0x43340000, float:180.0)
            int r4 = java.lang.Float.compare(r4, r14)
            if (r4 != 0) goto L_0x0824
            goto L_0x0831
        L_0x0824:
            float r4 = r0.f10341t
            r14 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r4 = java.lang.Float.compare(r4, r14)
            if (r4 != 0) goto L_0x0834
            r4 = 270(0x10e, float:3.78E-43)
            goto L_0x0835
        L_0x0831:
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x0835
        L_0x0834:
            r4 = r11
        L_0x0835:
            int r11 = r0.f10334m
            r12.f7464p = r11
            int r11 = r0.f10335n
            r12.f7465q = r11
            r12.f7468t = r8
            r12.f7467s = r4
            byte[] r4 = r0.f10343v
            r12.f7469u = r4
            int r4 = r0.f10344w
            r12.f7470v = r4
            r12.f7471w = r13
            r15 = 2
            goto L_0x0886
        L_0x084d:
            java.lang.String r4 = "application/x-subrip"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0886
            java.lang.String r4 = "text/x-ssa"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0886
            java.lang.String r4 = "text/vtt"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0886
            java.lang.String r4 = "application/vobsub"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0886
            java.lang.String r4 = "application/pgs"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0886
            java.lang.String r4 = "application/dvbsubs"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x087e
            goto L_0x0886
        L_0x087e:
            java.lang.String r0 = "Unexpected MIME type."
            r1 = 0
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x0886:
            java.lang.String r4 = r0.f10322a
            if (r4 == 0) goto L_0x0896
            java.util.Map r8 = f10350c
            boolean r4 = r8.containsKey(r4)
            if (r4 != 0) goto L_0x0896
            java.lang.String r4 = r0.f10322a
            r12.f7450b = r4
        L_0x0896:
            java.lang.String r4 = java.lang.Integer.toString(r5)
            r12.f7449a = r4
            r12.f7459k = r9
            r12.f7460l = r2
            java.lang.String r2 = r0.f10319W
            r12.f7451c = r2
            r12.f7452d = r10
            r12.f7461m = r1
            r12.f7456h = r6
            androidx.media3.common.DrmInitData r1 = r0.f10333l
            r12.f7462n = r1
            androidx.media3.common.x r1 = new androidx.media3.common.x
            r1.<init>(r12)
            int r2 = r0.f10324c
            androidx.media3.extractor.bf r2 = r3.mo6987eZ(r2, r15)
            r0.f10320X = r2
            androidx.media3.extractor.bf r2 = r0.f10320X
            r2.mo6850b(r1)
            android.util.SparseArray r1 = r7.f10389h
            int r2 = r0.f10324c
            r1.put(r2, r0)
            r1 = 0
        L_0x08c8:
            r7.f10407z = r1
            return
        L_0x08cb:
            r1 = r12
            java.lang.String r0 = "CodecId is missing in TrackEntry element"
            androidx.media3.common.az r0 = androidx.media3.common.C2599az.m6819a(r0, r1)
            throw r0
        L_0x08d3:
            int r0 = r7.f10365L
            r1 = 2
            if (r0 == r1) goto L_0x08d9
            return
        L_0x08d9:
            android.util.SparseArray r0 = r7.f10389h
            int r1 = r7.f10371R
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            androidx.media3.extractor.f.d r9 = (androidx.media3.extractor.p159f.C3399d) r9
            androidx.media3.extractor.bf r0 = r9.f10320X
            r0.getClass()
            long r0 = r7.f10376W
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0913
            java.lang.String r0 = r9.f10323b
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0913
            androidx.media3.common.b.ac r0 = r7.f10400s
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r6)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            long r2 = r7.f10376W
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            int r2 = r1.length
            r0.mo6157y(r1, r2)
        L_0x0913:
            r0 = 0
            r4 = 0
        L_0x0915:
            int r1 = r7.f10369P
            if (r4 >= r1) goto L_0x0921
            int[] r1 = r7.f10370Q
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L_0x0915
        L_0x0921:
            r4 = 0
        L_0x0922:
            int r1 = r7.f10369P
            if (r4 >= r1) goto L_0x0952
            long r1 = r7.f10366M
            int r3 = r9.f10326e
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r5 = r5 + r1
            int r1 = r7.f10373T
            if (r4 != 0) goto L_0x093d
            boolean r2 = r7.f10375V
            if (r2 != 0) goto L_0x093a
            r1 = r1 | 1
        L_0x093a:
            r4 = r1
            r10 = 0
            goto L_0x093f
        L_0x093d:
            r10 = r4
            r4 = r1
        L_0x093f:
            int[] r1 = r7.f10370Q
            r11 = r1[r10]
            int r12 = r0 - r11
            r0 = r21
            r1 = r9
            r2 = r5
            r5 = r11
            r6 = r12
            r0.m9827l(r1, r2, r4, r5, r6)
            int r4 = r10 + 1
            r0 = r12
            goto L_0x0922
        L_0x0952:
            r0 = 0
            r7.f10365L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p159f.C3400e.mo7373f(int):void");
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f10386ag = adVar;
    }

    public C3400e(int i) {
        C3397b bVar = new C3397b();
        this.f10403v = -1;
        this.f10404w = -9223372036854775807L;
        this.f10405x = -9223372036854775807L;
        this.f10406y = -9223372036854775807L;
        this.f10358E = -1;
        this.f10359F = -1;
        this.f10360G = -9223372036854775807L;
        this.f10387ah = bVar;
        bVar.f10295g = new C3398c(this);
        this.f10390i = 1 == (i ^ 1);
        this.f10388g = new C3402g();
        this.f10389h = new SparseArray();
        this.f10393l = new C2604ac(4);
        this.f10394m = new C2604ac(ByteBuffer.allocate(4).putInt(-1).array());
        this.f10395n = new C2604ac(4);
        this.f10391j = new C2604ac(C3347av.f10114a);
        this.f10392k = new C2604ac(4);
        this.f10396o = new C2604ac();
        this.f10397p = new C2604ac();
        this.f10398q = new C2604ac(8);
        this.f10399r = new C2604ac();
        this.f10400s = new C2604ac();
        this.f10370Q = new int[1];
    }
}
