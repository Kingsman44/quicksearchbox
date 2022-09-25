package com.google.android.libraries.places.widget.internal.p2440a;

import com.google.android.gms.tasks.C146024d;

/* renamed from: com.google.android.libraries.places.widget.internal.a.b */
/* compiled from: PG */
public final class C31900b extends C31905g {

    /* renamed from: a */
    public final C146024d f85785a;

    /* renamed from: b */
    public final String f85786b;

    public C31900b(C146024d dVar, String str) {
        this.f85785a = dVar;
        if (str != null) {
            this.f85786b = str;
            return;
        }
        throw new NullPointerException("Null placeId");
    }

    /* renamed from: a */
    public final C146024d mo37640a() {
        return this.f85785a;
    }

    /* renamed from: b */
    public final String mo37645b() {
        return this.f85786b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31905g) {
            C31905g gVar = (C31905g) obj;
            return this.f85785a.equals(gVar.mo37640a()) && this.f85786b.equals(gVar.mo37645b());
        }
    }

    public final int hashCode() {
        return ((this.f85785a.hashCode() ^ 1000003) * 1000003) ^ this.f85786b.hashCode();
    }

    public final String toString() {
        String obj = this.f85785a.toString();
        String str = this.f85786b;
        return "PlaceRequest{source=" + obj + ", placeId=" + str + "}";
    }
}
