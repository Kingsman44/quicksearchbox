package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.util.C144006f;

/* renamed from: com.google.android.gms.measurement.internal.hf */
/* compiled from: PG */
final class C145415hf implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C145416hg f393140a;

    public C145415hf(C145416hg hgVar) {
        this.f393140a = hgVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C145361ff ffVar;
        try {
            this.f393140a.f393011w.mo120965ar().f392803k.mo120894a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                ffVar = this.f393140a.f393011w;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f393140a.f393011w.mo120977o();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f393140a.f393011w.mo120966as().mo120960h(new C145414he(this, z, data, str, queryParameter));
                        ffVar = this.f393140a.f393011w;
                    }
                }
                ffVar = this.f393140a.f393011w;
            }
        } catch (RuntimeException e) {
            this.f393140a.f393011w.mo120965ar().f392795c.mo120895b("Throwable caught in onActivityCreated", e);
            ffVar = this.f393140a.f393011w;
        } catch (Throwable th) {
            this.f393140a.f393011w.mo120974l().mo121125l(activity, bundle);
            throw th;
        }
        ffVar.mo120974l().mo121125l(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        C145430hu l = this.f393140a.f393011w.mo120974l();
        synchronized (l.f393194k) {
            if (activity == l.f393189f) {
                l.f393189f = null;
            }
        }
        if (l.f393011w.f392937g.mo120778o()) {
            l.f393188e.remove(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        C145430hu l = this.f393140a.f393011w.mo120974l();
        synchronized (l.f393194k) {
            l.f393193j = false;
            l.f393190g = true;
        }
        C144006f fVar = l.f393011w.f392924A;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!l.f393011w.f392937g.mo120778o()) {
            l.f393185b = null;
            l.f393011w.mo120966as().mo120960h(new C145427hr(l, elapsedRealtime));
        } else {
            C145423hn e = l.mo121121e(activity);
            l.f393186c = l.f393185b;
            l.f393185b = null;
            l.f393011w.mo120966as().mo120960h(new C145428hs(l, e, elapsedRealtime));
        }
        C145473jj n = this.f393140a.f393011w.mo120976n();
        C144006f fVar2 = n.f393011w.f392924A;
        n.f393011w.mo120966as().mo120960h(new C145466jc(n, SystemClock.elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        C145473jj n = this.f393140a.f393011w.mo120976n();
        C144006f fVar = n.f393011w.f392924A;
        n.f393011w.mo120966as().mo120960h(new C145465jb(n, SystemClock.elapsedRealtime()));
        C145430hu l = this.f393140a.f393011w.mo120974l();
        synchronized (l.f393194k) {
            l.f393193j = true;
            if (activity != l.f393189f) {
                synchronized (l.f393194k) {
                    l.f393189f = activity;
                    l.f393190g = false;
                }
                if (l.f393011w.f392937g.mo120778o()) {
                    l.f393191h = null;
                    l.f393011w.mo120966as().mo120960h(new C145429ht(l));
                }
            }
        }
        if (!l.f393011w.f392937g.mo120778o()) {
            l.f393185b = l.f393191h;
            l.f393011w.mo120966as().mo120960h(new C145426hq(l));
            return;
        }
        l.mo121123j(activity, l.mo121121e(activity), false);
        C145301d b = l.f393011w.mo120967b();
        C144006f fVar2 = b.f393011w.f392924A;
        b.f393011w.mo120966as().mo120960h(new C145274c(b, SystemClock.elapsedRealtime()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C145423hn hnVar;
        C145430hu l = this.f393140a.f393011w.mo120974l();
        if (l.f393011w.f392937g.mo120778o() && bundle != null && (hnVar = (C145423hn) l.f393188e.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", hnVar.f393164c);
            bundle2.putString("name", hnVar.f393162a);
            bundle2.putString("referrer_name", hnVar.f393163b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
