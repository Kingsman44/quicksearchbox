package com.google.android.apps.gsa.staticplugins.opa.p8338bh.p8339a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bh.a.c */
/* compiled from: PG */
final class C108068c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C108070e f300634a;

    public C108068c(C108070e eVar) {
        this.f300634a = eVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.f300634a.f300636a == activity) {
            Application application = activity.getApplication();
            application.unregisterActivityLifecycleCallbacks(this.f300634a.f300637b);
            application.unregisterComponentCallbacks(this.f300634a.f300638c);
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
