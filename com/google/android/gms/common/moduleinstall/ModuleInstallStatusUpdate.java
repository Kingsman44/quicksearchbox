package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143966g();

    /* renamed from: a */
    public final int f390189a;

    /* renamed from: b */
    public final int f390190b;

    /* renamed from: c */
    public final Long f390191c;

    /* renamed from: d */
    public final Long f390192d;

    /* renamed from: e */
    public final int f390193e;

    public ModuleInstallStatusUpdate(int i, int i2, Long l, Long l2, int i3) {
        this.f390189a = i;
        this.f390190b = i2;
        this.f390191c = l;
        this.f390192d = l2;
        this.f390193e = i3;
        if (l != null && l2 != null && l2.longValue() != 0) {
            l.longValue();
            if (l2.longValue() == 0) {
                throw new IllegalArgumentException("Given Long is zero");
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390189a);
        C143947c.m234089h(parcel, 2, this.f390190b);
        C143947c.m234104w(parcel, 3, this.f390191c);
        C143947c.m234104w(parcel, 4, this.f390192d);
        C143947c.m234089h(parcel, 5, this.f390193e);
        C143947c.m234083b(parcel, a);
    }
}
