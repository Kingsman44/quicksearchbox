package com.google.android.gms.common;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.p10782e.C143873c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.ab */
/* compiled from: PG */
public class C143700ab {

    /* renamed from: a */
    private static boolean f389597a = false;

    /* renamed from: b */
    static boolean f389598b = false;

    /* renamed from: c */
    static final AtomicBoolean f389599c = new AtomicBoolean();

    /* renamed from: d */
    public static final /* synthetic */ int f389600d = 0;

    /* renamed from: e */
    private static final AtomicBoolean f389601e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static int m233439a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0103  */
    @java.lang.Deprecated
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m233440b(android.content.Context r9, int r10) {
        /*
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x000b }
            r1 = 2132085813(0x7f150c35, float:1.9811835E38)
            r0.getString(r1)     // Catch:{ all -> 0x000b }
            goto L_0x0012
        L_0x000b:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0012:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = r9.getPackageName()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0079
            java.util.concurrent.atomic.AtomicBoolean r0 = f389601e
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0028
            goto L_0x0079
        L_0x0028:
            java.lang.Object r0 = com.google.android.gms.common.internal.C143908ax.f390105a
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.common.internal.C143908ax.f390106b     // Catch:{ all -> 0x0076 }
            if (r2 == 0) goto L_0x0031
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0060
        L_0x0031:
            com.google.android.gms.common.internal.C143908ax.f390106b = r1     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = r9.getPackageName()     // Catch:{ all -> 0x0076 }
            com.google.android.gms.common.e.c r3 = com.google.android.gms.common.p10782e.C143873c.f389983a     // Catch:{ all -> 0x0076 }
            com.google.android.gms.common.e.b r3 = r3.mo119351a(r9)     // Catch:{ all -> 0x0076 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.mo119347a(r2, r4)     // Catch:{ NameNotFoundException -> 0x0057 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0057 }
            if (r2 != 0) goto L_0x0049
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            goto L_0x0060
        L_0x0049:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0057 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0057 }
            com.google.android.gms.common.internal.C143908ax.f390107c = r2     // Catch:{ NameNotFoundException -> 0x0057 }
            goto L_0x005f
        L_0x0057:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0076 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
        L_0x0060:
            int r0 = com.google.android.gms.common.internal.C143908ax.f390107c
            if (r0 == 0) goto L_0x0070
            r2 = 223810000(0xd5711d0, float:6.627343E-31)
            if (r0 != r2) goto L_0x006a
            goto L_0x0079
        L_0x006a:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r9.<init>(r0)
            throw r9
        L_0x0070:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r9 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r9.<init>()
            throw r9
        L_0x0076:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            throw r9
        L_0x0079:
            boolean r0 = com.google.android.gms.common.util.C144007g.m234186b(r9)
            r2 = 0
            if (r0 != 0) goto L_0x00b0
            java.lang.Boolean r0 = com.google.android.gms.common.util.C144007g.f390245a
            if (r0 != 0) goto L_0x00a6
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x009f
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r0 = 0
            goto L_0x00a0
        L_0x009f:
            r0 = 1
        L_0x00a0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.gms.common.util.C144007g.f390245a = r0
        L_0x00a6:
            java.lang.Boolean r0 = com.google.android.gms.common.util.C144007g.f390245a
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b0
            r0 = 1
            goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            if (r10 < 0) goto L_0x00b5
            r3 = 1
            goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            com.google.android.gms.common.internal.C143919bh.m233959b(r3)
            java.lang.String r3 = r9.getPackageName()
            android.content.pm.PackageManager r4 = r9.getPackageManager()
            r5 = 9
            if (r0 == 0) goto L_0x00e1
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00ce }
            goto L_0x00e2
        L_0x00ce:
            java.lang.String r9 = "GooglePlayServicesUtil"
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r9, r10)
        L_0x00dd:
            r1 = 9
            goto L_0x01a5
        L_0x00e1:
            r6 = 0
        L_0x00e2:
            java.lang.String r7 = "com.google.android.gms"
            r8 = 64
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x0196 }
            com.google.android.gms.common.C143701ac.m233450a(r9)
            boolean r9 = com.google.android.gms.common.C143701ac.m233452g(r7, r1)
            if (r9 != 0) goto L_0x0103
            java.lang.String r9 = "GooglePlayServicesUtil"
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r9, r10)
            goto L_0x00dd
        L_0x0103:
            if (r0 == 0) goto L_0x011e
            com.google.android.gms.common.internal.C143919bh.m233958a(r6)
            boolean r9 = com.google.android.gms.common.C143701ac.m233452g(r6, r1)
            if (r9 != 0) goto L_0x011e
            java.lang.String r9 = "GooglePlayServicesUtil"
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r9, r10)
            goto L_0x00dd
        L_0x011e:
            if (r0 == 0) goto L_0x0140
            if (r6 == 0) goto L_0x0140
            android.content.pm.Signature[] r9 = r6.signatures
            r9 = r9[r2]
            android.content.pm.Signature[] r0 = r7.signatures
            r0 = r0[r2]
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0140
            java.lang.String r9 = "GooglePlayServicesUtil"
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r9, r10)
            goto L_0x00dd
        L_0x0140:
            int r9 = r7.versionCode
            int r9 = com.google.android.gms.common.util.C144008h.m234187a(r9)
            int r0 = com.google.android.gms.common.util.C144008h.m234187a(r10)
            if (r9 >= r0) goto L_0x0173
            int r9 = r7.versionCode
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Google Play services out of date for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ".  Requires "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = " but found "
            r0.append(r10)
            r0.append(r9)
            java.lang.String r9 = "GooglePlayServicesUtil"
            java.lang.String r10 = r0.toString()
            android.util.Log.w(r9, r10)
            r1 = 2
            goto L_0x01a5
        L_0x0173:
            android.content.pm.ApplicationInfo r9 = r7.applicationInfo
            if (r9 != 0) goto L_0x018f
            java.lang.String r9 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r9 = r4.getApplicationInfo(r9, r2)     // Catch:{ NameNotFoundException -> 0x017e }
            goto L_0x018f
        L_0x017e:
            r9 = move-exception
            java.lang.String r10 = "GooglePlayServicesUtil"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r2 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r0 = r0.concat(r2)
            android.util.Log.wtf(r10, r0, r9)
            goto L_0x01a5
        L_0x018f:
            boolean r9 = r9.enabled
            if (r9 != 0) goto L_0x0195
            r1 = 3
            goto L_0x01a5
        L_0x0195:
            return r2
        L_0x0196:
            java.lang.String r9 = "GooglePlayServicesUtil"
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r0)
            android.util.Log.w(r9, r10)
        L_0x01a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C143700ab.m233440b(android.content.Context, int):int");
    }

    /* renamed from: c */
    public static Context m233441c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: d */
    public static void m233442d(Context context) {
        if (!f389599c.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: e */
    public static void m233443e(Context context, int i) {
        int j = C143876h.f389991d.mo119362j(context, i);
        if (j != 0) {
            Intent k = C143876h.f389991d.mo119363k(context, j, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + j);
            if (k == null) {
                throw new C144022y();
            }
            throw new C144023z(j, "Google Play Services not available", k);
        }
    }

    /* renamed from: f */
    public static boolean m233444f(Context context) {
        if (!f389598b) {
            try {
                PackageInfo b = C143873c.f389983a.mo119351a(context).mo119348b("com.google.android.gms", 64);
                C143701ac.m233450a(context);
                if (b == null || C143701ac.m233452g(b, false) || !C143701ac.m233452g(b, true)) {
                    f389597a = false;
                } else {
                    f389597a = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                f389598b = true;
            }
        }
        return f389597a || !"user".equals(Build.TYPE);
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m233445g(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m233446h(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m233446h(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0067 }
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch:{ Exception -> 0x0067 }
            java.util.List r2 = r2.getAllSessions()     // Catch:{ Exception -> 0x0067 }
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0017
            return r4
        L_0x002f:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r6 = r2.getApplicationInfo(r6, r3)     // Catch:{  }
            if (r0 == 0) goto L_0x003e
            boolean r5 = r6.enabled     // Catch:{  }
            return r5
        L_0x003e:
            boolean r6 = r6.enabled     // Catch:{  }
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = "user"
            java.lang.Object r6 = r5.getSystemService(r6)     // Catch:{  }
            com.google.android.gms.common.internal.C143919bh.m233958a(r6)     // Catch:{  }
            android.os.UserManager r6 = (android.os.UserManager) r6     // Catch:{  }
            java.lang.String r5 = r5.getPackageName()     // Catch:{  }
            android.os.Bundle r5 = r6.getApplicationRestrictions(r5)     // Catch:{  }
            if (r5 == 0) goto L_0x0066
            java.lang.String r6 = "true"
            java.lang.String r0 = "restricted_profile"
            java.lang.String r5 = r5.getString(r0)     // Catch:{  }
            boolean r5 = r6.equals(r5)     // Catch:{  }
            if (r5 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            return r4
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C143700ab.m233446h(android.content.Context, java.lang.String):boolean");
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m233447i(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m233448j(Context context, int i, String str) {
        return C143873c.f389983a.mo119351a(context).mo119350d(i, str);
    }

    @Deprecated
    /* renamed from: k */
    public static String m233449k() {
        return "CANCELED";
    }
}
