package com.google.android.gms.car.p10750a.p10751a;

import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.p10760f.C143273bg;
import com.google.android.gms.car.p10768k.p10770b.C143324a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.gms.car.a.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C142979ac implements C143324a {

    /* renamed from: a */
    public final /* synthetic */ C142995as f388008a;

    /* renamed from: b */
    public final /* synthetic */ CarDisplayId f388009b;

    public /* synthetic */ C142979ac(C142995as asVar, CarDisplayId carDisplayId) {
        this.f388008a = asVar;
        this.f388009b = carDisplayId;
    }

    public final Object call() {
        C142995as asVar = this.f388008a;
        CarDisplayId carDisplayId = this.f388009b;
        if (asVar.mo117935q(20)) {
            C143002az azVar = asVar.f388029d;
            int i = carDisplayId.f388292b;
            return (C143273bg) azVar.mo117943b(C143038ch.class, "DisplayId_" + i, new C142983ag(asVar, carDisplayId));
        }
        C58838bb.m90884s(CarDisplayId.f388291a.equals(carDisplayId), "LegacyCarDisplayInfoProvider should be used only for the primary car display.");
        return (C143273bg) asVar.f388029d.mo117942a(C143026bw.class, new C142984ah(asVar));
    }
}
