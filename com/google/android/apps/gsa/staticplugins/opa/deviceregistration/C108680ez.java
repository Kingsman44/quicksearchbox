package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.Intent;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83954r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ez */
/* compiled from: PG */
public final class C108680ez extends C83954r {

    /* renamed from: a */
    int f302277a = 6;

    /* renamed from: b */
    private final C108711gc f302278b;

    public C108680ez(C108711gc gcVar) {
        this.f302278b = gcVar;
    }

    /* renamed from: c */
    public final synchronized void mo97059c() {
        this.f302277a = 1;
    }

    /* renamed from: d */
    public final synchronized void mo97060d() {
        this.f302277a = 3;
    }

    /* renamed from: e */
    public final synchronized void mo97061e() {
        this.f302277a = 5;
    }

    /* renamed from: f */
    public final synchronized void mo97062f() {
        this.f302277a = 4;
    }

    /* renamed from: g */
    public final synchronized void mo97063g() {
        this.f302277a = 2;
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        this.f302278b.mo97076e(this.f302277a);
        return C83903bi.m133649e(1, (Intent) null);
    }
}
