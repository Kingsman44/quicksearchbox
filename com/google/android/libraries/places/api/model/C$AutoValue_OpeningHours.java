package com.google.android.libraries.places.api.model;

import java.util.List;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_OpeningHours  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_OpeningHours extends OpeningHours {

    /* renamed from: a */
    public final List f85520a;

    /* renamed from: b */
    public final List f85521b;

    public C$AutoValue_OpeningHours(List list, List list2) {
        if (list != null) {
            this.f85520a = list;
            if (list2 != null) {
                this.f85521b = list2;
                return;
            }
            throw new NullPointerException("Null weekdayText");
        }
        throw new NullPointerException("Null periods");
    }

    /* renamed from: a */
    public final List mo37485a() {
        return this.f85520a;
    }

    /* renamed from: b */
    public final List mo37486b() {
        return this.f85521b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpeningHours) {
            OpeningHours openingHours = (OpeningHours) obj;
            return this.f85520a.equals(openingHours.mo37485a()) && this.f85521b.equals(openingHours.mo37486b());
        }
    }

    public final int hashCode() {
        return ((this.f85520a.hashCode() ^ 1000003) * 1000003) ^ this.f85521b.hashCode();
    }

    public final String toString() {
        String obj = this.f85520a.toString();
        String obj2 = this.f85521b.toString();
        return "OpeningHours{periods=" + obj + ", weekdayText=" + obj2 + "}";
    }
}
