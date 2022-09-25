package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.p7259c.C92089e;
import com.google.android.apps.gsa.smartspace.p7259c.C92092h;
import com.google.android.apps.gsa.smartspace.p7259c.C92093i;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.p */
/* compiled from: PG */
public final class C110780p {

    /* renamed from: d */
    private static final long f308672d = Duration.ofSeconds(5).toMillis();

    /* renamed from: a */
    public final C83794j f308673a;

    /* renamed from: b */
    public final C92111g f308674b;

    /* renamed from: c */
    public final C58974d f308675c;

    /* renamed from: e */
    private final C21370a f308676e;

    /* renamed from: f */
    private final C68214a f308677f;

    public C110780p(C21370a aVar, C68214a aVar2, C83794j jVar, C92111g gVar, C83564a aVar3) {
        this.f308676e = aVar;
        this.f308677f = aVar2;
        this.f308673a = jVar;
        this.f308674b = gVar;
        this.f308675c = aVar3.mo76900a("expirationUtils");
    }

    /* renamed from: a */
    public final C92092h mo98889a(long j) {
        C92089e eVar = (C92089e) C92092h.f256732d.createBuilder();
        eVar.copyOnWrite();
        C92092h hVar = (C92092h) eVar.instance;
        hVar.f256735b = 2;
        hVar.f256734a |= 1;
        long b = this.f308676e.mo26870b();
        eVar.copyOnWrite();
        C92092h hVar2 = (C92092h) eVar.instance;
        hVar2.f256734a = 2 | hVar2.f256734a;
        hVar2.f256736c = j + b;
        return (C92092h) eVar.build();
    }

    /* renamed from: b */
    public final void mo98890b(long j, int i) {
        C92089e eVar = (C92089e) C92092h.f256732d.createBuilder();
        eVar.copyOnWrite();
        C92092h hVar = (C92092h) eVar.instance;
        hVar.f256735b = i - 1;
        hVar.f256734a |= 1;
        eVar.copyOnWrite();
        C92092h hVar2 = (C92092h) eVar.instance;
        hVar2.f256734a |= 2;
        hVar2.f256736c = j;
        C92092h hVar3 = (C92092h) eVar.build();
        long b = hVar3.f256736c - this.f308676e.mo26870b();
        if (i == 3) {
            ((C58970a) ((C58970a) this.f308675c.mo56224b()).mo56372aa(26745)).mo56388r("Schedule expiration task for weather with delay ms = %d", b);
        }
        if (b <= 0) {
            ((C58970a) ((C58970a) this.f308675c.mo56226d()).mo56372aa(26744)).mo56386p("trying to schedule task for already expired task");
            return;
        }
        ((C118561t) this.f308677f.mo27525b()).mo103752c(C118522by.SMARTSPACE_EXPIRATION);
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = b;
        long j2 = f308672d;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = j2;
        afVar.copyOnWrite();
        C118472ag agVar3 = (C118472ag) afVar.instance;
        agVar3.f328824d = 1;
        agVar3.f328821a |= 4;
        C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
        ajVar.mo58885m(C92093i.f256737a, hVar3);
        afVar.copyOnWrite();
        C118472ag agVar4 = (C118472ag) afVar.instance;
        C118476ak akVar = (C118476ak) ajVar.build();
        akVar.getClass();
        agVar4.f328827g = akVar;
        agVar4.f328821a |= 32;
        ((C118561t) this.f308677f.mo27525b()).mo103754e(C118522by.SMARTSPACE_EXPIRATION, (C118472ag) afVar.build());
    }
}
