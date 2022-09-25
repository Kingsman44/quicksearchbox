package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class OnStructureInfoUpdatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146149v();

    /* renamed from: a */
    public TrustedId[] f394860a;

    private OnStructureInfoUpdatedParams() {
    }

    public OnStructureInfoUpdatedParams(TrustedId[] trustedIdArr) {
        this.f394860a = trustedIdArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnStructureInfoUpdatedParams) {
            return Arrays.equals(this.f394860a, ((OnStructureInfoUpdatedParams) obj).f394860a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f394860a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 1, this.f394860a, i);
        C143947c.m234083b(parcel, a);
    }
}
