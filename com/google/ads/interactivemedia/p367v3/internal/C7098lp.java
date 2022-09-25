package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lp */
/* compiled from: PG */
final class C7098lp {

    /* renamed from: A */
    public int f22745A = 1000;

    /* renamed from: B */
    public int f22746B = 200;

    /* renamed from: C */
    public float f22747C = -1.0f;

    /* renamed from: D */
    public float f22748D = -1.0f;

    /* renamed from: E */
    public float f22749E = -1.0f;

    /* renamed from: F */
    public float f22750F = -1.0f;

    /* renamed from: G */
    public float f22751G = -1.0f;

    /* renamed from: H */
    public float f22752H = -1.0f;

    /* renamed from: I */
    public float f22753I = -1.0f;

    /* renamed from: J */
    public float f22754J = -1.0f;

    /* renamed from: K */
    public float f22755K = -1.0f;

    /* renamed from: L */
    public float f22756L = -1.0f;

    /* renamed from: M */
    public byte[] f22757M;

    /* renamed from: N */
    public int f22758N = 1;

    /* renamed from: O */
    public int f22759O = -1;

    /* renamed from: P */
    public int f22760P = 8000;

    /* renamed from: Q */
    public long f22761Q = 0;

    /* renamed from: R */
    public long f22762R = 0;

    /* renamed from: S */
    public C7099lq f22763S;

    /* renamed from: T */
    public boolean f22764T;

    /* renamed from: U */
    public boolean f22765U = true;

    /* renamed from: V */
    public C7073kr f22766V;

    /* renamed from: W */
    public int f22767W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public int f22768X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public String f22769Y = "eng";

    /* renamed from: a */
    public String f22770a;

    /* renamed from: b */
    public String f22771b;

    /* renamed from: c */
    public int f22772c;

    /* renamed from: d */
    public int f22773d;

    /* renamed from: e */
    public int f22774e;

    /* renamed from: f */
    public int f22775f;

    /* renamed from: g */
    public boolean f22776g;

    /* renamed from: h */
    public byte[] f22777h;

    /* renamed from: i */
    public C7072kq f22778i;

    /* renamed from: j */
    public byte[] f22779j;

    /* renamed from: k */
    public C7031jc f22780k;

    /* renamed from: l */
    public int f22781l = -1;

    /* renamed from: m */
    public int f22782m = -1;

    /* renamed from: n */
    public int f22783n = -1;

    /* renamed from: o */
    public int f22784o = -1;

    /* renamed from: p */
    public int f22785p = 0;

    /* renamed from: q */
    public int f22786q = -1;

    /* renamed from: r */
    public float f22787r = 0.0f;

    /* renamed from: s */
    public float f22788s = 0.0f;

    /* renamed from: t */
    public float f22789t = 0.0f;

    /* renamed from: u */
    public byte[] f22790u = null;

    /* renamed from: v */
    public int f22791v = -1;

    /* renamed from: w */
    public boolean f22792w = false;

    /* renamed from: x */
    public int f22793x = -1;

    /* renamed from: y */
    public int f22794y = -1;

    /* renamed from: z */
    public int f22795z = -1;

    private C7098lp() {
    }

    public /* synthetic */ C7098lp(byte[] bArr) {
    }

    /* renamed from: e */
    private static Pair m21044e(aee aee) {
        try {
            aee.mo14557k(16);
            long u = aee.mo14567u();
            if (u == 1482049860) {
                return new Pair("video/divx", (Object) null);
            }
            if (u == 859189832) {
                return new Pair("video/3gpp", (Object) null);
            }
            if (u == 826496599) {
                int g = aee.mo14553g() + 20;
                byte[] i = aee.mo14555i();
                while (true) {
                    int length = i.length;
                    if (g >= length - 4) {
                        throw new C6886dt("Failed to find FourCC VC1 initialization data");
                    } else if (i[g] == 0 && i[g + 1] == 0 && i[g + 2] == 1 && i[g + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(i, g, length)));
                    } else {
                        g++;
                    }
                }
            } else {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C6886dt("Error parsing FourCC private data");
        }
    }

