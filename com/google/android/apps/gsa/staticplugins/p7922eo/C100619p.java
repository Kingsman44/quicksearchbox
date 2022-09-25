package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119066v;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6610c.C84998a;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.p */
/* compiled from: PG */
public final class C100619p {
    /* renamed from: a */
    public static C60870cx m166757a(C89356b bVar, Query query, C119066v vVar, int i, C89061q qVar, C85422c cVar, C85107a aVar, C58833ax axVar, C84998a aVar2) {
        qVar.getClass();
        if (i == 2) {
            return aVar.mo78719g(bVar, query, qVar, vVar, axVar);
        }
        if (i != 9) {
            if (i == 4) {
                return aVar.mo78722j(bVar, query, qVar, vVar, axVar);
            }
            if (i != 5) {
                if (i == 6) {
                    return aVar.mo78718f(bVar, query, qVar, vVar, axVar);
                }
                switch (i) {
                    case 11:
                        return aVar2.mo78649a(axVar, qVar, bVar, query);
                    case 12:
                        return aVar.mo78715c(bVar, query, cVar, vVar, axVar);
                    case 13:
                        return aVar.mo78716d(bVar, query, qVar, vVar, axVar);
                    case 14:
                        return aVar.mo78714b(bVar, query, qVar, vVar, axVar);
                    case 15:
                        return aVar.mo78717e(bVar, query, qVar, vVar, axVar);
                    case 16:
                        C119066v vVar2 = vVar;
                        C58833ax axVar2 = axVar;
                        C60870cx h = C60922j.m93045h(aVar.mo78713a(bVar, query, qVar, cVar, vVar2, axVar2), new C100618o(aVar, bVar, query, qVar, vVar2, axVar2), C60826bg.f164896a);
                        C90476a aVar3 = C91018d.f254254a;
                        return h;
                    default:
                        return aVar.mo78721i(bVar, query, qVar, vVar, axVar);
                }
            }
        }
        return aVar.mo78720h(bVar, query, cVar, vVar, axVar);
    }
}
