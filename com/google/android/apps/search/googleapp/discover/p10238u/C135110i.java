package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57325h;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.i */
/* compiled from: PG */
public final class C135110i implements C68220f {
    /* renamed from: a */
    public static C58485gu m219112a(Set set, Map map) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                hashSet.add((C57325h) entry.getKey());
            }
        }
        C58485gu j = C58485gu.m89842j(hashSet);
        C68225k.m98532d(j);
        return j;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
