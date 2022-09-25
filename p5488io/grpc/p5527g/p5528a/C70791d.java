package p5488io.grpc.p5527g.p5528a;

import javax.security.auth.x500.X500Principal;

/* renamed from: io.grpc.g.a.d */
/* compiled from: PG */
final class C70791d {

    /* renamed from: a */
    public final String f188786a;

    /* renamed from: b */
    public final int f188787b;

    /* renamed from: c */
    public int f188788c;

    /* renamed from: d */
    public int f188789d;

    /* renamed from: e */
    public int f188790e;

    /* renamed from: f */
    public int f188791f;

    /* renamed from: g */
    public char[] f188792g;

    public C70791d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f188786a = name;
        this.f188787b = name.length();
    }

    /* renamed from: a */
    public final char mo62494a() {
        int i;
        int i2;
        int i3 = this.f188788c + 1;
        this.f188788c = i3;
        if (i3 != this.f188787b) {
            char c = this.f188792g[i3];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int b = mo62495b(i3);
                                this.f188788c++;
                                if (b >= 128) {
                                    if (b >= 192 && b <= 247) {
                                        if (b <= 223) {
                                            i2 = b & 31;
                                            i = 1;
                                        } else if (b <= 239) {
                                            i2 = b & 15;
                                            i = 2;
                                        } else {
                                            i2 = b & 7;
                                            i = 3;
                                        }
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < i) {
                                                int i5 = this.f188788c + 1;
                                                this.f188788c = i5;
                                                if (i5 != this.f188787b && this.f188792g[i5] == '\\') {
                                                    int i6 = i5 + 1;
                                                    this.f188788c = i6;
                                                    int b2 = mo62495b(i6);
                                                    this.f188788c++;
                                                    if ((b2 & 192) == 128) {
                                                        i2 = (i2 << 6) + (b2 & 63);
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                b = (char) i2;
                                            }
                                        }
                                    }
                                    b = 63;
                                }
                                return (char) b;
                        }
                }
            }
            return c;
        }
        throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.f188786a)));
    }

    /* renamed from: b */
    public final int mo62495b(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f188787b) {
            char[] cArr = this.f188792g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.f188786a)));
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.f188786a)));
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.f188786a)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo62496c() {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6.f188788c
            int r1 = r6.f188787b
            r2 = 32
            if (r0 >= r1) goto L_0x0013
            char[] r3 = r6.f188792g
            char r3 = r3[r0]
            if (r3 != r2) goto L_0x0013
            int r0 = r0 + 1
            r6.f188788c = r0
            goto L_0x0000
        L_0x0013:
            if (r0 != r1) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            r6.f188789d = r0
            int r0 = r0 + 1
            r6.f188788c = r0
        L_0x001d:
            int r0 = r6.f188788c
            int r1 = r6.f188787b
            r3 = 61
            if (r0 >= r1) goto L_0x0032
            char[] r4 = r6.f188792g
            char r4 = r4[r0]
            if (r4 == r3) goto L_0x0032
            if (r4 == r2) goto L_0x0032
            int r0 = r0 + 1
            r6.f188788c = r0
            goto L_0x001d
        L_0x0032:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto L_0x00c1
            r6.f188790e = r0
            char[] r1 = r6.f188792g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x006a
        L_0x003e:
            int r0 = r6.f188788c
            int r1 = r6.f188787b
            if (r0 >= r1) goto L_0x0051
            char[] r5 = r6.f188792g
            char r5 = r5[r0]
            if (r5 == r3) goto L_0x0051
            if (r5 != r2) goto L_0x0051
            int r0 = r0 + 1
            r6.f188788c = r0
            goto L_0x003e
        L_0x0051:
            char[] r5 = r6.f188792g
            char r5 = r5[r0]
            if (r5 != r3) goto L_0x005a
            if (r0 == r1) goto L_0x005a
            goto L_0x006a
        L_0x005a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r6.f188786a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r4.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x006a:
            int r0 = r0 + 1
            r6.f188788c = r0
        L_0x006e:
            int r0 = r6.f188788c
            int r1 = r6.f188787b
            if (r0 >= r1) goto L_0x007f
            char[] r1 = r6.f188792g
            char r1 = r1[r0]
            if (r1 != r2) goto L_0x007f
            int r0 = r0 + 1
            r6.f188788c = r0
            goto L_0x006e
        L_0x007f:
            int r0 = r6.f188790e
            int r1 = r6.f188789d
            int r2 = r0 - r1
            r3 = 4
            if (r2 <= r3) goto L_0x00b8
            char[] r2 = r6.f188792g
            int r3 = r1 + 3
            char r3 = r2[r3]
            r4 = 46
            if (r3 != r4) goto L_0x00b8
            char r3 = r2[r1]
            r4 = 79
            if (r3 == r4) goto L_0x009c
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 != r4) goto L_0x00b8
        L_0x009c:
            int r3 = r1 + 1
            char r3 = r2[r3]
            r4 = 73
            if (r3 == r4) goto L_0x00a8
            r4 = 105(0x69, float:1.47E-43)
            if (r3 != r4) goto L_0x00b8
        L_0x00a8:
            int r3 = r1 + 2
            char r2 = r2[r3]
            r3 = 68
            if (r2 == r3) goto L_0x00b4
            r3 = 100
            if (r2 != r3) goto L_0x00b8
        L_0x00b4:
            int r1 = r1 + 4
            r6.f188789d = r1
        L_0x00b8:
            java.lang.String r2 = new java.lang.String
            char[] r3 = r6.f188792g
            int r0 = r0 - r1
            r2.<init>(r3, r1, r0)
            return r2
        L_0x00c1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r6.f188786a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r4.concat(r1)
            r0.<init>(r1)
            goto L_0x00d2
        L_0x00d1:
            throw r0
        L_0x00d2:
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5527g.p5528a.C70791d.mo62496c():java.lang.String");
    }
}
