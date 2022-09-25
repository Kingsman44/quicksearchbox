package com.google.android.libraries.p1623at.p1633f;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.at.f.c */
/* compiled from: PG */
public final class C19563c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f54457a;

    /* renamed from: b */
    private final Set f54458b = new HashSet();

    /* renamed from: c */
    private int f54459c;

    /* renamed from: d */
    private volatile boolean f54460d;

    /* renamed from: e */
    private boolean f54461e;

    /* renamed from: f */
    private final C69464a f54462f;

    /* renamed from: g */
    private final C69464a f54463g;

    /* renamed from: h */
    private final HashMap f54464h = new HashMap();

    /* renamed from: i */
    private final HashMap f54465i = new HashMap();

    /* renamed from: j */
    private final List f54466j = new ArrayList();

    /* renamed from: k */
    private boolean f54467k;

    /* renamed from: l */
    private boolean f54468l;

    public C19563c(Application application, C69464a aVar, C69464a aVar2) {
        this.f54457a = application;
        this.f54462f = aVar2;
        this.f54463g = aVar;
    }

    /* renamed from: b */
    private final void m37312b(String str) {
        if (Log.isLoggable("AppVisibilityMonitor", 3)) {
            this.f54466j.add(str);
        }
    }

    /* renamed from: c */
    private final void m37313c(String str) {
        if (Log.isLoggable("AppVisibilityMonitor", 3)) {
            this.f54466j.clear();
            m37312b(str);
        }
    }

    /* renamed from: d */
    private final void m37314d() {
        if (Log.isLoggable("AppVisibilityMonitor", 3)) {
            StringBuilder sb = new StringBuilder((String) this.f54466j.get(0));
            for (int i = 1; i < this.f54466j.size(); i++) {
                sb.append(" -> ");
                sb.append((String) this.f54466j.get(i));
            }
            Log.d("AppVisibilityMonitor", sb.toString());
        }
    }

    /* renamed from: e */
    private final void m37315e() {
        int i = this.f54459c;
        boolean z = i > 0;
        if (z != this.f54460d) {
            m37312b(i > 0 ? "foreground" : "background");
            this.f54460d = z;
            if (z) {
                synchronized (this.f54465i) {
                    synchronized (this.f54465i) {
                        if (!this.f54467k) {
                            for (C19562b bVar : (Iterable) this.f54463g.mo17428b()) {
                                this.f54465i.put(bVar.mo24807i(), bVar);
                            }
                            this.f54467k = true;
                        }
                    }
                    Iterator it = this.f54465i.values().iterator();
                    while (it.hasNext()) {
                        if (!((C19562b) it.next()).mo24808k()) {
                            it.remove();
                        }
                    }
                }
                return;
            }
            synchronized (this.f54464h) {
                synchronized (this.f54464h) {
                    if (!this.f54468l) {
                        for (C19560a aVar : (Iterable) this.f54462f.mo17428b()) {
                            this.f54464h.put(aVar.mo24805i(), aVar);
                        }
                        this.f54468l = true;
                    }
                }
                Iterator it2 = this.f54464h.values().iterator();
                while (it2.hasNext()) {
                    if (!((C19560a) it2.next()).mo24806j()) {
                        it2.remove();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24809a(Activity activity) {
        m37313c("invisible");
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.f54461e = isChangingConfigurations;
        if (!isChangingConfigurations) {
            this.f54459c--;
            m37312b(String.format(Locale.US, "count=%d", new Object[]{Integer.valueOf(this.f54459c)}));
            m37315e();
        } else {
            m37312b("changing configurations");
        }
        m37314d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f54458b.remove(Integer.valueOf(activity.hashCode()));
    }

    public final void onActivityPaused(Activity activity) {
        KeyguardManager keyguardManager;
        Integer valueOf = Integer.valueOf(activity.hashCode());
        if (!this.f54458b.contains(valueOf)) {
            return;
        }
        if (!((PowerManager) this.f54457a.getSystemService("power")).isInteractive() || (keyguardManager = (KeyguardManager) this.f54457a.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
            mo24809a(activity);
            this.f54458b.remove(valueOf);
        }
    }

    public final void onActivityResumed(Activity activity) {
        Integer valueOf = Integer.valueOf(activity.hashCode());
        if (!this.f54458b.contains(valueOf)) {
            m37313c("visible");
            if (!this.f54461e) {
                this.f54459c++;
                m37312b(String.format(Locale.US, "count=%d", new Object[]{Integer.valueOf(this.f54459c)}));
                m37315e();
            } else {
                m37312b("changing configurations");
            }
            this.f54461e = activity.isChangingConfigurations();
            m37314d();
            this.f54458b.add(valueOf);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        Integer valueOf = Integer.valueOf(activity.hashCode());
        if (this.f54458b.contains(valueOf)) {
            mo24809a(activity);
            this.f54458b.remove(valueOf);
        }
    }
}
