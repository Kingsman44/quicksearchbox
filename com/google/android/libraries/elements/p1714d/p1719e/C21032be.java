package com.google.android.libraries.elements.p1714d.p1719e;

import android.util.Pair;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.common.p4522b.C58374cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.elements.d.e.be */
/* compiled from: PG */
public final class C21032be {

    /* renamed from: a */
    public static final C58485gu f58942a = C58485gu.m89851s(C20932a.class, C21012ar.class, C21017aw.class, C21037bj.class, C21039bl.class, C21007am.class);

    /* renamed from: a */
    public static Collection m39522a(Map map) {
        return C58374cr.m89410b(map.values(), C21029bb.f58939a);
    }

    /* renamed from: b */
    public static Collection m39523b(Map map) {
        ArrayList arrayList = new ArrayList(C58374cr.m89410b(map.values(), C21030bc.f58940a));
        Collections.sort(arrayList, C21031bd.f58941a);
        return arrayList;
    }

    /* renamed from: c */
    public static List m39524c(Map map, Set set) {
        C58480gp gpVar = new C58480gp(4);
        for (Pair pair : map.values()) {
            gpVar.mo55395g((C21270bm) pair.first);
        }
        gpVar.mo55396h(set);
        return gpVar.mo55394f();
    }
}
