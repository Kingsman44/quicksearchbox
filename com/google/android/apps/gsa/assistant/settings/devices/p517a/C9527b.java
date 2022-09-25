package com.google.android.apps.gsa.assistant.settings.devices.p517a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.a.b */
/* compiled from: PG */
final class C9527b extends C9529d {

    /* renamed from: a */
    private final int f33033a;

    /* renamed from: b */
    private final int f33034b;

    /* renamed from: c */
    private final C89849ae f33035c;

    public C9527b(int i, int i2, C89849ae aeVar) {
        this.f33033a = i;
        this.f33034b = i2;
        this.f33035c = aeVar;
    }

    /* renamed from: a */
    public final int mo17848a() {
        return this.f33033a;
    }

    /* renamed from: b */
    public final int mo17849b() {
        return this.f33034b;
    }

    /* renamed from: c */
    public final C89849ae mo17850c() {
        return this.f33035c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9529d) {
            C9529d dVar = (C9529d) obj;
            return this.f33033a == dVar.mo17848a() && this.f33034b == dVar.mo17849b() && this.f33035c.equals(dVar.mo17850c());
        }
    }

    public final int hashCode() {
        return ((((this.f33033a ^ 1000003) * 1000003) ^ this.f33034b) * 1000003) ^ this.f33035c.hashCode();
    }

    public final String toString() {
        int i = this.f33033a;
        int i2 = this.f33034b;
        String num = Integer.toString(this.f33035c.f245884YW);
        return "GhaDeviceSettingsPage{minGhaVersion=" + i + ", veId=" + i2 + ", flowEvent=" + num + "}";
    }
}
