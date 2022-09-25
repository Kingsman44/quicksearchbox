package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.p8839t.p8844e.C118353b;
import com.google.android.apps.gsa.p8839t.p8844e.C118356e;
import com.google.android.apps.gsa.p8839t.p8844e.C118357f;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.util.C113880k;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.i */
/* compiled from: PG */
public final class C114771i implements C118549h {

    /* renamed from: a */
    private final C22871g f318489a;

    /* renamed from: b */
    private final C118356e f318490b;

    /* renamed from: c */
    private final C85492i f318491c;

    /* renamed from: d */
    private final C113880k f318492d;

    public C114771i(C22871g gVar, C85492i iVar, C118357f fVar, C113880k kVar) {
        this.f318489a = gVar;
        this.f318491c = iVar;
        this.f318490b = fVar.mo103678a();
        this.f318492d = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        C22871g gVar = this.f318489a;
        C60870cx[] cxVarArr = new C60870cx[2];
        C85492i iVar = this.f318491c;
        C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
        C53306j jVar = C53306j.MAIN_APP;
        hpVar.copyOnWrite();
        C53271hs hsVar = (C53271hs) hpVar.instance;
        hsVar.f139663l = jVar.f139793X;
        hsVar.f139652a |= 512;
        boolean g = this.f318492d.mo100741g();
        hpVar.copyOnWrite();
        C53271hs hsVar2 = (C53271hs) hpVar.instance;
        hsVar2.f139652a |= 1048576;
        hsVar2.f139671t = !g;
        cxVarArr[0] = iVar.mo78999d((C53271hs) hpVar.build());
        C118356e eVar = this.f318490b;
        if (eVar.f328508d.mo79746e(C90014bt.f247812oH)) {
            cxVar = eVar.f328506b.mo28209i(eVar.mo103677b(), "refreshTopContactAtBackgroundTask", C118353b.f328502a);
        } else {
            cxVar = C60856cj.m92900i(C118826c.f331422a);
        }
        cxVarArr[1] = cxVar;
        return gVar.mo28209i(C60856cj.m92907p(cxVarArr), "ZeroStateBackgroundRefreshTask.perform()", C114746h.f318446a);
    }
}
