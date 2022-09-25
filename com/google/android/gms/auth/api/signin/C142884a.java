package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* compiled from: PG */
public final class C142884a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) C143946b.m234063l(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 9:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    arrayList = C143946b.m234073v(parcel2, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 12:
                    str8 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
