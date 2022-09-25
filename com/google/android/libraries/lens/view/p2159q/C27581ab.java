package com.google.android.libraries.lens.view.p2159q;

import com.google.android.apps.gsa.g.e.c;
import com.google.android.apps.gsa.g.e.e;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.lens.view.q.ab */
/* compiled from: PG */
public final /* synthetic */ class C27581ab implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f75381a;

    public /* synthetic */ C27581ab(String str) {
        this.f75381a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f75381a;
        e eVar = (e) obj;
        C58974d dVar = C27608bb.f75425a;
        Iterable e = C58557jl.m90124e(eVar.b, new C27601av(str));
        c createBuilder = e.c.createBuilder(eVar);
        createBuilder.b(str);
        createBuilder.copyOnWrite();
        createBuilder.instance.b = C62942bv.emptyProtobufList();
        createBuilder.a(e);
        return createBuilder.build();
    }
}
