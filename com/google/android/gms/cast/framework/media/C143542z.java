package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.framework.media.z */
/* compiled from: PG */
public final class C143542z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = C143946b.m234072u(parcel2, readInt);
                    break;
                case 3:
                    iArr = C143946b.m234045B(parcel2, readInt);
                    break;
                case 4:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 10:
                    i5 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 11:
                    i6 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 12:
                    i7 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 13:
                    i8 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 14:
                    i9 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 15:
                    i10 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 16:
                    i11 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 17:
                    i12 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 18:
                    i13 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 19:
                    i14 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 20:
                    i15 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 21:
                    i16 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 22:
                    i17 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 23:
                    i18 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 24:
                    i19 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 25:
                    i20 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 26:
                    i21 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 27:
                    i22 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 28:
                    i23 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 29:
                    i24 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 30:
                    i25 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 31:
                    i26 = C143946b.m234057f(parcel2, readInt);
                    break;
                case ' ':
                    i27 = C143946b.m234057f(parcel2, readInt);
                    break;
                case '!':
                    iBinder = C143946b.m234062k(parcel2, readInt);
                    break;
                case '\"':
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case '#':
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new NotificationOptions(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NotificationOptions[i];
    }
}
