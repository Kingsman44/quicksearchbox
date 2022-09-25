package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.reminders.model.y */
/* compiled from: PG */
final class C145853y implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ReminderEventEntity(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ReminderEventEntity[i];
    }
}
