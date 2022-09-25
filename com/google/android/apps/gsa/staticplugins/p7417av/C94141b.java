package com.google.android.apps.gsa.staticplugins.p7417av;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.apps.gsa.staticplugins.av.b */
/* compiled from: PG */
final class C94141b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application.ActivityLifecycleCallbacks f263007a;

    public C94141b(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f263007a = activityLifecycleCallbacks;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f263007a.onActivityCreated(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f263007a.onActivityDestroyed(activity);
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
