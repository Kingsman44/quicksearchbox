package com.google.android.libraries.social.populous.storage;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.storage.n */
/* compiled from: PG */
public final class C42693n implements Comparable {

    /* renamed from: a */
    public final String f111908a;

    /* renamed from: b */
    public final String f111909b;

    /* renamed from: c */
    public final C42675cv f111910c;

    public C42693n(String str, String str2, C42675cv cvVar) {
        this.f111908a = str;
        this.f111909b = str2;
        this.f111910c = cvVar;
    }

    /* renamed from: a */
    public static C42675cv m75405a(String str) {
        if (str == null) {
            return null;
        }
        return C42675cv.m75372a(str);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C42693n nVar = (C42693n) obj;
        int compareTo = this.f111908a.compareTo(nVar.f111908a);
        return compareTo == 0 ? this.f111909b.compareTo(nVar.f111909b) : compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42693n) {
            C42693n nVar = (C42693n) obj;
            return this.f111908a.equals(nVar.f111908a) && C58832aw.m90831a(this.f111909b, nVar.f111909b) && C58832aw.m90831a(this.f111910c, nVar.f111910c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111908a, this.f111909b, this.f111910c});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("candidateId", this.f111908a);
        b.mo56102b("value", this.f111909b);
        b.mo56102b("sourceType", this.f111910c);
        return b.toString();
    }
}