    /* renamed from: f */
    private static List m21045f(byte[] bArr) {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (true) {
                    b = bArr[i];
                    if (b != -1) {
                        break;
                    }
                    i2 += PrivateKeyType.INVALID;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3];
                    if (b2 != -1) {
                        break;
                    }
                    i5 += PrivateKeyType.INVALID;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + b2;
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            int length = bArr.length - i9;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i9, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new C6886dt("Error parsing vorbis codec private");
                    }
                    throw new C6886dt("Error parsing vorbis codec private");
                }
                throw new C6886dt("Error parsing vorbis codec private");
            }
            throw new C6886dt("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C6886dt("Error parsing vorbis codec private");
        }
    }

    /* renamed from: g */
    private static boolean m21046g(aee aee) {
        try {
            int p = aee.mo14562p();
            if (p == 1) {
                return true;
            }
            if (p == 65534) {
                aee.mo14554h(24);
                return aee.mo14570x() == C7100lr.f22807e.getMostSignificantBits() && aee.mo14570x() == C7100lr.f22807e.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C6886dt("Error parsing MS/ACM codec private");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x029b, code lost:
        if (r1.equals("V_MPEG4/ISO/SP") != false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02a4, code lost:
        if (r1.equals("V_MPEG4/ISO/AP") != false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a6, code lost:
        r1 = r0.f22779j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02a8, code lost:
        if (r1 != null) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02aa, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ad, code lost:
        r1 = java.util.Collections.singletonList(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b1, code lost:
        r5 = "video/mp4v-es";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b5, code lost:
        r12 = r0.f22757M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b7, code lost:
        if (r12 == null) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02b9, code lost:
        r12 = com.google.ads.interactivemedia.p367v3.internal.aey.m18559a(new com.google.ads.interactivemedia.p367v3.internal.aee(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c2, code lost:
        if (r12 == null) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02c4, code lost:
        r3 = r12.f20490a;
        r5 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02c8, code lost:
        r12 = r0.f22765U;
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02cd, code lost:
        if (true == r0.f22764T) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02cf, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d1, code lost:
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02d2, code lost:
        r12 = r12 | r13;
        r13 = new com.google.ads.interactivemedia.p367v3.internal.C6863cx();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02dc, code lost:
        if (com.google.ads.interactivemedia.p367v3.internal.adz.m18349a(r5) == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02de, code lost:
        r13.mo15606H(r0.f22758N);
        r13.mo15631af(r0.f22760P);
        r13.mo15623Y(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f1, code lost:
        if (com.google.ads.interactivemedia.p367v3.internal.adz.m18350b(r5) == false) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02f5, code lost:
        if (r0.f22785p != 0) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02f7, code lost:
        r1 = r0.f22783n;
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fa, code lost:
        if (r1 != -1) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02fc, code lost:
        r1 = r0.f22781l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02fe, code lost:
        r0.f22783n = r1;
        r1 = r0.f22784o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0302, code lost:
        if (r1 != -1) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0304, code lost:
        r1 = r0.f22782m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0306, code lost:
        r0.f22784o = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0309, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x030a, code lost:
        r1 = r0.f22783n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x030e, code lost:
        if (r1 == r6) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0310, code lost:
        r8 = r0.f22784o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0312, code lost:
        if (r8 == r6) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0314, code lost:
        r1 = ((float) (r0.f22782m * r1)) / ((float) (r0.f22781l * r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0320, code lost:
        r1 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0324, code lost:
        if (r0.f22792w == false) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x032a, code lost:
        if (r0.f22747C == -1.0f) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0330, code lost:
        if (r0.f22748D == -1.0f) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0336, code lost:
        if (r0.f22749E == -1.0f) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x033c, code lost:
        if (r0.f22750F == -1.0f) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0342, code lost:
        if (r0.f22751G == -1.0f) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0348, code lost:
        if (r0.f22752H == -1.0f) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x034e, code lost:
        if (r0.f22753I == -1.0f) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0354, code lost:
        if (r0.f22754J == -1.0f) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x035a, code lost:
        if (r0.f22755K == -1.0f) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0360, code lost:
        if (r0.f22756L != -1.0f) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0364, code lost:
        r7 = new byte[25];
        r8 = java.nio.ByteBuffer.wrap(r7).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r8.put((byte) 0);
        r8.putShort((short) ((int) ((r0.f22747C * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f22748D * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f22749E * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f22750F * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f22751G * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f22752H * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f22753I * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) ((r0.f22754J * 50000.0f) + 0.5f)));
        r8.putShort((short) ((int) (r0.f22755K + 0.5f)));
        r8.putShort((short) ((int) (r0.f22756L + 0.5f)));
        r8.putShort((short) r0.f22745A);
        r8.putShort((short) r0.f22746B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03e7, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03e9, code lost:
        r8 = new com.google.ads.interactivemedia.p367v3.internal.aex(r0.f22793x, r0.f22795z, r0.f22794y, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f5, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0401, code lost:
        if (com.google.ads.interactivemedia.p367v3.internal.C7100lr.f22808f.containsKey(r0.f22770a) == false) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0403, code lost:
        r14 = ((java.lang.Integer) com.google.ads.interactivemedia.p367v3.internal.C7100lr.f22808f.get(r0.f22770a)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0414, code lost:
        r14 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0417, code lost:
        if (r0.f22786q != 0) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0420, code lost:
        if (java.lang.Float.compare(r0.f22787r, 0.0f) != 0) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0428, code lost:
        if (java.lang.Float.compare(r0.f22788s, 0.0f) != 0) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0430, code lost:
        if (java.lang.Float.compare(r0.f22789t, 0.0f) != 0) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x043b, code lost:
        if (java.lang.Float.compare(r0.f22788s, 90.0f) != 0) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x043d, code lost:
        r11 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0448, code lost:
        if (java.lang.Float.compare(r0.f22788s, -180.0f) == 0) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0452, code lost:
        if (java.lang.Float.compare(r0.f22788s, 180.0f) != 0) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x045d, code lost:
        if (java.lang.Float.compare(r0.f22788s, -90.0f) != 0) goto L_0x0465;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x045f, code lost:
        r11 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0462, code lost:
        r11 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0465, code lost:
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0466, code lost:
        r13.mo15635aj(r0.f22781l);
        r13.mo15615Q(r0.f22782m);
        r13.mo15626aa(r1);
        r13.mo15629ad(r11);
        r13.mo15627ab(r0.f22790u);
        r13.mo15633ah(r0.f22791v);
        r13.mo15608J(r8);
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0489, code lost:
        if ("application/x-subrip".equals(r5) == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x048b, code lost:
        r14 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0491, code lost:
        if ("text/x-ssa".equals(r5) == false) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0493, code lost:
        r2 = new java.util.ArrayList(2);
        r2.add(com.google.ads.interactivemedia.p367v3.internal.C7100lr.f22805c);
        r2.add(r0.f22779j);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04aa, code lost:
        if ("application/vobsub".equals(r5) != false) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04b0, code lost:
        if ("application/pgs".equals(r5) != false) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04b6, code lost:
        if ("application/dvbsubs".equals(r5) == false) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04c0, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.C6886dt("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04cb, code lost:
        if (com.google.ads.interactivemedia.p367v3.internal.C7100lr.f22808f.containsKey(r0.f22770a) != false) goto L_0x04d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04cd, code lost:
        r13.mo15619U(r0.f22770a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04d2, code lost:
        r13.mo15616R(r20);
        r13.mo15630ae(r5);
        r13.mo15621W(r4);
        r13.mo15620V(r0.f22769Y);
        r13.mo15632ag(r12);
        r13.mo15618T(r2);
        r13.mo15607I(r3);
        r13.mo15610L(r0.f22780k);
        r1 = r13.mo15625a();
        r2 = r19.mo16113ak(r0.f22772c, r14);
        r0.f22766V = r2;
        r2.mo16102a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0501, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x050a, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.C6886dt("Unrecognized codec identifier.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fb, code lost:
        r2 = null;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0106, code lost:
        if (r1.equals("A_DTS/EXPRESS") != false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014a, code lost:
        if (r1.equals("A_DTS") != false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014c, code lost:
        r5 = "audio/vnd.dts";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c1, code lost:
        if (r1.equals("V_MPEG4/ISO/ASP") != false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0207, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0208, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0220, code lost:
        r2 = null;
        r3 = null;
        r1 = -1;
        r4 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0253, code lost:
        r2 = null;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0256, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0257, code lost:
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0293, code lost:
        r5 = "audio/x-unknown";
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16150a(com.google.ads.interactivemedia.p367v3.internal.C7056ka r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = r0.f22771b
            int r2 = r1.hashCode()
            java.lang.String r3 = "Unsupported PCM bit depth: "
            r4 = 75
            java.lang.String r5 = "audio/raw"
            java.lang.String r6 = "application/x-subrip"
            java.lang.String r7 = "text/x-ssa"
            java.lang.String r8 = "application/pgs"
            java.lang.String r9 = "application/vobsub"
            java.lang.String r10 = "application/dvbsubs"
            java.lang.String r12 = "audio/x-unknown"
            java.lang.String r13 = "MatroskaExtractor"
            r11 = 0
            r15 = 3
            r17 = 0
            java.lang.String r14 = ". Setting mimeType to audio/x-unknown"
            switch(r2) {
                case -2095576542: goto L_0x029e;
                case -2095575984: goto L_0x0295;
                case -1985379776: goto L_0x0259;
                case -1784763192: goto L_0x0242;
                case -1730367663: goto L_0x0228;
                case -1482641358: goto L_0x0216;
                case -1482641357: goto L_0x020b;
                case -1373388978: goto L_0x01eb;
                case -933872740: goto L_0x01c5;
                case -538363189: goto L_0x01bb;
                case -538363109: goto L_0x019f;
                case -425012669: goto L_0x018e;
                case -356037306: goto L_0x0182;
                case 62923557: goto L_0x015c;
                case 62923603: goto L_0x0150;
                case 62927045: goto L_0x0144;
                case 82318131: goto L_0x0138;
                case 82338133: goto L_0x012c;
                case 82338134: goto L_0x0120;
                case 99146302: goto L_0x0115;
                case 444813526: goto L_0x0109;
                case 542569478: goto L_0x0100;
                case 725957860: goto L_0x00d2;
                case 738597099: goto L_0x00c7;
                case 855502857: goto L_0x00aa;
                case 1422270023: goto L_0x009f;
                case 1809237540: goto L_0x0093;
                case 1950749482: goto L_0x0087;
                case 1950789798: goto L_0x0075;
                case 1951062397: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0502
        L_0x0027:
            java.lang.String r2 = "A_OPUS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r15)
            byte[] r2 = r0.f22779j
            r1.add(r2)
            r2 = 8
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r4)
            long r4 = r0.f22761Q
            java.nio.ByteBuffer r3 = r3.putLong(r4)
            byte[] r3 = r3.array()
            r1.add(r3)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r0.f22762R
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r1.add(r2)
            java.lang.String r5 = "audio/opus"
            r2 = 5760(0x1680, float:8.071E-42)
            r2 = r1
            r3 = r17
            r1 = -1
            r4 = 5760(0x1680, float:8.071E-42)
            goto L_0x02b5
        L_0x0075:
            java.lang.String r2 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            byte[] r1 = r0.f22779j
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.String r5 = "audio/flac"
            goto L_0x0207
        L_0x0087:
            java.lang.String r2 = "A_EAC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "audio/eac3"
            goto L_0x0253
        L_0x0093:
            java.lang.String r2 = "V_MPEG2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "video/mpeg2"
            goto L_0x0253
        L_0x009f:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            r5 = r6
            goto L_0x0253
        L_0x00aa:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            com.google.ads.interactivemedia.v3.internal.aee r1 = new com.google.ads.interactivemedia.v3.internal.aee
            byte[] r2 = r0.f22779j
            r1.<init>((byte[]) r2)
            com.google.ads.interactivemedia.v3.internal.afb r1 = com.google.ads.interactivemedia.p367v3.internal.afb.m18568a(r1)
            java.util.List r2 = r1.f20504a
            int r1 = r1.f20505b
            r0.f22767W = r1
            java.lang.String r5 = "video/hevc"
            goto L_0x0208
        L_0x00c7:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            r5 = r7
            goto L_0x0253
        L_0x00d2:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            int r1 = r0.f22759O
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18505W(r1)
            if (r1 != 0) goto L_0x00fb
            int r1 = r0.f22759O
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r13, r1)
            goto L_0x0293
        L_0x00fb:
            r2 = r17
            r3 = r2
            goto L_0x0257
        L_0x0100:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            goto L_0x014c
        L_0x0109:
            java.lang.String r2 = "V_THEORA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "video/x-unknown"
            goto L_0x0253
        L_0x0115:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            r5 = r8
            goto L_0x0253
        L_0x0120:
            java.lang.String r2 = "V_VP9"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "video/x-vnd.on2.vp9"
            goto L_0x0253
        L_0x012c:
            java.lang.String r2 = "V_VP8"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            goto L_0x0253
        L_0x0138:
            java.lang.String r2 = "V_AV1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "video/av01"
            goto L_0x0253
        L_0x0144:
            java.lang.String r2 = "A_DTS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
        L_0x014c:
            java.lang.String r5 = "audio/vnd.dts"
            goto L_0x0253
        L_0x0150:
            java.lang.String r2 = "A_AC3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "audio/ac3"
            goto L_0x0253
        L_0x015c:
            java.lang.String r2 = "A_AAC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            byte[] r1 = r0.f22779j
            java.util.List r1 = java.util.Collections.singletonList(r1)
            byte[] r2 = r0.f22779j
            com.google.ads.interactivemedia.v3.internal.gm r2 = com.google.ads.interactivemedia.p367v3.internal.C6961gn.m20510a(r2)
            int r3 = r2.f22200a
            r0.f22760P = r3
            int r3 = r2.f22201b
            r0.f22758N = r3
            java.lang.String r2 = r2.f22202c
            java.lang.String r5 = "audio/mp4a-latm"
            r3 = r2
            r4 = -1
            r2 = r1
            r1 = -1
            goto L_0x02b5
        L_0x0182:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "audio/vnd.dts.hd"
            goto L_0x0253
        L_0x018e:
            java.lang.String r2 = "S_VOBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            byte[] r1 = r0.f22779j
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = r1
            r5 = r9
            goto L_0x0208
        L_0x019f:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            com.google.ads.interactivemedia.v3.internal.aee r1 = new com.google.ads.interactivemedia.v3.internal.aee
            byte[] r2 = r0.f22779j
            r1.<init>((byte[]) r2)
            com.google.ads.interactivemedia.v3.internal.aev r1 = com.google.ads.interactivemedia.p367v3.internal.aev.m18557a(r1)
            java.util.List r2 = r1.f20480a
            int r1 = r1.f20481b
            r0.f22767W = r1
            java.lang.String r5 = "video/avc"
            goto L_0x0208
        L_0x01bb:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            goto L_0x02a6
        L_0x01c5:
            java.lang.String r2 = "S_DVBSUB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            r1 = 4
            byte[] r1 = new byte[r1]
            byte[] r2 = r0.f22779j
            byte r3 = r2[r11]
            r1[r11] = r3
            r3 = 1
            byte r4 = r2[r3]
            r1[r3] = r4
            r3 = 2
            byte r4 = r2[r3]
            r1[r3] = r4
            byte r2 = r2[r15]
            r1[r15] = r2
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = r1
            r5 = r10
            goto L_0x0208
        L_0x01eb:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            com.google.ads.interactivemedia.v3.internal.aee r1 = new com.google.ads.interactivemedia.v3.internal.aee
            byte[] r2 = r0.f22779j
            r1.<init>((byte[]) r2)
            android.util.Pair r1 = m21044e(r1)
            java.lang.Object r2 = r1.first
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.second
            java.util.List r1 = (java.util.List) r1
        L_0x0207:
            r2 = r1
        L_0x0208:
            r3 = r17
            goto L_0x0256
        L_0x020b:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "audio/mpeg"
            goto L_0x0220
        L_0x0216:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            java.lang.String r5 = "audio/mpeg-L2"
        L_0x0220:
            r2 = r17
            r3 = r2
            r1 = -1
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x02b5
        L_0x0228:
            java.lang.String r2 = "A_VORBIS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            byte[] r1 = r0.f22779j
            java.util.List r1 = m21045f(r1)
            java.lang.String r5 = "audio/vorbis"
            r2 = 8192(0x2000, float:1.14794E-41)
            r2 = r1
            r3 = r17
            r1 = -1
            r4 = 8192(0x2000, float:1.14794E-41)
            goto L_0x02b5
        L_0x0242:
            java.lang.String r2 = "A_TRUEHD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            com.google.ads.interactivemedia.v3.internal.lq r1 = new com.google.ads.interactivemedia.v3.internal.lq
            r1.<init>()
            r0.f22763S = r1
            java.lang.String r5 = "audio/true-hd"
        L_0x0253:
            r2 = r17
            r3 = r2
        L_0x0256:
            r1 = -1
        L_0x0257:
            r4 = -1
            goto L_0x02b5
        L_0x0259:
            java.lang.String r2 = "A_MS/ACM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            com.google.ads.interactivemedia.v3.internal.aee r1 = new com.google.ads.interactivemedia.v3.internal.aee
            byte[] r2 = r0.f22779j
            r1.<init>((byte[]) r2)
            boolean r1 = m21046g(r1)
            if (r1 == 0) goto L_0x028e
            int r1 = r0.f22759O
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18505W(r1)
            if (r1 != 0) goto L_0x00fb
            int r1 = r0.f22759O
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r3)
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r13, r1)
            goto L_0x0293
        L_0x028e:
            java.lang.String r1 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"
            android.util.Log.w(r13, r1)
        L_0x0293:
            r5 = r12
            goto L_0x0253
        L_0x0295:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
            goto L_0x02a6
        L_0x029e:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0502
        L_0x02a6:
            byte[] r1 = r0.f22779j
            if (r1 != 0) goto L_0x02ad
            r1 = r17
            goto L_0x02b1
        L_0x02ad:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x02b1:
            java.lang.String r5 = "video/mp4v-es"
            goto L_0x0207
        L_0x02b5:
            byte[] r12 = r0.f22757M
            if (r12 == 0) goto L_0x02c8
            com.google.ads.interactivemedia.v3.internal.aee r13 = new com.google.ads.interactivemedia.v3.internal.aee
            r13.<init>((byte[]) r12)
            com.google.ads.interactivemedia.v3.internal.aey r12 = com.google.ads.interactivemedia.p367v3.internal.aey.m18559a(r13)
            if (r12 == 0) goto L_0x02c8
            java.lang.String r3 = r12.f20490a
            java.lang.String r5 = "video/dolby-vision"
        L_0x02c8:
            boolean r12 = r0.f22765U
            boolean r13 = r0.f22764T
            r14 = 1
            if (r14 == r13) goto L_0x02d1
            r13 = 0
            goto L_0x02d2
        L_0x02d1:
            r13 = 2
        L_0x02d2:
            r12 = r12 | r13
            com.google.ads.interactivemedia.v3.internal.cx r13 = new com.google.ads.interactivemedia.v3.internal.cx
            r13.<init>()
            boolean r16 = com.google.ads.interactivemedia.p367v3.internal.adz.m18349a(r5)
            if (r16 == 0) goto L_0x02ed
            int r6 = r0.f22758N
            r13.mo15606H(r6)
            int r6 = r0.f22760P
            r13.mo15631af(r6)
            r13.mo15623Y(r1)
            goto L_0x04c1
        L_0x02ed:
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.adz.m18350b(r5)
            if (r1 == 0) goto L_0x0485
            int r1 = r0.f22785p
            if (r1 != 0) goto L_0x0309
            int r1 = r0.f22783n
            r6 = -1
            if (r1 != r6) goto L_0x02fe
            int r1 = r0.f22781l
        L_0x02fe:
            r0.f22783n = r1
            int r1 = r0.f22784o
            if (r1 != r6) goto L_0x0306
            int r1 = r0.f22782m
        L_0x0306:
            r0.f22784o = r1
            goto L_0x030a
        L_0x0309:
            r6 = -1
        L_0x030a:
            int r1 = r0.f22783n
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r6) goto L_0x0320
            int r8 = r0.f22784o
            if (r8 == r6) goto L_0x0320
            int r9 = r0.f22782m
            int r9 = r9 * r1
            float r1 = (float) r9
            int r9 = r0.f22781l
            int r9 = r9 * r8
            float r8 = (float) r9
            float r1 = r1 / r8
            goto L_0x0322
        L_0x0320:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0322:
            boolean r8 = r0.f22792w
            if (r8 == 0) goto L_0x03f5
            float r8 = r0.f22747C
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x03e7
            float r8 = r0.f22748D
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x03e7
            float r8 = r0.f22749E
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x03e7
            float r8 = r0.f22750F
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x03e7
            float r8 = r0.f22751G
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x03e7
            float r8 = r0.f22752H
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x03e7
            float r8 = r0.f22753I
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x03e7
            float r8 = r0.f22754J
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x03e7
            float r8 = r0.f22755K
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x03e7
            float r8 = r0.f22756L
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x0364
            goto L_0x03e7
        L_0x0364:
            r7 = 25
            byte[] r7 = new byte[r7]
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r7)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r8 = r8.order(r9)
            r8.put(r11)
            float r9 = r0.f22747C
            r10 = 1195593728(0x47435000, float:50000.0)
            float r9 = r9 * r10
            r14 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            float r9 = r0.f22748D
            float r9 = r9 * r10
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            float r9 = r0.f22749E
            float r9 = r9 * r10
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            float r9 = r0.f22750F
            float r9 = r9 * r10
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            float r9 = r0.f22751G
            float r9 = r9 * r10
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            float r9 = r0.f22752H
            float r9 = r9 * r10
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            float r9 = r0.f22753I
            float r9 = r9 * r10
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            float r9 = r0.f22754J
            float r9 = r9 * r10
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            float r9 = r0.f22755K
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            float r9 = r0.f22756L
            float r9 = r9 + r14
            int r9 = (int) r9
            short r9 = (short) r9
            r8.putShort(r9)
            int r9 = r0.f22745A
            short r9 = (short) r9
            r8.putShort(r9)
            int r9 = r0.f22746B
            short r9 = (short) r9
            r8.putShort(r9)
            goto L_0x03e9
        L_0x03e7:
            r7 = r17
        L_0x03e9:
            com.google.ads.interactivemedia.v3.internal.aex r8 = new com.google.ads.interactivemedia.v3.internal.aex
            int r9 = r0.f22793x
            int r10 = r0.f22795z
            int r14 = r0.f22794y
            r8.<init>(r9, r10, r14, r7)
            goto L_0x03f7
        L_0x03f5:
            r8 = r17
        L_0x03f7:
            java.util.Map r7 = com.google.ads.interactivemedia.p367v3.internal.C7100lr.f22808f
            java.lang.String r9 = r0.f22770a
            boolean r7 = r7.containsKey(r9)
            if (r7 == 0) goto L_0x0414
            java.util.Map r6 = com.google.ads.interactivemedia.p367v3.internal.C7100lr.f22808f
            java.lang.String r7 = r0.f22770a
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r14 = r6.intValue()
            goto L_0x0415
        L_0x0414:
            r14 = -1
        L_0x0415:
            int r6 = r0.f22786q
            if (r6 != 0) goto L_0x0465
            float r6 = r0.f22787r
            r7 = 0
            int r6 = java.lang.Float.compare(r6, r7)
            if (r6 != 0) goto L_0x0465
            float r6 = r0.f22788s
            int r6 = java.lang.Float.compare(r6, r7)
            if (r6 != 0) goto L_0x0465
            float r6 = r0.f22789t
            int r6 = java.lang.Float.compare(r6, r7)
            if (r6 != 0) goto L_0x0433
            goto L_0x0466
        L_0x0433:
            float r6 = r0.f22788s
            r7 = 1119092736(0x42b40000, float:90.0)
            int r6 = java.lang.Float.compare(r6, r7)
            if (r6 != 0) goto L_0x0440
            r11 = 90
            goto L_0x0466
        L_0x0440:
            float r6 = r0.f22788s
            r7 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r6 = java.lang.Float.compare(r6, r7)
            if (r6 == 0) goto L_0x0462
            float r6 = r0.f22788s
            r7 = 1127481344(0x43340000, float:180.0)
            int r6 = java.lang.Float.compare(r6, r7)
            if (r6 != 0) goto L_0x0455
            goto L_0x0462
        L_0x0455:
            float r6 = r0.f22788s
            r7 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r6 = java.lang.Float.compare(r6, r7)
            if (r6 != 0) goto L_0x0465
            r11 = 270(0x10e, float:3.78E-43)
            goto L_0x0466
        L_0x0462:
            r11 = 180(0xb4, float:2.52E-43)
            goto L_0x0466
        L_0x0465:
            r11 = r14
        L_0x0466:
            int r6 = r0.f22781l
            r13.mo15635aj(r6)
            int r6 = r0.f22782m
            r13.mo15615Q(r6)
            r13.mo15626aa(r1)
            r13.mo15629ad(r11)
            byte[] r1 = r0.f22790u
            r13.mo15627ab(r1)
            int r1 = r0.f22791v
            r13.mo15633ah(r1)
            r13.mo15608J(r8)
            r14 = 2
            goto L_0x04c1
        L_0x0485:
            boolean r1 = r6.equals(r5)
            if (r1 == 0) goto L_0x048d
        L_0x048b:
            r14 = 3
            goto L_0x04c1
        L_0x048d:
            boolean r1 = r7.equals(r5)
            if (r1 == 0) goto L_0x04a6
            java.util.ArrayList r2 = new java.util.ArrayList
            r1 = 2
            r2.<init>(r1)
            byte[] r1 = com.google.ads.interactivemedia.p367v3.internal.C7100lr.f22805c
            r2.add(r1)
            byte[] r1 = r0.f22779j
            r2.add(r1)
            goto L_0x048b
        L_0x04a6:
            boolean r1 = r9.equals(r5)
            if (r1 != 0) goto L_0x048b
            boolean r1 = r8.equals(r5)
            if (r1 != 0) goto L_0x048b
            boolean r1 = r10.equals(r5)
            if (r1 == 0) goto L_0x04b9
            goto L_0x048b
        L_0x04b9:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x04c1:
            java.util.Map r1 = com.google.ads.interactivemedia.p367v3.internal.C7100lr.f22808f
            java.lang.String r6 = r0.f22770a
            boolean r1 = r1.containsKey(r6)
            if (r1 != 0) goto L_0x04d2
            java.lang.String r1 = r0.f22770a
            r13.mo15619U(r1)
        L_0x04d2:
            r1 = r20
            r13.mo15616R(r1)
            r13.mo15630ae(r5)
            r13.mo15621W(r4)
            java.lang.String r1 = r0.f22769Y
            r13.mo15620V(r1)
            r13.mo15632ag(r12)
            r13.mo15618T(r2)
            r13.mo15607I(r3)
            com.google.ads.interactivemedia.v3.internal.jc r1 = r0.f22780k
            r13.mo15610L(r1)
            com.google.ads.interactivemedia.v3.internal.cy r1 = r13.mo15625a()
            int r2 = r0.f22772c
            r3 = r19
            com.google.ads.interactivemedia.v3.internal.kr r2 = r3.mo16113ak(r2, r14)
            r0.f22766V = r2
            r2.mo16102a(r1)
            return
        L_0x0502:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>((java.lang.String) r2)
            goto L_0x050b
        L_0x050a:
            throw r1
        L_0x050b:
            goto L_0x050a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7098lp.mo16150a(com.google.ads.interactivemedia.v3.internal.ka, int):void");
    }
}
