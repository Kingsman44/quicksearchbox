package com.google.common.p4526f.p4532d;

import com.google.common.p4526f.p4528b.C59016b;
import com.google.common.p4526f.p4528b.C59028c;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.common.f.d.e */
/* compiled from: PG */
public final class C59070e extends C59068c {

    /* renamed from: c */
    private static final Map f157035c;

    /* renamed from: d */
    private final C59016b f157036d;

    static {
        EnumMap enumMap = new EnumMap(C59016b.class);
        for (C59016b bVar : C59016b.values()) {
            C59070e[] eVarArr = new C59070e[10];
            for (int i = 0; i < 10; i++) {
                eVarArr[i] = new C59070e(i, bVar, C59028c.f156940a);
            }
            enumMap.put(bVar, eVarArr);
        }
        f157035c = Collections.unmodifiableMap(enumMap);
    }

    private C59070e(int i, C59016b bVar, C59028c cVar) {
        super(cVar, i);
        C59081b.m91349a(bVar, "format char");
        this.f157036d = bVar;
        if (!cVar.mo56294c()) {
            char c = bVar.f156924l;
            c = cVar.mo56295d() ? c & 65503 : c;
            StringBuilder sb = new StringBuilder("%");
            cVar.mo56298f(sb);
            sb.append((char) c);
            return;
        }
        String str = bVar.f156927o;
    }

    /* renamed from: b */
    public static C59070e m91329b(int i, C59016b bVar, C59028c cVar) {
        if (i >= 10 || !cVar.mo56294c()) {
            return new C59070e(i, bVar, cVar);
        }
        return ((C59070e[]) f157035c.get(bVar))[i];
    }

    /* renamed from: a */
    public final void mo56336a(C59069d dVar, Object obj) {
        dVar.mo56246b(obj, this.f157036d, this.f157034b);
    }
}
