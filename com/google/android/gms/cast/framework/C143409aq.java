package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.internal.C143439c;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144165j;

/* renamed from: com.google.android.gms.cast.framework.aq */
/* compiled from: PG */
public abstract class C143409aq {

    /* renamed from: f */
    public static final C143566ae f388903f = new C143566ae("Session");

    /* renamed from: a */
    private final C143408ap f388904a;

    /* renamed from: g */
    public final C143394ab f388905g;

    protected C143409aq(Context context, String str, String str2) {
        C143408ap apVar = new C143408ap(this);
        this.f388904a = apVar;
        this.f388905g = C143439c.m232819c(context, str, str2, apVar);
    }

    /* renamed from: a */
    public long mo118611a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo118612f(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo118613i(Bundle bundle) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo118614j(Bundle bundle) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo118615k(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo118616l(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo118617m(Bundle bundle) {
        throw null;
    }

    /* renamed from: n */
    public final C144165j mo118618n() {
        C143394ab abVar = this.f388905g;
        if (abVar != null) {
            try {
                return abVar.mo118570g();
            } catch (RemoteException e) {
                f388903f.mo118885c(e, "Unable to call %s on %s.", "getWrappedObject", C143394ab.class.getSimpleName());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo118619o(int i) {
        C143394ab abVar = this.f388905g;
        if (abVar != null) {
            try {
                abVar.mo118572i(i);
            } catch (RemoteException e) {
                f388903f.mo118885c(e, "Unable to call %s on %s.", "notifySessionEnded", C143394ab.class.getSimpleName());
            }
        }
    }

    /* renamed from: p */
    public final boolean mo118620p() {
        C143919bh.m233964g("Must be called from the main thread.");
        C143394ab abVar = this.f388905g;
        if (abVar != null) {
            try {
                return abVar.mo118573j();
            } catch (RemoteException e) {
                f388903f.mo118885c(e, "Unable to call %s on %s.", "isConnected", C143394ab.class.getSimpleName());
            }
        }
        return false;
    }
}
