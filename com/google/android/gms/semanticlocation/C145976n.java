package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.semanticlocation.InputPlaceCandidate;

/* renamed from: com.google.android.gms.semanticlocation.n */
/* compiled from: PG */
public final class C145976n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        InputPlaceCandidate.FeatureId featureId = null;
        DevicePersonalizedPlaceInfo devicePersonalizedPlaceInfo = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                featureId = (InputPlaceCandidate.FeatureId) C143946b.m234063l(parcel, readInt, InputPlaceCandidate.FeatureId.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                devicePersonalizedPlaceInfo = (DevicePersonalizedPlaceInfo) C143946b.m234063l(parcel, readInt, DevicePersonalizedPlaceInfo.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new InputPlaceCandidate(featureId, devicePersonalizedPlaceInfo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InputPlaceCandidate[i];
    }
}
