package com.google.android.apps.search.googleapp.launcher.p10341b;

import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136531i;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136508k;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136512o;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136521x;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.l */
/* compiled from: PG */
public final /* synthetic */ class C136545l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C136433ae f371759a;

    /* renamed from: b */
    public final /* synthetic */ Instant f371760b;

    public /* synthetic */ C136545l(C136433ae aeVar, Instant instant) {
        this.f371759a = aeVar;
        this.f371760b = instant;
    }

    public final void run() {
        C136508k j;
        C136512o c;
        C136433ae aeVar = this.f371759a;
        Instant instant = this.f371760b;
        C136439ak akVar = aeVar.f371418e;
        akVar.f371455j.mo113057a("startScroll");
        C136531i iVar = akVar.f371452g;
        if (iVar != null && (j = iVar.mo113158j()) != null && (c = j.mo113104c()) != null && !c.mo17754z().f371687x) {
            C136521x a = c.mo17754z();
            if (a.f371670g < a.f371656A) {
                C136521x a2 = c.mo17754z();
                a2.f371685v.mo113057a("resetPanel");
                a2.mo113148p(0);
                j.f371633j = true;
                j.f371634k = 0;
                c.mo17754z().f371689z = true;
                j.f371630g = instant.minus(C136508k.f371624a);
                j.mo113107f(0, 0, j.f371630g);
                j.mo113107f(0, 2, instant);
            }
        }
    }
}
