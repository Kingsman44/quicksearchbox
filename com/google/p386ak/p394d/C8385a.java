package com.google.p386ak.p394d;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import p3186j$.util.Objects;

/* renamed from: com.google.ak.d.a */
/* compiled from: PG */
public final class C8385a implements Closeable {

    /* renamed from: a */
    public boolean f29216a = false;

    /* renamed from: b */
    public final char[] f29217b = new char[1024];

    /* renamed from: c */
    public int f29218c = 0;

    /* renamed from: d */
    public int f29219d = 0;

    /* renamed from: e */
    public long f29220e;

    /* renamed from: f */
    public int f29221f;

    /* renamed from: g */
    public String f29222g;

    /* renamed from: h */
    public int f29223h;

    /* renamed from: i */
    public int[] f29224i;

    /* renamed from: j */
    private final Reader f29225j;

    /* renamed from: k */
    private int f29226k = 0;

    /* renamed from: l */
    private int f29227l = 0;

    /* renamed from: m */
    private int f29228m = 0;

    /* renamed from: n */
    private int[] f29229n;

    /* renamed from: o */
    private String[] f29230o;

    public C8385a(Reader reader) {
        int[] iArr = new int[32];
        this.f29229n = iArr;
        this.f29223h = 1;
        iArr[0] = 6;
        this.f29230o = new String[32];
        this.f29224i = new int[32];
        this.f29225j = (Reader) Objects.requireNonNull(reader, "in == null");
    }

    /* renamed from: A */
    private final boolean m23170A(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m23174v();
        return false;
    }

