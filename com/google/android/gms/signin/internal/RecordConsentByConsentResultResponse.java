package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C146000f();

    /* renamed from: a */
    public final List f394683a;

    /* renamed from: b */
    public final String f394684b;

    public RecordConsentByConsentResultResponse(List list, String str) {
        this.f394683a = list;
        this.f394684b = str;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394684b != null ? Status.f389615a : Status.f389619e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234078A(parcel, 1, this.f394683a);
        C143947c.m234106y(parcel, 2, this.f394684b);
        C143947c.m234083b(parcel, a);
    }
}
