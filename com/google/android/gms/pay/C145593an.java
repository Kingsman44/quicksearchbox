package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.an */
/* compiled from: PG */
public final class C145593an implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        PendingIntent pendingIntent = null;
        String str4 = null;
        PendingIntent pendingIntent2 = null;
        Bitmap bitmap = null;
        Bitmap[] bitmapArr = null;
        Animation animation = null;
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
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    pendingIntent2 = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 7:
                    bitmap = (Bitmap) C143946b.m234063l(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 8:
                    bitmapArr = (Bitmap[]) C143946b.m234047D(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 9:
                    animation = (Animation) C143946b.m234063l(parcel, readInt, Animation.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new TransitCardDialog(str, str2, str3, pendingIntent, str4, pendingIntent2, bitmap, bitmapArr, animation);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TransitCardDialog[i];
    }
}
