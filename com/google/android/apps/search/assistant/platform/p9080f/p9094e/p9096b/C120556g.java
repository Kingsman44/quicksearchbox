package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.g */
/* compiled from: PG */
public final class C120556g {
    /* renamed from: a */
    public static final List m199688a(C51183n nVar, Set set) {
        C62971cq cqVar = nVar.f133229b;
        C69664n.m101060f(cqVar, "executionPlan.basicBlocksList");
        ArrayList<C51175f> arrayList = new ArrayList<>();
        for (Object next : cqVar) {
            if (set.contains(Integer.valueOf(((C51175f) next).f133208b))) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C51175f fVar : arrayList) {
            C62961ch chVar = fVar.f133211e;
            C69664n.m101060f(chVar, "it.interactionIdsList");
            C69540x.m100811r(arrayList2, chVar);
        }
        return arrayList2;
    }
}
