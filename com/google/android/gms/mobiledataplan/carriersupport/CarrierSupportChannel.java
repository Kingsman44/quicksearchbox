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
public final class CarrierSupportChannel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145518a();

    /* renamed from: a */
    public String f393529a;

    /* renamed from: b */
    public String f393530b;

    /* renamed from: c */
    public String f393531c;

    /* renamed from: d */
    public String f393532d;

    /* renamed from: e */
    public String f393533e;

    /* renamed from: f */
    public int f393534f;

    private CarrierSupportChannel() {
    }

    public CarrierSupportChannel(String str, String str2, String str3, String str4, String str5, int i) {
        this.f393529a = str;
        this.f393530b = str2;
        this.f393531c = str3;
        this.f393532d = str4;
        this.f393533e = str5;
        this.f393534f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierSupportChannel) {
            CarrierSupportChannel carrierSupportChannel = (CarrierSupportChannel) obj;
            return C143912ba.m233950b(this.f393529a, carrierSupportChannel.f393529a) && C143912ba.m233950b(this.f393530b, carrierSupportChannel.f393530b) && C143912ba.m233950b(this.f393531c, carrierSupportChannel.f393531c) && C143912ba.m233950b(this.f393532d, carrierSupportChannel.f393532d) && C143912ba.m233950b(this.f393533e, carrierSupportChannel.f393533e) && C143912ba.m233950b(Integer.valueOf(this.f393534f), Integer.valueOf(carrierSupportChannel.f393534f));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393529a, this.f393530b, this.f393531c, this.f393532d, this.f393533e, Integer.valueOf(this.f393534f)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("Title", this.f393529a, arrayList);
        C143910az.m233947b("SubTitle", this.f393530b, arrayList);
        C143910az.m233947b("Target", this.f393531c, arrayList);
        C143910az.m233947b("DefaultMessageSubject", this.f393532d, arrayList);
        C143910az.m233947b("DefaultMessageBody", this.f393533e, arrayList);
        C143910az.m233947b("Type", Integer.valueOf(this.f393534f), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393529a);
        C143947c.m234106y(parcel, 2, this.f393530b);
        C143947c.m234106y(parcel, 3, this.f393531c);
        C143947c.m234106y(parcel, 4, this.f393532d);
        C143947c.m234106y(parcel, 5, this.f393533e);
        C143947c.m234089h(parcel, 6, this.f393534f);
        C143947c.m234083b(parcel, a);
    }
}
