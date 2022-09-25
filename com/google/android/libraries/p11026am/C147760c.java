package com.google.android.libraries.p11026am;

/* renamed from: com.google.android.libraries.am.c */
/* compiled from: PG */
final class C147760c {

    /* renamed from: a */
    private int f398705a;

    /* renamed from: b */
    private static boolean m240836b(char c) {
        return "\\[]?*(|)^$.{}+".indexOf(c) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo124437a(char[] cArr, StringBuilder sb, boolean z) {
        int length = cArr.length;
        loop0:
        while (true) {
            int i = this.f398705a;
            if (i >= length) {
                return i == length;
            }
            int i2 = i + 1;
            this.f398705a = i2;
            char c = cArr[i];
            if (c == '*') {
                sb.append(".*");
            } else if (c == ',') {
                if (true == z) {
                    c = '|';
                }
                sb.append(c);
            } else if (c == '?') {
                sb.append('.');
            } else if (c == '{') {
                sb.append('(');
                if (!mo124437a(cArr, sb, true)) {
                    return false;
                }
            } else if (c != '}') {
                if (c == '[') {
                    sb.append(c);
                    int i3 = this.f398705a;
                    if (i3 == length) {
                        break;
                    }
                    this.f398705a = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == '!') {
                        sb.append('^');
                        int i4 = this.f398705a;
                        if (i4 == length) {
                            break;
                        }
                        this.f398705a = i4 + 1;
                        c2 = cArr[i4];
                    }
                    if (c2 == ']') {
                        sb.append(']');
                        int i5 = this.f398705a;
                        if (i5 != length) {
                            this.f398705a = i5 + 1;
                            c2 = cArr[i5];
                        } else {
                            continue;
                        }
                    }
                    while (c2 != ']') {
                        sb.append(c2);
                        int i6 = this.f398705a;
                        if (i6 == length) {
                            break loop0;
                        }
                        this.f398705a = i6 + 1;
                        c2 = cArr[i6];
                    }
                    sb.append(']');
                } else if (c != '\\') {
                    if (m240836b(c)) {
                        sb.append('\\');
                    }
                    sb.append(c);
                } else if (i2 == length) {
                    return false;
                } else {
                    this.f398705a = i2 + 1;
                    char c3 = cArr[i2];
                    if (m240836b(c3)) {
                        sb.append('\\');
                    }
                    sb.append(c3);
                }
            } else if (z) {
                sb.append(')');
                return true;
            } else {
                sb.append("\\}");
            }
        }
        return false;
    }
}
