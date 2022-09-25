package com.google.android.gms.audit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.audit.g */
/* compiled from: PG */
public final class C142838g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        byte[][] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
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
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    bArr = C143946b.m234050G(parcel, readInt);
                    break;
                case 5:
                    bArr2 = C143946b.m234044A(parcel, readInt);
                    break;
                case 6:
                    bArr3 = C143946b.m234044A(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new LogAuditRecordsRequest(i, i2, str, bArr, bArr2, bArr3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogAuditRecordsRequest[i];
    }
}
