package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.common.base.C58833ax;
import java.util.Comparator;
import org.p5633c.p5634a.C72149ag;
import org.p5633c.p5634a.C72210d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.c */
/* compiled from: PG */
public final class C114830c implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C52395qd qdVar;
        C53354ku kuVar = (C53354ku) obj;
        C53354ku kuVar2 = (C53354ku) obj2;
        C52282lz lzVar = kuVar.f140002b;
        if (lzVar == null) {
            lzVar = C52282lz.f137236h;
        }
        C52395qd qdVar2 = null;
        if ((lzVar.f137238a & 2) != 0) {
            C52282lz lzVar2 = kuVar.f140002b;
            if (lzVar2 == null) {
                lzVar2 = C52282lz.f137236h;
            }
            qdVar = lzVar2.f137240c;
            if (qdVar == null) {
                qdVar = C52395qd.f137485e;
            }
        } else {
            qdVar = null;
        }
        C58833ax b = C114802az.m190315b(qdVar);
        C52282lz lzVar3 = kuVar2.f140002b;
        if (((lzVar3 == null ? C52282lz.f137236h : lzVar3).f137238a & 2) != 0) {
            if (lzVar3 == null) {
                lzVar3 = C52282lz.f137236h;
            }
            qdVar2 = lzVar3.f137240c;
            if (qdVar2 == null) {
                qdVar2 = C52395qd.f137485e;
            }
        }
        C58833ax b2 = C114802az.m190315b(qdVar2);
        if (!b.mo56113h()) {
            return !b2.mo56113h() ? 0 : -1;
        }
        if (!b2.mo56113h()) {
            return 1;
        }
        return ((C72210d) b.mo56107c()).compareTo((C72149ag) b2.mo56107c());
    }
}
