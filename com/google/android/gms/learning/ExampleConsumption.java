package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.base.C58837ba;
import java.util.Arrays;

/* compiled from: PG */
public class ExampleConsumption extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144579c();

    /* renamed from: a */
    public final String f391066a;

    /* renamed from: b */
    public final byte[] f391067b;

    /* renamed from: c */
    public final int f391068c;

    /* renamed from: d */
    public final byte[] f391069d;

    public ExampleConsumption(String str, byte[] bArr, int i, byte[] bArr2) {
        boolean z = false;
        if (!C58837ba.m90859h(str) && bArr != null) {
            z = true;
        }
        C143919bh.m233960c(z, "Collection name cannot be null or empty. Selection criteria cannot be null.");
        this.f391066a = str;
        this.f391067b = bArr;
        this.f391068c = i;
        this.f391069d = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExampleConsumption)) {
            return false;
        }
        ExampleConsumption exampleConsumption = (ExampleConsumption) obj;
        return this.f391066a.equals(exampleConsumption.f391066a) && Arrays.equals(this.f391067b, exampleConsumption.f391067b) && this.f391068c == exampleConsumption.f391068c && Arrays.equals(this.f391069d, exampleConsumption.f391069d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f391066a, Integer.valueOf(Arrays.hashCode(this.f391067b)), Integer.valueOf(this.f391068c), Integer.valueOf(Arrays.hashCode(this.f391069d))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f391066a);
        C143947c.m234094m(parcel, 2, this.f391067b);
        C143947c.m234089h(parcel, 3, this.f391068c);
        C143947c.m234094m(parcel, 4, this.f391069d);
        C143947c.m234083b(parcel, a);
    }
}
