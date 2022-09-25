package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80719cu;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80864j;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80865k;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.bm */
/* compiled from: PG */
public final /* synthetic */ class C81761bm implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C81772bx f223618a;

    /* renamed from: b */
    public final /* synthetic */ C80719cu f223619b;

    public /* synthetic */ C81761bm(C81772bx bxVar, C80719cu cuVar) {
        this.f223618a = bxVar;
        this.f223619b = cuVar;
    }

    public final void onClick(View view) {
        C81772bx bxVar = this.f223618a;
        C80719cu cuVar = this.f223619b;
        C81564g gVar = bxVar.f223666r;
        C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
        C80864j jVar = (C80864j) C80865k.f221810c.createBuilder();
        C80578l lVar = (C80578l) cuVar.mo74511a().get();
        jVar.copyOnWrite();
        lVar.getClass();
        ((C80865k) jVar.instance).f221812a = lVar;
        int i = e.F.ca;
        jVar.copyOnWrite();
        ((C80865k) jVar.instance).f221813b = i;
        eVar.copyOnWrite();
        C80831aj ajVar = (C80831aj) eVar.instance;
        C80865k kVar = (C80865k) jVar.build();
        kVar.getClass();
        ajVar.f221754b = kVar;
        ajVar.f221753a = 2;
        gVar.mo73552a((C80831aj) eVar.build());
    }
}
