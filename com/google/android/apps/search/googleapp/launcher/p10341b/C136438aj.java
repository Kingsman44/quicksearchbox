package com.google.android.apps.search.googleapp.launcher.p10341b;

import com.google.apps.tiktok.tracing.C47810es;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.aj */
/* compiled from: PG */
public final class C136438aj {

    /* renamed from: a */
    public boolean f371442a = false;

    /* renamed from: b */
    public final /* synthetic */ C136439ak f371443b;

    /* renamed from: c */
    public final /* synthetic */ C136432ad f371444c;

    public C136438aj(C136439ak akVar, C136432ad adVar) {
        this.f371443b = akVar;
        this.f371444c = adVar;
    }

    /* renamed from: a */
    public final void mo113036a(boolean z) {
        this.f371443b.f371455j.mo113057a(String.format(Locale.US, "onOverlayStateChanged: overlayVisible=%s", new Object[]{Boolean.valueOf(z)}));
        C136432ad adVar = this.f371444c;
        C136433ae aeVar = adVar.f371413b;
        if (aeVar.f371417d >= 11 && !aeVar.f371427n) {
            C136423a c = C136443b.m221738c(aeVar.f371420g);
            c.mo113004j(z);
            aeVar.mo113020B(c.mo112996b());
            ScheduledFuture scheduledFuture = adVar.f371413b.f371422i;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                adVar.f371413b.f371422i.cancel(true);
            }
            C136433ae aeVar2 = adVar.f371413b;
            aeVar2.f371422i = aeVar2.f371424k.schedule(C47810es.m84977q(new C136431ac(adVar)), C136433ae.f371416c.toMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
