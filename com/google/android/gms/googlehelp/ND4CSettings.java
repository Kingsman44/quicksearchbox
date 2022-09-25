package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ND4CSettings extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C144333k();

    /* renamed from: a */
    boolean f390783a;

    /* renamed from: b */
    String f390784b;

    public ND4CSettings() {
        this(true, BuildConfig.FLAVOR);
    }

    public ND4CSettings(boolean z, String str) {
        this.f390783a = z;
        this.f390784b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 2, this.f390783a);
        C143947c.m234106y(parcel, 3, this.f390784b);
        C143947c.m234083b(parcel, a);
    }
}
