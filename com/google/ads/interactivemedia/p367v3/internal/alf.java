package com.google.ads.interactivemedia.p367v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alf */
/* compiled from: PG */
final class alf implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ ali f20875a;

    public alf(ali ali) {
        this.f20875a = ali;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.f20875a.f20881f == activity) {
            this.f20875a.f20881f = null;
            Application h = C7458yy.m22585h(this.f20875a.f20878c.getContext());
            if (h != null) {
                h.unregisterActivityLifecycleCallbacks(this.f20875a.f20880e);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f20875a.f20881f == null || this.f20875a.f20881f == activity) {
            this.f20875a.f20881f = activity;
            this.f20875a.f20876a.mo15008n(new amx(amv.activityMonitor, amw.appStateChanged, this.f20875a.f20877b, this.f20875a.mo14915f(BuildConfig.FLAVOR, BuildConfig.FLAVOR, "inactive")));
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.f20875a.f20881f == activity) {
            this.f20875a.f20876a.mo15008n(new amx(amv.activityMonitor, amw.appStateChanged, this.f20875a.f20877b, this.f20875a.mo14915f(BuildConfig.FLAVOR, BuildConfig.FLAVOR, "active")));
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
