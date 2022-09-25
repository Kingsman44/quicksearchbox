package com.google.common.p4574q;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.common.q.n */
/* compiled from: PG */
public final class C60735n implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final String f164743a;

    /* renamed from: b */
    public final boolean f164744b;

    /* renamed from: c */
    private final int f164745c;

    public C60735n(String str, int i, boolean z) {
        this.f164743a = str;
        this.f164745c = i;
        this.f164744b = z;
    }

    /* renamed from: d */
    public static boolean m92690d(int i) {
        return i >= 0 && i <= 65535;
    }

    /* renamed from: a */
    public final int mo57123a() {
        C58838bb.m90883r(mo57124c());
        return this.f164745c;
    }

    /* renamed from: c */
    public final boolean mo57124c() {
        return this.f164745c >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C60735n) {
            C60735n nVar = (C60735n) obj;
            return C58832aw.m90831a(this.f164743a, nVar.f164743a) && this.f164745c == nVar.f164745c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f164743a, Integer.valueOf(this.f164745c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f164743a.length() + 8);
        if (this.f164743a.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.f164743a);
            sb.append(']');
        } else {
            sb.append(this.f164743a);
        }
        if (mo57124c()) {
            sb.append(':');
            sb.append(this.f164745c);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.p4574q.C60735n m92689b(java.lang.String r9) {
        /*
            r9.getClass()
            java.lang.String r0 = "["
            boolean r0 = r9.startsWith(r0)
            r1 = -1
            r2 = 58
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0081
            char r0 = r9.charAt(r4)
            r5 = 91
            if (r0 != r5) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            java.lang.String r5 = "Bracketed host-port string must start with a bracket: %s"
            com.google.common.base.C58838bb.m90873h(r0, r5, r9)
            int r0 = r9.indexOf(r2)
            r5 = 93
            int r5 = r9.lastIndexOf(r5)
            if (r0 < 0) goto L_0x0030
            if (r5 <= r0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            java.lang.String r6 = "Invalid bracketed host/port: %s"
            com.google.common.base.C58838bb.m90873h(r0, r6, r9)
            java.lang.String r0 = r9.substring(r3, r5)
            int r6 = r5 + 1
            int r7 = r9.length()
            r8 = 2
            if (r6 != r7) goto L_0x004c
            java.lang.String[] r2 = new java.lang.String[r8]
            r2[r4] = r0
            java.lang.String r0 = ""
            r2[r3] = r0
            goto L_0x007c
        L_0x004c:
            char r6 = r9.charAt(r6)
            if (r6 != r2) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            java.lang.String r6 = "Only a colon may follow a close bracket: %s"
            com.google.common.base.C58838bb.m90873h(r2, r6, r9)
            int r5 = r5 + r8
            r2 = r5
        L_0x005c:
            int r6 = r9.length()
            if (r2 >= r6) goto L_0x0072
            char r6 = r9.charAt(r2)
            boolean r6 = java.lang.Character.isDigit(r6)
            java.lang.String r7 = "Port must be numeric: %s"
            com.google.common.base.C58838bb.m90873h(r6, r7, r9)
            int r2 = r2 + 1
            goto L_0x005c
        L_0x0072:
            java.lang.String[] r2 = new java.lang.String[r8]
            r2[r4] = r0
            java.lang.String r0 = r9.substring(r5)
            r2[r3] = r0
        L_0x007c:
            r0 = r2[r4]
            r2 = r2[r3]
            goto L_0x0097
        L_0x0081:
            int r0 = r9.indexOf(r2)
            if (r0 < 0) goto L_0x009a
            int r5 = r0 + 1
            int r2 = r9.indexOf(r2, r5)
            if (r2 != r1) goto L_0x009a
            java.lang.String r0 = r9.substring(r4, r0)
            java.lang.String r2 = r9.substring(r5)
        L_0x0097:
            r5 = r2
            r2 = 0
            goto L_0x00a3
        L_0x009a:
            if (r0 < 0) goto L_0x009e
            r0 = 1
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            r2 = 0
            r5 = r2
            r2 = r0
            r0 = r9
        L_0x00a3:
            boolean r6 = com.google.common.base.C58837ba.m90859h(r5)
            if (r6 != 0) goto L_0x00da
            java.lang.String r1 = "+"
            boolean r1 = r5.startsWith(r1)
            if (r1 != 0) goto L_0x00ba
            com.google.common.base.h r1 = com.google.common.base.C58898h.f156736a
            boolean r1 = r1.mo56188g(r5)
            if (r1 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            java.lang.String r1 = "Unparseable port number: %s"
            com.google.common.base.C58838bb.m90873h(r3, r1, r9)
            int r1 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x00ce }
            boolean r3 = m92690d(r1)
            java.lang.String r4 = "Port number out of range: %s"
            com.google.common.base.C58838bb.m90873h(r3, r4, r9)
            goto L_0x00da
        L_0x00ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unparseable port number: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        L_0x00da:
            com.google.common.q.n r9 = new com.google.common.q.n
            r9.<init>(r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4574q.C60735n.m92689b(java.lang.String):com.google.common.q.n");
    }
}
