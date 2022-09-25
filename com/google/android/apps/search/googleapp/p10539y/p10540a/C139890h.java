package com.google.android.apps.search.googleapp.p10539y.p10540a;

import androidx.activity.result.C0816c;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.search.googleapp.saves.savefeature.C137299g;
import com.google.android.apps.search.googleapp.saves.savefeature.C137300h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56700f;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57848f;

/* renamed from: com.google.android.apps.search.googleapp.y.a.h */
/* compiled from: PG */
public final /* synthetic */ class C139890h implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C139892j f380298a;

    /* renamed from: b */
    public final /* synthetic */ C0816c f380299b;

    /* renamed from: c */
    public final /* synthetic */ C56700f f380300c;

    public /* synthetic */ C139890h(C139892j jVar, C0816c cVar, C56700f fVar) {
        this.f380298a = jVar;
        this.f380299b = cVar;
        this.f380300c = fVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C139892j jVar = this.f380298a;
        C0816c cVar2 = this.f380299b;
        C56700f fVar = this.f380300c;
        C139891i iVar = jVar.f380305c;
        iVar.mo115327a(C139892j.f380303a);
        iVar.f380301a = cVar;
        C137299g gVar = (C137299g) C137300h.f373505h.createBuilder();
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373511e = 2;
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373507a = true;
        C57665z a = C57665z.m88512a(fVar.f151343b);
        if (a == null) {
            a = C57665z.UNKNOWN_ITEM_TYPE;
        }
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373508b = a.getNumber();
        C57848f fVar2 = fVar.f151345d;
        if (fVar2 == null) {
            fVar2 = C57848f.f154551c;
        }
        C57578av avVar = fVar2.f154553a;
        if (avVar == null) {
            avVar = C57578av.f153822h;
        }
        gVar.copyOnWrite();
        avVar.getClass();
        ((C137300h) gVar.instance).f373510d = avVar;
        C57569am amVar = fVar.f151342a;
        if (amVar == null) {
            amVar = C57569am.f153797f;
        }
        gVar.copyOnWrite();
        amVar.getClass();
        ((C137300h) gVar.instance).f373509c = amVar;
        C57648i iVar2 = fVar.f151344c;
        if (iVar2 == null) {
            iVar2 = C57648i.f153953c;
        }
        gVar.copyOnWrite();
        iVar2.getClass();
        ((C137300h) gVar.instance).f373512f = iVar2;
        C57848f fVar3 = fVar.f151345d;
        if (fVar3 == null) {
            fVar3 = C57848f.f154551c;
        }
        boolean z = fVar3.f154554b;
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373513g = z;
        cVar2.mo526b((C137300h) gVar.build());
        return "Transform save callback to future";
    }
}
