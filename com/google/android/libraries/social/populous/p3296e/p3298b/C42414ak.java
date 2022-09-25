package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.common.p4522b.C58485gu;
import com.google.p4181bi.C55834bg;
import com.google.p4181bi.C55856r;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.e.b.ak */
/* compiled from: PG */
public final /* synthetic */ class C42414ak implements C42406ac {

    /* renamed from: a */
    public static final /* synthetic */ C42414ak f111238a = new C42414ak();

    private /* synthetic */ C42414ak() {
    }

    /* renamed from: a */
    public final void mo45414a(List list, C42549n nVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C42405ab abVar = (C42405ab) it.next();
            C58485gu f = abVar.mo45404f(nVar.f111609f.f110725k);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                C55856r rVar = (C55856r) f.get(i);
                Iterator it2 = rVar.f147386e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        abVar.mo45408i(rVar, C42408ae.f111231a);
                        break;
                    }
                    C55834bg bgVar = (C55834bg) it2.next();
                    if (bgVar.f147336a == 1 && !((String) bgVar.f147337b).isEmpty()) {
                        break;
                    }
                }
            }
        }
    }
}
