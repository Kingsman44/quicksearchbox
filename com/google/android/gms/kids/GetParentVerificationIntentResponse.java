package com.google.android.gms.kids;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetParentVerificationIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144431c();

    /* renamed from: a */
    public PendingIntent f391026a;

    private GetParentVerificationIntentResponse() {
    }

    public GetParentVerificationIntentResponse(PendingIntent pendingIntent) {
        this.f391026a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetParentVerificationIntentResponse) {
            return C143912ba.m233950b(this.f391026a, ((GetParentVerificationIntentResponse) obj).f391026a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f391026a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f391026a, i);
        C143947c.m234083b(parcel, a);
    }
}
