package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.phenotype.i */
/* compiled from: PG */
public final class C145731i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        int[] iArr2 = null;
        byte[][] bArr7 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    bArr = C143946b.m234044A(parcel, readInt);
                    break;
                case 4:
                    bArr2 = C143946b.m234050G(parcel, readInt);
                    break;
                case 5:
                    bArr3 = C143946b.m234050G(parcel, readInt);
                    break;
                case 6:
                    bArr4 = C143946b.m234050G(parcel, readInt);
                    break;
                case 7:
                    bArr5 = C143946b.m234050G(parcel, readInt);
                    break;
                case 8:
                    iArr = C143946b.m234045B(parcel, readInt);
                    break;
                case 9:
                    bArr6 = C143946b.m234050G(parcel, readInt);
                    break;
                case 10:
                    iArr2 = C143946b.m234045B(parcel, readInt);
                    break;
                case 11:
                    bArr7 = C143946b.m234050G(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new ExperimentTokens(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, iArr2, bArr7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
