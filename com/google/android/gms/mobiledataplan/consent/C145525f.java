package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.consent.f */
/* compiled from: PG */
public final class C145525f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Long l = 0L;
        ConsentStatus consentStatus = null;
        ConsentAgreementText consentAgreementText = null;
        Integer num = null;
        Long l2 = null;
        Integer num2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    consentStatus = (ConsentStatus) C143946b.m234063l(parcel, readInt, ConsentStatus.CREATOR);
                    break;
                case 2:
                    consentAgreementText = (ConsentAgreementText) C143946b.m234063l(parcel, readInt, ConsentAgreementText.CREATOR);
                    break;
                case 3:
                    l = C143946b.m234068q(parcel, readInt);
                    break;
                case 4:
                    num = C143946b.m234067p(parcel, readInt);
                    break;
                case 5:
                    l2 = C143946b.m234068q(parcel, readInt);
                    break;
                case 6:
                    num2 = C143946b.m234067p(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetConsentInformationResponse(consentStatus, consentAgreementText, l, num, l2, num2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetConsentInformationResponse[i];
    }
}
