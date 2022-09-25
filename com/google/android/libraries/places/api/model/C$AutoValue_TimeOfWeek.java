package com.google.android.libraries.places.api.model;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_TimeOfWeek  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_TimeOfWeek extends TimeOfWeek {

    /* renamed from: a */
    public final DayOfWeek f85554a;

    /* renamed from: b */
    public final LocalTime f85555b;

    public C$AutoValue_TimeOfWeek(DayOfWeek dayOfWeek, LocalTime localTime) {
        if (dayOfWeek != null) {
            this.f85554a = dayOfWeek;
            if (localTime != null) {
                this.f85555b = localTime;
                return;
            }
            throw new NullPointerException("Null time");
        }
        throw new NullPointerException("Null day");
    }

    /* renamed from: a */
    public final DayOfWeek mo37540a() {
        return this.f85554a;
    }

    /* renamed from: b */
    public final LocalTime mo37541b() {
        return this.f85555b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeOfWeek) {
            TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
            return this.f85554a.equals(timeOfWeek.mo37540a()) && this.f85555b.equals(timeOfWeek.mo37541b());
        }
    }

    public final int hashCode() {
        return ((this.f85554a.hashCode() ^ 1000003) * 1000003) ^ this.f85555b.hashCode();
    }

    public final String toString() {
        String obj = this.f85554a.toString();
        String obj2 = this.f85555b.toString();
        return "TimeOfWeek{day=" + obj + ", time=" + obj2 + "}";
    }
}
