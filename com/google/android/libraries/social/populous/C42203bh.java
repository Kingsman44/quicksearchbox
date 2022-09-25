package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.Phone;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.common.p4522b.C58485gu;
import com.google.p4181bi.C55851m;
import com.google.p4420by.p4425c.p4428b.p4429a.p4432b.C57887d;
import p5602o.p5607c.C71942m;

/* renamed from: com.google.android.libraries.social.populous.bh */
/* compiled from: PG */
final class C42203bh implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        PersonMetadata personMetadata = (PersonMetadata) parcel.readParcelable(PersonMetadata.class.getClassLoader());
        personMetadata.getClass();
        Class<Email[]> cls = Email[].class;
        C58485gu i = C42162a.m74085i(parcel);
        Class<Phone[]> cls2 = Phone[].class;
        C58485gu i2 = C42162a.m74085i(parcel);
        Class<InAppNotificationTarget[]> cls3 = InAppNotificationTarget[].class;
        C58485gu i3 = C42162a.m74085i(parcel);
        Class<Name[]> cls4 = Name[].class;
        C58485gu i4 = C42162a.m74085i(parcel);
        Class<Photo[]> cls5 = Photo[].class;
        C58485gu i5 = C42162a.m74085i(parcel);
        String readString = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new Person(personMetadata, i, i2, i3, i4, i5, readString, z, (PersonExtendedData) parcel.readParcelable(PersonExtendedData.class.getClassLoader()), (C55851m) C42162a.m74080d(parcel, C55851m.f147367e), (C57887d) C42162a.m74080d(parcel, C57887d.f154846c), (C71942m) C42162a.m74080d(parcel, C71942m.f191608a));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Person[i];
    }
}
