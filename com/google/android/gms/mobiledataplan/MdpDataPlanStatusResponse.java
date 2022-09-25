package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class MdpDataPlanStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145543q();

    /* renamed from: a */
    public final String f393469a;

    /* renamed from: b */
    public final MdpDataPlanStatus[] f393470b;

    /* renamed from: c */
    public final Bundle f393471c;

    /* renamed from: d */
    public final String f393472d;

    /* renamed from: e */
    public final WalletBalanceInfo f393473e;

    /* renamed from: f */
    public final Integer f393474f;

    /* renamed from: g */
    public final Long f393475g;

    /* renamed from: h */
    public final Long f393476h;

    /* renamed from: i */
    public CellularInfo[] f393477i;

    public MdpDataPlanStatusResponse(String str, MdpDataPlanStatus[] mdpDataPlanStatusArr, Bundle bundle, String str2, WalletBalanceInfo walletBalanceInfo, Integer num, Long l, Long l2, CellularInfo[] cellularInfoArr) {
        this.f393469a = str;
        this.f393470b = mdpDataPlanStatusArr;
        this.f393471c = bundle;
        this.f393472d = str2;
        this.f393473e = walletBalanceInfo;
        this.f393474f = num;
        this.f393475g = l;
        this.f393476h = l2;
        this.f393477i = cellularInfoArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdpDataPlanStatusResponse)) {
            return false;
        }
        MdpDataPlanStatusResponse mdpDataPlanStatusResponse = (MdpDataPlanStatusResponse) obj;
        return C143912ba.m233950b(this.f393469a, mdpDataPlanStatusResponse.f393469a) && Arrays.equals(this.f393470b, mdpDataPlanStatusResponse.f393470b) && C145511a.m236575b(this.f393471c, mdpDataPlanStatusResponse.f393471c) && C143912ba.m233950b(this.f393472d, mdpDataPlanStatusResponse.f393472d) && C143912ba.m233950b(this.f393473e, mdpDataPlanStatusResponse.f393473e) && C143912ba.m233950b(this.f393474f, mdpDataPlanStatusResponse.f393474f) && C143912ba.m233950b(this.f393475g, mdpDataPlanStatusResponse.f393475g) && C143912ba.m233950b(this.f393476h, mdpDataPlanStatusResponse.f393476h) && Arrays.equals(this.f393477i, mdpDataPlanStatusResponse.f393477i);
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f393469a, Integer.valueOf(C145511a.m236574a(this.f393471c)), this.f393472d, this.f393473e, this.f393474f, this.f393475g, this.f393476h}) ^ Arrays.hashCode(this.f393470b)) ^ Arrays.hashCode(this.f393477i);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("CarrierPlanId", this.f393469a, arrayList);
        C143910az.m233947b("DataPlans", Arrays.toString(this.f393470b), arrayList);
        C143910az.m233947b("ExtraInfo", this.f393471c, arrayList);
        C143910az.m233947b("Title", this.f393472d, arrayList);
        C143910az.m233947b("WalletBalanceInfo", this.f393473e, arrayList);
        C143910az.m233947b("EventFlowId", this.f393474f, arrayList);
        C143910az.m233947b("UniqueRequestId", this.f393475g, arrayList);
        Long l = this.f393476h;
        C143910az.m233947b("UpdateTime", l != null ? C62953e.m95484i(l.longValue()) : null, arrayList);
        C143910az.m233947b("CellularInfo", Arrays.toString(this.f393477i), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393469a);
        C143947c.m234079B(parcel, 2, this.f393470b, i);
        C143947c.m234093l(parcel, 3, this.f393471c);
        C143947c.m234106y(parcel, 4, this.f393472d);
        C143947c.m234105x(parcel, 5, this.f393473e, i);
        C143947c.m234101t(parcel, 6, this.f393474f);
        C143947c.m234104w(parcel, 7, this.f393475g);
        C143947c.m234104w(parcel, 8, this.f393476h);
        C143947c.m234079B(parcel, 9, this.f393477i, i);
        C143947c.m234083b(parcel, a);
    }
}