    /* renamed from: s */
    private final char m23171s() {
        int i;
        if (this.f29218c != this.f29226k || m23178z(1)) {
            char[] cArr = this.f29217b;
            int i2 = this.f29218c;
            int i3 = i2 + 1;
            this.f29218c = i3;
            char c = cArr[i2];
            if (c == 10) {
                this.f29227l++;
                this.f29228m = i3;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw m23173u("Invalid escape sequence");
                } else if (i3 + 4 <= this.f29226k || m23178z(4)) {
                    int i4 = this.f29218c;
                    int i5 = i4 + 4;
                    char c2 = 0;
                    while (i4 < i5) {
                        char[] cArr2 = this.f29217b;
                        char c3 = cArr2[i4];
                        char c4 = (char) (c2 << 4);
                        if (c3 >= '0' && c3 <= '9') {
                            i = c3 - '0';
                        } else if (c3 >= 'a' && c3 <= 'f') {
                            i = c3 - 'W';
                        } else if (c3 < 'A' || c3 > 'F') {
                            throw new NumberFormatException("\\u".concat(new String(cArr2, this.f29218c, 4)));
                        } else {
                            i = c3 - '7';
                        }
                        c2 = (char) (c4 + i);
                        i4++;
                    }
                    this.f29218c += 4;
                    return c2;
                } else {
                    throw m23173u("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m23173u("Unterminated escape sequence");
    }

    /* renamed from: t */
    private final int m23172t(boolean z) {
        char[] cArr = this.f29217b;
        int i = this.f29218c;
        int i2 = this.f29226k;
        while (true) {
            if (i == i2) {
                this.f29218c = i;
                if (m23178z(1)) {
                    i = this.f29218c;
                    i2 = this.f29226k;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input".concat(mo17114e()));
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f29227l++;
                this.f29228m = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f29218c = i3;
                    if (i3 == i2) {
                        this.f29218c = i3 - 1;
                        boolean z2 = m23178z(2);
                        this.f29218c++;
                        if (!z2) {
                            return 47;
                        }
                    }
                    m23174v();
                    int i4 = this.f29218c;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f29218c = i4 + 1;
                        while (true) {
                            if (this.f29218c + 2 <= this.f29226k || m23178z(2)) {
                                char[] cArr2 = this.f29217b;
                                int i5 = this.f29218c;
                                if (cArr2[i5] != 10) {
                                    int i6 = 0;
                                    while (i6 < 2) {
                                        if (this.f29217b[this.f29218c + i6] == "*/".charAt(i6)) {
                                            i6++;
                                        }
                                    }
                                    i = 2 + this.f29218c;
                                    i2 = this.f29226k;
                                    break;
                                }
                                this.f29227l++;
                                this.f29228m = i5 + 1;
                                this.f29218c++;
                            } else {
                                throw m23173u("Unterminated comment");
                            }
                        }
                    } else if (c2 != '/') {
                        return 47;
                    } else {
                        this.f29218c = i4 + 1;
                        m23177y();
                        i = this.f29218c;
                        i2 = this.f29226k;
                    }
                } else if (c == '#') {
                    this.f29218c = i3;
                    m23174v();
                    m23177y();
                    i = this.f29218c;
                    i2 = this.f29226k;
                } else {
                    this.f29218c = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: u */
    private final IOException m23173u(String str) {
        throw new C8388d(str.concat(mo17114e()));
    }

    /* renamed from: v */
    private final void m23174v() {
        if (!this.f29216a) {
            throw m23173u("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: w */
    private final void m23175w(int i) {
        int i2 = this.f29223h;
        int[] iArr = this.f29229n;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.f29229n = Arrays.copyOf(iArr, i3);
            this.f29224i = Arrays.copyOf(this.f29224i, i3);
            this.f29230o = (String[]) Arrays.copyOf(this.f29230o, i3);
        }
        int[] iArr2 = this.f29229n;
        int i4 = this.f29223h;
        this.f29223h = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: x */
    private final void m23176x(char c) {
        char[] cArr = this.f29217b;
        do {
            int i = this.f29218c;
            int i2 = this.f29226k;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f29218c = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f29218c = i3;
                    m23171s();
                    i = this.f29218c;
                    i2 = this.f29226k;
                } else {
                    if (c2 == 10) {
                        this.f29227l++;
                        this.f29228m = i3;
                    }
                    i = i3;
                }
            }
            this.f29218c = i;
        } while (m23178z(1));
        throw m23173u("Unterminated string");
    }

    /* renamed from: y */
    private final void m23177y() {
        char c;
        do {
            if (this.f29218c < this.f29226k || m23178z(1)) {
                char[] cArr = this.f29217b;
                int i = this.f29218c;
                int i2 = i + 1;
                this.f29218c = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f29227l++;
                    this.f29228m = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: z */
    private final boolean m23178z(int i) {
        int i2;
        char[] cArr = this.f29217b;
        int i3 = this.f29228m;
        int i4 = this.f29218c;
        this.f29228m = i3 - i4;
        int i5 = this.f29226k;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f29226k = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f29226k = 0;
        }
        this.f29218c = 0;
        do {
            Reader reader = this.f29225j;
            int i7 = this.f29226k;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.f29226k + read;
            this.f29226k = i2;
            if (this.f29227l == 0 && this.f29228m == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f29218c++;
                this.f29228m = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: a */
    public final double mo17109a() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 15) {
            this.f29219d = 0;
            int[] iArr = this.f29224i;
            int i2 = this.f29223h - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f29220e;
        }
        if (i == 16) {
            char[] cArr = this.f29217b;
            int i3 = this.f29218c;
            int i4 = this.f29221f;
            this.f29222g = new String(cArr, i3, i4);
            this.f29218c = i3 + i4;
        } else if (i == 8 || i == 9) {
            this.f29222g = mo17116g(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f29222g = mo17118i();
        } else if (i != 11) {
            int r = mo17127r();
            throw new IllegalStateException("Expected a double but was " + C8386b.m23197a(r) + mo17114e());
        }
        this.f29219d = 11;
        double parseDouble = Double.parseDouble(this.f29222g);
        if (this.f29216a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f29222g = null;
            this.f29219d = 0;
            int[] iArr2 = this.f29224i;
            int i5 = this.f29223h - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return parseDouble;
        }
        throw new C8388d("JSON forbids NaN and infinities: " + parseDouble + mo17114e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x019f, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0220, code lost:
        if (m23170A(r1) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0224, code lost:
        if (r9 != 2) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0226, code lost:
        if (r15 == false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x022c, code lost:
        if (r11 != Long.MIN_VALUE) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x022e, code lost:
        if (r16 == false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0231, code lost:
        r14 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0237, code lost:
        if (r11 != 0) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0239, code lost:
        if (r14 != false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x023c, code lost:
        if (r14 == false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x023f, code lost:
        r11 = -r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0240, code lost:
        r0.f29220e = r11;
        r0.f29218c += r10;
        r0.f29219d = 15;
        r14 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x024e, code lost:
        r1 = 2;
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0250, code lost:
        if (r9 == r1) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0253, code lost:
        if (r9 == 4) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0256, code lost:
        if (r9 != 7) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0258, code lost:
        r0.f29221f = r10;
        r0.f29219d = 16;
        r14 = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo17110b() {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.f29229n
            int r2 = r0.f29223h
            r3 = -1
            int r2 = r2 + r3
            r4 = r1[r2]
            r6 = 10
            r8 = 39
            r9 = 93
            r10 = 59
            r11 = 44
            r12 = 6
            r13 = 3
            r15 = 4
            r5 = 5
            r7 = 2
            r14 = 1
            if (r4 != r14) goto L_0x0021
            r1[r2] = r7
        L_0x001e:
            r1 = 0
            goto L_0x00dd
        L_0x0021:
            if (r4 != r7) goto L_0x003b
            int r1 = r0.m23172t(r14)
            if (r1 == r11) goto L_0x001e
            if (r1 == r10) goto L_0x0037
            if (r1 != r9) goto L_0x0030
            r0.f29219d = r15
            return r15
        L_0x0030:
            java.lang.String r1 = "Unterminated array"
            java.io.IOException r1 = r0.m23173u(r1)
            throw r1
        L_0x0037:
            r19.m23174v()
            goto L_0x001e
        L_0x003b:
            r7 = 125(0x7d, float:1.75E-43)
            if (r4 == r13) goto L_0x02df
            if (r4 != r5) goto L_0x0043
            goto L_0x02df
        L_0x0043:
            if (r4 != r15) goto L_0x0077
            r1[r2] = r5
            int r1 = r0.m23172t(r14)
            r2 = 58
            if (r1 == r2) goto L_0x001e
            r2 = 61
            if (r1 != r2) goto L_0x0070
            r19.m23174v()
            int r1 = r0.f29218c
            int r2 = r0.f29226k
            if (r1 < r2) goto L_0x0062
            boolean r1 = r0.m23178z(r14)
            if (r1 == 0) goto L_0x001e
        L_0x0062:
            char[] r1 = r0.f29217b
            int r2 = r0.f29218c
            char r1 = r1[r2]
            r7 = 62
            if (r1 != r7) goto L_0x001e
            int r2 = r2 + r14
            r0.f29218c = r2
            goto L_0x001e
        L_0x0070:
            java.lang.String r1 = "Expected ':'"
            java.io.IOException r1 = r0.m23173u(r1)
            throw r1
        L_0x0077:
            if (r4 != r12) goto L_0x00c0
            boolean r1 = r0.f29216a
            if (r1 == 0) goto L_0x00b6
            r0.m23172t(r14)
            int r1 = r0.f29218c
            int r1 = r1 + r3
            r0.f29218c = r1
            int r1 = r1 + r5
            int r2 = r0.f29226k
            if (r1 <= r2) goto L_0x0091
            boolean r1 = r0.m23178z(r5)
            if (r1 != 0) goto L_0x0091
            goto L_0x00b6
        L_0x0091:
            int r1 = r0.f29218c
            char[] r2 = r0.f29217b
            char r15 = r2[r1]
            r12 = 41
            if (r15 != r12) goto L_0x00b6
            int r12 = r1 + 1
            char r12 = r2[r12]
            if (r12 != r9) goto L_0x00b6
            int r12 = r1 + 2
            char r12 = r2[r12]
            if (r12 != r7) goto L_0x00b6
            int r7 = r1 + 3
            char r7 = r2[r7]
            if (r7 != r8) goto L_0x00b6
            int r7 = r1 + 4
            char r2 = r2[r7]
            if (r2 != r6) goto L_0x00b6
            int r1 = r1 + r5
            r0.f29218c = r1
        L_0x00b6:
            int[] r1 = r0.f29229n
            int r2 = r0.f29223h
            int r2 = r2 + r3
            r7 = 7
            r1[r2] = r7
            goto L_0x001e
        L_0x00c0:
            r7 = 7
            if (r4 != r7) goto L_0x00d8
            r1 = 0
            int r2 = r0.m23172t(r1)
            if (r2 != r3) goto L_0x00cf
            r1 = 17
            r0.f29219d = r1
            return r1
        L_0x00cf:
            r19.m23174v()
            int r2 = r0.f29218c
            int r2 = r2 + r3
            r0.f29218c = r2
            goto L_0x00dd
        L_0x00d8:
            r1 = 0
            r2 = 8
            if (r4 == r2) goto L_0x02d7
        L_0x00dd:
            int r2 = r0.m23172t(r14)
            r7 = 34
            if (r2 == r7) goto L_0x02d2
            if (r2 == r8) goto L_0x02ca
            if (r2 == r11) goto L_0x02b1
            if (r2 == r10) goto L_0x02b1
            r7 = 91
            if (r2 == r7) goto L_0x02ae
            if (r2 == r9) goto L_0x02a7
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L_0x02a4
            int r2 = r0.f29218c
            int r2 = r2 + r3
            r0.f29218c = r2
            char[] r3 = r0.f29217b
            char r2 = r3[r2]
            r3 = 116(0x74, float:1.63E-43)
            if (r2 == r3) goto L_0x0124
            r3 = 84
            if (r2 != r3) goto L_0x0107
            goto L_0x0124
        L_0x0107:
            r3 = 102(0x66, float:1.43E-43)
            if (r2 == r3) goto L_0x011e
            r3 = 70
            if (r2 != r3) goto L_0x0110
            goto L_0x011e
        L_0x0110:
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x0118
            r3 = 78
            if (r2 != r3) goto L_0x0173
        L_0x0118:
            java.lang.String r2 = "null"
            java.lang.String r3 = "NULL"
            r4 = 7
            goto L_0x0129
        L_0x011e:
            java.lang.String r2 = "false"
            java.lang.String r3 = "FALSE"
            r4 = 6
            goto L_0x0129
        L_0x0124:
            java.lang.String r2 = "true"
            java.lang.String r3 = "TRUE"
            r4 = 5
        L_0x0129:
            int r7 = r2.length()
            r8 = 1
        L_0x012e:
            if (r8 >= r7) goto L_0x0157
            int r9 = r0.f29218c
            int r9 = r9 + r8
            int r10 = r0.f29226k
            if (r9 < r10) goto L_0x0140
            int r9 = r8 + 1
            boolean r9 = r0.m23178z(r9)
            if (r9 != 0) goto L_0x0140
            goto L_0x0173
        L_0x0140:
            char[] r9 = r0.f29217b
            int r10 = r0.f29218c
            int r10 = r10 + r8
            char r9 = r9[r10]
            char r10 = r2.charAt(r8)
            if (r9 == r10) goto L_0x0154
            char r10 = r3.charAt(r8)
            if (r9 == r10) goto L_0x0154
            goto L_0x0173
        L_0x0154:
            int r8 = r8 + 1
            goto L_0x012e
        L_0x0157:
            int r2 = r0.f29218c
            int r2 = r2 + r7
            int r3 = r0.f29226k
            if (r2 < r3) goto L_0x0166
            int r2 = r7 + 1
            boolean r2 = r0.m23178z(r2)
            if (r2 == 0) goto L_0x0175
        L_0x0166:
            char[] r2 = r0.f29217b
            int r3 = r0.f29218c
            int r3 = r3 + r7
            char r2 = r2[r3]
            boolean r2 = r0.m23170A(r2)
            if (r2 == 0) goto L_0x0175
        L_0x0173:
            r4 = 0
            goto L_0x017c
        L_0x0175:
            int r2 = r0.f29218c
            int r2 = r2 + r7
            r0.f29218c = r2
            r0.f29219d = r4
        L_0x017c:
            if (r4 != 0) goto L_0x02a3
            char[] r2 = r0.f29217b
            int r3 = r0.f29218c
            int r4 = r0.f29226k
            r7 = 0
            r11 = r7
            r9 = 0
            r10 = 0
            r15 = 1
            r16 = 0
        L_0x018c:
            int r1 = r3 + r10
            if (r1 != r4) goto L_0x01a8
            r1 = 1024(0x400, float:1.435E-42)
            if (r10 != r1) goto L_0x0197
        L_0x0194:
            r14 = 0
            goto L_0x0285
        L_0x0197:
            int r1 = r10 + 1
            boolean r1 = r0.m23178z(r1)
            if (r1 != 0) goto L_0x01a2
        L_0x019f:
            r1 = 2
            goto L_0x0224
        L_0x01a2:
            int r1 = r0.f29218c
            int r3 = r0.f29226k
            r4 = r3
            r3 = r1
        L_0x01a8:
            int r1 = r3 + r10
            char r1 = r2[r1]
            r6 = 43
            if (r1 == r6) goto L_0x027b
            r6 = 69
            if (r1 == r6) goto L_0x0272
            r6 = 101(0x65, float:1.42E-43)
            if (r1 == r6) goto L_0x0272
            r6 = 45
            if (r1 == r6) goto L_0x0267
            r6 = 46
            if (r1 == r6) goto L_0x0261
            r6 = 48
            if (r1 < r6) goto L_0x021c
            r6 = 57
            if (r1 <= r6) goto L_0x01c9
            goto L_0x021c
        L_0x01c9:
            if (r9 == r14) goto L_0x0212
            if (r9 != 0) goto L_0x01ce
            goto L_0x0212
        L_0x01ce:
            r6 = 2
            if (r9 != r6) goto L_0x0201
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01d6
            goto L_0x0194
        L_0x01d6:
            r17 = 10
            long r17 = r17 * r11
            int r1 = r1 + -48
            long r7 = (long) r1
            long r17 = r17 - r7
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x01f8
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x01f6
            int r1 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r1 = 0
            goto L_0x01f9
        L_0x01f8:
            r1 = 1
        L_0x01f9:
            r15 = r15 & r1
            r11 = r17
            r6 = 6
            r7 = 0
            goto L_0x027f
        L_0x0201:
            r6 = 6
            if (r9 != r13) goto L_0x0209
            r7 = 0
            r9 = 4
            goto L_0x027f
        L_0x0209:
            r7 = 0
            if (r9 == r5) goto L_0x020f
            if (r9 != r6) goto L_0x027f
        L_0x020f:
            r9 = 7
            goto L_0x027f
        L_0x0212:
            r6 = 6
            int r1 = r1 + -48
            int r1 = -r1
            long r11 = (long) r1
            r7 = 0
            r9 = 2
            goto L_0x027f
        L_0x021c:
            boolean r1 = r0.m23170A(r1)
            if (r1 == 0) goto L_0x019f
            goto L_0x0194
        L_0x0224:
            if (r9 != r1) goto L_0x0250
            if (r15 == 0) goto L_0x024e
            r1 = -9223372036854775808
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0231
            if (r16 == 0) goto L_0x024e
            goto L_0x0233
        L_0x0231:
            r14 = r16
        L_0x0233:
            r7 = 0
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x023c
            if (r14 != 0) goto L_0x024e
            goto L_0x023f
        L_0x023c:
            if (r14 == 0) goto L_0x023f
            goto L_0x0240
        L_0x023f:
            long r11 = -r11
        L_0x0240:
            r0.f29220e = r11
            int r1 = r0.f29218c
            int r1 = r1 + r10
            r0.f29218c = r1
            r1 = 15
            r0.f29219d = r1
            r14 = 15
            goto L_0x0285
        L_0x024e:
            r1 = 2
            r9 = 2
        L_0x0250:
            if (r9 == r1) goto L_0x0258
            r1 = 4
            if (r9 == r1) goto L_0x0258
            r1 = 7
            if (r9 != r1) goto L_0x0194
        L_0x0258:
            r0.f29221f = r10
            r1 = 16
            r0.f29219d = r1
            r14 = 16
            goto L_0x0285
        L_0x0261:
            r1 = 2
            r6 = 6
            if (r9 != r1) goto L_0x0194
            r9 = 3
            goto L_0x027f
        L_0x0267:
            r1 = 2
            r6 = 6
            if (r9 != 0) goto L_0x026f
            r9 = 1
            r16 = 1
            goto L_0x027f
        L_0x026f:
            if (r9 != r5) goto L_0x0194
            goto L_0x027e
        L_0x0272:
            r1 = 2
            r6 = 6
            if (r9 == r1) goto L_0x0279
            r1 = 4
            if (r9 != r1) goto L_0x0194
        L_0x0279:
            r9 = 5
            goto L_0x027f
        L_0x027b:
            r6 = 6
            if (r9 != r5) goto L_0x0194
        L_0x027e:
            r9 = 6
        L_0x027f:
            int r10 = r10 + 1
            r6 = 10
            goto L_0x018c
        L_0x0285:
            if (r14 == 0) goto L_0x0288
            return r14
        L_0x0288:
            char[] r1 = r0.f29217b
            int r2 = r0.f29218c
            char r1 = r1[r2]
            boolean r1 = r0.m23170A(r1)
            if (r1 == 0) goto L_0x029c
            r19.m23174v()
            r1 = 10
            r0.f29219d = r1
            return r1
        L_0x029c:
            java.lang.String r1 = "Expected value"
            java.io.IOException r1 = r0.m23173u(r1)
            throw r1
        L_0x02a3:
            return r4
        L_0x02a4:
            r0.f29219d = r14
            return r14
        L_0x02a7:
            if (r4 == r14) goto L_0x02aa
            goto L_0x02b1
        L_0x02aa:
            r1 = 4
            r0.f29219d = r1
            return r1
        L_0x02ae:
            r0.f29219d = r13
            return r13
        L_0x02b1:
            if (r4 == r14) goto L_0x02be
            r1 = 2
            if (r4 != r1) goto L_0x02b7
            goto L_0x02be
        L_0x02b7:
            java.lang.String r1 = "Unexpected value"
            java.io.IOException r1 = r0.m23173u(r1)
            throw r1
        L_0x02be:
            r19.m23174v()
            int r1 = r0.f29218c
            int r1 = r1 + r3
            r0.f29218c = r1
            r1 = 7
            r0.f29219d = r1
            return r1
        L_0x02ca:
            r19.m23174v()
            r1 = 8
            r0.f29219d = r1
            return r1
        L_0x02d2:
            r1 = 9
            r0.f29219d = r1
            return r1
        L_0x02d7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02df:
            r6 = 4
            r1[r2] = r6
            if (r4 != r5) goto L_0x02fc
            int r1 = r0.m23172t(r14)
            if (r1 == r11) goto L_0x02fc
            if (r1 == r10) goto L_0x02f9
            if (r1 != r7) goto L_0x02f2
            r1 = 2
            r0.f29219d = r1
            return r1
        L_0x02f2:
            java.lang.String r1 = "Unterminated object"
            java.io.IOException r1 = r0.m23173u(r1)
            throw r1
        L_0x02f9:
            r19.m23174v()
        L_0x02fc:
            int r1 = r0.m23172t(r14)
            r2 = 34
            if (r1 == r2) goto L_0x0336
            if (r1 == r8) goto L_0x032e
            java.lang.String r2 = "Expected name"
            if (r1 == r7) goto L_0x0323
            r19.m23174v()
            int r4 = r0.f29218c
            int r4 = r4 + r3
            r0.f29218c = r4
            char r1 = (char) r1
            boolean r1 = r0.m23170A(r1)
            if (r1 == 0) goto L_0x031e
            r1 = 14
            r0.f29219d = r1
            return r1
        L_0x031e:
            java.io.IOException r1 = r0.m23173u(r2)
            throw r1
        L_0x0323:
            if (r4 == r5) goto L_0x0329
            r1 = 2
            r0.f29219d = r1
            return r1
        L_0x0329:
            java.io.IOException r1 = r0.m23173u(r2)
            throw r1
        L_0x032e:
            r19.m23174v()
            r1 = 12
            r0.f29219d = r1
            return r1
        L_0x0336:
            r1 = 13
            r0.f29219d = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p394d.C8385a.mo17110b():int");
    }

    /* renamed from: c */
    public final int mo17111c() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 15) {
            long j = this.f29220e;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f29219d = 0;
                int[] iArr = this.f29224i;
                int i3 = this.f29223h - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + j + mo17114e());
        }
        if (i == 16) {
            char[] cArr = this.f29217b;
            int i4 = this.f29218c;
            int i5 = this.f29221f;
            this.f29222g = new String(cArr, i4, i5);
            this.f29218c = i4 + i5;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f29222g = mo17118i();
            } else {
                this.f29222g = mo17116g(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f29222g);
                this.f29219d = 0;
                int[] iArr2 = this.f29224i;
                int i6 = this.f29223h - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            int r = mo17127r();
            throw new IllegalStateException("Expected an int but was " + C8386b.m23197a(r) + mo17114e());
        }
        this.f29219d = 11;
        double parseDouble = Double.parseDouble(this.f29222g);
        int i7 = (int) parseDouble;
        if (((double) i7) == parseDouble) {
            this.f29222g = null;
            this.f29219d = 0;
            int[] iArr3 = this.f29224i;
            int i8 = this.f29223h - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        }
        throw new NumberFormatException("Expected an int but was " + this.f29222g + mo17114e());
    }

    public final void close() {
        this.f29219d = 0;
        this.f29229n[0] = 8;
        this.f29223h = 1;
        this.f29225j.close();
    }

    /* renamed from: d */
    public final String mo17113d(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f29223h;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f29229n[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.f29224i[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f29230o[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    /* renamed from: e */
    public final String mo17114e() {
        int i = this.f29227l;
        int i2 = this.f29218c;
        int i3 = this.f29228m;
        String d = mo17113d(false);
        return " at line " + (i + 1) + " column " + ((i2 - i3) + 1) + " path " + d;
    }

    /* renamed from: f */
    public final String mo17115f() {
        String str;
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 14) {
            str = mo17118i();
        } else if (i == 12) {
            str = mo17116g('\'');
        } else if (i == 13) {
            str = mo17116g('\"');
        } else {
            int r = mo17127r();
            String e = mo17114e();
            throw new IllegalStateException("Expected a name but was " + C8386b.m23197a(r) + e);
        }
        this.f29219d = 0;
        this.f29230o[this.f29223h - 1] = str;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f29218c = r2;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo17116g(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f29217b
            r1 = 0
        L_0x0003:
            int r2 = r9.f29218c
            int r3 = r9.f29226k
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005d
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0029
            r9.f29218c = r7
            int r7 = r7 - r3
            int r7 = r7 + -1
            if (r1 != 0) goto L_0x0021
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0021:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0029:
            r8 = 92
            if (r2 != r8) goto L_0x0050
            r9.f29218c = r7
            int r7 = r7 - r3
            int r7 = r7 + -1
            if (r1 != 0) goto L_0x0041
            int r1 = r7 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x0041:
            r1.append(r0, r3, r7)
            char r2 = r9.m23171s()
            r1.append(r2)
            int r2 = r9.f29218c
            int r3 = r9.f29226k
            goto L_0x0007
        L_0x0050:
            r5 = 10
            if (r2 != r5) goto L_0x005b
            int r2 = r9.f29227l
            int r2 = r2 + r6
            r9.f29227l = r2
            r9.f29228m = r7
        L_0x005b:
            r2 = r7
            goto L_0x0009
        L_0x005d:
            if (r1 != 0) goto L_0x006c
            int r1 = r2 - r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f29218c = r2
            boolean r2 = r9.m23178z(r6)
            if (r2 == 0) goto L_0x007a
            goto L_0x0003
        L_0x007a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m23173u(r10)
            goto L_0x0082
        L_0x0081:
            throw r10
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p394d.C8385a.mo17116g(char):java.lang.String");
    }

    /* renamed from: h */
    public final String mo17117h() {
        String str;
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 10) {
            str = mo17118i();
        } else if (i == 8) {
            str = mo17116g('\'');
        } else if (i == 9) {
            str = mo17116g('\"');
        } else if (i == 11) {
            str = this.f29222g;
            this.f29222g = null;
        } else if (i == 15) {
            str = Long.toString(this.f29220e);
        } else if (i == 16) {
            str = new String(this.f29217b, this.f29218c, this.f29221f);
            this.f29218c += this.f29221f;
        } else {
            int r = mo17127r();
            throw new IllegalStateException("Expected a string but was " + C8386b.m23197a(r) + mo17114e());
        }
        this.f29219d = 0;
        int[] iArr = this.f29224i;
        int i2 = this.f29223h - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        m23174v();
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo17118i() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r5.f29218c
            int r3 = r3 + r2
            int r4 = r5.f29226k
            if (r3 >= r4) goto L_0x004c
            char[] r4 = r5.f29217b
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x0058
            r4 = 10
            if (r3 == r4) goto L_0x0058
            r4 = 12
            if (r3 == r4) goto L_0x0058
            r4 = 13
            if (r3 == r4) goto L_0x0058
            r4 = 32
            if (r3 == r4) goto L_0x0058
            r4 = 35
            if (r3 == r4) goto L_0x0048
            r4 = 44
            if (r3 == r4) goto L_0x0058
            r4 = 47
            if (r3 == r4) goto L_0x0048
            r4 = 61
            if (r3 == r4) goto L_0x0048
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x0058
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x0058
            r4 = 58
            if (r3 == r4) goto L_0x0058
            r4 = 59
            if (r3 == r4) goto L_0x0048
            switch(r3) {
                case 91: goto L_0x0058;
                case 92: goto L_0x0048;
                case 93: goto L_0x0058;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0048:
            r5.m23174v()
            goto L_0x0058
        L_0x004c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L_0x005a
            int r3 = r2 + 1
            boolean r3 = r5.m23178z(r3)
            if (r3 != 0) goto L_0x0003
        L_0x0058:
            r1 = r2
            goto L_0x007a
        L_0x005a:
            if (r0 != 0) goto L_0x0067
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x0067:
            char[] r3 = r5.f29217b
            int r4 = r5.f29218c
            r0.append(r3, r4, r2)
            int r3 = r5.f29218c
            int r3 = r3 + r2
            r5.f29218c = r3
            r2 = 1
            boolean r2 = r5.m23178z(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007a:
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.f29217b
            int r3 = r5.f29218c
            r0.<init>(r2, r3, r1)
            goto L_0x0091
        L_0x0086:
            char[] r2 = r5.f29217b
            int r3 = r5.f29218c
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0091:
            int r2 = r5.f29218c
            int r2 = r2 + r1
            r5.f29218c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p394d.C8385a.mo17118i():java.lang.String");
    }

    /* renamed from: j */
    public final void mo17119j() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 3) {
            m23175w(1);
            this.f29224i[this.f29223h - 1] = 0;
            this.f29219d = 0;
            return;
        }
        int r = mo17127r();
        String e = mo17114e();
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + C8386b.m23197a(r) + e);
    }

    /* renamed from: k */
    public final void mo17120k() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 1) {
            m23175w(3);
            this.f29219d = 0;
            return;
        }
        int r = mo17127r();
        String e = mo17114e();
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + C8386b.m23197a(r) + e);
    }

    /* renamed from: l */
    public final void mo17121l() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 4) {
            int i2 = this.f29223h - 1;
            this.f29223h = i2;
            int[] iArr = this.f29224i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f29219d = 0;
            return;
        }
        int r = mo17127r();
        throw new IllegalStateException("Expected END_ARRAY but was " + C8386b.m23197a(r) + mo17114e());
    }

    /* renamed from: m */
    public final void mo17122m() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 2) {
            int i2 = this.f29223h - 1;
            this.f29223h = i2;
            this.f29230o[i2] = null;
            int[] iArr = this.f29224i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f29219d = 0;
            return;
        }
        int r = mo17127r();
        throw new IllegalStateException("Expected END_OBJECT but was " + C8386b.m23197a(r) + mo17114e());
    }

    /* renamed from: n */
    public final void mo17123n() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 7) {
            this.f29219d = 0;
            int[] iArr = this.f29224i;
            int i2 = this.f29223h - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        int r = mo17127r();
        throw new IllegalStateException("Expected null but was " + C8386b.m23197a(r) + mo17114e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009d, code lost:
        m23174v();
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17124o() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r10.f29219d
            if (r2 != 0) goto L_0x000a
            int r2 = r10.mo17110b()
        L_0x000a:
            r3 = 3
            r4 = 1
            if (r2 != r3) goto L_0x0015
            r10.m23175w(r4)
        L_0x0011:
            int r1 = r1 + 1
            goto L_0x00af
        L_0x0015:
            if (r2 != r4) goto L_0x001b
            r10.m23175w(r3)
            goto L_0x0011
        L_0x001b:
            r3 = 4
            if (r2 != r3) goto L_0x0028
        L_0x001e:
            int r2 = r10.f29223h
            int r2 = r2 + -1
            r10.f29223h = r2
            int r1 = r1 + -1
            goto L_0x00af
        L_0x0028:
            r3 = 2
            if (r2 != r3) goto L_0x002c
            goto L_0x001e
        L_0x002c:
            r3 = 14
            r5 = 13
            r6 = 12
            r7 = 9
            r8 = 10
            if (r2 == r3) goto L_0x005f
            if (r2 != r8) goto L_0x003b
            goto L_0x005f
        L_0x003b:
            r3 = 8
            if (r2 == r3) goto L_0x0059
            if (r2 != r6) goto L_0x0042
            goto L_0x0059
        L_0x0042:
            if (r2 == r7) goto L_0x0053
            if (r2 != r5) goto L_0x0047
            goto L_0x0053
        L_0x0047:
            r3 = 16
            if (r2 != r3) goto L_0x00af
            int r2 = r10.f29218c
            int r3 = r10.f29221f
            int r2 = r2 + r3
            r10.f29218c = r2
            goto L_0x00af
        L_0x0053:
            r2 = 34
            r10.m23176x(r2)
            goto L_0x00af
        L_0x0059:
            r2 = 39
            r10.m23176x(r2)
            goto L_0x00af
        L_0x005f:
            r2 = 0
        L_0x0060:
            int r3 = r10.f29218c
            int r3 = r3 + r2
            int r9 = r10.f29226k
            if (r3 >= r9) goto L_0x00a6
            char[] r9 = r10.f29217b
            char r3 = r9[r3]
            if (r3 == r7) goto L_0x00a0
            if (r3 == r8) goto L_0x00a0
            if (r3 == r6) goto L_0x00a0
            if (r3 == r5) goto L_0x00a0
            r9 = 32
            if (r3 == r9) goto L_0x00a0
            r9 = 35
            if (r3 == r9) goto L_0x009d
            r9 = 44
            if (r3 == r9) goto L_0x00a0
            r9 = 47
            if (r3 == r9) goto L_0x009d
            r9 = 61
            if (r3 == r9) goto L_0x009d
            r9 = 123(0x7b, float:1.72E-43)
            if (r3 == r9) goto L_0x00a0
            r9 = 125(0x7d, float:1.75E-43)
            if (r3 == r9) goto L_0x00a0
            r9 = 58
            if (r3 == r9) goto L_0x00a0
            r9 = 59
            if (r3 == r9) goto L_0x009d
            switch(r3) {
                case 91: goto L_0x00a0;
                case 92: goto L_0x009d;
                case 93: goto L_0x00a0;
                default: goto L_0x009a;
            }
        L_0x009a:
            int r2 = r2 + 1
            goto L_0x0060
        L_0x009d:
            r10.m23174v()
        L_0x00a0:
            int r3 = r10.f29218c
            int r3 = r3 + r2
            r10.f29218c = r3
            goto L_0x00af
        L_0x00a6:
            r10.f29218c = r3
            boolean r2 = r10.m23178z(r4)
            if (r2 == 0) goto L_0x00af
            goto L_0x005f
        L_0x00af:
            r10.f29219d = r0
            if (r1 != 0) goto L_0x0002
            int[] r0 = r10.f29224i
            int r1 = r10.f29223h
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + r4
            r0[r1] = r2
            java.lang.String[] r0 = r10.f29230o
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p394d.C8385a.mo17124o():void");
    }

    /* renamed from: p */
    public final boolean mo17125p() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    /* renamed from: q */
    public final boolean mo17126q() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        if (i == 5) {
            this.f29219d = 0;
            int[] iArr = this.f29224i;
            int i2 = this.f29223h - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f29219d = 0;
            int[] iArr2 = this.f29224i;
            int i3 = this.f29223h - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            int r = mo17127r();
            throw new IllegalStateException("Expected a boolean but was " + C8386b.m23197a(r) + mo17114e());
        }
    }

    /* renamed from: r */
    public final int mo17127r() {
        int i = this.f29219d;
        if (i == 0) {
            i = mo17110b();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(mo17114e());
    }
}
