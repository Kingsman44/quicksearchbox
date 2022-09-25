package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
public class Configurations extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145724b();

    /* renamed from: a */
    public final String f393980a;

    /* renamed from: b */
    public final byte[] f393981b;

    /* renamed from: c */
    public final String f393982c;

    /* renamed from: d */
    public final Configuration[] f393983d;

    /* renamed from: e */
    public final Map f393984e = new TreeMap();

    /* renamed from: f */
    public final boolean f393985f;

    /* renamed from: g */
    public final long f393986g;

    public Configurations(String str, String str2, Configuration[] configurationArr, boolean z, byte[] bArr, long j) {
        this.f393980a = str;
        this.f393982c = str2;
        this.f393983d = configurationArr;
        this.f393985f = z;
        this.f393981b = bArr;
        this.f393986g = j;
        for (Configuration configuration : configurationArr) {
            this.f393984e.put(Integer.valueOf(configuration.f393976a), configuration);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configurations) {
            Configurations configurations = (Configurations) obj;
            if (!C145717aa.m236984a(this.f393980a, configurations.f393980a) || !C145717aa.m236984a(this.f393982c, configurations.f393982c) || !this.f393984e.equals(configurations.f393984e) || this.f393985f != configurations.f393985f || !Arrays.equals(this.f393981b, configurations.f393981b) || this.f393986g != configurations.f393986g) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393980a, this.f393982c, this.f393984e, Boolean.valueOf(this.f393985f), this.f393981b, Long.valueOf(this.f393986g)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f393980a);
        sb.append("', '");
        sb.append(this.f393982c);
        sb.append("', (");
        for (Configuration append : this.f393984e.values()) {
            sb.append(append);
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f393985f);
        sb.append(", ");
        byte[] bArr = this.f393981b;
        if (bArr == null) {
            str = "null";
        } else {
            str = Base64.encodeToString(bArr, 3);
        }
        sb.append(str);
        sb.append(", ");
        sb.append(this.f393986g);
        sb.append(')');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f393980a);
        C143947c.m234106y(parcel, 3, this.f393982c);
        C143947c.m234079B(parcel, 4, this.f393983d, i);
        C143947c.m234084c(parcel, 5, this.f393985f);
        C143947c.m234094m(parcel, 6, this.f393981b);
        C143947c.m234090i(parcel, 7, this.f393986g);
        C143947c.m234083b(parcel, a);
    }
}
