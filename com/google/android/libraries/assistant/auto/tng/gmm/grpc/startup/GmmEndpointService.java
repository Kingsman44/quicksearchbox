package com.google.android.libraries.assistant.auto.tng.gmm.grpc.startup;

import android.content.Context;
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

/* compiled from: PG */
public final class GmmEndpointService extends C13633h implements C47231d {

    /* renamed from: b */
    private C13632g f41657b;

    /* renamed from: c */
    private boolean f41658c;

    /* renamed from: d */
    private final C47550bb f41659d = new C47550bb(this);

    /* renamed from: e */
    private boolean f41660e;

    @Deprecated
    public GmmEndpointService() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C13632g mo17754z() {
        C13632g gVar = this.f41657b;
        if (gVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f41660e) {
            return gVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f41659d.mo51409a(intent);
        try {
            this.f6618a.mo5765a(C2382m.ON_START);
            IBinder a2 = mo17754z().f41670a.mo58121a();
            a.close();
            return a2;
        } catch (Throwable th) {
            C13631f.m29904a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f41659d.mo51410b();
        try {
            this.f41658c = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f41657b == null) {
                if (!this.f41658c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f41660e) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo21195b().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo21195b().mo17653jN();
                    this.f41657b = new C13632g((Context) ((amb) jN).f197807b.g.mo17428b(), ((amb) jN).mo65957u());
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f41658c = false;
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
                C13631f.m29904a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f41659d.mo51412d();
        try {
            super.onDestroy();
            this.f41660e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C13631f.m29904a(th, th);
        }
        throw th;
    }
}
