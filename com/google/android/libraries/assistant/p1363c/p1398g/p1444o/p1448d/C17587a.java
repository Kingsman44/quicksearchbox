package com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1448d;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5224k.p5225a.C67213bd;
import com.google.speech.p5224k.p5225a.C67215bf;
import com.google.speech.p5230n.p5231a.C67372i;
import com.google.speech.p5230n.p5232b.C67402ar;

/* renamed from: com.google.android.libraries.assistant.c.g.o.d.a */
/* compiled from: PG */
public final class C17587a {
    /* renamed from: a */
    public static boolean m34878a(C67402ar arVar) {
        Object obj;
        if ((arVar.f183194a & 1) != 0) {
            C58976aa aaVar = C58975e.f156826a;
            if (arVar.f183196c == null) {
                C67372i iVar = C67372i.f183129b;
            }
            return true;
        } else if (arVar.f183195b.size() > 0) {
            C58976aa aaVar2 = C58975e.f156826a;
            arVar.f183195b.size();
            return true;
        } else {
            C62940bt r0 = C62942bv.checkIsLite(C67215bf.f182681c);
            arVar.mo58887l(r0);
            if (arVar.f169962ag.mo58857o(r0.f169971d)) {
                C58976aa aaVar3 = C58975e.f156826a;
                C62940bt r02 = C62942bv.checkIsLite(C67215bf.f182681c);
                arVar.mo58887l(r02);
                Object l = arVar.f169962ag.mo58854l(r02.f169971d);
                if (l == null) {
                    obj = r02.f169969b;
                } else {
                    obj = r02.mo58889c(l);
                }
                C67215bf bfVar = (C67215bf) obj;
                if (bfVar.f182683a.size() == 1 && ((C67213bd) bfVar.f182683a.get(0)).f182677a == 6) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }
}
