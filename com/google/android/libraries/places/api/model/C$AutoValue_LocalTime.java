package com.google.android.libraries.places.api.model;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_LocalTime  reason: invalid class name */
/* compiled from: PG */
public abstract class C$AutoValue_LocalTime extends LocalTime {

    /* renamed from: a */
    public final int f85518a;

    /* renamed from: b */
    public final int f85519b;

    public C$AutoValue_LocalTime(int i, int i2) {
        this.f85518a = i;
        this.f85519b = i2;
    }

    /* renamed from: a */
    public final int mo37480a() {
        return this.f85518a;
    }

    /* renamed from: b */
    public final int mo37481b() {
        return this.f85519b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            return this.f85518a == localTime.mo37480a() && this.f85519b == localTime.mo37481b();
        }
    }

    public final int hashCode() {
        return ((this.f85518a ^ 1000003) * 1000003) ^ this.f85519b;
    }

    public final String toString() {
        int i = this.f85518a;
        int i2 = this.f85519b;
        return "LocalTime{hours=" + i + ", minutes=" + i2 + "}";
    }
}
