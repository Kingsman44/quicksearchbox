package com.google.android.libraries.places.api.model;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_RectangularBounds  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_RectangularBounds extends RectangularBounds {

    /* renamed from: a */
    public final LatLng f85552a;

    /* renamed from: b */
    public final LatLng f85553b;

    public C$AutoValue_RectangularBounds(LatLng latLng, LatLng latLng2) {
        if (latLng != null) {
            this.f85552a = latLng;
            if (latLng2 != null) {
                this.f85553b = latLng2;
                return;
            }
            throw new NullPointerException("Null northeast");
        }
        throw new NullPointerException("Null southwest");
    }

    /* renamed from: a */
    public final LatLng mo37535a() {
        return this.f85553b;
    }

    /* renamed from: b */
    public final LatLng mo37536b() {
        return this.f85552a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RectangularBounds) {
            RectangularBounds rectangularBounds = (RectangularBounds) obj;
            return this.f85552a.equals(rectangularBounds.mo37536b()) && this.f85553b.equals(rectangularBounds.mo37535a());
        }
    }

    public final int hashCode() {
        return ((this.f85552a.hashCode() ^ 1000003) * 1000003) ^ this.f85553b.hashCode();
    }

    public final String toString() {
        String obj = this.f85552a.toString();
        String obj2 = this.f85553b.toString();
        return "RectangularBounds{southwest=" + obj + ", northeast=" + obj2 + "}";
    }
}
