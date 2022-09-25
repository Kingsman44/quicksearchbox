package com.google.android.gms.analytics.internal;

import com.google.android.gms.p10725a.p10730b.C142676c;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.analytics.internal.a */
/* compiled from: PG */
public final class C142703a extends C142737g {

    /* renamed from: a */
    public static boolean f387224a;

    /* renamed from: b */
    private C142676c f387225b;

    /* renamed from: c */
    private final C142729az f387226c = new C142729az();

    /* renamed from: d */
    private String f387227d;

    /* renamed from: f */
    private boolean f387228f = false;

    /* renamed from: g */
    private final Object f387229g = new Object();

    public C142703a(C142740j jVar) {
        super(jVar);
    }

    /* renamed from: c */
    private static String m231534c(String str) {
        MessageDigest h = C142731ba.m231608h();
        if (h == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, h.digest(str.getBytes()))});
    }

    /* renamed from: d */
    private final boolean m231535d(String str) {
        try {
            String c = m231534c(str);
            super.mo117536i(2, "Storing hashed adid.", (Object) null, (Object) null, (Object) null);
            FileOutputStream openFileOutput = this.f387328e.f387334b.openFileOutput("gaClientIdData", 0);
            openFileOutput.write(c.getBytes());
            openFileOutput.close();
            this.f387227d = c;
            return true;
        } catch (IOException e) {
            super.mo117536i(6, "Error creating hash file", e, (Object) null, (Object) null);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017b, code lost:
        if (r0 == false) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[Catch:{ IllegalStateException -> 0x0031, Exception -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[Catch:{ IllegalStateException -> 0x0031, Exception -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b A[Catch:{ IllegalStateException -> 0x0031, Exception -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[Catch:{ IllegalStateException -> 0x0031, Exception -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011c A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.p10725a.p10730b.C142676c mo117489b() {
        /*
            r14 = this;
            monitor-enter(r14)
            com.google.android.gms.analytics.internal.az r0 = r14.f387226c     // Catch:{ all -> 0x019b }
            r1 = 1000(0x3e8, double:4.94E-321)
            boolean r0 = r0.mo117526a(r1)     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0197
            com.google.android.gms.analytics.internal.az r0 = r14.f387226c     // Catch:{ all -> 0x019b }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x019b }
            r0.f387316a = r1     // Catch:{ all -> 0x019b }
            r7 = 1
            r8 = 0
            com.google.android.gms.analytics.internal.j r0 = r14.f387328e     // Catch:{ IllegalStateException -> 0x0031, Exception -> 0x001f }
            android.content.Context r0 = r0.f387334b     // Catch:{ IllegalStateException -> 0x0031, Exception -> 0x001f }
            com.google.android.gms.a.b.c r0 = com.google.android.gms.p10725a.p10730b.C142677d.m231497b(r0)     // Catch:{ IllegalStateException -> 0x0031, Exception -> 0x001f }
            r9 = r0
            goto L_0x003c
        L_0x001f:
            r0 = move-exception
            r4 = r0
            boolean r0 = f387224a     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x003b
            f387224a = r7     // Catch:{ all -> 0x019b }
            r2 = 5
            java.lang.String r3 = "Error getting advertiser id"
            r5 = 0
            r6 = 0
            r1 = r14
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x019b }
            goto L_0x003b
        L_0x0031:
            r2 = 5
            java.lang.String r3 = "IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details."
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r14
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x019b }
        L_0x003b:
            r9 = r8
        L_0x003c:
            com.google.android.gms.a.b.c r0 = r14.f387225b     // Catch:{ all -> 0x019b }
            if (r9 != 0) goto L_0x0042
            r10 = r8
            goto L_0x0045
        L_0x0042:
            java.lang.String r1 = r9.f387158a     // Catch:{ all -> 0x019b }
            r10 = r1
        L_0x0045:
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x019b }
            if (r1 == 0) goto L_0x004d
            goto L_0x017d
        L_0x004d:
            com.google.android.gms.analytics.internal.j r1 = r14.f387328e     // Catch:{ all -> 0x019b }
            com.google.android.gms.analytics.internal.ab r1 = r1.mo117546f()     // Catch:{ all -> 0x019b }
            java.lang.String r11 = r1.mo117491b()     // Catch:{ all -> 0x019b }
            java.lang.Object r12 = r14.f387229g     // Catch:{ all -> 0x019b }
            monitor-enter(r12)     // Catch:{ all -> 0x019b }
            boolean r1 = r14.f387228f     // Catch:{ all -> 0x0194 }
            r13 = 0
            if (r1 != 0) goto L_0x00c8
            com.google.android.gms.analytics.internal.j r0 = r14.f387328e     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            android.content.Context r0 = r0.f387334b     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            java.lang.String r1 = "gaClientIdData"
            java.io.FileInputStream r0 = r0.openFileInput(r1)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            r1 = 128(0x80, float:1.794E-43)
            byte[] r2 = new byte[r1]     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            int r1 = r0.read(r2, r13, r1)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            int r3 = r0.available()     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            if (r3 <= 0) goto L_0x008e
            java.lang.String r3 = "Hash file seems corrupted, deleting it."
            r2 = 5
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r14
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            r0.close()     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            com.google.android.gms.analytics.internal.j r0 = r14.f387328e     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            android.content.Context r0 = r0.f387334b     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            java.lang.String r1 = "gaClientIdData"
            r0.deleteFile(r1)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            goto L_0x00c2
        L_0x008e:
            if (r1 > 0) goto L_0x009e
            java.lang.String r3 = "Hash file is empty."
            r2 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r14
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            r0.close()     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            goto L_0x00c2
        L_0x009e:
            java.lang.String r3 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            r3.<init>(r2, r13, r1)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x00ab }
            r0.close()     // Catch:{ FileNotFoundException -> 0x00c3, IOException -> 0x00a7 }
            goto L_0x00c3
        L_0x00a7:
            r0 = move-exception
            r4 = r0
            r0 = r3
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            r4 = r0
            r0 = r8
        L_0x00ae:
            r2 = 5
            java.lang.String r3 = "Error reading Hash file, deleting it"
            r5 = 0
            r6 = 0
            r1 = r14
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0194 }
            com.google.android.gms.analytics.internal.j r1 = r14.f387328e     // Catch:{ all -> 0x0194 }
            android.content.Context r1 = r1.f387334b     // Catch:{ all -> 0x0194 }
            java.lang.String r2 = "gaClientIdData"
            r1.deleteFile(r2)     // Catch:{ all -> 0x0194 }
            r3 = r0
            goto L_0x00c3
        L_0x00c2:
            r3 = r8
        L_0x00c3:
            r14.f387227d = r3     // Catch:{ all -> 0x0194 }
            r14.f387228f = r7     // Catch:{ all -> 0x0194 }
            goto L_0x0103
        L_0x00c8:
            java.lang.String r1 = r14.f387227d     // Catch:{ all -> 0x0194 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0194 }
            if (r1 == 0) goto L_0x0103
            if (r0 != 0) goto L_0x00d4
            r0 = r8
            goto L_0x00d6
        L_0x00d4:
            java.lang.String r0 = r0.f387158a     // Catch:{ all -> 0x0194 }
        L_0x00d6:
            if (r0 != 0) goto L_0x00ee
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0194 }
            r0.<init>()     // Catch:{ all -> 0x0194 }
            r0.append(r10)     // Catch:{ all -> 0x0194 }
            r0.append(r11)     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0194 }
            boolean r0 = r14.m231535d(r0)     // Catch:{ all -> 0x0194 }
            monitor-exit(r12)     // Catch:{ all -> 0x0194 }
            goto L_0x017b
        L_0x00ee:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0194 }
            r1.<init>()     // Catch:{ all -> 0x0194 }
            r1.append(r0)     // Catch:{ all -> 0x0194 }
            r1.append(r11)     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = m231534c(r0)     // Catch:{ all -> 0x0194 }
            r14.f387227d = r0     // Catch:{ all -> 0x0194 }
        L_0x0103:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0194 }
            r0.<init>()     // Catch:{ all -> 0x0194 }
            r0.append(r10)     // Catch:{ all -> 0x0194 }
            r0.append(r11)     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = m231534c(r0)     // Catch:{ all -> 0x0194 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0194 }
            if (r1 == 0) goto L_0x011e
            monitor-exit(r12)     // Catch:{ all -> 0x0194 }
            goto L_0x0180
        L_0x011e:
            java.lang.String r1 = r14.f387227d     // Catch:{ all -> 0x0194 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x0128
            monitor-exit(r12)     // Catch:{ all -> 0x0194 }
            goto L_0x017d
        L_0x0128:
            java.lang.String r0 = r14.f387227d     // Catch:{ all -> 0x0194 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0194 }
            if (r0 != 0) goto L_0x0167
            java.lang.String r3 = "Resetting the client id because Advertising Id changed."
            r2 = 2
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r14
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0194 }
            com.google.android.gms.analytics.internal.j r0 = r14.f387328e     // Catch:{ all -> 0x0194 }
            com.google.android.gms.analytics.internal.ab r1 = r0.mo117546f()     // Catch:{ all -> 0x0194 }
            monitor-enter(r1)     // Catch:{ all -> 0x0194 }
            r1.f387231a = r8     // Catch:{ all -> 0x0164 }
            com.google.android.gms.analytics.internal.j r0 = r1.f387328e     // Catch:{ all -> 0x0164 }
            com.google.android.gms.analytics.q r0 = r0.mo117542b()     // Catch:{ all -> 0x0164 }
            com.google.android.gms.analytics.internal.aa r2 = new com.google.android.gms.analytics.internal.aa     // Catch:{ all -> 0x0164 }
            r2.<init>(r1)     // Catch:{ all -> 0x0164 }
            java.util.concurrent.Future r0 = r0.mo117602a(r2)     // Catch:{ all -> 0x0164 }
            r1.f387232b = r0     // Catch:{ all -> 0x0164 }
            monitor-exit(r1)     // Catch:{ all -> 0x0164 }
            java.lang.String r11 = r1.mo117491b()     // Catch:{ all -> 0x0194 }
            java.lang.String r3 = "New client Id"
            r2 = 2
            r5 = 0
            r6 = 0
            r1 = r14
            r4 = r11
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0194 }
            goto L_0x0167
        L_0x0164:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0164 }
            throw r0     // Catch:{ all -> 0x0194 }
        L_0x0167:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0194 }
            r0.<init>()     // Catch:{ all -> 0x0194 }
            r0.append(r10)     // Catch:{ all -> 0x0194 }
            r0.append(r11)     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0194 }
            boolean r0 = r14.m231535d(r0)     // Catch:{ all -> 0x0194 }
            monitor-exit(r12)     // Catch:{ all -> 0x0194 }
        L_0x017b:
            if (r0 == 0) goto L_0x0180
        L_0x017d:
            r14.f387225b = r9     // Catch:{ all -> 0x019b }
            goto L_0x0197
        L_0x0180:
            r2 = 6
            java.lang.String r3 = "Failed to reset client id on adid change. Not using adid"
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r14
            super.mo117536i(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x019b }
            com.google.android.gms.a.b.c r0 = new com.google.android.gms.a.b.c     // Catch:{ all -> 0x019b }
            java.lang.String r1 = ""
            r0.<init>(r1, r13)     // Catch:{ all -> 0x019b }
            r14.f387225b = r0     // Catch:{ all -> 0x019b }
            goto L_0x0197
        L_0x0194:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0194 }
            throw r0     // Catch:{ all -> 0x019b }
        L_0x0197:
            com.google.android.gms.a.b.c r0 = r14.f387225b     // Catch:{ all -> 0x019b }
            monitor-exit(r14)
            return r0
        L_0x019b:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142703a.mo117489b():com.google.android.gms.a.b.c");
    }
}
