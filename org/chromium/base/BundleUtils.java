package org.chromium.base;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import androidx.p060c.C0977g;
import androidx.p060c.C0984n;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Field;
import java.util.Arrays;
import p3186j$.util.DesugarCollections;

/* compiled from: PG */
public class BundleUtils {

    /* renamed from: a */
    private static final Object f192488a = new Object();

    /* renamed from: b */
    private static final C0984n f192489b = new C0984n(0);

    static {
        DesugarCollections.synchronizedMap(new C0977g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4 = org.chromium.base.p5645a.C72369a.m107033a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        r0 = f192488a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        monitor-enter(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Context m107013a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = r4
        L_0x0001:
            boolean r1 = r0 instanceof android.content.ContextWrapper     // Catch:{ NameNotFoundException -> 0x00e9 }
            if (r1 == 0) goto L_0x0015
            boolean r1 = r0 instanceof android.app.Application     // Catch:{ NameNotFoundException -> 0x00e9 }
            if (r1 == 0) goto L_0x000e
            android.content.Context r4 = org.chromium.base.p5645a.C72369a.m107033a(r4, r5)     // Catch:{ NameNotFoundException -> 0x00e9 }
            goto L_0x001d
        L_0x000e:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0     // Catch:{ NameNotFoundException -> 0x00e9 }
            android.content.Context r0 = r0.getBaseContext()     // Catch:{ NameNotFoundException -> 0x00e9 }
            goto L_0x0001
        L_0x0015:
            java.lang.Object r0 = f192488a     // Catch:{ NameNotFoundException -> 0x00e9 }
            monitor-enter(r0)     // Catch:{ NameNotFoundException -> 0x00e9 }
            android.content.Context r4 = org.chromium.base.p5645a.C72369a.m107033a(r4, r5)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
        L_0x001d:
            java.lang.ClassLoader r0 = r4.getClassLoader()     // Catch:{ NameNotFoundException -> 0x00e9 }
            r0.getParent()     // Catch:{ NameNotFoundException -> 0x00e9 }
            androidx.c.n r0 = f192489b     // Catch:{ NameNotFoundException -> 0x00e9 }
            monitor-enter(r0)     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x00e3 }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ all -> 0x00e3 }
            r2 = 0
            if (r1 == 0) goto L_0x003f
            java.lang.ClassLoader r3 = r4.getClassLoader()     // Catch:{ all -> 0x00e3 }
            boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x00e3 }
            if (r3 != 0) goto L_0x0046
            m107014b(r4, r1)     // Catch:{ all -> 0x00e3 }
            r2 = 1
            goto L_0x0046
        L_0x003f:
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch:{ all -> 0x00e3 }
            r0.put(r5, r1)     // Catch:{ all -> 0x00e3 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00e9 }
            r0.<init>()     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.lang.String r1 = "Android.IsolatedSplits.ClassLoaderReplaced."
            r0.append(r1)     // Catch:{ NameNotFoundException -> 0x00e9 }
            r0.append(r5)     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.lang.String r5 = r0.toString()     // Catch:{ NameNotFoundException -> 0x00e9 }
            org.chromium.base.b.b r0 = org.chromium.base.p5646b.C72376c.f192523a     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r0.f192520a     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            r1.lock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.Map r1 = r0.f192521b     // Catch:{ all -> 0x00d8 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x00d8 }
            org.chromium.base.b.a r1 = (org.chromium.base.p5646b.C72374a) r1     // Catch:{ all -> 0x00d8 }
            if (r1 != 0) goto L_0x00c3
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r0.f192520a     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            r1.unlock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r0.f192520a     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            r1.lock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.Map r1 = r0.f192521b     // Catch:{ all -> 0x00b8 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x00b8 }
            org.chromium.base.b.a r1 = (org.chromium.base.p5646b.C72374a) r1     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x00a3
            java.util.Map r1 = r0.f192521b     // Catch:{ all -> 0x00b8 }
            int r1 = r1.size()     // Catch:{ all -> 0x00b8 }
            r3 = 256(0x100, float:3.59E-43)
            if (r1 < r3) goto L_0x0099
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f192522c     // Catch:{ all -> 0x00b8 }
            r5.incrementAndGet()     // Catch:{ all -> 0x00b8 }
            goto L_0x00ae
        L_0x0099:
            org.chromium.base.b.a r1 = new org.chromium.base.b.a     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.util.Map r3 = r0.f192521b     // Catch:{ all -> 0x00b8 }
            r3.put(r5, r1)     // Catch:{ all -> 0x00b8 }
        L_0x00a3:
            boolean r5 = r1.mo63843a(r2)     // Catch:{ all -> 0x00b8 }
            if (r5 != 0) goto L_0x00ae
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f192522c     // Catch:{ all -> 0x00b8 }
            r5.incrementAndGet()     // Catch:{ all -> 0x00b8 }
        L_0x00ae:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r0.f192520a     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            r5.unlock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            goto L_0x00d7
        L_0x00b8:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r0.f192520a     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            r5.unlock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            throw r4     // Catch:{ NameNotFoundException -> 0x00e9 }
        L_0x00c3:
            boolean r5 = r1.mo63843a(r2)     // Catch:{ all -> 0x00d8 }
            if (r5 != 0) goto L_0x00ce
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f192522c     // Catch:{ all -> 0x00d8 }
            r5.incrementAndGet()     // Catch:{ all -> 0x00d8 }
        L_0x00ce:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r0.f192520a     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.readLock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            r5.unlock()     // Catch:{ NameNotFoundException -> 0x00e9 }
        L_0x00d7:
            return r4
        L_0x00d8:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r0.f192520a     // Catch:{ NameNotFoundException -> 0x00e9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.readLock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            r5.unlock()     // Catch:{ NameNotFoundException -> 0x00e9 }
            throw r4     // Catch:{ NameNotFoundException -> 0x00e9 }
        L_0x00e3:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e3 }
            throw r4     // Catch:{ NameNotFoundException -> 0x00e9 }
        L_0x00e6:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            throw r4     // Catch:{ NameNotFoundException -> 0x00e9 }
        L_0x00e9:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            goto L_0x00f1
        L_0x00f0:
            throw r5
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BundleUtils.m107013a(android.content.Context, java.lang.String):android.content.Context");
    }

    /* renamed from: b */
    public static void m107014b(Context context, ClassLoader classLoader) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        try {
            Field declaredField = context.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(context, classLoader);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Error setting ClassLoader.", e);
        }
    }

    /* renamed from: c */
    public static boolean m107015c(Context context, String str) {
        String[] strArr = context.getApplicationInfo().splitNames;
        return strArr != null && Arrays.asList(strArr).contains(str);
    }

    /* renamed from: d */
    private static String m107016d(String str, String str2) {
        int binarySearch;
        ApplicationInfo applicationInfo = C72382h.f192527a.getApplicationInfo();
        String[] strArr = applicationInfo.splitNames;
        if (strArr == null || (binarySearch = Arrays.binarySearch(strArr, str2)) < 0) {
            return null;
        }
        try {
            String str3 = applicationInfo.splitSourceDirs[binarySearch];
            String mapLibraryName = System.mapLibraryName(str);
            return str3 + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + mapLibraryName;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getNativeLibraryPath(String str, String str2) {
        C72408u a = C72408u.m107065a();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary == null) {
                ClassLoader classLoader = C72382h.f192527a.getClassLoader();
                if (classLoader instanceof BaseDexClassLoader) {
                    findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
                } else if (classLoader instanceof C72372ac) {
                    C72372ac acVar = (C72372ac) classLoader;
                    throw null;
                }
                if (findLibrary != null) {
                    a.close();
                    return findLibrary;
                }
                String d = m107016d(str, str2);
                a.close();
                return d;
            }
            a.close();
            return findLibrary;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    public static boolean isBundleForNative() {
        return false;
    }
}
