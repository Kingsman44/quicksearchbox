package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.p4533e.C59077e;

/* renamed from: com.google.common.f.b.c */
/* compiled from: PG */
public final class C59028c {

    /* renamed from: a */
    public static final C59028c f156940a = new C59028c(0, -1, -1);

    /* renamed from: e */
    private static final long f156941e;

    /* renamed from: b */
    public final int f156942b;

    /* renamed from: c */
    public final int f156943c;

    /* renamed from: d */
    public final int f156944d;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        f156941e = j;
    }

    public C59028c(int i, int i2, int i3) {
        this.f156942b = i;
        this.f156943c = i2;
        this.f156944d = i3;
    }

    /* renamed from: a */
    static int m91263a(String str, boolean z) {
        int i = 0;
        int i2 = true != z ? 0 : 128;
        while (i < str.length()) {
            int g = m91265g(str.charAt(i));
            if (g >= 0) {
                i2 |= 1 << g;
                i++;
            } else {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
        }
        return i2;
    }

    /* renamed from: g */
    private static int m91265g(char c) {
        return ((int) ((f156941e >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    /* renamed from: h */
    private static int m91266h(String str, int i, int i2) {
        if (i != i2) {
            int i3 = i;
            int i4 = 0;
            while (i3 < i2) {
                char charAt = (char) (str.charAt(i3) - '0');
                if (charAt < 10) {
                    i4 = (i4 * 10) + charAt;
                    if (i4 <= 999999) {
                        i3++;
                    } else {
                        throw C59077e.m91340b("precision too large", str, i, i2);
                    }
                } else {
                    throw C59077e.m91339a("invalid precision character", str, i3);
                }
            }
            if (i4 != 0) {
                return i4;
            }
            if (i2 == i + 1) {
                return 0;
            }
            throw C59077e.m91340b("invalid precision", str, i, i2);
        }
        throw C59077e.m91339a("missing precision", str, i - 1);
    }

    /* renamed from: c */
    public final boolean mo56294c() {
        return this == f156940a;
    }

    /* renamed from: d */
    public final boolean mo56295d() {
        return (this.f156942b & 128) != 0;
    }

    /* renamed from: e */
    public final boolean mo56296e(int i, boolean z) {
        int i2;
        if (mo56294c()) {
            return true;
        }
        int i3 = this.f156942b;
        if (((i ^ -1) & i3) != 0) {
            return false;
        }
        if (!z && this.f156944d != -1) {
            return false;
        }
        int i4 = this.f156943c;
        if ((i3 & 9) == 9 || (i2 = i3 & 96) == 96) {
            return false;
        }
        return i2 == 0 || i4 != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C59028c) {
            C59028c cVar = (C59028c) obj;
            return cVar.f156942b == this.f156942b && cVar.f156943c == this.f156943c && cVar.f156944d == this.f156944d;
        }
    }

    /* renamed from: f */
    public final void mo56298f(StringBuilder sb) {
        if (!mo56294c()) {
            int i = this.f156942b & -129;
            int i2 = 0;
            while (true) {
                int i3 = 1 << i2;
                if (i3 > i) {
                    break;
                }
                if ((i3 & i) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            int i4 = this.f156943c;
            if (i4 != -1) {
                sb.append(i4);
            }
            if (this.f156944d != -1) {
                sb.append('.');
                sb.append(this.f156944d);
            }
        }
    }

    public final int hashCode() {
        return (((this.f156942b * 31) + this.f156943c) * 31) + this.f156944d;
    }

    /* renamed from: b */
    public static C59028c m91264b(String str, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            return f156940a;
        }
        int i3 = true != z ? 0 : 128;
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '0') {
                int i5 = i4 - 1;
                if (charAt <= '9') {
                    int i6 = charAt - '0';
                    while (i4 != i2) {
                        int i7 = i4 + 1;
                        char charAt2 = str.charAt(i4);
                        if (charAt2 == '.') {
                            return new C59028c(i3, i6, m91266h(str, i7, i2));
                        }
                        char c = (char) (charAt2 - '0');
                        if (c < 10) {
                            i6 = (i6 * 10) + c;
                            if (i6 <= 999999) {
                                i4 = i7;
                            } else {
                                throw C59077e.m91340b("width too large", str, i5, i2);
                            }
                        } else {
                            throw C59077e.m91339a("invalid width character", str, i7 - 1);
                        }
                    }
                    return new C59028c(i3, i6, -1);
                }
                throw C59077e.m91339a("invalid flag", str, i5);
            }
            int g = m91265g(charAt);
            if (g >= 0) {
                int i8 = 1 << g;
                if ((i3 & i8) == 0) {
                    i3 |= i8;
                    i = i4;
                } else {
                    throw C59077e.m91339a("repeated flag", str, i4 - 1);
                }
            } else if (charAt == '.') {
                return new C59028c(i3, -1, m91266h(str, i4, i2));
            } else {
                throw C59077e.m91339a("invalid flag", str, i4 - 1);
            }
        }
        return new C59028c(i3, -1, -1);
    }
}
