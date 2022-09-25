package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.phenotype.k */
/* compiled from: PG */
public final class C145733k implements Parcelable.Creator {
    /* renamed from: a */
    public static boolean m236999a(int i) {
        return i == 0;
    }

    /* renamed from: b */
    public static boolean m237000b(Object obj) {
        return obj == null;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        long j = 0;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 4:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 5:
                    d = C143946b.m234053b(parcel2, readInt);
                    break;
                case 6:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    bArr = C143946b.m234044A(parcel2, readInt);
                    break;
                case 8:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new Flag(str, j, z, d, str2, bArr, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Flag[i];
    }
}
