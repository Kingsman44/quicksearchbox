package com.google.android.libraries.logging.p2185ve.p2193e.p2194a;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63000ds;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.logging.ve.e.a.j */
/* compiled from: PG */
public final class C28363j {

    /* renamed from: a */
    private final Map f77090a;

    /* renamed from: b */
    private final C62921ba f77091b = C62921ba.m95368a();

    public C28363j(Map map) {
        this.f77090a = map;
    }

    /* renamed from: a */
    public final void mo33876a(C62937bq bqVar, List list, C63000ds dsVar, List list2) {
        C28360g gVar;
        Object obj;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C69464a aVar = (C69464a) this.f77090a.get(Integer.valueOf(num.intValue()));
            if (aVar == null) {
                gVar = null;
            } else {
                gVar = (C28360g) aVar.mo17428b();
            }
            if (gVar != null) {
                int intValue = num.intValue();
                C62940bt r0 = C62942bv.checkIsLite(this.f77091b.mo58830c((C62937bq) bqVar.getDefaultInstanceForType(), intValue));
                bqVar.mo58887l(r0);
                Object l = bqVar.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj = r0.f169969b;
                } else {
                    obj = r0.mo58889c(l);
                }
                C60870cx a = gVar.mo30787a((MessageLite) obj);
                a.getClass();
                if (!C28360g.f77086b.equals(a)) {
                    if (dsVar == null) {
                        list2.add(a);
                    } else if (a.isDone()) {
                        try {
                            ((C28359f) C60856cj.m92909r(a)).mo30786a(dsVar);
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        list2.add(C60922j.m93044g(a, new C28361h(dsVar), C60826bg.f164896a));
                    }
                }
            }
        }
    }
}
