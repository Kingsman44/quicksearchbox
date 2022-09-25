package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class MdpUpsellPlan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145548v();

    /* renamed from: a */
    public final String f393504a;

    /* renamed from: b */
    public final String f393505b;

    /* renamed from: c */
    public final String f393506c;

    /* renamed from: d */
    public final long f393507d;

    /* renamed from: e */
    public final String f393508e;

    /* renamed from: f */
    public final String f393509f;

    /* renamed from: g */
    public final long f393510g;

    /* renamed from: h */
    public final long f393511h;

    /* renamed from: i */
    public final String f393512i;

    /* renamed from: j */
    public final String f393513j;

    /* renamed from: k */
    public final int f393514k;

    /* renamed from: l */
    public final List f393515l;

    public MdpUpsellPlan(String str, String str2, String str3, long j, String str4, String str5, long j2, long j3, String str6, String str7, int i, List list) {
        this.f393504a = str;
        this.f393505b = str2;
        this.f393506c = str3;
        this.f393507d = j;
        this.f393508e = str4;
        this.f393509f = str5;
        this.f393510g = j2;
        this.f393511h = j3;
        this.f393512i = str6;
        this.f393513j = str7;
        this.f393514k = i;
        this.f393515l = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpUpsellPlan)) {
            return false;
        }
        MdpUpsellPlan mdpUpsellPlan = (MdpUpsellPlan) obj;
        return C143912ba.m233950b(this.f393504a, mdpUpsellPlan.f393504a) && C143912ba.m233950b(this.f393505b, mdpUpsellPlan.f393505b) && C143912ba.m233950b(this.f393506c, mdpUpsellPlan.f393506c) && C143912ba.m233950b(Long.valueOf(this.f393507d), Long.valueOf(mdpUpsellPlan.f393507d)) && C143912ba.m233950b(this.f393508e, mdpUpsellPlan.f393508e) && C143912ba.m233950b(this.f393509f, mdpUpsellPlan.f393509f) && C143912ba.m233950b(Long.valueOf(this.f393510g), Long.valueOf(mdpUpsellPlan.f393510g)) && C143912ba.m233950b(Long.valueOf(this.f393511h), Long.valueOf(mdpUpsellPlan.f393511h)) && C143912ba.m233950b(this.f393512i, mdpUpsellPlan.f393512i) && C143912ba.m233950b(this.f393513j, mdpUpsellPlan.f393513j) && C143912ba.m233950b(Integer.valueOf(this.f393514k), Integer.valueOf(mdpUpsellPlan.f393514k)) && C143912ba.m233950b(this.f393515l, mdpUpsellPlan.f393515l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393504a, this.f393505b, this.f393506c, Long.valueOf(this.f393507d), this.f393508e, this.f393509f, Long.valueOf(this.f393510g), Long.valueOf(this.f393511h), this.f393512i, this.f393513j, Integer.valueOf(this.f393514k), this.f393515l});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("PlanId", this.f393504a, arrayList);
        C143910az.m233947b("PlanName", this.f393505b, arrayList);
        C143910az.m233947b("PlanType", this.f393506c, arrayList);
        C143910az.m233947b("Cost", Long.valueOf(this.f393507d), arrayList);
        C143910az.m233947b("CostCurrency", this.f393508e, arrayList);
        C143910az.m233947b("ConnectionType", this.f393509f, arrayList);
        C143910az.m233947b("DurationInSeconds", Long.valueOf(this.f393510g), arrayList);
        C143910az.m233947b("mQuotaBytes", Long.valueOf(this.f393511h), arrayList);
        C143910az.m233947b("mOfferContext", this.f393512i, arrayList);
        C143910az.m233947b("planDescription", this.f393513j, arrayList);
        C143910az.m233947b("offerType", Integer.valueOf(this.f393514k), arrayList);
        C143910az.m233947b("filterTags", this.f393515l, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393504a);
        C143947c.m234106y(parcel, 2, this.f393505b);
        C143947c.m234106y(parcel, 3, this.f393506c);
        C143947c.m234090i(parcel, 4, this.f393507d);
        C143947c.m234106y(parcel, 5, this.f393508e);
        C143947c.m234106y(parcel, 6, this.f393509f);
        C143947c.m234090i(parcel, 7, this.f393510g);
        C143947c.m234090i(parcel, 8, this.f393511h);
        C143947c.m234106y(parcel, 9, this.f393512i);
        C143947c.m234106y(parcel, 10, this.f393513j);
        C143947c.m234089h(parcel, 11, this.f393514k);
        C143947c.m234078A(parcel, 12, this.f393515l);
        C143947c.m234083b(parcel, a);
    }
}
