package com.google.android.apps.gsa.search.core.p6513aj;

import android.util.JsonToken;
import android.util.MalformedJsonException;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.common.base.C58838bb;
import dagger.C68214a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.aj.r */
/* compiled from: PG */
public final class C84558r implements Closeable {

    /* renamed from: a */
    public static final byte[] f230109a = {116, 114, 117, 101};

    /* renamed from: g */
    private static final byte[] f230110g = {110, 117, 108, 108};

    /* renamed from: h */
    private static final byte[] f230111h = {102, 97, 108, 115, 101};

    /* renamed from: b */
    public boolean f230112b = false;

    /* renamed from: c */
    public int f230113c = 0;

    /* renamed from: d */
    public int f230114d = 0;

    /* renamed from: e */
    public JsonToken f230115e;

    /* renamed from: f */
    public C84557q f230116f;

    /* renamed from: i */
    private final C84536au f230117i = new C84536au();

    /* renamed from: j */
    private final InputStream f230118j;

    /* renamed from: k */
    private byte[] f230119k = new byte[8192];

    /* renamed from: l */
    private int f230120l = 1;

    /* renamed from: m */
    private int f230121m = -1;

    /* renamed from: n */
    private final List f230122n = new ArrayList();

    /* renamed from: o */
    private final C84557q f230123o;

    /* renamed from: p */
    private final C68214a f230124p;

    /* renamed from: q */
    private C84557q f230125q;

