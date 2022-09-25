package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class AppRecommendationsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146507g();

    /* renamed from: a */
    public final int f395545a;

    /* renamed from: b */
    public final List f395546b;

    /* renamed from: c */
    public final WebIconParcelable f395547c;

    public AppRecommendationsResponse(int i, List list, WebIconParcelable webIconParcelable) {
        this.f395545a = i;
        this.f395546b = list;
        this.f395547c = webIconParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f395545a);
        C143947c.m234080C(parcel, 2, this.f395546b);
        C143947c.m234105x(parcel, 3, this.f395547c, i);
        C143947c.m234083b(parcel, a);
    }
}
