package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.p4431a.C57878d;
import com.google.p4420by.p4425c.p4428b.p4429a.p4432b.C57885b;

/* renamed from: com.google.android.libraries.social.populous.core.cp */
/* compiled from: PG */
final class C42317cp implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        Class<PeopleApiAffinity> cls = PeopleApiAffinity.class;
        Class<MatchInfo[]> cls2 = MatchInfo[].class;
        Class<EdgeKeyInfo[]> cls3 = EdgeKeyInfo[].class;
        Class<ContainerInfo[]> cls4 = ContainerInfo[].class;
        return new PersonFieldMetadata((PeopleApiAffinity) cls.cast(parcel2.readParcelable(cls.getClassLoader())), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1, parcel.readInt() == 1, C42162a.m74085i(parcel), C42162a.m74085i(parcel), C42162a.m74078b(parcel2, C42331dc.class), C42162a.m74085i(parcel), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, C57878d.m88555a(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 1 ? Long.valueOf(parcel.readLong()) : null, (C57885b) C42162a.m74080d(parcel2, C57885b.f154844a));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonFieldMetadata[i];
    }
}
