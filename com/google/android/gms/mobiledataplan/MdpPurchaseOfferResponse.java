package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class MdpPurchaseOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145545s();

    /* renamed from: a */
    public final String f393482a;

    /* renamed from: b */
    public final String f393483b;

    /* renamed from: c */
    public final String f393484c;

    /* renamed from: d */
    public final String f393485d;

    /* renamed from: e */
    public final long f393486e;

    /* renamed from: f */
    public final String f393487f;

    /* renamed from: g */
    public final String f393488g;

    /* renamed from: h */
    public Bundle f393489h;

    /* renamed from: i */
    public final Integer f393490i;

    /* renamed from: j */
    public final Long f393491j;

    public MdpPurchaseOfferResponse(String str, String str2, String str3, String str4, long j, String str5, String str6, Bundle bundle, Integer num, Long l) {
        this.f393482a = str;
        this.f393483b = str2;
        this.f393484c = str3;
        this.f393485d = str4;
        this.f393486e = j;
        this.f393487f = str5;
        this.f393488g = str6;
        this.f393489h = bundle;
        this.f393490i = num;
        this.f393491j = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpPurchaseOfferResponse)) {
            return false;
        }
        MdpPurchaseOfferResponse mdpPurchaseOfferResponse = (MdpPurchaseOfferResponse) obj;
        return C143912ba.m233950b(this.f393482a, mdpPurchaseOfferResponse.f393482a) && C143912ba.m233950b(this.f393483b, mdpPurchaseOfferResponse.f393483b) && C143912ba.m233950b(this.f393484c, mdpPurchaseOfferResponse.f393484c) && C143912ba.m233950b(this.f393485d, mdpPurchaseOfferResponse.f393485d) && C143912ba.m233950b(Long.valueOf(this.f393486e), Long.valueOf(mdpPurchaseOfferResponse.f393486e)) && C143912ba.m233950b(this.f393487f, mdpPurchaseOfferResponse.f393487f) && C143912ba.m233950b(this.f393488g, mdpPurchaseOfferResponse.f393488g) && C145511a.m236575b(this.f393489h, mdpPurchaseOfferResponse.f393489h) && C143912ba.m233950b(this.f393490i, mdpPurchaseOfferResponse.f393490i) && C143912ba.m233950b(this.f393491j, mdpPurchaseOfferResponse.f393491j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393482a, this.f393483b, this.f393484c, this.f393485d, Long.valueOf(this.f393486e), this.f393487f, this.f393488g, this.f393489h, this.f393490i, this.f393491j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("CarrierName", this.f393482a, arrayList);
        C143910az.m233947b("TransactionId", this.f393483b, arrayList);
        C143910az.m233947b("ConfirmationCode", this.f393484c, arrayList);
        C143910az.m233947b("TransactionMsg", this.f393485d, arrayList);
        C143910az.m233947b("RemainingBalance", Long.valueOf(this.f393486e), arrayList);
        C143910az.m233947b("CostCurrency", this.f393487f, arrayList);
        C143910az.m233947b("PlanActivationTime", this.f393488g, arrayList);
        C143910az.m233947b("ExtraInfo", this.f393489h, arrayList);
        C143910az.m233947b("EventFlowId", this.f393490i, arrayList);
        C143910az.m233947b("UniqueRequestId", this.f393491j, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393482a);
        C143947c.m234106y(parcel, 2, this.f393483b);
        C143947c.m234106y(parcel, 3, this.f393484c);
        C143947c.m234106y(parcel, 4, this.f393485d);
        C143947c.m234090i(parcel, 5, this.f393486e);
        C143947c.m234106y(parcel, 6, this.f393487f);
        C143947c.m234106y(parcel, 7, this.f393488g);
        C143947c.m234093l(parcel, 8, this.f393489h);
        C143947c.m234101t(parcel, 9, this.f393490i);
        C143947c.m234104w(parcel, 10, this.f393491j);
        C143947c.m234083b(parcel, a);
    }
}
