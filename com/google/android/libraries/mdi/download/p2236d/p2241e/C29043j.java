package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29400ex;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4566l.C60179cq;
import com.google.common.p4552o.p4566l.C60180cr;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.libraries.mdi.download.d.e.j */
/* compiled from: PG */
public final /* synthetic */ class C29043j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f78839a;

    public /* synthetic */ C29043j(long j) {
        this.f78839a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f78839a;
        C29400ex exVar = (C29400ex) obj;
        boolean z = 100 % j != 0;
        if (z) {
            C29045l.m53935g("Bad sample interval (1 percent cohort will not log): %d", Long.valueOf(j));
        }
        if (!C29044k.m53927b(exVar.f79709b, j)) {
            return C58836b.f156633a;
        }
        C60179cq cqVar = (C60179cq) C60180cr.f162803f.createBuilder();
        cqVar.copyOnWrite();
        C60180cr crVar = (C60180cr) cqVar.instance;
        crVar.f162805a |= 1;
        crVar.f162806b = true;
        C63042fg fgVar = exVar.f79710c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        long c = C62953e.m95478c(fgVar);
        cqVar.copyOnWrite();
        C60180cr crVar2 = (C60180cr) cqVar.instance;
        crVar2.f162805a |= 2;
        crVar2.f162807c = c;
        boolean b = C29044k.m53927b(exVar.f79709b, 100);
        cqVar.copyOnWrite();
        C60180cr crVar3 = (C60180cr) cqVar.instance;
        crVar3.f162805a |= 4;
        crVar3.f162808d = b;
        cqVar.copyOnWrite();
        C60180cr crVar4 = (C60180cr) cqVar.instance;
        crVar4.f162805a |= 8;
        crVar4.f162809e = z;
        return C58833ax.m90834k((C60180cr) cqVar.build());
    }
}
