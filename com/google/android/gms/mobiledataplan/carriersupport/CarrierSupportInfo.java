package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class CarrierSupportInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145519b();

    /* renamed from: a */
    public String f393535a;

    /* renamed from: b */
    public String f393536b;

    /* renamed from: c */
    public CarrierSupportChannel[] f393537c;

    private CarrierSupportInfo() {
    }

    public CarrierSupportInfo(String str, String str2, CarrierSupportChannel[] carrierSupportChannelArr) {
        this.f393535a = str;
        this.f393536b = str2;
        this.f393537c = carrierSupportChannelArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportInfo) {
            CarrierSupportInfo carrierSupportInfo = (CarrierSupportInfo) obj;
            return C143912ba.m233950b(this.f393535a, carrierSupportInfo.f393535a) && C143912ba.m233950b(this.f393536b, carrierSupportInfo.f393536b) && Arrays.equals(this.f393537c, carrierSupportInfo.f393537c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393535a, this.f393536b, Integer.valueOf(Arrays.hashCode(this.f393537c))});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("TitleMessage", this.f393535a, arrayList);
        C143910az.m233947b("LanguageCode", this.f393536b, arrayList);
        C143910az.m233947b("SupportChannels", Arrays.toString(this.f393537c), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393535a);
        C143947c.m234106y(parcel, 2, this.f393536b);
        C143947c.m234079B(parcel, 3, this.f393537c, i);
        C143947c.m234083b(parcel, a);
    }
}
