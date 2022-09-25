package com.google.android.libraries.performance.primes.metrics.storage;

import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.performance.primes.metrics.storage.r */
/* compiled from: PG */
public final /* synthetic */ class C31576r implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31577s f85005a;

    /* renamed from: b */
    public final /* synthetic */ boolean f85006b;

    public /* synthetic */ C31576r(C31577s sVar, boolean z) {
        this.f85005a = sVar;
        this.f85006b = z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:37|38|(1:40)(1:41)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:88|89|105|106|(2:108|109)|117|119|120) */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0326, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.libraries.performance.primes.metrics.storage.C31564f.f84998a.mo56226d()).mo56372aa(50420)).mo56386p("Failed to use package manager getting data directory from context instead.");
        r3 = r7.getFilesDir();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01bc, code lost:
        if (r3 != null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01be, code lost:
        r3 = r3.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c3, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01e6, code lost:
        if (r7.getCanonicalPath().equals(r3.getCanonicalPath()) == false) goto L_0x01f8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x0325 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x01aa */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0305 A[SYNTHETIC, Splitter:B:108:0x0305] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0365 A[Catch:{ Exception -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x038a A[Catch:{ Exception -> 0x042e }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0358 A[EDGE_INSN: B:170:0x0358->B:128:0x0358 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x037b A[EDGE_INSN: B:179:0x037b->B:136:0x037b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03e7 A[EDGE_INSN: B:184:0x03e7->B:145:0x03e7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x021e A[Catch:{ Exception -> 0x0430 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r20 = this;
            r1 = r20
            com.google.android.libraries.performance.primes.metrics.storage.s r2 = r1.f85005a
            boolean r0 = r1.f85006b
            dagger.a r3 = r2.f85010d
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.libraries.performance.primes.metrics.storage.p r3 = (com.google.android.libraries.performance.primes.metrics.storage.C31574p) r3
            boolean r3 = r3.mo37259d()
            if (r0 == r3) goto L_0x0018
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04b2
        L_0x0018:
            android.app.Application r0 = r2.f85009c
            boolean r0 = com.google.android.libraries.directboot.C20674d.m38856e(r0)
            if (r0 != 0) goto L_0x0024
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04b2
        L_0x0024:
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()
            com.google.android.libraries.performance.primes.g.b r0 = r2.f85011e
            long r3 = com.google.android.libraries.performance.primes.metrics.storage.C31577s.f85007a
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()
            android.content.Context r5 = r0.f84155a
            boolean r5 = com.google.android.libraries.directboot.C20674d.m38856e(r5)
            java.lang.String r6 = "primes.packageMetric.lastSendTime"
            if (r5 != 0) goto L_0x0039
            goto L_0x007c
        L_0x0039:
            android.content.Context r5 = r0.f84155a
            boolean r5 = com.google.android.libraries.directboot.C20674d.m38856e(r5)
            r7 = -1
            if (r5 == 0) goto L_0x0050
            g.a.a r5 = r0.f84157c
            java.lang.Object r5 = r5.mo17428b()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            long r9 = r5.getLong(r6, r7)
            goto L_0x0051
        L_0x0050:
            r9 = r7
        L_0x0051:
            com.google.android.libraries.f.a r5 = r0.f84156b
            long r11 = r5.mo26871c()
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x006f
            g.a.a r0 = r0.f84157c
            java.lang.Object r0 = r0.mo17428b()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r6)
            r0.commit()
            r9 = r7
        L_0x006f:
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x007c
            long r9 = r9 + r3
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x007c
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04b2
        L_0x007c:
            com.google.android.libraries.performance.primes.metrics.b.m r0 = r2.f85008b
            r3 = 0
            boolean r0 = r0.mo37024d(r3)
            if (r0 != 0) goto L_0x0089
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x04b2
        L_0x0089:
            android.app.Application r0 = r2.f85009c
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()
            android.content.pm.PackageStats r0 = com.google.android.libraries.performance.primes.metrics.storage.C31568j.m58856a(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "PackageStats capture failed."
            r0.<init>(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x04b2
        L_0x00a1:
            j.a.i.b.a.ej r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej.f190415x
            com.google.protobuf.bn r4 = r4.createBuilder()
            j.a.i.b.a.ei r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei) r4
            j.a.i.b.a.du r5 = p5535j.p5536a.p5562i.p5568b.p5569a.C71292du.f190364k
            com.google.protobuf.bn r5 = r5.createBuilder()
            j.a.i.b.a.dp r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71287dp) r5
            long r7 = r0.cacheSize
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            j.a.i.b.a.du r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r9
            int r10 = r9.f190366a
            r11 = 1
            r10 = r10 | r11
            r9.f190366a = r10
            r9.f190367b = r7
            long r7 = r0.codeSize
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            j.a.i.b.a.du r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r9
            int r10 = r9.f190366a
            r10 = r10 | 2
            r9.f190366a = r10
            r9.f190368c = r7
            long r7 = r0.dataSize
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            j.a.i.b.a.du r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r9
            int r10 = r9.f190366a
            r10 = r10 | 4
            r9.f190366a = r10
            r9.f190369d = r7
            long r7 = r0.externalCacheSize
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            j.a.i.b.a.du r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r9
            int r10 = r9.f190366a
            r10 = r10 | 8
            r9.f190366a = r10
            r9.f190370e = r7
            long r7 = r0.externalCodeSize
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            j.a.i.b.a.du r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r9
            int r10 = r9.f190366a
            r10 = r10 | 16
            r9.f190366a = r10
            r9.f190371f = r7
            long r7 = r0.externalDataSize
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            j.a.i.b.a.du r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r9
            int r10 = r9.f190366a
            r10 = r10 | 32
            r9.f190366a = r10
            r9.f190372g = r7
            long r7 = r0.externalMediaSize
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            j.a.i.b.a.du r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r9
            int r10 = r9.f190366a
            r10 = r10 | 64
            r9.f190366a = r10
            r9.f190373h = r7
            long r7 = r0.externalObbSize
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            j.a.i.b.a.du r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r0
            int r9 = r0.f190366a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r0.f190366a = r9
            r0.f190374i = r7
            com.google.protobuf.bv r0 = r5.build()
            j.a.i.b.a.du r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            r5 = r0
            j.a.i.b.a.dp r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71287dp) r5
            dagger.a r0 = r2.f85010d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.performance.primes.metrics.storage.p r0 = (com.google.android.libraries.performance.primes.metrics.storage.C31574p) r0
            com.google.common.base.ax r0 = r0.mo37258c()
            boolean r7 = r0.mo56113h()
            if (r7 == 0) goto L_0x045a
            java.lang.Object r7 = r0.mo56107c()
            com.google.android.libraries.performance.primes.metrics.storage.i r7 = (com.google.android.libraries.performance.primes.metrics.storage.C31567i) r7
            boolean r7 = r7.mo36980b()
            if (r7 == 0) goto L_0x045a
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.performance.primes.metrics.storage.i r0 = (com.google.android.libraries.performance.primes.metrics.storage.C31567i) r0
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            j.a.i.b.a.du r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r7
            com.google.protobuf.cq r8 = p5535j.p5536a.p5562i.p5568b.p5569a.C71292du.emptyProtobufList()
            r7.f190375j = r8
            android.app.Application r7 = r2.f85009c
            int r8 = r0.mo37249c()
            com.google.common.b.gu r9 = r0.mo37250d()
            boolean r0 = r0.mo37251e()
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.EnumMap r12 = new java.util.EnumMap     // Catch:{ Exception -> 0x0430 }
            java.lang.Class<j.a.i.b.a.ds> r13 = p5535j.p5536a.p5562i.p5568b.p5569a.C71290ds.class
            r12.<init>(r13)     // Catch:{ Exception -> 0x0430 }
            r13 = 0
            android.content.pm.PackageManager r14 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01aa }
            java.lang.String r15 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x01aa }
            android.content.pm.ApplicationInfo r14 = r14.getApplicationInfo(r15, r13)     // Catch:{ NameNotFoundException -> 0x01aa }
            java.io.File r15 = new java.io.File     // Catch:{ NameNotFoundException -> 0x01aa }
            java.lang.String r14 = r14.dataDir     // Catch:{ NameNotFoundException -> 0x01aa }
            r15.<init>(r14)     // Catch:{ NameNotFoundException -> 0x01aa }
            r3 = r15
            goto L_0x01c4
        L_0x01aa:
            com.google.common.f.e r14 = com.google.android.libraries.performance.primes.metrics.storage.C31564f.f84998a     // Catch:{ Exception -> 0x0430 }
            com.google.common.f.x r14 = r14.mo56226d()     // Catch:{ Exception -> 0x0430 }
            java.lang.String r15 = "Failed to use package manager getting data directory from context instead."
            r3 = 50420(0xc4f4, float:7.0653E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r3)).mo56386p(r15)     // Catch:{ Exception -> 0x0430 }
            java.io.File r3 = r7.getFilesDir()     // Catch:{ Exception -> 0x0430 }
            if (r3 == 0) goto L_0x01c3
            java.io.File r3 = r3.getParentFile()     // Catch:{ Exception -> 0x0430 }
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            if (r3 == 0) goto L_0x01cb
            j.a.i.b.a.ds r14 = p5535j.p5536a.p5562i.p5568b.p5569a.C71290ds.CREDENTIAL_ENCRYPTED     // Catch:{ Exception -> 0x0430 }
            r12.put(r14, r3)     // Catch:{ Exception -> 0x0430 }
        L_0x01cb:
            if (r0 != 0) goto L_0x01ce
            goto L_0x01fd
        L_0x01ce:
            android.content.Context r0 = r7.createDeviceProtectedStorageContext()     // Catch:{ Exception -> 0x0430 }
            java.io.File r7 = r0.getDataDir()     // Catch:{ Exception -> 0x0430 }
            if (r7 == 0) goto L_0x01fd
            if (r3 == 0) goto L_0x01fd
            java.lang.String r0 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r3 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x01e9 }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x01e9 }
            if (r0 != 0) goto L_0x01fd
            goto L_0x01f8
        L_0x01e9:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.libraries.performance.primes.metrics.storage.C31564f.f84998a     // Catch:{ Exception -> 0x0430 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ Exception -> 0x0430 }
            java.lang.String r14 = "Failed to retrieve canonical paths."
            r15 = 50421(0xc4f5, float:7.0655E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r15)).mo56386p(r14)     // Catch:{ Exception -> 0x0430 }
        L_0x01f8:
            j.a.i.b.a.ds r0 = p5535j.p5536a.p5562i.p5568b.p5569a.C71290ds.DEVICE_ENCRYPTED     // Catch:{ Exception -> 0x0430 }
            r12.put(r0, r7)     // Catch:{ Exception -> 0x0430 }
        L_0x01fd:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0430 }
            r3.<init>()     // Catch:{ Exception -> 0x0430 }
            java.util.PriorityQueue r7 = new java.util.PriorityQueue     // Catch:{ Exception -> 0x0430 }
            r7.<init>()     // Catch:{ Exception -> 0x0430 }
            java.util.Set r0 = r12.entrySet()     // Catch:{ Exception -> 0x0430 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ Exception -> 0x0430 }
        L_0x020f:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x0430 }
            if (r0 != 0) goto L_0x03ef
        L_0x0215:
            java.lang.Object r0 = r7.poll()     // Catch:{ Exception -> 0x0430 }
            r12 = r0
            com.google.android.libraries.performance.primes.metrics.storage.e r12 = (com.google.android.libraries.performance.primes.metrics.storage.C31563e) r12     // Catch:{ Exception -> 0x0430 }
            if (r12 == 0) goto L_0x0358
            r3.add(r12)     // Catch:{ Exception -> 0x0430 }
            boolean r14 = r12.f84995e     // Catch:{ Exception -> 0x0430 }
            if (r14 == 0) goto L_0x0352
            java.io.File r14 = r12.f84992b     // Catch:{ IOException -> 0x032c, SecurityException -> 0x032a }
            java.nio.file.Path r14 = r14.toPath()     // Catch:{ IOException -> 0x032c, SecurityException -> 0x032a }
            java.lang.String r15 = r12.f84996f     // Catch:{ IOException -> 0x032c, SecurityException -> 0x032a }
            java.nio.file.Path r14 = r14.resolve(r15)     // Catch:{ IOException -> 0x032c, SecurityException -> 0x032a }
            java.nio.file.DirectoryStream r14 = java.nio.file.Files.newDirectoryStream(r14)     // Catch:{ IOException -> 0x032c, SecurityException -> 0x032a }
            java.util.Iterator r15 = r14.iterator()     // Catch:{ all -> 0x02fc }
        L_0x0239:
            boolean r16 = r15.hasNext()     // Catch:{ all -> 0x02fc }
            if (r16 == 0) goto L_0x02e2
            java.lang.Object r16 = r15.next()     // Catch:{ all -> 0x02fc }
            r0 = r16
            java.nio.file.Path r0 = (java.nio.file.Path) r0     // Catch:{ all -> 0x02fc }
            java.nio.file.LinkOption[] r13 = new java.nio.file.LinkOption[r11]     // Catch:{ all -> 0x02fc }
            java.nio.file.LinkOption r17 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch:{ all -> 0x02fc }
            r16 = 0
            r13[r16] = r17     // Catch:{ all -> 0x02fc }
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r11 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r11 = java.nio.file.Files.readAttributes(r0, r11, r13)     // Catch:{ all -> 0x02fc }
            boolean r13 = r11.isSymbolicLink()     // Catch:{ all -> 0x02fc }
            if (r13 != 0) goto L_0x02dc
            boolean r13 = r11.isRegularFile()     // Catch:{ all -> 0x02fc }
            if (r13 == 0) goto L_0x02b6
            r13 = r2
            long r1 = r11.size()     // Catch:{ all -> 0x02b4 }
            r18 = r4
            r19 = r5
            long r4 = r12.f84997g     // Catch:{ all -> 0x02da }
            long r4 = r4 + r1
            r12.f84997g = r4     // Catch:{ all -> 0x02da }
            boolean r4 = r9.isEmpty()     // Catch:{ all -> 0x02da }
            if (r4 != 0) goto L_0x02d2
            int r4 = r7.size()     // Catch:{ all -> 0x02da }
            int r5 = r3.size()     // Catch:{ all -> 0x02da }
            int r4 = r4 + r5
            r5 = 512(0x200, float:7.175E-43)
            if (r4 > r5) goto L_0x02d2
            com.google.android.libraries.performance.primes.metrics.storage.e r4 = new com.google.android.libraries.performance.primes.metrics.storage.e     // Catch:{ all -> 0x02da }
            java.nio.file.Path r0 = r0.getFileName()     // Catch:{ all -> 0x02da }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02da }
            r5 = 0
            r4.<init>(r12, r5, r0)     // Catch:{ all -> 0x02da }
            java.lang.String r0 = r4.f84996f     // Catch:{ all -> 0x02da }
            java.util.Iterator r5 = r9.iterator()     // Catch:{ all -> 0x02da }
        L_0x0296:
            boolean r11 = r5.hasNext()     // Catch:{ all -> 0x02da }
            if (r11 == 0) goto L_0x02d2
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x02da }
            com.google.android.libraries.performance.primes.metrics.storage.g r11 = (com.google.android.libraries.performance.primes.metrics.storage.C31565g) r11     // Catch:{ all -> 0x02da }
            java.util.regex.Pattern r11 = r11.f84999a     // Catch:{ all -> 0x02da }
            java.util.regex.Matcher r11 = r11.matcher(r0)     // Catch:{ all -> 0x02da }
            boolean r11 = r11.matches()     // Catch:{ all -> 0x02da }
            if (r11 == 0) goto L_0x0296
            r4.f84997g = r1     // Catch:{ all -> 0x02da }
            r7.add(r4)     // Catch:{ all -> 0x02da }
            goto L_0x02d2
        L_0x02b4:
            r0 = move-exception
            goto L_0x02fe
        L_0x02b6:
            r13 = r2
            r18 = r4
            r19 = r5
            boolean r1 = r11.isDirectory()     // Catch:{ all -> 0x02da }
            if (r1 == 0) goto L_0x02d2
            com.google.android.libraries.performance.primes.metrics.storage.e r1 = new com.google.android.libraries.performance.primes.metrics.storage.e     // Catch:{ all -> 0x02da }
            java.nio.file.Path r0 = r0.getFileName()     // Catch:{ all -> 0x02da }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02da }
            r2 = 1
            r1.<init>(r12, r2, r0)     // Catch:{ all -> 0x02da }
            r7.add(r1)     // Catch:{ all -> 0x02da }
        L_0x02d2:
            r1 = r20
            r2 = r13
            r4 = r18
            r5 = r19
            goto L_0x02de
        L_0x02da:
            r0 = move-exception
            goto L_0x0302
        L_0x02dc:
            r1 = r20
        L_0x02de:
            r11 = 1
            r13 = 0
            goto L_0x0239
        L_0x02e2:
            r13 = r2
            r18 = r4
            r19 = r5
            if (r14 == 0) goto L_0x02f1
            r14.close()     // Catch:{ IOException -> 0x02ef, SecurityException -> 0x02ed }
            goto L_0x02f1
        L_0x02ed:
            r0 = move-exception
            goto L_0x0332
        L_0x02ef:
            r0 = move-exception
            goto L_0x0332
        L_0x02f1:
            r1 = r20
            r2 = r13
            r4 = r18
            r5 = r19
            r11 = 1
            r13 = 0
            goto L_0x0215
        L_0x02fc:
            r0 = move-exception
            r13 = r2
        L_0x02fe:
            r18 = r4
            r19 = r5
        L_0x0302:
            r1 = r0
            if (r14 == 0) goto L_0x0324
            r14.close()     // Catch:{ all -> 0x0309 }
            goto L_0x0324
        L_0x0309:
            r0 = move-exception
            r2 = r0
            r4 = 1
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0324 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r0[r5] = r4     // Catch:{ Exception -> 0x0325 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r11 = "addSuppressed"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r11, r0)     // Catch:{ Exception -> 0x0325 }
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0325 }
            r11[r5] = r2     // Catch:{ Exception -> 0x0325 }
            r0.invoke(r1, r11)     // Catch:{ Exception -> 0x0325 }
            goto L_0x0325
        L_0x0324:
            r5 = 0
        L_0x0325:
            throw r1     // Catch:{ IOException -> 0x0328, SecurityException -> 0x0326 }
        L_0x0326:
            r0 = move-exception
            goto L_0x0333
        L_0x0328:
            r0 = move-exception
            goto L_0x0333
        L_0x032a:
            r0 = move-exception
            goto L_0x032d
        L_0x032c:
            r0 = move-exception
        L_0x032d:
            r13 = r2
            r18 = r4
            r19 = r5
        L_0x0332:
            r5 = 0
        L_0x0333:
            com.google.common.f.e r1 = com.google.android.libraries.performance.primes.metrics.storage.C31564f.f84998a     // Catch:{ Exception -> 0x042e }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ Exception -> 0x042e }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ Exception -> 0x042e }
            com.google.common.f.x r0 = r1.mo56382g(r0)     // Catch:{ Exception -> 0x042e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x042e }
            r1 = 50417(0xc4f1, float:7.0649E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ Exception -> 0x042e }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x042e }
            java.lang.String r1 = "exception while collecting DirStats for dir %s"
            java.lang.String r2 = r12.f84996f     // Catch:{ Exception -> 0x042e }
            r0.mo56389s(r1, r2)     // Catch:{ Exception -> 0x042e }
            goto L_0x02f1
        L_0x0352:
            r19 = r5
            r1 = r20
            goto L_0x0215
        L_0x0358:
            r13 = r2
            r18 = r4
            r19 = r5
            int r0 = r3.size()     // Catch:{ Exception -> 0x042e }
        L_0x0361:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x037b
            java.lang.Object r1 = r3.get(r0)     // Catch:{ Exception -> 0x042e }
            com.google.android.libraries.performance.primes.metrics.storage.e r1 = (com.google.android.libraries.performance.primes.metrics.storage.C31563e) r1     // Catch:{ Exception -> 0x042e }
            boolean r2 = r1.f84995e     // Catch:{ Exception -> 0x042e }
            if (r2 == 0) goto L_0x0361
            com.google.android.libraries.performance.primes.metrics.storage.e r2 = r1.f84993c     // Catch:{ Exception -> 0x042e }
            if (r2 == 0) goto L_0x0361
            long r4 = r2.f84997g     // Catch:{ Exception -> 0x042e }
            long r11 = r1.f84997g     // Catch:{ Exception -> 0x042e }
            long r4 = r4 + r11
            r2.f84997g = r4     // Catch:{ Exception -> 0x042e }
            goto L_0x0361
        L_0x037b:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x042e }
            r0.<init>()     // Catch:{ Exception -> 0x042e }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ Exception -> 0x042e }
        L_0x0384:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x042e }
            if (r2 == 0) goto L_0x03e7
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x042e }
            com.google.android.libraries.performance.primes.metrics.storage.e r2 = (com.google.android.libraries.performance.primes.metrics.storage.C31563e) r2     // Catch:{ Exception -> 0x042e }
            int r3 = r0.size()     // Catch:{ Exception -> 0x042e }
            r4 = 512(0x200, float:7.175E-43)
            if (r3 >= r4) goto L_0x03e7
            int r3 = r2.f84994d     // Catch:{ Exception -> 0x042e }
            if (r3 <= r8) goto L_0x039d
            goto L_0x03e7
        L_0x039d:
            j.a.i.b.a.dt r3 = p5535j.p5536a.p5562i.p5568b.p5569a.C71291dt.f190357f     // Catch:{ Exception -> 0x042e }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ Exception -> 0x042e }
            j.a.i.b.a.dq r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71288dq) r3     // Catch:{ Exception -> 0x042e }
            j.a.i.b.a.ds r5 = r2.f84991a     // Catch:{ Exception -> 0x042e }
            r3.copyOnWrite()     // Catch:{ Exception -> 0x042e }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ Exception -> 0x042e }
            j.a.i.b.a.dt r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71291dt) r7     // Catch:{ Exception -> 0x042e }
            int r5 = r5.f190356d     // Catch:{ Exception -> 0x042e }
            r7.f190363e = r5     // Catch:{ Exception -> 0x042e }
            int r5 = r7.f190359a     // Catch:{ Exception -> 0x042e }
            r5 = r5 | 4
            r7.f190359a = r5     // Catch:{ Exception -> 0x042e }
            java.lang.String r5 = r2.f84996f     // Catch:{ Exception -> 0x042e }
            r3.copyOnWrite()     // Catch:{ Exception -> 0x042e }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ Exception -> 0x042e }
            j.a.i.b.a.dt r7 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71291dt) r7     // Catch:{ Exception -> 0x042e }
            r5.getClass()     // Catch:{ Exception -> 0x042e }
            int r9 = r7.f190359a     // Catch:{ Exception -> 0x042e }
            r11 = 1
            r9 = r9 | r11
            r7.f190359a = r9     // Catch:{ Exception -> 0x042e }
            r7.f190360b = r5     // Catch:{ Exception -> 0x042e }
            long r14 = r2.f84997g     // Catch:{ Exception -> 0x042e }
            r3.copyOnWrite()     // Catch:{ Exception -> 0x042e }
            com.google.protobuf.bv r2 = r3.instance     // Catch:{ Exception -> 0x042e }
            j.a.i.b.a.dt r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71291dt) r2     // Catch:{ Exception -> 0x042e }
            int r5 = r2.f190359a     // Catch:{ Exception -> 0x042e }
            r5 = r5 | 2
            r2.f190359a = r5     // Catch:{ Exception -> 0x042e }
            r2.f190362d = r14     // Catch:{ Exception -> 0x042e }
            com.google.protobuf.bv r2 = r3.build()     // Catch:{ Exception -> 0x042e }
            j.a.i.b.a.dt r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71291dt) r2     // Catch:{ Exception -> 0x042e }
            r0.add(r2)     // Catch:{ Exception -> 0x042e }
            goto L_0x0384
        L_0x03e7:
            r10.addAll(r0)     // Catch:{ Exception -> 0x042e }
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r10)
            goto L_0x0448
        L_0x03ef:
            r13 = r2
            r18 = r4
            r19 = r5
            r5 = 0
            java.lang.Object r0 = r12.next()     // Catch:{ Exception -> 0x042e }
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x042e }
            com.google.android.libraries.performance.primes.metrics.storage.e r0 = new com.google.android.libraries.performance.primes.metrics.storage.e     // Catch:{ Exception -> 0x0415 }
            java.lang.Object r2 = r1.getKey()     // Catch:{ Exception -> 0x0415 }
            j.a.i.b.a.ds r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71290ds) r2     // Catch:{ Exception -> 0x0415 }
            java.lang.Object r4 = r1.getValue()     // Catch:{ Exception -> 0x0415 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ Exception -> 0x0415 }
            java.io.File r4 = r4.getCanonicalFile()     // Catch:{ Exception -> 0x0415 }
            r0.<init>(r2, r4)     // Catch:{ Exception -> 0x0415 }
            r7.add(r0)     // Catch:{ Exception -> 0x0415 }
            goto L_0x0424
        L_0x0415:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.libraries.performance.primes.metrics.storage.C31564f.f84998a     // Catch:{ Exception -> 0x042e }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ Exception -> 0x042e }
            java.lang.String r4 = "couldn't canonicalize %s, skipping"
            r14 = 50418(0xc4f2, float:7.065E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r14)).mo56389s(r4, r1)     // Catch:{ Exception -> 0x042e }
        L_0x0424:
            r1 = r20
            r2 = r13
            r4 = r18
            r5 = r19
            r13 = 0
            goto L_0x020f
        L_0x042e:
            r0 = move-exception
            goto L_0x0436
        L_0x0430:
            r0 = move-exception
            r13 = r2
            r18 = r4
            r19 = r5
        L_0x0436:
            com.google.common.f.e r1 = com.google.android.libraries.performance.primes.metrics.storage.C31564f.f84998a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Failed to retrieve DirStats."
            r3 = 50419(0xc4f3, float:7.0652E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0448:
            r19.copyOnWrite()
            r1 = r19
            com.google.protobuf.bv r2 = r1.instance
            j.a.i.b.a.du r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r2
            r2.mo62663a()
            com.google.protobuf.cq r2 = r2.f190375j
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r2)
            goto L_0x045e
        L_0x045a:
            r13 = r2
            r18 = r4
            r1 = r5
        L_0x045e:
            r18.copyOnWrite()
            r4 = r18
            com.google.protobuf.bv r0 = r4.instance
            j.a.i.b.a.ej r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r0
            com.google.protobuf.bv r1 = r1.build()
            j.a.i.b.a.du r1 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71292du) r1
            r1.getClass()
            r0.f190424i = r1
            int r1 = r0.f190416a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.f190416a = r1
            com.google.android.libraries.performance.primes.g.b r0 = r13.f85011e
            android.content.Context r1 = r0.f84155a
            boolean r1 = com.google.android.libraries.directboot.C20674d.m38856e(r1)
            if (r1 == 0) goto L_0x049b
            g.a.a r1 = r0.f84157c
            java.lang.Object r1 = r1.mo17428b()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            android.content.SharedPreferences$Editor r1 = r1.edit()
            com.google.android.libraries.f.a r0 = r0.f84156b
            long r2 = r0.mo26871c()
            android.content.SharedPreferences$Editor r0 = r1.putLong(r6, r2)
            r0.commit()
        L_0x049b:
            com.google.android.libraries.performance.primes.metrics.b.m r0 = r13.f85008b
            com.google.android.libraries.performance.primes.metrics.b.d r1 = com.google.android.libraries.performance.primes.metrics.p2404b.C31302e.m58363j()
            com.google.protobuf.bv r2 = r4.build()
            j.a.i.b.a.ej r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r2
            r1.mo37004e(r2)
            com.google.android.libraries.performance.primes.metrics.b.e r1 = r1.mo37000a()
            com.google.common.util.concurrent.cx r0 = r0.mo37023b(r1)
        L_0x04b2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.storage.C31576r.mo18058a():com.google.common.util.concurrent.cx");
    }
}
