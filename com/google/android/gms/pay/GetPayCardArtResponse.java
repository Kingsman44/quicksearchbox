package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetPayCardArtResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145611i();

    /* renamed from: a */
    public PayCardArt[] f393634a;

    private GetPayCardArtResponse() {
    }

    public GetPayCardArtResponse(PayCardArt[] payCardArtArr) {
        this.f393634a = payCardArtArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPayCardArtResponse) {
            return Arrays.equals(this.f393634a, ((GetPayCardArtResponse) obj).f393634a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f393634a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 2, this.f393634a, i);
        C143947c.m234083b(parcel, a);
    }
}
