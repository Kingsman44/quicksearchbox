package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.C59090j;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.common.f.b.ai */
/* compiled from: PG */
public final class C59014ai {

    /* renamed from: a */
    public static final C59032g f156908a;

    /* renamed from: b */
    private static final Set f156909b;

    static {
        Set singleton = Collections.singleton(C59090j.f157047a);
        f156909b = singleton;
        f156908a = new C59013ah(singleton);
    }

    /* renamed from: a */
    public static String m91240a(C59031f fVar) {
        Object j = fVar.mo56307j();
        try {
            return C59035j.m91288b(j);
        } catch (RuntimeException e) {
            return C59035j.m91287a(j, e);
        }
    }

    /* renamed from: b */
    public static boolean m91241b(C59031f fVar, C59008ac acVar, Set set) {
        return fVar.mo56306i() != null || acVar.mo56271a() > set.size() || !set.containsAll(acVar.mo56273c());
    }

    /* renamed from: c */
    public static void m91242c(C59008ac acVar, C59044s sVar, StringBuilder sb) {
        C59030e eVar = new C59030e(sb);
        acVar.mo56274d(sVar, eVar);
        if (eVar.f156955c) {
            eVar.f156954b.append(eVar.f156953a);
        }
    }
}
