package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
import com.google.assistant.p3897e.p3908d.p3909a.C51174e;
import com.google.assistant.p3897e.p3908d.p3909a.C51175f;
import com.google.assistant.p3897e.p3908d.p3909a.C51178i;
import com.google.assistant.p3897e.p3908d.p3909a.C51180k;
import com.google.assistant.p3897e.p3908d.p3909a.C51181l;
import com.google.assistant.p3897e.p3908d.p3909a.C51182m;
import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.assistant.p3897e.p3917i.p3918a.C51271bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.v */
/* compiled from: PG */
public final class C79713v {

    /* renamed from: a */
    public int f218608a = 0;

    /* renamed from: b */
    public int f218609b = 0;

    /* renamed from: c */
    private final C51182m f218610c = ((C51182m) C51183n.f133226e.createBuilder());

    /* renamed from: d */
    private final C52079el f218611d = ((C52079el) C52081en.f136679i.createBuilder());

    /* renamed from: d */
    private final C58485gu m127807d(Collection collection) {
        C58485gu guVar = (C58485gu) Collection.EL.stream(collection).map(new C79712u(this)).collect(C58370cn.f155946a);
        this.f218611d.mo53784a(guVar);
        return guVar;
    }

    /* renamed from: a */
    public final C52081en mo74212a() {
        C51182m mVar = this.f218610c;
        C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar = C51180k.FINISH;
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
        mVar.mo53550e(iVar);
        C22719w wVar = new C22719w();
        C51271bn bnVar = (C51271bn) C51274bq.f133487i.createBuilder();
        bnVar.copyOnWrite();
        C51274bq bqVar = (C51274bq) bnVar.instance;
        bqVar.f133489a |= 1;
        bqVar.f133490b = true;
        C51182m mVar2 = this.f218610c;
        bnVar.copyOnWrite();
        C51274bq bqVar2 = (C51274bq) bnVar.instance;
        C51183n nVar = (C51183n) mVar2.build();
        nVar.getClass();
        bqVar2.f133495g = nVar;
        bqVar2.f133489a |= 32;
        wVar.mo27878e(bnVar.build());
        C52079el elVar = this.f218611d;
        C52091ex a = wVar.mo27874a();
        elVar.copyOnWrite();
        C52081en enVar = (C52081en) elVar.instance;
        C52081en enVar2 = C52081en.f136679i;
        a.getClass();
        enVar.f136685e = a;
        enVar.f136681a |= 16;
        return (C52081en) this.f218611d.build();
    }

    /* renamed from: b */
    public final void mo74213b(java.util.Collection collection) {
        if (!collection.isEmpty()) {
            C58485gu guVar = (C58485gu) Collection.EL.stream(m127807d(collection)).map(new C79709r(this)).collect(C58370cn.f155946a);
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(C79710s.f218605a).collect(C58370cn.f155946a);
            C51182m mVar = this.f218610c;
            mVar.mo53546a(guVar);
            C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
            C51180k kVar = C51180k.START_BBS;
            iVar.copyOnWrite();
            C51181l lVar = (C51181l) iVar.instance;
            lVar.f133224b = kVar.f133220f;
            lVar.f133223a |= 1;
            iVar.mo53542a(guVar2);
            mVar.mo53550e(iVar);
            C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
            C51180k kVar2 = C51180k.JOIN_BBS;
            iVar2.copyOnWrite();
            C51181l lVar2 = (C51181l) iVar2.instance;
            lVar2.f133224b = kVar2.f133220f;
            lVar2.f133223a |= 1;
            iVar2.mo53542a(guVar2);
            mVar.mo53550e(iVar2);
        }
    }

    /* renamed from: c */
    public final void mo74214c(java.util.Collection collection) {
        if (!collection.isEmpty()) {
            int i = this.f218609b;
            this.f218609b = i + 1;
            C51182m mVar = this.f218610c;
            C51174e eVar = (C51174e) C51175f.f133205f.createBuilder();
            eVar.copyOnWrite();
            C51175f fVar = (C51175f) eVar.instance;
            fVar.f133207a |= 1;
            fVar.f133208b = i;
            eVar.mo53530a((C58485gu) Collection.EL.stream(m127807d(collection)).map(C79711t.f218606a).collect(C58370cn.f155946a));
            mVar.mo53548c(eVar);
            C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
            C51180k kVar = C51180k.START_BBS;
            iVar.copyOnWrite();
            C51181l lVar = (C51181l) iVar.instance;
            lVar.f133224b = kVar.f133220f;
            lVar.f133223a |= 1;
            iVar.mo53543b(i);
            mVar.mo53550e(iVar);
            C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
            C51180k kVar2 = C51180k.JOIN_BBS;
            iVar2.copyOnWrite();
            C51181l lVar2 = (C51181l) iVar2.instance;
            lVar2.f133224b = kVar2.f133220f;
            lVar2.f133223a |= 1;
            iVar2.mo53543b(i);
            mVar.mo53550e(iVar2);
        }
    }
}
