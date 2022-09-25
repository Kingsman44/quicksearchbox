package com.google.android.apps.search.assistant.platform.pcp.ondeviceserver;

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
public final class PcpDataServerEndpointService extends C124143c implements C47231d {

    /* renamed from: b */
    private C124145e f342829b;

    /* renamed from: c */
    private boolean f342830c;

    /* renamed from: d */
    private final C47550bb f342831d = new C47550bb(this);

    /* renamed from: e */
    private boolean f342832e;

    @Deprecated
    public PcpDataServerEndpointService() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final C124145e mo17754z() {
        C124145e eVar = this.f342829b;
        if (eVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f342832e) {
            return eVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f342831d.mo51409a(intent);
        try {
            this.f6618a.mo5765a(C2382m.ON_START);
            IBinder a2 = mo17754z().f342840a.mo58121a();
            a.close();
            return a2;
        } catch (Throwable th) {
            C124144d.m203561a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f342831d.mo51410b();
        try {
            this.f342830c = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f342829b == null) {
                if (!this.f342830c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f342832e) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo106297a().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo106297a().mo17653jN();
                    this.f342829b = new C124145e(((amb) jN).mo65957u(), (C70235o) ((amb) jN).f197807b.fe.mo17428b());
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f342830c = false;
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
                C124144d.m203561a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f342831d.mo51412d();
        try {
            super.onDestroy();
            this.f342832e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C124144d.m203561a(th, th);
        }
        throw th;
    }
}
