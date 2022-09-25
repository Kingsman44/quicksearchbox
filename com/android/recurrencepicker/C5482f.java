package com.android.recurrencepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.Time;
import com.android.recurrencepicker.RecurrencePickerBaseDialog;

/* renamed from: com.android.recurrencepicker.f */
/* compiled from: PG */
final class C5482f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        RecurrencePickerBaseDialog.RecurrenceModel recurrenceModel = new RecurrencePickerBaseDialog.RecurrenceModel();
        recurrenceModel.f16602b = parcel.readInt();
        recurrenceModel.f16603c = parcel.readInt();
        recurrenceModel.f16604d = parcel.readInt();
        recurrenceModel.f16605e = new Time();
        recurrenceModel.f16605e.year = parcel.readInt();
        recurrenceModel.f16605e.month = parcel.readInt();
        recurrenceModel.f16605e.monthDay = parcel.readInt();
        recurrenceModel.f16606f = parcel.readInt();
        recurrenceModel.f16607g = new boolean[7];
        parcel.readBooleanArray(recurrenceModel.f16607g);
        recurrenceModel.f16608h = parcel.readInt();
        recurrenceModel.f16609i = parcel.readInt();
        recurrenceModel.f16610j = parcel.readInt();
        recurrenceModel.f16611k = parcel.readInt();
        recurrenceModel.f16601a = parcel.readInt();
        return recurrenceModel;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecurrencePickerBaseDialog.RecurrenceModel[i];
    }
}
