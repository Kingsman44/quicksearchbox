package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.p8056a;

import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81360f;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81361g;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62947c;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C103052ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f287673a;

    public /* synthetic */ C103052ae(C58485gu guVar) {
        this.f287673a = guVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f287673a;
        C81361g gVar = (C81361g) obj;
        if (gVar == null) {
            gVar = C81361g.f222689b;
        }
        Map map = (Map) Collection.EL.stream(guVar).collect(Collectors.toMap(C103048aa.f287668a, C103049ab.f287669a));
        C81360f fVar = (C81360f) C81361g.f222689b.createBuilder();
        Collection.EL.stream(gVar.f222691a).forEach(new C103050ac(fVar, map));
        java.util.Collection values = map.values();
        fVar.copyOnWrite();
        C81361g gVar2 = (C81361g) fVar.instance;
        gVar2.mo75041a();
        C62947c.addAll((Iterable) values, (List) gVar2.f222691a);
        return (C81361g) fVar.build();
    }
}
