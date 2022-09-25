package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143965f();

    /* renamed from: a */
    public final int f390187a;

    /* renamed from: b */
    public final boolean f390188b;

    public ModuleInstallResponse(int i, boolean z) {
        this.f390187a = i;
        this.f390188b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390187a);
        C143947c.m234084c(parcel, 2, this.f390188b);
        C143947c.m234083b(parcel, a);
    }
}
