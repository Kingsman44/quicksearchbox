package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class MdpCarrierPlanIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145540o();

    /* renamed from: a */
    public final String f393438a;

    /* renamed from: b */
    public final long f393439b;

    /* renamed from: c */
    public String f393440c;

    /* renamed from: d */
    public String f393441d;

    /* renamed from: e */
    public long f393442e;

    /* renamed from: f */
    public String f393443f;

    /* renamed from: g */
    public int f393444g;

    /* renamed from: h */
    public CarrierSupportInfo f393445h;

    /* renamed from: i */
    public Integer f393446i;

    /* renamed from: j */
    public Long f393447j;

    public MdpCarrierPlanIdResponse(String str, long j, String str2, String str3, long j2, String str4, int i, CarrierSupportInfo carrierSupportInfo, Integer num, Long l) {
        this.f393438a = str;
        this.f393439b = j;
        this.f393440c = str2;
        this.f393441d = str3;
        this.f393442e = j2;
        this.f393443f = str4;
        if (i == 0 || i == 1 || i == 2) {
            this.f393444g = i;
            this.f393445h = carrierSupportInfo;
            this.f393446i = num;
            this.f393447j = l;
            return;
        }
        throw new IllegalArgumentException("Response source must be a value in CpidResponseSource");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpCarrierPlanIdResponse)) {
            return false;
        }
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = (MdpCarrierPlanIdResponse) obj;
        return C143912ba.m233950b(this.f393438a, mdpCarrierPlanIdResponse.f393438a) && C143912ba.m233950b(Long.valueOf(this.f393439b), Long.valueOf(mdpCarrierPlanIdResponse.f393439b)) && C143912ba.m233950b(this.f393440c, mdpCarrierPlanIdResponse.f393440c) && C143912ba.m233950b(this.f393441d, mdpCarrierPlanIdResponse.f393441d) && C143912ba.m233950b(Long.valueOf(this.f393442e), Long.valueOf(mdpCarrierPlanIdResponse.f393442e)) && C143912ba.m233950b(this.f393443f, mdpCarrierPlanIdResponse.f393443f) && C143912ba.m233950b(Integer.valueOf(this.f393444g), Integer.valueOf(mdpCarrierPlanIdResponse.f393444g)) && C143912ba.m233950b(this.f393445h, mdpCarrierPlanIdResponse.f393445h) && C143912ba.m233950b(this.f393446i, mdpCarrierPlanIdResponse.f393446i) && C143912ba.m233950b(this.f393447j, mdpCarrierPlanIdResponse.f393447j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393438a, Long.valueOf(this.f393439b), this.f393440c, this.f393441d, Long.valueOf(this.f393442e), Integer.valueOf(this.f393444g), this.f393445h, this.f393446i, this.f393447j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("CarrierPlanId", this.f393438a, arrayList);
        C143910az.m233947b("TTL-in-Seconds", Long.valueOf(this.f393439b), arrayList);
        C143910az.m233947b("CarrierName", this.f393440c, arrayList);
        C143910az.m233947b("CarrierLogoImageURL", this.f393441d, arrayList);
        C143910az.m233947b("CarrierId", Long.valueOf(this.f393442e), arrayList);
        C143910az.m233947b("CarrierCpid", this.f393443f, arrayList);
        C143910az.m233947b("ResponseSource", Integer.valueOf(this.f393444g), arrayList);
        C143910az.m233947b("CarrierSupportInfo", this.f393445h, arrayList);
        C143910az.m233947b("EventFlowId", this.f393446i, arrayList);
        C143910az.m233947b("UniqueRequestId", this.f393447j, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393438a);
        C143947c.m234090i(parcel, 2, this.f393439b);
        C143947c.m234106y(parcel, 3, this.f393440c);
        C143947c.m234106y(parcel, 4, this.f393441d);
        C143947c.m234090i(parcel, 5, this.f393442e);
        C143947c.m234106y(parcel, 6, this.f393443f);
        C143947c.m234089h(parcel, 7, this.f393444g);
        C143947c.m234105x(parcel, 8, this.f393445h, i);
        C143947c.m234101t(parcel, 9, this.f393446i);
        C143947c.m234104w(parcel, 10, this.f393447j);
        C143947c.m234083b(parcel, a);
    }
}
