package com.android.p261d.p263b;

import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.android.d.b.h */
/* compiled from: PG */
final class C5049h {

    /* renamed from: h */
    private static final Charset f16053h = Charset.forName("US-ASCII");

    /* renamed from: i */
    private static final short f16054i = C5044c.m13854g(C5044c.f15924C);

    /* renamed from: j */
    private static final short f16055j = C5044c.m13854g(C5044c.f15925D);

    /* renamed from: k */
    private static final short f16056k = C5044c.m13854g(C5044c.f15987am);

    /* renamed from: l */
    private static final short f16057l = C5044c.m13854g(C5044c.f15926E);

    /* renamed from: m */
    private static final short f16058m = C5044c.m13854g(C5044c.f15927F);

    /* renamed from: n */
    private static final short f16059n = C5044c.m13854g(C5044c.f16026i);

    /* renamed from: o */
    private static final short f16060o = C5044c.m13854g(C5044c.f16030m);

    /* renamed from: a */
    public final C5042a f16061a;

    /* renamed from: b */
    public int f16062b;

    /* renamed from: c */
    public C5050i f16063c;

    /* renamed from: d */
    public C5048g f16064d;

    /* renamed from: e */
    public C5050i f16065e;

    /* renamed from: f */
    public C5050i f16066f;

    /* renamed from: g */
    public final TreeMap f16067g = new TreeMap();

    /* renamed from: p */
    private int f16068p = 0;

    /* renamed from: q */
    private int f16069q = 0;

    /* renamed from: r */
    private boolean f16070r;

    /* renamed from: s */
    private boolean f16071s = false;

    /* renamed from: t */
    private int f16072t;

    /* renamed from: u */
    private byte[] f16073u;

    /* renamed from: v */
    private int f16074v;

    /* renamed from: w */
    private final C5044c f16075w;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        android.util.Log.w("ExifParser", "Invalid JPEG format.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5049h(java.io.InputStream r7, com.android.p261d.p263b.C5044c r8) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f16068p = r0
            r6.f16069q = r0
            r6.f16071s = r0
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r6.f16067g = r1
            r6.f16075w = r8
            com.android.d.b.a r8 = new com.android.d.b.a
            r8.<init>(r7)
            short r1 = r8.mo9985c()
            r2 = -40
            if (r1 != r2) goto L_0x00f3
            short r1 = r8.mo9985c()
        L_0x0024:
            r2 = -39
            if (r1 == r2) goto L_0x007c
            r2 = -64
            if (r1 < r2) goto L_0x003f
            r2 = -49
            if (r1 > r2) goto L_0x003f
            r2 = -60
            if (r1 == r2) goto L_0x003f
            r2 = -56
            if (r1 == r2) goto L_0x003f
            r2 = -52
            if (r1 == r2) goto L_0x003d
            goto L_0x007c
        L_0x003d:
            r1 = -52
        L_0x003f:
            short r2 = r8.mo9985c()
            char r2 = (char) r2
            r3 = -31
            if (r1 != r3) goto L_0x0061
            r1 = 8
            if (r2 < r1) goto L_0x0061
            int r1 = r8.mo9983a()
            short r3 = r8.mo9985c()
            int r2 = r2 + -6
            r4 = 1165519206(0x45786966, float:3974.5874)
            if (r1 != r4) goto L_0x0061
            if (r3 != 0) goto L_0x0061
            r6.f16072t = r2
            r8 = 1
            goto L_0x007d
        L_0x0061:
            r1 = 2
            if (r2 < r1) goto L_0x0075
            int r2 = r2 + -2
            long r1 = (long) r2
            long r3 = r8.skip(r1)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            short r1 = r8.mo9985c()
            goto L_0x0024
        L_0x0075:
            java.lang.String r8 = "ExifParser"
            java.lang.String r1 = "Invalid JPEG format."
            android.util.Log.w(r8, r1)
        L_0x007c:
            r8 = 0
        L_0x007d:
            r6.f16071s = r8
            com.android.d.b.a r8 = new com.android.d.b.a
            r8.<init>(r7)
            r6.f16061a = r8
            boolean r7 = r6.f16071s
            if (r7 == 0) goto L_0x00f2
            short r7 = r8.mo9985c()
            r1 = 18761(0x4949, float:2.629E-41)
            java.lang.String r2 = "Invalid TIFF header"
            if (r7 != r1) goto L_0x009c
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r8.f15916b
            r1.order(r7)
            goto L_0x00a7
        L_0x009c:
            r1 = 19789(0x4d4d, float:2.773E-41)
            if (r7 != r1) goto L_0x00ec
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r1 = r8.f15916b
            r1.order(r7)
        L_0x00a7:
            short r7 = r8.mo9985c()
            r1 = 42
            if (r7 != r1) goto L_0x00e6
            long r1 = r8.mo9984b()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x00d2
            int r7 = (int) r1
            r6.f16074v = r7
            r6.f16062b = r0
            r6.m13861e(r0, r1)
            r3 = 8
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00d1
            int r7 = r7 + -8
            byte[] r7 = new byte[r7]
            r6.f16073u = r7
            r8.read(r7)
        L_0x00d1:
            return
        L_0x00d2:
            com.android.d.b.d r7 = new com.android.d.b.d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid offset "
            r8.<init>(r0)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x00e6:
            com.android.d.b.d r7 = new com.android.d.b.d
            r7.<init>(r2)
            throw r7
        L_0x00ec:
            com.android.d.b.d r7 = new com.android.d.b.d
            r7.<init>(r2)
            throw r7
        L_0x00f2:
            return
        L_0x00f3:
            com.android.d.b.d r7 = new com.android.d.b.d
            java.lang.String r8 = "Invalid JPEG format"
            r7.<init>(r8)
            goto L_0x00fc
        L_0x00fb:
            throw r7
        L_0x00fc:
            goto L_0x00fb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p261d.p263b.C5049h.<init>(java.io.InputStream, com.android.d.b.c):void");
    }

