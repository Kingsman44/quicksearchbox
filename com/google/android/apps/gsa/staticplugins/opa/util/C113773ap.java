package com.google.android.apps.gsa.staticplugins.opa.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ap */
/* compiled from: PG */
final class C113773ap implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C113775ar f315083a;

    public C113773ap(C113775ar arVar) {
        this.f315083a = arVar;
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
    }

    public final void onActivityStopped(Activity activity) {
        if (this.f315083a.f315101e.mo79746e(C90051dc.f248848bC) && (activity instanceof DrivingScreenActivity)) {
            C113775ar arVar = this.f315083a;
            arVar.f315102f.mo28213m("Post OOBE notification on Driving Screen stop", arVar.f315101e.mo79743a(C90051dc.f248849bD), new C113772ao(this));
        }
    }
}
