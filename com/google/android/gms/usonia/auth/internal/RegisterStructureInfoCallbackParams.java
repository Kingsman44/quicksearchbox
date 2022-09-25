package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class RegisterStructureInfoCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146150w();

    /* renamed from: a */
    public C146138k f394861a;

    public RegisterStructureInfoCallbackParams() {
    }

    public RegisterStructureInfoCallbackParams(C146138k kVar) {
        this.f394861a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterStructureInfoCallbackParams) {
            return C143912ba.m233950b(this.f394861a, ((RegisterStructureInfoCallbackParams) obj).f394861a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394861a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234098q(parcel, 1, this.f394861a.asBinder());
        C143947c.m234083b(parcel, a);
    }
}
