package com.google.apps.tiktok.experiments.phenotype;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47810es;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.dp */
/* compiled from: PG */
public final class C47003dp implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C47013dz f122545a;

    public C47003dp(C47013dz dzVar) {
        this.f122545a = dzVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C69664n.m101061g(activity, "activity");
        this.f122545a.f122557a.add(activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        C69664n.m101061g(activity, "activity");
        this.f122545a.f122557a.remove(activity);
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
        this.f122545a.f122558b.add(activity);
    }

    public final void onActivityStopped(Activity activity) {
        C69664n.m101061g(activity, "activity");
        this.f122545a.f122558b.remove(activity);
        C47013dz dzVar = this.f122545a;
        C19559g.m37304c();
        if (!dzVar.f122561e && dzVar.f122558b.isEmpty() && dzVar.mo50977a()) {
            Looper.myQueue().addIdleHandler(C47810es.m84961a(new C47010dw(dzVar)));
        }
    }
}
