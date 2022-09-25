package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.n;
import com.google.android.apps.gsa.nga.d.a.o;
import com.google.android.apps.gsa.nga.d.a.v;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.aa */
/* compiled from: PG */
public final /* synthetic */ class C77915aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ v f214643a;

    public /* synthetic */ C77915aa(v vVar) {
        this.f214643a = vVar;
    }

    public final Object apply(Object obj) {
        v vVar = this.f214643a;
        C58485gu guVar = (C58485gu) obj;
        n createBuilder = o.c.createBuilder();
        String str = vVar.a;
        createBuilder.copyOnWrite();
        str.getClass();
        createBuilder.instance.a = str;
        createBuilder.copyOnWrite();
        o oVar = createBuilder.instance;
        C62971cq cqVar = oVar.b;
        if (!cqVar.mo58948c()) {
            oVar.b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) oVar.b);
        return createBuilder.build();
    }
}
