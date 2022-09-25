package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48683ar;
import com.google.assistant.p3781ad.p3789d.p3791b.C48684as;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.e */
/* compiled from: PG */
public final /* synthetic */ class C121461e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f337126a;

    public /* synthetic */ C121461e(Map map) {
        this.f337126a = map;
    }

    public final Object apply(Object obj) {
        Map map = this.f337126a;
        List list = (List) obj;
        C48683ar arVar = (C48683ar) C48684as.f125953b.createBuilder();
        Iterable iterable = (Iterable) Collection.EL.stream(map.values()).flatMap(C121463g.f337128a).filter(C121464h.f337129a).map(C121465i.f337130a).collect(C58370cn.f155946a);
        arVar.copyOnWrite();
        C48684as asVar = (C48684as) arVar.instance;
        C62971cq cqVar = asVar.f125955a;
        if (!cqVar.mo58948c()) {
            asVar.f125955a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) asVar.f125955a);
        return (C48684as) arVar.build();
    }
}
