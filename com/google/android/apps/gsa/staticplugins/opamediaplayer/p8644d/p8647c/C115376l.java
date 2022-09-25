package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85322b;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58817ah;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.l */
/* compiled from: PG */
public final /* synthetic */ class C115376l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C52174hz f320147a;

    /* renamed from: b */
    public final /* synthetic */ C85322b f320148b;

    public /* synthetic */ C115376l(C52174hz hzVar, C85322b bVar) {
        this.f320147a = hzVar;
        this.f320148b = bVar;
    }

    public final Object apply(Object obj) {
        C52174hz hzVar = this.f320147a;
        C85322b bVar = this.f320148b;
        C52176ia iaVar = (C52176ia) obj;
        String str = hzVar.f136895b;
        C52170hv hvVar = (C52170hv) iaVar.toBuilder();
        hvVar.copyOnWrite();
        ((C52176ia) hvVar.instance).f136914b = C52176ia.emptyProtobufList();
        hvVar.mo53806b((Iterable) Collection.EL.stream(iaVar.f136914b).map(new C115386v(str, bVar)).collect(Collectors.toList()));
        return (C52176ia) hvVar.build();
    }
}
