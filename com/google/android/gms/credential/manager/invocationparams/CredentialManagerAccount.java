package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class CredentialManagerAccount extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144096b();

    /* renamed from: a */
    public final String f390372a;

    public CredentialManagerAccount(String str) {
        this.f390372a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CredentialManagerAccount)) {
            return false;
        }
        return ((CredentialManagerAccount) obj).f390372a.equals(this.f390372a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390372a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f390372a);
        C143947c.m234083b(parcel, a);
    }
}
