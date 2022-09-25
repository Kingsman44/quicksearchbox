package com.google.p4272br;

import com.evernote.android.state.BuildConfig;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.br.x */
/* compiled from: PG */
final class C56455x {

    /* renamed from: a */
    static final C56455x[] f150791a = new C56455x[0];

    /* renamed from: b */
    int f150792b;

    /* renamed from: c */
    C56455x[] f150793c;

    /* renamed from: d */
    int[] f150794d;

    /* renamed from: e */
    int f150795e;

    /* renamed from: f */
    int f150796f;

    /* renamed from: g */
    int f150797g;

    /* renamed from: h */
    String f150798h;

    /* renamed from: i */
    Map f150799i;

    /* renamed from: j */
    int f150800j;

    public C56455x(int i) {
        this.f150800j = i;
    }

    public C56455x(C56455x xVar) {
        this.f150800j = xVar.f150800j;
        this.f150792b = xVar.f150792b;
        this.f150793c = xVar.f150793c;
        this.f150794d = xVar.f150794d;
        this.f150795e = xVar.f150795e;
        this.f150796f = xVar.f150796f;
        this.f150797g = xVar.f150797g;
        this.f150798h = xVar.f150798h;
        this.f150799i = xVar.f150799i;
    }

    /* renamed from: c */
    private static void m88189c(StringBuilder sb, int i) {
        if (i == 45) {
            sb.append('\\');
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo54420a() {
        int i = this.f150800j == 13 ? this.f150797g : 0;
        C56455x[] xVarArr = this.f150793c;
        if (xVarArr != null) {
            for (C56455x a : xVarArr) {
                int a2 = a.mo54420a();
                if (i < a2) {
                    i = a2;
                }
            }
        }
        return i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (!(obj instanceof C56455x)) {
            return false;
        }
        C56455x xVar = (C56455x) obj;
        int i = this.f150800j;
        if (i != xVar.f150800j) {
            return false;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 2 || i2 == 3) {
            if (!Arrays.equals(this.f150794d, xVar.f150794d)) {
                return false;
            }
            return true;
        } else if (i2 != 9) {
            switch (i2) {
                case 12:
                    if (this.f150797g != xVar.f150797g || ((str = this.f150798h) != null ? !str.equals(xVar.f150798h) : xVar.f150798h != null) || !this.f150793c[0].equals(xVar.f150793c[0])) {
                        return false;
                    }
                    return true;
                case 13:
                case 14:
                case 15:
                    if ((this.f150792b & 32) != (xVar.f150792b & 32) || !this.f150793c[0].equals(xVar.f150793c[0])) {
                        return false;
                    }
                    return true;
                case 16:
                    if ((this.f150792b & 32) == (xVar.f150792b & 32) && this.f150795e == xVar.f150795e && this.f150796f == xVar.f150796f && this.f150793c[0].equals(xVar.f150793c[0])) {
                        return true;
                    }
                    return false;
                case 17:
                case 18:
                    if (this.f150793c.length != xVar.f150793c.length) {
                        return false;
                    }
                    int i3 = 0;
                    while (true) {
                        C56455x[] xVarArr = this.f150793c;
                        if (i3 >= xVarArr.length) {
                            return true;
                        }
                        if (!xVarArr[i3].equals(xVar.f150793c[i3])) {
                            return false;
                        }
                        i3++;
                    }
                default:
                    return true;
            }
        } else if ((this.f150792b & 256) != (xVar.f150792b & 256)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r1 = r1 + (r2 * 31);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = r4.f150800j
            if (r0 == 0) goto L_0x006d
            int r1 = r0 + -1
            r2 = 2
            if (r1 == r2) goto L_0x0066
            r2 = 3
            if (r1 == r2) goto L_0x0066
            r2 = 9
            if (r1 == r2) goto L_0x0061
            r2 = 0
            switch(r1) {
                case 12: goto L_0x0043;
                case 13: goto L_0x0034;
                case 14: goto L_0x0034;
                case 15: goto L_0x0034;
                case 16: goto L_0x001f;
                case 17: goto L_0x0015;
                case 18: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0060
        L_0x0015:
            com.google.br.x[] r1 = r4.f150793c
            int r1 = java.util.Arrays.deepHashCode(r1)
        L_0x001b:
            int r1 = r1 * 31
        L_0x001d:
            int r0 = r0 + r1
            return r0
        L_0x001f:
            int r1 = r4.f150795e
            int r1 = r1 * 31
            int r3 = r4.f150796f
            int r3 = r3 * 31
            int r1 = r1 + r3
            com.google.br.x[] r3 = r4.f150793c
            r2 = r3[r2]
            int r2 = r2.hashCode()
        L_0x0030:
            int r2 = r2 * 31
            int r1 = r1 + r2
            goto L_0x001d
        L_0x0034:
            int r1 = r4.f150792b
            r1 = r1 & 32
            int r1 = r1 * 31
            com.google.br.x[] r3 = r4.f150793c
            r2 = r3[r2]
            int r2 = r2.hashCode()
            goto L_0x0030
        L_0x0043:
            int r1 = r4.f150797g
            int r1 = r1 * 31
            java.lang.String r3 = r4.f150798h
            if (r3 == 0) goto L_0x0050
            int r3 = r3.hashCode()
            goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            int r3 = r3 * 31
            int r1 = r1 + r3
            com.google.br.x[] r3 = r4.f150793c
            r2 = r3[r2]
            int r2 = r2.hashCode()
            int r2 = r2 * 31
            int r1 = r1 + r2
            int r0 = r0 + r1
        L_0x0060:
            return r0
        L_0x0061:
            int r1 = r4.f150792b
            r1 = r1 & 256(0x100, float:3.59E-43)
            goto L_0x001b
        L_0x0066:
            int[] r1 = r4.f150794d
            int r1 = java.util.Arrays.hashCode(r1)
            goto L_0x001b
        L_0x006d:
            r0 = 0
            goto L_0x0070
        L_0x006f:
            throw r0
        L_0x0070:
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4272br.C56455x.hashCode():int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m88188b(sb);
        return sb.toString();
    }

    /* renamed from: b */
    private final void m88188b(StringBuilder sb) {
        String str;
        int i = this.f150800j;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 0;
            switch (i2) {
                case 0:
                    sb.append("[^\\x00-\\x{10FFFF}]");
                    return;
                case 1:
                    sb.append("(?:)");
                    return;
                case 2:
                    if ((this.f150792b & 1) != 0) {
                        sb.append("(?i:");
                    }
                    int[] iArr = this.f150794d;
                    int length = iArr.length;
                    while (i3 < length) {
                        C56432ab.m88119c(sb, iArr[i3]);
                        i3++;
                    }
                    if ((this.f150792b & 1) != 0) {
                        sb.append(')');
                        return;
                    }
                    return;
                case 3:
                    if ((this.f150794d.length & 1) != 0) {
                        sb.append("[invalid char class]");
                        return;
                    }
                    sb.append('[');
                    int[] iArr2 = this.f150794d;
                    int length2 = iArr2.length;
                    if (length2 == 0) {
                        sb.append("^\\x00-\\x{10FFFF}");
                    } else if (iArr2[0] == 0 && iArr2[length2 - 1] == 1114111) {
                        sb.append('^');
                        int i4 = 1;
                        while (true) {
                            int[] iArr3 = this.f150794d;
                            if (i4 < iArr3.length - 1) {
                                int i5 = iArr3[i4] + 1;
                                int i6 = iArr3[i4 + 1] - 1;
                                m88189c(sb, i5);
                                C56432ab.m88119c(sb, i5);
                                if (i5 != i6) {
                                    sb.append('-');
                                    m88189c(sb, i6);
                                    C56432ab.m88119c(sb, i6);
                                }
                                i4 += 2;
                            }
                        }
                    } else {
                        while (true) {
                            int[] iArr4 = this.f150794d;
                            if (i3 < iArr4.length) {
                                int i7 = iArr4[i3];
                                int i8 = iArr4[i3 + 1];
                                m88189c(sb, i7);
                                C56432ab.m88119c(sb, i7);
                                if (i7 != i8) {
                                    sb.append('-');
                                    m88189c(sb, i8);
                                    C56432ab.m88119c(sb, i8);
                                }
                                i3 += 2;
                            }
                        }
                    }
                    sb.append(']');
                    return;
                case 4:
                    sb.append("(?-s:.)");
                    return;
                case 5:
                    sb.append("(?s:.)");
                    return;
                case 6:
                    sb.append('^');
                    return;
                case 7:
                    sb.append('$');
                    return;
                case 8:
                    sb.append("\\A");
                    return;
                case 9:
                    if ((this.f150792b & 256) != 0) {
                        sb.append("(?-m:$)");
                        return;
                    } else {
                        sb.append("\\z");
                        return;
                    }
                case 10:
                    sb.append("\\b");
                    return;
                case 11:
                    sb.append("\\B");
                    return;
                case 12:
                    String str2 = this.f150798h;
                    if (str2 == null || str2.isEmpty()) {
                        sb.append('(');
                    } else {
                        sb.append("(?P<");
                        sb.append(this.f150798h);
                        sb.append(">");
                    }
                    C56455x xVar = this.f150793c[0];
                    if (xVar.f150800j != 2) {
                        xVar.m88188b(sb);
                    }
                    sb.append(')');
                    return;
                case 13:
                case 14:
                case 15:
                case 16:
                    C56455x xVar2 = this.f150793c[0];
                    int i9 = xVar2.f150800j;
                    int i10 = i9 - 1;
                    if (i9 != 0) {
                        if (i10 > 12 || (i9 == 3 && xVar2.f150794d.length > 1)) {
                            sb.append("(?:");
                            xVar2.m88188b(sb);
                            sb.append(')');
                        } else {
                            xVar2.m88188b(sb);
                        }
                        int i11 = this.f150800j;
                        int i12 = i11 - 1;
                        if (i11 != 0) {
                            switch (i12) {
                                case 13:
                                    sb.append('*');
                                    break;
                                case 14:
                                    sb.append('+');
                                    break;
                                case 15:
                                    sb.append('?');
                                    break;
                                case 16:
                                    sb.append('{');
                                    sb.append(this.f150795e);
                                    if (this.f150795e != this.f150796f) {
                                        sb.append(',');
                                        int i13 = this.f150796f;
                                        if (i13 >= 0) {
                                            sb.append(i13);
                                        }
                                    }
                                    sb.append('}');
                                    break;
                            }
                            if ((this.f150792b & 32) != 0) {
                                sb.append('?');
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    throw null;
                case 17:
                    C56455x[] xVarArr = this.f150793c;
                    int length3 = xVarArr.length;
                    while (i3 < length3) {
                        C56455x xVar3 = xVarArr[i3];
                        if (xVar3.f150800j == 19) {
                            sb.append("(?:");
                            xVar3.m88188b(sb);
                            sb.append(')');
                        } else {
                            xVar3.m88188b(sb);
                        }
                        i3++;
                    }
                    return;
                case 18:
                    C56455x[] xVarArr2 = this.f150793c;
                    int length4 = xVarArr2.length;
                    String str3 = BuildConfig.FLAVOR;
                    while (i3 < length4) {
                        C56455x xVar4 = xVarArr2[i3];
                        sb.append(str3);
                        xVar4.m88188b(sb);
                        i3++;
                        str3 = "|";
                    }
                    return;
                default:
                    switch (i) {
                        case 1:
                            str = "NO_MATCH";
                            break;
                        case 2:
                            str = "EMPTY_MATCH";
                            break;
                        case 3:
                            str = "LITERAL";
                            break;
                        case 4:
                            str = "CHAR_CLASS";
                            break;
                        case 5:
                            str = "ANY_CHAR_NOT_NL";
                            break;
                        case 6:
                            str = "ANY_CHAR";
                            break;
                        case 7:
                            str = "BEGIN_LINE";
                            break;
                        case 8:
                            str = "END_LINE";
                            break;
                        case 9:
                            str = "BEGIN_TEXT";
                            break;
                        case 10:
                            str = "END_TEXT";
                            break;
                        case 11:
                            str = "WORD_BOUNDARY";
                            break;
                        case 12:
                            str = "NO_WORD_BOUNDARY";
                            break;
                        case 13:
                            str = "CAPTURE";
                            break;
                        case 14:
                            str = "STAR";
                            break;
                        case 15:
                            str = "PLUS";
                            break;
                        case 16:
                            str = "QUEST";
                            break;
                        case 17:
                            str = "REPEAT";
                            break;
                        case 18:
                            str = "CONCAT";
                            break;
                        case 19:
                            str = "ALTERNATE";
                            break;
                        case 20:
                            str = "LEFT_PAREN";
                            break;
                        default:
                            str = "VERTICAL_BAR";
                            break;
                    }
                    sb.append(str);
                    return;
            }
        } else {
            throw null;
        }
    }
}
