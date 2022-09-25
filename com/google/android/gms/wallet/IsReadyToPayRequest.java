package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* compiled from: PG */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146348f();

    /* renamed from: a */
    ArrayList f395287a;

    /* renamed from: b */
    String f395288b;

    /* renamed from: c */
    String f395289c;

    /* renamed from: d */
    ArrayList f395290d;

    /* renamed from: e */
    boolean f395291e;

    /* renamed from: f */
    public String f395292f;

    public IsReadyToPayRequest() {
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.f395287a = arrayList;
        this.f395288b = str;
        this.f395289c = str2;
        this.f395290d = arrayList2;
        this.f395291e = z;
        this.f395292f = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234100s(parcel, 2, this.f395287a);
        C143947c.m234106y(parcel, 4, this.f395288b);
        C143947c.m234106y(parcel, 5, this.f395289c);
        C143947c.m234100s(parcel, 6, this.f395290d);
        C143947c.m234084c(parcel, 7, this.f395291e);
        C143947c.m234106y(parcel, 8, this.f395292f);
        C143947c.m234083b(parcel, a);
    }
}
