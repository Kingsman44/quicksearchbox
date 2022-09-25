package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lr */
/* compiled from: PG */
public final class C7100lr implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f22803a = 0;

    /* renamed from: b */
    private static final byte[] f22804b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final byte[] f22805c = aeu.m18555y("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d */
    private static final byte[] f22806d = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final UUID f22807e = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Map f22808f;

    /* renamed from: A */
    private boolean f22809A;

    /* renamed from: B */
    private int f22810B;

    /* renamed from: C */
    private long f22811C;

    /* renamed from: D */
    private boolean f22812D;

    /* renamed from: E */
    private long f22813E;

    /* renamed from: F */
    private long f22814F;

    /* renamed from: G */
    private long f22815G;

    /* renamed from: H */
    private adv f22816H;

    /* renamed from: I */
    private adv f22817I;

    /* renamed from: J */
    private boolean f22818J;

    /* renamed from: K */
    private boolean f22819K;

    /* renamed from: L */
    private int f22820L;

    /* renamed from: M */
    private long f22821M;

    /* renamed from: N */
    private long f22822N;

    /* renamed from: O */
    private int f22823O;

    /* renamed from: P */
    private int f22824P;

    /* renamed from: Q */
    private int[] f22825Q;

    /* renamed from: R */
    private int f22826R;

    /* renamed from: S */
    private int f22827S;

    /* renamed from: T */
    private int f22828T;

    /* renamed from: U */
    private int f22829U;

    /* renamed from: V */
    private boolean f22830V;

    /* renamed from: W */
    private int f22831W;

    /* renamed from: X */
    private int f22832X;

    /* renamed from: Y */
    private int f22833Y;

    /* renamed from: Z */
    private boolean f22834Z;

    /* renamed from: aa */
    private boolean f22835aa;

    /* renamed from: ab */
    private boolean f22836ab;

    /* renamed from: ac */
    private int f22837ac;

    /* renamed from: ad */
    private byte f22838ad;

    /* renamed from: ae */
    private boolean f22839ae;

    /* renamed from: af */
    private C7056ka f22840af;

    /* renamed from: ag */
    private final C7094ll f22841ag;

    /* renamed from: g */
    private final C7102lt f22842g;

    /* renamed from: h */
    private final SparseArray f22843h;

    /* renamed from: i */
    private final boolean f22844i;

    /* renamed from: j */
    private final aee f22845j;

    /* renamed from: k */
    private final aee f22846k;

    /* renamed from: l */
    private final aee f22847l;

    /* renamed from: m */
    private final aee f22848m;

    /* renamed from: n */
    private final aee f22849n;

    /* renamed from: o */
    private final aee f22850o;

    /* renamed from: p */
    private final aee f22851p;

    /* renamed from: q */
    private final aee f22852q;

    /* renamed from: r */
    private final aee f22853r;

    /* renamed from: s */
    private final aee f22854s;

    /* renamed from: t */
    private ByteBuffer f22855t;

    /* renamed from: u */
    private long f22856u;

    /* renamed from: v */
    private long f22857v;

    /* renamed from: w */
    private long f22858w;

    /* renamed from: x */
    private long f22859x;

    /* renamed from: y */
    private long f22860y;

    /* renamed from: z */
    private C7098lp f22861z;

    static {
        int i = C7096ln.f22743b;
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f22808f = Collections.unmodifiableMap(hashMap);
    }

    public C7100lr() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21055o(com.google.ads.interactivemedia.p367v3.internal.C7098lp r17, long r18, int r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            com.google.ads.interactivemedia.v3.internal.lq r1 = r2.f22763S
            r8 = 1
            if (r1 == 0) goto L_0x0018
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r1.mo16152b(r2, r3, r5, r6, r7)
            goto L_0x00c8
        L_0x0018:
            java.lang.String r1 = r2.f22771b
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r1 = r3.equals(r1)
            java.lang.String r4 = "S_TEXT/ASS"
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r2.f22771b
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0048
        L_0x002c:
            int r1 = r0.f22824P
            java.lang.String r5 = "MatroskaExtractor"
            if (r1 <= r8) goto L_0x0038
            java.lang.String r1 = "Skipping subtitle sample in laced block."
            android.util.Log.w(r5, r1)
            goto L_0x0048
        L_0x0038:
            long r6 = r0.f22822N
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = "Skipping subtitle sample with no duration."
            android.util.Log.w(r5, r1)
        L_0x0048:
            r1 = r21
            goto L_0x009a
        L_0x004b:
            java.lang.String r1 = r2.f22771b
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f22851p
            byte[] r5 = r5.mo14555i()
            int r9 = r1.hashCode()
            r10 = 738597099(0x2c0618eb, float:1.9056378E-12)
            if (r9 == r10) goto L_0x0072
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r9 != r4) goto L_0x00cb
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = "%02d:%02d:%02d,%03d"
            r3 = 1000(0x3e8, double:4.94E-321)
            byte[] r1 = m21058r(r6, r1, r3)
            r3 = 19
            goto L_0x0082
        L_0x0072:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = "%01d:%02d:%02d:%02d"
            r3 = 10000(0x2710, double:4.9407E-320)
            byte[] r1 = m21058r(r6, r1, r3)
            r3 = 21
        L_0x0082:
            r4 = 0
            int r6 = r1.length
            java.lang.System.arraycopy(r1, r4, r5, r3, r6)
            com.google.ads.interactivemedia.v3.internal.kr r1 = r2.f22766V
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f22851p
            int r4 = r3.mo14551e()
            r1.mo16105d(r3, r4)
            com.google.ads.interactivemedia.v3.internal.aee r1 = r0.f22851p
            int r1 = r1.mo14551e()
            int r1 = r21 + r1
        L_0x009a:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r20 & r3
            if (r3 == 0) goto L_0x00ba
            int r3 = r0.f22824P
            if (r3 <= r8) goto L_0x00ac
            r3 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r3 = r20 & r3
            r13 = r1
            r12 = r3
            goto L_0x00bd
        L_0x00ac:
            com.google.ads.interactivemedia.v3.internal.aee r3 = r0.f22854s
            int r3 = r3.mo14551e()
            com.google.ads.interactivemedia.v3.internal.kr r4 = r2.f22766V
            com.google.ads.interactivemedia.v3.internal.aee r5 = r0.f22854s
            r4.mo16107f(r5, r3)
            int r1 = r1 + r3
        L_0x00ba:
            r12 = r20
            r13 = r1
        L_0x00bd:
            com.google.ads.interactivemedia.v3.internal.kr r9 = r2.f22766V
            com.google.ads.interactivemedia.v3.internal.kq r15 = r2.f22778i
            r10 = r18
            r14 = r22
            r9.mo16103b(r10, r12, r13, r14, r15)
        L_0x00c8:
            r0.f22819K = r8
            return
        L_0x00cb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7100lr.m21055o(com.google.ads.interactivemedia.v3.internal.lp, long, int, int, int):void");
    }

    /* renamed from: p */
    private final int m21056p() {
        int i = this.f22832X;
        m21057q();
        return i;
    }

    /* renamed from: q */
    private final void m21057q() {
        this.f22831W = 0;
        this.f22832X = 0;
        this.f22833Y = 0;
        this.f22834Z = false;
        this.f22835aa = false;
        this.f22836ab = false;
        this.f22837ac = 0;
        this.f22838ad = 0;
        this.f22839ae = false;
        this.f22850o.mo14547a(0);
    }

    /* renamed from: r */
    private static byte[] m21058r(long j, String str, long j2) {
        ary.m19462o(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return aeu.m18555y(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* renamed from: s */
    private final long m21059s(long j) {
        long j2 = this.f22858w;
        if (j2 != -9223372036854775807L) {
            return aeu.m18496N(j, j2, 1000);
        }
        throw new C6886dt("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: t */
    private static int[] m21060t(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* renamed from: u */
    private final void m21061u(C7050jv jvVar, int i) {
        if (this.f22847l.mo14551e() < i) {
            if (this.f22847l.mo14556j() < i) {
                aee aee = this.f22847l;
                byte[] i2 = aee.mo14555i();
                int length = this.f22847l.mo14555i().length;
                aee.mo14549c(Arrays.copyOf(i2, Math.max(length + length, i)), this.f22847l.mo14551e());
            }
            jvVar.mo16090c(this.f22847l.mo14555i(), this.f22847l.mo14551e(), i - this.f22847l.mo14551e());
            this.f22847l.mo14552f(i);
        }
    }

    /* renamed from: v */
    private final int m21062v(C7050jv jvVar, C7098lp lpVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(lpVar.f22771b)) {
            m21063w(jvVar, f22804b, i);
            return m21056p();
        } else if ("S_TEXT/ASS".equals(lpVar.f22771b)) {
            m21063w(jvVar, f22806d, i);
            return m21056p();
        } else {
            C7073kr krVar = lpVar.f22766V;
            boolean z = true;
            if (!this.f22834Z) {
                if (lpVar.f22776g) {
                    this.f22828T &= -1073741825;
                    int i3 = 128;
                    if (!this.f22835aa) {
                        jvVar.mo16090c(this.f22847l.mo14555i(), 0, 1);
                        this.f22831W++;
                        if ((this.f22847l.mo14555i()[0] & 128) != 128) {
                            this.f22838ad = this.f22847l.mo14555i()[0];
                            this.f22835aa = true;
                        } else {
                            throw new C6886dt("Extension bit is set in signal byte");
                        }
                    }
                    byte b = this.f22838ad;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.f22828T |= 1073741824;
                        if (!this.f22839ae) {
                            jvVar.mo16090c(this.f22852q.mo14555i(), 0, 8);
                            this.f22831W += 8;
                            this.f22839ae = true;
                            byte[] i4 = this.f22847l.mo14555i();
                            if (b2 != 2) {
                                i3 = 0;
                            }
                            i4[0] = (byte) (i3 | 8);
                            this.f22847l.mo14554h(0);
                            krVar.mo16107f(this.f22847l, 1);
                            this.f22832X++;
                            this.f22852q.mo14554h(0);
                            krVar.mo16107f(this.f22852q, 8);
                            this.f22832X += 8;
                        }
                        if (b2 == 2) {
                            if (!this.f22836ab) {
                                jvVar.mo16090c(this.f22847l.mo14555i(), 0, 1);
                                this.f22831W++;
                                this.f22847l.mo14554h(0);
                                this.f22837ac = this.f22847l.mo14560n();
                                this.f22836ab = true;
                            }
                            int i5 = this.f22837ac * 4;
                            this.f22847l.mo14547a(i5);
                            jvVar.mo16090c(this.f22847l.mo14555i(), 0, i5);
                            this.f22831W += i5;
                            int i6 = (this.f22837ac >> 1) + 1;
                            int i7 = (i6 * 6) + 2;
                            ByteBuffer byteBuffer = this.f22855t;
                            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                                this.f22855t = ByteBuffer.allocate(i7);
                            }
                            this.f22855t.position(0);
                            this.f22855t.putShort((short) i6);
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                i2 = this.f22837ac;
                                if (i8 >= i2) {
                                    break;
                                }
                                int B = this.f22847l.mo14538B();
                                if (i8 % 2 == 0) {
                                    this.f22855t.putShort((short) (B - i9));
                                } else {
                                    this.f22855t.putInt(B - i9);
                                }
                                i8++;
                                i9 = B;
                            }
                            int i10 = (i - this.f22831W) - i9;
                            if ((i2 & 1) == 1) {
                                this.f22855t.putInt(i10);
                            } else {
                                this.f22855t.putShort((short) i10);
                                this.f22855t.putInt(0);
                            }
                            this.f22853r.mo14549c(this.f22855t.array(), i7);
                            krVar.mo16107f(this.f22853r, i7);
                            this.f22832X += i7;
                        }
                    }
                } else {
                    byte[] bArr = lpVar.f22777h;
                    if (bArr != null) {
                        this.f22850o.mo14549c(bArr, bArr.length);
                    }
                }
                if (lpVar.f22775f > 0) {
                    this.f22828T |= 268435456;
                    this.f22854s.mo14547a(0);
                    this.f22847l.mo14547a(4);
                    this.f22847l.mo14555i()[0] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
                    this.f22847l.mo14555i()[1] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
                    this.f22847l.mo14555i()[2] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
                    this.f22847l.mo14555i()[3] = (byte) (i & PrivateKeyType.INVALID);
                    krVar.mo16107f(this.f22847l, 4);
                    this.f22832X += 4;
                }
                this.f22834Z = true;
            }
            int e = i + this.f22850o.mo14551e();
            if (!"V_MPEG4/ISO/AVC".equals(lpVar.f22771b) && !"V_MPEGH/ISO/HEVC".equals(lpVar.f22771b)) {
                if (lpVar.f22763S != null) {
                    if (this.f22850o.mo14551e() != 0) {
                        z = false;
                    }
                    ary.m19464q(z);
                    lpVar.f22763S.mo16154d(jvVar);
                }
                while (true) {
                    int i11 = this.f22831W;
                    if (i11 >= e) {
                        break;
                    }
                    int x = m21064x(jvVar, krVar, e - i11);
                    this.f22831W += x;
                    this.f22832X += x;
                }
            } else {
                byte[] i12 = this.f22846k.mo14555i();
                i12[0] = 0;
                i12[1] = 0;
                i12[2] = 0;
                int i13 = lpVar.f22767W;
                int i14 = 4 - i13;
                while (this.f22831W < e) {
                    int i15 = this.f22833Y;
                    if (i15 == 0) {
                        int min = Math.min(i13, this.f22850o.mo14550d());
                        jvVar.mo16090c(i12, i14 + min, i13 - min);
                        if (min > 0) {
                            this.f22850o.mo14559m(i12, i14, min);
                        }
                        this.f22831W += i13;
                        this.f22846k.mo14554h(0);
                        this.f22833Y = this.f22846k.mo14538B();
                        this.f22845j.mo14554h(0);
                        krVar.mo16105d(this.f22845j, 4);
                        this.f22832X += 4;
                    } else {
                        int x2 = m21064x(jvVar, krVar, i15);
                        this.f22831W += x2;
                        this.f22832X += x2;
                        this.f22833Y -= x2;
                    }
                }
            }
            if ("A_VORBIS".equals(lpVar.f22771b)) {
                this.f22848m.mo14554h(0);
                krVar.mo16105d(this.f22848m, 4);
                this.f22832X += 4;
            }
            return m21056p();
        }
    }

    /* renamed from: w */
    private final void m21063w(C7050jv jvVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        if (this.f22851p.mo14556j() < i2) {
            this.f22851p.mo14548b(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, this.f22851p.mo14555i(), 0, length);
        }
        jvVar.mo16090c(this.f22851p.mo14555i(), length, i);
        this.f22851p.mo14547a(i2);
    }

    /* renamed from: x */
    private final int m21064x(C7050jv jvVar, C7073kr krVar, int i) {
        int d = this.f22850o.mo14550d();
        if (d <= 0) {
            return krVar.mo16104c(jvVar, i, false);
        }
        int min = Math.min(i, d);
        krVar.mo16105d(this.f22850o, min);
        return min;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16155a(int i, long j, long j2) {
        if (i == 160) {
            this.f22830V = false;
        } else if (i == 174) {
            this.f22861z = new C7098lp((byte[]) null);
        } else if (i == 187) {
            this.f22818J = false;
        } else if (i == 19899) {
            this.f22810B = -1;
            this.f22811C = -1;
        } else if (i == 20533) {
            this.f22861z.f22776g = true;
        } else if (i == 21968) {
            this.f22861z.f22792w = true;
        } else if (i == 408125543) {
            long j3 = this.f22857v;
            if (j3 == -1 || j3 == j) {
                this.f22857v = j;
                this.f22856u = j2;
                return;
            }
            throw new C6886dt("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f22816H = new adv();
            this.f22817I = new adv();
        } else if (i != 524531317 || this.f22809A) {
        } else {
            if (!this.f22844i || this.f22813E == -1) {
                this.f22840af.mo16115am(new C7069kn(this.f22860y));
                this.f22809A = true;
                return;
            }
            this.f22812D = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo16157c(int i, long j) {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f22861z.f22773d = (int) j;
                        return;
                    case 136:
                        C7098lp lpVar = this.f22861z;
                        if (j == 1) {
                            z = true;
                        }
                        lpVar.f22765U = z;
                        return;
                    case 155:
                        this.f22822N = m21059s(j);
                        return;
                    case 159:
                        this.f22861z.f22758N = (int) j;
                        return;
                    case 176:
                        this.f22861z.f22781l = (int) j;
                        return;
                    case 179:
                        this.f22816H.mo14517a(m21059s(j));
                        return;
                    case 186:
                        this.f22861z.f22782m = (int) j;
                        return;
                    case 215:
                        this.f22861z.f22772c = (int) j;
                        return;
                    case 231:
                        this.f22815G = m21059s(j);
                        return;
                    case 238:
                        this.f22829U = (int) j;
                        return;
                    case 241:
                        if (!this.f22818J) {
                            this.f22817I.mo14517a(j);
                            this.f22818J = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f22830V = true;
                        return;
                    case 16871:
                        this.f22861z.f22768X = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new C6886dt(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new C6886dt(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new C6886dt(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new C6886dt(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new C6886dt(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.f22811C = j + this.f22857v;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f22861z.f22791v = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f22861z.f22791v = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f22861z.f22791v = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f22861z.f22791v = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f22861z.f22783n = (int) j;
                        return;
                    case 21682:
                        this.f22861z.f22785p = (int) j;
                        return;
                    case 21690:
                        this.f22861z.f22784o = (int) j;
                        return;
                    case 21930:
                        C7098lp lpVar2 = this.f22861z;
                        if (j == 1) {
                            z = true;
                        }
                        lpVar2.f22764T = z;
                        return;
                    case 21998:
                        this.f22861z.f22775f = (int) j;
                        return;
                    case 22186:
                        this.f22861z.f22761Q = j;
                        return;
                    case 22203:
                        this.f22861z.f22762R = j;
                        return;
                    case 25188:
                        this.f22861z.f22759O = (int) j;
                        return;
                    case 30321:
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f22861z.f22786q = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f22861z.f22786q = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f22861z.f22786q = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f22861z.f22786q = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        this.f22861z.f22774e = (int) j;
                        return;
                    case 2807729:
                        this.f22858w = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f22861z.f22795z = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f22861z.f22795z = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.f22861z.f22794y = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.f22861z.f22794y = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.f22861z.f22794y = 3;
                                return;
                            case 21947:
                                C7098lp lpVar3 = this.f22861z;
                                lpVar3.f22792w = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    lpVar3.f22793x = 1;
                                    return;
                                } else if (i6 == 9) {
                                    lpVar3.f22793x = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    lpVar3.f22793x = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f22861z.f22745A = (int) j;
                                return;
                            case 21949:
                                this.f22861z.f22746B = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new C6886dt(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new C6886dt(sb7.toString());
        }
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f22840af = kaVar;
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        this.f22815G = -9223372036854775807L;
        this.f22820L = 0;
        this.f22841ag.mo16148b();
        this.f22842g.mo16162a();
        m21057q();
        for (int i = 0; i < this.f22843h.size(); i++) {
            C7099lq lqVar = ((C7098lp) this.f22843h.valueAt(i)).f22763S;
            if (lqVar != null) {
                lqVar.mo16151a();
            }
        }
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        return new C7101ls().mo16161a(jvVar);
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        this.f22819K = false;
        while (!this.f22819K) {
            if (this.f22841ag.mo16149c(jvVar)) {
                long l = jvVar.mo16099l();
                if (this.f22812D) {
                    this.f22814F = l;
                    klVar.f22624a = this.f22813E;
                    this.f22812D = false;
                    return 1;
                } else if (this.f22809A) {
                    long j = this.f22814F;
                    if (j != -1) {
                        klVar.f22624a = j;
                        this.f22814F = -1;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.f22843h.size(); i++) {
                    C7098lp lpVar = (C7098lp) this.f22843h.valueAt(i);
                    C7099lq lqVar = lpVar.f22763S;
                    if (lqVar != null) {
                        lqVar.mo16153c(lpVar);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo16158i(int i, double d) {
        if (i == 181) {
            this.f22861z.f22760P = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f22861z.f22747C = (float) d;
                    return;
                case 21970:
                    this.f22861z.f22748D = (float) d;
                    return;
                case 21971:
                    this.f22861z.f22749E = (float) d;
                    return;
                case 21972:
                    this.f22861z.f22750F = (float) d;
                    return;
                case 21973:
                    this.f22861z.f22751G = (float) d;
                    return;
                case 21974:
                    this.f22861z.f22752H = (float) d;
                    return;
                case 21975:
                    this.f22861z.f22753I = (float) d;
                    return;
                case 21976:
                    this.f22861z.f22754J = (float) d;
                    return;
                case 21977:
                    this.f22861z.f22755K = (float) d;
                    return;
                case 21978:
                    this.f22861z.f22756L = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            this.f22861z.f22787r = (float) d;
                            return;
                        case 30324:
                            this.f22861z.f22788s = (float) d;
                            return;
                        case 30325:
                            this.f22861z.f22789t = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f22859x = (long) d;
        }
    }

    public C7100lr(int i) {
        C7094ll llVar = new C7094ll();
        this.f22857v = -1;
        this.f22858w = -9223372036854775807L;
        this.f22859x = -9223372036854775807L;
        this.f22860y = -9223372036854775807L;
        this.f22813E = -1;
        this.f22814F = -1;
        this.f22815G = -9223372036854775807L;
        this.f22841ag = llVar;
        llVar.mo16147a(new C7097lo(this));
        this.f22844i = (i ^ 1) == 1;
        this.f22842g = new C7102lt();
        this.f22843h = new SparseArray();
        this.f22847l = new aee(4);
        this.f22848m = new aee(ByteBuffer.allocate(4).putInt(-1).array());
        this.f22849n = new aee(4);
        this.f22845j = new aee(aec.f20417a);
        this.f22846k = new aee(4);
        this.f22850o = new aee();
        this.f22851p = new aee();
        this.f22852q = new aee(8);
        this.f22853r = new aee();
        this.f22854s = new aee();
        this.f22825Q = new int[1];
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo16159j(int i, String str) {
        if (i == 134) {
            this.f22861z.f22771b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                this.f22861z.f22770a = str;
            } else if (i == 2274716) {
                this.f22861z.f22769Y = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new C6886dt(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0255, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.C6886dt("EBML lacing sample size out of range.");
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16160n(int r18, int r19, com.google.ads.interactivemedia.p367v3.internal.C7050jv r20) {
        /*
            r17 = this;
            r7 = r17
            r0 = r18
            r1 = r19
            r8 = r20
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 4
            r4 = 163(0xa3, float:2.28E-43)
            r5 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x00f2
            if (r0 == r4) goto L_0x00f2
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00c2
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x009f
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x0093
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x0084
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0061
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0055
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x003c
            com.google.ads.interactivemedia.v3.internal.lp r0 = r7.f22861z
            byte[] r2 = new byte[r1]
            r0.f22790u = r2
            byte[] r0 = r0.f22790u
            r8.mo16090c(r0, r10, r1)
            return
        L_0x003c:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 26
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected id: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0055:
            com.google.ads.interactivemedia.v3.internal.lp r0 = r7.f22861z
            byte[] r2 = new byte[r1]
            r0.f22779j = r2
            byte[] r0 = r0.f22779j
            r8.mo16090c(r0, r10, r1)
            return
        L_0x0061:
            com.google.ads.interactivemedia.v3.internal.aee r0 = r7.f22849n
            byte[] r0 = r0.mo14555i()
            java.util.Arrays.fill(r0, r10)
            com.google.ads.interactivemedia.v3.internal.aee r0 = r7.f22849n
            byte[] r0 = r0.mo14555i()
            int r2 = 4 - r1
            r8.mo16090c(r0, r2, r1)
            com.google.ads.interactivemedia.v3.internal.aee r0 = r7.f22849n
            r0.mo14554h(r10)
            com.google.ads.interactivemedia.v3.internal.aee r0 = r7.f22849n
            long r0 = r0.mo14566t()
            int r1 = (int) r0
            r7.f22810B = r1
            return
        L_0x0084:
            byte[] r0 = new byte[r1]
            r8.mo16090c(r0, r10, r1)
            com.google.ads.interactivemedia.v3.internal.lp r1 = r7.f22861z
            com.google.ads.interactivemedia.v3.internal.kq r2 = new com.google.ads.interactivemedia.v3.internal.kq
            r2.<init>(r9, r0, r10, r10)
            r1.f22778i = r2
            return
        L_0x0093:
            com.google.ads.interactivemedia.v3.internal.lp r0 = r7.f22861z
            byte[] r2 = new byte[r1]
            r0.f22777h = r2
            byte[] r0 = r0.f22777h
            r8.mo16090c(r0, r10, r1)
            return
        L_0x009f:
            com.google.ads.interactivemedia.v3.internal.lp r0 = r7.f22861z
            int r2 = r0.f22768X
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto L_0x00b8
            int r2 = r0.f22768X
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto L_0x00b4
            goto L_0x00b8
        L_0x00b4:
            r8.mo16091d(r1)
            return
        L_0x00b8:
            byte[] r2 = new byte[r1]
            r0.f22757M = r2
            byte[] r0 = r0.f22757M
            r8.mo16090c(r0, r10, r1)
            return
        L_0x00c2:
            int r0 = r7.f22820L
            if (r0 == r5) goto L_0x00c7
            return
        L_0x00c7:
            android.util.SparseArray r0 = r7.f22843h
            int r2 = r7.f22826R
            java.lang.Object r0 = r0.get(r2)
            com.google.ads.interactivemedia.v3.internal.lp r0 = (com.google.ads.interactivemedia.p367v3.internal.C7098lp) r0
            int r2 = r7.f22829U
            if (r2 != r3) goto L_0x00ee
            java.lang.String r2 = "V_VP9"
            java.lang.String r0 = r0.f22771b
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00ee
            com.google.ads.interactivemedia.v3.internal.aee r0 = r7.f22854s
            r0.mo14547a(r1)
            com.google.ads.interactivemedia.v3.internal.aee r0 = r7.f22854s
            byte[] r0 = r0.mo14555i()
            r8.mo16090c(r0, r10, r1)
            return
        L_0x00ee:
            r8.mo16091d(r1)
            return
        L_0x00f2:
            int r2 = r7.f22820L
            r6 = 8
            if (r2 != 0) goto L_0x0117
            com.google.ads.interactivemedia.v3.internal.lt r2 = r7.f22842g
            long r11 = r2.mo16164e(r8, r10, r9, r6)
            int r2 = (int) r11
            r7.f22826R = r2
            com.google.ads.interactivemedia.v3.internal.lt r2 = r7.f22842g
            int r2 = r2.mo16163b()
            r7.f22827S = r2
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f22822N = r11
            r7.f22820L = r9
            com.google.ads.interactivemedia.v3.internal.aee r2 = r7.f22847l
            r2.mo14547a(r10)
        L_0x0117:
            android.util.SparseArray r2 = r7.f22843h
            int r11 = r7.f22826R
            java.lang.Object r2 = r2.get(r11)
            r11 = r2
            com.google.ads.interactivemedia.v3.internal.lp r11 = (com.google.ads.interactivemedia.p367v3.internal.C7098lp) r11
            if (r11 != 0) goto L_0x012e
            int r0 = r7.f22827S
            int r0 = r1 - r0
            r8.mo16091d(r0)
            r7.f22820L = r10
            return
        L_0x012e:
            int r2 = r7.f22820L
            if (r2 != r9) goto L_0x02b6
            r2 = 3
            r7.m21061u(r8, r2)
            com.google.ads.interactivemedia.v3.internal.aee r12 = r7.f22847l
            byte[] r12 = r12.mo14555i()
            byte r12 = r12[r5]
            r12 = r12 & 6
            int r12 = r12 >> r9
            r13 = 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x0158
            r7.f22824P = r9
            int[] r2 = r7.f22825Q
            int[] r2 = m21060t(r2, r9)
            r7.f22825Q = r2
            int r3 = r7.f22827S
            int r1 = r1 - r3
            int r1 = r1 + -3
            r2[r10] = r1
            goto L_0x0267
        L_0x0158:
            r7.m21061u(r8, r3)
            com.google.ads.interactivemedia.v3.internal.aee r14 = r7.f22847l
            byte[] r14 = r14.mo14555i()
            byte r14 = r14[r2]
            r14 = r14 & r13
            int r14 = r14 + r9
            r7.f22824P = r14
            int[] r15 = r7.f22825Q
            int[] r14 = m21060t(r15, r14)
            r7.f22825Q = r14
            if (r12 != r5) goto L_0x017e
            int r2 = r7.f22827S
            int r3 = r7.f22824P
            int r1 = r1 - r2
            int r1 = r1 + -4
            int r1 = r1 / r3
            java.util.Arrays.fill(r14, r10, r3, r1)
            goto L_0x0267
        L_0x017e:
            if (r12 != r9) goto L_0x01b5
            r2 = 0
            r12 = 0
        L_0x0182:
            int r14 = r7.f22824P
            int r14 = r14 + -1
            if (r2 >= r14) goto L_0x01aa
            int[] r14 = r7.f22825Q
            r14[r2] = r10
        L_0x018c:
            int r3 = r3 + r9
            r7.m21061u(r8, r3)
            com.google.ads.interactivemedia.v3.internal.aee r14 = r7.f22847l
            byte[] r14 = r14.mo14555i()
            int r15 = r3 + -1
            byte r14 = r14[r15]
            r14 = r14 & r13
            int[] r15 = r7.f22825Q
            r16 = r15[r2]
            int r16 = r16 + r14
            r15[r2] = r16
            if (r14 == r13) goto L_0x018c
            int r12 = r12 + r16
            int r2 = r2 + 1
            goto L_0x0182
        L_0x01aa:
            int[] r2 = r7.f22825Q
            int r15 = r7.f22827S
            int r1 = r1 - r15
            int r1 = r1 - r3
            int r1 = r1 - r12
            r2[r14] = r1
            goto L_0x0267
        L_0x01b5:
            if (r12 != r2) goto L_0x02ae
            r2 = 0
            r12 = 0
        L_0x01b9:
            int r14 = r7.f22824P
            int r14 = r14 + -1
            if (r2 >= r14) goto L_0x025e
            int[] r14 = r7.f22825Q
            r14[r2] = r10
            int r3 = r3 + 1
            r7.m21061u(r8, r3)
            int r14 = r3 + -1
            com.google.ads.interactivemedia.v3.internal.aee r15 = r7.f22847l
            byte[] r15 = r15.mo14555i()
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x0256
            r15 = 0
        L_0x01d5:
            if (r15 >= r6) goto L_0x0226
            int r16 = 7 - r15
            int r16 = r9 << r16
            com.google.ads.interactivemedia.v3.internal.aee r4 = r7.f22847l
            byte[] r4 = r4.mo14555i()
            byte r4 = r4[r14]
            r4 = r4 & r16
            if (r4 == 0) goto L_0x021c
            int r3 = r3 + r15
            r7.m21061u(r8, r3)
            int r4 = r14 + 1
            com.google.ads.interactivemedia.v3.internal.aee r5 = r7.f22847l
            byte[] r5 = r5.mo14555i()
            byte r5 = r5[r14]
            r5 = r5 & r13
            r14 = r16 ^ -1
            r5 = r5 & r14
            long r9 = (long) r5
        L_0x01fa:
            if (r4 >= r3) goto L_0x020e
            int r5 = r4 + 1
            long r9 = r9 << r6
            com.google.ads.interactivemedia.v3.internal.aee r14 = r7.f22847l
            byte[] r14 = r14.mo14555i()
            byte r4 = r14[r4]
            r4 = r4 & r13
            long r13 = (long) r4
            long r9 = r9 | r13
            r4 = r5
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x01fa
        L_0x020e:
            if (r2 <= 0) goto L_0x0228
            int r15 = r15 * 7
            int r15 = r15 + 6
            r4 = 1
            long r4 = r4 << r15
            r13 = -1
            long r4 = r4 + r13
            long r9 = r9 - r4
            goto L_0x0228
        L_0x021c:
            int r15 = r15 + 1
            r4 = 163(0xa3, float:2.28E-43)
            r5 = 2
            r9 = 1
            r10 = 0
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x01d5
        L_0x0226:
            r9 = 0
        L_0x0228:
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 < 0) goto L_0x024e
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x024e
            int r4 = (int) r9
            int[] r5 = r7.f22825Q
            if (r2 == 0) goto L_0x0240
            int r9 = r2 + -1
            r9 = r5[r9]
            int r4 = r4 + r9
        L_0x0240:
            r5[r2] = r4
            int r12 = r12 + r4
            int r2 = r2 + 1
            r4 = 163(0xa3, float:2.28E-43)
            r5 = 2
            r9 = 1
            r10 = 0
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x01b9
        L_0x024e:
            com.google.ads.interactivemedia.v3.internal.dt r0 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r1 = "EBML lacing sample size out of range."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0256:
            com.google.ads.interactivemedia.v3.internal.dt r0 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r1 = "No valid varint length mask found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x025e:
            int[] r2 = r7.f22825Q
            int r4 = r7.f22827S
            int r1 = r1 - r4
            int r1 = r1 - r3
            int r1 = r1 - r12
            r2[r14] = r1
        L_0x0267:
            com.google.ads.interactivemedia.v3.internal.aee r1 = r7.f22847l
            byte[] r1 = r1.mo14555i()
            r2 = 0
            byte r1 = r1[r2]
            com.google.ads.interactivemedia.v3.internal.aee r2 = r7.f22847l
            byte[] r2 = r2.mo14555i()
            r3 = 1
            byte r2 = r2[r3]
            long r3 = r7.f22815G
            int r1 = r1 << r6
            r5 = 255(0xff, float:3.57E-43)
            r2 = r2 & r5
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.m21059s(r1)
            long r3 = r3 + r1
            r7.f22821M = r3
            int r1 = r11.f22773d
            r2 = 2
            if (r1 == r2) goto L_0x02a5
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02a3
            com.google.ads.interactivemedia.v3.internal.aee r0 = r7.f22847l
            byte[] r0 = r0.mo14555i()
            byte r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x02a1
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x02a5
        L_0x02a1:
            r0 = 163(0xa3, float:2.28E-43)
        L_0x02a3:
            r1 = 0
            goto L_0x02a6
        L_0x02a5:
            r1 = 1
        L_0x02a6:
            r7.f22828T = r1
            r7.f22820L = r2
            r1 = 0
            r7.f22823O = r1
            goto L_0x02b6
        L_0x02ae:
            com.google.ads.interactivemedia.v3.internal.dt r0 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r1 = "Unexpected lacing value: 2"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x02b6:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02e8
        L_0x02ba:
            int r0 = r7.f22823O
            int r1 = r7.f22824P
            if (r0 >= r1) goto L_0x02e4
            int[] r1 = r7.f22825Q
            r0 = r1[r0]
            int r5 = r7.m21062v(r8, r11, r0)
            long r0 = r7.f22821M
            int r2 = r7.f22823O
            int r3 = r11.f22774e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f22828T
            r6 = 0
            r0 = r17
            r1 = r11
            r0.m21055o(r1, r2, r4, r5, r6)
            int r0 = r7.f22823O
            r1 = 1
            int r0 = r0 + r1
            r7.f22823O = r0
            goto L_0x02ba
        L_0x02e4:
            r0 = 0
            r7.f22820L = r0
            return
        L_0x02e8:
            int r0 = r7.f22823O
            int r1 = r7.f22824P
            if (r0 >= r1) goto L_0x02ff
            int[] r1 = r7.f22825Q
            r2 = r1[r0]
            int r2 = r7.m21062v(r8, r11, r2)
            r1[r0] = r2
            int r0 = r7.f22823O
            r1 = 1
            int r0 = r0 + r1
            r7.f22823O = r0
            goto L_0x02e8
        L_0x02ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7100lr.mo16160n(int, int, com.google.ads.interactivemedia.v3.internal.jv):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16156b(int i) {
        int i2;
        int i3;
        C7070ko koVar;
        adv adv;
        adv adv2;
        int i4;
        int i5 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.f22861z.f22771b;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_AV1".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    C7098lp lpVar = this.f22861z;
                    lpVar.mo16150a(this.f22840af, lpVar.f22772c);
                    SparseArray sparseArray = this.f22843h;
                    C7098lp lpVar2 = this.f22861z;
                    sparseArray.put(lpVar2.f22772c, lpVar2);
                }
                this.f22861z = null;
            } else if (i == 19899) {
                int i6 = this.f22810B;
                if (i6 != -1) {
                    long j = this.f22811C;
                    if (j != -1) {
                        if (i6 == 475249515) {
                            this.f22813E = j;
                            return;
                        }
                        return;
                    }
                }
                throw new C6886dt("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                C7098lp lpVar3 = this.f22861z;
                if (!lpVar3.f22776g) {
                    return;
                }
                if (lpVar3.f22778i != null) {
                    lpVar3.f22780k = new C7031jc((String) null, new C7030jb(C6821bi.f21605a, "video/webm", this.f22861z.f22778i.f22633b));
                    return;
                }
                throw new C6886dt("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                C7098lp lpVar4 = this.f22861z;
                if (lpVar4.f22776g && lpVar4.f22777h != null) {
                    throw new C6886dt("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f22858w == -9223372036854775807L) {
                    this.f22858w = 1000000;
                }
                long j2 = this.f22859x;
                if (j2 != -9223372036854775807L) {
                    this.f22860y = m21059s(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.f22809A) {
                    C7056ka kaVar = this.f22840af;
                    if (this.f22857v == -1 || this.f22860y == -9223372036854775807L || (adv = this.f22816H) == null || adv.mo14519c() == 0 || (adv2 = this.f22817I) == null || adv2.mo14519c() != adv.mo14519c()) {
                        this.f22816H = null;
                        this.f22817I = null;
                        koVar = new C7069kn(this.f22860y);
                    } else {
                        int c = adv.mo14519c();
                        int[] iArr = new int[c];
                        long[] jArr = new long[c];
                        long[] jArr2 = new long[c];
                        long[] jArr3 = new long[c];
                        for (int i7 = 0; i7 < c; i7++) {
                            jArr3[i7] = this.f22816H.mo14518b(i7);
                            jArr[i7] = this.f22857v + this.f22817I.mo14518b(i7);
                        }
                        while (true) {
                            i4 = c - 1;
                            if (i5 >= i4) {
                                break;
                            }
                            int i8 = i5 + 1;
                            iArr[i5] = (int) (jArr[i8] - jArr[i5]);
                            jArr2[i5] = jArr3[i8] - jArr3[i5];
                            i5 = i8;
                        }
                        iArr[i4] = (int) ((this.f22857v + this.f22856u) - jArr[i4]);
                        long j3 = this.f22860y - jArr3[i4];
                        jArr2[i4] = j3;
                        if (j3 <= 0) {
                            StringBuilder sb = new StringBuilder(72);
                            sb.append("Discarding last cue point with unexpected duration: ");
                            sb.append(j3);
                            Log.w("MatroskaExtractor", sb.toString());
                            iArr = Arrays.copyOf(iArr, i4);
                            jArr = Arrays.copyOf(jArr, i4);
                            jArr2 = Arrays.copyOf(jArr2, i4);
                            jArr3 = Arrays.copyOf(jArr3, i4);
                        }
                        this.f22816H = null;
                        this.f22817I = null;
                        koVar = new C7048jt(iArr, jArr, jArr2, jArr3);
                    }
                    kaVar.mo16115am(koVar);
                    this.f22809A = true;
                }
            } else if (this.f22843h.size() != 0) {
                this.f22840af.mo16114al();
            } else {
                throw new C6886dt("No valid tracks were found");
            }
        } else if (this.f22820L == 2) {
            int i9 = 0;
            for (int i10 = 0; i10 < this.f22824P; i10++) {
                i9 += this.f22825Q[i10];
            }
            C7098lp lpVar5 = (C7098lp) this.f22843h.get(this.f22826R);
            int i11 = 0;
            while (i11 < this.f22824P) {
                long j4 = ((long) ((lpVar5.f22774e * i11) / 1000)) + this.f22821M;
                int i12 = this.f22828T;
                if (i11 == 0) {
                    i3 = !this.f22830V ? i12 | 1 : i12;
                    i2 = 0;
                } else {
                    i2 = i11;
                    i3 = i12;
                }
                int i13 = this.f22825Q[i2];
                i9 -= i13;
                m21055o(lpVar5, j4, i3, i13, i9);
                i11 = i2 + 1;
            }
            this.f22820L = 0;
        }
    }
}
