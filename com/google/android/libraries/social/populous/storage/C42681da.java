package com.google.android.libraries.social.populous.storage;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.storage.da */
/* compiled from: PG */
public final class C42681da implements Comparable {

    /* renamed from: a */
    public long f111896a;

    /* renamed from: b */
    public final String f111897b;

    /* renamed from: c */
    public final double f111898c;

    /* renamed from: d */
    public final C42675cv f111899d;

    public C42681da(long j, String str, double d, C42675cv cvVar) {
        this.f111896a = j;
        this.f111897b = str;
        this.f111898c = d;
        this.f111899d = cvVar;
    }

    /* renamed from: a */
    public static C42675cv m75376a(String str) {
        if (str == null) {
            return null;
        }
        return C42675cv.m75372a(str);
    }

    /* renamed from: b */
    public static String m75377b(C42675cv cvVar) {
        if (cvVar == null) {
            return null;
        }
        return cvVar.name();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C42681da daVar = (C42681da) obj;
        int compare = Double.compare(daVar.f111898c, this.f111898c);
        if (compare == 0) {
            compare = (this.f111896a > daVar.f111896a ? 1 : (this.f111896a == daVar.f111896a ? 0 : -1));
        }
        return compare == 0 ? this.f111897b.compareTo(daVar.f111897b) : compare;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42681da) {
            C42681da daVar = (C42681da) obj;
            return this.f111896a == daVar.f111896a && C58832aw.m90831a(this.f111897b, daVar.f111897b) && Double.doubleToLongBits(this.f111898c) == Double.doubleToLongBits(daVar.f111898c) && C58832aw.m90831a(this.f111899d, daVar.f111899d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f111896a), this.f111897b, Double.valueOf(this.f111898c), this.f111899d});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("contactId", String.valueOf(this.f111896a));
        b.mo56102b("value", this.f111897b);
        b.mo56103c("affinity", String.valueOf(this.f111898c));
        b.mo56102b("sourceType", this.f111899d);
        return b.toString();
    }
}
