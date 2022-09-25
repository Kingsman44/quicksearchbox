package com.google.android.libraries.social.populous.p3296e;

import com.google.android.libraries.social.populous.core.C42313cl;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55817b;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55856r;
import com.google.p4181bi.C55858t;

/* renamed from: com.google.android.libraries.social.populous.e.r */
/* compiled from: PG */
public final class C42553r {
    /* renamed from: a */
    public static double m75010a(C42405ab abVar) {
        C55815ay ayVar;
        C58838bb.m90868c(abVar.mo45410l());
        C55847i iVar = (C55847i) abVar.f111226a.mo56107c();
        if (iVar.f147360a == 1) {
            ayVar = (C55815ay) iVar.f147361b;
        } else {
            ayVar = C55815ay.f147275f;
        }
        C55856r rVar = (C55856r) ayVar.f147279c.get(0);
        C58833ax d = abVar.mo45402d(rVar);
        if (d.mo56113h()) {
            C58833ax d2 = ((C42313cl) d.mo56107c()).mo45278d();
            if (d2.mo56113h()) {
                return ((Double) d2.mo56107c()).doubleValue();
            }
        }
        C55858t tVar = rVar.f147385d;
        if (tVar == null) {
            tVar = C55858t.f147392f;
        }
        C55817b bVar = tVar.f147397d;
        if (bVar == null) {
            bVar = C55817b.f147283d;
        }
        return bVar.f147287c;
    }
}
