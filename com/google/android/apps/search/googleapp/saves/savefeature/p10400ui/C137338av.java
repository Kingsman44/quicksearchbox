package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.view.View;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.C137274p;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137253k;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137254l;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.av */
/* compiled from: PG */
final class C137338av implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C137332aq f373573a;

    public C137338av(C137332aq aqVar) {
        this.f373573a = aqVar;
    }

    public final void onClick(View view) {
        C137254l lVar;
        C137332aq aqVar = this.f373573a;
        C137253k kVar = (C137253k) C137254l.f373407g.createBuilder();
        C57569am amVar = aqVar.f373566i.f373509c;
        if (amVar == null) {
            amVar = C57569am.f153797f;
        }
        kVar.copyOnWrite();
        amVar.getClass();
        ((C137254l) kVar.instance).f373411c = amVar;
        C46370ah a = aqVar.f373564g.mo50378a(C62912at.f169862a);
        C57578av avVar = a != null ? (C57578av) a.f121384a : C57578av.f153822h;
        kVar.copyOnWrite();
        C137254l lVar2 = (C137254l) kVar.instance;
        avVar.getClass();
        lVar2.f373410b = avVar;
        lVar2.f373409a = 2;
        C137254l lVar3 = (C137254l) kVar.build();
        C46439e eVar = aqVar.f373563f;
        C137274p pVar = aqVar.f373562e;
        if (aqVar.f373566i.f373512f != null) {
            C137253k kVar2 = (C137253k) lVar3.toBuilder();
            C57648i iVar = aqVar.f373566i.f373512f;
            if (iVar == null) {
                iVar = C57648i.f153953c;
            }
            kVar2.copyOnWrite();
            iVar.getClass();
            ((C137254l) kVar2.instance).f373413e = iVar;
            lVar = (C137254l) kVar2.build();
        } else {
            lVar = lVar3;
        }
        eVar.mo50445g(C46438d.m82809a(pVar.mo113602a(lVar)), C46436b.m82808a(lVar3), aqVar.f373567j);
    }
}
