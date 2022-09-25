package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146106r();

    /* renamed from: a */
    public int f394797a;

    /* renamed from: b */
    public boolean f394798b;

    /* renamed from: c */
    public final List f394799c;

    /* renamed from: d */
    public int f394800d;

    /* renamed from: e */
    public String f394801e;

    /* renamed from: f */
    public boolean f394802f;

    public UsageReportingOptInOptions(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.f394799c = arrayList;
        this.f394797a = i;
        this.f394798b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f394800d = i2;
        this.f394801e = str;
        this.f394802f = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f394797a);
        C143947c.m234084c(parcel, 3, this.f394798b);
        C143947c.m234078A(parcel, 4, this.f394799c);
        C143947c.m234089h(parcel, 5, this.f394800d);
        C143947c.m234106y(parcel, 6, this.f394801e);
        C143947c.m234084c(parcel, 7, this.f394802f);
        C143947c.m234083b(parcel, a);
    }
}
