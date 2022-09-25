package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.signin.internal.i */
/* compiled from: PG */
public final class C146003i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                connectionResult = (ConnectionResult) C143946b.m234063l(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) C143946b.m234063l(parcel, readInt, ResolveAccountResponse.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SignInResponse(i, connectionResult, resolveAccountResponse);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInResponse[i];
    }
}
