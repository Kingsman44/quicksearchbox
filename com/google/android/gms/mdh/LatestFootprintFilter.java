package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class LatestFootprintFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145025b();

    /* renamed from: b */
    private static final byte[] f392018b;

    /* renamed from: a */
    public final List f392019a;

    static {
        byte[] bArr = new byte[0];
        f392018b = bArr;
        ArrayList arrayList = new ArrayList();
        C145024a.m235681b(bArr, 2, arrayList);
        C145024a.m235680a(arrayList);
        C145024a.m235680a(new ArrayList());
    }

    public LatestFootprintFilter(List list) {
        this.f392019a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C143912ba.m233950b(this.f392019a, ((LatestFootprintFilter) obj).f392019a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f392019a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f392019a);
        C143947c.m234083b(parcel, a);
    }
}
