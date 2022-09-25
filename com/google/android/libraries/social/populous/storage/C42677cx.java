package com.google.android.libraries.social.populous.storage;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.storage.cx */
/* compiled from: PG */
final class C42677cx {

    /* renamed from: a */
    public final C42685f f111888a;

    /* renamed from: b */
    private final C42681da f111889b;

    public C42677cx(C42681da daVar, C42685f fVar) {
        this.f111889b = daVar;
        this.f111888a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42677cx) {
            C42677cx cxVar = (C42677cx) obj;
            return C58832aw.m90831a(this.f111889b, cxVar.f111889b) && C58832aw.m90831a(this.f111888a, cxVar.f111888a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111889b, this.f111888a});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("contact", this.f111888a);
        b.mo56102b("token", this.f111889b);
        return b.toString();
    }
}
