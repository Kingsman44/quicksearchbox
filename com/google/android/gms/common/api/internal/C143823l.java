package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* compiled from: PG */
public final class C143823l implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    public static final C143823l f389880a = new C143823l();

    /* renamed from: b */
    public final AtomicBoolean f389881b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicBoolean f389882c = new AtomicBoolean();

    /* renamed from: d */
    private final ArrayList f389883d = new ArrayList();

    /* renamed from: e */
    private boolean f389884e = false;

    private C143823l() {
    }

    /* renamed from: b */
    public static void m233745b(Application application) {
        C143823l lVar = f389880a;
        synchronized (lVar) {
            if (!lVar.f389884e) {
                application.registerActivityLifecycleCallbacks(lVar);
                application.registerComponentCallbacks(lVar);
                lVar.f389884e = true;
            }
        }
    }

    /* renamed from: c */
    private final void m233746c(boolean z) {
        synchronized (f389880a) {
            Iterator it = this.f389883d.iterator();
            while (it.hasNext()) {
                ((C143822k) it.next()).mo57734a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo119264a(C143822k kVar) {
        synchronized (f389880a) {
            this.f389883d.add(kVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f389881b.compareAndSet(true, false);
        this.f389882c.set(true);
        if (compareAndSet) {
            m233746c(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f389881b.compareAndSet(true, false);
        this.f389882c.set(true);
        if (compareAndSet) {
            m233746c(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f389881b.compareAndSet(false, true)) {
            this.f389882c.set(true);
            m233746c(true);
        }
    }
}