    /* renamed from: d */
    private final void m13860d(C5050i iVar) {
        if (iVar.f16081f != 0) {
            short s = iVar.f16078c;
            int i = iVar.f16082g;
            if (s == f16054i && m13863g(i, C5044c.f15924C)) {
                m13861e(2, iVar.mo10000a(0));
            } else if (s == f16055j && m13863g(i, C5044c.f15925D)) {
                m13861e(4, iVar.mo10000a(0));
            } else if (s == f16056k && m13863g(i, C5044c.f15987am)) {
                m13861e(3, iVar.mo10000a(0));
            } else if (s == f16057l && m13863g(i, C5044c.f15926E)) {
                this.f16067g.put(Integer.valueOf((int) iVar.mo10000a(0)), new C5048g());
            } else if (s == f16058m && m13863g(i, C5044c.f15927F)) {
                this.f16066f = iVar;
            } else if (s != f16059n || !m13863g(i, C5044c.f16026i)) {
                if (s == f16060o && m13863g(i, C5044c.f16030m) && iVar.mo10002c()) {
                    this.f16065e = iVar;
                }
            } else if (iVar.mo10002c()) {
                for (int i2 = 0; i2 < iVar.f16081f; i2++) {
                    if (iVar.f16079d == 3) {
                        m13862f(i2, iVar.mo10000a(i2));
                    } else {
                        m13862f(i2, iVar.mo10000a(i2));
                    }
                }
            } else {
                this.f16067g.put(Integer.valueOf(iVar.f16084i), new C5046e(iVar, false));
            }
        }
    }

    /* renamed from: e */
    private final void m13861e(int i, long j) {
        this.f16067g.put(Integer.valueOf((int) j), new C5047f(i));
    }

    /* renamed from: f */
    private final void m13862f(int i, long j) {
        this.f16067g.put(Integer.valueOf((int) j), new C5048g(i));
    }

