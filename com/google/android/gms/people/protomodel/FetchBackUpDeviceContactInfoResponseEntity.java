package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse {
    public static final Parcelable.Creator CREATOR = new C145692e();

    /* renamed from: a */
    private final List f393943a;

    /* renamed from: b */
    private List f393944b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.f393943a = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final List mo121757b() {
        List list;
        if (this.f393944b == null && (list = this.f393943a) != null) {
            this.f393944b = new ArrayList(list.size());
            for (BackedUpContactsPerDevice add : this.f393943a) {
                this.f393944b.add(add);
            }
        }
        return this.f393944b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponse)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C143912ba.m233950b(mo121757b(), ((FetchBackUpDeviceContactInfoResponse) obj).mo121757b());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121757b()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 2, mo121757b());
        C143947c.m234083b(parcel, a);
    }
}
