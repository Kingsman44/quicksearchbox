package com.google.android.apps.search.assistant.surfaces.appactions.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class AppShortcutsService extends C124373e implements C47231d {

    /* renamed from: a */
    private C124372d f343276a;

    /* renamed from: b */
    private boolean f343277b;

    /* renamed from: c */
    private final C47550bb f343278c = new C47550bb(this);

    /* renamed from: d */
    private boolean f343279d;

    @Deprecated
    public AppShortcutsService() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C124372d mo17754z() {
        C124372d dVar = this.f343276a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f343279d) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f343278c.mo51409a(intent);
        try {
            C124372d a2 = mo17754z();
            ((C59052c) ((C59052c) C124372d.f343293a.mo56224b()).mo56372aa(36226)).mo56389s("onBind called with intent: %s", intent);
            C124378j jVar = a2.f343294b;
            a.close();
            return jVar;
        } catch (Throwable th) {
            C124369a.m203824a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f343278c.mo51410b();
        try {
            this.f343277b = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f343276a == null) {
                if (!this.f343277b) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f343279d) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo106398b().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo106398b().mo17653jN();
                    this.f343276a = new C124372d(new C124378j(((amb) jN).f197807b.a.mo68286el(), (Executor) ((amb) jN).f197807b.n.mo17428b()));
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f343277b = false;
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
                C124369a.m203824a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f343278c.mo51412d();
        try {
            super.onDestroy();
            this.f343279d = true;
            d.close();
            return;
        } catch (Throwable th) {
            C124369a.m203824a(th, th);
        }
        throw th;
    }
}
