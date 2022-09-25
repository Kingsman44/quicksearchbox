package com.google.android.libraries.assistant.auto.ondevice.p714f;

import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87730bl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87731bm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87732bn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.f.d */
/* compiled from: PG */
public final /* synthetic */ class C11910d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51809dy f38288a;

    public /* synthetic */ C11910d(C51809dy dyVar) {
        this.f38288a = dyVar;
    }

    public final Object apply(Object obj) {
        C51809dy dyVar = this.f38288a;
        C58485gu guVar = (C58485gu) obj;
        guVar.size();
        C87684al alVar = new C87684al(C88244um.CAR_ASSISTANT_SMART_ACTIONS);
        C62940bt btVar = C87730bl.f237213a;
        C87731bm bmVar = (C87731bm) C87732bn.f237214d.createBuilder();
        bmVar.copyOnWrite();
        C87732bn bnVar = (C87732bn) bmVar.instance;
        C62971cq cqVar = bnVar.f237217b;
        if (!cqVar.mo58948c()) {
            bnVar.f237217b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) bnVar.f237217b);
        bmVar.copyOnWrite();
        C87732bn bnVar2 = (C87732bn) bmVar.instance;
        dyVar.getClass();
        bnVar2.f237218c = dyVar;
        bnVar2.f237216a |= 1;
        alVar.mo81965b(btVar, (C87732bn) bmVar.build());
        return alVar.mo81964a();
    }
}
