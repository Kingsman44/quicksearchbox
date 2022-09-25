package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.cast.framework.ar */
/* compiled from: PG */
public final class C143410ar {

    /* renamed from: a */
    public static final C143566ae f388906a = new C143566ae("SessionManager");

    /* renamed from: b */
    public final C143396ad f388907b;

    /* renamed from: c */
    private final Context f388908c;

    public C143410ar(C143396ad adVar, Context context) {
        this.f388907b = adVar;
        this.f388908c = context;
    }

    /* renamed from: a */
    public final C143466m mo118621a() {
        C143919bh.m233964g("Must be called from the main thread.");
        C143409aq b = mo118622b();
        if (b == null || !(b instanceof C143466m)) {
            return null;
        }
        return (C143466m) b;
    }

    /* renamed from: b */
    public final C143409aq mo118622b() {
        C143919bh.m233964g("Must be called from the main thread.");
        try {
            return (C143409aq) C144166k.m234388a(this.f388907b.mo118577e());
        } catch (RemoteException e) {
            f388906a.mo118885c(e, "Unable to call %s on %s.", "getWrappedCurrentSession", C143396ad.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: d */
    public final void mo118624d(boolean z) {
        C143919bh.m233964g("Must be called from the main thread.");
        try {
            f388906a.mo118888f("End session for %s", this.f388908c.getPackageName());
            this.f388907b.mo118581i(z);
        } catch (RemoteException e) {
            f388906a.mo118885c(e, "Unable to call %s on %s.", "endCurrentSession", C143396ad.class.getSimpleName());
        }
    }

    /* renamed from: e */
    public final void mo118625e(C143411as asVar, Class cls) {
        C143919bh.m233964g("Must be called from the main thread.");
        if (asVar != null) {
            try {
                this.f388907b.mo118580h(new C143412at(asVar, cls));
            } catch (RemoteException e) {
                f388906a.mo118885c(e, "Unable to call %s on %s.", "removeSessionManagerListener", C143396ad.class.getSimpleName());
            }
        }
    }

    /* renamed from: c */
    public final void mo118623c(C143411as asVar, Class cls) {
        if (asVar != null) {
            C143919bh.m233964g("Must be called from the main thread.");
            try {
                this.f388907b.mo118579g(new C143412at(asVar, cls));
            } catch (RemoteException e) {
                f388906a.mo118885c(e, "Unable to call %s on %s.", "addSessionManagerListener", C143396ad.class.getSimpleName());
            }
        } else {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
    }
}
