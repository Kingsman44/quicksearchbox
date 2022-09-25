package com.google.android.apps.search.googleapp.p10539y.p10540a;

import androidx.activity.result.C0816c;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.search.googleapp.saves.savefeature.C137299g;
import com.google.android.apps.search.googleapp.saves.savefeature.C137300h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56708n;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57856n;

/* renamed from: com.google.android.apps.search.googleapp.y.a.g */
/* compiled from: PG */
public final /* synthetic */ class C139889g implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C139892j f380295a;

    /* renamed from: b */
    public final /* synthetic */ C0816c f380296b;

    /* renamed from: c */
    public final /* synthetic */ C56708n f380297c;

    public /* synthetic */ C139889g(C139892j jVar, C0816c cVar, C56708n nVar) {
        this.f380295a = jVar;
        this.f380296b = cVar;
        this.f380297c = nVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C139892j jVar = this.f380295a;
        C0816c cVar2 = this.f380296b;
        C56708n nVar = this.f380297c;
        C139891i iVar = jVar.f380305c;
        iVar.mo115327a(C139892j.f380303a);
        iVar.f380302b = cVar;
        C137299g gVar = (C137299g) C137300h.f373505h.createBuilder();
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373511e = 2;
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373507a = false;
        C57569am amVar = nVar.f151362a;
        if (amVar == null) {
            amVar = C57569am.f153797f;
        }
        gVar.copyOnWrite();
        amVar.getClass();
        ((C137300h) gVar.instance).f373509c = amVar;
        C57648i iVar2 = nVar.f151363b;
        if (iVar2 == null) {
            iVar2 = C57648i.f153953c;
        }
        gVar.copyOnWrite();
        iVar2.getClass();
        ((C137300h) gVar.instance).f373512f = iVar2;
        C57856n nVar2 = nVar.f151364c;
        if (nVar2 == null) {
            nVar2 = C57856n.f154566c;
        }
        boolean z = nVar2.f154569b;
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373513g = z;
        cVar2.mo526b((C137300h) gVar.build());
        return "Transform unsave callback to future";
    }
}
