package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class DeleteUsageReportCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145879c();

    /* renamed from: a */
    public String f394407a;

    /* renamed from: b */
    public String f394408b;

    /* renamed from: c */
    public String f394409c;

    public DeleteUsageReportCall$Request() {
    }

    public DeleteUsageReportCall$Request(String str, String str2, String str3) {
        this.f394407a = str;
        this.f394408b = str2;
        this.f394409c = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394407a);
        C143947c.m234106y(parcel, 2, this.f394408b);
        C143947c.m234106y(parcel, 3, this.f394409c);
        C143947c.m234083b(parcel, a);
    }
}
