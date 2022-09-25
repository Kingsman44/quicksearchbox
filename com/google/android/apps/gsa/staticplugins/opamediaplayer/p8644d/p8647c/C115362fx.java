package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52591xk;
import com.google.common.base.C58817ah;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5285d.p5290b.p5291a.p5292a.C68189by;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.fx */
/* compiled from: PG */
public final /* synthetic */ class C115362fx implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C68189by f320076a;

    public /* synthetic */ C115362fx(C68189by byVar) {
        this.f320076a = byVar;
    }

    public final Object apply(Object obj) {
        C52176ia iaVar = (C52176ia) obj;
        C52591xk f = C115387w.m191345f(this.f320076a);
        C52170hv hvVar = (C52170hv) iaVar.toBuilder();
        hvVar.copyOnWrite();
        ((C52176ia) hvVar.instance).f136914b = C52176ia.emptyProtobufList();
        hvVar.mo53806b((Iterable) Collection.EL.stream(iaVar.f136914b).map(new C115383s(f)).collect(Collectors.toList()));
        return (C52176ia) hvVar.build();
    }
}
