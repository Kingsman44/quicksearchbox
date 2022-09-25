package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.util.C90737au;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mo */
/* compiled from: PG */
final class C109476mo implements C90991b {

    /* renamed from: a */
    final long f304929a;

    /* renamed from: b */
    final int f304930b;

    /* renamed from: c */
    final boolean f304931c;

    /* renamed from: d */
    final boolean f304932d;

    /* renamed from: e */
    final boolean f304933e;

    /* renamed from: f */
    final int f304934f;

    /* renamed from: g */
    int f304935g = 1;

    public C109476mo(boolean z, long j, int i, boolean z2, boolean z3, int i2) {
        this.f304932d = z;
        this.f304929a = j;
        this.f304930b = i;
        this.f304931c = z2;
        this.f304933e = z3;
        this.f304934f = i2;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85292s(C90752i.m148232f(new Date(this.f304929a)));
        fVar.mo85279c("recognition_state").mo85276a(C90752i.m148229c(C90737au.m148206a(this.f304930b)));
        fVar.mo85279c("is_tts_playing").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f304932d)));
        fVar.mo85279c("is_initialized").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f304933e)));
        fVar.mo85279c("is_waiting_for_results").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f304931c)));
        fVar.mo85279c("logo_view_state").mo85276a(C90752i.m148230d(Integer.valueOf(this.f304934f)));
        fVar.mo85279c("times_seen").mo85276a(C90752i.m148230d(Integer.valueOf(this.f304935g)));
    }
}
