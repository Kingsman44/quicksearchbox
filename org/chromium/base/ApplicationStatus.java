package org.chromium.base;

import java.util.HashMap;
import java.util.Map;
import p3186j$.util.DesugarCollections;

/* compiled from: PG */
public class ApplicationStatus {

    /* renamed from: a */
    public static final Map f192472a = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: b */
    public static C72377c f192473b;

    /* renamed from: c */
    public static C72390p f192474c;

    private ApplicationStatus() {
    }

    /* renamed from: a */
    public static void m107011a(C72377c cVar) {
        if (f192474c == null) {
            f192474c = new C72390p();
        }
        f192474c.mo63852d(cVar);
    }

    public static int getStateForApplication() {
        synchronized (f192472a) {
        }
        return 0;
    }

    public static boolean hasVisibleActivities() {
        getStateForApplication();
        return false;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        C72373b bVar = new C72373b();
        if (ThreadUtils.m107029b()) {
            bVar.run();
        } else {
            ThreadUtils.m107028a().post(bVar);
        }
    }
}
