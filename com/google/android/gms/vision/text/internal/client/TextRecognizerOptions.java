package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class TextRecognizerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146333h();

    /* renamed from: a */
    public final String f395248a;

    public TextRecognizerOptions() {
        this.f395248a = null;
    }

    public TextRecognizerOptions(String str) {
        this.f395248a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395248a);
        C143947c.m234083b(parcel, a);
    }
}
