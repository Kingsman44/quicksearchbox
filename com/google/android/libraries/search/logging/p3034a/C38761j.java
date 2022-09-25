package com.google.android.libraries.search.logging.p3034a;

import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.clearcut.C143673z;
import com.google.android.gms.common.util.C144006f;
import com.google.common.base.C58817ah;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.logging.a.j */
/* compiled from: PG */
public final /* synthetic */ class C38761j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C38763l f102328a;

    /* renamed from: b */
    public final /* synthetic */ Set f102329b;

    public /* synthetic */ C38761j(C38763l lVar, Set set) {
        this.f102328a = lVar;
        this.f102329b = set;
    }

    public final Object apply(Object obj) {
        C38763l lVar = this.f102328a;
        Set set = this.f102329b;
        C143658k kVar = (C143658k) obj;
        C143673z zVar = new C143673z(kVar, "ANDROID_GSA_COUNTERS", 100, C144006f.f390244a);
        zVar.mo119026j(lVar.f102331a, (int) TimeUnit.MINUTES.toMillis(5));
        if (!set.isEmpty()) {
            kVar.mo119001h(new C38762k(set));
        }
        return zVar;
    }
}
