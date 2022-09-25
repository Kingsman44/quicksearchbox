package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.a */
/* compiled from: PG */
final class C87511a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C87515c a = C87515c.m142148a(parcel.readString());
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        Contact contact = new Contact(a, readLong, readString, readString2, readString3, readString4);
        if (readString5 != null) {
            contact.f236356g = readString5;
        }
        if (readString6 != null) {
            contact.f236357h = readString6;
        }
        return contact;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Contact[i];
    }
}
