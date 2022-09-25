package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.C143557h;

/* renamed from: com.google.android.gms.cast.internal.p */
/* compiled from: PG */
final class C143590p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C143593s f389330a;

    /* renamed from: b */
    final /* synthetic */ ApplicationStatus f389331b;

    public C143590p(C143593s sVar, ApplicationStatus applicationStatus) {
        this.f389330a = sVar;
        this.f389331b = applicationStatus;
    }

    public final void run() {
        boolean z;
        C143593s sVar = this.f389330a;
        String str = this.f389331b.f389250a;
        if (!C143596v.m233278k(str, sVar.f389348h)) {
            sVar.f389348h = str;
            z = true;
        } else {
            z = false;
        }
        C143593s.f389337a.mo118884b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(sVar.f389350j));
        C143557h hVar = sVar.f389346f;
        if (hVar != null && (z || sVar.f389350j)) {
            hVar.mo118712d();
        }
        sVar.f389350j = false;
    }
}
