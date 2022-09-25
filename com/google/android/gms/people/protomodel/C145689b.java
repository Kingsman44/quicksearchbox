package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.people.protomodel.b */
/* compiled from: PG */
public final class C145689b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        Long l = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) C143946b.m234063l(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                l = C143946b.m234068q(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new BirthdayEntity(personFieldMetadataEntity, l);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BirthdayEntity[i];
    }
}
