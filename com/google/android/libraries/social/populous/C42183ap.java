package com.google.android.libraries.social.populous;

import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.ap */
/* compiled from: PG */
public final class C42183ap {

    /* renamed from: a */
    private final C58485gu f110490a;

    /* renamed from: b */
    private final boolean f110491b;

    public C42183ap(List list, boolean z) {
        this.f110490a = C58485gu.m89842j(list);
        this.f110491b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42183ap) {
            C42183ap apVar = (C42183ap) obj;
            return this.f110491b == apVar.f110491b && C58832aw.m90831a(this.f110490a, apVar.f110490a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f110490a, Boolean.valueOf(this.f110491b)});
    }
}