    public C84558r(InputStream inputStream, C68214a aVar) {
        m135259v(5);
        this.f230123o = new C84557q();
        if (inputStream != null) {
            this.f230118j = inputStream;
            this.f230124p = aVar;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: m */
    private final int m135250m(int i, int i2, int i3) {
        int i4 = i3 - i2;
        if (!(i4 == 0 || i2 == i)) {
            byte[] bArr = this.f230119k;
            System.arraycopy(bArr, i2, bArr, i, i4);
        }
        return i + i4;
    }

    /* renamed from: n */
    private final int m135251n() {
        while (true) {
            if (this.f230113c < this.f230114d || mo78306i(1)) {
                byte[] bArr = this.f230119k;
                int i = this.f230113c;
                int i2 = i + 1;
                this.f230113c = i2;
                byte b = bArr[i];
                if (b != 9) {
                    if (b == 10) {
                        this.f230120l++;
                        this.f230121m = i2 - 1;
                    } else if (b != 13 && b != 32) {
                        if (b == 35) {
                            m135258u();
                            m135261x();
                        } else if (b != 47) {
                            return b;
                        } else {
                            if (i2 == this.f230114d && !mo78306i(1)) {
                                return b;
                            }
                            m135258u();
                            byte[] bArr2 = this.f230119k;
                            int i3 = this.f230113c;
                            byte b2 = bArr2[i3];
                            if (b2 == 42) {
                                this.f230113c = i3 + 1;
                                while (true) {
                                    if (this.f230113c + 2 <= this.f230114d || mo78306i(2)) {
                                        if (mo78308k("*/")) {
                                            this.f230113c += 2;
                                            break;
                                        }
                                        this.f230113c++;
                                    } else {
                                        throw m135255r("Unterminated comment");
                                    }
                                }
                            } else if (b2 != 47) {
                                return b;
                            } else {
                                this.f230113c = i3 + 1;
                                m135261x();
                            }
                        }
                    }
                }
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    /* renamed from: o */
    private final JsonToken m135252o(boolean z) {
        if (z) {
            m135260w(1);
        } else {
            int n = m135251n();
            if (n != 44) {
                if (n == 59) {
                    m135258u();
                } else if (n == 93) {
                    m135262y();
                    JsonToken jsonToken = JsonToken.END_ARRAY;
                    this.f230115e = jsonToken;
                    return jsonToken;
                } else {
                    throw m135255r("Unterminated array");
                }
            }
        }
        int n2 = m135251n();
        if (!(n2 == 44 || n2 == 59)) {
            if (n2 != 93) {
                this.f230113c--;
                return m135254q();
            } else if (z) {
                m135262y();
                JsonToken jsonToken2 = JsonToken.END_ARRAY;
                this.f230115e = jsonToken2;
                return jsonToken2;
            }
        }
        m135258u();
        this.f230113c--;
        this.f230116f.mo78293a(f230110g, 0, 4);
        JsonToken jsonToken3 = JsonToken.NULL;
        this.f230115e = jsonToken3;
        return jsonToken3;
    }

    /* renamed from: p */
    private final JsonToken m135253p(boolean z) {
        if (!z) {
            int n = m135251n();
            if (!(n == 44 || n == 59)) {
                if (n == 125) {
                    m135262y();
                    JsonToken jsonToken = JsonToken.END_OBJECT;
                    this.f230115e = jsonToken;
                    return jsonToken;
                }
                throw m135255r("Unterminated object");
            }
        } else if (m135251n() != 125) {
            this.f230113c--;
        } else {
            m135262y();
            JsonToken jsonToken2 = JsonToken.END_OBJECT;
            this.f230115e = jsonToken2;
            return jsonToken2;
        }
        int n2 = m135251n();
        if (n2 != 34) {
            if (n2 != 39) {
                m135258u();
                this.f230113c--;
                C84557q s = m135256s();
                this.f230125q = s;
                if (s.f230108c == 0) {
                    throw m135255r("Expected name");
                }
                m135260w(3);
                JsonToken jsonToken3 = JsonToken.NAME;
                this.f230115e = jsonToken3;
                return jsonToken3;
            }
            m135258u();
        }
        this.f230125q = m135257t((byte) n2);
        m135260w(3);
        JsonToken jsonToken32 = JsonToken.NAME;
        this.f230115e = jsonToken32;
        return jsonToken32;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0168  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.util.JsonToken m135254q() {
        /*
            r15 = this;
            int r0 = r15.m135251n()
            r1 = 34
            if (r0 == r1) goto L_0x0189
            r1 = 39
            if (r0 == r1) goto L_0x0186
            r1 = 91
            r2 = 0
            if (r0 == r1) goto L_0x017e
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x0175
            int r0 = r15.f230113c
            int r0 = r0 + -1
            r15.f230113c = r0
            com.google.android.apps.gsa.search.core.aj.q r0 = r15.m135256s()
            r15.f230116f = r0
            int r1 = r0.f230108c
            if (r1 == 0) goto L_0x016e
            com.google.android.apps.gsa.search.core.aj.q r1 = r15.f230123o
            r3 = 1
            if (r0 != r1) goto L_0x0032
            byte[] r0 = r0.f230106a
            byte[] r1 = r15.f230119k
            if (r0 != r1) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            com.google.common.base.C58838bb.m90883r(r0)
            com.google.android.apps.gsa.search.core.aj.q r0 = r15.f230116f
            int r1 = r0.f230108c
            int r4 = r0.f230107b
            r5 = 85
            r6 = 117(0x75, float:1.64E-43)
            r7 = 76
            r8 = 108(0x6c, float:1.51E-43)
            r9 = 4
            if (r1 != r9) goto L_0x0077
            byte[] r1 = r15.f230119k
            byte r10 = r1[r4]
            r11 = 110(0x6e, float:1.54E-43)
            if (r10 == r11) goto L_0x0056
            r11 = 78
            if (r10 != r11) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r1 = 4
            goto L_0x0077
        L_0x0056:
            int r10 = r4 + 1
            byte r10 = r1[r10]
            if (r10 == r6) goto L_0x005e
            if (r10 != r5) goto L_0x0054
        L_0x005e:
            int r10 = r4 + 2
            byte r10 = r1[r10]
            if (r10 == r8) goto L_0x0066
            if (r10 != r7) goto L_0x0054
        L_0x0066:
            int r10 = r4 + 3
            byte r1 = r1[r10]
            if (r1 == r8) goto L_0x006e
            if (r1 != r7) goto L_0x0054
        L_0x006e:
            byte[] r1 = f230110g
            r0.mo78293a(r1, r2, r9)
            android.util.JsonToken r0 = android.util.JsonToken.NULL
            goto L_0x0162
        L_0x0077:
            r10 = 69
            r11 = 101(0x65, float:1.42E-43)
            if (r1 != r9) goto L_0x00ae
            byte[] r1 = r15.f230119k
            byte r12 = r1[r4]
            r13 = 116(0x74, float:1.63E-43)
            if (r12 == r13) goto L_0x0089
            r13 = 84
            if (r12 != r13) goto L_0x00af
        L_0x0089:
            int r12 = r4 + 1
            byte r12 = r1[r12]
            r13 = 114(0x72, float:1.6E-43)
            if (r12 == r13) goto L_0x0095
            r13 = 82
            if (r12 != r13) goto L_0x00af
        L_0x0095:
            int r12 = r4 + 2
            byte r12 = r1[r12]
            if (r12 == r6) goto L_0x009d
            if (r12 != r5) goto L_0x00af
        L_0x009d:
            int r5 = r4 + 3
            byte r1 = r1[r5]
            if (r1 == r11) goto L_0x00a5
            if (r1 != r10) goto L_0x00af
        L_0x00a5:
            byte[] r1 = f230109a
            r0.mo78293a(r1, r2, r9)
            android.util.JsonToken r0 = android.util.JsonToken.BOOLEAN
            goto L_0x0162
        L_0x00ae:
            r9 = r1
        L_0x00af:
            r1 = 5
            if (r9 != r1) goto L_0x00ef
            byte[] r5 = r15.f230119k
            byte r6 = r5[r4]
            r12 = 102(0x66, float:1.43E-43)
            if (r6 == r12) goto L_0x00be
            r12 = 70
            if (r6 != r12) goto L_0x00ef
        L_0x00be:
            int r6 = r4 + 1
            byte r6 = r5[r6]
            r12 = 97
            if (r6 == r12) goto L_0x00ca
            r12 = 65
            if (r6 != r12) goto L_0x00ef
        L_0x00ca:
            int r6 = r4 + 2
            byte r6 = r5[r6]
            if (r6 == r8) goto L_0x00d2
            if (r6 != r7) goto L_0x00ef
        L_0x00d2:
            int r6 = r4 + 3
            byte r6 = r5[r6]
            r7 = 115(0x73, float:1.61E-43)
            if (r6 == r7) goto L_0x00de
            r7 = 83
            if (r6 != r7) goto L_0x00ef
        L_0x00de:
            int r6 = r4 + 4
            byte r5 = r5[r6]
            if (r5 == r11) goto L_0x00e6
            if (r5 != r10) goto L_0x00ef
        L_0x00e6:
            byte[] r3 = f230111h
            r0.mo78293a(r3, r2, r1)
            android.util.JsonToken r0 = android.util.JsonToken.BOOLEAN
            goto L_0x0162
        L_0x00ef:
            byte[] r1 = r15.f230119k
            r0.mo78293a(r1, r4, r9)
            byte[] r0 = r15.f230119k
            byte r1 = r0[r4]
            r2 = 45
            if (r1 != r2) goto L_0x0104
            int r1 = r4 + 1
            byte r5 = r0[r1]
            r14 = r5
            r5 = r1
            r1 = r14
            goto L_0x0105
        L_0x0104:
            r5 = r4
        L_0x0105:
            r6 = 57
            r7 = 48
            if (r1 != r7) goto L_0x010f
            int r5 = r5 + r3
            byte r1 = r0[r5]
            goto L_0x0121
        L_0x010f:
            r8 = 49
            if (r1 < r8) goto L_0x0160
            if (r1 > r6) goto L_0x0160
            int r5 = r5 + r3
            byte r1 = r0[r5]
        L_0x0118:
            if (r1 < r7) goto L_0x0121
            if (r1 > r6) goto L_0x0121
            int r5 = r5 + 1
            byte r1 = r0[r5]
            goto L_0x0118
        L_0x0121:
            r8 = 46
            if (r1 != r8) goto L_0x0132
            int r5 = r5 + 1
            byte r1 = r0[r5]
        L_0x0129:
            if (r1 < r7) goto L_0x0132
            if (r1 > r6) goto L_0x0132
            int r5 = r5 + 1
            byte r1 = r0[r5]
            goto L_0x0129
        L_0x0132:
            if (r1 == r11) goto L_0x0136
            if (r1 != r10) goto L_0x0154
        L_0x0136:
            int r5 = r5 + 1
            byte r1 = r0[r5]
            r8 = 43
            if (r1 == r8) goto L_0x0140
            if (r1 != r2) goto L_0x0144
        L_0x0140:
            int r5 = r5 + 1
            byte r1 = r0[r5]
        L_0x0144:
            if (r1 < r7) goto L_0x015d
            if (r1 > r6) goto L_0x015d
            int r5 = r5 + r3
            byte r1 = r0[r5]
        L_0x014b:
            if (r1 < r7) goto L_0x0154
            if (r1 > r6) goto L_0x0154
            int r5 = r5 + 1
            byte r1 = r0[r5]
            goto L_0x014b
        L_0x0154:
            int r4 = r4 + r9
            if (r5 != r4) goto L_0x015a
            android.util.JsonToken r0 = android.util.JsonToken.NUMBER
            goto L_0x0162
        L_0x015a:
            android.util.JsonToken r0 = android.util.JsonToken.STRING
            goto L_0x0162
        L_0x015d:
            android.util.JsonToken r0 = android.util.JsonToken.STRING
            goto L_0x0162
        L_0x0160:
            android.util.JsonToken r0 = android.util.JsonToken.STRING
        L_0x0162:
            r15.f230115e = r0
            android.util.JsonToken r1 = android.util.JsonToken.STRING
            if (r0 != r1) goto L_0x016b
            r15.m135258u()
        L_0x016b:
            android.util.JsonToken r0 = r15.f230115e
            return r0
        L_0x016e:
            java.lang.String r0 = "Expected literal value"
            android.util.MalformedJsonException r0 = r15.m135255r(r0)
            throw r0
        L_0x0175:
            r0 = 2
            r15.m135259v(r0)
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_OBJECT
            r15.f230115e = r0
            return r0
        L_0x017e:
            r15.m135259v(r2)
            android.util.JsonToken r0 = android.util.JsonToken.BEGIN_ARRAY
            r15.f230115e = r0
            return r0
        L_0x0186:
            r15.m135258u()
        L_0x0189:
            byte r0 = (byte) r0
            com.google.android.apps.gsa.search.core.aj.q r0 = r15.m135257t(r0)
            r15.f230116f = r0
            android.util.JsonToken r0 = android.util.JsonToken.STRING
            r15.f230115e = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6513aj.C84558r.m135254q():android.util.JsonToken");
    }

    /* renamed from: r */
    private final MalformedJsonException m135255r(String str) {
        int i = this.f230120l;
        int i2 = this.f230113c;
        int i3 = this.f230121m;
        throw new MalformedJsonException(str + " at line " + i + " column " + (i2 - i3));
    }

    /* renamed from: s */
    private final C84557q m135256s() {
        int i = 0;
        while (true) {
            int i2 = this.f230113c + i;
            if (i2 < this.f230114d) {
                byte b = this.f230119k[i2];
                if (b != 9) {
                    if (b == 10) {
                        this.f230120l++;
                        this.f230121m = i2;
                    } else if (!(b == 12 || b == 13 || b == 32)) {
                        if (b != 35) {
                            if (b != 44) {
                                if (!(b == 47 || b == 61)) {
                                    if (!(b == 123 || b == 125 || b == 58)) {
                                        if (b != 59) {
                                            switch (b) {
                                                case 91:
                                                case 93:
                                                    break;
                                                case 92:
                                                    break;
                                                default:
                                                    i++;
                                                    continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (!mo78306i(i + 1)) {
                this.f230119k[this.f230114d] = 0;
            }
        }
        m135258u();
        this.f230123o.mo78293a(this.f230119k, this.f230113c, i);
        this.f230113c += i;
        return this.f230123o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b8, code lost:
        throw new java.lang.NumberFormatException("Bad unicode escape sequence: \\u".concat(new java.lang.String(r7, r8, 4)));
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.gsa.search.core.p6513aj.C84557q m135257t(byte r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r11.f230113c
            int r1 = r1 + r2
            r11.f230113c = r1
            r3 = r1
        L_0x0008:
            int r4 = r11.f230113c
            int r5 = r11.f230114d
            r6 = 1
            if (r4 >= r5) goto L_0x015a
            byte[] r5 = r11.f230119k
            int r7 = r4 + 1
            r11.f230113c = r7
            byte r4 = r5[r4]
            if (r4 != r12) goto L_0x002a
            int r7 = r7 + -1
            int r12 = r11.m135250m(r1, r3, r7)
            com.google.android.apps.gsa.search.core.aj.q r0 = r11.f230123o
            byte[] r1 = r11.f230119k
            int r12 = r12 - r2
            r0.mo78293a(r1, r2, r12)
            com.google.android.apps.gsa.search.core.aj.q r12 = r11.f230123o
            return r12
        L_0x002a:
            r5 = 92
            r8 = 10
            if (r4 != r5) goto L_0x014d
            int r7 = r7 + -1
            int r1 = r11.m135250m(r1, r3, r7)
            int r3 = r11.f230113c
            int r4 = r3 + 5
            int r5 = r11.f230114d
            r7 = 117(0x75, float:1.64E-43)
            if (r4 <= r5) goto L_0x0051
            if (r3 >= r5) goto L_0x0049
            byte[] r9 = r11.f230119k
            byte r9 = r9[r3]
            if (r9 == r7) goto L_0x0049
            goto L_0x0051
        L_0x0049:
            if (r3 >= r5) goto L_0x004d
            int r4 = r4 - r5
            r6 = r4
        L_0x004d:
            int r3 = r3 + -1
            goto L_0x015a
        L_0x0051:
            byte[] r4 = r11.f230119k     // Catch:{ NumberFormatException -> 0x013d }
            int r5 = r3 + 1
            r11.f230113c = r5     // Catch:{ NumberFormatException -> 0x013d }
            byte r3 = r4[r3]     // Catch:{ NumberFormatException -> 0x013d }
            if (r3 == r8) goto L_0x012b
            r6 = 98
            if (r3 == r6) goto L_0x0128
            r6 = 102(0x66, float:1.43E-43)
            if (r3 == r6) goto L_0x0125
            r9 = 110(0x6e, float:1.54E-43)
            if (r3 == r9) goto L_0x0135
            r8 = 114(0x72, float:1.6E-43)
            if (r3 == r8) goto L_0x0122
            r8 = 120(0x78, float:1.68E-43)
            if (r3 == r8) goto L_0x0106
            r8 = 116(0x74, float:1.63E-43)
            if (r3 == r8) goto L_0x0103
            if (r3 == r7) goto L_0x0077
            goto L_0x0134
        L_0x0077:
            r3 = 0
            r4 = 0
        L_0x0079:
            r5 = 4
            if (r3 == r5) goto L_0x00b9
            byte[] r7 = r11.f230119k     // Catch:{ NumberFormatException -> 0x013d }
            int r8 = r11.f230113c     // Catch:{ NumberFormatException -> 0x013d }
            int r9 = r8 + r3
            byte r9 = r7[r9]     // Catch:{ NumberFormatException -> 0x013d }
            r10 = 48
            if (r9 < r10) goto L_0x008f
            r10 = 57
            if (r9 > r10) goto L_0x008f
            int r9 = r9 + -48
            goto L_0x00a2
        L_0x008f:
            r10 = 97
            if (r9 < r10) goto L_0x0098
            if (r9 > r6) goto L_0x0098
            int r9 = r9 + -87
            goto L_0x00a2
        L_0x0098:
            r10 = 65
            if (r9 < r10) goto L_0x00a8
            r10 = 70
            if (r9 > r10) goto L_0x00a8
            int r9 = r9 + -55
        L_0x00a2:
            int r4 = r4 << 4
            int r4 = r4 + r9
            int r3 = r3 + 1
            goto L_0x0079
        L_0x00a8:
            java.lang.NumberFormatException r12 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x013d }
            java.lang.String r0 = new java.lang.String     // Catch:{ NumberFormatException -> 0x013d }
            r0.<init>(r7, r8, r5)     // Catch:{ NumberFormatException -> 0x013d }
            java.lang.String r3 = "Bad unicode escape sequence: \\u"
            java.lang.String r0 = r3.concat(r0)     // Catch:{ NumberFormatException -> 0x013d }
            r12.<init>(r0)     // Catch:{ NumberFormatException -> 0x013d }
            throw r12     // Catch:{ NumberFormatException -> 0x013d }
        L_0x00b9:
            int r3 = r11.f230113c     // Catch:{ NumberFormatException -> 0x013d }
            int r5 = r5 + r3
            r11.f230113c = r5     // Catch:{ NumberFormatException -> 0x013d }
            r3 = 128(0x80, float:1.794E-43)
            if (r4 >= r3) goto L_0x00cb
            byte[] r3 = r11.f230119k     // Catch:{ NumberFormatException -> 0x013d }
            int r6 = r1 + 1
            byte r4 = (byte) r4     // Catch:{ NumberFormatException -> 0x013d }
            r3[r1] = r4     // Catch:{ NumberFormatException -> 0x013d }
            goto L_0x0139
        L_0x00cb:
            r6 = 2048(0x800, float:2.87E-42)
            if (r4 >= r6) goto L_0x00e4
            byte[] r6 = r11.f230119k     // Catch:{ NumberFormatException -> 0x013d }
            int r7 = r1 + 1
            int r8 = r4 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8     // Catch:{ NumberFormatException -> 0x013d }
            r6[r1] = r8     // Catch:{ NumberFormatException -> 0x013d }
            int r8 = r7 + 1
            r4 = r4 & 63
            r3 = r3 | r4
            byte r3 = (byte) r3     // Catch:{ NumberFormatException -> 0x013d }
            r6[r7] = r3     // Catch:{ NumberFormatException -> 0x013d }
            r6 = r8
            goto L_0x0139
        L_0x00e4:
            byte[] r6 = r11.f230119k     // Catch:{ NumberFormatException -> 0x013d }
            int r7 = r1 + 1
            int r8 = r4 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            byte r8 = (byte) r8     // Catch:{ NumberFormatException -> 0x013d }
            r6[r1] = r8     // Catch:{ NumberFormatException -> 0x013d }
            int r8 = r7 + 1
            int r9 = r4 >> 6
            r9 = r9 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9     // Catch:{ NumberFormatException -> 0x013d }
            r6[r7] = r9     // Catch:{ NumberFormatException -> 0x013d }
            int r7 = r8 + 1
            r4 = r4 & 63
            r3 = r3 | r4
            byte r3 = (byte) r3     // Catch:{ NumberFormatException -> 0x013d }
            r6[r8] = r3     // Catch:{ NumberFormatException -> 0x013d }
            r6 = r7
            goto L_0x0139
        L_0x0103:
            r8 = 9
            goto L_0x0135
        L_0x0106:
            dagger.a r12 = r11.f230124p     // Catch:{ NumberFormatException -> 0x013d }
            java.lang.Object r12 = r12.mo27525b()     // Catch:{ NumberFormatException -> 0x013d }
            com.google.android.apps.gsa.shared.logger.f r12 = (com.google.android.apps.gsa.shared.logger.C89911f) r12     // Catch:{ NumberFormatException -> 0x013d }
            r0 = 8642715(0x83e09b, float:1.2111023E-38)
            r3 = 29
            r4 = 0
            com.google.android.apps.gsa.shared.logger.e r12 = r12.mo83755a(r4, r0, r3)     // Catch:{ NumberFormatException -> 0x013d }
            r12.mo83721a()     // Catch:{ NumberFormatException -> 0x013d }
            java.lang.String r12 = "Found \\x in JSON"
            android.util.MalformedJsonException r12 = r11.m135255r(r12)     // Catch:{ NumberFormatException -> 0x013d }
            throw r12     // Catch:{ NumberFormatException -> 0x013d }
        L_0x0122:
            r8 = 13
            goto L_0x0135
        L_0x0125:
            r8 = 12
            goto L_0x0135
        L_0x0128:
            r8 = 8
            goto L_0x0135
        L_0x012b:
            int r7 = r11.f230120l     // Catch:{ NumberFormatException -> 0x013d }
            int r7 = r7 + r6
            r11.f230120l = r7     // Catch:{ NumberFormatException -> 0x013d }
            int r6 = r5 + -1
            r11.f230121m = r6     // Catch:{ NumberFormatException -> 0x013d }
        L_0x0134:
            r8 = r3
        L_0x0135:
            int r6 = r1 + 1
            r4[r1] = r8     // Catch:{ NumberFormatException -> 0x013d }
        L_0x0139:
            r3 = r5
            r1 = r6
            goto L_0x0008
        L_0x013d:
            r12 = move-exception
            com.google.android.apps.gsa.search.core.aj.q r0 = r11.f230123o
            byte[] r3 = r11.f230119k
            int r1 = r1 - r2
            r0.mo78293a(r3, r2, r1)
            int r0 = r11.f230113c
            int r0 = r0 + -2
            r11.f230113c = r0
            throw r12
        L_0x014d:
            if (r4 != r8) goto L_0x0008
            int r4 = r11.f230120l
            int r4 = r4 + r6
            r11.f230120l = r4
            int r7 = r7 + -1
            r11.f230121m = r7
            goto L_0x0008
        L_0x015a:
            int r4 = r11.f230114d
            int r3 = r11.m135250m(r1, r3, r4)
            r11.f230114d = r3
            r11.f230113c = r2
            int r1 = r1 - r2
            int r3 = r3 - r2
            int r3 = r3 + r6
            boolean r2 = r11.mo78306i(r3)
            if (r2 != 0) goto L_0x0002
            int r12 = r11.f230113c
            int r0 = r11.f230114d
            if (r12 != r0) goto L_0x0176
            java.lang.String r12 = "Unterminated string"
            goto L_0x0178
        L_0x0176:
            java.lang.String r12 = "Unterminated escape sequence"
        L_0x0178:
            android.util.MalformedJsonException r12 = r11.m135255r(r12)
            goto L_0x017e
        L_0x017d:
            throw r12
        L_0x017e:
            goto L_0x017d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6513aj.C84558r.m135257t(byte):com.google.android.apps.gsa.search.core.aj.q");
    }

    /* renamed from: u */
    private final void m135258u() {
        if (!this.f230112b) {
            throw m135255r("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: v */
    private final void m135259v(int i) {
        this.f230122n.add(Integer.valueOf(i));
    }

    /* renamed from: w */
    private final void m135260w(int i) {
        List list = this.f230122n;
        list.set(list.size() - 1, Integer.valueOf(i));
    }

    /* renamed from: x */
    private final void m135261x() {
        int i;
        byte b;
        do {
            if (this.f230113c < this.f230114d || mo78306i(1)) {
                byte[] bArr = this.f230119k;
                int i2 = this.f230113c;
                i = i2 + 1;
                this.f230113c = i;
                b = bArr[i2];
                if (b == 13) {
                    return;
                }
            } else {
                return;
            }
        } while (b != 10);
        this.f230120l++;
        this.f230121m = i - 1;
    }

    /* renamed from: y */
    private final void m135262y() {
        List list = this.f230122n;
        ((Integer) list.remove(list.size() - 1)).intValue();
    }

    /* renamed from: a */
    public final int mo78297a() {
        int i;
        mo78299c();
        if (this.f230115e == JsonToken.STRING || this.f230115e == JsonToken.NUMBER) {
            C84536au auVar = this.f230117i;
            C84557q qVar = this.f230116f;
            String a = auVar.mo78244a(qVar.f230106a, qVar.f230107b, qVar.f230108c);
            try {
                i = Integer.parseInt(a);
            } catch (NumberFormatException unused) {
                double parseDouble = Double.parseDouble(a);
                int i2 = (int) parseDouble;
                if (((double) i2) == parseDouble) {
                    i = i2;
                } else {
                    throw new NumberFormatException(a);
                }
            }
            mo78298b();
            return i;
        }
        throw new IllegalStateException("Expected an int but was ".concat(String.valueOf(String.valueOf(this.f230115e))));
    }

    /* renamed from: b */
    public final JsonToken mo78298b() {
        mo78299c();
        JsonToken jsonToken = this.f230115e;
        this.f230115e = null;
        this.f230116f = null;
        this.f230125q = null;
        return jsonToken;
    }

    /* renamed from: c */
    public final JsonToken mo78299c() {
        JsonToken jsonToken = this.f230115e;
        if (jsonToken != null) {
            return jsonToken;
        }
        List list = this.f230122n;
        switch (((Integer) list.get(list.size() - 1)).intValue()) {
            case 0:
                return m135252o(true);
            case 1:
                return m135252o(false);
            case 2:
                return m135253p(true);
            case 3:
                int n = m135251n();
                if (n != 58) {
                    if (n == 61) {
                        m135258u();
                        if (this.f230113c < this.f230114d || mo78306i(1)) {
                            byte[] bArr = this.f230119k;
                            int i = this.f230113c;
                            if (bArr[i] == 62) {
                                this.f230113c = i + 1;
                            }
                        }
                    } else {
                        throw m135255r("Expected ':'");
                    }
                }
                m135260w(4);
                return m135254q();
            case 4:
                return m135253p(false);
            case 5:
                m135260w(6);
                JsonToken q = m135254q();
                if (this.f230112b || this.f230115e == JsonToken.BEGIN_ARRAY || this.f230115e == JsonToken.BEGIN_OBJECT) {
                    return q;
                }
                throw m135255r("Expected JSON document to start with '[' or '{' but was ".concat(String.valueOf(String.valueOf(this.f230115e))));
            case 6:
                try {
                    JsonToken q2 = m135254q();
                    if (this.f230112b) {
                        return q2;
                    }
                    throw m135255r("Expected EOF");
                } catch (EOFException unused) {
                    JsonToken jsonToken2 = JsonToken.END_DOCUMENT;
                    this.f230115e = jsonToken2;
                    return jsonToken2;
                }
            case 7:
                throw new IllegalStateException("JsonReader is closed");
            default:
                throw new AssertionError();
        }
    }

    public final void close() {
        this.f230116f = null;
        this.f230115e = null;
        this.f230122n.clear();
        this.f230122n.add(7);
        this.f230118j.close();
    }

    /* renamed from: d */
    public final C84557q mo78301d() {
        mo78299c();
        if (this.f230115e == JsonToken.NAME) {
            C58838bb.m90883r(this.f230125q == this.f230123o);
            mo78298b();
            return this.f230123o;
        }
        throw new IllegalStateException("Expected a name but was ".concat(String.valueOf(String.valueOf(mo78299c()))));
    }

    /* renamed from: e */
    public final C84557q mo78302e() {
        mo78299c();
        if (this.f230115e == JsonToken.STRING || this.f230115e == JsonToken.NUMBER) {
            C58838bb.m90883r(this.f230116f == this.f230123o);
            mo78298b();
            return this.f230123o;
        }
        throw new IllegalStateException("Expected a string but was ".concat(String.valueOf(String.valueOf(mo78299c()))));
    }

    /* renamed from: f */
    public final String mo78303f() {
        C84557q e = mo78302e();
        return this.f230117i.mo78244a(e.f230106a, e.f230107b, e.f230108c);
    }

    /* renamed from: g */
    public final void mo78304g(JsonToken jsonToken) {
        mo78299c();
        if (this.f230115e == jsonToken) {
            mo78298b();
            return;
        }
        String valueOf = String.valueOf(jsonToken);
        String valueOf2 = String.valueOf(mo78299c());
        throw new IllegalStateException("Expected " + valueOf + " but was " + valueOf2);
    }

    /* renamed from: h */
    public final void mo78305h() {
        int i = 0;
        do {
            JsonToken b = mo78298b();
            if (b == JsonToken.BEGIN_ARRAY || b == JsonToken.BEGIN_OBJECT) {
                i++;
                continue;
            } else if (b == JsonToken.END_ARRAY || b == JsonToken.END_OBJECT) {
                i--;
                continue;
            }
        } while (i != 0);
    }

    /* renamed from: i */
    public final boolean mo78306i(int i) {
        int i2;
        int i3 = this.f230114d;
        int i4 = this.f230113c;
        int i5 = i3 - i4;
        this.f230114d = i5;
        this.f230121m -= i4;
        byte[] bArr = this.f230119k;
        int length = bArr.length;
        if (i > length) {
            byte[] bArr2 = new byte[Math.max(i, length + length)];
            this.f230119k = bArr2;
            System.arraycopy(bArr, this.f230113c, bArr2, 0, this.f230114d);
        } else if (!(i5 == 0 || i4 == 0)) {
            System.arraycopy(bArr, i4, bArr, 0, i5);
        }
        this.f230113c = 0;
        do {
            InputStream inputStream = this.f230118j;
            byte[] bArr3 = this.f230119k;
            int i6 = this.f230114d;
            int read = inputStream.read(bArr3, i6, Math.min(bArr3.length - i6, 8192));
            if (read == -1) {
                return false;
            }
            i2 = this.f230114d + read;
            this.f230114d = i2;
        } while (i2 < i);
        return true;
    }

    /* renamed from: j */
    public final boolean mo78307j() {
        mo78299c();
        return (this.f230115e == JsonToken.END_OBJECT || this.f230115e == JsonToken.END_ARRAY) ? false : true;
    }

    /* renamed from: k */
    public final boolean mo78308k(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (this.f230119k[this.f230113c + i] != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo78309l() {
        /*
            r9 = this;
            com.google.android.apps.gsa.search.core.aj.q r0 = r9.mo78302e()
            com.google.android.apps.gsa.search.core.aj.au r1 = r9.f230117i
            byte[] r2 = r0.f230106a
            int r3 = r0.f230107b
            int r0 = r0.f230108c
            r4 = 512(0x200, float:7.175E-43)
            if (r0 <= r4) goto L_0x0015
            byte[] r0 = com.google.android.apps.gsa.search.core.p6513aj.C84536au.m135188c(r2, r3, r0)
            goto L_0x003f
        L_0x0015:
            int r4 = com.google.android.apps.gsa.search.core.p6513aj.C84536au.m135187b(r2, r3, r0)
            java.lang.Object[] r5 = r1.f230054a
            r5 = r5[r4]
            boolean r6 = r5 instanceof byte[]
            if (r6 == 0) goto L_0x0037
            byte[] r5 = (byte[]) r5
            int r6 = r5.length
            if (r6 == r0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            r6 = 0
        L_0x0028:
            if (r6 >= r0) goto L_0x0035
            int r7 = r3 + r6
            byte r7 = r2[r7]
            byte r8 = r5[r6]
            if (r7 != r8) goto L_0x0037
            int r6 = r6 + 1
            goto L_0x0028
        L_0x0035:
            r0 = r5
            goto L_0x003f
        L_0x0037:
            byte[] r0 = com.google.android.apps.gsa.search.core.p6513aj.C84536au.m135188c(r2, r3, r0)
            java.lang.Object[] r1 = r1.f230054a
            r1[r4] = r0
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6513aj.C84558r.mo78309l():byte[]");
    }

    @ProguardMustNotDelete
    public String nextName() {
        C84557q d = mo78301d();
        return this.f230117i.mo78244a(d.f230106a, d.f230107b, d.f230108c);
    }

    public final String toString() {
        int min = Math.min(this.f230113c, 20);
        int min2 = Math.min(this.f230114d - this.f230113c, 20);
        byte[] bArr = new byte[(min + min2)];
        System.arraycopy(this.f230119k, this.f230113c - min, bArr, 0, min);
        System.arraycopy(this.f230119k, this.f230113c, bArr, min, min2);
        return "JsonUtf8Reader near ".concat(new String(bArr));
    }
}
