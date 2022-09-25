package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.libraries.home.coreui.devicetile.model.C23736k;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.ad */
/* compiled from: PG */
final class C23658ad {

    /* renamed from: a */
    private final C23736k f64709a;

    /* renamed from: b */
    private final C23642d f64710b;

    /* renamed from: c */
    private final String f64711c = null;

    public C23658ad(C23736k kVar, C23642d dVar) {
        C69664n.m101061g(kVar, "status");
        C69664n.m101061g(dVar, "template");
        this.f64709a = kVar;
        this.f64710b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23658ad)) {
            return false;
        }
        C23658ad adVar = (C23658ad) obj;
        if (this.f64709a != adVar.f64709a || !C69664n.m101066l(this.f64710b, adVar.f64710b)) {
            return false;
        }
        String str = adVar.f64711c;
        return C69664n.m101066l((Object) null, (Object) null);
    }

    public final int hashCode() {
        return ((this.f64709a.hashCode() * 31) + this.f64710b.hashCode()) * 31;
    }

    public final String toString() {
        C23736k kVar = this.f64709a;
        C23642d dVar = this.f64710b;
        return "ControlState(status=" + kVar + ", template=" + dVar + ", badgeIcon=null)";
    }
}
