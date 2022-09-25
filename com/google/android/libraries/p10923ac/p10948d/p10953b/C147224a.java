package com.google.android.libraries.p10923ac.p10948d.p10953b;

import com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a.C146997a;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147174h;

/* renamed from: com.google.android.libraries.ac.d.b.a */
/* compiled from: PG */
public final class C147224a extends C147328h {

    /* renamed from: a */
    public final C146997a f397450a;

    /* renamed from: b */
    public final C147174h f397451b;

    public C147224a(C147174h hVar, C146997a aVar) {
        this.f397451b = hVar;
        this.f397450a = aVar;
    }

    /* renamed from: a */
    public final C146997a mo124041a() {
        return this.f397450a;
    }

    /* renamed from: b */
    public final C147174h mo124042b() {
        return this.f397451b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147328h) {
            C147328h hVar = (C147328h) obj;
            return this.f397451b.equals(hVar.mo124042b()) && this.f397450a.equals(hVar.mo124041a());
        }
    }

    public final int hashCode() {
        return ((this.f397451b.hashCode() ^ 1000003) * 1000003) ^ this.f397450a.hashCode();
    }

    public final String toString() {
        String obj = this.f397451b.toString();
        String obj2 = this.f397450a.toString();
        return "Deps{clock=" + obj + ", fcmNotificationsRegistration=" + obj2 + "}";
    }
}
