package com.google.android.gms.wallet.firstparty.p10887pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.wallet.firstparty.pm.SecurePaymentsData */
/* compiled from: PG */
public class SecurePaymentsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146363b();

    /* renamed from: a */
    int f395382a;

    /* renamed from: b */
    String f395383b;

    public SecurePaymentsData(int i, String str) {
        this.f395382a = i;
        this.f395383b = str;
        boolean z = true;
        C143919bh.m233960c(i > 0, "SecurePaymentsData.key must be > 0");
        C143919bh.m233960c(str == null ? false : z, "SecurePaymentsData.value must not be null");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395382a);
        C143947c.m234106y(parcel, 3, this.f395383b);
        C143947c.m234083b(parcel, a);
    }
}
