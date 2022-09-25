package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.t */
/* compiled from: PG */
public final class C145622t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PassType passType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        String str4 = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        Bitmap bitmap2 = null;
        int i = 14343392;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    passType = (PassType) C143946b.m234063l(parcel, readInt, PassType.CREATOR);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    bitmap = (Bitmap) C143946b.m234063l(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 6:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 8:
                    str5 = C143946b.m234069r(parcel, readInt);
                    break;
                case 9:
                    bitmap2 = (Bitmap) C143946b.m234063l(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 10:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new PassInstance(passType, str, str2, str3, bitmap, str4, pendingIntent, str5, bitmap2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PassInstance[i];
    }
}
