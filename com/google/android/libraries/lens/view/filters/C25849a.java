package com.google.android.libraries.lens.view.filters;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;

/* renamed from: com.google.android.libraries.lens.view.filters.a */
/* compiled from: PG */
final class C25849a extends C25897ad {

    /* renamed from: a */
    private final C25980d f70227a;

    /* renamed from: b */
    private final int f70228b;

    public C25849a(C25980d dVar, int i) {
        if (dVar != null) {
            this.f70227a = dVar;
            this.f70228b = i;
            return;
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: a */
    public final C25980d mo31004a() {
        return this.f70227a;
    }

    /* renamed from: b */
    public final int mo31005b() {
        return this.f70228b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25897ad) {
            C25897ad adVar = (C25897ad) obj;
            return this.f70227a.equals(adVar.mo31004a()) && this.f70228b == adVar.mo31005b();
        }
    }

    public final int hashCode() {
        return ((this.f70227a.hashCode() ^ 1000003) * 1000003) ^ this.f70228b;
    }

    public final String toString() {
        String obj = this.f70227a.toString();
        String num = Integer.toString(this.f70228b - 1);
        return "InitialFilter{type=" + obj + ", source=" + num + "}";
    }
}
