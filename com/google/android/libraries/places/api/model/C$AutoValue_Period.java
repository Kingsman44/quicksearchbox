package com.google.android.libraries.places.api.model;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_Period  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_Period extends Period {

    /* renamed from: a */
    public final TimeOfWeek f85522a;

    /* renamed from: b */
    public final TimeOfWeek f85523b;

    public C$AutoValue_Period(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        this.f85522a = timeOfWeek;
        this.f85523b = timeOfWeek2;
    }

    /* renamed from: a */
    public final TimeOfWeek mo37490a() {
        return this.f85523b;
    }

    /* renamed from: b */
    public final TimeOfWeek mo37491b() {
        return this.f85522a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            TimeOfWeek timeOfWeek = this.f85522a;
            if (timeOfWeek != null ? timeOfWeek.equals(period.mo37491b()) : period.mo37491b() == null) {
                TimeOfWeek timeOfWeek2 = this.f85523b;
                if (timeOfWeek2 != null ? timeOfWeek2.equals(period.mo37490a()) : period.mo37490a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f85522a);
        String valueOf2 = String.valueOf(this.f85523b);
        return "Period{open=" + valueOf + ", close=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        TimeOfWeek timeOfWeek = this.f85522a;
        int i2 = 0;
        if (timeOfWeek == null) {
            i = 0;
        } else {
            i = timeOfWeek.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        TimeOfWeek timeOfWeek2 = this.f85523b;
        if (timeOfWeek2 != null) {
            i2 = timeOfWeek2.hashCode();
        }
        return i3 ^ i2;
    }
}
