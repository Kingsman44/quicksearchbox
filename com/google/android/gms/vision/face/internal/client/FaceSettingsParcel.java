package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class FaceSettingsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146314d();

    /* renamed from: a */
    public int f395201a;

    /* renamed from: b */
    public int f395202b;

    /* renamed from: c */
    public int f395203c;

    /* renamed from: d */
    public boolean f395204d;

    /* renamed from: e */
    public boolean f395205e;

    /* renamed from: f */
    public float f395206f;

    public FaceSettingsParcel() {
    }

    public FaceSettingsParcel(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.f395201a = i;
        this.f395202b = i2;
        this.f395203c = i3;
        this.f395204d = z;
        this.f395205e = z2;
        this.f395206f = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395201a);
        C143947c.m234089h(parcel, 3, this.f395202b);
        C143947c.m234089h(parcel, 4, this.f395203c);
        C143947c.m234084c(parcel, 5, this.f395204d);
        C143947c.m234084c(parcel, 6, this.f395205e);
        C143947c.m234087f(parcel, 7, this.f395206f);
        C143947c.m234083b(parcel, a);
    }
}
