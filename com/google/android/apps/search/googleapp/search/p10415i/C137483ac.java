package com.google.android.apps.search.googleapp.search.p10415i;

import com.google.android.apps.search.googleapp.search.srp.p10435e.C137770au;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.search.i.ac */
/* compiled from: PG */
public final class C137483ac {

    /* renamed from: a */
    public final C137770au f373933a;

    /* renamed from: b */
    public final C60817ay f373934b;

    /* renamed from: c */
    final /* synthetic */ C137485ae f373935c;

    /* renamed from: d */
    private final C137484ad f373936d;

    /* renamed from: e */
    private final long f373937e;

    public C137483ac(C137485ae aeVar, C137484ad adVar, C137770au auVar, C60817ay ayVar) {
        this.f373935c = aeVar;
        this.f373936d = adVar;
        this.f373933a = auVar;
        this.f373934b = ayVar;
        this.f373937e = aeVar.f373942e.mo26871c();
    }

    /* renamed from: a */
    public final void mo113776a() {
        if (!this.f373934b.mo57281n(true)) {
            this.f373934b.mo57275g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo113777b() {
        if (!this.f373934b.mo57276h().isDone()) {
            return false;
        }
        try {
            C60856cj.m92909r(this.f373934b.mo57276h());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo113778c(C137484ad adVar) {
        return adVar.equals(this.f373936d) && this.f373935c.f373942e.mo26871c() - this.f373937e < C137485ae.f373938a;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "Cache Key: %s; Age ms: %d", new Object[]{this.f373936d, Long.valueOf(this.f373935c.f373942e.mo26871c() - this.f373937e)});
    }
}
