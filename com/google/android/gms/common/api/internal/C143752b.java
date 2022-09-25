package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* compiled from: PG */
abstract class C143752b extends C143725a {

    /* renamed from: a */
    protected final C146010af f389721a;

    public C143752b(int i, C146010af afVar) {
        super(i);
        this.f389721a = afVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo119168c(C143763bk bkVar);

    /* renamed from: d */
    public final void mo119169d(Status status) {
        C146010af afVar = this.f389721a;
        afVar.f394698a.mo122509w(new C143842n(status));
    }

    /* renamed from: e */
    public final void mo119170e(Exception exc) {
        this.f389721a.f394698a.mo122509w(exc);
    }

    /* renamed from: f */
    public final void mo119171f(C143763bk bkVar) {
        try {
            mo119168c(bkVar);
        } catch (DeadObjectException e) {
            mo119169d(C143818g.m233739h(e));
            throw e;
        } catch (RemoteException e2) {
            mo119169d(C143818g.m233739h(e2));
        } catch (RuntimeException e3) {
            mo119170e(e3);
        }
    }

    /* renamed from: g */
    public void mo119172g(C143729ad adVar, boolean z) {
    }
}
