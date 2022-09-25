package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;

/* renamed from: com.google.android.gms.dynamite.b */
/* compiled from: PG */
public final class C144140b {

    /* renamed from: a */
    private static volatile ClassLoader f390460a;

    /* renamed from: b */
    private static volatile Thread f390461b;

    /* renamed from: a */
    public static synchronized ClassLoader m234362a() {
        ClassLoader classLoader;
        synchronized (C144140b.class) {
            if (f390460a == null) {
                f390460a = m234363b();
            }
            classLoader = f390460a;
        }
        return classLoader;
    }

    /* renamed from: b */
    private static synchronized ClassLoader m234363b() {
        synchronized (C144140b.class) {
            ClassLoader classLoader = null;
            if (f390461b == null) {
                f390461b = m234364c();
                if (f390461b == null) {
                    return null;
                }
            }
            synchronized (f390461b) {
                try {
                    classLoader = f390461b.getContextClassLoader();
                } catch (SecurityException e) {
                    String message = e.getMessage();
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + message);
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    private static synchronized Thread m234364c() {
        C144139a aVar;
        C144139a aVar2;
        SecurityException e;
        ThreadGroup threadGroup;
        synchronized (C144140b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i2];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i2++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i >= activeCount) {
                            aVar = null;
                            break;
                        }
                        aVar = threadArr[i];
                        if ("GmsDynamite".equals(aVar.getName())) {
                            break;
                        }
                        i++;
                    }
                    if (aVar == null) {
                        try {
                            aVar2 = new C144139a(threadGroup);
                            try {
                                aVar2.setContextClassLoader((ClassLoader) null);
                                aVar2.start();
                            } catch (SecurityException e2) {
                                e = e2;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            aVar2 = aVar;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                            aVar = aVar2;
                            return aVar;
                        }
                        aVar = aVar2;
                    }
                } catch (SecurityException e4) {
                    e = e4;
                    aVar2 = null;
                    Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                    aVar = aVar2;
                    return aVar;
                }
            }
            return aVar;
        }
    }
}
