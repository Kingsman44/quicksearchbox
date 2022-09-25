package com.google.ads.interactivemedia.p367v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aom */
/* compiled from: PG */
public final class aom implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f21117a;

    /* renamed from: b */
    private final List f21118b = new ArrayList();

    public aom(Application application) {
        this.f21117a = application;
        application.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public final void mo15121a(aol aol) {
        this.f21118b.add(aol);
    }

    /* renamed from: b */
    public final void mo15122b() {
        this.f21117a.unregisterActivityLifecycleCallbacks(this);
        this.f21118b.clear();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        for (aol j : this.f21118b) {
            j.mo14965j();
        }
    }

    public final void onActivityResumed(Activity activity) {
        for (aol k : this.f21118b) {
            k.mo14966k();
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
