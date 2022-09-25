package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opa.OpaActivity;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.m */
/* compiled from: PG */
final class C110033m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final WeakReference f306577a;

    public C110033m(OpaAmbActivity opaAmbActivity) {
        this.f306577a = new WeakReference(opaAmbActivity);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        OpaAmbActivity opaAmbActivity = (OpaAmbActivity) this.f306577a.get();
        if (opaAmbActivity != null && opaAmbActivity.isFinishing() && (activity instanceof OpaActivity)) {
            C58976aa aaVar = C58975e.f156826a;
            activity.finish();
            activity.overridePendingTransition(0, 17432577);
        }
    }

    public final void onActivityStopped(Activity activity) {
    }
}
