package com.google.android.gms.measurement.api.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.api.internal.al */
/* compiled from: PG */
final class C145191al implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C145192am f392450a;

    public C145191al(C145192am amVar) {
        this.f392450a = amVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f392450a.mo120702b(new C145184ae(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f392450a.mo120702b(new C145190ak(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f392450a.mo120702b(new C145187ah(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f392450a.mo120702b(new C145186ag(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C145179a aVar = new C145179a();
        this.f392450a.mo120702b(new C145189aj(this, activity, aVar));
        Bundle a = aVar.mo120687a(50);
        if (a != null) {
            bundle.putAll(a);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f392450a.mo120702b(new C145185af(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f392450a.mo120702b(new C145188ai(this, activity));
    }
}
