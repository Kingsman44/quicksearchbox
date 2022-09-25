package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.internal.f */
/* compiled from: PG */
public final class C146506f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        WebIconParcelable webIconParcelable = null;
        String str3 = null;
        String str4 = null;
        Float f = null;
        AppWearDetailsParcelable appWearDetailsParcelable = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 2:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    webIconParcelable = (WebIconParcelable) C143946b.m234063l(parcel, readInt, WebIconParcelable.CREATOR);
                    break;
                case 4:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    f = C143946b.m234066o(parcel, readInt);
                    break;
                case 7:
                    appWearDetailsParcelable = (AppWearDetailsParcelable) C143946b.m234063l(parcel, readInt, AppWearDetailsParcelable.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new AppParcelable(str, str2, webIconParcelable, str3, str4, f, appWearDetailsParcelable);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AppParcelable[i];
    }
}
