package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.assistant.p3897e.p3921j.C52099fe;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C35816ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C52099fe f93837a;

    /* renamed from: b */
    public final /* synthetic */ C35862s f93838b;

    public /* synthetic */ C35816ae(C52099fe feVar, C35862s sVar) {
        this.f93837a = feVar;
        this.f93838b = sVar;
    }

    public final Object apply(Object obj) {
        C52099fe feVar = this.f93837a;
        C35862s sVar = this.f93838b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C52099fe feVar2 = (C52099fe) C52103fi.f136729i.createBuilder();
            String str = (String) optional.get();
            feVar2.copyOnWrite();
            C52103fi fiVar = (C52103fi) feVar2.instance;
            str.getClass();
            fiVar.f136731a |= 1;
            fiVar.f136732b = str;
            boolean z = sVar.f93959g;
            feVar2.copyOnWrite();
            C52103fi fiVar2 = (C52103fi) feVar2.instance;
            fiVar2.f136731a |= 2;
            fiVar2.f136733c = z;
            feVar.copyOnWrite();
            C52103fi fiVar3 = (C52103fi) feVar.instance;
            C52103fi fiVar4 = (C52103fi) feVar2.build();
            fiVar4.getClass();
            fiVar3.f136738h = fiVar4;
            fiVar3.f136731a |= 64;
        }
        C58976aa aaVar = C58975e.f156826a;
        return null;
    }
}