    /* renamed from: g */
    private final boolean m13863g(int i, int i2) {
        int i3 = this.f16075w.mo9994e().get(i2);
        if (i3 == 0) {
            return false;
        }
        return C5044c.m13855i(i3, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo9997a() {
        C5050i iVar;
        if (!this.f16071s) {
            return 5;
        }
        C5042a aVar = this.f16061a;
        int i = aVar.f15915a;
        int i2 = this.f16068p + 2 + (this.f16069q * 12);
        boolean z = true;
        if (i < i2) {
            short c = aVar.mo9985c();
            short c2 = this.f16061a.mo9985c();
            long b = this.f16061a.mo9984b();
            if (b <= 2147483647L) {
                if (!C5050i.m13868e(c2)) {
                    Log.w("ExifParser", String.format("Tag %04x: Invalid data type %d", new Object[]{Short.valueOf(c), Short.valueOf(c2)}));
                    this.f16061a.skip(4);
                    iVar = null;
                } else {
                    int i3 = (int) b;
                    C5050i iVar2 = new C5050i(c, c2, i3, this.f16062b, i3 != 0);
                    int i4 = iVar2.f16081f * C5050i.f16077b[iVar2.f16079d];
                    if (i4 > 4) {
                        long b2 = this.f16061a.mo9984b();
                        if (b2 > 2147483647L) {
                            throw new C5045d("offset is larger then Integer.MAX_VALUE");
                        } else if (b2 >= ((long) this.f16074v) || c2 != 7) {
                            iVar2.f16084i = (int) b2;
                        } else {
                            byte[] bArr = new byte[i3];
                            System.arraycopy(this.f16073u, ((int) b2) - 8, bArr, 0, i3);
                            iVar2.mo10004f(bArr, i3);
                        }
                    } else {
                        boolean z2 = iVar2.f16080e;
                        iVar2.f16080e = false;
                        mo9999c(iVar2);
                        iVar2.f16080e = z2;
                        this.f16061a.skip((long) (4 - i4));
                        iVar2.f16084i = this.f16061a.f15915a - 4;
                    }
                    iVar = iVar2;
                }
                this.f16063c = iVar;
                if (iVar == null) {
                    return mo9997a();
                }
                if (this.f16070r) {
                    m13860d(iVar);
                }
                return 1;
            }
            throw new C5045d("Number of component is larger then Integer.MAX_VALUE");
        }
        if (i == i2) {
            if (this.f16062b == 0) {
                long b3 = mo9998b();
                if (b3 != 0) {
                    m13861e(1, b3);
                }
            } else {
                int intValue = this.f16067g.size() > 0 ? ((Integer) this.f16067g.firstEntry().getKey()).intValue() - this.f16061a.f15915a : 4;
                if (intValue < 4) {
                    Log.w("ExifParser", "Invalid size of link to next IFD: " + intValue);
                } else {
                    long b4 = mo9998b();
                    if (b4 != 0) {
                        Log.w("ExifParser", "Invalid link to next IFD: " + b4);
                    }
                }
            }
        }
        while (this.f16067g.size() != 0) {
            Map.Entry pollFirstEntry = this.f16067g.pollFirstEntry();
            Object value = pollFirstEntry.getValue();
            try {
                int intValue2 = ((Integer) pollFirstEntry.getKey()).intValue();
                C5042a aVar2 = this.f16061a;
                long j = ((long) intValue2) - ((long) aVar2.f15915a);
                if (aVar2.skip(j) == j) {
                    while (!this.f16067g.isEmpty() && ((Integer) this.f16067g.firstKey()).intValue() < intValue2) {
                        this.f16067g.pollFirstEntry();
                    }
                    if (value instanceof C5047f) {
                        C5047f fVar = (C5047f) value;
                        this.f16062b = fVar.f16049a;
                        this.f16069q = (char) this.f16061a.mo9985c();
                        int intValue3 = ((Integer) pollFirstEntry.getKey()).intValue();
                        this.f16068p = intValue3;
                        if ((this.f16069q * 12) + intValue3 + 2 <= this.f16072t) {
                            int i5 = this.f16062b;
                            if (!(i5 == 0 || i5 == 1 || i5 == 2)) {
                                z = false;
                            }
                            this.f16070r = z;
                            boolean z3 = fVar.f16050b;
                            return 0;
                        }
                        int i6 = this.f16062b;
                        Log.w("ExifParser", "Invalid size of IFD " + i6);
                        return 5;
                    } else if (value instanceof C5048g) {
                        C5048g gVar = (C5048g) value;
                        this.f16064d = gVar;
                        return gVar.f16052b;
                    } else {
                        C5046e eVar = (C5046e) value;
                        C5050i iVar3 = eVar.f16047a;
                        this.f16063c = iVar3;
                        if (iVar3.f16079d != 7) {
                            mo9999c(iVar3);
                            m13860d(this.f16063c);
                        }
                        if (eVar.f16048b) {
                            return 2;
                        }
                    }
                } else {
                    throw new EOFException();
                }
            } catch (IOException unused) {
                String valueOf = String.valueOf(pollFirstEntry.getKey());
                String name = value.getClass().getName();
                Log.w("ExifParser", "Failed to skip to data at: " + valueOf + " for " + name + ", the file may be broken.");
            }
        }
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo9998b() {
        return ((long) this.f16061a.mo9983a()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo9999c(C5050i iVar) {
        String str;
        short s = iVar.f16079d;
        if (s == 2 || s == 7 || s == 1) {
            int i = iVar.f16081f;
            if (this.f16067g.size() > 0 && ((Integer) this.f16067g.firstEntry().getKey()).intValue() < this.f16061a.f15915a + i) {
                Object value = this.f16067g.firstEntry().getValue();
                if (value instanceof C5048g) {
                    Log.w("ExifParser", "Thumbnail overlaps value for tag: \n".concat(iVar.toString()));
                    Log.w("ExifParser", "Invalid thumbnail offset: ".concat(String.valueOf(String.valueOf(this.f16067g.pollFirstEntry().getKey()))));
                } else {
                    if (value instanceof C5047f) {
                        int i2 = ((C5047f) value).f16049a;
                        String iVar2 = iVar.toString();
                        Log.w("ExifParser", "Ifd " + i2 + " overlaps value for tag: \n" + iVar2);
                    } else if (value instanceof C5046e) {
                        String iVar3 = ((C5046e) value).f16047a.toString();
                        String iVar4 = iVar.toString();
                        Log.w("ExifParser", "Tag value for tag: \n" + iVar3 + " overlaps value for tag: \n" + iVar4);
                    }
                    int intValue = ((Integer) this.f16067g.firstEntry().getKey()).intValue() - this.f16061a.f15915a;
                    String iVar5 = iVar.toString();
                    Log.w("ExifParser", "Invalid size of tag: \n" + iVar5 + " setting count to: " + intValue);
                    iVar.f16081f = intValue;
                }
            }
        }
        int i3 = 0;
        switch (iVar.f16079d) {
            case 1:
            case 7:
                int i4 = iVar.f16081f;
                byte[] bArr = new byte[i4];
                this.f16061a.read(bArr);
                iVar.mo10004f(bArr, i4);
                return;
            case 2:
                int i5 = iVar.f16081f;
                Charset charset = f16053h;
                if (i5 > 0) {
                    byte[] bArr2 = new byte[i5];
                    this.f16061a.mo9986d(bArr2, i5);
                    str = new String(bArr2, charset);
                } else {
                    str = BuildConfig.FLAVOR;
                }
                short s2 = iVar.f16079d;
                if (s2 == 2 || s2 == 7) {
                    byte[] bytes = str.getBytes(C5050i.f16076a);
                    int length = bytes.length;
                    if (length > 0) {
                        if (!(bytes[length - 1] == 0 || iVar.f16079d == 7)) {
                            bytes = Arrays.copyOf(bytes, length + 1);
                        }
                    } else if (iVar.f16079d == 2 && iVar.f16081f == 1) {
                        bytes = new byte[]{0};
                    }
                    int length2 = bytes.length;
                    if (!iVar.mo10001b(length2)) {
                        iVar.f16081f = length2;
                        iVar.f16083h = bytes;
                        return;
                    }
                    return;
                }
                return;
            case 3:
                int i6 = iVar.f16081f;
                int[] iArr = new int[i6];
                while (i3 < i6) {
                    iArr[i3] = (char) this.f16061a.mo9985c();
                    i3++;
                }
                iVar.mo10005g(iArr);
                return;
            case 4:
                int i7 = iVar.f16081f;
                long[] jArr = new long[i7];
                for (int i8 = 0; i8 < i7; i8++) {
                    jArr[i8] = mo9998b();
                }
                if (!iVar.mo10001b(i7) && iVar.f16079d == 4) {
                    while (i3 < i7) {
                        long j = jArr[i3];
                        if (j >= 0 && j <= 4294967295L) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    iVar.f16083h = jArr;
                    iVar.f16081f = i7;
                    return;
                }
                return;
            case 5:
                int i9 = iVar.f16081f;
                C5052k[] kVarArr = new C5052k[i9];
                while (i3 < i9) {
                    kVarArr[i3] = new C5052k(mo9998b(), mo9998b());
                    i3++;
                }
                iVar.mo10006h(kVarArr);
                return;
            case 9:
                int i10 = iVar.f16081f;
                int[] iArr2 = new int[i10];
                while (i3 < i10) {
                    iArr2[i3] = this.f16061a.mo9983a();
                    i3++;
                }
                iVar.mo10005g(iArr2);
                return;
            case 10:
                int i11 = iVar.f16081f;
                C5052k[] kVarArr2 = new C5052k[i11];
                while (i3 < i11) {
                    kVarArr2[i3] = new C5052k((long) this.f16061a.mo9983a(), (long) this.f16061a.mo9983a());
                    i3++;
                }
                iVar.mo10006h(kVarArr2);
                return;
            default:
                return;
        }
    }
}
