package com.google.android.libraries.performance.primes.p2398c;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.libraries.performance.primes.C31148ae;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.android.libraries.performance.primes.p2399d.C31230a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.performance.primes.c.d */
/* compiled from: PG */
public final class C31222d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: c */
    public static final /* synthetic */ int f84120c = 0;

    /* renamed from: a */
    public final List f84121a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final AtomicInteger f84122b = new AtomicInteger();

    /* renamed from: d */
    private final C31148ae f84123d;

    /* renamed from: e */
    private final AtomicInteger f84124e = new AtomicInteger();

    /* renamed from: f */
    private final AtomicInteger f84125f = new AtomicInteger();

    /* renamed from: g */
    private final AtomicInteger f84126g = new AtomicInteger();

    /* renamed from: h */
    private final AtomicInteger f84127h = new AtomicInteger();

    /* renamed from: i */
    private final AtomicInteger f84128i = new AtomicInteger();

    /* renamed from: j */
    private Boolean f84129j;

    /* renamed from: k */
    private volatile String f84130k;

    /* renamed from: l */
    private volatile Activity f84131l;

    /* renamed from: m */
    private boolean f84132m = false;

    public C31222d(C31148ae aeVar) {
        this.f84123d = aeVar;
    }

    /* renamed from: a */
    private final void m58215a(Activity activity) {
        m58217c(C31230a.m58231c(activity.getApplicationContext()), activity);
    }

    /* renamed from: b */
    private final void m58216b() {
        if (this.f84132m || this.f84124e.get() != 0) {
            return;
        }
        if (this.f84123d.mo36886a()) {
            this.f84132m = true;
            return;
        }
        throw new IllegalStateException("Primes did not observe lifecycle events in the expected order. Either you are initializing Primes incorrectly, or your tests are calling lifecycle methods incorrectly.");
    }

    /* renamed from: c */
    private final void m58217c(boolean z, Activity activity) {
        Boolean bool = this.f84129j;
        if (bool == null || bool.booleanValue() != z) {
            this.f84129j = Boolean.valueOf(z);
            if (z) {
                for (C31209a aVar : this.f84121a) {
                    if (aVar instanceof C31209a.C31218i) {
                        ((C31209a.C31218i) aVar).mo36945c(activity);
                    }
                }
                return;
            }
            for (C31209a aVar2 : this.f84121a) {
                if (aVar2 instanceof C31209a.C31217h) {
                    ((C31209a.C31217h) aVar2).mo36944d(activity);
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f84124e.incrementAndGet();
        this.f84131l = null;
        for (C31209a aVar : this.f84121a) {
            if (aVar instanceof C31209a.C31210a) {
                ((C31209a.C31210a) aVar).mo36938b(activity, bundle);
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.f84128i.getAndIncrement() == 0) {
            m58216b();
        }
        this.f84131l = null;
        for (C31209a aVar : this.f84121a) {
            if (aVar instanceof C31209a.C31211b) {
                ((C31209a.C31211b) aVar).mo36939a(activity);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.f84126g.getAndIncrement() == 0) {
            m58216b();
        }
        this.f84130k = null;
        for (C31209a aVar : this.f84121a) {
            if (aVar instanceof C31209a.C31212c) {
                ((C31209a.C31212c) aVar).mo36940b(activity);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.f84122b.getAndIncrement() == 0) {
            m58216b();
        }
        this.f84131l = null;
        this.f84130k = activity.getClass().getSimpleName();
        for (C31209a aVar : this.f84121a) {
            if (aVar instanceof C31209a.C31213d) {
                ((C31209a.C31213d) aVar).mo36926a(activity);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (C31209a aVar : this.f84121a) {
            if (aVar instanceof C31209a.C31214e) {
                ((C31209a.C31214e) aVar).mo36941a();
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f84125f.getAndIncrement() == 0) {
            m58216b();
        }
        this.f84131l = null;
        m58215a(activity);
        for (C31209a aVar : this.f84121a) {
            if (aVar instanceof C31209a.C31215f) {
                ((C31209a.C31215f) aVar).mo36942c(activity);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (this.f84127h.getAndIncrement() == 0) {
            m58216b();
        }
        this.f84131l = activity;
        for (C31209a aVar : this.f84121a) {
            if (aVar instanceof C31209a.C31216g) {
                ((C31209a.C31216g) aVar).mo36943a();
            }
        }
        m58215a(activity);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        for (C31209a aVar : this.f84121a) {
            if (aVar instanceof C31209a.C31219j) {
                ((C31209a.C31219j) aVar).mo36946a();
            }
        }
        if (i >= 20 && this.f84131l != null) {
            m58217c(false, this.f84131l);
        }
        this.f84131l = null;
    }
}
