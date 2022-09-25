package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.common.b.ib */
/* compiled from: PG */
public final class C58520ib {
    /* renamed from: a */
    public static final C58522id m89986a(List list) {
        Collections.sort(list, new C58336bg(C58648mv.KEY, C58714pg.m90501d()));
        C58480gp gpVar = new C58480gp(list.size());
        C58480gp gpVar2 = new C58480gp(list.size());
        for (int i = 0; i < list.size(); i++) {
            C58714pg pgVar = (C58714pg) ((Map.Entry) list.get(i)).getKey();
            if (i > 0) {
                C58714pg pgVar2 = (C58714pg) ((Map.Entry) list.get(i - 1)).getKey();
                if (pgVar.mo55823n(pgVar2) && !pgVar.mo55819i(pgVar2).mo55824o()) {
                    throw new IllegalArgumentException("Overlapping ranges: range " + pgVar2 + " overlaps with entry " + pgVar);
                }
            }
            gpVar.mo55395g(pgVar);
            gpVar2.mo55395g(((Map.Entry) list.get(i)).getValue());
        }
        return new C58522id(gpVar.mo55394f(), gpVar2.mo55394f());
    }

    /* renamed from: b */
    public static final void m89987b(C58714pg pgVar, Object obj, List list) {
        pgVar.getClass();
        obj.getClass();
        C58838bb.m90873h(!pgVar.mo55824o(), "Range must not be empty, but was %s", pgVar);
        list.add(new C58472gh(pgVar, obj));
    }
}
