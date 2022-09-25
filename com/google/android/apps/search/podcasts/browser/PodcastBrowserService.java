package com.google.android.apps.search.podcasts.browser;

import android.app.Service;
import androidx.media.C2434k;
import androidx.media.C2449z;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import dagger.p5294a.C68225k;

/* compiled from: PG */
public final class PodcastBrowserService extends C140163a implements C47231d {

    /* renamed from: f */
    private C140190d f380828f;

    /* renamed from: g */
    private boolean f380829g;

    /* renamed from: h */
    private final C47550bb f380830h = new C47550bb(this);

    /* renamed from: i */
    private boolean f380831i;

    @Deprecated
    public PodcastBrowserService() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final void mo5831b(String str, C2449z zVar) {
        C47573bx c = this.f380830h.mo51411c("onLoadChildren");
        try {
            mo17754z().f380883a.mo115490c(str, zVar);
            c.close();
            return;
        } catch (Throwable th) {
            C140188b.m227852a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final C2434k mo5835h(String str, int i) {
        C47573bx c = this.f380830h.mo51411c("onGetRoot");
        try {
            C140190d j = mo17754z();
            C2434k d = j.f380883a.mo115491d(j.f380884b, str, i);
            c.close();
            return d;
        } catch (Throwable th) {
            C140188b.m227852a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final C140190d mo17754z() {
        C140190d dVar = this.f380828f;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f380831i) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f380830h.mo51410b();
        try {
            this.f380829g = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f380828f == null) {
                if (!this.f380829g) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f380831i) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo115482i().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo115482i().mo17653jN();
                    Service service = ((amb) jN).f197754a;
                    if (service instanceof PodcastBrowserService) {
                        PodcastBrowserService podcastBrowserService = (PodcastBrowserService) service;
                        C68225k.m98532d(podcastBrowserService);
                        this.f380828f = new C140190d(podcastBrowserService, (C140189c) ((amb) jN).f197807b.d.f201723eW.mo17428b());
                        a2.close();
                    } else {
                        String obj = C140190d.class.toString();
                        String valueOf = String.valueOf(service.getClass());
                        throw new IllegalStateException("Attempt to inject a Service wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            C140190d j = mo17754z();
            j.f380883a.mo115488a(j.f380884b);
            this.f380829g = false;
            b.close();
            return;
            throw th;
            throw th;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                C140188b.m227852a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f380830h.mo51412d();
        try {
            super.onDestroy();
            mo17754z().f380883a.mo115489b();
            this.f380831i = true;
            d.close();
            return;
        } catch (Throwable th) {
            C140188b.m227852a(th, th);
        }
        throw th;
    }
}
