package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class Gp3SupportInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145619q();

    /* renamed from: a */
    public Account f393649a;

    private Gp3SupportInfo() {
    }

    public Gp3SupportInfo(Account account) {
        this.f393649a = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Gp3SupportInfo) {
            return C143912ba.m233950b(this.f393649a, ((Gp3SupportInfo) obj).f393649a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393649a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f393649a, i);
        C143947c.m234083b(parcel, a);
    }
}
