package com.google.apps.tiktok.tracing.contrib.p3714j;

import android.net.Uri;
import com.google.android.libraries.web.weblayer.p3468g.p3469a.C44280h;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;
import org.chromium.weblayer.C72575ak;
import org.chromium.weblayer.C72576al;
import org.chromium.weblayer.C72582ar;

/* renamed from: com.google.apps.tiktok.tracing.contrib.j.n */
/* compiled from: PG */
public final class C47737n extends C72576al {

    /* renamed from: a */
    final /* synthetic */ C72576al f123705a;

    /* renamed from: b */
    final /* synthetic */ C47738o f123706b;

    public C47737n(C47738o oVar, C72576al alVar) {
        this.f123706b = oVar;
        this.f123705a = alVar;
    }

    /* renamed from: c */
    public final void mo47178c() {
        if (C47831fm.m85027v()) {
            ((C44280h) this.f123705a).f115145b.mo46445g();
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onFirstContentfulPaint");
        try {
            ((C44280h) this.f123705a).f115145b.mo46445g();
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo47179d(double d) {
        if (C47831fm.m85027v()) {
            this.f123705a.mo47179d(d);
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onLoadProgressChanged");
        try {
            this.f123705a.mo47179d(d);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final void mo47180e(boolean z, boolean z2) {
        if (C47831fm.m85027v()) {
            this.f123705a.mo47180e(z, z2);
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onLoadStateChanged");
        try {
            this.f123705a.mo47180e(z, z2);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo47181f(C72575ak akVar) {
        if (C47831fm.m85027v()) {
            this.f123705a.mo47181f(akVar);
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onNavigationCompleted");
        try {
            this.f123705a.mo47181f(akVar);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }

    /* renamed from: g */
    public final void mo47182g(C72575ak akVar) {
        if (C47831fm.m85027v()) {
            this.f123705a.mo47182g(akVar);
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onNavigationFailed");
        try {
            this.f123705a.mo47182g(akVar);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final void mo47183h(C72575ak akVar) {
        if (C47831fm.m85027v()) {
            this.f123705a.mo47183h(akVar);
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onNavigationRedirected");
        try {
            this.f123705a.mo47183h(akVar);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }

    /* renamed from: i */
    public final void mo47184i(C72575ak akVar) {
        if (C47831fm.m85027v()) {
            this.f123705a.mo47184i(akVar);
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onNavigationStarted");
        try {
            this.f123705a.mo47184i(akVar);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final void mo47185j(Uri uri) {
        if (C47831fm.m85027v()) {
            this.f123705a.mo47185j(uri);
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onOldPageNoLongerRendered");
        try {
            this.f123705a.mo47185j(uri);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final void mo47186k(C72582ar arVar) {
        if (C47831fm.m85027v()) {
            this.f123705a.mo47186k(arVar);
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onPageDestroyed");
        try {
            this.f123705a.mo47186k(arVar);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }

    /* renamed from: l */
    public final void mo47187l(C72582ar arVar, String str) {
        if (C47831fm.m85027v()) {
            this.f123705a.mo47187l(arVar, str);
            return;
        }
        C47538ax c = this.f123706b.f123707a.mo51613c("onPageLanguageDetermined");
        try {
            this.f123705a.mo47187l(arVar, str);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47736m.m84882a(th, th);
        }
        throw th;
    }
}
