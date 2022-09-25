package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.signin.internal.h */
/* compiled from: PG */
public final class C146002h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) C143946b.m234063l(parcel, readInt, ResolveAccountRequest.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SignInRequest(i, resolveAccountRequest);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInRequest[i];
    }
}
