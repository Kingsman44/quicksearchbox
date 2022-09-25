package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.people.consentprimitive.d */
/* compiled from: PG */
public final class C145649d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = null;
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = null;
        ContactsConsentsConfig contactsConsentsConfig = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) C143946b.m234063l(parcel, readInt, ContactsConsentsCoarseStatus.CREATOR);
            } else if (c == 2) {
                contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) C143946b.m234063l(parcel, readInt, ContactsConsentsDetailedStatus.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                contactsConsentsConfig = (ContactsConsentsConfig) C143946b.m234063l(parcel, readInt, ContactsConsentsConfig.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ContactsConsentsStatus(contactsConsentsCoarseStatus, contactsConsentsDetailedStatus, contactsConsentsConfig);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsStatus[i];
    }
}
