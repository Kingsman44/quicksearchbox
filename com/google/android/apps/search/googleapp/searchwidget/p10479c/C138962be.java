package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.apps.search.googleapp.searchwidget.C139030h;
import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.be */
/* compiled from: PG */
public final /* synthetic */ class C138962be implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f377918a;

    public /* synthetic */ C138962be(C58485gu guVar) {
        this.f377918a = guVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f377918a;
        C139030h hVar = (C139030h) ((C139031i) obj).toBuilder();
        hVar.copyOnWrite();
        ((C139031i) hVar.instance).f378101b = C139031i.emptyProtobufList();
        hVar.copyOnWrite();
        C139031i iVar = (C139031i) hVar.instance;
        C62971cq cqVar = iVar.f378101b;
        if (!cqVar.mo58948c()) {
            iVar.f378101b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) iVar.f378101b);
        return (C139031i) hVar.build();
    }
}
