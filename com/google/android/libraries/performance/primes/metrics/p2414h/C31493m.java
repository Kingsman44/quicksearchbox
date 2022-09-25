package com.google.android.libraries.performance.primes.metrics.p2414h;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.m */
/* compiled from: PG */
public final class C31493m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final Application f84797a;

    /* renamed from: b */
    final /* synthetic */ C31499r f84798b;

    /* renamed from: com.google.android.libraries.performance.primes.metrics.h.m$a */
    /* compiled from: PG */
    final class C31494a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: b */
        private final AtomicReference f84800b;

        public /* synthetic */ C31494a(View view, C31492l lVar) {
            this.f84800b = new AtomicReference(view);
        }

        /* renamed from: b */
        static /* synthetic */ void m58709b(C31493m mVar) {
            C19559g.m37304c();
            if (mVar.f84798b.f84821f == 0) {
                mVar.f84798b.f84821f = SystemClock.elapsedRealtime();
                mVar.f84798b.f84827l.f84812h = true;
            }
        }

        /* renamed from: c */
        static /* synthetic */ void m58710c(C31493m mVar) {
            C19559g.m37304c();
            if (mVar.f84798b.f84822g == 0) {
                mVar.f84798b.f84822g = SystemClock.elapsedRealtime();
                mVar.f84798b.f84827l.f84811g = true;
                C31499r.m58712c("Primes-ttfdd-end-and-length-ms", mVar.f84798b.f84822g);
                mVar.f84797a.unregisterActivityLifecycleCallbacks(mVar);
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo37192a(View view) {
            view.getViewTreeObserver().removeOnDrawListener(this);
        }

        public void onDraw() {
            View view = (View) this.f84800b.getAndSet((Object) null);
            if (view != null) {
                try {
                    view.getViewTreeObserver().addOnGlobalLayoutListener(new C31489i(this, view));
                    C19559g.m37302a().postAtFrontOfQueue(new C31490j(C31493m.this));
                    C19559g.m37302a().post(new C31491k(C31493m.this));
                } catch (RuntimeException e) {
                    Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onDraw", e);
                }
            }
        }
    }

    public C31493m(C31499r rVar, Application application) {
        this.f84798b = rVar;
        this.f84797a = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C31488h hVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f84798b.f84828m.f84790b == null) {
            hVar = this.f84798b.f84828m;
        } else {
            hVar = this.f84798b.f84829n;
        }
        hVar.f84789a = activity.getClass().getSimpleName();
        hVar.f84790b = Long.valueOf(elapsedRealtime);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        C31488h hVar = this.f84798b.f84829n.f84790b == null ? this.f84798b.f84828m : this.f84798b.f84829n;
        if (hVar.f84792d == null) {
            hVar.f84792d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        try {
            View findViewById = activity.findViewById(16908290);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new C31494a(findViewById, (C31492l) null));
            viewTreeObserver.addOnPreDrawListener(new C31497p(this, findViewById));
        } catch (RuntimeException e) {
            Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onActivityResume", e);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        C31488h hVar = this.f84798b.f84829n.f84790b == null ? this.f84798b.f84828m : this.f84798b.f84829n;
        if (hVar.f84791c == null) {
            hVar.f84791c = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public final void onActivityStopped(Activity activity) {
    }
}
