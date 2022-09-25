package com.google.common.p4524d;

import com.google.common.base.C58832aw;
import com.google.common.base.C58837ba;
import com.google.common.base.C58902l;
import com.google.common.base.C58903m;
import com.google.common.base.C58907q;
import com.google.common.base.C58910t;
import com.google.common.base.C58912v;
import java.util.Arrays;

/* renamed from: com.google.common.d.a */
/* compiled from: PG */
public final class C58952a {

    /* renamed from: d */
    private static final C58912v f156803d = C58912v.m91034k(" \t\n\r\f\u000b  ‍￯�￾￿").mo56180d();

    /* renamed from: e */
    private static final C58912v f156804e = C58837ba.m90853b(new C58907q(new C58910t(new C58910t(new C58902l(0, 31), new C58903m(127)), C58912v.m91034k(" @,:<>"))));

    /* renamed from: a */
    public final String f156805a;

    /* renamed from: b */
    public final String f156806b;

    /* renamed from: c */
    public final boolean f156807c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C58952a) {
            C58952a aVar = (C58952a) obj;
            return C58832aw.m90831a(this.f156805a, aVar.f156805a) && C58832aw.m90831a(this.f156806b, aVar.f156806b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f156805a, this.f156806b});
    }

    public final String toString() {
        String str = this.f156805a;
        String str2 = this.f156806b;
        return str + "@" + str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f7, code lost:
        if (com.google.common.base.C58898h.f156736a.mo56188g(r10) == false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58952a(java.lang.String r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r1 = -1
            r2 = 1
            r3 = 0
            if (r10 != 0) goto L_0x000e
            r9.f156805a = r0
            r9.f156806b = r0
            goto L_0x002f
        L_0x000e:
            r4 = 64
            int r4 = r10.lastIndexOf(r4)
            if (r4 <= 0) goto L_0x002b
            int r5 = r10.length()
            int r5 = r5 + r1
            if (r4 == r5) goto L_0x002b
            java.lang.String r0 = r10.substring(r3, r4)
            r9.f156805a = r0
            int r4 = r4 + r2
            java.lang.String r10 = r10.substring(r4)
            r9.f156806b = r10
            goto L_0x002f
        L_0x002b:
            r9.f156805a = r0
            r9.f156806b = r0
        L_0x002f:
            java.lang.String r10 = r9.f156805a
            java.lang.String r0 = r9.f156806b
            if (r10 == 0) goto L_0x00f9
            if (r0 != 0) goto L_0x0039
            goto L_0x00f9
        L_0x0039:
            int r4 = r10.length()
            if (r4 == 0) goto L_0x00f9
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0047
            goto L_0x00f9
        L_0x0047:
            com.google.common.base.v r4 = f156803d
            int r5 = r4.mo56190i(r0)
            if (r5 < 0) goto L_0x0051
            goto L_0x00f9
        L_0x0051:
            int r5 = r0.length()
            r6 = 4
            if (r5 >= r6) goto L_0x005a
            goto L_0x00f9
        L_0x005a:
            r5 = 46
            int r6 = r0.indexOf(r5)
            if (r6 != r1) goto L_0x0064
            goto L_0x00f9
        L_0x0064:
            java.lang.String r7 = ".."
            boolean r8 = r0.contains(r7)
            if (r8 == 0) goto L_0x006e
            goto L_0x00f9
        L_0x006e:
            char r8 = r0.charAt(r3)
            if (r8 != r5) goto L_0x0076
            goto L_0x00f9
        L_0x0076:
            java.lang.String r8 = "."
            int r6 = r6 + r2
            int r6 = r0.indexOf(r8, r6)
            int r8 = r0.length()
            int r8 = r8 + r1
            char r8 = r0.charAt(r8)
            if (r8 != r5) goto L_0x008c
            if (r6 != r1) goto L_0x008c
            goto L_0x00f9
        L_0x008c:
            com.google.common.base.v r5 = f156804e
            boolean r6 = r5.mo56188g(r0)
            if (r6 == 0) goto L_0x00f9
            com.google.common.base.h r6 = com.google.common.base.C58898h.f156736a
            boolean r0 = r6.mo56188g(r0)
            if (r0 != 0) goto L_0x009d
            goto L_0x00f9
        L_0x009d:
            java.lang.String r0 = "\""
            boolean r6 = r10.startsWith(r0)
            if (r6 == 0) goto L_0x00dd
            int r4 = r10.length()
            int r4 = r4 + r1
            if (r4 <= 0) goto L_0x00f9
            boolean r0 = r10.endsWith(r0)
            if (r0 != 0) goto L_0x00b3
            goto L_0x00f9
        L_0x00b3:
            r0 = 1
        L_0x00b4:
            if (r0 >= r4) goto L_0x00fa
            char r1 = r10.charAt(r0)
            r5 = 34
            if (r1 == r5) goto L_0x00f9
            r5 = 127(0x7f, float:1.78E-43)
            if (r1 == r5) goto L_0x00f9
            r5 = 32
            if (r1 >= r5) goto L_0x00ce
            com.google.common.base.v r5 = f156803d
            boolean r5 = r5.mo56144c(r1)
            if (r5 == 0) goto L_0x00f9
        L_0x00ce:
            r5 = 128(0x80, float:1.794E-43)
            if (r1 < r5) goto L_0x00d3
            goto L_0x00f9
        L_0x00d3:
            r5 = 92
            if (r1 != r5) goto L_0x00db
            int r0 = r0 + 1
            if (r0 >= r4) goto L_0x00f9
        L_0x00db:
            int r0 = r0 + r2
            goto L_0x00b4
        L_0x00dd:
            int r0 = r4.mo56190i(r10)
            if (r0 < 0) goto L_0x00e4
            goto L_0x00f9
        L_0x00e4:
            boolean r0 = r10.contains(r7)
            if (r0 == 0) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            boolean r0 = r5.mo56188g(r10)
            if (r0 == 0) goto L_0x00f9
            com.google.common.base.h r0 = com.google.common.base.C58898h.f156736a
            boolean r10 = r0.mo56188g(r10)
            if (r10 != 0) goto L_0x00fa
        L_0x00f9:
            r2 = 0
        L_0x00fa:
            r9.f156807c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4524d.C58952a.<init>(java.lang.String):void");
    }
}
