package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.staticplugins.p8163o.C105854z;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.f */
/* compiled from: PG */
public final class C105811f extends C105854z {

    /* renamed from: b */
    private final C86124t f295185b;

    public C105811f(C89037bh bhVar, C86124t tVar) {
        super(bhVar, tVar);
        this.f295185b = tVar;
    }

    /* renamed from: a */
    public final long mo6622a() {
        return 0;
    }

    /* renamed from: g */
    public final boolean mo6627g(long j, float f, boolean z, long j2) {
        return j >= this.f295185b.mo79743a(C90125fw.f250884A) * 1000;
    }

    /* renamed from: j */
    public final boolean mo6630j(long j, float f) {
        if (j < 15000000) {
            return true;
        }
        return j < this.f295185b.mo79743a(C90125fw.f250891H) * 1000000 && this.f295363a.mo7234a() < 2457600;
    }
}
