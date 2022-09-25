package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.vision.face.internal.client.a */
/* compiled from: PG */
public final class C146311a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                pointFArr = (PointF[]) C143946b.m234047D(parcel, readInt, PointF.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ContourParcel(pointFArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ContourParcel[i];
    }
}
