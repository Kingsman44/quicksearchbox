package com.google.android.apps.search.lens.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.libraries.lens.sdk.p2045c.C24923h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public final class LensService extends C139944a implements C47231d {

    /* renamed from: a */
    private C139947d f380397a;

    /* renamed from: b */
    private boolean f380398b;

    /* renamed from: c */
    private final C47550bb f380399c = new C47550bb(this);

    /* renamed from: d */
    private boolean f380400d;

    @Deprecated
    public LensService() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final C139947d mo17754z() {
        C139947d dVar = this.f380397a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f380400d) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f380399c.mo51409a(intent);
        try {
            C139947d b = mo17754z();
            C59104x b2 = C139947d.f380406a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "LensServer");
            ((C59052c) ((C59052c) b2).mo56372aa(41493)).mo56386p("onBind");
            if (b.f380408c == null) {
                b.f380408c = new C139946c((C24923h) b.f380407b.mo17428b());
            }
            Binder binder = b.f380408c;
            a.close();
            return binder;
        } catch (Throwable th) {
            C139945b.m227584a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f380399c.mo51410b();
        try {
            this.f380398b = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f380397a == null) {
                if (!this.f380398b) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f380400d) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo115352a().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    this.f380397a = new C139947d(((amb) mo115352a().mo17653jN()).f197743P);
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f380398b = false;
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
                C139945b.m227584a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f380399c.mo51412d();
        try {
            super.onDestroy();
            C139947d b = mo17754z();
            C59104x b2 = C139947d.f380406a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "LensServer");
            ((C59052c) ((C59052c) b2).mo56372aa(41494)).mo56386p("onDestroy");
            b.f380408c = null;
            this.f380400d = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139945b.m227584a(th, th);
        }
        throw th;
    }
}
