package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetTransitCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145616n();

    /* renamed from: a */
    public TransitCard[] f393642a;

    /* renamed from: b */
    public Bitmap f393643b;

    /* renamed from: c */
    public Bitmap f393644c;

    private GetTransitCardsResponse() {
    }

    public GetTransitCardsResponse(TransitCard[] transitCardArr, Bitmap bitmap, Bitmap bitmap2) {
        this.f393642a = transitCardArr;
        this.f393643b = bitmap;
        this.f393644c = bitmap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetTransitCardsResponse) {
            GetTransitCardsResponse getTransitCardsResponse = (GetTransitCardsResponse) obj;
            return Arrays.equals(this.f393642a, getTransitCardsResponse.f393642a) && C143912ba.m233950b(this.f393643b, getTransitCardsResponse.f393643b) && C143912ba.m233950b(this.f393644c, getTransitCardsResponse.f393644c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f393642a)), this.f393643b, this.f393644c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 1, this.f393642a, i);
        C143947c.m234105x(parcel, 2, this.f393643b, i);
        C143947c.m234105x(parcel, 3, this.f393644c, i);
        C143947c.m234083b(parcel, a);
    }
}
