package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.fr */
/* compiled from: PG */
public final class C87056fr implements C87143ik {

    /* renamed from: a */
    private final C87055fq f235197a;

    /* renamed from: b */
    private final C86842bk f235198b;

    /* renamed from: c */
    private final C86842bk f235199c;

    public C87056fr(C87055fq fqVar, C68214a aVar, C68214a aVar2) {
        this.f235197a = fqVar;
        this.f235198b = new C86842bk(aVar);
        this.f235199c = new C86842bk(aVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235197a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        this.f235198b.mo80534b(icVar);
        this.f235199c.mo80534b(icVar);
        C86842bk bkVar = this.f235198b;
        if (bkVar.f234552a || this.f235199c.f234552a) {
            C87055fq fqVar = this.f235197a;
            C86842bk bkVar2 = this.f235199c;
            if (bkVar2.f234552a) {
                fqVar.f235196b = ((C87052fn) bkVar2.mo80533a()).f235177m;
            }
            if (bkVar.f234552a) {
                C87171z zVar = (C87171z) bkVar.mo80533a();
                if (zVar.mo80797ac()) {
                    z = false;
                } else {
                    z = zVar.mo80784Q();
                }
                if (fqVar.f235195a.mo85055h(1, z)) {
                    if (z) {
                        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                        tzVar.copyOnWrite();
                        C60555uf ufVar = (C60555uf) tzVar.instance;
                        ufVar.f164093a |= 2;
                        ufVar.f164258m = 170;
                        String b = C39191a.m68623b(fqVar.f235196b.f252749G);
                        tzVar.copyOnWrite();
                        C60555uf ufVar2 = (C60555uf) tzVar.instance;
                        b.getClass();
                        ufVar2.f164093a |= 4;
                        ufVar2.f164259n = b;
                        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                    }
                    this.f235197a.mo80591ar();
                }
            }
        }
    }
}
