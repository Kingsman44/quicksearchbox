package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.p4181bi.C55836bi;

/* renamed from: com.google.android.libraries.social.populous.core.cf */
/* compiled from: PG */
final class C42307cf implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        readString4.getClass();
        int a = C55836bi.m87792a(parcel.readInt());
        PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) parcel.readParcelable(PersonFieldMetadata.class.getClassLoader());
        personFieldMetadata.getClass();
        return new Name(readString, readString2, readString3, readString4, a, personFieldMetadata);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Name[i];
    }
}
