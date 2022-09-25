package com.google.android.play.core.p3534f.p3535a;

import android.content.Context;
import com.google.android.play.core.p3534f.C45097e;
import com.google.android.play.core.p3534f.C45111s;
import com.google.android.play.core.p3538g.C45146c;
import com.google.android.play.core.p3538g.C45170e;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.f.a.c */
/* compiled from: PG */
public final class C45084c implements C45170e {

    /* renamed from: a */
    public final Context f117743a;

    /* renamed from: b */
    public final C45086e f117744b;

    /* renamed from: c */
    private final C45097e f117745c;

    /* renamed from: d */
    private final Executor f117746d;

    public C45084c(Context context, Executor executor, C45086e eVar, C45097e eVar2) {
        this.f117743a = context;
        this.f117745c = eVar2;
        this.f117744b = eVar;
        this.f117746d = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v42, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v43, resolved type: java.nio.channels.FileChannel} */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v26 */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0161, code lost:
        android.util.Log.e("SplitCompat", "Downloaded split " + r13 + " is not signed.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0177, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0178, code lost:
        android.util.Log.e("SplitCompat", "Downloaded split " + r13 + " is not signed.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0194, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        android.util.Log.e("SplitCompat", "Split verification error.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r2 = r1.f117744b;
        r12 = r2.mo48918a().getLongVersionCode();
        r3 = android.content.res.AssetManager.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01a9, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r7 = r3.getDeclaredConstructor(new java.lang.Class[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01b4, code lost:
        if (r7.isAccessible() != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r7.setAccessible(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r3 = r7.newInstance(new java.lang.Object[0]);
        r7 = r9.length - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01c4, code lost:
        if (r7 < 0) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c6, code lost:
        r2.f117749b.f117747a = r3.openXmlResourceParser(com.google.android.play.core.p3534f.C45081a.m80244b(r3, r9[r7]), "AndroidManifest.xml");
        r10 = r2.f117749b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01da, code lost:
        if (r10.f117747a == null) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01dc, code lost:
        r14 = r10.f117747a.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e3, code lost:
        if (r14 == 2) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01e5, code lost:
        if (r14 == r5) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01e8, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01f7, code lost:
        if (r10.f117747a.getName().equals("manifest") == false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01f9, code lost:
        r14 = r10.f117747a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r10 = r10.f117747a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0209, code lost:
        if (r14 == null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x020b, code lost:
        r15 = "versionCodeMajor";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r14 = java.lang.Integer.parseInt(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x020f, code lost:
        if (r10 != null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0211, code lost:
        r18 = r12;
        r15 = r6;
        r5 = (long) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x021e, code lost:
        r15 = r6;
        r18 = r12;
        r5 = (((long) java.lang.Integer.parseInt(r10)) << 32) | (((long) r14) & 4294967295L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x022f, code lost:
        if (r18 != r5) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0231, code lost:
        r7 = r7 - 1;
        r6 = r15;
        r12 = r18;
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0239, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x023a, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x023c, code lost:
        r15 = r15;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0251, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCodeMajor to int: %s", new java.lang.Object[]{r0.getMessage()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0252, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0253, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x026a, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCode to int: %s", new java.lang.Object[]{r0.getMessage()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x026b, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0273, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x027b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Couldn't find manifest entry at top-level.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x027c, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0284, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Manifest file needs to be loaded before parsing.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0285, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r0 = r1.f117745c.mo48931d().listFiles();
        java.util.Arrays.sort(r0);
        r2 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0294, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0296, code lost:
        if (r2 < 0) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0298, code lost:
        com.google.android.play.core.p3534f.C45097e.m80269l(r0[r2]);
        r3 = r0[r2];
        r3.renameTo(com.google.android.play.core.p3534f.C45097e.m80266a(r1.f117745c.mo48932e(), r3.getName()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        android.util.Log.i("SplitCompat", "Splits verified.");
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02b9, code lost:
        android.util.Log.e("SplitCompat", "Cannot write verified split.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02c0, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02d6, code lost:
        throw new com.google.android.play.core.p3534f.p3537c.C45095d(java.lang.String.format("Failed to invoke default constructor on class %s", new java.lang.Object[]{r3.getName()}), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02e4, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02ef, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02f0, code lost:
        r15 = r6;
        android.util.Log.e("SplitCompat", "Cannot access directory for unverified splits.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02f7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02f8, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02f9, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0302, code lost:
        r11 = -13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x030c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x030e, code lost:
        if (r15 != null) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0314, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        com.google.android.play.core.p3534f.p3535a.C45082a.m80247a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0319, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        com.google.android.play.core.p3534f.p3535a.C45082a.m80247a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        r2 = r0;
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r8 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02f7 A[Catch:{ IOException -> 0x02b8, all -> 0x030c }, ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0310 A[SYNTHETIC, Splitter:B:205:0x0310] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x031d A[Catch:{ Exception -> 0x0321 }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0028 A[ExcHandler: all (r0v40 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x0023] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer mo48916a(java.util.List r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = " is not signed."
            java.lang.String r3 = "Downloaded split "
            java.lang.String r4 = "SplitCompat"
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0321 }
            com.google.android.play.core.f.e r7 = r1.f117745c     // Catch:{ Exception -> 0x0321 }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0321 }
            java.io.File r7 = r7.mo48934g()     // Catch:{ Exception -> 0x0321 }
            java.lang.String r9 = "lock.tmp"
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x0321 }
            java.lang.String r7 = "rw"
            r6.<init>(r8, r7)     // Catch:{ Exception -> 0x0321 }
            java.nio.channels.FileChannel r6 = r6.getChannel()     // Catch:{ Exception -> 0x0321 }
            r7 = 0
            java.nio.channels.FileLock r8 = r6.tryLock()     // Catch:{ OverlappingFileLockException -> 0x002d, all -> 0x0028 }
            goto L_0x002f
        L_0x0028:
            r0 = move-exception
            r2 = r0
            r15 = r6
            goto L_0x030e
        L_0x002d:
            r8 = r7
        L_0x002f:
            if (r8 == 0) goto L_0x031a
            java.lang.String r9 = "Copying splits."
            android.util.Log.i(r4, r9)     // Catch:{ Exception -> 0x02fb, all -> 0x02f7 }
            java.util.Iterator r9 = r23.iterator()     // Catch:{ Exception -> 0x02fb, all -> 0x02f7 }
        L_0x003a:
            boolean r10 = r9.hasNext()     // Catch:{ Exception -> 0x02fb, all -> 0x02f7 }
            r11 = 0
            if (r10 == 0) goto L_0x00cb
            java.lang.Object r10 = r9.next()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            android.content.Intent r10 = (android.content.Intent) r10     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            java.lang.String r12 = "split_id"
            java.lang.String r12 = r10.getStringExtra(r12)     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            android.content.Context r13 = r1.f117743a     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            android.net.Uri r10 = r10.getData()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            java.lang.String r14 = "r"
            android.content.res.AssetFileDescriptor r10 = r13.openAssetFileDescriptor(r10, r14)     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            com.google.android.play.core.f.e r13 = r1.f117745c     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            java.io.File r13 = r13.mo48931d()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            java.lang.String r14 = com.google.android.play.core.p3534f.C45097e.m80267h(r12)     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            java.io.File r13 = com.google.android.play.core.p3534f.C45097e.m80266a(r13, r14)     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            boolean r14 = r13.exists()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            if (r14 == 0) goto L_0x007e
            long r14 = r13.length()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            long r16 = r10.getLength()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            boolean r14 = r13.exists()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            if (r14 != 0) goto L_0x003a
        L_0x0084:
            com.google.android.play.core.f.e r14 = r1.f117745c     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            java.io.File r12 = r14.mo48933f(r12)     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            boolean r12 = r12.exists()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            if (r12 != 0) goto L_0x003a
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            java.io.FileInputStream r10 = r10.createInputStream()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            r12.<init>(r10)     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bf }
            r10.<init>(r13)     // Catch:{ all -> 0x00bf }
            r13 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r13]     // Catch:{ all -> 0x00b3 }
        L_0x00a2:
            int r14 = r12.read(r13)     // Catch:{ all -> 0x00b3 }
            if (r14 <= 0) goto L_0x00ac
            r10.write(r13, r11, r14)     // Catch:{ all -> 0x00b3 }
            goto L_0x00a2
        L_0x00ac:
            r10.close()     // Catch:{ all -> 0x00bf }
            r12.close()     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
            goto L_0x003a
        L_0x00b3:
            r0 = move-exception
            r2 = r0
            r10.close()     // Catch:{ all -> 0x00b9 }
            goto L_0x00be
        L_0x00b9:
            r0 = move-exception
            r3 = r0
            com.google.android.play.core.p3534f.p3535a.C45082a.m80247a(r2, r3)     // Catch:{ all -> 0x00bf }
        L_0x00be:
            throw r2     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            r2 = r0
            r12.close()     // Catch:{ all -> 0x00c5 }
            goto L_0x00ca
        L_0x00c5:
            r0 = move-exception
            r3 = r0
            com.google.android.play.core.p3534f.p3535a.C45082a.m80247a(r2, r3)     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
        L_0x00ca:
            throw r2     // Catch:{ Exception -> 0x02fb, all -> 0x0028 }
        L_0x00cb:
            java.lang.String r9 = "Splits copied."
            android.util.Log.i(r4, r9)     // Catch:{ Exception -> 0x02fb, all -> 0x02f7 }
            com.google.android.play.core.f.e r9 = r1.f117745c     // Catch:{ IOException -> 0x02ef, all -> 0x02f7 }
            java.io.File r9 = r9.mo48931d()     // Catch:{ IOException -> 0x02ef, all -> 0x02f7 }
            java.io.File[] r9 = r9.listFiles()     // Catch:{ IOException -> 0x02ef, all -> 0x02f7 }
            com.google.android.play.core.f.a.e r12 = r1.f117744b     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            android.content.pm.PackageInfo r12 = r12.mo48918a()     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            if (r12 == 0) goto L_0x0100
            android.content.pm.Signature[] r13 = r12.signatures     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
            if (r13 != 0) goto L_0x00e7
            goto L_0x0100
        L_0x00e7:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
            r7.<init>()     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
            android.content.pm.Signature[] r12 = r12.signatures     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
            int r13 = r12.length     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
            r14 = 0
        L_0x00f0:
            if (r14 >= r13) goto L_0x0100
            r15 = r12[r14]     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
            java.security.cert.X509Certificate r15 = com.google.android.play.core.p3534f.p3535a.C45086e.m80250b(r15)     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
            if (r15 == 0) goto L_0x00fd
            r7.add(r15)     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
        L_0x00fd:
            int r14 = r14 + 1
            goto L_0x00f0
        L_0x0100:
            if (r7 == 0) goto L_0x02d7
            boolean r12 = r7.isEmpty()     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            if (r12 == 0) goto L_0x010a
            goto L_0x02d7
        L_0x010a:
            int r12 = r9.length     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
        L_0x010b:
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x019d
            r13 = r9[r12]     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            java.security.cert.X509Certificate[][] r14 = com.android.p270g.C5150h.m14065a(r13)     // Catch:{ Exception -> 0x0177, all -> 0x0028 }
            if (r14 == 0) goto L_0x0161
            int r15 = r14.length     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            if (r15 == 0) goto L_0x0161
            r15 = r14[r11]     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            int r15 = r15.length     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            if (r15 != 0) goto L_0x0124
            goto L_0x0161
        L_0x0124:
            boolean r13 = r7.isEmpty()     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            if (r13 == 0) goto L_0x0130
            java.lang.String r0 = "No certificates found for app."
            android.util.Log.e(r4, r0)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            goto L_0x018e
        L_0x0130:
            java.util.Iterator r13 = r7.iterator()     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
        L_0x0134:
            boolean r15 = r13.hasNext()     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            if (r15 == 0) goto L_0x015e
            java.lang.Object r15 = r13.next()     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            java.security.cert.X509Certificate r15 = (java.security.cert.X509Certificate) r15     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            int r10 = r14.length     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r5 = 0
        L_0x0142:
            if (r5 >= r10) goto L_0x0158
            r17 = r14[r5]     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r18 = r7
            r7 = r17[r11]     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            boolean r7 = r7.equals(r15)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            if (r7 != 0) goto L_0x0155
            int r5 = r5 + 1
            r7 = r18
            goto L_0x0142
        L_0x0155:
            r7 = r18
            goto L_0x0134
        L_0x0158:
            java.lang.String r0 = "There's an app certificate that doesn't sign the split."
            android.util.Log.i(r4, r0)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            goto L_0x018e
        L_0x015e:
            r18 = r7
            goto L_0x010b
        L_0x0161:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r0.<init>()     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r0.append(r3)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r0.append(r13)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r0.append(r2)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            android.util.Log.e(r4, r0)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            goto L_0x018e
        L_0x0177:
            r0 = move-exception
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r0.<init>()     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r0.append(r3)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r0.append(r13)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            r0.append(r2)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            android.util.Log.e(r4, r0, r5)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
        L_0x018e:
            java.lang.String r0 = "Split verification failure."
            android.util.Log.e(r4, r0)     // Catch:{ Exception -> 0x0194, all -> 0x0028 }
            goto L_0x019a
        L_0x0194:
            r0 = move-exception
            java.lang.String r2 = "Split verification error."
            android.util.Log.e(r4, r2, r0)     // Catch:{ Exception -> 0x02e5, all -> 0x0028 }
        L_0x019a:
            r15 = r6
            goto L_0x02dd
        L_0x019d:
            com.google.android.play.core.f.a.e r2 = r1.f117744b     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            android.content.pm.PackageInfo r3 = r2.mo48918a()     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            long r12 = r3.getLongVersionCode()     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            java.lang.Class<android.content.res.AssetManager> r3 = android.content.res.AssetManager.class
            r5 = 1
            java.lang.Class[] r7 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x02bf, all -> 0x02f7 }
            java.lang.reflect.Constructor r7 = r3.getDeclaredConstructor(r7)     // Catch:{ Exception -> 0x02bf, all -> 0x02f7 }
            boolean r10 = r7.isAccessible()     // Catch:{ Exception -> 0x02bf, all -> 0x02f7 }
            if (r10 != 0) goto L_0x01b9
            r7.setAccessible(r5)     // Catch:{ Exception -> 0x02bf, all -> 0x0028 }
        L_0x01b9:
            java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x02bf, all -> 0x02f7 }
            java.lang.Object r3 = r7.newInstance(r10)     // Catch:{ Exception -> 0x02bf, all -> 0x02f7 }
            android.content.res.AssetManager r3 = (android.content.res.AssetManager) r3     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            int r7 = r9.length     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            int r7 = r7 + -1
        L_0x01c4:
            if (r7 < 0) goto L_0x0285
            com.google.android.play.core.f.a.d r10 = r2.f117749b     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            r14 = r9[r7]     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            int r14 = com.google.android.play.core.p3534f.C45081a.m80244b(r3, r14)     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            java.lang.String r15 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r14 = r3.openXmlResourceParser(r14, r15)     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            r10.f117747a = r14     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            com.google.android.play.core.f.a.d r10 = r2.f117749b     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            org.xmlpull.v1.XmlPullParser r14 = r10.f117747a     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            if (r14 == 0) goto L_0x027c
        L_0x01dc:
            org.xmlpull.v1.XmlPullParser r14 = r10.f117747a     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            int r14 = r14.next()     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            r15 = 2
            if (r14 == r15) goto L_0x01eb
            if (r14 == r5) goto L_0x01e8
            goto L_0x01dc
        L_0x01e8:
            r15 = r6
            goto L_0x0274
        L_0x01eb:
            org.xmlpull.v1.XmlPullParser r14 = r10.f117747a     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            java.lang.String r14 = r14.getName()     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            java.lang.String r15 = "manifest"
            boolean r14 = r14.equals(r15)     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            if (r14 == 0) goto L_0x01e8
            org.xmlpull.v1.XmlPullParser r14 = r10.f117747a     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            java.lang.String r15 = "versionCode"
            java.lang.String r14 = r14.getAttributeValue(r0, r15)     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            org.xmlpull.v1.XmlPullParser r10 = r10.f117747a     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            java.lang.String r15 = "versionCodeMajor"
            java.lang.String r10 = r10.getAttributeValue(r0, r15)     // Catch:{ Exception -> 0x02e5, all -> 0x02f7 }
            if (r14 == 0) goto L_0x026b
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x0252 }
            if (r10 != 0) goto L_0x021a
            long r14 = (long) r14
            r18 = r12
            r20 = r14
            r15 = r6
            r5 = r20
            goto L_0x022d
        L_0x021a:
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0239 }
            r15 = r6
            long r5 = (long) r10
            r10 = 32
            long r5 = r5 << r10
            r18 = r12
            long r11 = (long) r14
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r13
            long r5 = r5 | r11
        L_0x022d:
            int r11 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x02dd
            int r7 = r7 + -1
            r6 = r15
            r12 = r18
            r5 = 1
            r11 = 0
            goto L_0x01c4
        L_0x0239:
            r0 = move-exception
            r15 = r6
            r2 = r0
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x02e3 }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x02e3 }
            r5 = 0
            r3[r5] = r2     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r2 = "Couldn't parse versionCodeMajor to int: %s"
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ Exception -> 0x02e3 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x02e3 }
            throw r0     // Catch:{ Exception -> 0x02e3 }
        L_0x0252:
            r0 = move-exception
            r15 = r6
            r2 = r0
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x02e3 }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x02e3 }
            r5 = 0
            r3[r5] = r2     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r2 = "Couldn't parse versionCode to int: %s"
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ Exception -> 0x02e3 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x02e3 }
            throw r0     // Catch:{ Exception -> 0x02e3 }
        L_0x026b:
            r15 = r6
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r2 = "Manifest entry doesn't contain 'versionCode' attribute."
            r0.<init>(r2)     // Catch:{ Exception -> 0x02e3 }
            throw r0     // Catch:{ Exception -> 0x02e3 }
        L_0x0274:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r2 = "Couldn't find manifest entry at top-level."
            r0.<init>(r2)     // Catch:{ Exception -> 0x02e3 }
            throw r0     // Catch:{ Exception -> 0x02e3 }
        L_0x027c:
            r15 = r6
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r2 = "Manifest file needs to be loaded before parsing."
            r0.<init>(r2)     // Catch:{ Exception -> 0x02e3 }
            throw r0     // Catch:{ Exception -> 0x02e3 }
        L_0x0285:
            r15 = r6
            com.google.android.play.core.f.e r0 = r1.f117745c     // Catch:{ IOException -> 0x02b8 }
            java.io.File r0 = r0.mo48931d()     // Catch:{ IOException -> 0x02b8 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ IOException -> 0x02b8 }
            java.util.Arrays.sort(r0)     // Catch:{ IOException -> 0x02b8 }
            int r2 = r0.length     // Catch:{ IOException -> 0x02b8 }
        L_0x0294:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x02b1
            r3 = r0[r2]     // Catch:{ IOException -> 0x02b8 }
            com.google.android.play.core.p3534f.C45097e.m80269l(r3)     // Catch:{ IOException -> 0x02b8 }
            r3 = r0[r2]     // Catch:{ IOException -> 0x02b8 }
            com.google.android.play.core.f.e r5 = r1.f117745c     // Catch:{ IOException -> 0x02b8 }
            java.io.File r5 = r5.mo48932e()     // Catch:{ IOException -> 0x02b8 }
            java.lang.String r6 = r3.getName()     // Catch:{ IOException -> 0x02b8 }
            java.io.File r5 = com.google.android.play.core.p3534f.C45097e.m80266a(r5, r6)     // Catch:{ IOException -> 0x02b8 }
            r3.renameTo(r5)     // Catch:{ IOException -> 0x02b8 }
            goto L_0x0294
        L_0x02b1:
            java.lang.String r0 = "Splits verified."
            android.util.Log.i(r4, r0)     // Catch:{ all -> 0x030c }
            r11 = 0
            goto L_0x0304
        L_0x02b8:
            r0 = move-exception
            java.lang.String r2 = "Cannot write verified split."
            android.util.Log.e(r4, r2, r0)     // Catch:{ all -> 0x030c }
            goto L_0x0302
        L_0x02bf:
            r0 = move-exception
            r15 = r6
            com.google.android.play.core.f.c.d r2 = new com.google.android.play.core.f.c.d     // Catch:{ Exception -> 0x02e3 }
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x02e3 }
            r6 = 0
            r5[r6] = r3     // Catch:{ Exception -> 0x02e3 }
            java.lang.String r3 = "Failed to invoke default constructor on class %s"
            java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch:{ Exception -> 0x02e3 }
            r2.<init>(r3, r0)     // Catch:{ Exception -> 0x02e3 }
            throw r2     // Catch:{ Exception -> 0x02e3 }
        L_0x02d7:
            r15 = r6
            java.lang.String r0 = "No app certificates found."
            android.util.Log.e(r4, r0)     // Catch:{ Exception -> 0x02e3 }
        L_0x02dd:
            java.lang.String r0 = "Split verification failed."
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x030c }
            goto L_0x02ec
        L_0x02e3:
            r0 = move-exception
            goto L_0x02e7
        L_0x02e5:
            r0 = move-exception
            r15 = r6
        L_0x02e7:
            java.lang.String r2 = "Error verifying splits."
            android.util.Log.e(r4, r2, r0)     // Catch:{ all -> 0x030c }
        L_0x02ec:
            r11 = -11
            goto L_0x0304
        L_0x02ef:
            r0 = move-exception
            r15 = r6
            java.lang.String r2 = "Cannot access directory for unverified splits."
            android.util.Log.e(r4, r2, r0)     // Catch:{ all -> 0x030c }
            goto L_0x0302
        L_0x02f7:
            r0 = move-exception
            r15 = r6
        L_0x02f9:
            r2 = r0
            goto L_0x030e
        L_0x02fb:
            r0 = move-exception
            r15 = r6
            java.lang.String r2 = "Error copying splits."
            android.util.Log.e(r4, r2, r0)     // Catch:{ all -> 0x030c }
        L_0x0302:
            r11 = -13
        L_0x0304:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x030c }
            r8.release()     // Catch:{ all -> 0x030c }
            goto L_0x031b
        L_0x030c:
            r0 = move-exception
            goto L_0x02f9
        L_0x030e:
            if (r15 == 0) goto L_0x0319
            r15.close()     // Catch:{ all -> 0x0314 }
            goto L_0x0319
        L_0x0314:
            r0 = move-exception
            r3 = r0
            com.google.android.play.core.p3534f.p3535a.C45082a.m80247a(r2, r3)     // Catch:{ Exception -> 0x0321 }
        L_0x0319:
            throw r2     // Catch:{ Exception -> 0x0321 }
        L_0x031a:
            r15 = r6
        L_0x031b:
            if (r15 == 0) goto L_0x0320
            r15.close()     // Catch:{ Exception -> 0x0321 }
        L_0x0320:
            return r7
        L_0x0321:
            r0 = move-exception
            java.lang.String r2 = "Error locking files."
            android.util.Log.e(r4, r2, r0)
            r2 = -13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3534f.p3535a.C45084c.mo48916a(java.util.List):java.lang.Integer");
    }

    /* renamed from: b */
    public final void mo48917b(List list, C45146c cVar) {
        if (C45111s.f117782a.get() != null) {
            this.f117746d.execute(new C45083b(this, list, cVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
