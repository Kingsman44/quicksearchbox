package com.google.android.apps.search.assistant.platform.appintegration.endpoint;

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
public final class AppIntegrationService extends C119539c implements C47231d {

    /* renamed from: b */
    private C119538b f333173b;

    /* renamed from: c */
    private boolean f333174c;

    /* renamed from: d */
    private final C47550bb f333175d = new C47550bb(this);

    /* renamed from: e */
    private boolean f333176e;

    @Deprecated
    public AppIntegrationService() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C119538b mo17754z() {
        C119538b bVar = this.f333173b;
        if (bVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f333176e) {
            return bVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f333175d.mo51409a(intent);
        try {
            this.f6618a.mo5765a(C2382m.ON_START);
            IBinder a2 = mo17754z().f333177a.mo58121a();
            a.close();
            return a2;
        } catch (Throwable th) {
            C119537a.m198403a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f333175d.mo51410b();
        try {
            this.f333174c = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f333173b == null) {
                if (!this.f333174c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f333176e) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo104424b().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo104424b().mo17653jN();
                    this.f333173b = new C119538b(((amb) jN).mo65957u(), (C70235o) ((amb) jN).f197807b.fe.mo17428b());
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f333174c = false;
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
                C119537a.m198403a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f333175d.mo51412d();
        try {
            super.onDestroy();
            this.f333176e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C119537a.m198403a(th, th);
        }
        throw th;
    }
}
