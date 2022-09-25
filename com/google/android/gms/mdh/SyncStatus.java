package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145032i();

    /* renamed from: a */
    public final long f392038a;

    /* renamed from: b */
    public final long f392039b;

    /* renamed from: c */
    public final long f392040c;

    public SyncStatus(long j, long j2, long j3) {
        this.f392038a = j;
        this.f392039b = j2;
        this.f392040c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncStatus syncStatus = (SyncStatus) obj;
            return C143912ba.m233950b(Long.valueOf(this.f392038a), Long.valueOf(syncStatus.f392038a)) && C143912ba.m233950b(Long.valueOf(this.f392039b), Long.valueOf(syncStatus.f392039b)) && C143912ba.m233950b(Long.valueOf(this.f392040c), Long.valueOf(syncStatus.f392040c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f392038a), Long.valueOf(this.f392039b), Long.valueOf(this.f392040c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f392038a);
        C143947c.m234090i(parcel, 2, this.f392039b);
        C143947c.m234090i(parcel, 3, this.f392040c);
        C143947c.m234083b(parcel, a);
    }
}
