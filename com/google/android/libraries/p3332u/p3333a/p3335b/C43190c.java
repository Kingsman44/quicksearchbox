package com.google.android.libraries.p3332u.p3333a.p3335b;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.u.a.b.c */
/* compiled from: PG */
public final class C43190c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C43195h f112905a;

    public C43190c(C43195h hVar) {
        this.f112905a = hVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C69664n.m101061g(activity, "caughtActivity");
        activity.getClass().getSimpleName();
        this.f112905a.mo46259b(new C43188a(activity), new C43189b(activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        C69664n.m101061g(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        C69664n.m101061g(activity, "activity");
    }

    public final void onActivityResumed(Activity activity) {
        C69664n.m101061g(activity, "activity");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C69664n.m101061g(activity, "activity");
        C69664n.m101061g(bundle, "outState");
    }

    public final void onActivityStarted(Activity activity) {
        C69664n.m101061g(activity, "activity");
    }

    public final void onActivityStopped(Activity activity) {
        C69664n.m101061g(activity, "activity");
    }
}
