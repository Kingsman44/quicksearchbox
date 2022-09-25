package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.reminders.o */
/* compiled from: PG */
public final class C145856o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        Long l = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                l = C143946b.m234068q(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new UpdateRecurrenceOptions(Integer.valueOf(i), Boolean.valueOf(z), l);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateRecurrenceOptions[i];
    }
}
