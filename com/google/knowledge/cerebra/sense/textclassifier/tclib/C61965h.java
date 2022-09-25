package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.h */
/* compiled from: PG */
public final class C61965h extends C61910bt {

    /* renamed from: a */
    public final C61960dp f167438a;

    /* renamed from: b */
    public final ParcelFileDescriptor f167439b;

    public C61965h(C61960dp dpVar, ParcelFileDescriptor parcelFileDescriptor) {
        this.f167438a = dpVar;
        this.f167439b = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo58346a() {
        return this.f167439b;
    }

    /* renamed from: b */
    public final C61960dp mo58347b() {
        return this.f167438a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61910bt) {
            C61910bt btVar = (C61910bt) obj;
            return this.f167438a.equals(btVar.mo58347b()) && this.f167439b.equals(btVar.mo58346a());
        }
    }

    public final int hashCode() {
        return ((this.f167438a.hashCode() ^ 1000003) * 1000003) ^ this.f167439b.hashCode();
    }

    public final String toString() {
        String obj = this.f167438a.toString();
        String obj2 = this.f167439b.toString();
        return "PkgModel{pkgSlice=" + obj + ", modelVersionProto=" + obj2 + "}";
    }
}
