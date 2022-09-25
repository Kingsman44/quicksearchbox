package com.google.android.libraries.componentview.services.application;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.libraries.componentview.services.application.u */
/* compiled from: PG */
final class C20630u implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ Activity f57864a;

    /* renamed from: b */
    final /* synthetic */ C20631v f57865b;

    public C20630u(C20631v vVar, Activity activity) {
        this.f57865b = vVar;
        this.f57864a = activity;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f57864a) {
            C20631v vVar = this.f57865b;
            if (vVar.mo25514c()) {
                vVar.mo25513b();
            }
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
