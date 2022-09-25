package com.google.common.p4526f.p4533e;

/* renamed from: com.google.common.f.e.f */
/* compiled from: PG */
public abstract class C59078f extends C59076d {

    /* renamed from: a */
    private static final String f157042a;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L_0x000e;
     */
    static {
        /*
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000e }
            java.lang.String r1 = "\\n|\\r(?:\\n)?"
            boolean r1 = r0.matches(r1)     // Catch:{ SecurityException -> 0x000e }
            if (r1 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = "\n"
        L_0x0010:
            f157042a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4526f.p4533e.C59078f.<clinit>():void");
    }

    /* renamed from: d */
    static int m91343d(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            } else {
                throw C59077e.m91341c("trailing unquoted '%' character", str, i2 - 1);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public abstract int mo56338a(C59075c cVar, int i, String str, int i2, int i3, int i4);

    /* renamed from: b */
    public final void mo56339b(C59075c cVar) {
        int i;
        int i2;
        int i3;
        String str = cVar.f157039d.f156911b;
        int d = m91343d(str, 0);
        int i4 = 0;
        int i5 = -1;
        while (d >= 0) {
            int i6 = d + 1;
            int i7 = i6;
            int i8 = 0;
            while (i7 < str.length()) {
                int i9 = i7 + 1;
                char charAt = str.charAt(i7);
                char c = (char) (charAt - '0');
                if (c < 10) {
                    i8 = (i8 * 10) + c;
                    if (i8 < 1000000) {
                        i7 = i9;
                    } else {
                        throw C59077e.m91340b("index too large", str, d, i9);
                    }
                } else {
                    if (charAt == '$') {
                        if ((i9 - 1) - i6 == 0) {
                            throw C59077e.m91340b("missing index", str, d, i9);
                        } else if (str.charAt(i6) != '0') {
                            int i10 = i8 - 1;
                            if (i9 != str.length()) {
                                str.charAt(i9);
                                i2 = i4;
                                i = i10;
                                i3 = i9;
                                i9++;
                            } else {
                                throw C59077e.m91341c("unterminated parameter", str, d);
                            }
                        } else {
                            throw C59077e.m91340b("index has leading zero", str, d, i9);
                        }
                    } else if (charAt != '<') {
                        i = i4;
                        i2 = i4 + 1;
                        i3 = i6;
                    } else if (i5 == -1) {
                        throw C59077e.m91340b("invalid relative parameter", str, d, i9);
                    } else if (i9 != str.length()) {
                        str.charAt(i9);
                        i2 = i4;
                        i = i5;
                        i3 = i9;
                        i9++;
                    } else {
                        throw C59077e.m91341c("unterminated parameter", str, d);
                    }
                    int i11 = i9 - 1;
                    while (i11 < str.length()) {
                        if (((char) ((str.charAt(i11) & 65503) - 'A')) < 26) {
                            d = m91343d(str, mo56338a(cVar, i, str, d, i3, i11));
                            i4 = i2;
                            i5 = i;
                        } else {
                            i11++;
                        }
                    }
                    throw C59077e.m91341c("unterminated parameter", str, d);
                }
            }
            throw C59077e.m91341c("unterminated parameter", str, d);
        }
    }

    /* renamed from: c */
    public final void mo56340c(StringBuilder sb, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append(str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append(str, i3, i4 - 1);
                    sb.append(f157042a);
                }
                i3 = i4 + 1;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append(str, i3, i2);
        }
    }
}
