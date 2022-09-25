package com.google.android.apps.gsa.staticplugins.videoplayer.p8783ui;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.p033v7.app.C0395p;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.ui.ap */
/* compiled from: PG */
final class C117573ap implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C117578au f326355a;

    public C117573ap(C117578au auVar) {
        this.f326355a = auVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        C91881e eVar = this.f326355a.f326367e;
        if (eVar != null) {
            eVar.mo86419g(6);
        }
    }

    public final void onActivityResumed(Activity activity) {
        C117578au auVar = this.f326355a;
        C0395p pVar = auVar.f326365c;
        if (activity == pVar) {
            auVar.mo103388k(pVar.getResources().getConfiguration());
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
