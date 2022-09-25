package com.google.android.apps.search.googleapp.launcher.p10341b;

import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136531i;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136508k;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.u */
/* compiled from: PG */
public final /* synthetic */ class C136554u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C136433ae f371789a;

    /* renamed from: b */
    public final /* synthetic */ Instant f371790b;

    public /* synthetic */ C136554u(C136433ae aeVar, Instant instant) {
        this.f371789a = aeVar;
        this.f371790b = instant;
    }

    public final void run() {
        C136508k j;
        C136433ae aeVar = this.f371789a;
        Instant instant = this.f371790b;
        C136439ak akVar = aeVar.f371418e;
        akVar.f371455j.mo113057a("endScroll");
        C136531i iVar = akVar.f371452g;
        if (iVar != null && (j = iVar.mo113158j()) != null) {
            if (j.f371633j) {
                j.mo113107f(j.f371634k, 1, instant);
                j.f371634k = 0;
            }
            j.f371633j = false;
        }
    }
}
