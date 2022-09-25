package com.google.android.libraries.search.logging.appflows.startup.p3037a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.search.logging.appflows.startup.a.h */
/* compiled from: PG */
final class C38805h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C38806i f102399a;

    public C38805h(C38806i iVar) {
        this.f102399a = iVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f102399a.f102403a.f102413f = C58833ax.m90834k(activity);
        this.f102399a.f102403a.f102416i = true;
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f102399a.mo41644j(activity);
        C58833ax axVar = this.f102399a.f102403a.f102412e;
        if (axVar.mo56113h() && ((Activity) axVar.mo56107c()).equals(activity)) {
            this.f102399a.f102403a.mo41647c(C58836b.f156633a);
        }
        C58833ax axVar2 = this.f102399a.f102403a.f102413f;
        if (axVar2.mo56113h() && ((Activity) axVar2.mo56107c()).equals(activity)) {
            this.f102399a.f102403a.f102413f = C58836b.f156633a;
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
        this.f102399a.mo41644j(activity);
    }
}
