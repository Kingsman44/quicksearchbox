package com.google.android.libraries.search.p3028l;

import android.content.Context;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.search.l.b */
/* compiled from: PG */
public final class C38569b {

    /* renamed from: a */
    public static final /* synthetic */ int f101950a = 0;

    /* renamed from: b */
    private static final C59071e f101951b = C59071e.m91332i("com.google.android.libraries.search.l.b");

    /* renamed from: c */
    private static final Pattern f101952c = Pattern.compile("\\d+(\\.\\d+)+(\\.[a-z0-9]+)*");

    /* renamed from: a */
    public static void m67851a(Context context, String str) {
        m67852b(context, str, new C38568a(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0204 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f7 A[SYNTHETIC, Splitter:B:83:0x01f7] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0207 A[Catch:{ IOException -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020c A[Catch:{ IOException -> 0x0211 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m67852b(android.content.Context r18, java.lang.String r19, dagger.C68214a r20) {
        /*
            r1 = r19
            java.lang.System.loadLibrary(r19)     // Catch:{ UnsatisfiedLinkError -> 0x0006 }
            return
        L_0x0006:
            r0 = move-exception
            r2 = r0
            com.google.frameworks.client.a.a.b r3 = new com.google.frameworks.client.a.a.b
            com.google.frameworks.client.a.a.a r0 = com.google.frameworks.client.p4624a.p4625a.C61284a.NO_USER_DATA
            r3.<init>(r0, r1)
            com.google.common.f.e r0 = f101951b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "NativeLibraryLoader"
            r0.mo56378ag(r4, r5)
            java.lang.String r4 = "#loadLibrary UnsatisfiedLinkError for %s"
            r6 = 53130(0xcf8a, float:7.4451E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r2)).mo56372aa(r6)).mo56389s(r4, r3)
            android.content.pm.ApplicationInfo r0 = r18.getApplicationInfo()
            java.lang.String r4 = r0.sourceDir
            java.lang.Object r0 = r20.mo27525b()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "lib"
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = ".so"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.io.File r6 = r18.getFilesDir()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.io.File.separator
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            r8.append(r0)
            java.lang.String r6 = r8.toString()
            java.lang.String r7 = java.io.File.separator
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            java.io.File r8 = new java.io.File
            r8.<init>(r7)
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x0086
            boolean r8 = r8.canWrite()
            if (r8 != 0) goto L_0x0086
            goto L_0x021f
        L_0x0086:
            java.io.File r8 = new java.io.File
            r8.<init>(r6)
            boolean r6 = r8.exists()
            if (r6 != 0) goto L_0x009a
            boolean r6 = r8.mkdirs()
            if (r6 != 0) goto L_0x009a
        L_0x0097:
            r7 = 0
            goto L_0x021f
        L_0x009a:
            java.io.File r6 = new java.io.File
            java.io.File r8 = r18.getFilesDir()
            java.lang.String r8 = r8.toString()
            r6.<init>(r8)
            java.io.File[] r6 = r6.listFiles()     // Catch:{ Exception -> 0x0138 }
            if (r6 == 0) goto L_0x014c
            int r10 = r6.length     // Catch:{ Exception -> 0x0138 }
            r11 = 0
        L_0x00af:
            if (r11 >= r10) goto L_0x014c
            r12 = r6[r11]     // Catch:{ Exception -> 0x0138 }
            java.lang.String r13 = r12.getName()     // Catch:{ Exception -> 0x0138 }
            boolean r14 = r12.isDirectory()     // Catch:{ Exception -> 0x0138 }
            if (r14 == 0) goto L_0x0130
            java.util.regex.Pattern r14 = f101952c     // Catch:{ Exception -> 0x0138 }
            java.util.regex.Matcher r14 = r14.matcher(r13)     // Catch:{ Exception -> 0x0138 }
            boolean r14 = r14.matches()     // Catch:{ Exception -> 0x0138 }
            if (r14 == 0) goto L_0x0130
            boolean r13 = r13.equals(r0)     // Catch:{ Exception -> 0x0138 }
            if (r13 != 0) goto L_0x0130
            java.io.File[] r13 = r12.listFiles()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r14 = "Failed to remove %s"
            if (r13 == 0) goto L_0x010a
            int r15 = r13.length     // Catch:{ Exception -> 0x0138 }
            r9 = 0
        L_0x00d9:
            if (r9 >= r15) goto L_0x010a
            r16 = r13[r9]     // Catch:{ Exception -> 0x0138 }
            boolean r17 = m67853c(r16)     // Catch:{ Exception -> 0x0138 }
            if (r17 != 0) goto L_0x0103
            com.google.common.f.e r17 = f101951b     // Catch:{ Exception -> 0x0138 }
            com.google.common.f.x r8 = r17.mo56225c()     // Catch:{ Exception -> 0x0138 }
            r20 = r0
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x0138 }
            r8.mo56378ag(r0, r5)     // Catch:{ Exception -> 0x0138 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ Exception -> 0x0138 }
            r0 = 53129(0xcf89, float:7.445E-41)
            com.google.common.f.x r0 = r8.mo56372aa(r0)     // Catch:{ Exception -> 0x0138 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = r16.getAbsolutePath()     // Catch:{ Exception -> 0x0138 }
            r0.mo56389s(r14, r8)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0105
        L_0x0103:
            r20 = r0
        L_0x0105:
            int r9 = r9 + 1
            r0 = r20
            goto L_0x00d9
        L_0x010a:
            r20 = r0
            boolean r0 = r12.delete()     // Catch:{ Exception -> 0x0138 }
            if (r0 != 0) goto L_0x0132
            com.google.common.f.e r0 = f101951b     // Catch:{ Exception -> 0x0138 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ Exception -> 0x0138 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x0138 }
            r0.mo56378ag(r8, r5)     // Catch:{ Exception -> 0x0138 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x0138 }
            r8 = 53128(0xcf88, float:7.4448E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r8)     // Catch:{ Exception -> 0x0138 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0138 }
            r0.mo56389s(r14, r8)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0132
        L_0x0130:
            r20 = r0
        L_0x0132:
            int r11 = r11 + 1
            r0 = r20
            goto L_0x00af
        L_0x0138:
            r0 = move-exception
            com.google.common.f.e r6 = f101951b
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r8, r5)
            java.lang.String r8 = "Failed to remove old libs, "
            r9 = 53127(0xcf87, float:7.4447E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r9)).mo56386p(r8)
        L_0x014c:
            java.lang.String[] r6 = android.os.Build.SUPPORTED_ABIS
            int r8 = r6.length
            r9 = 0
        L_0x0150:
            if (r9 >= r8) goto L_0x0215
            r0 = r6[r9]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0210 }
            r10.<init>()     // Catch:{ IOException -> 0x0210 }
            java.lang.String r11 = "lib/"
            r10.append(r11)     // Catch:{ IOException -> 0x0210 }
            r10.append(r0)     // Catch:{ IOException -> 0x0210 }
            java.lang.String r0 = "/"
            r10.append(r0)     // Catch:{ IOException -> 0x0210 }
            r10.append(r1)     // Catch:{ IOException -> 0x0210 }
            java.lang.String r0 = r10.toString()     // Catch:{ IOException -> 0x0210 }
            java.util.zip.ZipFile r10 = new java.util.zip.ZipFile     // Catch:{ all -> 0x01f1 }
            r10.<init>(r4)     // Catch:{ all -> 0x01f1 }
            java.util.zip.ZipEntry r11 = r10.getEntry(r0)     // Catch:{ all -> 0x01ef }
            java.lang.String r12 = " in "
            if (r11 == 0) goto L_0x01d2
            java.io.InputStream r11 = r10.getInputStream(r11)     // Catch:{ all -> 0x01ef }
            if (r11 == 0) goto L_0x01b5
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ all -> 0x01ef }
            r12.<init>(r11)     // Catch:{ all -> 0x01ef }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ all -> 0x01b2 }
            r11.<init>(r7)     // Catch:{ all -> 0x01b2 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01b0 }
        L_0x018e:
            int r13 = r12.read(r0)     // Catch:{ all -> 0x01b0 }
            r14 = -1
            if (r13 == r14) goto L_0x019a
            r14 = 0
            r11.write(r0, r14, r13)     // Catch:{ all -> 0x01b0 }
            goto L_0x018e
        L_0x019a:
            r11.flush()     // Catch:{ all -> 0x01b0 }
            r11.close()     // Catch:{ IOException -> 0x0210 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0210 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0210 }
            r11 = 0
            r0.setWritable(r11, r11)     // Catch:{ IOException -> 0x0210 }
            r12.close()     // Catch:{ IOException -> 0x0210 }
            r10.close()     // Catch:{ IOException -> 0x0210 }
            goto L_0x021f
        L_0x01b0:
            r0 = move-exception
            goto L_0x01f5
        L_0x01b2:
            r0 = move-exception
            r11 = 0
            goto L_0x01f5
        L_0x01b5:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x01ef }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ef }
            r13.<init>()     // Catch:{ all -> 0x01ef }
            java.lang.String r14 = "Null InputStream for "
            r13.append(r14)     // Catch:{ all -> 0x01ef }
            r13.append(r0)     // Catch:{ all -> 0x01ef }
            r13.append(r12)     // Catch:{ all -> 0x01ef }
            r13.append(r4)     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x01ef }
            r11.<init>(r0)     // Catch:{ all -> 0x01ef }
            throw r11     // Catch:{ all -> 0x01ef }
        L_0x01d2:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x01ef }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ef }
            r13.<init>()     // Catch:{ all -> 0x01ef }
            java.lang.String r14 = "Did not find "
            r13.append(r14)     // Catch:{ all -> 0x01ef }
            r13.append(r0)     // Catch:{ all -> 0x01ef }
            r13.append(r12)     // Catch:{ all -> 0x01ef }
            r13.append(r4)     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x01ef }
            r11.<init>(r0)     // Catch:{ all -> 0x01ef }
            throw r11     // Catch:{ all -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            goto L_0x01f3
        L_0x01f1:
            r0 = move-exception
            r10 = 0
        L_0x01f3:
            r11 = 0
            r12 = 0
        L_0x01f5:
            if (r11 == 0) goto L_0x0204
            r11.close()     // Catch:{ IOException -> 0x0210 }
            java.io.File r11 = new java.io.File     // Catch:{ IOException -> 0x0210 }
            r11.<init>(r7)     // Catch:{ IOException -> 0x0210 }
            r13 = 0
            r11.setWritable(r13, r13)     // Catch:{ IOException -> 0x0211 }
            goto L_0x0205
        L_0x0204:
            r13 = 0
        L_0x0205:
            if (r12 == 0) goto L_0x020a
            r12.close()     // Catch:{ IOException -> 0x0211 }
        L_0x020a:
            if (r10 == 0) goto L_0x020f
            r10.close()     // Catch:{ IOException -> 0x0211 }
        L_0x020f:
            throw r0     // Catch:{ IOException -> 0x0211 }
        L_0x0210:
            r13 = 0
        L_0x0211:
            int r9 = r9 + 1
            goto L_0x0150
        L_0x0215:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            m67853c(r0)
            goto L_0x0097
        L_0x021f:
            if (r7 == 0) goto L_0x0238
            com.google.common.f.e r0 = f101951b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r5)
            java.lang.String r1 = "#loadLibrary failed to load %s via loadLibrary, although succeeded with #getNativeLib"
            r2 = 53131(0xcf8b, float:7.4452E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56389s(r1, r3)
            java.lang.System.load(r7)
            return
        L_0x0238:
            com.google.common.f.e r0 = f101951b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r5)
            java.lang.String r1 = "#loadLibrary and #getNativeLib failed for %s"
            r4 = 53132(0xcf8c, float:7.4454E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r1, r3)
            goto L_0x024d
        L_0x024c:
            throw r2
        L_0x024d:
            goto L_0x024c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p3028l.C38569b.m67852b(android.content.Context, java.lang.String, dagger.a):void");
    }

    /* renamed from: c */
    private static boolean m67853c(File file) {
        if (!file.exists()) {
            return false;
        }
        try {
            file.setWritable(true, true);
            return file.delete();
        } catch (SecurityException e) {
            C59104x c = f101951b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NativeLibraryLoader");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(53133)).mo56386p("Failed to remove old lib, ");
            return false;
        }
    }
}
