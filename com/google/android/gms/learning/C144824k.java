package com.google.android.gms.learning;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.learning.k */
/* compiled from: PG */
public final class C144824k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        InAppTrainingConstraints inAppTrainingConstraints = null;
        Uri uri2 = null;
        TrainingInterval trainingInterval = null;
        byte[] bArr = null;
        Uri uri3 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 2:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 4:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) C143946b.m234063l(parcel2, readInt, Uri.CREATOR);
                    break;
                case 9:
                    inAppTrainingConstraints = (InAppTrainingConstraints) C143946b.m234063l(parcel2, readInt, InAppTrainingConstraints.CREATOR);
                    break;
                case 10:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 11:
                    uri2 = (Uri) C143946b.m234063l(parcel2, readInt, Uri.CREATOR);
                    break;
                case 12:
                    trainingInterval = (TrainingInterval) C143946b.m234063l(parcel2, readInt, TrainingInterval.CREATOR);
                    break;
                case 13:
                    bArr = C143946b.m234044A(parcel2, readInt);
                    break;
                case 14:
                    uri3 = (Uri) C143946b.m234063l(parcel2, readInt, Uri.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new InAppTrainerOptions(str, i, z, str2, i2, uri, inAppTrainingConstraints, j, uri2, trainingInterval, bArr, uri3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InAppTrainerOptions[i];
    }
}
