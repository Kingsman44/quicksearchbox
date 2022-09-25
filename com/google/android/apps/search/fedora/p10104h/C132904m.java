package com.google.android.apps.search.fedora.p10104h;

import android.content.Context;
import android.util.Log;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.C60790c;
import java.io.File;
import java.io.IOException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.fedora.h.m */
/* compiled from: PG */
public final class C132904m {

    /* renamed from: a */
    public static final C59071e f362546a = C59071e.m91332i("com.google.android.apps.search.fedora.h.m");

    /* renamed from: b */
    public final Context f362547b;

    public C132904m(Context context) {
        this.f362547b = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:20|21|(1:23)|24|25|26|28) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0089 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m215882b(java.io.File r7, java.io.File r8, java.io.FileFilter r9) {
        /*
            java.io.File[] r7 = r7.listFiles()
            if (r7 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L_0x000a:
            if (r2 >= r0) goto L_0x00b1
            r3 = r7[r2]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L_0x0022
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.getName()
            r4.<init>(r8, r5)
            m215882b(r3, r4, r9)
            goto L_0x00ad
        L_0x0022:
            boolean r4 = r9.accept(r3)
            if (r4 == 0) goto L_0x00ad
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.getName()
            r4.<init>(r8, r5)
            r3.getAbsolutePath()
            r4.getAbsolutePath()
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x0040
            org.p5610a.p5611a.p5612a.C71978d.m105271l(r4)
        L_0x0040:
            org.p5610a.p5611a.p5612a.C71978d.m105269j(r3, r8)
            boolean r4 = r8.exists()
            if (r4 != 0) goto L_0x004c
            org.p5610a.p5611a.p5612a.C71978d.m105274o(r8)
        L_0x004c:
            java.lang.String r4 = "destDir"
            org.p5610a.p5611a.p5612a.C71978d.m105276q(r8, r4)
            org.p5610a.p5611a.p5612a.C71978d.m105275p(r8, r4)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.getName()
            r4.<init>(r8, r5)
            r5 = 1
            java.nio.file.CopyOption[] r5 = new java.nio.file.CopyOption[r5]
            java.nio.file.StandardCopyOption r6 = java.nio.file.StandardCopyOption.COPY_ATTRIBUTES
            r5[r1] = r6
            org.p5610a.p5611a.p5612a.C71978d.m105269j(r3, r4)
            java.lang.String r6 = "srcFile"
            org.p5610a.p5611a.p5612a.C71978d.m105277r(r3, r6)
            java.lang.String r6 = "destFile"
            org.p5610a.p5611a.p5612a.C71978d.m105266g(r4, r6)
            boolean r6 = r3.renameTo(r4)
            if (r6 != 0) goto L_0x00ad
            org.p5610a.p5611a.p5612a.C71978d.m105263d(r3, r4, r5)
            boolean r5 = r3.delete()
            if (r5 != 0) goto L_0x00ad
            boolean r7 = r4.isDirectory()     // Catch:{ Exception -> 0x0089 }
            if (r7 == 0) goto L_0x0089
            org.p5610a.p5611a.p5612a.C71978d.m105262c(r4)     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            r4.delete()     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to delete original file '"
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r9 = "' after copy to '"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = "'"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x00ad:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.fedora.p10104h.C132904m.m215882b(java.io.File, java.io.File, java.io.FileFilter):void");
    }

    /* renamed from: a */
    public final File mo110932a(String str) {
        String[] strArr = new String[4];
        Context context = this.f362547b;
        C69664n.m101061g(context, "<this>");
        File file = new File(context.getNoBackupFilesDir(), "fedora");
        if (!file.exists() && !file.mkdirs()) {
            Log.e("FileUtils", "Directory not created");
        }
        strArr[0] = file.getAbsolutePath();
        strArr[1] = "sheldon/p13n";
        strArr[2] = str;
        strArr[3] = "en-US";
        return new File(C60790c.m92793a(strArr));
    }

    /* renamed from: c */
    public final void mo110933c(File file, File file2) {
        if (file.exists()) {
            file.getAbsolutePath();
            file2.getAbsolutePath();
            m215882b(file, file2, C132903l.f362545a);
            return;
        }
        ((C59052c) ((C59052c) f362546a.mo56225c()).mo56372aa(39888)).mo56386p("Brella out dir is absent");
        file.getAbsolutePath();
        throw new IOException("Brella out dir doesn't exist.");
    }
}
