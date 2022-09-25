package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.p4532d.C59069d;
import com.google.common.p4526f.p4533e.C59075c;
import com.google.common.p4526f.p4533e.C59076d;
import com.google.common.p4526f.p4533e.C59077e;
import com.google.common.p4526f.p4534f.C59081b;

/* renamed from: com.google.common.f.b.a */
/* compiled from: PG */
public final class C58981a extends C59075c implements C59069d {

    /* renamed from: a */
    public final Object[] f156842a;

    /* renamed from: b */
    public final StringBuilder f156843b;

    /* renamed from: c */
    public int f156844c = 0;

    protected C58981a(C59015aj ajVar, Object[] objArr, StringBuilder sb) {
        super(ajVar);
        this.f156842a = (Object[]) C59081b.m91349a(objArr, "arguments");
        this.f156843b = sb;
    }

    /* renamed from: a */
    public static void m91150a(StringBuilder sb, Object obj, String str) {
        String str2;
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        try {
            str2 = C59035j.m91288b(obj);
        } catch (RuntimeException e) {
            str2 = C59035j.m91287a(obj, e);
        }
        sb.append(str2);
        sb.append("]");
    }

    /* renamed from: c */
    public static void m91151c(C59031f fVar, StringBuilder sb) {
        String str;
        if (fVar.mo56306i() != null) {
            C58981a aVar = new C58981a(fVar.mo56306i(), fVar.mo56302X(), sb);
            aVar.f157039d.f156910a.mo56339b(aVar);
            int i = aVar.f157040e;
            if (((i + 1) & i) != 0 || (aVar.f157041f > 31 && i != -1)) {
                throw new C59077e(String.format("unreferenced arguments [first missing index=%d]", new Object[]{Integer.valueOf(Integer.numberOfTrailingZeros(i ^ -1))}));
            }
            C59015aj ajVar = aVar.f157039d;
            C59076d dVar = ajVar.f156910a;
            StringBuilder sb2 = aVar.f156843b;
            String str2 = ajVar.f156911b;
            dVar.mo56340c(sb2, str2, aVar.f156844c, str2.length());
            StringBuilder sb3 = aVar.f156843b;
            if (fVar.mo56302X().length > aVar.f157041f + 1) {
                sb3.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                return;
            }
            return;
        }
        Object j = fVar.mo56307j();
        try {
            str = C59035j.m91288b(j);
        } catch (RuntimeException e) {
            str = C59035j.m91287a(j, e);
        }
        sb.append(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if ((r8 instanceof java.math.BigDecimal) == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if ((r8 instanceof java.math.BigInteger) == false) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56246b(java.lang.Object r8, com.google.common.p4526f.p4528b.C59016b r9, com.google.common.p4526f.p4528b.C59028c r10) {
        /*
            r7 = this;
            com.google.common.f.b.d r0 = r9.f156925m
            int r0 = r0.ordinal()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0066
            if (r0 == r5) goto L_0x0059
            if (r0 == r3) goto L_0x003b
            if (r0 == r2) goto L_0x0026
            if (r0 != r1) goto L_0x0024
            boolean r0 = r8 instanceof java.lang.Double
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof java.lang.Float
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof java.math.BigDecimal
            if (r0 == 0) goto L_0x0022
            goto L_0x003f
        L_0x0022:
            r0 = 0
            goto L_0x005b
        L_0x0024:
            r8 = 0
            throw r8
        L_0x0026:
            boolean r0 = r8 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof java.lang.Long
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof java.lang.Short
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof java.math.BigInteger
            if (r0 == 0) goto L_0x0022
            goto L_0x003f
        L_0x003b:
            boolean r0 = r8 instanceof java.lang.Character
            if (r0 == 0) goto L_0x0041
        L_0x003f:
            r0 = 1
            goto L_0x005b
        L_0x0041:
            boolean r0 = r8 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x004d
            boolean r0 = r8 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x004d
            boolean r0 = r8 instanceof java.lang.Short
            if (r0 == 0) goto L_0x0022
        L_0x004d:
            r0 = r8
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = java.lang.Character.isValidCodePoint(r0)
            goto L_0x005b
        L_0x0059:
            boolean r0 = r8 instanceof java.lang.Boolean
        L_0x005b:
            if (r0 == 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            java.lang.StringBuilder r10 = r7.f156843b
            java.lang.String r9 = r9.f156927o
            m91150a(r10, r8, r9)
            return
        L_0x0066:
            java.lang.StringBuilder r0 = r7.f156843b
            int r6 = r9.ordinal()
            if (r6 == 0) goto L_0x0137
            if (r6 == r5) goto L_0x012d
            if (r6 == r3) goto L_0x0108
            if (r6 == r2) goto L_0x012d
            r1 = 5
            if (r6 == r1) goto L_0x0079
            goto L_0x014f
        L_0x0079:
            boolean r1 = r10.mo56294c()
            if (r1 == 0) goto L_0x0080
            goto L_0x0094
        L_0x0080:
            int r1 = r10.f156942b
            r2 = r1 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x0089
            com.google.common.f.b.c r1 = com.google.common.p4526f.p4528b.C59028c.f156940a
            goto L_0x009b
        L_0x0089:
            r3 = -1
            if (r2 != r1) goto L_0x0096
            int r1 = r10.f156943c
            if (r1 != r3) goto L_0x0096
            int r1 = r10.f156944d
            if (r1 != r3) goto L_0x0096
        L_0x0094:
            r1 = r10
            goto L_0x009b
        L_0x0096:
            com.google.common.f.b.c r1 = new com.google.common.f.b.c
            r1.<init>(r2, r3, r3)
        L_0x009b:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x014f
            java.lang.Number r8 = (java.lang.Number) r8
            boolean r9 = r10.mo56295d()
            long r1 = r8.longValue()
            boolean r10 = r8 instanceof java.lang.Long
            if (r10 == 0) goto L_0x00b3
            com.google.common.p4526f.p4528b.C59035j.m91289c(r0, r1, r9)
            return
        L_0x00b3:
            boolean r10 = r8 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x00c1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            com.google.common.p4526f.p4528b.C59035j.m91289c(r0, r1, r9)
            return
        L_0x00c1:
            boolean r10 = r8 instanceof java.lang.Byte
            if (r10 == 0) goto L_0x00cc
            r3 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r3
            com.google.common.p4526f.p4528b.C59035j.m91289c(r0, r1, r9)
            return
        L_0x00cc:
            boolean r10 = r8 instanceof java.lang.Short
            if (r10 == 0) goto L_0x00d8
            r3 = 65535(0xffff, double:3.23786E-319)
            long r1 = r1 & r3
            com.google.common.p4526f.p4528b.C59035j.m91289c(r0, r1, r9)
            return
        L_0x00d8:
            boolean r10 = r8 instanceof java.math.BigInteger
            if (r10 == 0) goto L_0x00f0
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            r10 = 16
            java.lang.String r8 = r8.toString(r10)
            if (r9 == 0) goto L_0x00ec
            java.util.Locale r9 = com.google.common.p4526f.p4528b.C59035j.f156957a
            java.lang.String r8 = r8.toUpperCase(r9)
        L_0x00ec:
            r0.append(r8)
            return
        L_0x00f0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r10 = "unsupported number type: "
            java.lang.String r8 = r10.concat(r8)
            r9.<init>(r8)
            throw r9
        L_0x0108:
            boolean r1 = r10.mo56294c()
            if (r1 == 0) goto L_0x014f
            boolean r9 = r8 instanceof java.lang.Character
            if (r9 == 0) goto L_0x0116
            r0.append(r8)
            return
        L_0x0116:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r9 = r8 >>> 16
            if (r9 != 0) goto L_0x0125
            char r8 = (char) r8
            r0.append(r8)
            return
        L_0x0125:
            char[] r8 = java.lang.Character.toChars(r8)
            r0.append(r8)
            return
        L_0x012d:
            boolean r1 = r10.mo56294c()
            if (r1 == 0) goto L_0x014f
            r0.append(r8)
            return
        L_0x0137:
            boolean r2 = r8 instanceof java.util.Formattable
            if (r2 != 0) goto L_0x0183
            boolean r1 = r10.mo56294c()
            if (r1 == 0) goto L_0x014f
            java.lang.String r8 = com.google.common.p4526f.p4528b.C59035j.m91288b(r8)     // Catch:{ RuntimeException -> 0x0146 }
            goto L_0x014b
        L_0x0146:
            r9 = move-exception
            java.lang.String r8 = com.google.common.p4526f.p4528b.C59035j.m91287a(r8, r9)
        L_0x014b:
            r0.append(r8)
            return
        L_0x014f:
            java.lang.String r1 = r9.f156927o
            boolean r2 = r10.mo56294c()
            if (r2 != 0) goto L_0x0175
            char r9 = r9.f156924l
            boolean r1 = r10.mo56295d()
            if (r1 == 0) goto L_0x0163
            r1 = 65503(0xffdf, float:9.1789E-41)
            r9 = r9 & r1
        L_0x0163:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "%"
            r1.<init>(r2)
            r10.mo56298f(r1)
            char r9 = (char) r9
            r1.append(r9)
            java.lang.String r1 = r1.toString()
        L_0x0175:
            java.util.Locale r9 = com.google.common.p4526f.p4528b.C59035j.f156957a
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r8
            java.lang.String r8 = java.lang.String.format(r9, r1, r10)
            r0.append(r8)
            return
        L_0x0183:
            java.util.Formattable r8 = (java.util.Formattable) r8
            int r9 = r10.f156942b
            r9 = r9 & 162(0xa2, float:2.27E-43)
            if (r9 == 0) goto L_0x01a1
            r2 = r9 & 32
            if (r2 == 0) goto L_0x0190
            goto L_0x0191
        L_0x0190:
            r5 = 0
        L_0x0191:
            r2 = r9 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0196
            goto L_0x0197
        L_0x0196:
            r3 = 0
        L_0x0197:
            r2 = r5 | r3
            r9 = r9 & 2
            if (r9 == 0) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r1 = 0
        L_0x019f:
            r9 = r2 | r1
        L_0x01a1:
            int r1 = r0.length()
            java.util.Formatter r2 = new java.util.Formatter
            java.util.Locale r3 = com.google.common.p4526f.p4528b.C59035j.f156957a
            r2.<init>(r0, r3)
            int r3 = r10.f156943c     // Catch:{ RuntimeException -> 0x01b4 }
            int r10 = r10.f156944d     // Catch:{ RuntimeException -> 0x01b4 }
            r8.formatTo(r2, r9, r3, r10)     // Catch:{ RuntimeException -> 0x01b4 }
            return
        L_0x01b4:
            r9 = move-exception
            r0.setLength(r1)
            java.lang.Appendable r10 = r2.out()     // Catch:{ IOException -> 0x01c3 }
            java.lang.String r8 = com.google.common.p4526f.p4528b.C59035j.m91287a(r8, r9)     // Catch:{ IOException -> 0x01c3 }
            r10.append(r8)     // Catch:{ IOException -> 0x01c3 }
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4526f.p4528b.C58981a.mo56246b(java.lang.Object, com.google.common.f.b.b, com.google.common.f.b.c):void");
    }
}
