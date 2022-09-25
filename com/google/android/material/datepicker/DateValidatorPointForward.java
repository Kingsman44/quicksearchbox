package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* compiled from: PG */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator CREATOR = new C44637j();

    /* renamed from: a */
    private final long f116195a;

    public DateValidatorPointForward(long j) {
        this.f116195a = j;
    }

    /* renamed from: a */
    public final boolean mo47798a(long j) {
        return j >= this.f116195a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f116195a == ((DateValidatorPointForward) obj).f116195a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f116195a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f116195a);
    }
}
