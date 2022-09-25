package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58817ah;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.au */
/* compiled from: PG */
public final /* synthetic */ class C115224au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f319757a;

    public /* synthetic */ C115224au(String str) {
        this.f319757a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f319757a;
        C52176ia iaVar = (C52176ia) obj;
        C52170hv hvVar = (C52170hv) iaVar.toBuilder();
        hvVar.copyOnWrite();
        ((C52176ia) hvVar.instance).f136914b = C52176ia.emptyProtobufList();
        hvVar.mo53806b((Iterable) Collection.EL.stream(iaVar.f136914b).map(new C115384t(str)).collect(Collectors.toList()));
        return (C52176ia) hvVar.build();
    }
}
