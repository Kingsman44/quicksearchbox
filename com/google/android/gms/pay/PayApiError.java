package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class PayApiError extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145628z();

    /* renamed from: a */
    public String f393671a;

    /* renamed from: b */
    public String f393672b;

    /* renamed from: c */
    public boolean f393673c;

    /* renamed from: d */
    public byte[] f393674d;

    /* renamed from: e */
    public int f393675e;

    private PayApiError() {
    }

    public PayApiError(String str, String str2, boolean z, byte[] bArr, int i) {
        this.f393671a = str;
        this.f393672b = str2;
        this.f393673c = z;
        this.f393674d = bArr;
        this.f393675e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayApiError) {
            PayApiError payApiError = (PayApiError) obj;
            return C143912ba.m233950b(this.f393671a, payApiError.f393671a) && C143912ba.m233950b(this.f393672b, payApiError.f393672b) && C143912ba.m233950b(Boolean.valueOf(this.f393673c), Boolean.valueOf(payApiError.f393673c)) && Arrays.equals(this.f393674d, payApiError.f393674d) && C143912ba.m233950b(Integer.valueOf(this.f393675e), Integer.valueOf(payApiError.f393675e));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393671a, this.f393672b, Boolean.valueOf(this.f393673c), Integer.valueOf(Arrays.hashCode(this.f393674d)), Integer.valueOf(this.f393675e)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393671a);
        C143947c.m234106y(parcel, 2, this.f393672b);
        C143947c.m234084c(parcel, 3, this.f393673c);
        C143947c.m234094m(parcel, 4, this.f393674d);
        C143947c.m234089h(parcel, 5, this.f393675e);
        C143947c.m234083b(parcel, a);
    }
}
