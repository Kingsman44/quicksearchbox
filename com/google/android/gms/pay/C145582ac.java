package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.ac */
/* compiled from: PG */
public final class C145582ac implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        Bitmap bitmap = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bitmap bitmap2 = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    bitmap = (Bitmap) C143946b.m234063l(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 4:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    bitmap2 = (Bitmap) C143946b.m234063l(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 8:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 9:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new PayGlobalActionCard(i, str, bitmap, str2, str3, str4, bitmap2, pendingIntent, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PayGlobalActionCard[i];
    }
}
