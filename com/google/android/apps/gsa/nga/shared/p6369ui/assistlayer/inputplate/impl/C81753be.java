package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80792fm;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80864j;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80865k;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.be */
/* compiled from: PG */
public final /* synthetic */ class C81753be implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C81772bx f223606a;

    /* renamed from: b */
    public final /* synthetic */ C80792fm f223607b;

    public /* synthetic */ C81753be(C81772bx bxVar, C80792fm fmVar) {
        this.f223606a = bxVar;
        this.f223607b = fmVar;
    }

    public final void run() {
        C81772bx bxVar = this.f223606a;
        C80792fm fmVar = this.f223607b;
        C81564g gVar = bxVar.f223666r;
        C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
        C80864j jVar = (C80864j) C80865k.f221810c.createBuilder();
        C80578l lVar = fmVar.f221703f;
        if (lVar == null) {
            lVar = C80578l.f221173g;
        }
        jVar.copyOnWrite();
        lVar.getClass();
        ((C80865k) jVar.instance).f221812a = lVar;
        int i = e.F.ca;
        jVar.copyOnWrite();
        ((C80865k) jVar.instance).f221813b = i;
        C80865k kVar = (C80865k) jVar.build();
        eVar.copyOnWrite();
        C80831aj ajVar = (C80831aj) eVar.instance;
        kVar.getClass();
        ajVar.f221754b = kVar;
        ajVar.f221753a = 2;
        gVar.mo73552a((C80831aj) eVar.build());
    }
}
