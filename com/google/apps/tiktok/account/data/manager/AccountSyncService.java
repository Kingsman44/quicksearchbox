package com.google.apps.tiktok.account.data.manager;

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

/* compiled from: PG */
public final class AccountSyncService extends C46275bu implements C47231d {

    /* renamed from: a */
    private C46257bc f121167a;

    /* renamed from: b */
    private boolean f121168b;

    /* renamed from: c */
    private final C47550bb f121169c = new C47550bb(this);

    /* renamed from: d */
    private boolean f121170d;

    @Deprecated
    public AccountSyncService() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C46257bc mo17754z() {
        C46257bc bcVar = this.f121167a;
        if (bcVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f121170d) {
            return bcVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final IBinder onBind(Intent intent) {
        C47573bx a = this.f121169c.mo51409a(intent);
        try {
            IBinder iBinder = (IBinder) mo17754z().f121239b.mo17428b();
            a.close();
            return iBinder;
        } catch (Throwable th) {
            C46248au.m82512a(th, th);
        }
        throw th;
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f121169c.mo51410b();
        try {
            this.f121168b = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f121167a == null) {
                if (!this.f121168b) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f121170d) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo50310b().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    this.f121167a = new C46257bc(((amb) mo50310b().mo17653jN()).f197782ab);
                    a2.close();
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            super.onCreate();
            this.f121168b = false;
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
                C46248au.m82512a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f121169c.mo51412d();
        try {
            super.onDestroy();
            this.f121170d = true;
            d.close();
            return;
        } catch (Throwable th) {
            C46248au.m82512a(th, th);
        }
        throw th;
    }
}
