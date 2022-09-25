package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.notifications.platform.p2337h.p2338a.C30144a;

/* renamed from: com.google.android.libraries.notifications.entrypoints.systemtray.f */
/* compiled from: PG */
public final class C29985f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final C29984e f81184a;

    public C29985f(C29984e eVar) {
        this.f81184a = eVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C30144a.m56002a(activity);
        Intent intent = activity.getIntent();
        if (intent != null && C29984e.m55597b(intent) && intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) == 1) {
            this.f81184a.mo35282a(activity, intent);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && C29984e.m55597b(intent) && intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) == 0) {
            this.f81184a.mo35282a(activity, intent);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
