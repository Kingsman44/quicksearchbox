package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.people.consentprimitive.b */
/* compiled from: PG */
public final class C145647b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Account account = null;
        String str = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 2:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                case 3:
                    z3 = C143946b.m234077z(parcel, readInt);
                    break;
                case 4:
                    account = (Account) C143946b.m234063l(parcel, readInt, Account.CREATOR);
                    break;
                case 5:
                    z4 = C143946b.m234077z(parcel, readInt);
                    break;
                case 6:
                    z5 = C143946b.m234077z(parcel, readInt);
                    break;
                case 7:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 8:
                    arrayList = C143946b.m234073v(parcel, readInt, Account.CREATOR);
                    break;
                case 9:
                    z6 = C143946b.m234077z(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new ContactsConsentsConfig(z, z2, z3, account, z4, z5, str, arrayList, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsConfig[i];
    }
}
