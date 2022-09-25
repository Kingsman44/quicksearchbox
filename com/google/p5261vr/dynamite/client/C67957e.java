package com.google.p5261vr.dynamite.client;

import android.content.Context;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.vr.dynamite.client.e */
/* compiled from: PG */
final class C67957e {

    /* renamed from: a */
    private Context f184163a;

    /* renamed from: b */
    private ILoadedInstanceCreator f184164b;

    /* renamed from: c */
    private final C67958f f184165c;

    public C67957e(C67958f fVar) {
        this.f184165c = fVar;
    }

    /* renamed from: c */
    private static IBinder m98218c(ClassLoader classLoader) {
        try {
            return (IBinder) classLoader.loadClass("com.google.vr.dynamite.LoadedInstanceCreator").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("No constructor for dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Unable to invoke constructor of dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e2);
        } catch (ClassNotFoundException e3) {
            throw new IllegalStateException("Unable to find dynamic class com.google.vr.dynamite.LoadedInstanceCreator", e3);
        } catch (InstantiationException e4) {
            throw new IllegalStateException("Unable to instantiate the remote class com.google.vr.dynamite.LoadedInstanceCreator", e4);
        } catch (IllegalAccessException e5) {
            throw new IllegalStateException("Unable to call the default constructor of com.google.vr.dynamite.LoadedInstanceCreator", e5);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.Context mo60071a(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f184163a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0017
            com.google.vr.dynamite.client.f r0 = r2.f184165c     // Catch:{ NameNotFoundException -> 0x0011 }
            java.lang.String r0 = r0.f184166a     // Catch:{ NameNotFoundException -> 0x0011 }
            r1 = 3
            android.content.Context r3 = r3.createPackageContext(r0, r1)     // Catch:{ NameNotFoundException -> 0x0011 }
            r2.f184163a = r3     // Catch:{ NameNotFoundException -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            com.google.vr.dynamite.client.d r3 = new com.google.vr.dynamite.client.d     // Catch:{ all -> 0x001b }
            r3.<init>()     // Catch:{ all -> 0x001b }
            throw r3     // Catch:{ all -> 0x001b }
        L_0x0017:
            android.content.Context r3 = r2.f184163a     // Catch:{ all -> 0x001b }
            monitor-exit(r2)
            return r3
        L_0x001b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5261vr.dynamite.client.C67957e.mo60071a(android.content.Context):android.content.Context");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.p5261vr.dynamite.client.ILoadedInstanceCreator mo60072b(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.vr.dynamite.client.ILoadedInstanceCreator r0 = r2.f184164b     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002b
            android.content.Context r3 = r2.mo60071a(r3)     // Catch:{ all -> 0x002f }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ all -> 0x002f }
            android.os.IBinder r3 = m98218c(r3)     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x0015
            r3 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r0 = "com.google.vr.dynamite.client.ILoadedInstanceCreator"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)     // Catch:{ all -> 0x002f }
            boolean r1 = r0 instanceof com.google.p5261vr.dynamite.client.ILoadedInstanceCreator     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0023
            r3 = r0
            com.google.vr.dynamite.client.ILoadedInstanceCreator r3 = (com.google.p5261vr.dynamite.client.ILoadedInstanceCreator) r3     // Catch:{ all -> 0x002f }
            goto L_0x0029
        L_0x0023:
            com.google.vr.dynamite.client.a r0 = new com.google.vr.dynamite.client.a     // Catch:{ all -> 0x002f }
            r0.<init>(r3)     // Catch:{ all -> 0x002f }
            r3 = r0
        L_0x0029:
            r2.f184164b = r3     // Catch:{ all -> 0x002f }
        L_0x002b:
            com.google.vr.dynamite.client.ILoadedInstanceCreator r3 = r2.f184164b     // Catch:{ all -> 0x002f }
            monitor-exit(r2)
            return r3
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5261vr.dynamite.client.C67957e.mo60072b(android.content.Context):com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }
}
