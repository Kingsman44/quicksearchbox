package com.google.android.libraries.places.api.model;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_PlaceLikelihood  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_PlaceLikelihood extends PlaceLikelihood {

    /* renamed from: a */
    public final Place f85548a;

    /* renamed from: b */
    public final double f85549b;

    public C$AutoValue_PlaceLikelihood(Place place, double d) {
        if (place != null) {
            this.f85548a = place;
            this.f85549b = d;
            return;
        }
        throw new NullPointerException("Null place");
    }

    /* renamed from: a */
    public final double mo37525a() {
        return this.f85549b;
    }

    /* renamed from: b */
    public final Place mo37526b() {
        return this.f85548a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceLikelihood) {
            PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
            return this.f85548a.equals(placeLikelihood.mo37526b()) && Double.doubleToLongBits(this.f85549b) == Double.doubleToLongBits(placeLikelihood.mo37525a());
        }
    }

    public final int hashCode() {
        return ((this.f85548a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f85549b) >>> 32) ^ Double.doubleToLongBits(this.f85549b)));
    }

    public final String toString() {
        String obj = this.f85548a.toString();
        double d = this.f85549b;
        return "PlaceLikelihood{place=" + obj + ", likelihood=" + d + "}";
    }
}
