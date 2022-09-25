package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4566l.C60179cq;
import com.google.common.p4552o.p4566l.C60180cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Random;

/* renamed from: com.google.android.libraries.mdi.download.d.e.k */
/* compiled from: PG */
public final class C29044k {

    /* renamed from: a */
    private final C28787cb f78840a;

    /* renamed from: b */
    private final Random f78841b;

    public C29044k(C28787cb cbVar, Random random) {
        this.f78840a = cbVar;
        this.f78841b = random;
    }

    /* renamed from: b */
    public static final boolean m53927b(long j, long j2) {
        return j % j2 == 0;
    }

    /* renamed from: a */
    public final C60870cx mo34558a(long j, C58833ax axVar) {
        if (j == 0) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (j < 0) {
            C29045l.m53935g("Bad sample interval (negative number): %d", Long.valueOf(j));
            return C60856cj.m92900i(C58836b.f156633a);
        } else if (this.f78840a.mo34445y() && axVar.mo56113h()) {
            return C29670b.m54719g(((C29046m) axVar.mo56107c()).mo34552d()).mo34821h(new C29043j(j), C60826bg.f164896a);
        } else {
            if (j == 0 || !m53927b(this.f78841b.nextLong(), j)) {
                return C60856cj.m92900i(C58836b.f156633a);
            }
            C60179cq cqVar = (C60179cq) C60180cr.f162803f.createBuilder();
            cqVar.copyOnWrite();
            C60180cr crVar = (C60180cr) cqVar.instance;
            crVar.f162805a |= 1;
            crVar.f162806b = false;
            return C60856cj.m92900i(C58833ax.m90834k((C60180cr) cqVar.build()));
        }
    }
}
