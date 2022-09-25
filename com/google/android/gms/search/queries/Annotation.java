package com.google.android.gms.search.queries;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class Annotation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145936d();

    /* renamed from: a */
    public final int f394487a;

    /* renamed from: b */
    public final byte[] f394488b;

    public Annotation(int i, byte[] bArr) {
        this.f394487a = i;
        this.f394488b = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394487a);
        C143947c.m234094m(parcel, 5, this.f394488b);
        C143947c.m234083b(parcel, a);
    }
}
