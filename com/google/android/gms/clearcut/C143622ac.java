package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: com.google.android.gms.clearcut.ac */
/* compiled from: PG */
public final class C143622ac implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PlayLoggerContext playLoggerContext = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        ExperimentTokens[] experimentTokensArr = null;
        LogVerifierResultParcelable logVerifierResultParcelable = null;
        String[] strArr2 = null;
        boolean z = true;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) C143946b.m234063l(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr = C143946b.m234044A(parcel, readInt);
                    break;
                case 4:
                    iArr = C143946b.m234045B(parcel, readInt);
                    break;
                case 5:
                    strArr = C143946b.m234048E(parcel, readInt);
                    break;
                case 6:
                    iArr2 = C143946b.m234045B(parcel, readInt);
                    break;
                case 7:
                    bArr2 = C143946b.m234050G(parcel, readInt);
                    break;
                case 8:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 9:
                    experimentTokensArr = (ExperimentTokens[]) C143946b.m234047D(parcel, readInt, ExperimentTokens.CREATOR);
                    break;
                case 11:
                    logVerifierResultParcelable = (LogVerifierResultParcelable) C143946b.m234063l(parcel, readInt, LogVerifierResultParcelable.CREATOR);
                    break;
                case 12:
                    strArr2 = C143946b.m234048E(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new LogEventParcelable(playLoggerContext, bArr, iArr, strArr, iArr2, bArr2, z, experimentTokensArr, logVerifierResultParcelable, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
