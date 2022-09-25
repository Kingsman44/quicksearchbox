package com.google.android.libraries.social.populous.storage;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.storage.cy */
/* compiled from: PG */
final class C42678cy {

    /* renamed from: a */
    public final C42689j f111890a;

    /* renamed from: b */
    private final C42693n f111891b;

    public C42678cy(C42693n nVar, C42689j jVar) {
        this.f111891b = nVar;
        this.f111890a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42678cy) {
            C42678cy cyVar = (C42678cy) obj;
            return C58832aw.m90831a(this.f111891b, cyVar.f111891b) && C58832aw.m90831a(this.f111890a, cyVar.f111890a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111891b, this.f111890a});
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("candidate", this.f111890a);
        b.mo56102b("token", this.f111891b);
        return b.toString();
    }
}
