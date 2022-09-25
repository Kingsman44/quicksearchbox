package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SePrepaidCardId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145585af();

    /* renamed from: a */
    public SeServiceProvider f393693a;

    /* renamed from: b */
    public String f393694b;

    private SePrepaidCardId() {
    }

    public SePrepaidCardId(SeServiceProvider seServiceProvider, String str) {
        this.f393693a = seServiceProvider;
        this.f393694b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SePrepaidCardId) {
            SePrepaidCardId sePrepaidCardId = (SePrepaidCardId) obj;
            return C143912ba.m233950b(this.f393693a, sePrepaidCardId.f393693a) && C143912ba.m233950b(this.f393694b, sePrepaidCardId.f393694b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393693a, this.f393694b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393693a, i);
        C143947c.m234106y(parcel, 2, this.f393694b);
        C143947c.m234083b(parcel, a);
    }
}
