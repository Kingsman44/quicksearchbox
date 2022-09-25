package com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p914a;

import com.google.android.libraries.search.assistant.p2497ab.C32376ar;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62971cq;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.b.a.b */
/* compiled from: PG */
final class C13259b implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ int f40937a;

    /* renamed from: b */
    final /* synthetic */ int f40938b;

    public C13259b(int i, int i2) {
        this.f40938b = i;
        this.f40937a = i2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (guVar == null || guVar.isEmpty()) {
            C58485gu m = C58485gu.m89845m();
            C69664n.m101060f(m, "{\n          ImmutableList.of()\n        }");
            return m;
        }
        C32376ar arVar = (C32376ar) guVar.get(0);
        int i = this.f40938b - 1;
        if (i == 1) {
            C62971cq cqVar = arVar.f86798a;
            C69664n.m101060f(cqVar, "topContactResponse.topCallContactsList");
            return C13260c.m29521a(cqVar, this.f40937a);
        } else if (i != 2) {
            C62971cq cqVar2 = arVar.f86800c;
            C69664n.m101060f(cqVar2, "topContactResponse.topAggregateContactsList");
            return C13260c.m29521a(cqVar2, this.f40937a);
        } else {
            C62971cq cqVar3 = arVar.f86799b;
            C69664n.m101060f(cqVar3, "topContactResponse.topTextContactsList");
            return C13260c.m29521a(cqVar3, this.f40937a);
        }
    }
}
