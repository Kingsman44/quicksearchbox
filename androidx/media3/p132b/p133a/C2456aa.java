package androidx.media3.p132b.p133a;

import java.io.File;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.b.a.aa */
/* compiled from: PG */
final class C2456aa extends C2467l {

    /* renamed from: g */
    private static final Pattern f6746g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h */
    private static final Pattern f6747h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i */
    private static final Pattern f6748i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public C2456aa(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (r16.renameTo(r1) == false) goto L_0x0045;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.media3.p132b.p133a.C2456aa m6472c(java.io.File r16, long r17, long r19, androidx.media3.p132b.p133a.C2473r r21) {
        /*
            r0 = r21
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x0081
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = f6747h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L_0x002e
            java.lang.String r1 = r2.group(r5)
            r1.getClass()
            java.lang.String r1 = androidx.media3.common.p136b.C2612ak.m6939V(r1)
            goto L_0x0043
        L_0x002e:
            java.util.regex.Pattern r2 = f6746g
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r2.group(r5)
            if (r1 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            throw r6
        L_0x0042:
            r1 = r6
        L_0x0043:
            if (r1 != 0) goto L_0x0047
        L_0x0045:
            r1 = r6
            goto L_0x0077
        L_0x0047:
            java.io.File r7 = r16.getParentFile()
            androidx.media3.common.p136b.C2601a.m6829a(r7)
            androidx.media3.b.a.n r1 = r0.mo5902b(r1)
            int r8 = r1.f6790a
            java.lang.String r1 = r2.group(r4)
            r1.getClass()
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            r1.getClass()
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = m6474e(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L_0x0077
            goto L_0x0045
        L_0x0077:
            if (r1 != 0) goto L_0x007a
            return r6
        L_0x007a:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L_0x0084
        L_0x0081:
            r2 = r16
            r15 = r2
        L_0x0084:
            java.util.regex.Pattern r2 = f6748i
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x0091
            return r6
        L_0x0091:
            java.lang.String r2 = r1.group(r5)
            r2.getClass()
            int r2 = java.lang.Integer.parseInt(r2)
            android.util.SparseArray r0 = r0.f6803b
            java.lang.Object r0 = r0.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x00a8
            return r6
        L_0x00a8:
            r9 = -1
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00b4
            long r9 = r15.length()
            r11 = r9
            goto L_0x00b6
        L_0x00b4:
            r11 = r17
        L_0x00b6:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00bd
            return r6
        L_0x00bd:
            java.lang.String r0 = r1.group(r4)
            r0.getClass()
            long r9 = java.lang.Long.parseLong(r0)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = r1.group(r3)
            r0.getClass()
            long r0 = java.lang.Long.parseLong(r0)
            r13 = r0
            goto L_0x00e0
        L_0x00de:
            r13 = r19
        L_0x00e0:
            androidx.media3.b.a.aa r0 = new androidx.media3.b.a.aa
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.p132b.p133a.C2456aa.m6472c(java.io.File, long, long, androidx.media3.b.a.r):androidx.media3.b.a.aa");
    }

    /* renamed from: d */
    public static C2456aa m6473d(String str, long j, long j2) {
        return new C2456aa(str, j, j2, -9223372036854775807L, (File) null);
    }

    /* renamed from: e */
    public static File m6474e(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + ".v3.exo");
    }
}
