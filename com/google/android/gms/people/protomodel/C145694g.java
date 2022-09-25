package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.people.protomodel.g */
/* compiled from: PG */
public final class C145694g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 9) {
                arrayList5 = C143946b.m234073v(parcel, readInt, BirthdayEntity.CREATOR);
            } else if (c == 11) {
                arrayList3 = C143946b.m234073v(parcel, readInt, EmailEntity.CREATOR);
            } else if (c == 13) {
                arrayList4 = C143946b.m234073v(parcel, readInt, PhoneEntity.CREATOR);
            } else if (c == 4) {
                arrayList = C143946b.m234073v(parcel, readInt, NameEntity.CREATOR);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList2 = C143946b.m234073v(parcel, readInt, PhotoEntity.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PersonEntity(str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }
}
