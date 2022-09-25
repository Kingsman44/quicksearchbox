package androidx.media3.extractor.p163j.p164a;

import androidx.media3.common.p136b.C2603ab;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2617e;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.p163j.C3482c;
import androidx.media3.extractor.p163j.C3496f;
import java.nio.ByteBuffer;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.j.a.h */
/* compiled from: PG */
public final class C3464h extends C3468l {

    /* renamed from: a */
    private final C2604ac f10757a = new C2604ac();

    /* renamed from: d */
    private final C2603ab f10758d = new C2603ab();

    /* renamed from: e */
    private int f10759e = -1;

    /* renamed from: f */
    private final int f10760f;

    /* renamed from: g */
    private final C3462f[] f10761g;

    /* renamed from: h */
    private C3462f f10762h;

    /* renamed from: i */
    private List f10763i;

    /* renamed from: j */
    private List f10764j;

    /* renamed from: k */
    private C3463g f10765k;

    /* renamed from: l */
    private int f10766l;

    public C3464h(int i, List list) {
        this.f10760f = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = C2617e.f7267a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f10761g = new C3462f[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f10761g[i2] = new C3462f();
        }
        this.f10762h = this.f10761g[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c5  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m10040k() {
        /*
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        L_0x0009:
            r4 = 8
            if (r3 >= r4) goto L_0x00e2
            androidx.media3.extractor.j.a.f[] r4 = r0.f10761g
            r4 = r4[r3]
            boolean r4 = r4.mo7429f()
            if (r4 != 0) goto L_0x00de
            androidx.media3.extractor.j.a.f[] r4 = r0.f10761g
            r4 = r4[r3]
            boolean r5 = r4.f10740n
            if (r5 == 0) goto L_0x00de
            boolean r5 = r4.mo7429f()
            if (r5 == 0) goto L_0x0028
            r4 = 0
            goto L_0x00d9
        L_0x0028:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r5 = 0
        L_0x002e:
            java.util.List r7 = r4.f10737k
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x0049
            java.util.List r7 = r4.f10737k
            java.lang.Object r7 = r7.get(r5)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.append(r7)
            r7 = 10
            r6.append(r7)
            int r5 = r5 + 1
            goto L_0x002e
        L_0x0049:
            android.text.SpannableString r5 = r4.mo7425b()
            r6.append(r5)
            int r5 = r4.f10748v
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0078
            if (r5 == r8) goto L_0x0075
            if (r5 == r7) goto L_0x0072
            r9 = 3
            if (r5 != r9) goto L_0x005e
            goto L_0x0078
        L_0x005e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected justification value: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0072:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x007a
        L_0x0075:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x007a
        L_0x0078:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x007a:
            r9 = r5
            boolean r5 = r4.f10742p
            if (r5 == 0) goto L_0x008a
            int r5 = r4.f10744r
            float r5 = (float) r5
            r10 = 1120272384(0x42c60000, float:99.0)
            float r5 = r5 / r10
            int r11 = r4.f10743q
            float r11 = (float) r11
            float r11 = r11 / r10
            goto L_0x0097
        L_0x008a:
            int r5 = r4.f10744r
            float r5 = (float) r5
            r10 = 1129381888(0x43510000, float:209.0)
            float r5 = r5 / r10
            int r10 = r4.f10743q
            float r10 = (float) r10
            r11 = 1116995584(0x42940000, float:74.0)
            float r11 = r10 / r11
        L_0x0097:
            r10 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r10
            r12 = 1028443341(0x3d4ccccd, float:0.05)
            float r13 = r5 + r12
            float r11 = r11 * r10
            float r10 = r11 + r12
            int r5 = r4.f10745s
            int r11 = r5 / 3
            if (r11 != 0) goto L_0x00ad
            r11 = 0
            goto L_0x00b2
        L_0x00ad:
            if (r11 != r8) goto L_0x00b1
            r11 = 1
            goto L_0x00b2
        L_0x00b1:
            r11 = 2
        L_0x00b2:
            int r5 = r5 % 3
            if (r5 != 0) goto L_0x00b8
            r12 = 0
            goto L_0x00bd
        L_0x00b8:
            if (r5 != r8) goto L_0x00bc
            r12 = 1
            goto L_0x00bd
        L_0x00bc:
            r12 = 2
        L_0x00bd:
            int r14 = r4.f10751y
            int r5 = androidx.media3.extractor.p163j.p164a.C3462f.f10722b
            if (r14 == r5) goto L_0x00c5
            r15 = 1
            goto L_0x00c6
        L_0x00c5:
            r15 = 0
        L_0x00c6:
            androidx.media3.extractor.j.a.e r16 = new androidx.media3.extractor.j.a.e
            int r4 = r4.f10741o
            r5 = r16
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r13
            r11 = r12
            r12 = r15
            r13 = r14
            r14 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = r16
        L_0x00d9:
            if (r4 == 0) goto L_0x00de
            r1.add(r4)
        L_0x00de:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x00e2:
            java.util.Comparator r3 = androidx.media3.extractor.p163j.p164a.C3461e.f10718a
            java.util.Collections.sort(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
        L_0x00f0:
            int r4 = r1.size()
            if (r2 >= r4) goto L_0x0104
            java.lang.Object r4 = r1.get(r2)
            androidx.media3.extractor.j.a.e r4 = (androidx.media3.extractor.p163j.p164a.C3461e) r4
            androidx.media3.common.a.c r4 = r4.f10719b
            r3.add(r4)
            int r2 = r2 + 1
            goto L_0x00f0
        L_0x0104:
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p164a.C3464h.m10040k():java.util.List");
    }

    /* renamed from: l */
    private final void m10041l() {
        C3463g gVar = this.f10765k;
        if (gVar != null) {
            int i = gVar.f10756d;
            int i2 = gVar.f10754b;
            int i3 = (i2 + i2) - 1;
            if (i != i3) {
                C2633u.m7047b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + i3 + ", but current index is " + i + " (sequence number " + gVar.f10753a + ");");
            }
            C2603ab abVar = this.f10758d;
            C3463g gVar2 = this.f10765k;
            abVar.mo6123h(gVar2.f10755c, gVar2.f10756d);
            boolean z = false;
            while (true) {
                if (this.f10758d.mo6116a() > 0) {
                    int i4 = 3;
                    int d = this.f10758d.mo6119d(3);
                    int d2 = this.f10758d.mo6119d(5);
                    int i5 = 7;
                    int i6 = 2;
                    if (d == 7) {
                        this.f10758d.mo6126k(2);
                        d = this.f10758d.mo6119d(6);
                        if (d < 7) {
                            C2633u.m7050e("Cea708Decoder", "Invalid extended service number: " + d);
                        }
                    }
                    if (d2 == 0) {
                        if (d != 0) {
                            C2633u.m7050e("Cea708Decoder", "serviceNumber is non-zero (" + d + ") when blockSize is 0");
                        }
                    } else if (d != this.f10760f) {
                        this.f10758d.mo6127l(d2);
                    } else {
                        int c = this.f10758d.mo6118c() + (d2 * 8);
                        while (this.f10758d.mo6118c() < c) {
                            int d3 = this.f10758d.mo6119d(8);
                            if (d3 == 16) {
                                int d4 = this.f10758d.mo6119d(8);
                                if (d4 <= 31) {
                                    i5 = 7;
                                    if (d4 > 7) {
                                        if (d4 <= 15) {
                                            this.f10758d.mo6126k(8);
                                        } else if (d4 <= 23) {
                                            this.f10758d.mo6126k(16);
                                        } else {
                                            this.f10758d.mo6126k(24);
                                        }
                                    }
                                } else {
                                    i5 = 7;
                                    if (d4 > 127) {
                                        if (d4 <= 159) {
                                            if (d4 <= 135) {
                                                this.f10758d.mo6126k(32);
                                            } else if (d4 <= 143) {
                                                this.f10758d.mo6126k(40);
                                            } else {
                                                this.f10758d.mo6126k(2);
                                                this.f10758d.mo6126k(this.f10758d.mo6119d(6) * 8);
                                            }
                                        } else if (d4 > 255) {
                                            C2633u.m7050e("Cea708Decoder", "Invalid extended command: " + d4);
                                        } else if (d4 == 160) {
                                            this.f10762h.mo7426c(13252);
                                        } else {
                                            C2633u.m7050e("Cea708Decoder", "Invalid G3 character: " + d4);
                                            this.f10762h.mo7426c('_');
                                        }
                                        i4 = 3;
                                        i6 = 2;
                                    } else if (d4 == 32) {
                                        this.f10762h.mo7426c(' ');
                                    } else if (d4 == 33) {
                                        this.f10762h.mo7426c(160);
                                    } else if (d4 == 37) {
                                        this.f10762h.mo7426c(8230);
                                    } else if (d4 == 42) {
                                        this.f10762h.mo7426c(352);
                                    } else if (d4 == 44) {
                                        this.f10762h.mo7426c(338);
                                    } else if (d4 == 63) {
                                        this.f10762h.mo7426c(376);
                                    } else if (d4 == 57) {
                                        this.f10762h.mo7426c(8482);
                                    } else if (d4 == 58) {
                                        this.f10762h.mo7426c(353);
                                    } else if (d4 == 60) {
                                        this.f10762h.mo7426c(339);
                                    } else if (d4 != 61) {
                                        switch (d4) {
                                            case 48:
                                                this.f10762h.mo7426c(9608);
                                                break;
                                            case 49:
                                                this.f10762h.mo7426c(8216);
                                                break;
                                            case 50:
                                                this.f10762h.mo7426c(8217);
                                                break;
                                            case 51:
                                                this.f10762h.mo7426c(8220);
                                                break;
                                            case 52:
                                                this.f10762h.mo7426c(8221);
                                                break;
                                            case 53:
                                                this.f10762h.mo7426c(8226);
                                                break;
                                            default:
                                                switch (d4) {
                                                    case 118:
                                                        this.f10762h.mo7426c(8539);
                                                        break;
                                                    case 119:
                                                        this.f10762h.mo7426c(8540);
                                                        break;
                                                    case 120:
                                                        this.f10762h.mo7426c(8541);
                                                        break;
                                                    case 121:
                                                        this.f10762h.mo7426c(8542);
                                                        break;
                                                    case 122:
                                                        this.f10762h.mo7426c(9474);
                                                        break;
                                                    case 123:
                                                        this.f10762h.mo7426c(9488);
                                                        break;
                                                    case 124:
                                                        this.f10762h.mo7426c(9492);
                                                        break;
                                                    case 125:
                                                        this.f10762h.mo7426c(9472);
                                                        break;
                                                    case 126:
                                                        this.f10762h.mo7426c(9496);
                                                        break;
                                                    case 127:
                                                        this.f10762h.mo7426c(9484);
                                                        break;
                                                    default:
                                                        C2633u.m7050e("Cea708Decoder", "Invalid G2 character: " + d4);
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f10762h.mo7426c(8480);
                                    }
                                    z = true;
                                    i4 = 3;
                                    i6 = 2;
                                }
                            } else if (d3 > 31) {
                                if (d3 > 127) {
                                    if (d3 <= 159) {
                                        switch (d3) {
                                            case 128:
                                            case 129:
                                            case 130:
                                            case 131:
                                            case 132:
                                            case 133:
                                            case 134:
                                            case 135:
                                                int i7 = d3 - 128;
                                                if (this.f10766l != i7) {
                                                    this.f10766l = i7;
                                                    this.f10762h = this.f10761g[i7];
                                                    break;
                                                }
                                                break;
                                            case 136:
                                                for (int i8 = 1; i8 <= 8; i8++) {
                                                    if (this.f10758d.mo6128m()) {
                                                        this.f10761g[8 - i8].mo7427d();
                                                    }
                                                }
                                                break;
                                            case 137:
                                                for (int i9 = 1; i9 <= 8; i9++) {
                                                    if (this.f10758d.mo6128m()) {
                                                        this.f10761g[8 - i9].f10740n = true;
                                                    }
                                                }
                                                break;
                                            case 138:
                                                for (int i10 = 1; i10 <= 8; i10++) {
                                                    if (this.f10758d.mo6128m()) {
                                                        this.f10761g[8 - i10].f10740n = false;
                                                    }
                                                }
                                                break;
                                            case 139:
                                                for (int i11 = 1; i11 <= 8; i11++) {
                                                    if (this.f10758d.mo6128m()) {
                                                        C3462f fVar = this.f10761g[8 - i11];
                                                        fVar.f10740n = !fVar.f10740n;
                                                    }
                                                }
                                                break;
                                            case 140:
                                                for (int i12 = 1; i12 <= 8; i12++) {
                                                    if (this.f10758d.mo6128m()) {
                                                        this.f10761g[8 - i12].mo7428e();
                                                    }
                                                }
                                                break;
                                            case 141:
                                                this.f10758d.mo6126k(8);
                                                break;
                                            case 142:
                                                break;
                                            case 143:
                                                m10042m();
                                                break;
                                            case 144:
                                                if (this.f10762h.f10739m) {
                                                    this.f10758d.mo6119d(4);
                                                    this.f10758d.mo6119d(2);
                                                    this.f10758d.mo6119d(2);
                                                    boolean m = this.f10758d.mo6128m();
                                                    boolean m2 = this.f10758d.mo6128m();
                                                    this.f10758d.mo6119d(3);
                                                    this.f10758d.mo6119d(3);
                                                    this.f10762h.mo7430g(m, m2);
                                                    break;
                                                } else {
                                                    this.f10758d.mo6126k(16);
                                                    break;
                                                }
                                            case 145:
                                                if (this.f10762h.f10739m) {
                                                    int a = C3462f.m10032a(this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), this.f10758d.mo6119d(2));
                                                    int a2 = C3462f.m10032a(this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), this.f10758d.mo6119d(2));
                                                    this.f10758d.mo6126k(2);
                                                    C3462f.m10032a(this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), 0);
                                                    this.f10762h.mo7431h(a, a2);
                                                    break;
                                                } else {
                                                    this.f10758d.mo6126k(24);
                                                    break;
                                                }
                                            case 146:
                                                if (this.f10762h.f10739m) {
                                                    this.f10758d.mo6126k(4);
                                                    int d5 = this.f10758d.mo6119d(4);
                                                    this.f10758d.mo6126k(2);
                                                    this.f10758d.mo6119d(6);
                                                    C3462f fVar2 = this.f10762h;
                                                    if (fVar2.f10752z != d5) {
                                                        fVar2.mo7426c(10);
                                                    }
                                                    fVar2.f10752z = d5;
                                                    break;
                                                } else {
                                                    this.f10758d.mo6126k(16);
                                                    break;
                                                }
                                            case 151:
                                                if (this.f10762h.f10739m) {
                                                    int a3 = C3462f.m10032a(this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), this.f10758d.mo6119d(2));
                                                    this.f10758d.mo6119d(2);
                                                    C3462f.m10032a(this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), this.f10758d.mo6119d(2), 0);
                                                    this.f10758d.mo6128m();
                                                    this.f10758d.mo6128m();
                                                    this.f10758d.mo6119d(2);
                                                    this.f10758d.mo6119d(2);
                                                    int d6 = this.f10758d.mo6119d(2);
                                                    this.f10758d.mo6126k(8);
                                                    C3462f fVar3 = this.f10762h;
                                                    fVar3.f10751y = a3;
                                                    fVar3.f10748v = d6;
                                                    break;
                                                } else {
                                                    this.f10758d.mo6126k(32);
                                                    break;
                                                }
                                            case 152:
                                            case 153:
                                            case 154:
                                            case 155:
                                            case 156:
                                            case 157:
                                            case 158:
                                            case 159:
                                                int i13 = d3 - 152;
                                                C3462f fVar4 = this.f10761g[i13];
                                                this.f10758d.mo6126k(i6);
                                                boolean m3 = this.f10758d.mo6128m();
                                                boolean m4 = this.f10758d.mo6128m();
                                                this.f10758d.mo6128m();
                                                int d7 = this.f10758d.mo6119d(i4);
                                                boolean m5 = this.f10758d.mo6128m();
                                                int d8 = this.f10758d.mo6119d(i5);
                                                int d9 = this.f10758d.mo6119d(8);
                                                int d10 = this.f10758d.mo6119d(4);
                                                int d11 = this.f10758d.mo6119d(4);
                                                this.f10758d.mo6126k(i6);
                                                this.f10758d.mo6119d(6);
                                                this.f10758d.mo6126k(i6);
                                                int d12 = this.f10758d.mo6119d(3);
                                                int d13 = this.f10758d.mo6119d(3);
                                                fVar4.f10739m = true;
                                                fVar4.f10740n = m3;
                                                fVar4.f10747u = m4;
                                                fVar4.f10741o = d7;
                                                fVar4.f10742p = m5;
                                                fVar4.f10743q = d8;
                                                fVar4.f10744r = d9;
                                                fVar4.f10745s = d10;
                                                int i14 = d11 + 1;
                                                if (fVar4.f10746t != i14) {
                                                    fVar4.f10746t = i14;
                                                    while (true) {
                                                        if ((m4 && fVar4.f10737k.size() >= fVar4.f10746t) || fVar4.f10737k.size() >= 15) {
                                                            fVar4.f10737k.remove(0);
                                                        }
                                                    }
                                                }
                                                if (!(d12 == 0 || fVar4.f10749w == d12)) {
                                                    fVar4.f10749w = d12;
                                                    int i15 = d12 - 1;
                                                    int i16 = C3462f.f10727g[i15];
                                                    boolean z2 = C3462f.f10726f[i15];
                                                    int i17 = C3462f.f10724d[i15];
                                                    int i18 = C3462f.f10725e[i15];
                                                    int i19 = C3462f.f10723c[i15];
                                                    fVar4.f10751y = i16;
                                                    fVar4.f10748v = i19;
                                                }
                                                if (!(d13 == 0 || fVar4.f10750x == d13)) {
                                                    fVar4.f10750x = d13;
                                                    int i20 = d13 - 1;
                                                    int i21 = C3462f.f10729i[i20];
                                                    int i22 = C3462f.f10728h[i20];
                                                    fVar4.mo7430g(false, false);
                                                    fVar4.mo7431h(C3462f.f10721a, C3462f.f10730j[i20]);
                                                }
                                                if (this.f10766l != i13) {
                                                    this.f10766l = i13;
                                                    this.f10762h = this.f10761g[i13];
                                                    break;
                                                }
                                                break;
                                            default:
                                                C2633u.m7050e("Cea708Decoder", "Invalid C1 command: " + d3);
                                                break;
                                        }
                                    } else if (d3 <= 255) {
                                        this.f10762h.mo7426c((char) (d3 & PrivateKeyType.INVALID));
                                    } else {
                                        C2633u.m7050e("Cea708Decoder", "Invalid base command: " + d3);
                                        i5 = 7;
                                    }
                                    z = true;
                                    i4 = 3;
                                    i5 = 7;
                                    i6 = 2;
                                } else if (d3 == 127) {
                                    this.f10762h.mo7426c(9835);
                                } else {
                                    this.f10762h.mo7426c((char) (d3 & PrivateKeyType.INVALID));
                                }
                                z = true;
                            } else if (d3 != 0) {
                                if (d3 == i4) {
                                    this.f10763i = m10040k();
                                } else if (d3 != 8) {
                                    switch (d3) {
                                        case 12:
                                            m10042m();
                                            break;
                                        case 13:
                                            this.f10762h.mo7426c(10);
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (d3 < 17 || d3 > 23) {
                                                if (d3 < 24) {
                                                    C2633u.m7050e("Cea708Decoder", "Invalid C0 command: " + d3);
                                                    break;
                                                } else {
                                                    C2633u.m7050e("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + d3);
                                                    this.f10758d.mo6126k(16);
                                                    break;
                                                }
                                            } else {
                                                C2633u.m7050e("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + d3);
                                                this.f10758d.mo6126k(8);
                                                break;
                                            }
                                    }
                                } else {
                                    C3462f fVar5 = this.f10762h;
                                    int length = fVar5.f10738l.length();
                                    if (length > 0) {
                                        fVar5.f10738l.delete(length - 1, length);
                                    }
                                }
                            }
                            i4 = 3;
                            i6 = 2;
                        }
                    }
                }
            }
            if (z) {
                this.f10763i = m10040k();
            }
            this.f10765k = null;
        }
    }

    /* renamed from: m */
    private final void m10042m() {
        for (int i = 0; i < 8; i++) {
            this.f10761g[i].mo7428e();
        }
    }

    /* renamed from: c */
    public final void mo5957c() {
        super.mo5957c();
        this.f10763i = null;
        this.f10764j = null;
        this.f10766l = 0;
        this.f10762h = this.f10761g[0];
        m10042m();
        this.f10765k = null;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo5959e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C3482c mo7420g() {
        List list = this.f10763i;
        this.f10764j = list;
        list.getClass();
        return new C3469m(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo7422i(C3496f fVar) {
        C3463g gVar;
        ByteBuffer byteBuffer = fVar.f6955c;
        byteBuffer.getClass();
        this.f10757a.mo6157y(byteBuffer.array(), byteBuffer.limit());
        while (true) {
            C2604ac acVar = this.f10757a;
            if (acVar.f7236c - acVar.f7235b >= 3) {
                int g = acVar.mo6139g() & 7;
                int i = g & 3;
                int i2 = g & 4;
                byte g2 = (byte) this.f10757a.mo6139g();
                byte g3 = (byte) this.f10757a.mo6139g();
                if (i != 2) {
                    if (i == 3) {
                        i = 3;
                    }
                }
                if (i2 == 4) {
                    if (i == 3) {
                        m10041l();
                        int i3 = (g2 & 192) >> 6;
                        int i4 = this.f10759e;
                        if (!(i4 == -1 || i3 == (3 & (i4 + 1)))) {
                            m10042m();
                            int i5 = this.f10759e;
                            C2633u.m7050e("Cea708Decoder", "Sequence number discontinuity. previous=" + i5 + " current=" + i3);
                        }
                        this.f10759e = i3;
                        byte b = g2 & 63;
                        if (b == 0) {
                            b = 64;
                        }
                        gVar = new C3463g(i3, b);
                        this.f10765k = gVar;
                        byte[] bArr = gVar.f10755c;
                        int i6 = gVar.f10756d;
                        gVar.f10756d = i6 + 1;
                        bArr[i6] = g3;
                    } else {
                        gVar = this.f10765k;
                        if (gVar == null) {
                            C2633u.m7048c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = gVar.f10755c;
                            int i7 = gVar.f10756d;
                            int i8 = i7 + 1;
                            gVar.f10756d = i8;
                            bArr2[i7] = g2;
                            gVar.f10756d = i8 + 1;
                            bArr2[i8] = g3;
                        }
                    }
                    int i9 = gVar.f10756d;
                    int i10 = gVar.f10754b;
                    if (i9 == (i10 + i10) - 1) {
                        m10041l();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo7423j() {
        return this.f10763i != this.f10764j;
    }
}
