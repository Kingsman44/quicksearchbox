package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class Transaction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145591al();

    /* renamed from: a */
    public byte[] f393704a;

    /* renamed from: b */
    public long f393705b;

    private Transaction() {
    }

    public Transaction(byte[] bArr, long j) {
        this.f393704a = bArr;
        this.f393705b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Transaction) {
            Transaction transaction = (Transaction) obj;
            return Arrays.equals(this.f393704a, transaction.f393704a) && C143912ba.m233950b(Long.valueOf(this.f393705b), Long.valueOf(transaction.f393705b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f393704a)), Long.valueOf(this.f393705b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f393704a);
        C143947c.m234090i(parcel, 2, this.f393705b);
        C143947c.m234083b(parcel, a);
    }
}
