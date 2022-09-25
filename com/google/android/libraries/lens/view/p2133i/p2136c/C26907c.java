package com.google.android.libraries.lens.view.p2133i.p2136c;

import com.google.android.libraries.lens.view.p2133i.p2134a.C26897b;
import com.google.lens.p4707j.C62584r;

/* renamed from: com.google.android.libraries.lens.view.i.c.c */
/* compiled from: PG */
final class C26907c extends C26916l {

    /* renamed from: a */
    public final C62584r f73340a;

    /* renamed from: b */
    public final C26897b f73341b;

    public C26907c(C62584r rVar, C26897b bVar) {
        this.f73340a = rVar;
        this.f73341b = bVar;
    }

    /* renamed from: a */
    public final C26897b mo32288a() {
        return this.f73341b;
    }

    /* renamed from: b */
    public final C26915k mo32289b() {
        return new C26906b(this);
    }

    /* renamed from: c */
    public final C62584r mo32290c() {
        return this.f73340a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26916l) {
            C26916l lVar = (C26916l) obj;
            return this.f73340a.equals(lVar.mo32290c()) && this.f73341b.equals(lVar.mo32288a());
        }
    }

    public final int hashCode() {
        return ((this.f73340a.hashCode() ^ 1000003) * 1000003) ^ this.f73341b.hashCode();
    }

    public final String toString() {
        String obj = this.f73340a.toString();
        String obj2 = this.f73341b.toString();
        return "DeviceInfoHolder{deviceInfo=" + obj + ", deviceState=" + obj2 + "}";
    }
}
