package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.p8056a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81360f;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81361g;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81368n;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C103050ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81360f f287670a;

    /* renamed from: b */
    public final /* synthetic */ Map f287671b;

    public /* synthetic */ C103050ac(C81360f fVar, Map map) {
        this.f287670a = fVar;
        this.f287671b = map;
    }

    public final void accept(Object obj) {
        C81360f fVar = this.f287670a;
        Map map = this.f287671b;
        C81368n nVar = (C81368n) obj;
        C80248co a = C80248co.m128104a(nVar.f222706d);
        if (a == null) {
            a = C80248co.USECASE_TYPE_UNKNOWN;
        }
        C81368n nVar2 = (C81368n) Map.EL.getOrDefault(map, a, nVar);
        fVar.copyOnWrite();
        C81361g gVar = (C81361g) fVar.instance;
        C81361g gVar2 = C81361g.f222689b;
        nVar2.getClass();
        gVar.mo75041a();
        gVar.f222691a.add(nVar2);
        C80248co a2 = C80248co.m128104a(nVar.f222706d);
        if (a2 == null) {
            a2 = C80248co.USECASE_TYPE_UNKNOWN;
        }
        map.remove(a2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
