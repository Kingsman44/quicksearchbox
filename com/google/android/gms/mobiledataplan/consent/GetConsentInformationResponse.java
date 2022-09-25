package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class GetConsentInformationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145525f();

    /* renamed from: a */
    public ConsentStatus f393552a;

    /* renamed from: b */
    public ConsentAgreementText f393553b;

    /* renamed from: c */
    public Long f393554c;

    /* renamed from: d */
    public Integer f393555d;

    /* renamed from: e */
    public Long f393556e;

    /* renamed from: f */
    public Integer f393557f;

    private GetConsentInformationResponse() {
    }

    public GetConsentInformationResponse(ConsentStatus consentStatus, ConsentAgreementText consentAgreementText, Long l, Integer num, Long l2, Integer num2) {
        this.f393552a = consentStatus;
        this.f393553b = consentAgreementText;
        this.f393554c = l;
        this.f393555d = num;
        this.f393556e = l2;
        this.f393557f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetConsentInformationResponse) {
            GetConsentInformationResponse getConsentInformationResponse = (GetConsentInformationResponse) obj;
            return C143912ba.m233950b(this.f393552a, getConsentInformationResponse.f393552a) && C143912ba.m233950b(this.f393553b, getConsentInformationResponse.f393553b) && C143912ba.m233950b(this.f393554c, getConsentInformationResponse.f393554c) && C143912ba.m233950b(this.f393555d, getConsentInformationResponse.f393555d) && C143912ba.m233950b(this.f393556e, getConsentInformationResponse.f393556e) && C143912ba.m233950b(this.f393557f, getConsentInformationResponse.f393557f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393552a, this.f393553b, this.f393554c, this.f393555d, this.f393556e, this.f393557f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("ConsentStatus", this.f393552a, arrayList);
        C143910az.m233947b("ConsentAgreementText", this.f393553b, arrayList);
        C143910az.m233947b("ConsentChangeTime", this.f393554c, arrayList);
        C143910az.m233947b("EventFlowId", this.f393555d, arrayList);
        C143910az.m233947b("UniqueRequestId", this.f393556e, arrayList);
        C143910az.m233947b("ConsentResponseSource", this.f393557f, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393552a, i);
        C143947c.m234105x(parcel, 2, this.f393553b, i);
        C143947c.m234104w(parcel, 3, this.f393554c);
        C143947c.m234101t(parcel, 4, this.f393555d);
        C143947c.m234104w(parcel, 5, this.f393556e);
        C143947c.m234101t(parcel, 6, this.f393557f);
        C143947c.m234083b(parcel, a);
    }
}
