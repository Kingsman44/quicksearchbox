package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143963d();

    /* renamed from: a */
    public final PendingIntent f390186a;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.f390186a = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f390186a, i);
        C143947c.m234083b(parcel, a);
    }
}
