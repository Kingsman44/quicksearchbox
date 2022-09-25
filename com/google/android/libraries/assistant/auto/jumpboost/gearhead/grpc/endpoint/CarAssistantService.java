package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.endpoint;

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
public final class CarAssistantService extends C11748s implements C47231d {

    /* renamed from: b */
    private C11743n f37779b;

    /* renamed from: c */
    private boolean f37780c;

    /* renamed from: d */
    private final C47550bb f37781d = new C47550bb(this);

    /* renamed from: e */
    private boolean f37782e;

    @Deprecated
    public CarAssistantService() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C11743n mo17754z() {
        C11743n nVar = this.f37779b;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f37782e) {
            return nVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f37781d.mo51409a(intent);
        try {
            this.f6618a.mo5765a(C2382m.ON_START);
            IBinder a2 = mo17754z().f37811a.mo58121a();
            a.close();
            return a2;
        } catch (Throwable th) {
            C11730a.m27387a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f37781d.mo51410b();
        try {
            this.f37780c = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f37779b == null) {
                if (!this.f37780c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f37782e) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo20127b().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo20127b().mo17653jN();
                    this.f37779b = new C11743n((Context) ((amb) jN).f197807b.g.mo17428b(), ((amb) jN).mo65957u());
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f37780c = false;
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
                C11730a.m27387a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f37781d.mo51412d();
        try {
            super.onDestroy();
            this.f37782e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C11730a.m27387a(th, th);
        }
        throw th;
    }
}
