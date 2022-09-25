package com.google.android.libraries.lens.view.p2133i.p2136c;

import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.lens.view.i.c.a */
/* compiled from: PG */
final class C26905a extends C26911g {

    /* renamed from: b */
    private final Instant f73336b;

    /* renamed from: c */
    private final int f73337c;

    public C26905a(int i, Instant instant) {
        this.f73337c = i;
        if (instant != null) {
            this.f73336b = instant;
            return;
        }
        throw new NullPointerException("Null requestInstant");
    }

    /* renamed from: a */
    public final Instant mo32280a() {
        return this.f73336b;
    }

    /* renamed from: b */
    public final int mo32281b() {
        return this.f73337c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26911g) {
            C26911g gVar = (C26911g) obj;
            return this.f73337c == gVar.mo32281b() && this.f73336b.equals(gVar.mo32280a());
        }
    }

    public final int hashCode() {
        return ((this.f73337c ^ 1000003) * 1000003) ^ this.f73336b.hashCode();
    }

    public final String toString() {
        int i = this.f73337c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "REFRESH_BUTTON" : "TOOLBELT_ACTION_DATA" : "DEVICE_PICKER_OPEN_UPDATE" : "ZERO_STATE_RETRY" : "UNKNOWN";
        String obj = this.f73336b.toString();
        return "DeviceListRefreshState{refreshMode=" + str + ", requestInstant=" + obj + "}";
    }
}
