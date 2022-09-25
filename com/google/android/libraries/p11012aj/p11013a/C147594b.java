package com.google.android.libraries.p11012aj.p11013a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58847bk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.aj.a.b */
/* compiled from: PG */
final class C147594b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    boolean f398397a = false;

    /* renamed from: b */
    final /* synthetic */ Application f398398b;

    /* renamed from: c */
    final /* synthetic */ C69464a f398399c;

    /* renamed from: d */
    final /* synthetic */ C58833ax f398400d;

    public C147594b(Application application, C69464a aVar, C58833ax axVar) {
        this.f398398b = application;
        this.f398399c = aVar;
        this.f398400d = axVar;
    }

    /* renamed from: a */
    private final List m240667a() {
        if (this.f398397a) {
            return Collections.emptyList();
        }
        this.f398397a = true;
        this.f398398b.unregisterActivityLifecycleCallbacks(this);
        Set<Application.ActivityLifecycleCallbacks> set = (Set) this.f398399c.mo17428b();
        ArrayList arrayList = new ArrayList(set.size());
        for (Application.ActivityLifecycleCallbacks apply : set) {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((C58817ah) ((C58847bk) this.f398400d).f156646a).apply(apply);
            this.f398398b.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
            arrayList.add(activityLifecycleCallbacks);
        }
        return arrayList;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        for (Application.ActivityLifecycleCallbacks onActivityCreated : m240667a()) {
            onActivityCreated.onActivityCreated(activity, bundle);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        C58838bb.m90883r(this.f398397a);
    }

    public final void onActivityPaused(Activity activity) {
        C58838bb.m90883r(this.f398397a);
    }

    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        for (Application.ActivityLifecycleCallbacks onActivityPreCreated : m240667a()) {
            onActivityPreCreated.onActivityPreCreated(activity, bundle);
        }
    }

    public final void onActivityResumed(Activity activity) {
        C58838bb.m90883r(this.f398397a);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C58838bb.m90883r(this.f398397a);
    }

    public final void onActivityStarted(Activity activity) {
        C58838bb.m90883r(this.f398397a);
    }

    public final void onActivityStopped(Activity activity) {
        C58838bb.m90883r(this.f398397a);
    }
}
