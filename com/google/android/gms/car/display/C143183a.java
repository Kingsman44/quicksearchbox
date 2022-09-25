package com.google.android.gms.car.display;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.car.display.a */
/* compiled from: PG */
public final class C143183a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        CarDisplayId carDisplayId = null;
        Point point = null;
        Rect rect = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    carDisplayId = (CarDisplayId) C143946b.m234063l(parcel, readInt, CarDisplayId.CREATOR);
                    break;
                case 2:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 4:
                    point = (Point) C143946b.m234063l(parcel, readInt, Point.CREATOR);
                    break;
                case 5:
                    rect = (Rect) C143946b.m234063l(parcel, readInt, Rect.CREATOR);
                    break;
                case 6:
                    i3 = C143946b.m234057f(parcel, readInt);
                    break;
                case 7:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new CarDisplay(carDisplayId, i, i2, point, rect, i3, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CarDisplay[i];
    }
}
