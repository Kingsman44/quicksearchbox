package com.p278b.p279a;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.b.a.g */
/* compiled from: PG */
public final class C5498g {

    /* renamed from: a */
    protected final Set f16647a = new HashSet();

    /* renamed from: b */
    protected C5495d f16648b;

    protected C5498g() {
    }

    /* renamed from: c */
    protected static final File m14214c(Context context) {
        return context.getDir("lib", 0);
    }

    /* renamed from: e */
    protected static final File m14215e(Context context, String str) {
        String a = C5499h.m14220a(str);
        if (C5500i.m14221a((CharSequence) null)) {
            return new File(m14214c(context), a);
        }
        return new File(m14214c(context), String.valueOf(a).concat(".null"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01d7, code lost:
        mo11831a("FATAL! Couldn't extract the library from the APK!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r3 = r4.f16644a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        r12 = new java.util.zip.ZipFile(new java.io.File(r14), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0196, code lost:
        com.p278b.p279a.C5493b.m14210a(r3);
        com.p278b.p279a.C5493b.m14210a(r7);
        r0.setReadable(true, false);
        r0.setExecutable(true, false);
        r0.setWritable(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r3 = r4.f16644a;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0209 A[SYNTHETIC, Splitter:B:139:0x0209] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14216f(android.content.Context r19, java.lang.String r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            java.util.Set r0 = r1.f16647a
            boolean r0 = r0.contains(r2)
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x020f
            r5 = 2
            r6 = 0
            java.lang.System.loadLibrary(r20)     // Catch:{ UnsatisfiedLinkError -> 0x0024 }
            java.util.Set r0 = r1.f16647a     // Catch:{ UnsatisfiedLinkError -> 0x0024 }
            r0.add(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0024 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ UnsatisfiedLinkError -> 0x0024 }
            r0[r3] = r2     // Catch:{ UnsatisfiedLinkError -> 0x0024 }
            r0[r4] = r6     // Catch:{ UnsatisfiedLinkError -> 0x0024 }
            java.lang.String r7 = "%s (%s) was loaded normally!"
            r1.mo11832b(r7, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0024 }
            return
        L_0x0024:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r7[r3] = r0
            java.lang.String r0 = "Loading the library normally failed: %s"
            r1.mo11832b(r0, r7)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r2
            r0[r4] = r6
            java.lang.String r7 = "%s (%s) was not loaded normally, re-linking..."
            r1.mo11832b(r7, r0)
            java.io.File r0 = m14215e(r19, r20)
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x0049
            goto L_0x01df
        L_0x0049:
            java.io.File r7 = m14214c(r19)
            java.io.File r8 = m14215e(r19, r20)
            java.lang.String r9 = com.p278b.p279a.C5499h.m14220a(r20)
            com.b.a.f r10 = new com.b.a.f
            r10.<init>(r9)
            java.io.File[] r7 = r7.listFiles(r10)
            if (r7 != 0) goto L_0x0061
            goto L_0x007b
        L_0x0061:
            int r9 = r7.length
            r10 = 0
        L_0x0063:
            if (r10 >= r9) goto L_0x007b
            r11 = r7[r10]
            java.lang.String r12 = r11.getAbsolutePath()
            java.lang.String r13 = r8.getAbsolutePath()
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0078
            r11.delete()
        L_0x0078:
            int r10 = r10 + 1
            goto L_0x0063
        L_0x007b:
            java.lang.String[] r7 = android.os.Build.SUPPORTED_ABIS
            int r7 = r7.length
            if (r7 <= 0) goto L_0x0083
            java.lang.String[] r7 = android.os.Build.SUPPORTED_ABIS
            goto L_0x009c
        L_0x0083:
            java.lang.String r7 = android.os.Build.CPU_ABI2
            boolean r7 = com.p278b.p279a.C5500i.m14221a(r7)
            if (r7 != 0) goto L_0x0096
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r8 = android.os.Build.CPU_ABI
            r7[r3] = r8
            java.lang.String r8 = android.os.Build.CPU_ABI2
            r7[r4] = r8
            goto L_0x009c
        L_0x0096:
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.String r8 = android.os.Build.CPU_ABI
            r7[r3] = r8
        L_0x009c:
            java.lang.String r8 = com.p278b.p279a.C5499h.m14220a(r20)
            android.content.pm.ApplicationInfo r9 = r19.getApplicationInfo()     // Catch:{ all -> 0x0204 }
            java.lang.String[] r10 = r9.splitSourceDirs     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x00c0
            java.lang.String[] r10 = r9.splitSourceDirs     // Catch:{ all -> 0x0204 }
            int r10 = r10.length     // Catch:{ all -> 0x0204 }
            if (r10 == 0) goto L_0x00c0
            java.lang.String[] r10 = r9.splitSourceDirs     // Catch:{ all -> 0x0204 }
            int r10 = r10.length     // Catch:{ all -> 0x0204 }
            int r10 = r10 + r4
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0204 }
            java.lang.String r11 = r9.sourceDir     // Catch:{ all -> 0x0204 }
            r10[r3] = r11     // Catch:{ all -> 0x0204 }
            java.lang.String[] r11 = r9.splitSourceDirs     // Catch:{ all -> 0x0204 }
            java.lang.String[] r9 = r9.splitSourceDirs     // Catch:{ all -> 0x0204 }
            int r9 = r9.length     // Catch:{ all -> 0x0204 }
            java.lang.System.arraycopy(r11, r3, r10, r4, r9)     // Catch:{ all -> 0x0204 }
            goto L_0x00c6
        L_0x00c0:
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x0204 }
            java.lang.String r9 = r9.sourceDir     // Catch:{ all -> 0x0204 }
            r10[r3] = r9     // Catch:{ all -> 0x0204 }
        L_0x00c6:
            int r9 = r10.length     // Catch:{ all -> 0x0204 }
            r12 = r6
            r11 = 0
        L_0x00c9:
            r13 = 5
            if (r11 >= r9) goto L_0x0141
            r14 = r10[r11]     // Catch:{ all -> 0x0204 }
            r15 = 0
        L_0x00cf:
            int r16 = r15 + 1
            if (r15 >= r13) goto L_0x00e8
            java.util.zip.ZipFile r15 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00e3 }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00df }
            r6.<init>(r14)     // Catch:{ all -> 0x00df }
            r15.<init>(r6, r4)     // Catch:{ all -> 0x00df }
            r12 = r15
            goto L_0x00e8
        L_0x00df:
            r0 = move-exception
            r2 = 0
            goto L_0x0206
        L_0x00e3:
            r15 = r16
            r6 = 0
            goto L_0x00cf
        L_0x00e8:
            if (r12 != 0) goto L_0x00eb
            goto L_0x013a
        L_0x00eb:
            r6 = 0
        L_0x00ec:
            int r15 = r6 + 1
            if (r6 >= r13) goto L_0x0137
            int r6 = r7.length     // Catch:{  }
            r13 = 0
        L_0x00f2:
            if (r13 >= r6) goto L_0x0134
            r4 = r7[r13]     // Catch:{  }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{  }
            r3.<init>()     // Catch:{  }
            java.lang.String r5 = "lib"
            r3.append(r5)     // Catch:{  }
            char r5 = java.io.File.separatorChar     // Catch:{  }
            r3.append(r5)     // Catch:{  }
            r3.append(r4)     // Catch:{  }
            char r4 = java.io.File.separatorChar     // Catch:{  }
            r3.append(r4)     // Catch:{  }
            r3.append(r8)     // Catch:{  }
            java.lang.String r3 = r3.toString()     // Catch:{  }
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{  }
            r4 = 0
            r5[r4] = r3     // Catch:{  }
            r4 = 1
            r5[r4] = r14     // Catch:{  }
            java.lang.String r4 = "Looking for %s in APK %s..."
            r1.mo11832b(r4, r5)     // Catch:{  }
            java.util.zip.ZipEntry r3 = r12.getEntry(r3)     // Catch:{  }
            if (r3 == 0) goto L_0x012e
            com.b.a.a r4 = new com.b.a.a     // Catch:{  }
            r4.<init>(r12, r3)     // Catch:{  }
            goto L_0x0142
        L_0x012e:
            int r13 = r13 + 1
            r3 = 0
            r4 = 1
            r5 = 2
            goto L_0x00f2
        L_0x0134:
            r6 = r15
            r13 = 5
            goto L_0x00ec
        L_0x0137:
            r12.close()     // Catch:{ IOException -> 0x013a }
        L_0x013a:
            int r11 = r11 + 1
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 0
            goto L_0x00c9
        L_0x0141:
            r4 = 0
        L_0x0142:
            if (r4 == 0) goto L_0x01fb
            r3 = 0
        L_0x0145:
            int r5 = r3 + 1
            r6 = 5
            if (r3 >= r6) goto L_0x01d7
            r3 = 1
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0201 }
            r3 = 0
            r7[r3] = r8     // Catch:{ all -> 0x0201 }
            java.lang.String r3 = "Found %s! Extracting..."
            r1.mo11832b(r3, r7)     // Catch:{ all -> 0x0201 }
            boolean r3 = r0.exists()     // Catch:{ IOException -> 0x01d3 }
            if (r3 != 0) goto L_0x0163
            boolean r3 = r0.createNewFile()     // Catch:{ IOException -> 0x01d3 }
            if (r3 != 0) goto L_0x0163
            goto L_0x01d4
        L_0x0163:
            java.util.zip.ZipFile r3 = r4.f16644a     // Catch:{ FileNotFoundException -> 0x01cd, IOException -> 0x01c7, all -> 0x01bc }
            java.util.zip.ZipEntry r7 = r4.f16645b     // Catch:{ FileNotFoundException -> 0x01cd, IOException -> 0x01c7, all -> 0x01bc }
            java.io.InputStream r3 = r3.getInputStream(r7)     // Catch:{ FileNotFoundException -> 0x01cd, IOException -> 0x01c7, all -> 0x01bc }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x01ce, IOException -> 0x01c8, all -> 0x01b9 }
            r7.<init>(r0)     // Catch:{ FileNotFoundException -> 0x01ce, IOException -> 0x01c8, all -> 0x01b9 }
            r9 = 4096(0x1000, float:5.74E-42)
            byte[] r9 = new byte[r9]     // Catch:{ FileNotFoundException -> 0x01cf, IOException -> 0x01c9, all -> 0x01b4 }
            r10 = 0
        L_0x0176:
            int r12 = r3.read(r9)     // Catch:{ FileNotFoundException -> 0x01cf, IOException -> 0x01c9, all -> 0x01b4 }
            r13 = -1
            if (r12 != r13) goto L_0x01ad
            r7.flush()     // Catch:{ FileNotFoundException -> 0x01cf, IOException -> 0x01c9, all -> 0x01b4 }
            java.io.FileDescriptor r9 = r7.getFD()     // Catch:{ FileNotFoundException -> 0x01cf, IOException -> 0x01c9, all -> 0x01b4 }
            r9.sync()     // Catch:{ FileNotFoundException -> 0x01cf, IOException -> 0x01c9, all -> 0x01b4 }
            long r12 = r0.length()     // Catch:{ FileNotFoundException -> 0x01cf, IOException -> 0x01c9, all -> 0x01b4 }
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0196
            com.p278b.p279a.C5493b.m14210a(r3)     // Catch:{ all -> 0x0201 }
        L_0x0192:
            com.p278b.p279a.C5493b.m14210a(r7)     // Catch:{ all -> 0x0201 }
            goto L_0x01d4
        L_0x0196:
            com.p278b.p279a.C5493b.m14210a(r3)     // Catch:{ all -> 0x0201 }
            com.p278b.p279a.C5493b.m14210a(r7)     // Catch:{ all -> 0x0201 }
            r3 = 0
            r5 = 1
            r0.setReadable(r5, r3)     // Catch:{ all -> 0x0201 }
            r0.setExecutable(r5, r3)     // Catch:{ all -> 0x0201 }
            r0.setWritable(r5)     // Catch:{ all -> 0x0201 }
            java.util.zip.ZipFile r3 = r4.f16644a     // Catch:{ IOException -> 0x01df }
        L_0x01a9:
            r3.close()     // Catch:{ IOException -> 0x01df }
            goto L_0x01df
        L_0x01ad:
            r13 = 0
            r7.write(r9, r13, r12)     // Catch:{ FileNotFoundException -> 0x01cf, IOException -> 0x01c9, all -> 0x01b4 }
            long r12 = (long) r12
            long r10 = r10 + r12
            goto L_0x0176
        L_0x01b4:
            r0 = move-exception
            r6 = r3
            r17 = r7
            goto L_0x01c0
        L_0x01b9:
            r0 = move-exception
            r6 = r3
            goto L_0x01be
        L_0x01bc:
            r0 = move-exception
            r6 = 0
        L_0x01be:
            r17 = 0
        L_0x01c0:
            com.p278b.p279a.C5493b.m14210a(r6)     // Catch:{ all -> 0x0201 }
            com.p278b.p279a.C5493b.m14210a(r17)     // Catch:{ all -> 0x0201 }
            throw r0     // Catch:{ all -> 0x0201 }
        L_0x01c7:
            r3 = 0
        L_0x01c8:
            r7 = 0
        L_0x01c9:
            com.p278b.p279a.C5493b.m14210a(r3)     // Catch:{ all -> 0x0201 }
            goto L_0x0192
        L_0x01cd:
            r3 = 0
        L_0x01ce:
            r7 = 0
        L_0x01cf:
            com.p278b.p279a.C5493b.m14210a(r3)     // Catch:{ all -> 0x0201 }
            goto L_0x0192
        L_0x01d3:
        L_0x01d4:
            r3 = r5
            goto L_0x0145
        L_0x01d7:
            java.lang.String r3 = "FATAL! Couldn't extract the library from the APK!"
            r1.mo11831a(r3)     // Catch:{ all -> 0x0201 }
            java.util.zip.ZipFile r3 = r4.f16644a     // Catch:{ IOException -> 0x01df }
            goto L_0x01a9
        L_0x01df:
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.System.load(r0)
            java.util.Set r0 = r1.f16647a
            r0.add(r2)
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r2
            r2 = 0
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "%s (%s) was re-linked!"
            r1.mo11832b(r2, r0)
            return
        L_0x01fb:
            com.b.a.c r0 = new com.b.a.c     // Catch:{ all -> 0x0201 }
            r0.<init>(r8)     // Catch:{ all -> 0x0201 }
            throw r0     // Catch:{ all -> 0x0201 }
        L_0x0201:
            r0 = move-exception
            r6 = r4
            goto L_0x0207
        L_0x0204:
            r0 = move-exception
            r2 = r6
        L_0x0206:
            r6 = r2
        L_0x0207:
            if (r6 == 0) goto L_0x020e
            java.util.zip.ZipFile r2 = r6.f16644a     // Catch:{ IOException -> 0x020e }
            r2.close()     // Catch:{ IOException -> 0x020e }
        L_0x020e:
            throw r0
        L_0x020f:
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "%s already loaded previously!"
            r1.mo11832b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p278b.p279a.C5498g.m14216f(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo11831a(String str) {
        C5495d dVar = this.f16648b;
        if (dVar != null) {
            dVar.mo11829a(str);
        }
    }

    /* renamed from: b */
    public final void mo11832b(String str, Object... objArr) {
        mo11831a(String.format(Locale.US, str, objArr));
    }

    /* renamed from: d */
    public final void mo11833d(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C5500i.m14221a(str)) {
            mo11832b("Beginning load of %s...", str);
            m14216f(context, str);
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }
}
