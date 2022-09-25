package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class RecognitionOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146330e();

    /* renamed from: a */
    public final Rect f395247a;

    public RecognitionOptions() {
        this.f395247a = new Rect();
    }

    public RecognitionOptions(Rect rect) {
        this.f395247a = rect;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f395247a, i);
        C143947c.m234083b(parcel, a);
    }
}
