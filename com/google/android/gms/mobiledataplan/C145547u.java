package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mobiledataplan.u */
/* compiled from: PG */
public final class C145547u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        MdpUpsellPlan[] mdpUpsellPlanArr = null;
        Bundle bundle = null;
        Integer num = null;
        Long l = null;
        PaymentForm[] paymentFormArr = null;
        ArrayList arrayList = null;
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
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    mdpUpsellPlanArr = (MdpUpsellPlan[]) C143946b.m234047D(parcel, readInt, MdpUpsellPlan.CREATOR);
                    break;
                case 6:
                    bundle = C143946b.m234061j(parcel, readInt);
                    break;
                case 7:
                    num = C143946b.m234067p(parcel, readInt);
                    break;
                case 8:
                    l = C143946b.m234068q(parcel, readInt);
                    break;
                case 9:
                    paymentFormArr = (PaymentForm[]) C143946b.m234047D(parcel, readInt, PaymentForm.CREATOR);
                    break;
                case 10:
                    arrayList = C143946b.m234073v(parcel, readInt, MdpUpsellOfferResponse.Filter.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new MdpUpsellOfferResponse(str, str2, str3, str4, mdpUpsellPlanArr, bundle, num, l, paymentFormArr, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdpUpsellOfferResponse[i];
    }
}
