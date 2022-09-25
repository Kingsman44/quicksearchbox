package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ia */
/* compiled from: PG */
public final class C109266ia {

    /* renamed from: a */
    public static final C59071e f304372a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ia");

    /* renamed from: b */
    public final C86124t f304373b;

    /* renamed from: c */
    public final C58833ax f304374c;

    /* renamed from: d */
    public final C68214a f304375d;

    /* renamed from: e */
    public final C22871g f304376e;

    /* renamed from: f */
    private final C114748b f304377f;

    /* renamed from: g */
    private final C107698i f304378g;

    public C109266ia(C58833ax axVar, C86124t tVar, C114748b bVar, C107698i iVar, C68214a aVar, C22871g gVar) {
        this.f304374c = axVar;
        this.f304373b = tVar;
        this.f304377f = bVar;
        this.f304378g = iVar;
        this.f304375d = aVar;
        this.f304376e = gVar;
    }

    /* renamed from: a */
    public final void mo97730a(C87695ad adVar) {
        C88489j jVar = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
        jVar.mo82014b(C87694ac.f237131a, (C87696ae) adVar.build());
        this.f304378g.mo96219b(jVar.mo82013a());
    }

    /* renamed from: b */
    public final void mo97731b(C87695ad adVar, boolean z) {
        if (z) {
            this.f304377f.f318450c = C53270hr.FOREGROUND;
        } else {
            this.f304377f.f318450c = C53270hr.PREFETCH;
        }
        C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
        C53306j jVar = this.f304377f.f318449b;
        hpVar.copyOnWrite();
        C53271hs hsVar = (C53271hs) hpVar.instance;
        hsVar.f139663l = jVar.f139793X;
        hsVar.f139652a |= 512;
        C53270hr hrVar = this.f304377f.f318450c;
        hpVar.copyOnWrite();
        C53271hs hsVar2 = (C53271hs) hpVar.instance;
        hsVar2.f139665n = hrVar.f139649g;
        hsVar2.f139652a |= 2048;
        C53287ih d = C87571n.m142340d(this.f304377f.f318451d);
        if (d != null) {
            hpVar.copyOnWrite();
            C53271hs hsVar3 = (C53271hs) hpVar.instance;
            hsVar3.f139668q = d;
            hsVar3.f139652a |= 65536;
        }
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        C53271hs hsVar4 = (C53271hs) hpVar.build();
        C87696ae aeVar2 = C87696ae.f237132p;
        hsVar4.getClass();
        aeVar.f237136c = hsVar4;
        aeVar.f237134a |= 2;
        if (z) {
            adVar.copyOnWrite();
            C87696ae aeVar3 = (C87696ae) adVar.instance;
            aeVar3.f237134a |= 1024;
            aeVar3.f237144k = true;
        }
    }

    /* renamed from: c */
    public final boolean mo97732c() {
        return this.f304373b.mo79746e(C90014bt.f247813oI);
    }
}
