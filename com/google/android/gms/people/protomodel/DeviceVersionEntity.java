package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class DeviceVersionEntity extends AbstractSafeParcelable implements DeviceVersion {
    public static final Parcelable.Creator CREATOR = new C145690c();

    /* renamed from: a */
    public final Integer f393940a;

    public DeviceVersionEntity(Integer num) {
        this.f393940a = num;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final Integer mo121748b() {
        return this.f393940a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeviceVersion)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C143912ba.m233950b(mo121748b(), ((DeviceVersion) obj).mo121748b());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121748b()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234101t(parcel, 2, this.f393940a);
        C143947c.m234083b(parcel, a);
    }
}
