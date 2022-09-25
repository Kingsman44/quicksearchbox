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
public class MdpCarrierPlanIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145539n();

    /* renamed from: a */
    public String f393434a;

    /* renamed from: b */
    public Bundle f393435b;

    /* renamed from: c */
    public Integer f393436c;

    /* renamed from: d */
    public Long f393437d;

    public MdpCarrierPlanIdRequest() {
    }

    @Deprecated
    public MdpCarrierPlanIdRequest(String str) {
        this.f393434a = str;
        this.f393435b = null;
        this.f393436c = null;
        this.f393437d = null;
    }

    public MdpCarrierPlanIdRequest(String str, Bundle bundle, Integer num, Long l) {
        this.f393434a = str;
        this.f393435b = bundle;
        this.f393436c = num;
        this.f393437d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpCarrierPlanIdRequest)) {
            return false;
        }
        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = (MdpCarrierPlanIdRequest) obj;
        return C143912ba.m233950b(this.f393434a, mdpCarrierPlanIdRequest.f393434a) && C145511a.m236575b(this.f393435b, mdpCarrierPlanIdRequest.f393435b) && C143912ba.m233950b(this.f393436c, mdpCarrierPlanIdRequest.f393436c) && C143912ba.m233950b(this.f393437d, mdpCarrierPlanIdRequest.f393437d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393434a, Integer.valueOf(C145511a.m236574a(this.f393435b)), this.f393436c, this.f393437d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.f393434a;
        C143910az.m233947b("apiKey", str.substring(Math.max(str.length() - 5, 0)), arrayList);
        C143910az.m233947b("ExtraInfo", this.f393435b, arrayList);
        C143910az.m233947b("EventFlowId", this.f393436c, arrayList);
        C143910az.m233947b("UniqueRequestId", this.f393437d, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393434a);
        C143947c.m234093l(parcel, 2, this.f393435b);
        C143947c.m234101t(parcel, 3, this.f393436c);
        C143947c.m234104w(parcel, 4, this.f393437d);
        C143947c.m234083b(parcel, a);
    }
}
