package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58671nr;
import com.google.p4181bi.C55856r;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.e.b.aj */
/* compiled from: PG */
public final /* synthetic */ class C42413aj implements C42406ac {

    /* renamed from: a */
    public static final /* synthetic */ C42413aj f111237a = new C42413aj();

    private /* synthetic */ C42413aj() {
    }

    /* renamed from: a */
    public final void mo45414a(List list, C42549n nVar) {
        C58671nr b = C42415al.m74699b(nVar.f111607d.f110807a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42405ab abVar = (C42405ab) it.next();
            C58485gu f = abVar.mo45404f(nVar.f111609f.f110725k);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                C55856r rVar = (C55856r) f.get(i);
                if (C42415al.m74700c(rVar, b)) {
                    abVar.mo45408i(rVar, C42408ae.f111231a);
                }
            }
        }
    }
}
