package com.google.apps.p3589d.p3592c;

import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3593d.C45738af;
import com.google.apps.p3589d.p3593d.C45749h;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45762u;
import com.google.apps.p3589d.p3596g.C45833ai;
import com.google.apps.p3589d.p3596g.C45839g;
import java.util.Collections;

/* renamed from: com.google.apps.d.c.d */
/* compiled from: PG */
public final class C45728d {
    /* renamed from: a */
    public static String m81507a(C45749h hVar, C45723n nVar, C45723n nVar2, C45723n nVar3) {
        nVar.f120220a.clear();
        nVar2.f120220a.clear();
        nVar3.f120220a.clear();
        C45839g gVar = new C45839g(true, new C45726b(nVar, nVar3), new C45727c(nVar2, nVar3));
        gVar.mo49985a(hVar.f120310b);
        String sb = gVar.f120518a.toString();
        Collections.sort(nVar3.f120220a, C45723n.f120225b);
        if (nVar3.f120220a.size() > 0) {
            int i = 0;
            for (int i2 = 1; i2 < nVar3.f120220a.size(); i2++) {
                Comparable comparable = (Comparable) nVar3.mo49815d(i2);
                if (!comparable.equals(nVar3.mo49815d(i))) {
                    i++;
                    nVar3.mo49830i(i, comparable);
                }
            }
            nVar3.mo49831j(i + 1);
        }
        return sb;
    }

    /* renamed from: b */
    public static boolean m81508b(C45755n nVar) {
        String k;
        if (nVar instanceof C45738af) {
            return false;
        }
        if (nVar instanceof C45762u) {
            if (!((C45762u) nVar).f120338a && (k = C45833ai.m81772k(nVar)) != null && !k.endsWith("int")) {
                return true;
            }
            return false;
        } else if (!nVar.mo49891k()) {
            return true;
        } else {
            return false;
        }
    }
}
