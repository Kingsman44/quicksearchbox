package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146369j();

    /* renamed from: a */
    PendingIntent f395329a;

    PaymentCardRecognitionIntentResponse() {
    }

    public PaymentCardRecognitionIntentResponse(PendingIntent pendingIntent) {
        this.f395329a = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f395329a, i);
        C143947c.m234083b(parcel, a);
    }
}
