package com.google.apps.tiktok.media;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Debug;
import com.bumptech.glide.C5543d;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.media.g */
/* compiled from: PG */
public final class C47451g implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    public final Map f123225a = new HashMap();

    /* renamed from: b */
    private final Context f123226b;

    /* renamed from: c */
    private final Deque f123227c = new ArrayDeque();

    /* renamed from: d */
    private final Set f123228d = new HashSet();

    public C47451g(Context context) {
        this.f123226b = context;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        context.registerComponentCallbacks(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51287a(int i) {
        this.f123227c.size();
        int size = this.f123227c.size() - i;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f123228d.contains((Activity) this.f123227c.peekFirst())) {
                break;
            }
            Set<C47449e> set = (Set) this.f123225a.get((Activity) this.f123227c.removeFirst());
            if (set != null) {
                for (C47449e eVar : set) {
                    eVar.f123218a.mo11884s();
                }
            }
        }
        if (size > 0) {
            double d = (double) Runtime.getRuntime().totalMemory();
            Double.isNaN(d);
            if (((double) Debug.getNativeHeapAllocatedSize()) > d * 0.8d) {
                C5543d.m14321a(this.f123226b).mo11932f(15);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f123227c.remove(activity);
        this.f123225a.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.f123227c.remove(activity);
        this.f123227c.add(activity);
        this.f123228d.add(activity);
    }

    public final void onActivityStopped(Activity activity) {
        this.f123228d.remove(activity);
        if (!activity.isChangingConfigurations() && !activity.isFinishing()) {
            long maxMemory = Runtime.getRuntime().maxMemory();
            double nativeHeapAllocatedSize = (double) Debug.getNativeHeapAllocatedSize();
            double d = (double) maxMemory;
            Double.isNaN(nativeHeapAllocatedSize);
            Double.isNaN(d);
            double d2 = nativeHeapAllocatedSize / d;
            if (d2 >= 0.8d) {
                mo51287a(1);
            } else if (d2 >= 0.7d) {
                mo51287a(2);
            } else if (d2 >= 0.6d) {
                mo51287a(3);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i < 20) {
            mo51287a(i >= 15 ? 1 : i >= 10 ? 2 : 3);
        }
    }
}
