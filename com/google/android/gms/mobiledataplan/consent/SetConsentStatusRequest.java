package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.mobiledataplan.C145511a;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class SetConsentStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145528i();

    /* renamed from: a */
    public String f393559a;

    /* renamed from: b */
    public ParcelUuid f393560b;

    /* renamed from: c */
    public ConsentStatus f393561c;

    /* renamed from: d */
    public Long f393562d;

    /* renamed from: e */
    public int f393563e;

    /* renamed from: f */
    public Integer f393564f;

    /* renamed from: g */
    public Long f393565g;

    /* renamed from: h */
    public Bundle f393566h;

    public SetConsentStatusRequest() {
    }

    public SetConsentStatusRequest(String str, ParcelUuid parcelUuid, ConsentStatus consentStatus, Long l, int i, Integer num, Long l2, Bundle bundle) {
        this.f393559a = str;
        this.f393560b = parcelUuid;
        this.f393561c = consentStatus;
        this.f393562d = l;
        this.f393563e = i;
        this.f393564f = num;
        this.f393565g = l2;
        this.f393566h = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetConsentStatusRequest) {
            SetConsentStatusRequest setConsentStatusRequest = (SetConsentStatusRequest) obj;
            return C143912ba.m233950b(this.f393559a, setConsentStatusRequest.f393559a) && C143912ba.m233950b(this.f393560b, setConsentStatusRequest.f393560b) && C143912ba.m233950b(this.f393561c, setConsentStatusRequest.f393561c) && C143912ba.m233950b(this.f393562d, setConsentStatusRequest.f393562d) && C143912ba.m233950b(Integer.valueOf(this.f393563e), Integer.valueOf(setConsentStatusRequest.f393563e)) && C143912ba.m233950b(this.f393564f, setConsentStatusRequest.f393564f) && C143912ba.m233950b(this.f393565g, setConsentStatusRequest.f393565g) && C145511a.m236575b(this.f393566h, setConsentStatusRequest.f393566h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393559a, this.f393560b, this.f393561c, this.f393562d, Integer.valueOf(this.f393563e), this.f393564f, this.f393565g, Integer.valueOf(C145511a.m236574a(this.f393566h))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("clientCpid", this.f393559a, arrayList);
        C143910az.m233947b("sessionId", this.f393560b, arrayList);
        C143910az.m233947b("consentStatus", this.f393561c, arrayList);
        C143910az.m233947b("consentTime", this.f393562d, arrayList);
        C143910az.m233947b("textVersion", Integer.valueOf(this.f393563e), arrayList);
        C143910az.m233947b("eventFlowId", this.f393564f, arrayList);
        C143910az.m233947b("uniqueRequestId", this.f393565g, arrayList);
        C143910az.m233947b("extraInfo", this.f393566h, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393559a);
        C143947c.m234105x(parcel, 2, this.f393560b, i);
        C143947c.m234105x(parcel, 3, this.f393561c, i);
        C143947c.m234104w(parcel, 4, this.f393562d);
        C143947c.m234089h(parcel, 5, this.f393563e);
        C143947c.m234101t(parcel, 6, this.f393564f);
        C143947c.m234104w(parcel, 7, this.f393565g);
        C143947c.m234093l(parcel, 8, this.f393566h);
        C143947c.m234083b(parcel, a);
    }
}
