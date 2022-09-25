package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class AnnotateCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145928b();

    /* renamed from: a */
    public final String f394480a;

    /* renamed from: b */
    public final String f394481b;

    /* renamed from: c */
    public final int[] f394482c;

    /* renamed from: d */
    public Bundle f394483d;

    public AnnotateCall$Request(String str, String str2, int[] iArr, Bundle bundle) {
        this.f394480a = str;
        this.f394481b = str2;
        this.f394482c = iArr;
        this.f394483d = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394480a);
        C143947c.m234106y(parcel, 2, this.f394481b);
        C143947c.m234099r(parcel, 3, this.f394482c);
        C143947c.m234093l(parcel, 4, this.f394483d);
        C143947c.m234083b(parcel, a);
    }
}
