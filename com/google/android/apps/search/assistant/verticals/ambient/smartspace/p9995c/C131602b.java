package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c;

import com.google.android.apps.p471d.p472a.p473a.p474a.C9026h;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p5129p.p5131b.C65755am;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b */
/* compiled from: PG */
final class C131602b implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C131646c.f359698a.mo56225c()).mo56382g(th)).mo56372aa(39114)).mo56386p("Failed to retrieve elements from Geller Accessor!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Object obj2;
        C65033ar arVar = (C65033ar) obj;
        ((C59052c) ((C59052c) C131646c.f359698a.mo56224b()).mo56372aa(39115)).mo56387q("Successfully retrieved elements from Geller Accessor with list of size: %d", arVar.f176113a.size());
        for (C65768az azVar : arVar.f176113a) {
            C62940bt r1 = C62942bv.checkIsLite(C65755am.f178759f);
            azVar.mo58887l(r1);
            if (!azVar.f169962ag.mo58857o(r1.f169971d)) {
                ((C59052c) ((C59052c) C131646c.f359698a.mo56226d()).mo56372aa(39116)).mo56386p("Element in CROSS_DEVICE_TIMER corpus missing required element extension!");
            } else {
                C62940bt r12 = C62942bv.checkIsLite(C65755am.f178759f);
                azVar.mo58887l(r12);
                Object l = azVar.f169962ag.mo58854l(r12.f169971d);
                if (l == null) {
                    obj2 = r12.f169969b;
                } else {
                    obj2 = r12.mo58889c(l);
                }
                if (((C65755am) obj2).f178762b == null) {
                    C9026h hVar = C9026h.f31165b;
                }
                String str = azVar.f178798d;
            }
        }
    }
}
