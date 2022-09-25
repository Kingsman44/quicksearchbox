package com.google.apps.tiktok.tracing;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.apps.tiktok.tracing.dd */
/* compiled from: PG */
final class C47766dd implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ Application.ActivityLifecycleCallbacks f123753a;

    /* renamed from: b */
    final /* synthetic */ C47770dh f123754b;

    public C47766dd(C47770dh dhVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f123754b = dhVar;
        this.f123753a = activityLifecycleCallbacks;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityCreated(activity, bundle);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"));
        try {
            this.f123753a.onActivityCreated(activity, bundle);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public final void onActivityDestroyed(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityDestroyed(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"));
        try {
            this.f123753a.onActivityDestroyed(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public final void onActivityPaused(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPaused(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"));
        try {
            this.f123753a.onActivityPaused(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPostCreated(activity, bundle);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostCreated"));
        try {
            this.f123753a.onActivityPostCreated(activity, bundle);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPostDestroyed(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPostDestroyed(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostDestroyed"));
        try {
            this.f123753a.onActivityPostDestroyed(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPostPaused(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPostPaused(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostPaused"));
        try {
            this.f123753a.onActivityPostPaused(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPostResumed(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPostResumed(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostResumed"));
        try {
            this.f123753a.onActivityPostResumed(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPostSaveInstanceState(activity, bundle);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostSaveInstanceState"));
        try {
            this.f123753a.onActivityPostSaveInstanceState(activity, bundle);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPostStarted(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPostStarted(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStarted"));
        try {
            this.f123753a.onActivityPostStarted(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPostStopped(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPostStopped(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPostStopped"));
        try {
            this.f123753a.onActivityPostStopped(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPreCreated(activity, bundle);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreCreated"));
        try {
            this.f123753a.onActivityPreCreated(activity, bundle);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPreDestroyed(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPreDestroyed(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreDestroyed"));
        try {
            this.f123753a.onActivityPreDestroyed(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPrePaused(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPrePaused(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPrePaused"));
        try {
            this.f123753a.onActivityPrePaused(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPreResumed(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPreResumed(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreResumed"));
        try {
            this.f123753a.onActivityPreResumed(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPreSaveInstanceState(activity, bundle);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreSaveInstanceState"));
        try {
            this.f123753a.onActivityPreSaveInstanceState(activity, bundle);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPreStarted(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPreStarted(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStarted"));
        try {
            this.f123753a.onActivityPreStarted(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public void onActivityPreStopped(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityPreStopped(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityPreStopped"));
        try {
            this.f123753a.onActivityPreStopped(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public final void onActivityResumed(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityResumed(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"));
        try {
            this.f123753a.onActivityResumed(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"));
        try {
            this.f123753a.onActivitySaveInstanceState(activity, bundle);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public final void onActivityStarted(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityStarted(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"));
        try {
            this.f123753a.onActivityStarted(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }

    public final void onActivityStopped(Activity activity) {
        if (C47831fm.m85027v()) {
            this.f123753a.onActivityStopped(activity);
            return;
        }
        C47538ax c = this.f123754b.mo51613c(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"));
        try {
            this.f123753a.onActivityStopped(activity);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47765dc.m84916a(th, th);
        }
        throw th;
    }
}
