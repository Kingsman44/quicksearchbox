package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import com.google.assistant.p3897e.p3917i.p3918a.C51345eg;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.assistant.p3897e.p3917i.p3918a.C51348ej;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.i */
/* compiled from: PG */
public final /* synthetic */ class C128011i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51347ei f352283a;

    public /* synthetic */ C128011i(C51347ei eiVar) {
        this.f352283a = eiVar;
    }

    public final Object apply(Object obj) {
        C51347ei eiVar = this.f352283a;
        List list = (List) obj;
        C58974d dVar = C128017o.f352290a;
        if (!list.isEmpty()) {
            return (C51348ej) list.get(0);
        }
        ((C58970a) ((C58970a) C128017o.f352290a.mo56225c()).mo56372aa(37731)).mo56386p("No results from the service");
        C51345eg egVar = (C51345eg) C51348ej.f133744d.createBuilder();
        egVar.copyOnWrite();
        C51348ej ejVar = (C51348ej) egVar.instance;
        ejVar.f133747b = eiVar.f133743i;
        ejVar.f133746a |= 1;
        egVar.copyOnWrite();
        C51348ej ejVar2 = (C51348ej) egVar.instance;
        ejVar2.f133746a |= 2;
        ejVar2.f133748c = 0.5f;
        return (C51348ej) egVar.build();
    }
}
