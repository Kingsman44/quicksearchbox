package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8174ab.p8177c.C105988a;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114741k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64279a;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64296ao;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64298aq;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64347w;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64348x;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.y */
/* compiled from: PG */
public final class C115087y {

    /* renamed from: a */
    SettableFuture f319479a = new SettableFuture();

    /* renamed from: b */
    private final C22871g f319480b;

    /* renamed from: c */
    private final C86124t f319481c;

    /* renamed from: d */
    private final C58833ax f319482d;

    /* renamed from: e */
    private final C68214a f319483e;

    /* renamed from: f */
    private final C53306j f319484f;

    /* renamed from: g */
    private final C68214a f319485g;

    public C115087y(C86124t tVar, C22871g gVar, C58833ax axVar, C68214a aVar, C53306j jVar, C68214a aVar2) {
        this.f319481c = tVar;
        this.f319480b = gVar;
        this.f319482d = axVar;
        this.f319483e = aVar;
        this.f319484f = jVar;
        this.f319485g = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo101842a() {
        C58976aa aaVar = C58975e.f156826a;
        ((C89859i) this.f319485g.mo27525b()).mo83702b(C89849ae.OPA_ZERO_STATE_HOME_AUTOMATION_MANAGER_START_INIT);
        if (this.f319484f != C53306j.AMBIENT || !this.f319482d.mo56113h()) {
            this.f319479a.mo57356n(C58485gu.m89845m());
        } else {
            C64279a aVar = (C64279a) C64308b.f173874c.createBuilder();
            C64347w wVar = (C64347w) C64348x.f173944c.createBuilder();
            C64296ao aoVar = (C64296ao) C64298aq.f173843d.createBuilder();
            aoVar.copyOnWrite();
            C64298aq aqVar = (C64298aq) aoVar.instance;
            aqVar.f173846b = 5;
            aqVar.f173845a |= 4;
            String b = ((bm) this.f319483e.mo27525b()).b();
            aoVar.copyOnWrite();
            C64298aq aqVar2 = (C64298aq) aoVar.instance;
            b.getClass();
            aqVar2.f173845a |= 8;
            aqVar2.f173847c = b;
            wVar.copyOnWrite();
            C64348x xVar = (C64348x) wVar.instance;
            C64298aq aqVar3 = (C64298aq) aoVar.build();
            aqVar3.getClass();
            xVar.f173947b = aqVar3;
            xVar.f173946a |= 1;
            C64348x xVar2 = (C64348x) wVar.build();
            aVar.copyOnWrite();
            C64308b bVar = (C64308b) aVar.instance;
            xVar2.getClass();
            bVar.f173877b = xVar2;
            bVar.f173876a = 4;
            ((C105988a) ((C68214a) this.f319482d.mo56107c()).mo27525b()).mo95204a((C64308b) aVar.build(), new C115086x(this)).mo95206a();
        }
        C60870cx e = C90877ak.m148471e(this.f319479a, this.f319481c.mo79743a(C90014bt.f247829op), TimeUnit.SECONDS, this.f319480b);
        C114741k.m190203a(e, (C89859i) this.f319485g.mo27525b(), this.f319480b, C89849ae.OPA_ZERO_STATE_HOME_AUTOMATION_MANAGER_FINISH_INIT, C89849ae.OPA_ZERO_STATE_HOME_AUTOMATION_MANAGER_INIT_TIMEOUT);
        return e;
    }
}
