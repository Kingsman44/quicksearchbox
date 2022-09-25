package com.google.android.libraries.onegoogle.common;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.onegoogle.common.c */
/* compiled from: PG */
public final class C30916c extends C30904ad {

    /* renamed from: a */
    public final boolean f83343a;

    /* renamed from: b */
    public final C58495hd f83344b;

    /* renamed from: c */
    private final C58495hd f83345c;

    public C30916c(boolean z, C58495hd hdVar, C58495hd hdVar2) {
        this.f83343a = z;
        if (hdVar != null) {
            this.f83345c = hdVar;
            this.f83344b = hdVar2;
            return;
        }
        throw new NullPointerException("Null colorsMap");
    }

    /* renamed from: a */
    public final C58495hd mo36587a() {
        return this.f83345c;
    }

    /* renamed from: b */
    public final C58495hd mo36588b() {
        return this.f83344b;
    }

    /* renamed from: c */
    public final boolean mo36589c() {
        return this.f83343a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30904ad) {
            C30904ad adVar = (C30904ad) obj;
            return this.f83343a == adVar.mo36589c() && this.f83345c.equals(adVar.mo36587a()) && C58662ni.m90356o(this.f83344b, adVar.mo36588b());
        }
    }

    public final int hashCode() {
        return (((((true != this.f83343a ? 1237 : 1231) ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f83345c.entrySet())) * 1000003) ^ C58758qx.m90643a(this.f83344b.entrySet());
    }

    public final String toString() {
        boolean z = this.f83343a;
        String obj = this.f83345c.toString();
        String i = C58662ni.m90350i(this.f83344b);
        return "OneGoogleColorResolver{isLightTheme=" + z + ", colorsMap=" + obj + ", googleThemedColorsMap=" + i + "}";
    }
}
