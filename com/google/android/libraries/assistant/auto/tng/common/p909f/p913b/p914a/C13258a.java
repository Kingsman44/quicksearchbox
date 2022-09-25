package com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p914a;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13263c;
import com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a;
import com.google.android.libraries.search.assistant.p2497ab.C32376ar;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.protobuf.C62971cq;
import java.util.HashMap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.b.a.a */
/* compiled from: PG */
final class C13258a implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C13260c f40935a;

    /* renamed from: b */
    final /* synthetic */ int f40936b;

    public C13258a(C13260c cVar, int i) {
        this.f40935a = cVar;
        this.f40936b = i;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (guVar == null || guVar.isEmpty()) {
            return C58729pv.f156485a;
        }
        C32376ar arVar = (C32376ar) guVar.get(0);
        HashMap hashMap = new HashMap();
        if (C13315a.m29571a("android.permission.READ_SMS", this.f40935a.f40940a)) {
            C13263c cVar = C13263c.TYPE_TEXT;
            C62971cq cqVar = arVar.f86799b;
            C69664n.m101060f(cqVar, "topContactResponse.topTextContactsList");
            hashMap.put(cVar, C13260c.m29521a(cqVar, this.f40936b));
        }
        if (C13315a.m29571a("android.permission.READ_CALL_LOG", this.f40935a.f40940a)) {
            C13263c cVar2 = C13263c.TYPE_CALL;
            C62971cq cqVar2 = arVar.f86798a;
            C69664n.m101060f(cqVar2, "topContactResponse.topCallContactsList");
            hashMap.put(cVar2, C13260c.m29521a(cqVar2, this.f40936b));
        }
        if (C13315a.m29571a("android.permission.READ_CALL_LOG", this.f40935a.f40940a) && C13315a.m29571a("android.permission.READ_SMS", this.f40935a.f40940a)) {
            C13263c cVar3 = C13263c.TYPE_AGGREGATE;
            C62971cq cqVar3 = arVar.f86800c;
            C69664n.m101060f(cqVar3, "topContactResponse.topAggregateContactsList");
            hashMap.put(cVar3, C13260c.m29521a(cqVar3, this.f40936b));
        }
        return C58495hd.m89898l(hashMap);
    }
}
