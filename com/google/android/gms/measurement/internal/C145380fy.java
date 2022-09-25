package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.fy */
/* compiled from: PG */
public class C145380fy implements C145383ga {

    /* renamed from: w */
    public final C145361ff f393011w;

    public C145380fy(C145361ff ffVar) {
        C143919bh.m233958a(ffVar);
        this.f393011w = ffVar;
    }

    /* renamed from: I */
    public final void mo121001I() {
        if (Thread.currentThread() != this.f393011w.mo120966as().f392912c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: ar */
    public final C145325dx mo120965ar() {
        throw null;
    }

    /* renamed from: as */
    public final C145358fc mo120966as() {
        throw null;
    }

    /* renamed from: g */
    public void mo120904g() {
        this.f393011w.mo120966as().mo120904g();
    }
}
