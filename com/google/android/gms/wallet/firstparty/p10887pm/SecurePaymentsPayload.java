package com.google.android.gms.wallet.firstparty.p10887pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload */
/* compiled from: PG */
public class SecurePaymentsPayload extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C146364c();

    /* renamed from: a */
    byte[] f395384a;

    /* renamed from: b */
    SecurePaymentsData[] f395385b;

    public SecurePaymentsPayload(byte[] bArr, SecurePaymentsData[] securePaymentsDataArr) {
        this.f395384a = bArr;
        this.f395385b = securePaymentsDataArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 2, this.f395384a);
        C143947c.m234079B(parcel, 3, this.f395385b, i);
        C143947c.m234083b(parcel, a);
    }
}
