package com.google.android.libraries.assistant.pcp.p1544c.p1545a;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.assistant.pcp.c.a.p */
/* compiled from: PG */
public final /* synthetic */ class C18569p implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f52585a;

    /* renamed from: b */
    public final /* synthetic */ List f52586b;

    public /* synthetic */ C18569p(List list, List list2) {
        this.f52585a = list;
        this.f52586b = list2;
    }

    public final Object call() {
        List list = this.f52585a;
        List list2 = this.f52586b;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            C53306j jVar = (C53306j) list2.get(i);
            C58528ij ijVar = C58733pz.f156496a;
            try {
                ijVar = (C58528ij) C60856cj.m92909r((Future) list.get(i));
            } catch (ExecutionException unused) {
            }
            C58800sl lA = ijVar.iterator();
            while (lA.hasNext()) {
                ((Set) Map.EL.computeIfAbsent(hashMap, (C18579g) lA.next(), C18562i.f52574a)).add(jVar);
            }
        }
        return hashMap;
    }
}
