package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C144908g();

    /* renamed from: a */
    List f391724a;

    /* renamed from: b */
    long f391725b;

    /* renamed from: c */
    long f391726c;

    /* renamed from: d */
    int f391727d;

    /* renamed from: e */
    Bundle f391728e;

    public ActivityRecognitionResult(List list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        C143919bh.m233960c(list != null && list.size() > 0, "Must have at least 1 detected activity");
        C143919bh.m233960c((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.f391724a = list;
        this.f391725b = j;
        this.f391726c = j2;
        this.f391727d = i;
        this.f391728e = bundle;
    }

    /* renamed from: a */
    private static boolean m235450a(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!m235450a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                    int i = 0;
                    while (i < length) {
                        if (C143912ba.m233950b(Array.get(obj, i), Array.get(obj2, i))) {
                            i++;
                        }
                    }
                    continue;
                }
                return false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f391725b == activityRecognitionResult.f391725b && this.f391726c == activityRecognitionResult.f391726c && this.f391727d == activityRecognitionResult.f391727d && C143912ba.m233950b(this.f391724a, activityRecognitionResult.f391724a) && m235450a(this.f391728e, activityRecognitionResult.f391728e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f391725b), Long.valueOf(this.f391726c), Integer.valueOf(this.f391727d), this.f391724a, this.f391728e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f391724a);
        long j = this.f391725b;
        long j2 = this.f391726c;
        return "ActivityRecognitionResult [probableActivities=" + valueOf + ", timeMillis=" + j + ", elapsedRealtimeMillis=" + j2 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f391724a);
        C143947c.m234090i(parcel, 2, this.f391725b);
        C143947c.m234090i(parcel, 3, this.f391726c);
        C143947c.m234089h(parcel, 4, this.f391727d);
        C143947c.m234093l(parcel, 5, this.f391728e);
        C143947c.m234083b(parcel, a);
    }
}
