package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alb */
/* compiled from: PG */
public class alb implements Closeable {

    /* renamed from: b */
    private static final char[] f20849b = ")]}'\n".toCharArray();

    /* renamed from: a */
    int f20850a = 0;

    /* renamed from: c */
    private final Reader f20851c;

    /* renamed from: d */
    private boolean f20852d = false;

    /* renamed from: e */
    private final char[] f20853e = new char[1024];

    /* renamed from: f */
    private int f20854f = 0;

    /* renamed from: g */
    private int f20855g = 0;

    /* renamed from: h */
    private int f20856h = 0;

    /* renamed from: i */
    private int f20857i = 0;

    /* renamed from: j */
    private long f20858j;

    /* renamed from: k */
    private int f20859k;

    /* renamed from: l */
    private String f20860l;

    /* renamed from: m */
    private int[] f20861m;

    /* renamed from: n */
    private int f20862n;

    /* renamed from: o */
    private String[] f20863o;

    /* renamed from: p */
    private int[] f20864p;

    static {
        aht.f20669a = new ala();
    }

    public alb(Reader reader) {
        int[] iArr = new int[32];
        this.f20861m = iArr;
        this.f20862n = 1;
        iArr[0] = 6;
        this.f20863o = new String[32];
        this.f20864p = new int[32];
        if (reader != null) {
            this.f20851c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: A */
    private final void m18872A() {
        if (!this.f20852d) {
            throw m18875D("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: B */
    private final void m18873B() {
        char c;
        do {
            if (this.f20854f < this.f20855g || m18881y(1)) {
                char[] cArr = this.f20853e;
                int i = this.f20854f;
                int i2 = i + 1;
                this.f20854f = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f20856h++;
                    this.f20857i = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: C */
    private final char m18874C() {
        int i;
        if (this.f20854f != this.f20855g || m18881y(1)) {
            char[] cArr = this.f20853e;
            int i2 = this.f20854f;
            int i3 = i2 + 1;
            this.f20854f = i3;
            char c = cArr[i2];
            if (c == 10) {
                this.f20856h++;
                this.f20857i = i3;
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
                    throw m18875D("Invalid escape sequence");
                } else if (i3 + 4 <= this.f20855g || m18881y(4)) {
                    int i4 = this.f20854f;
                    int i5 = i4 + 4;
                    char c2 = 0;
                    while (i4 < i5) {
                        char[] cArr2 = this.f20853e;
                        char c3 = cArr2[i4];
                        char c4 = (char) (c2 << 4);
                        if (c3 >= '0' && c3 <= '9') {
                            i = c3 - '0';
                        } else if (c3 >= 'a' && c3 <= 'f') {
                            i = c3 - 'W';
                        } else if (c3 < 'A' || c3 > 'F') {
                            throw new NumberFormatException("\\u".concat(new String(cArr2, this.f20854f, 4)));
                        } else {
                            i = c3 - '7';
                        }
                        c2 = (char) (c4 + i);
                        i4++;
                    }
                    this.f20854f += 4;
                    return c2;
                } else {
                    throw m18875D("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m18875D("Unterminated escape sequence");
    }

    /* renamed from: D */
    private final IOException m18875D(String str) {
        throw new ale(String.valueOf(str).concat(String.valueOf(mo14896t())));
    }

    /* renamed from: n */
    private final boolean m18876n(char c) {
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
        m18872A();
        return false;
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
        r9.f20854f = r2;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m18877u(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f20853e
            r1 = 0
        L_0x0003:
            int r2 = r9.f20854f
            int r3 = r9.f20855g
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
            r9.f20854f = r7
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
            r9.f20854f = r7
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
            char r2 = r9.m18874C()
            r1.append(r2)
            int r2 = r9.f20854f
            int r3 = r9.f20855g
            goto L_0x0007
        L_0x0050:
            r5 = 10
            if (r2 != r5) goto L_0x005b
            int r2 = r9.f20856h
            int r2 = r2 + r6
            r9.f20856h = r2
            r9.f20857i = r7
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
            r9.f20854f = r2
            boolean r2 = r9.m18881y(r6)
            if (r2 == 0) goto L_0x007a
            goto L_0x0003
        L_0x007a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m18875D(r10)
            goto L_0x0082
        L_0x0081:
            throw r10
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.alb.m18877u(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        m18872A();
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m18878v() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r5.f20854f
            int r3 = r3 + r2
            int r4 = r5.f20855g
            if (r3 >= r4) goto L_0x004c
            char[] r4 = r5.f20853e
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
            r5.m18872A()
            goto L_0x0058
        L_0x004c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L_0x005a
            int r3 = r2 + 1
            boolean r3 = r5.m18881y(r3)
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
            char[] r3 = r5.f20853e
            int r4 = r5.f20854f
            r0.append(r3, r4, r2)
            int r3 = r5.f20854f
            int r3 = r3 + r2
            r5.f20854f = r3
            r2 = 1
            boolean r2 = r5.m18881y(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007a:
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.f20853e
            int r3 = r5.f20854f
            r0.<init>(r2, r3, r1)
            goto L_0x0091
        L_0x0086:
            char[] r2 = r5.f20853e
            int r3 = r5.f20854f
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L_0x0091:
            int r2 = r5.f20854f
            int r2 = r2 + r1
            r5.f20854f = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.alb.m18878v():java.lang.String");
    }

    /* renamed from: w */
    private final void m18879w(char c) {
        char[] cArr = this.f20853e;
        do {
            int i = this.f20854f;
            int i2 = this.f20855g;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f20854f = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f20854f = i3;
                    m18874C();
                    i = this.f20854f;
                    i2 = this.f20855g;
                } else {
                    if (c2 == 10) {
                        this.f20856h++;
                        this.f20857i = i3;
                    }
                    i = i3;
                }
            }
            this.f20854f = i;
        } while (m18881y(1));
        throw m18875D("Unterminated string");
    }

    /* renamed from: x */
    private final void m18880x(int i) {
        int i2 = this.f20862n;
        int[] iArr = this.f20861m;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            String[] strArr = new String[i3];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f20864p, 0, iArr3, 0, this.f20862n);
            System.arraycopy(this.f20863o, 0, strArr, 0, this.f20862n);
            this.f20861m = iArr2;
            this.f20864p = iArr3;
            this.f20863o = strArr;
        }
        int[] iArr4 = this.f20861m;
        int i4 = this.f20862n;
        this.f20862n = i4 + 1;
        iArr4[i4] = i;
    }

    /* renamed from: y */
    private final boolean m18881y(int i) {
        int i2;
        char[] cArr = this.f20853e;
        int i3 = this.f20857i;
        int i4 = this.f20854f;
        this.f20857i = i3 - i4;
        int i5 = this.f20855g;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f20855g = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f20855g = 0;
        }
        this.f20854f = 0;
        do {
            Reader reader = this.f20851c;
            int i7 = this.f20855g;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.f20855g + read;
            this.f20855g = i2;
            if (this.f20856h == 0 && this.f20857i == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f20854f++;
                this.f20857i = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: z */
    private final int m18882z(boolean z) {
        char[] cArr = this.f20853e;
        int i = this.f20854f;
        int i2 = this.f20855g;
        while (true) {
            if (i == i2) {
                this.f20854f = i;
                if (m18881y(1)) {
                    i = this.f20854f;
                    i2 = this.f20855g;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input".concat(String.valueOf(mo14896t())));
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f20856h++;
                this.f20857i = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f20854f = i3;
                    if (i3 == i2) {
                        this.f20854f = i3 - 1;
                        boolean y = m18881y(2);
                        this.f20854f++;
                        if (!y) {
                            return 47;
                        }
                    }
                    m18872A();
                    int i4 = this.f20854f;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f20854f = i4 + 1;
                        while (true) {
                            if (this.f20854f + 2 <= this.f20855g || m18881y(2)) {
                                char[] cArr2 = this.f20853e;
                                int i5 = this.f20854f;
                                if (cArr2[i5] != 10) {
                                    int i6 = 0;
                                    while (i6 < 2) {
                                        if (this.f20853e[this.f20854f + i6] == "*/".charAt(i6)) {
                                            i6++;
                                        }
                                    }
                                    i = 2 + this.f20854f;
                                    i2 = this.f20855g;
                                    break;
                                }
                                this.f20856h++;
                                this.f20857i = i5 + 1;
                                this.f20854f++;
                            } else {
                                throw m18875D("Unterminated comment");
                            }
                        }
                    } else if (c2 != '/') {
                        return 47;
                    } else {
                        this.f20854f = i4 + 1;
                        m18873B();
                        i = this.f20854f;
                        i2 = this.f20855g;
                    }
                } else if (c == '#') {
                    this.f20854f = i3;
                    m18872A();
                    m18873B();
                    i = this.f20854f;
                    i2 = this.f20855g;
                } else {
                    this.f20854f = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: a */
    public void mo14822a() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 3) {
            m18880x(1);
            this.f20864p[this.f20862n - 1] = 0;
            this.f20850a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + alc.m18902a(mo14838p()) + mo14896t());
    }

    /* renamed from: b */
    public void mo14823b() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 4) {
            int i2 = this.f20862n - 1;
            this.f20862n = i2;
            int[] iArr = this.f20864p;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f20850a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + alc.m18902a(mo14838p()) + mo14896t());
    }

    /* renamed from: c */
    public void mo14824c() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 1) {
            m18880x(3);
            this.f20850a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + alc.m18902a(mo14838p()) + mo14896t());
    }

    public void close() {
        this.f20850a = 0;
        this.f20861m[0] = 8;
        this.f20862n = 1;
        this.f20851c.close();
    }

    /* renamed from: d */
    public void mo14826d() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 2) {
            int i2 = this.f20862n - 1;
            this.f20862n = i2;
            this.f20863o[i2] = null;
            int[] iArr = this.f20864p;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f20850a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + alc.m18902a(mo14838p()) + mo14896t());
    }

    /* renamed from: e */
    public boolean mo14827e() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: f */
    public String mo14828f() {
        String str;
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 14) {
            str = m18878v();
        } else if (i == 12) {
            str = m18877u('\'');
        } else if (i == 13) {
            str = m18877u('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + alc.m18902a(mo14838p()) + mo14896t());
        }
        this.f20850a = 0;
        this.f20863o[this.f20862n - 1] = str;
        return str;
    }

    /* renamed from: g */
    public String mo14829g() {
        String str;
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 10) {
            str = m18878v();
        } else if (i == 8) {
            str = m18877u('\'');
        } else if (i == 9) {
            str = m18877u('\"');
        } else if (i == 11) {
            str = this.f20860l;
            this.f20860l = null;
        } else if (i == 15) {
            str = Long.toString(this.f20858j);
        } else if (i == 16) {
            str = new String(this.f20853e, this.f20854f, this.f20859k);
            this.f20854f += this.f20859k;
        } else {
            throw new IllegalStateException("Expected a string but was " + alc.m18902a(mo14838p()) + mo14896t());
        }
        this.f20850a = 0;
        int[] iArr = this.f20864p;
        int i2 = this.f20862n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: h */
    public boolean mo14830h() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 5) {
            this.f20850a = 0;
            int[] iArr = this.f20864p;
            int i2 = this.f20862n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f20850a = 0;
            int[] iArr2 = this.f20864p;
            int i3 = this.f20862n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + alc.m18902a(mo14838p()) + mo14896t());
        }
    }

    /* renamed from: i */
    public void mo14831i() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 7) {
            this.f20850a = 0;
            int[] iArr = this.f20864p;
            int i2 = this.f20862n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + alc.m18902a(mo14838p()) + mo14896t());
    }

    /* renamed from: j */
    public double mo14832j() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 15) {
            this.f20850a = 0;
            int[] iArr = this.f20864p;
            int i2 = this.f20862n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f20858j;
        }
        if (i == 16) {
            char[] cArr = this.f20853e;
            int i3 = this.f20854f;
            int i4 = this.f20859k;
            this.f20860l = new String(cArr, i3, i4);
            this.f20854f = i3 + i4;
        } else if (i == 8 || i == 9) {
            this.f20860l = m18877u(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f20860l = m18878v();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + alc.m18902a(mo14838p()) + mo14896t());
        }
        this.f20850a = 11;
        double parseDouble = Double.parseDouble(this.f20860l);
        if (this.f20852d || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f20860l = null;
            this.f20850a = 0;
            int[] iArr2 = this.f20864p;
            int i5 = this.f20862n - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return parseDouble;
        }
        throw new ale("JSON forbids NaN and infinities: " + parseDouble + mo14896t());
    }

