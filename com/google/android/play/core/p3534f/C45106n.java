package com.google.android.play.core.p3534f;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.android.play.core.f.n */
/* compiled from: PG */
public final class C45106n {

    /* renamed from: b */
    public static final /* synthetic */ int f117774b = 0;

    /* renamed from: c */
    private static final Pattern f117775c = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a */
    public final C45097e f117776a;

    public C45106n(C45097e eVar) {
        this.f117776a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f7 A[SYNTHETIC, Splitter:B:33:0x00f7] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m80288a(com.google.android.play.core.p3534f.C45112t r13, com.google.android.play.core.p3534f.C45103k r14) {
        /*
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00f3 }
            java.io.File r1 = r13.mo48919a()     // Catch:{ IOException -> 0x00f3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00f3 }
            java.lang.String r13 = r13.mo48920b()     // Catch:{ IOException -> 0x00f1 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x00f1 }
            r1.<init>()     // Catch:{ IOException -> 0x00f1 }
            java.util.Enumeration r2 = r0.entries()     // Catch:{ IOException -> 0x00f1 }
        L_0x0016:
            boolean r3 = r2.hasMoreElements()     // Catch:{ IOException -> 0x00f1 }
            r4 = 2
            java.lang.String r5 = "SplitCompat"
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x006a
            java.lang.Object r3 = r2.nextElement()     // Catch:{ IOException -> 0x00f1 }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r8 = r3.getName()     // Catch:{ IOException -> 0x00f1 }
            java.util.regex.Pattern r9 = f117775c     // Catch:{ IOException -> 0x00f1 }
            java.util.regex.Matcher r8 = r9.matcher(r8)     // Catch:{ IOException -> 0x00f1 }
            boolean r9 = r8.matches()     // Catch:{ IOException -> 0x00f1 }
            if (r9 == 0) goto L_0x0016
            java.lang.String r9 = r8.group(r7)     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r8 = r8.group(r4)     // Catch:{ IOException -> 0x00f1 }
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x00f1 }
            r10[r6] = r13     // Catch:{ IOException -> 0x00f1 }
            r10[r7] = r8     // Catch:{ IOException -> 0x00f1 }
            r10[r4] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r4 = "NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'"
            java.lang.String r4 = java.lang.String.format(r4, r10)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r4)     // Catch:{ IOException -> 0x00f1 }
            java.lang.Object r4 = r1.get(r9)     // Catch:{ IOException -> 0x00f1 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ IOException -> 0x00f1 }
            if (r4 != 0) goto L_0x0061
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x00f1 }
            r4.<init>()     // Catch:{ IOException -> 0x00f1 }
            r1.put(r9, r4)     // Catch:{ IOException -> 0x00f1 }
        L_0x0061:
            com.google.android.play.core.f.m r5 = new com.google.android.play.core.f.m     // Catch:{ IOException -> 0x00f1 }
            r5.<init>(r3, r8)     // Catch:{ IOException -> 0x00f1 }
            r4.add(r5)     // Catch:{ IOException -> 0x00f1 }
            goto L_0x0016
        L_0x006a:
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ IOException -> 0x00f1 }
            r13.<init>()     // Catch:{ IOException -> 0x00f1 }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x00f1 }
            int r3 = r2.length     // Catch:{ IOException -> 0x00f1 }
            r8 = 0
        L_0x0073:
            if (r8 >= r3) goto L_0x00e1
            r9 = r2[r8]     // Catch:{ IOException -> 0x00f1 }
            boolean r10 = r1.containsKey(r9)     // Catch:{ IOException -> 0x00f1 }
            if (r10 == 0) goto L_0x00d1
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x00f1 }
            r10[r6] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = "NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI"
            java.lang.String r10 = java.lang.String.format(r11, r10)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r10)     // Catch:{ IOException -> 0x00f1 }
            java.lang.Object r10 = r1.get(r9)     // Catch:{ IOException -> 0x00f1 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ IOException -> 0x00f1 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x00f1 }
        L_0x0094:
            boolean r11 = r10.hasNext()     // Catch:{ IOException -> 0x00f1 }
            if (r11 == 0) goto L_0x00de
            java.lang.Object r11 = r10.next()     // Catch:{ IOException -> 0x00f1 }
            com.google.android.play.core.f.m r11 = (com.google.android.play.core.p3534f.C45105m) r11     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r12 = r11.f117772a     // Catch:{ IOException -> 0x00f1 }
            boolean r12 = r13.containsKey(r12)     // Catch:{ IOException -> 0x00f1 }
            if (r12 == 0) goto L_0x00ba
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = r11.f117772a     // Catch:{ IOException -> 0x00f1 }
            r12[r6] = r11     // Catch:{ IOException -> 0x00f1 }
            r12[r7] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = "NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI"
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r11)     // Catch:{ IOException -> 0x00f1 }
            goto L_0x0094
        L_0x00ba:
            java.lang.String r12 = r11.f117772a     // Catch:{ IOException -> 0x00f1 }
            r13.put(r12, r11)     // Catch:{ IOException -> 0x00f1 }
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = r11.f117772a     // Catch:{ IOException -> 0x00f1 }
            r12[r6] = r11     // Catch:{ IOException -> 0x00f1 }
            r12[r7] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r11 = "NativeLibraryExtractor: using library %s for ABI %s"
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r11)     // Catch:{ IOException -> 0x00f1 }
            goto L_0x0094
        L_0x00d1:
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x00f1 }
            r10[r6] = r9     // Catch:{ IOException -> 0x00f1 }
            java.lang.String r9 = "NativeLibraryExtractor: there are no native libraries for supported ABI %s"
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ IOException -> 0x00f1 }
            android.util.Log.d(r5, r9)     // Catch:{ IOException -> 0x00f1 }
        L_0x00de:
            int r8 = r8 + 1
            goto L_0x0073
        L_0x00e1:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ IOException -> 0x00f1 }
            java.util.Collection r13 = r13.values()     // Catch:{ IOException -> 0x00f1 }
            r1.<init>(r13)     // Catch:{ IOException -> 0x00f1 }
            r14.mo48938a(r0, r1)     // Catch:{ IOException -> 0x00f1 }
            r0.close()     // Catch:{ IOException -> 0x00f1 }
            return
        L_0x00f1:
            r13 = move-exception
            goto L_0x00f5
        L_0x00f3:
            r13 = move-exception
            r0 = 0
        L_0x00f5:
            if (r0 == 0) goto L_0x00ff
            r0.close()     // Catch:{ IOException -> 0x00fb }
            goto L_0x00ff
        L_0x00fb:
            r14 = move-exception
            com.google.android.play.core.p3534f.C45098f.m80281a(r13, r14)
        L_0x00ff:
            goto L_0x0101
        L_0x0100:
            throw r13
        L_0x0101:
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3534f.C45106n.m80288a(com.google.android.play.core.f.t, com.google.android.play.core.f.k):void");
    }

    /* renamed from: b */
    public final void mo48939b(C45112t tVar, Set set, C45104l lVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C45105m mVar = (C45105m) it.next();
            C45097e eVar = this.f117776a;
            String b = tVar.mo48920b();
            File a = C45097e.m80266a(eVar.mo48930c(b), mVar.f117772a);
            boolean z = false;
            if (a.exists() && a.length() == mVar.f117773b.getSize() && C45097e.m80270m(a)) {
                z = true;
            }
            lVar.mo48937a(mVar, a, z);
        }
    }
}
