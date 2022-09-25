package com.google.android.apps.gsa.shared.monet.p7110c;

import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.monet.c.b */
/* compiled from: PG */
public final class C90306b {
    /* renamed from: a */
    public static List m146831a(Map map) {
        ArrayList arrayList = new ArrayList(((C58495hd) map).keySet());
        Collections.sort(arrayList);
        C58480gp e = C58485gu.m89837e();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C68214a aVar = (C68214a) map.get((Integer) arrayList.get(i));
            C58893dc.m90996a(aVar);
            e.mo55395g(aVar);
        }
        return e.mo55394f();
    }
}
