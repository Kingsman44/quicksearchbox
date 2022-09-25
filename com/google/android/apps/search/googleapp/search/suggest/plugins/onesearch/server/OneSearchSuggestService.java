package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.server;

import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.C2382m;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import p5488io.grpc.binder.C70235o;

/* compiled from: PG */
public final class OneSearchSuggestService extends C138319a implements C47231d {

    /* renamed from: b */
    private C138334p f376337b;

    /* renamed from: c */
    private boolean f376338c;

    /* renamed from: d */
    private final C47550bb f376339d = new C47550bb(this);

    /* renamed from: e */
    private boolean f376340e;

    @Deprecated
    public OneSearchSuggestService() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final C138334p mo17754z() {
        C138334p pVar = this.f376337b;
        if (pVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f376340e) {
            return pVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f376339d.mo51409a(intent);
        try {
            this.f6618a.mo5765a(C2382m.ON_START);
            IBinder a2 = mo17754z().f376364a.mo58121a();
            a.close();
            return a2;
        } catch (Throwable th) {
            C138333o.m224710a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f376339d.mo51410b();
        try {
            this.f376338c = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f376337b == null) {
                if (!this.f376338c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f376340e) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo114242a().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo114242a().mo17653jN();
                    this.f376337b = new C138334p(((amb) jN).mo65957u(), (C70235o) ((amb) jN).f197807b.fe.mo17428b());
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f376338c = false;
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
                C138333o.m224710a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f376339d.mo51412d();
        try {
            super.onDestroy();
            this.f376340e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C138333o.m224710a(th, th);
        }
        throw th;
    }
}
