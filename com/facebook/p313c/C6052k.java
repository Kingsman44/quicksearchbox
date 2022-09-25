package com.facebook.p313c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.c.k */
/* compiled from: PG */
final class C6052k implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C6053l.f17808a.containsKey(activity)) {
            throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        C6053l.f17808a.remove(activity);
        Iterator it = C6053l.f17808a.entrySet().iterator();
        while (it.hasNext()) {
            Context context = (Context) ((Map.Entry) it.next()).getKey();
            Context context2 = activity;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            while (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context == context2) {
                it.remove();
            }
        }
        C6053l.f17809b.put(C6053l.m15592a(activity), true);
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
    }
}