    /* renamed from: k */
    public long mo14833k() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 15) {
            this.f20850a = 0;
            int[] iArr = this.f20864p;
            int i2 = this.f20862n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f20858j;
        }
        if (i == 16) {
            char[] cArr = this.f20853e;
            int i3 = this.f20854f;
            int i4 = this.f20859k;
            this.f20860l = new String(cArr, i3, i4);
            this.f20854f = i3 + i4;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f20860l = m18878v();
            } else {
                this.f20860l = m18877u(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f20860l);
                this.f20850a = 0;
                int[] iArr2 = this.f20864p;
                int i5 = this.f20862n - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + alc.m18902a(mo14838p()) + mo14896t());
        }
        this.f20850a = 11;
        double parseDouble = Double.parseDouble(this.f20860l);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f20860l = null;
            this.f20850a = 0;
            int[] iArr3 = this.f20864p;
            int i6 = this.f20862n - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f20860l + mo14896t());
    }

    /* renamed from: l */
    public int mo14834l() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
        }
        if (i == 15) {
            long j = this.f20858j;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f20850a = 0;
                int[] iArr = this.f20864p;
                int i3 = this.f20862n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f20858j + mo14896t());
        }
        if (i == 16) {
            char[] cArr = this.f20853e;
            int i4 = this.f20854f;
            int i5 = this.f20859k;
            this.f20860l = new String(cArr, i4, i5);
            this.f20854f = i4 + i5;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f20860l = m18878v();
            } else {
                this.f20860l = m18877u(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f20860l);
                this.f20850a = 0;
                int[] iArr2 = this.f20864p;
                int i6 = this.f20862n - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + alc.m18902a(mo14838p()) + mo14896t());
        }
        this.f20850a = 11;
        double parseDouble = Double.parseDouble(this.f20860l);
        int i7 = (int) parseDouble;
        if (((double) i7) == parseDouble) {
            this.f20860l = null;
            this.f20850a = 0;
            int[] iArr3 = this.f20864p;
            int i8 = this.f20862n - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        }
        throw new NumberFormatException("Expected an int but was " + this.f20860l + mo14896t());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009d, code lost:
        m18872A();
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14835m() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r10.f20850a
            if (r2 != 0) goto L_0x000a
            int r2 = r10.mo14895s()
        L_0x000a:
            r3 = 3
            r4 = 1
            if (r2 != r3) goto L_0x0015
            r10.m18880x(r4)
        L_0x0011:
            int r1 = r1 + 1
            goto L_0x00af
        L_0x0015:
            if (r2 != r4) goto L_0x001b
            r10.m18880x(r3)
            goto L_0x0011
        L_0x001b:
            r3 = 4
            if (r2 != r3) goto L_0x0028
        L_0x001e:
            int r2 = r10.f20862n
            int r2 = r2 + -1
            r10.f20862n = r2
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
            int r2 = r10.f20854f
            int r3 = r10.f20859k
            int r2 = r2 + r3
            r10.f20854f = r2
            goto L_0x00af
        L_0x0053:
            r2 = 34
            r10.m18879w(r2)
            goto L_0x00af
        L_0x0059:
            r2 = 39
            r10.m18879w(r2)
            goto L_0x00af
        L_0x005f:
            r2 = 0
        L_0x0060:
            int r3 = r10.f20854f
            int r3 = r3 + r2
            int r9 = r10.f20855g
            if (r3 >= r9) goto L_0x00a6
            char[] r9 = r10.f20853e
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
            r10.m18872A()
        L_0x00a0:
            int r3 = r10.f20854f
            int r3 = r3 + r2
            r10.f20854f = r3
            goto L_0x00af
        L_0x00a6:
            r10.f20854f = r3
            boolean r2 = r10.m18881y(r4)
            if (r2 == 0) goto L_0x00af
            goto L_0x005f
        L_0x00af:
            r10.f20850a = r0
            if (r1 != 0) goto L_0x0002
            int[] r0 = r10.f20864p
            int r1 = r10.f20862n
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + r4
            r0[r1] = r2
            java.lang.String[] r0 = r10.f20863o
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.alb.mo14835m():void");
    }

    /* renamed from: o */
    public String mo14837o() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f20862n;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f20861m[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f20864p[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f20863o[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: p */
    public int mo14838p() {
        int i = this.f20850a;
        if (i == 0) {
            i = mo14895s();
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

    /* renamed from: q */
    public final void mo14893q(boolean z) {
        this.f20852d = z;
    }

    /* renamed from: r */
    public final boolean mo14894r() {
        return this.f20852d;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0206, code lost:
        if (m18876n(r6) == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x020a, code lost:
        if (r4 != 2) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x020c, code lost:
        if (r16 == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0212, code lost:
        if (r13 != Long.MIN_VALUE) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0214, code lost:
        if (r17 == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0216, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0218, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021e, code lost:
        if (r13 != 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0220, code lost:
        if (r8 != false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0223, code lost:
        if (r8 == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0226, code lost:
        r13 = -r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0227, code lost:
        r0.f20858j = r13;
        r0.f20854f += r7;
        r0.f20850a = 15;
        r6 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0235, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0236, code lost:
        if (r4 == 2) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0239, code lost:
        if (r4 == 4) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x023c, code lost:
        if (r4 != 7) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x023e, code lost:
        r0.f20859k = r7;
        r0.f20850a = 16;
        r6 = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0285 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x016f  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo14895s() {
        /*
            r20 = this;
            r0 = r20
            int[] r1 = r0.f20861m
            int r2 = r0.f20862n
            r3 = -1
            int r2 = r2 + r3
            r4 = r1[r2]
            r7 = 93
            r9 = 59
            r10 = 44
            r11 = 6
            r12 = 3
            r13 = 7
            r14 = 4
            r15 = 5
            r5 = 2
            r6 = 0
            r8 = 1
            if (r4 != r8) goto L_0x001e
            r1[r2] = r5
            goto L_0x00cc
        L_0x001e:
            if (r4 != r5) goto L_0x0039
            int r1 = r0.m18882z(r8)
            if (r1 == r10) goto L_0x00cc
            if (r1 == r9) goto L_0x0034
            if (r1 != r7) goto L_0x002d
            r0.f20850a = r14
            return r14
        L_0x002d:
            java.lang.String r1 = "Unterminated array"
            java.io.IOException r1 = r0.m18875D(r1)
            throw r1
        L_0x0034:
            r20.m18872A()
            goto L_0x00cc
        L_0x0039:
            if (r4 == r12) goto L_0x02c3
            if (r4 != r15) goto L_0x003f
            goto L_0x02c3
        L_0x003f:
            if (r4 != r14) goto L_0x0073
            r1[r2] = r15
            int r1 = r0.m18882z(r8)
            r2 = 58
            if (r1 == r2) goto L_0x00cc
            r2 = 61
            if (r1 != r2) goto L_0x006c
            r20.m18872A()
            int r1 = r0.f20854f
            int r2 = r0.f20855g
            if (r1 < r2) goto L_0x005e
            boolean r1 = r0.m18881y(r8)
            if (r1 == 0) goto L_0x00cc
        L_0x005e:
            char[] r1 = r0.f20853e
            int r2 = r0.f20854f
            char r1 = r1[r2]
            r14 = 62
            if (r1 != r14) goto L_0x00cc
            int r2 = r2 + r8
            r0.f20854f = r2
            goto L_0x00cc
        L_0x006c:
            java.lang.String r1 = "Expected ':'"
            java.io.IOException r1 = r0.m18875D(r1)
            throw r1
        L_0x0073:
            if (r4 != r11) goto L_0x00b2
            boolean r1 = r0.f20852d
            if (r1 == 0) goto L_0x00aa
            r0.m18882z(r8)
            int r1 = r0.f20854f
            int r1 = r1 + r3
            r0.f20854f = r1
            char[] r2 = f20849b
            int r2 = r2.length
            int r1 = r1 + r2
            int r14 = r0.f20855g
            if (r1 <= r14) goto L_0x0090
            boolean r1 = r0.m18881y(r2)
            if (r1 != 0) goto L_0x0090
            goto L_0x00aa
        L_0x0090:
            r1 = 0
        L_0x0091:
            char[] r2 = f20849b
            int r14 = r2.length
            if (r1 >= r14) goto L_0x00a5
            char[] r14 = r0.f20853e
            int r11 = r0.f20854f
            int r11 = r11 + r1
            char r11 = r14[r11]
            char r2 = r2[r1]
            if (r11 != r2) goto L_0x00aa
            int r1 = r1 + 1
            r11 = 6
            goto L_0x0091
        L_0x00a5:
            int r1 = r0.f20854f
            int r1 = r1 + r14
            r0.f20854f = r1
        L_0x00aa:
            int[] r1 = r0.f20861m
            int r2 = r0.f20862n
            int r2 = r2 + r3
            r1[r2] = r13
            goto L_0x00cc
        L_0x00b2:
            if (r4 != r13) goto L_0x00c8
            int r1 = r0.m18882z(r6)
            if (r1 != r3) goto L_0x00bf
            r1 = 17
            r0.f20850a = r1
            return r1
        L_0x00bf:
            r20.m18872A()
            int r1 = r0.f20854f
            int r1 = r1 + r3
            r0.f20854f = r1
            goto L_0x00cc
        L_0x00c8:
            r1 = 8
            if (r4 == r1) goto L_0x02bb
        L_0x00cc:
            int r1 = r0.m18882z(r8)
            r2 = 34
            if (r1 == r2) goto L_0x02b6
            r2 = 39
            if (r1 == r2) goto L_0x02ae
            if (r1 == r10) goto L_0x0295
            if (r1 == r9) goto L_0x0295
            r2 = 91
            if (r1 == r2) goto L_0x0292
            if (r1 == r7) goto L_0x028a
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0286
            int r1 = r0.f20854f
            int r1 = r1 + r3
            r0.f20854f = r1
            char[] r2 = r0.f20853e
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x0115
            r2 = 84
            if (r1 != r2) goto L_0x00f8
            goto L_0x0115
        L_0x00f8:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x010f
            r2 = 70
            if (r1 != r2) goto L_0x0101
            goto L_0x010f
        L_0x0101:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x0109
            r2 = 78
            if (r1 != r2) goto L_0x0164
        L_0x0109:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = 7
            goto L_0x011a
        L_0x010f:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = 6
            goto L_0x011a
        L_0x0115:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = 5
        L_0x011a:
            int r4 = r1.length()
            r7 = 1
        L_0x011f:
            if (r7 >= r4) goto L_0x0148
            int r9 = r0.f20854f
            int r9 = r9 + r7
            int r10 = r0.f20855g
            if (r9 < r10) goto L_0x0131
            int r9 = r7 + 1
            boolean r9 = r0.m18881y(r9)
            if (r9 != 0) goto L_0x0131
            goto L_0x0164
        L_0x0131:
            char[] r9 = r0.f20853e
            int r10 = r0.f20854f
            int r10 = r10 + r7
            char r9 = r9[r10]
            char r10 = r1.charAt(r7)
            if (r9 == r10) goto L_0x0145
            char r10 = r2.charAt(r7)
            if (r9 == r10) goto L_0x0145
            goto L_0x0164
        L_0x0145:
            int r7 = r7 + 1
            goto L_0x011f
        L_0x0148:
            int r1 = r0.f20854f
            int r1 = r1 + r4
            int r2 = r0.f20855g
            if (r1 < r2) goto L_0x0157
            int r1 = r4 + 1
            boolean r1 = r0.m18881y(r1)
            if (r1 == 0) goto L_0x0166
        L_0x0157:
            char[] r1 = r0.f20853e
            int r2 = r0.f20854f
            int r2 = r2 + r4
            char r1 = r1[r2]
            boolean r1 = r0.m18876n(r1)
            if (r1 == 0) goto L_0x0166
        L_0x0164:
            r3 = 0
            goto L_0x016d
        L_0x0166:
            int r1 = r0.f20854f
            int r1 = r1 + r4
            r0.f20854f = r1
            r0.f20850a = r3
        L_0x016d:
            if (r3 != 0) goto L_0x0285
            char[] r1 = r0.f20853e
            int r2 = r0.f20854f
            int r3 = r0.f20855g
            r9 = 0
            r13 = r9
            r4 = 0
            r7 = 0
            r16 = 1
            r17 = 0
        L_0x017e:
            int r6 = r2 + r7
            if (r6 != r3) goto L_0x0197
            r2 = 1024(0x400, float:1.435E-42)
            if (r7 != r2) goto L_0x0189
        L_0x0186:
            r6 = 0
            goto L_0x0267
        L_0x0189:
            int r2 = r7 + 1
            boolean r2 = r0.m18881y(r2)
            if (r2 != 0) goto L_0x0193
            goto L_0x020a
        L_0x0193:
            int r2 = r0.f20854f
            int r3 = r0.f20855g
        L_0x0197:
            int r6 = r2 + r7
            char r6 = r1[r6]
            r11 = 43
            if (r6 == r11) goto L_0x025e
            r11 = 69
            if (r6 == r11) goto L_0x0256
            r11 = 101(0x65, float:1.42E-43)
            if (r6 == r11) goto L_0x0256
            r11 = 45
            if (r6 == r11) goto L_0x024c
            r11 = 46
            if (r6 == r11) goto L_0x0247
            r11 = 48
            if (r6 < r11) goto L_0x0202
            r11 = 57
            if (r6 <= r11) goto L_0x01b8
            goto L_0x0202
        L_0x01b8:
            if (r4 == r8) goto L_0x01f8
            if (r4 != 0) goto L_0x01bd
            goto L_0x01f8
        L_0x01bd:
            if (r4 != r5) goto L_0x01ec
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x01c4
            goto L_0x0186
        L_0x01c4:
            r18 = 10
            long r18 = r18 * r13
            int r6 = r6 + -48
            long r8 = (long) r6
            long r18 = r18 - r8
            r8 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x01e6
            r8 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r6 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x01e4
            int r6 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x01e4
            goto L_0x01e6
        L_0x01e4:
            r6 = 0
            goto L_0x01e7
        L_0x01e6:
            r6 = 1
        L_0x01e7:
            r16 = r16 & r6
            r13 = r18
            goto L_0x01ef
        L_0x01ec:
            if (r4 != r12) goto L_0x01f1
            r4 = 4
        L_0x01ef:
            r8 = 6
            goto L_0x01fe
        L_0x01f1:
            r8 = 6
            if (r4 == r15) goto L_0x01f6
            if (r4 != r8) goto L_0x01fe
        L_0x01f6:
            r4 = 7
            goto L_0x01fe
        L_0x01f8:
            r8 = 6
            int r6 = r6 + -48
            int r4 = -r6
            long r13 = (long) r4
            r4 = 2
        L_0x01fe:
            r9 = 0
            goto L_0x0262
        L_0x0202:
            boolean r1 = r0.m18876n(r6)
            if (r1 == 0) goto L_0x020a
            goto L_0x0186
        L_0x020a:
            if (r4 != r5) goto L_0x0236
            if (r16 == 0) goto L_0x0235
            r1 = -9223372036854775808
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0218
            if (r17 == 0) goto L_0x0235
            r8 = 1
            goto L_0x021a
        L_0x0218:
            r8 = r17
        L_0x021a:
            r9 = 0
            int r1 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0223
            if (r8 != 0) goto L_0x0235
            goto L_0x0226
        L_0x0223:
            if (r8 == 0) goto L_0x0226
            goto L_0x0227
        L_0x0226:
            long r13 = -r13
        L_0x0227:
            r0.f20858j = r13
            int r1 = r0.f20854f
            int r1 = r1 + r7
            r0.f20854f = r1
            r1 = 15
            r0.f20850a = r1
            r6 = 15
            goto L_0x0267
        L_0x0235:
            r4 = 2
        L_0x0236:
            if (r4 == r5) goto L_0x023e
            r1 = 4
            if (r4 == r1) goto L_0x023e
            r1 = 7
            if (r4 != r1) goto L_0x0186
        L_0x023e:
            r0.f20859k = r7
            r1 = 16
            r0.f20850a = r1
            r6 = 16
            goto L_0x0267
        L_0x0247:
            r8 = 6
            if (r4 != r5) goto L_0x0186
            r4 = 3
            goto L_0x0262
        L_0x024c:
            r8 = 6
            if (r4 != 0) goto L_0x0253
            r4 = 1
            r17 = 1
            goto L_0x0262
        L_0x0253:
            if (r4 != r15) goto L_0x0186
            goto L_0x0261
        L_0x0256:
            r8 = 6
            if (r4 == r5) goto L_0x025c
            r6 = 4
            if (r4 != r6) goto L_0x0186
        L_0x025c:
            r4 = 5
            goto L_0x0262
        L_0x025e:
            r8 = 6
            if (r4 != r15) goto L_0x0186
        L_0x0261:
            r4 = 6
        L_0x0262:
            int r7 = r7 + 1
            r8 = 1
            goto L_0x017e
        L_0x0267:
            if (r6 == 0) goto L_0x026a
            return r6
        L_0x026a:
            char[] r1 = r0.f20853e
            int r2 = r0.f20854f
            char r1 = r1[r2]
            boolean r1 = r0.m18876n(r1)
            if (r1 == 0) goto L_0x027e
            r20.m18872A()
            r1 = 10
            r0.f20850a = r1
            return r1
        L_0x027e:
            java.lang.String r1 = "Expected value"
            java.io.IOException r1 = r0.m18875D(r1)
            throw r1
        L_0x0285:
            return r3
        L_0x0286:
            r1 = 1
            r0.f20850a = r1
            return r1
        L_0x028a:
            r1 = 1
            if (r4 == r1) goto L_0x028e
            goto L_0x0296
        L_0x028e:
            r2 = 4
            r0.f20850a = r2
            return r2
        L_0x0292:
            r0.f20850a = r12
            return r12
        L_0x0295:
            r1 = 1
        L_0x0296:
            if (r4 == r1) goto L_0x02a2
            if (r4 != r5) goto L_0x029b
            goto L_0x02a2
        L_0x029b:
            java.lang.String r1 = "Unexpected value"
            java.io.IOException r1 = r0.m18875D(r1)
            throw r1
        L_0x02a2:
            r20.m18872A()
            int r1 = r0.f20854f
            int r1 = r1 + r3
            r0.f20854f = r1
            r1 = 7
            r0.f20850a = r1
            return r1
        L_0x02ae:
            r20.m18872A()
            r1 = 8
            r0.f20850a = r1
            return r1
        L_0x02b6:
            r1 = 9
            r0.f20850a = r1
            return r1
        L_0x02bb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02c3:
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            if (r4 != r15) goto L_0x02e2
            r2 = 1
            int r6 = r0.m18882z(r2)
            if (r6 == r10) goto L_0x02e2
            if (r6 == r9) goto L_0x02df
            if (r6 != r1) goto L_0x02d8
            r0.f20850a = r5
            return r5
        L_0x02d8:
            java.lang.String r1 = "Unterminated object"
            java.io.IOException r1 = r0.m18875D(r1)
            throw r1
        L_0x02df:
            r20.m18872A()
        L_0x02e2:
            r2 = 1
            int r2 = r0.m18882z(r2)
            r6 = 34
            if (r2 == r6) goto L_0x031e
            r6 = 39
            if (r2 == r6) goto L_0x0316
            java.lang.String r6 = "Expected name"
            if (r2 == r1) goto L_0x030c
            r20.m18872A()
            int r1 = r0.f20854f
            int r1 = r1 + r3
            r0.f20854f = r1
            char r1 = (char) r2
            boolean r1 = r0.m18876n(r1)
            if (r1 == 0) goto L_0x0307
            r1 = 14
            r0.f20850a = r1
            return r1
        L_0x0307:
            java.io.IOException r1 = r0.m18875D(r6)
            throw r1
        L_0x030c:
            if (r4 == r15) goto L_0x0311
            r0.f20850a = r5
            return r5
        L_0x0311:
            java.io.IOException r1 = r0.m18875D(r6)
            throw r1
        L_0x0316:
            r20.m18872A()
            r1 = 12
            r0.f20850a = r1
            return r1
        L_0x031e:
            r1 = 13
            r0.f20850a = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.alb.mo14895s():int");
    }

    /* renamed from: t */
    public String mo14896t() {
        int i = this.f20856h;
        int i2 = this.f20854f;
        int i3 = this.f20857i;
        return " at line " + (i + 1) + " column " + ((i2 - i3) + 1) + " path " + mo14837o();
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(String.valueOf(mo14896t()));
    }
}
