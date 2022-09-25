package com.google.apps.tiktok.concurrent;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.apps.tiktok.concurrent.m */
/* compiled from: PG */
final class C46461m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C46462n f121585a;

    public C46461m(C46462n nVar) {
        this.f121585a = nVar;
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
        C46462n nVar = this.f121585a;
        int i = nVar.f121588c + 1;
        nVar.f121588c = i;
        if (i == 1) {
            nVar.mo50466a(true);
        }
    }

    public final void onActivityStopped(Activity activity) {
        C46462n nVar = this.f121585a;
        int i = nVar.f121588c - 1;
        nVar.f121588c = i;
        if (i == 0) {
            nVar.mo50466a(false);
        }
    }
}
