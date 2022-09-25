package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public final class ClientLanguageSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144436a();

    /* renamed from: a */
    public final List f391044a;

    public ClientLanguageSettings(List list) {
        this.f391044a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234078A(parcel, 1, this.f391044a);
        C143947c.m234083b(parcel, a);
    }
}
