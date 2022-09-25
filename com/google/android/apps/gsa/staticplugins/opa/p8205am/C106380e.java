package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.assistant.shared.k.a.a;
import com.google.android.apps.gsa.assistant.shared.k.a.d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80188ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80189aj;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.e */
/* compiled from: PG */
public final /* synthetic */ class C106380e implements C58817ah {
    public final Object apply(Object obj) {
        d dVar = (d) obj;
        a builder = dVar.toBuilder();
        C80189aj ajVar = dVar.k;
        if (ajVar == null) {
            ajVar = C80189aj.f220013e;
        }
        C80188ai aiVar = (C80188ai) ajVar.toBuilder();
        aiVar.copyOnWrite();
        C80189aj ajVar2 = (C80189aj) aiVar.instance;
        ajVar2.f220015a |= 2;
        ajVar2.f220017c = true;
        C80189aj ajVar3 = (C80189aj) aiVar.build();
        builder.copyOnWrite();
        d dVar2 = builder.instance;
        ajVar3.getClass();
        dVar2.k = ajVar3;
        dVar2.a |= 128;
        return builder.build();
    }
}
