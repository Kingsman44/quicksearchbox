package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.people.protomodel.i */
/* compiled from: PG */
public final class C145696i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) C143946b.m234063l(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
            } else if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str2 = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PhoneEntity(personFieldMetadataEntity, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneEntity[i];
    }
}
