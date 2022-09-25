package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8235c;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.c.f */
/* compiled from: PG */
public final /* synthetic */ class C106642f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106644h f297297a;

    public /* synthetic */ C106642f(C106644h hVar) {
        this.f297297a = hVar;
    }

    public final Object apply(Object obj) {
        C106644h hVar = this.f297297a;
        C58485gu guVar = (C58485gu) obj;
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C106637a.f297292a).map(C106638b.f297293a).filter(C106639c.f297294a).filter(new C106640d(hVar)).map(C106641e.f297296a).distinct().collect(C58370cn.f155946a);
        ((C58970a) ((C58970a) hVar.f297301c.mo56224b()).mo56372aa(23176)).mo56393w("From %d AssistantSettingsElements extracted %d devices", guVar.size(), guVar2.size());
        return guVar2;
    }
}
