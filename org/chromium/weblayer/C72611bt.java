package org.chromium.weblayer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import com.evernote.android.state.BuildConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72334bc;
import org.chromium.p5643b.p5644a.C72341bj;

/* renamed from: org.chromium.weblayer.bt */
/* compiled from: PG */
public final class C72611bt {

    /* renamed from: a */
    public static Context f193166a;

    /* renamed from: b */
    public static boolean f193167b;

    /* renamed from: c */
    public static long f193168c;

    /* renamed from: d */
    public static long f193169d;

    /* renamed from: e */
    public static long f193170e;

    /* renamed from: g */
    private static Context f193171g;

    /* renamed from: h */
    private static ClassLoader f193172h;

    /* renamed from: i */
    private static C72610bs f193173i;

    /* renamed from: f */
    public final C72334bc f193174f;

    protected C72611bt() {
        this.f193174f = null;
    }

    /* renamed from: a */
    public static int m107413a() {
        C72610bs bsVar = f193173i;
        if (bsVar != null) {
            return bsVar.f193160d;
        }
        throw new IllegalStateException("This should only be called once WebLayer is initialized");
    }

    /* renamed from: b */
    public static Context m107414b(Context context) {
        Context context2 = f193171g;
        if (context2 != null) {
            return context2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Class<?> cls = Class.forName("android.webkit.WebViewFactory");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        String string = bundle != null ? bundle.getString("org.chromium.weblayer.WebLayerPackage") : null;
        f193166a = context;
        if (string != null) {
            Context createPackageContext = context.createPackageContext(string, 3);
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(string, 1152);
            Field declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sPackageInfo");
            declaredField.setAccessible(true);
            declaredField.set((Object) null, packageInfo);
            f193171g = createPackageContext;
        } else {
            Method declaredMethod = cls.getDeclaredMethod("getWebViewContextAndSetProvider", new Class[0]);
            declaredMethod.setAccessible(true);
            f193171g = (Context) declaredMethod.invoke((Object) null, new Object[0]);
        }
        f193169d = SystemClock.elapsedRealtime() - elapsedRealtime;
        return f193171g;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:6|7|8|9|10|11|12|13|14|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        android.os.StrictMode.setThreadPolicy(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        throw r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0020 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Class m107415c(android.content.Context r10, java.lang.String r11) {
        /*
            java.lang.ClassLoader r0 = f193172h
            if (r0 == 0) goto L_0x0009
            java.lang.Class r10 = r0.loadClass(r11)
            return r10
        L_0x0009:
            long r0 = android.os.SystemClock.elapsedRealtime()
            boolean r2 = f193167b
            java.lang.String r3 = "weblayer"
            r4 = 0
            if (r2 == 0) goto L_0x003a
            android.content.Context r10 = m107414b(r10)
            java.lang.ClassLoader r2 = r10.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0020 }
            java.lang.Class.forName(r11, r4, r2)     // Catch:{ ClassNotFoundException -> 0x0020 }
            goto L_0x0032
        L_0x0020:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ NameNotFoundException -> 0x0032 }
            android.content.Context r3 = r10.createContextForSplit(r3)     // Catch:{ all -> 0x002d }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ NameNotFoundException -> 0x0032 }
            r10 = r3
            goto L_0x0032
        L_0x002d:
            r3 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ NameNotFoundException -> 0x0032 }
            throw r3     // Catch:{ NameNotFoundException -> 0x0032 }
        L_0x0032:
            java.lang.ClassLoader r10 = r10.getClassLoader()
            f193172h = r10
            goto L_0x00ee
        L_0x003a:
            android.content.Context r2 = m107414b(r10)
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            java.lang.String r5 = r2.getPackageName()
            r6 = 9216(0x2400, float:1.2914E-41)
            android.content.pm.PackageInfo r10 = r10.getPackageInfo(r5, r6)
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Class<dalvik.system.BaseDexClassLoader> r5 = dalvik.system.BaseDexClassLoader.class
            java.lang.String r6 = "getLdLibraryPath"
            java.lang.Class[] r7 = new java.lang.Class[r4]
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)
            dalvik.system.BaseDexClassLoader r2 = (dalvik.system.BaseDexClassLoader) r2
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Object r2 = r5.invoke(r2, r6)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = ":"
            java.lang.String[] r2 = r2.split(r5)
            r5 = 0
        L_0x006b:
            int r6 = r2.length
            if (r5 >= r6) goto L_0x007f
            r6 = r2[r5]
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "/."
            java.lang.String r6 = r7.concat(r6)
            r2[r5] = r6
            int r5 = r5 + 1
            goto L_0x006b
        L_0x007f:
            android.content.pm.ApplicationInfo r10 = r10.applicationInfo
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            r5.<init>(r6)
            java.lang.String r6 = r10.sourceDir
            if (r6 == 0) goto L_0x0091
            java.lang.String r6 = r10.sourceDir
            r5.add(r6)
        L_0x0091:
            java.lang.String[] r6 = r10.splitSourceDirs
            if (r6 == 0) goto L_0x00bb
            java.lang.String[] r6 = r10.splitNames
            r7 = 0
        L_0x0098:
            java.lang.String[] r8 = r10.splitSourceDirs
            int r8 = r8.length
            if (r7 >= r8) goto L_0x00bb
            if (r6 == 0) goto L_0x00b1
            r8 = r6[r7]
            java.lang.String r9 = "chrome"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00b1
            r8 = r6[r7]
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x00b8
        L_0x00b1:
            java.lang.String[] r8 = r10.splitSourceDirs
            r8 = r8[r7]
            r5.add(r8)
        L_0x00b8:
            int r7 = r7 + 1
            goto L_0x0098
        L_0x00bb:
            java.lang.String[] r3 = r10.sharedLibraryFiles
            if (r3 == 0) goto L_0x00cc
            java.lang.String[] r10 = r10.sharedLibraryFiles
            int r3 = r10.length
        L_0x00c2:
            if (r4 >= r3) goto L_0x00cc
            r6 = r10[r4]
            r5.add(r6)
            int r4 = r4 + 1
            goto L_0x00c2
        L_0x00cc:
            java.lang.String r10 = java.io.File.pathSeparator
            java.lang.String r10 = android.text.TextUtils.join(r10, r5)
            java.lang.String r3 = java.io.File.pathSeparator
            java.lang.String r2 = android.text.TextUtils.join(r3, r2)
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskReads()
            dalvik.system.PathClassLoader r4 = new dalvik.system.PathClassLoader     // Catch:{ all -> 0x00fc }
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00fc }
            java.lang.ClassLoader r5 = r5.getParent()     // Catch:{ all -> 0x00fc }
            r4.<init>(r10, r2, r5)     // Catch:{ all -> 0x00fc }
            android.os.StrictMode.setThreadPolicy(r3)
            f193172h = r4
        L_0x00ee:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            f193168c = r2
            java.lang.ClassLoader r10 = f193172h
            java.lang.Class r10 = r10.loadClass(r11)
            return r10
        L_0x00fc:
            r10 = move-exception
            android.os.StrictMode.setThreadPolicy(r3)
            goto L_0x0102
        L_0x0101:
            throw r10
        L_0x0102:
            goto L_0x0101
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.C72611bt.m107415c(android.content.Context, java.lang.String):java.lang.Class");
    }

    /* renamed from: d */
    public static String m107416d(String str) {
        if (!BuildConfig.FLAVOR.equals(str)) {
            return str == null ? BuildConfig.FLAVOR : str;
        }
        throw new AndroidRuntimeException("Profile path cannot be empty");
    }

    /* renamed from: e */
    public static C72610bs m107417e(Context context) {
        if (f193173i == null) {
            f193173i = new C72610bs(context);
        }
        return f193173i;
    }

    /* renamed from: f */
    static C72611bt m107418f(Context context) {
        C72604bm.m107399a();
        m107424l(context);
        return m107417e(context).f193158b;
    }

    /* renamed from: g */
    public static C72611bt m107419g(Context context) {
        C72604bm.m107399a();
        m107424l(context);
        C72610bs e = m107417e(context);
        C72611bt btVar = e.f193158b;
        if (btVar != null) {
            return btVar;
        }
        if (e.mo64481b() == null) {
            e.mo64480a();
            return null;
        }
        try {
            e.mo64481b().mo63778k(new C72341bj(e.f193163g), new C72341bj(m107414b(e.f193163g)));
            e.mo64480a();
            return e.f193158b;
        } catch (Exception e2) {
            throw new C72304a(e2);
        }
    }

    /* renamed from: h */
    public static void m107420h(Context context, C72621j jVar) {
        C72604bm.m107399a();
        m107424l(context);
        C72610bs e = m107417e(context);
        C72611bt btVar = e.f193158b;
        if (btVar != null) {
            jVar.mo46626a(btVar);
            return;
        }
        e.f193157a.add(jVar);
        if (!e.f193162f) {
            e.f193162f = true;
            if (e.mo64481b() == null) {
                e.mo64480a();
                return;
            }
            try {
                e.mo64481b().mo63777j(new C72341bj(e.f193163g), new C72341bj(m107414b(e.f193163g)), new C72341bj(new C72609br(e)));
            } catch (Exception e2) {
                throw new C72304a(e2);
            }
        }
    }

    /* renamed from: i */
    static boolean m107421i() {
        return f193173i != null;
    }

    /* renamed from: j */
    public static boolean m107422j(Context context) {
        C72604bm.m107399a();
        return m107417e(context).f193159c;
    }

    /* renamed from: k */
    public static boolean m107423k() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    /* renamed from: l */
    private static void m107424l(Context context) {
        if (!m107422j(context)) {
            throw new C72605bn(f193173i.f193161e);
        }
    }

    public C72611bt(C72334bc bcVar) {
        this.f193174f = bcVar;
        try {
            bcVar.mo63784q(new C72608bq());
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
