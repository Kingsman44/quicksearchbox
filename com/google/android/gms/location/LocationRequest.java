package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C144018r;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.p10842a.C144869a;
import com.google.common.p4535g.C59203do;
import java.util.Arrays;

/* compiled from: PG */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new LocationRequestCreator();

    /* renamed from: a */
    public int f391766a;

    /* renamed from: b */
    public long f391767b;

    /* renamed from: c */
    public long f391768c;

    /* renamed from: d */
    public long f391769d;

    /* renamed from: e */
    public long f391770e;

    /* renamed from: f */
    public int f391771f;

    /* renamed from: g */
    public float f391772g;

    /* renamed from: h */
    public boolean f391773h;

    /* renamed from: i */
    public long f391774i;

    /* renamed from: j */
    public final int f391775j;

    /* renamed from: k */
    public final int f391776k;

    /* renamed from: l */
    public final String f391777l;

    /* renamed from: m */
    public final boolean f391778m;

    /* renamed from: n */
    public final WorkSource f391779n;

    /* renamed from: o */
    public final ClientIdentity f391780o;

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationRequest() {
        /*
            r23 = this;
            r0 = r23
            android.os.WorkSource r1 = new android.os.WorkSource
            r21 = r1
            r1.<init>()
            r1 = 102(0x66, float:1.43E-43)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            r4 = 600000(0x927c0, double:2.964394E-318)
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 1
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.<init>():void");
    }

    /* renamed from: d */
    private static String m235453d(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        synchronized (C144869a.f391808a) {
            C144869a.f391808a.setLength(0);
            C144869a.m235460a(j, C144869a.f391808a);
            sb = C144869a.f391808a.toString();
        }
        return sb;
    }

    /* renamed from: a */
    public final boolean mo120339a() {
        long j = this.f391769d;
        return j > 0 && (j >> 1) >= this.f391767b;
    }

    /* renamed from: b */
    public final boolean mo120340b() {
        return this.f391766a == 105;
    }

    @Deprecated
    /* renamed from: c */
    public final void mo120341c(long j) {
        C143919bh.m233960c(j > 0, "durationMillis must be greater than 0");
        this.f391770e = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f391766a == locationRequest.f391766a && ((mo120340b() || this.f391767b == locationRequest.f391767b) && this.f391768c == locationRequest.f391768c && mo120339a() == locationRequest.mo120339a() && ((!mo120339a() || this.f391769d == locationRequest.f391769d) && this.f391770e == locationRequest.f391770e && this.f391771f == locationRequest.f391771f && this.f391772g == locationRequest.f391772g && this.f391773h == locationRequest.f391773h && this.f391775j == locationRequest.f391775j && this.f391776k == locationRequest.f391776k && this.f391778m == locationRequest.f391778m && this.f391779n.equals(locationRequest.f391779n) && C143912ba.m233950b(this.f391777l, locationRequest.f391777l) && C143912ba.m233950b(this.f391780o, locationRequest.f391780o)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391766a), Long.valueOf(this.f391767b), Long.valueOf(this.f391768c), this.f391779n});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (mo120340b()) {
            sb.append(C144901be.m235499a(this.f391766a));
        } else {
            sb.append("@");
            if (mo120339a()) {
                C144869a.m235460a(this.f391767b, sb);
                sb.append("/");
                C144869a.m235460a(this.f391769d, sb);
            } else {
                C144869a.m235460a(this.f391767b, sb);
            }
            sb.append(" ");
            sb.append(C144901be.m235499a(this.f391766a));
        }
        if (mo120340b() || this.f391768c != this.f391767b) {
            sb.append(", minUpdateInterval=");
            sb.append(m235453d(this.f391768c));
        }
        if (((double) this.f391772g) > C59203do.f157270a) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f391772g);
        }
        if (!mo120340b() ? this.f391774i != this.f391767b : this.f391774i != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(m235453d(this.f391774i));
        }
        if (this.f391770e != Long.MAX_VALUE) {
            sb.append(", duration=");
            C144869a.m235460a(this.f391770e, sb);
        }
        if (this.f391771f != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f391771f);
        }
        if (this.f391776k != 0) {
            sb.append(", ");
            sb.append(C144902bf.m235501a(this.f391776k));
        }
        if (this.f391775j != 0) {
            sb.append(", ");
            sb.append(C144879aj.m235476a(this.f391775j));
        }
        if (this.f391773h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.f391778m) {
            sb.append(", bypass");
        }
        if (this.f391777l != null) {
            sb.append(", moduleId=");
            sb.append(this.f391777l);
        }
        if (!C144018r.m234198a(this.f391779n)) {
            sb.append(", ");
            sb.append(this.f391779n);
        }
        if (this.f391780o != null) {
            sb.append(", impersonation=");
            sb.append(this.f391780o);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        LocationRequestCreator.writeToParcel(this, parcel, i);
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, String str, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.f391766a = i;
        long j7 = j;
        this.f391767b = j7;
        this.f391768c = j2;
        this.f391769d = j3;
        this.f391770e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1, j4 - SystemClock.elapsedRealtime()), j5);
        this.f391771f = i2;
        this.f391772g = f;
        this.f391773h = z;
        this.f391774i = j6 != -1 ? j6 : j7;
        this.f391775j = i3;
        this.f391776k = i4;
        this.f391777l = str;
        this.f391778m = z2;
        this.f391779n = workSource;
        this.f391780o = clientIdentity;
    }
}
