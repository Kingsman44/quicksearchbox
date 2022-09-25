package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.search.shared.contact.g */
/* compiled from: PG */
final class C87519g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        long readLong = parcel.readLong();
        double readDouble = parcel.readDouble();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        boolean z = parcel.readByte() > 0;
        ArrayList arrayList = new ArrayList();
        parcel2.readList(arrayList, getClass().getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        parcel2.readList(arrayList2, getClass().getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList2;
        parcel2.readList(arrayList3, getClass().getClassLoader());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = arrayList3;
        parcel2.readList(arrayList5, getClass().getClassLoader());
        String readString4 = parcel.readString();
        ArrayList arrayList7 = arrayList5;
        ArrayList arrayList8 = new ArrayList();
        String str = readString4;
        parcel2.readList(arrayList8, getClass().getClassLoader());
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = arrayList;
        parcel2.readList(arrayList9, getClass().getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        Contact contact = (Contact) parcel2.readParcelable(getClass().getClassLoader());
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = arrayList9;
        parcel2.readList(arrayList11, getClass().getClassLoader());
        ArrayList arrayList13 = new ArrayList();
        parcel2.readList(arrayList13, getClass().getClassLoader());
        Person person = new Person(readLong, readString, readString2, arrayList8);
        person.f236381l = readDouble;
        person.f236386q = readLong2;
        person.f236387r = readLong3;
        person.f236383n = readString3;
        person.f236382m = z;
        person.mo81552D(arrayList10);
        person.mo81549A(arrayList4);
        person.mo81553E(arrayList6);
        person.mo81551C(arrayList7);
        person.mo81550B(arrayList11);
        person.mo81554F(arrayList13);
        person.f236384o = str;
        person.f236389t.addAll(arrayList12);
        person.f236390u = readInt;
        int i = readInt2;
        if (i == 1) {
            person.mo81568t(contact);
        } else {
            Contact contact2 = contact;
            if (i == 2) {
                person.mo81567s(contact2);
            }
        }
        return person;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Person[i];
    }
}
