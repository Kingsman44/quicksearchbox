package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94934b;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.assistant.p3739a.p3740a.C48064ay;
import com.google.assistant.p3739a.p3740a.C48065az;
import com.google.assistant.p3739a.p3740a.C48108e;
import com.google.assistant.p3739a.p3740a.C48109f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.c */
/* compiled from: PG */
public final class C94905c {

    /* renamed from: a */
    public static final C59071e f265453a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.b.c");

    /* renamed from: b */
    private final C32160b f265454b;

    /* renamed from: c */
    private final C22871g f265455c;

    /* renamed from: d */
    private final C94934b f265456d;

    public C94905c(C32160b bVar, C22871g gVar, C94934b bVar2) {
        this.f265454b = bVar;
        this.f265455c = gVar;
        this.f265456d = bVar2;
    }

    /* renamed from: c */
    private final synchronized void m156626c(C48065az azVar) {
        this.f265456d.mo88663s(C94936d.CONTROL_OUTPUT, azVar.toByteArray());
    }

    /* renamed from: a */
    public final void mo88779a(C124548d dVar) {
        if (dVar != null && dVar.mo106484Y()) {
            C32160b bVar = this.f265454b;
            new C90873ag(bVar.mo37973a(), this.f265455c, "getting account", new C94903a(this, dVar)).mo85223a(C94904b.f265452a);
        }
    }

    /* renamed from: b */
    public final void mo88780b(Account account, C124548d dVar) {
        boolean z = true;
        if (account != null) {
            int i = dVar.mo106517o(account).f343763a;
            String str = dVar.mo106517o(account).f343765c;
            C48108e eVar = (C48108e) C48109f.f124515d.createBuilder();
            String str2 = account.name;
            eVar.copyOnWrite();
            str2.getClass();
            ((C48109f) eVar.instance).f124517a = str2;
            eVar.copyOnWrite();
            str.getClass();
            ((C48109f) eVar.instance).f124519c = str;
            eVar.copyOnWrite();
            C48109f fVar = (C48109f) eVar.instance;
            if (1 != ((i & 1) ^ 1)) {
                z = false;
            }
            fVar.f124518b = z;
            C48109f fVar2 = (C48109f) eVar.build();
            C48064ay ayVar = (C48064ay) C48065az.f124397c.createBuilder();
            ayVar.copyOnWrite();
            C48065az azVar = (C48065az) ayVar.instance;
            fVar2.getClass();
            azVar.f124400b = fVar2;
            azVar.f124399a = 6;
            m156626c((C48065az) ayVar.build());
            return;
        }
        C59104x d = f265453a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoAccountInfoHandler");
        ((C59052c) ((C59052c) d).mo56372aa(17547)).mo56386p("account not available");
        C48064ay ayVar2 = (C48064ay) C48065az.f124397c.createBuilder();
        C48108e eVar2 = (C48108e) C48109f.f124515d.createBuilder();
        eVar2.copyOnWrite();
        ((C48109f) eVar2.instance).f124518b = true;
        C48109f fVar3 = (C48109f) eVar2.build();
        ayVar2.copyOnWrite();
        C48065az azVar2 = (C48065az) ayVar2.instance;
        fVar3.getClass();
        azVar2.f124400b = fVar3;
        azVar2.f124399a = 6;
        m156626c((C48065az) ayVar2.build());
    }
}
