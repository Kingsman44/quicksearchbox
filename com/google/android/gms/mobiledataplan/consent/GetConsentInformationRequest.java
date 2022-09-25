package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.mobiledataplan.C145511a;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class GetConsentInformationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145524e();

    /* renamed from: a */
    public String f393547a;

    /* renamed from: b */
    public boolean f393548b;

    /* renamed from: c */
    public Integer f393549c;

    /* renamed from: d */
    public Long f393550d;

    /* renamed from: e */
    public Bundle f393551e;

    public GetConsentInformationRequest() {
    }

    public GetConsentInformationRequest(String str, boolean z, Integer num, Long l, Bundle bundle) {
        this.f393547a = str;
        this.f393548b = z;
        this.f393549c = num;
        this.f393550d = l;
        this.f393551e = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetConsentInformationRequest) {
            GetConsentInformationRequest getConsentInformationRequest = (GetConsentInformationRequest) obj;
            return C143912ba.m233950b(this.f393547a, getConsentInformationRequest.f393547a) && C143912ba.m233950b(Boolean.valueOf(this.f393548b), Boolean.valueOf(getConsentInformationRequest.f393548b)) && C143912ba.m233950b(this.f393549c, getConsentInformationRequest.f393549c) && C143912ba.m233950b(this.f393550d, getConsentInformationRequest.f393550d) && C145511a.m236575b(this.f393551e, getConsentInformationRequest.f393551e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393547a, Boolean.valueOf(this.f393548b), this.f393549c, this.f393550d, Integer.valueOf(C145511a.m236574a(this.f393551e))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("clientCpid", this.f393547a, arrayList);
        C143910az.m233947b("includeConsentTexts", Boolean.valueOf(this.f393548b), arrayList);
        C143910az.m233947b("eventFlowId", this.f393549c, arrayList);
        C143910az.m233947b("uniqueRequestId", this.f393550d, arrayList);
        C143910az.m233947b("extraInfo", this.f393551e, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393547a);
        C143947c.m234084c(parcel, 2, this.f393548b);
        C143947c.m234101t(parcel, 3, this.f393549c);
        C143947c.m234104w(parcel, 4, this.f393550d);
        C143947c.m234093l(parcel, 5, this.f393551e);
        C143947c.m234083b(parcel, a);
    }
}
