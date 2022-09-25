package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class RegisterServiceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146257bt();

    /* renamed from: a */
    public String f395040a;

    /* renamed from: b */
    public int f395041b;

    /* renamed from: c */
    public int f395042c;

    /* renamed from: d */
    public C146215ae f395043d;

    public RegisterServiceParams() {
    }

    public RegisterServiceParams(String str, int i, int i2, C146215ae aeVar) {
        this.f395040a = str;
        this.f395041b = i;
        this.f395042c = i2;
        this.f395043d = aeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterServiceParams) {
            RegisterServiceParams registerServiceParams = (RegisterServiceParams) obj;
            return C143912ba.m233950b(this.f395040a, registerServiceParams.f395040a) && C143912ba.m233950b(Integer.valueOf(this.f395041b), Integer.valueOf(registerServiceParams.f395041b)) && C143912ba.m233950b(Integer.valueOf(this.f395042c), Integer.valueOf(registerServiceParams.f395042c)) && C143912ba.m233950b(this.f395043d, registerServiceParams.f395043d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395040a, Integer.valueOf(this.f395041b), Integer.valueOf(this.f395042c), this.f395043d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395040a);
        C143947c.m234089h(parcel, 2, this.f395041b);
        C143947c.m234089h(parcel, 3, this.f395042c);
        C143947c.m234098q(parcel, 4, this.f395043d.asBinder());
        C143947c.m234083b(parcel, a);
    }
}
