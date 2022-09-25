package com.google.android.libraries.social.populous.storage;

import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.storage.f */
/* compiled from: PG */
public final class C42685f implements Comparable {

    /* renamed from: a */
    public final long f111901a;

    /* renamed from: b */
    public final double f111902b;

    /* renamed from: c */
    public final C42309ch f111903c;

    /* renamed from: d */
    public final C63088z f111904d;

    /* renamed from: e */
    public final transient List f111905e = new ArrayList();

    public C42685f(long j, double d, C42309ch chVar, C63088z zVar) {
        this.f111901a = j;
        this.f111902b = d;
        this.f111903c = chVar;
        this.f111904d = zVar;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C42685f fVar = (C42685f) obj;
        int compare = Double.compare(fVar.f111902b, this.f111902b);
        return compare == 0 ? (this.f111901a > fVar.f111901a ? 1 : (this.f111901a == fVar.f111901a ? 0 : -1)) : compare;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42685f) {
            C42685f fVar = (C42685f) obj;
            return this.f111901a == fVar.f111901a && C58832aw.m90831a(this.f111904d, fVar.f111904d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f111901a), this.f111904d});
    }

    public final String toString() {
        Object obj;
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("id", String.valueOf(this.f111901a));
        b.mo56103c("affinity", String.valueOf(this.f111902b));
        b.mo56102b("type", this.f111903c);
        C63088z zVar = this.f111904d;
        if (zVar == null) {
            obj = "null";
        } else {
            obj = zVar.mo59174N();
        }
        b.mo56102b("protoBytes", obj);
        return b.toString();
    }
}
