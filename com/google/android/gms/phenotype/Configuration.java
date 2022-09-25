package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new C145700a();

    /* renamed from: a */
    public final int f393976a;

    /* renamed from: b */
    public final Flag[] f393977b;

    /* renamed from: c */
    public final String[] f393978c;

    /* renamed from: d */
    public final Map f393979d = new TreeMap();

    public Configuration(int i, Flag[] flagArr, String[] strArr) {
        this.f393976a = i;
        this.f393977b = flagArr;
        for (Flag flag : flagArr) {
            this.f393979d.put(flag.f394003a, flag);
        }
        this.f393978c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f393976a - ((Configuration) obj).f393976a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            if (this.f393976a != configuration.f393976a || !C145717aa.m236984a(this.f393979d, configuration.f393979d) || !Arrays.equals(this.f393978c, configuration.f393978c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f393976a);
        sb.append(", (");
        for (Flag append : this.f393979d.values()) {
            sb.append(append);
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f393978c;
        if (strArr != null) {
            for (String append2 : strArr) {
                sb.append(append2);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f393976a);
        C143947c.m234079B(parcel, 3, this.f393977b, i);
        C143947c.m234107z(parcel, 4, this.f393978c);
        C143947c.m234083b(parcel, a);
    }
}
