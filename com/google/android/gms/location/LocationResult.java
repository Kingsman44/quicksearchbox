package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C144891av();

    /* renamed from: a */
    static final List f391781a = Collections.emptyList();

    /* renamed from: b */
    public final List f391782b;

    public LocationResult(List list) {
        this.f391782b = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L_0x008c
            com.google.android.gms.location.LocationResult r10 = (com.google.android.gms.location.LocationResult) r10
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0016
            java.util.List r0 = r9.f391782b
            java.util.List r10 = r10.f391782b
            boolean r10 = r0.equals(r10)
            return r10
        L_0x0016:
            java.util.List r0 = r9.f391782b
            int r0 = r0.size()
            java.util.List r2 = r10.f391782b
            int r2 = r2.size()
            if (r0 == r2) goto L_0x0025
            return r1
        L_0x0025:
            java.util.List r0 = r9.f391782b
            java.util.Iterator r0 = r0.iterator()
            java.util.List r10 = r10.f391782b
            java.util.Iterator r10 = r10.iterator()
        L_0x0031:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r10.next()
            android.location.Location r3 = (android.location.Location) r3
            double r4 = r2.getLatitude()
            double r6 = r3.getLatitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0052
            return r1
        L_0x0052:
            double r4 = r2.getLongitude()
            double r6 = r3.getLongitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0061
            return r1
        L_0x0061:
            long r4 = r2.getTime()
            long r6 = r3.getTime()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x006e
            return r1
        L_0x006e:
            long r4 = r2.getElapsedRealtimeNanos()
            long r6 = r3.getElapsedRealtimeNanos()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x007b
            return r1
        L_0x007b:
            java.lang.String r2 = r2.getProvider()
            java.lang.String r3 = r3.getProvider()
            boolean r2 = com.google.android.gms.common.internal.C143912ba.m233950b(r2, r3)
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x008a:
            r10 = 1
            return r10
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f391782b});
    }

    public final String toString() {
        return "LocationResult".concat(String.valueOf(String.valueOf(this.f391782b)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f391782b);
        C143947c.m234083b(parcel, a);
    }
}
