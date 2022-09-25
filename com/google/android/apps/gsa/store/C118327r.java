package com.google.android.apps.gsa.store;

import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.store.r */
/* compiled from: PG */
public final class C118327r implements C118336y {

    /* renamed from: a */
    public final C58485gu f328453a;

    /* renamed from: b */
    public final int f328454b;

    public C118327r(int i, C58485gu guVar) {
        this.f328454b = i;
        this.f328453a = guVar;
    }

    /* renamed from: a */
    public final C118327r mo103664a(C118327r rVar) {
        return C118328s.m196516h(2, this, rVar);
    }

    /* renamed from: b */
    public final String mo103656b() {
        throw new UnsupportedOperationException("An expression cannot be expanded directly");
    }

    /* renamed from: c */
    public final int mo103659c() {
        return 17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C118327r) {
            C118327r rVar = (C118327r) obj;
            return C58832aw.m90831a(Integer.valueOf(this.f328454b + -1), Integer.valueOf(rVar.f328454b + -1)) && C58832aw.m90831a(this.f328453a, rVar.f328453a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f328454b - 1), this.f328453a});
    }
}
