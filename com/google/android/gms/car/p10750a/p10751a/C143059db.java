package com.google.android.gms.car.p10750a.p10751a;

import android.os.Looper;
import com.google.android.gms.car.C143134br;
import com.google.android.gms.car.p10760f.p10761a.C143235a;

/* renamed from: com.google.android.gms.car.a.a.db */
/* compiled from: PG */
public final class C143059db extends C142995as {

    /* renamed from: g */
    private C143134br f388138g;

    public C143059db(Looper looper, Runnable runnable) {
        super(looper);
        this.f388031f = new C143235a(new C143058da(this, runnable));
    }

    /* renamed from: m */
    public final synchronized void mo117931m() {
        super.mo117931m();
        this.f388138g = null;
    }

    /* renamed from: s */
    public final synchronized C143134br mo117937s() {
        C143134br brVar;
        brVar = this.f388138g;
        if (brVar == null) {
            throw new IllegalStateException("WrapperCarClient not connected.");
        }
        return brVar;
    }

    /* renamed from: t */
    public final boolean mo117940t() {
        return this.f388138g != null;
    }

    /* renamed from: u */
    public final synchronized void mo118008u(C143134br brVar) {
        this.f388138g = brVar;
        if (brVar != null) {
            mo117929k();
        }
    }
}
