package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.cp */
/* compiled from: PG */
final class C98422cp implements C90991b {

    /* renamed from: a */
    final boolean f274772a;

    /* renamed from: b */
    final boolean f274773b;

    /* renamed from: c */
    final boolean f274774c;

    /* renamed from: d */
    final long f274775d;

    public C98422cp(C98426ct ctVar, boolean z, boolean z2, boolean z3) {
        this.f274772a = z;
        this.f274773b = z2;
        this.f274774c = z3;
        this.f274775d = ctVar.f274784b.mo26870b();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("timestamp").mo85276a(C90752i.m148229c(C98426ct.f274782a.format(new Date(this.f274775d))));
        fVar.mo85279c("isForeground").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f274772a)));
        if (!this.f274773b) {
            fVar.mo85279c("network").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f274773b)));
        }
        if (this.f274774c) {
            fVar.mo85279c("waiting").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f274774c)));
        }
    }
}
