package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.an */
/* compiled from: PG */
final class C2339an implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        C2340ao.m6325a(activity, C2382m.ON_CREATE);
    }

    public final void onActivityPostResumed(Activity activity) {
        C2340ao.m6325a(activity, C2382m.ON_RESUME);
    }

    public final void onActivityPostStarted(Activity activity) {
        C2340ao.m6325a(activity, C2382m.ON_START);
    }

    public final void onActivityPreDestroyed(Activity activity) {
        C2340ao.m6325a(activity, C2382m.ON_DESTROY);
    }

    public final void onActivityPrePaused(Activity activity) {
        C2340ao.m6325a(activity, C2382m.ON_PAUSE);
    }

    public final void onActivityPreStopped(Activity activity) {
        C2340ao.m6325a(activity, C2382m.ON_STOP);
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
