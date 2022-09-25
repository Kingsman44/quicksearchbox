package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* renamed from: com.google.android.material.datepicker.a */
/* compiled from: PG */
final class C44604a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (CalendarConstraints.DateValidator) parcel.readParcelable(CalendarConstraints.DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CalendarConstraints[i];
    }
}
