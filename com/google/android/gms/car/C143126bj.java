package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.car.bj */
/* compiled from: PG */
public final class C143126bj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Surface surface = null;
        Rect rect = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 2:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    i3 = C143946b.m234057f(parcel, readInt);
                    break;
                case 4:
                    surface = (Surface) C143946b.m234063l(parcel, readInt, Surface.CREATOR);
                    break;
                case 5:
                    rect = (Rect) C143946b.m234063l(parcel, readInt, Rect.CREATOR);
                    break;
                case 6:
                    i4 = C143946b.m234057f(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new DrawingSpec(i, i2, i3, surface, rect, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DrawingSpec[i];
    }
}
