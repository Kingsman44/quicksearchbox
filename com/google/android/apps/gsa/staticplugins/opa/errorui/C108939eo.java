package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.eo */
/* compiled from: PG */
final class C108939eo implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = parcel.readInt() == 1;
        Bundle bundle = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
        boolean z3 = parcel.readInt() == 1;
        boolean z4 = parcel.readInt() == 1;
        int readInt2 = parcel.readInt();
        boolean z5 = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        C108940ep k = StartupConfig.m180996k();
        k.mo97301h(readInt);
        k.mo97297d(z2);
        ((C108995p) k).f303079a = bundle;
        k.mo97299f(z3);
        k.mo97300g(z4);
        k.mo97302i(readInt2);
        k.mo97296c(z5);
        k.mo97295b(z);
        return k.mo97294a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StartupConfig[i];
    }
}
