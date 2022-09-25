package com.google.apps.tiktok.p3644h;

import androidx.p060c.C0977g;
import androidx.p060c.C0984n;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.h.af */
/* compiled from: PG */
public final class C47111af {

    /* renamed from: a */
    public final Random f122717a;

    public C47111af(Random random) {
        this.f122717a = random;
    }

    /* renamed from: a */
    public static C58528ij m83786a(Set set, C0984n nVar, C47110ae aeVar) {
        if (!nVar.containsKey(aeVar)) {
            return C58733pz.f156496a;
        }
        C58526ih ihVar = new C58526ih();
        for (C47110ae aeVar2 : (Set) nVar.get(aeVar)) {
            if (set.contains(aeVar2)) {
                ihVar.mo55373c(aeVar2);
            } else {
                ihVar.mo55489i(m83786a(set, nVar, aeVar2));
            }
        }
        return ihVar.mo55486f();
    }

    /* renamed from: b */
    public static void m83787b(C0984n nVar, C47110ae aeVar, C47110ae aeVar2) {
        Set set = (Set) nVar.get(aeVar);
        if (set == null) {
            set = Collections.newSetFromMap(new C0977g());
            nVar.put(aeVar, set);
        }
        set.add(aeVar2);
    }
}
