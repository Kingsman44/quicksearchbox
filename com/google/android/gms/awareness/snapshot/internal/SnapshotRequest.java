package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class SnapshotRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142948k();

    /* renamed from: a */
    public final int f387859a;

    /* renamed from: b */
    public final ArrayList f387860b;

    /* renamed from: c */
    public final int f387861c;

    public SnapshotRequest() {
        this.f387859a = 10007;
        this.f387860b = null;
        this.f387861c = 0;
    }

    public SnapshotRequest(int i, ArrayList arrayList, int i2) {
        this.f387859a = i;
        this.f387860b = arrayList;
        this.f387861c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapshotRequest)) {
            return false;
        }
        SnapshotRequest snapshotRequest = (SnapshotRequest) obj;
        if (this.f387861c != snapshotRequest.f387861c || this.f387859a != snapshotRequest.f387859a) {
            return false;
        }
        ArrayList arrayList = snapshotRequest.f387860b;
        ArrayList arrayList2 = this.f387860b;
        if ((arrayList2 == null) ^ (arrayList == null)) {
            return false;
        }
        if (arrayList2 != null) {
            if (arrayList2.size() != arrayList.size()) {
                return false;
            }
            ArrayList arrayList3 = this.f387860b;
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!arrayList.contains((BeaconStateImpl.TypeFilterImpl) arrayList3.get(i))) {
                    return false;
                }
                i = i2;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        ArrayList arrayList = this.f387860b;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((BeaconStateImpl.TypeFilterImpl) arrayList.get(i2)).hashCode() * 13;
            }
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f387859a), Integer.valueOf(i), Integer.valueOf(this.f387861c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f387859a);
        C143947c.m234080C(parcel, 3, this.f387860b);
        C143947c.m234089h(parcel, 4, this.f387861c);
        C143947c.m234083b(parcel, a);
    }
}
