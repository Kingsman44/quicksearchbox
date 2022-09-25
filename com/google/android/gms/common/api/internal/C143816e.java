package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C143879a;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146013ai;

/* renamed from: com.google.android.gms.common.api.internal.e */
/* compiled from: PG */
public final class C143816e extends C143725a {

    /* renamed from: a */
    private final C143810dd f389872a;

    /* renamed from: b */
    private final C146010af f389873b;

    public C143816e(int i, C143810dd ddVar, C146010af afVar) {
        super(i);
        this.f389873b = afVar;
        this.f389872a = ddVar;
        if (i == 2 && ddVar.f389865c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    /* renamed from: a */
    public final boolean mo119122a(C143763bk bkVar) {
        return this.f389872a.f389865c;
    }

    /* renamed from: b */
    public final Feature[] mo119123b(C143763bk bkVar) {
        return this.f389872a.f389864b;
    }

    /* renamed from: d */
    public final void mo119169d(Status status) {
        C146010af afVar = this.f389873b;
        afVar.f394698a.mo122509w(C143879a.m233899a(status));
    }

    /* renamed from: e */
    public final void mo119170e(Exception exc) {
        this.f389873b.f394698a.mo122509w(exc);
    }

    /* renamed from: f */
    public final void mo119171f(C143763bk bkVar) {
        try {
            this.f389872a.mo57751a(bkVar.f389748b, this.f389873b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo119169d(C143818g.m233739h(e2));
        } catch (RuntimeException e3) {
            this.f389873b.f394698a.mo122509w(e3);
        }
    }

    /* renamed from: g */
    public final void mo119172g(C143729ad adVar, boolean z) {
        C146010af afVar = this.f389873b;
        adVar.f389651b.put(afVar, Boolean.valueOf(z));
        afVar.f394698a.mo122493l(C146013ai.f394700a, new C143728ac(adVar, afVar));
    }
}
