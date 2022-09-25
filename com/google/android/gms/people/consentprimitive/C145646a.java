package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.people.consentprimitive.a */
/* compiled from: PG */
public final class C145646a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = BuildConfig.FLAVOR;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
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
                    arrayList = C143946b.m234073v(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    arrayList2 = C143946b.m234073v(parcel, readInt, Account.CREATOR);
                    break;
                case 5:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    z3 = C143946b.m234077z(parcel, readInt);
                    break;
                case 7:
                    arrayList3 = C143946b.m234073v(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new ContactsConsentsCoarseStatus(z, z2, arrayList, arrayList2, str, z3, arrayList3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsCoarseStatus[i];
    }
}
