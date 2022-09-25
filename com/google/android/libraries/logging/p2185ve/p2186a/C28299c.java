package com.google.android.libraries.logging.p2185ve.p2186a;

import com.google.android.libraries.logging.p2181a.C28259b;
import com.google.android.libraries.logging.p2182b.C28273d;
import com.google.android.libraries.logging.p2182b.C28280k;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2192d.C28349b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.logging.ve.a.c */
/* compiled from: PG */
public final class C28299c implements C28273d {

    /* renamed from: a */
    private final C28259b f76982a;

    public C28299c(C28259b bVar) {
        this.f76982a = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo33773a(C28280k kVar) {
        Object obj;
        if (kVar instanceof C28349b) {
            C28349b bVar = (C28349b) kVar;
            C28481u a = bVar.mo33862a();
            C62940bt r1 = C62942bv.checkIsLite(C28304h.f76989a);
            a.mo58887l(r1);
            if (a.f169962ag.mo58857o(r1.f169971d)) {
                C28481u a2 = bVar.mo33862a();
                C62940bt r0 = C62942bv.checkIsLite(C28304h.f76989a);
                a2.mo58887l(r0);
                Object l = a2.f169962ag.mo58854l(r0.f169971d);
                if (l == null) {
                    obj = r0.f169969b;
                } else {
                    obj = r0.mo58889c(l);
                }
                C28303g gVar = (C28303g) obj;
                int a3 = C28302f.m52926a(gVar.f76988c);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i = a3 - 1;
                if (i != 1) {
                    if (i == 2) {
                        return C60856cj.m92900i(C28259b.m52821a());
                    }
                    if (i == 3) {
                        return C60856cj.m92900i(C28259b.m52824d());
                    }
                    if (i == 4) {
                        return C60856cj.m92900i(this.f76982a);
                    }
                    throw new IllegalArgumentException("Unknown type");
                } else if ((gVar.f76986a & 1) != 0) {
                    return C60856cj.m92900i(C28259b.m52823c(gVar.f76987b));
                } else {
                    throw new IllegalArgumentException("GAIA type must have a name");
                }
            }
        }
        return C60866ct.f164955a;
    }
}
