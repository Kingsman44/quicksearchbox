package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.appactions.p2502b.p2503a.C32493f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi;
import com.google.assistant.p3825an.p3830c.p3831a.C49277aw;
import com.google.assistant.p3825an.p3830c.p3831a.C49330g;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.c */
/* compiled from: PG */
final class C32282c {
    /* renamed from: a */
    public static final List m60062a(C32801aw awVar, String str) {
        C32814bi biVar;
        Object obj;
        int b;
        C69664n.m101061g(awVar, "contextResult");
        if (awVar.f87980a == 3) {
            biVar = (C32814bi) awVar.f87981b;
        } else {
            biVar = C32814bi.f87999a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C32493f.f87068e);
        biVar.mo58887l(r0);
        Object l = biVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C69664n.m101060f(obj, "contextResult.genericCon…textResponseExt\n        )");
        C62971cq cqVar = ((C32493f) obj).f87071b;
        C69664n.m101060f(cqVar, "contextResponse.shortcutsList");
        ArrayList<C49330g> arrayList = new ArrayList<>();
        for (Object next : cqVar) {
            C49330g gVar = (C49330g) next;
            if (C69664n.m101066l(gVar.f127491b, str) && (b = C49277aw.m85400b(gVar.f127499j)) != 0 && b == 4) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
        for (C49330g gVar2 : arrayList) {
            arrayList2.add(gVar2.f127492c);
        }
        return arrayList2;
    }
}
