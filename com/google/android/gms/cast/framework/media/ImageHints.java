package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ImageHints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143506h();

    /* renamed from: a */
    public final int f389037a;

    /* renamed from: b */
    public final int f389038b;

    /* renamed from: c */
    public final int f389039c;

    public ImageHints(int i, int i2, int i3) {
        this.f389037a = i;
        this.f389038b = i2;
        this.f389039c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f389037a);
        C143947c.m234089h(parcel, 3, this.f389038b);
        C143947c.m234089h(parcel, 4, this.f389039c);
        C143947c.m234083b(parcel, a);
    }
}
