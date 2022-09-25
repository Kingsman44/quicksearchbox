package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.mobiledataplan.payment.PaymentForm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class MdpUpsellOfferResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145547u();

    /* renamed from: a */
    public final String f393492a;

    /* renamed from: b */
    public final String f393493b;

    /* renamed from: c */
    public final String f393494c;

    /* renamed from: d */
    public final String f393495d;

    /* renamed from: e */
    public final MdpUpsellPlan[] f393496e;

    /* renamed from: f */
    public final Bundle f393497f;

    /* renamed from: g */
    public final Integer f393498g;

    /* renamed from: h */
    public final Long f393499h;

    /* renamed from: i */
    public final PaymentForm[] f393500i;

    /* renamed from: j */
    public final List f393501j;

    /* compiled from: PG */
    public class Filter extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C145546t();

        /* renamed from: a */
        private final String f393502a;

        /* renamed from: b */
        private final String f393503b;

        public Filter(String str, String str2) {
            this.f393502a = str;
            this.f393503b = str2;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f393502a, this.f393503b});
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            C143910az.m233947b("tag", this.f393502a, arrayList);
            C143910az.m233947b("display_text", this.f393503b, arrayList);
            return C143910az.m233946a(arrayList, this);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f393502a);
            parcel.writeString(this.f393503b);
        }
    }

    public MdpUpsellOfferResponse(String str, String str2, String str3, String str4, MdpUpsellPlan[] mdpUpsellPlanArr, Bundle bundle, Integer num, Long l, PaymentForm[] paymentFormArr, List list) {
        this.f393492a = str;
        this.f393493b = str2;
        this.f393494c = str3;
        this.f393495d = str4;
        this.f393496e = mdpUpsellPlanArr;
        this.f393497f = bundle;
        this.f393498g = num;
        this.f393499h = l;
        this.f393500i = paymentFormArr;
        this.f393501j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpUpsellOfferResponse)) {
            return false;
        }
        MdpUpsellOfferResponse mdpUpsellOfferResponse = (MdpUpsellOfferResponse) obj;
        return C143912ba.m233950b(this.f393492a, mdpUpsellOfferResponse.f393492a) && C143912ba.m233950b(this.f393493b, mdpUpsellOfferResponse.f393493b) && C143912ba.m233950b(this.f393494c, mdpUpsellOfferResponse.f393494c) && C143912ba.m233950b(this.f393495d, mdpUpsellOfferResponse.f393495d) && Arrays.equals(this.f393496e, mdpUpsellOfferResponse.f393496e) && C145511a.m236575b(this.f393497f, mdpUpsellOfferResponse.f393497f) && C143912ba.m233950b(this.f393498g, mdpUpsellOfferResponse.f393498g) && C143912ba.m233950b(this.f393499h, mdpUpsellOfferResponse.f393499h) && Arrays.equals(this.f393500i, mdpUpsellOfferResponse.f393500i) && C143912ba.m233950b(this.f393501j, mdpUpsellOfferResponse.f393501j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393492a, this.f393493b, this.f393494c, this.f393495d, Integer.valueOf(C145511a.m236574a(this.f393497f)), this.f393498g, this.f393499h, Integer.valueOf(Arrays.hashCode(this.f393496e)), Integer.valueOf(Arrays.hashCode(this.f393500i)), this.f393501j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("CarrierName", this.f393492a, arrayList);
        C143910az.m233947b("CarrierLogoUrl", this.f393493b, arrayList);
        C143910az.m233947b("PromoMessage", this.f393494c, arrayList);
        C143910az.m233947b("Info", this.f393495d, arrayList);
        C143910az.m233947b("UpsellPlans", Arrays.toString(this.f393496e), arrayList);
        C143910az.m233947b("ExtraInfo", this.f393497f, arrayList);
        C143910az.m233947b("EventFlowId", this.f393498g, arrayList);
        C143910az.m233947b("UniqueRequestId", this.f393499h, arrayList);
        C143910az.m233947b("PaymentForms", Arrays.toString(this.f393500i), arrayList);
        C143910az.m233947b("Filters", this.f393501j.toString(), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393492a);
        C143947c.m234106y(parcel, 2, this.f393493b);
        C143947c.m234106y(parcel, 3, this.f393494c);
        C143947c.m234106y(parcel, 4, this.f393495d);
        C143947c.m234079B(parcel, 5, this.f393496e, i);
        C143947c.m234093l(parcel, 6, this.f393497f);
        C143947c.m234101t(parcel, 7, this.f393498g);
        C143947c.m234104w(parcel, 8, this.f393499h);
        C143947c.m234079B(parcel, 9, this.f393500i, i);
        C143947c.m234080C(parcel, 10, this.f393501j);
        C143947c.m234083b(parcel, a);
    }
}
