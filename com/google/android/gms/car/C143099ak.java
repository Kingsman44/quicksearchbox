package com.google.android.gms.car;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.car.CarCall;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.car.ak */
/* compiled from: PG */
public final class C143099ak implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        Uri uri = null;
        String str = null;
        String str2 = null;
        Uri uri2 = null;
        Uri uri3 = null;
        PhoneAccountHandle phoneAccountHandle = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        GatewayInfo gatewayInfo = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    uri = (Uri) C143946b.m234063l(parcel2, readInt, Uri.CREATOR);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    uri2 = (Uri) C143946b.m234063l(parcel2, readInt, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) C143946b.m234063l(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    phoneAccountHandle = (PhoneAccountHandle) C143946b.m234063l(parcel2, readInt, PhoneAccountHandle.CREATOR);
                    break;
                case 9:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 10:
                    bundle = C143946b.m234061j(parcel2, readInt);
                    break;
                case 11:
                    bundle2 = C143946b.m234061j(parcel2, readInt);
                    break;
                case 12:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 13:
                    gatewayInfo = (GatewayInfo) C143946b.m234063l(parcel2, readInt, GatewayInfo.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new CarCall.Details(uri, str, str2, j, uri2, uri3, i, phoneAccountHandle, i2, bundle, bundle2, i3, gatewayInfo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CarCall.Details[i];
    }
}
