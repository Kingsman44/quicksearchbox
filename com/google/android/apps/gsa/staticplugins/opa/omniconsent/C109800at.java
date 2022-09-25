package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109777i;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109778j;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.assistant.p3861at.C50358uc;
import com.google.assistant.p3861at.C50359ud;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.at */
/* compiled from: PG */
public final class C109800at extends C84036z {

    /* renamed from: a */
    public final C109799as f305949a;

    /* renamed from: b */
    public final C83893b f305950b;

    /* renamed from: c */
    public final C109790aj f305951c;

    /* renamed from: d */
    public final C69464a f305952d;

    /* renamed from: e */
    public final C69464a f305953e;

    /* renamed from: f */
    public final C113787bc f305954f;

    /* renamed from: g */
    public final boolean f305955g;

    /* renamed from: h */
    public final C86124t f305956h;

    /* renamed from: i */
    public int f305957i = 1;

    public C109800at(C109799as asVar, C83893b bVar, C109790aj ajVar, C69464a aVar, C69464a aVar2, C113787bc bcVar, C86124t tVar) {
        boolean z = true;
        this.f305949a = asVar;
        this.f305950b = bVar;
        this.f305951c = ajVar;
        this.f305952d = aVar;
        this.f305953e = aVar2;
        this.f305954f = bcVar;
        this.f305956h = tVar;
        C109811g gVar = (C109811g) asVar;
        int i = (gVar.f306006b.f131082a & 1) ^ 1;
        if (!ajVar.mo77273c((Account) bVar.mo77278a().mo56107c(), gVar.f306016l) && i == 0) {
            z = false;
        }
        this.f305955g = z;
        if (i != 0) {
            this.f305957i = 2;
        }
    }

    /* renamed from: b */
    public final C109778j mo98150b(C50359ud udVar) {
        C109777i iVar = (C109777i) C109778j.f305889e.createBuilder();
        int i = ((C109811g) this.f305949a).f306014j;
        iVar.copyOnWrite();
        C109778j jVar = (C109778j) iVar.instance;
        jVar.f305892b = i - 1;
        jVar.f305891a |= 1;
        boolean z = ((C109811g) this.f305949a).f306009e;
        iVar.copyOnWrite();
        C109778j jVar2 = (C109778j) iVar.instance;
        jVar2.f305891a |= 4;
        jVar2.f305894d = z;
        C50358uc ucVar = udVar.f131083b;
        if (ucVar == null) {
            ucVar = C50358uc.f131066m;
        }
        if ((ucVar.f131068a & 2) != 0) {
            C63088z zVar = ucVar.f131070c;
            iVar.copyOnWrite();
            C109778j jVar3 = (C109778j) iVar.instance;
            zVar.getClass();
            jVar3.f305891a |= 2;
            jVar3.f305893c = zVar;
        }
        return (C109778j) iVar.build();
    }

    /* renamed from: d */
    public final boolean mo98151d() {
        return this.f305957i == 2;
    }

    /* renamed from: h */
    public final C58485gu mo77495h() {
        return C58485gu.m89848p(new C109794an(this), new C109796ap(this), new C109797aq(this));
    }
}
