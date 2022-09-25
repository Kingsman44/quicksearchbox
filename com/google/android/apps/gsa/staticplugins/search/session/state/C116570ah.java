package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import com.google.android.apps.gsa.search.core.state.p6864a.C86792g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ah */
/* compiled from: PG */
public final class C116570ah implements C87143ik {

    /* renamed from: a */
    private final C116569ag f323284a;

    /* renamed from: b */
    private final C86842bk f323285b;

    /* renamed from: c */
    private final C86842bk f323286c;

    /* renamed from: d */
    private final C86842bk f323287d;

    /* renamed from: e */
    private final C86842bk f323288e;

    /* renamed from: f */
    private final C86842bk f323289f;

    public C116570ah(C116569ag agVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f323284a = agVar;
        this.f323285b = new C86842bk(aVar);
        this.f323286c = new C86842bk(aVar2);
        this.f323287d = new C86842bk(aVar3);
        this.f323288e = new C86842bk(aVar4);
        this.f323289f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323284a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        C116572aj ajVar;
        C116735gk gkVar;
        boolean z;
        C116836z zVar;
        C87135ic icVar2 = icVar;
        this.f323285b.mo80534b(icVar2);
        this.f323286c.mo80534b(icVar2);
        this.f323287d.mo80534b(icVar2);
        this.f323288e.mo80534b(icVar2);
        this.f323289f.mo80534b(icVar2);
        C86842bk bkVar = this.f323285b;
        if (bkVar.f234552a || this.f323286c.f234552a || this.f323287d.f234552a || this.f323288e.f234552a || this.f323289f.f234552a) {
            C116569ag agVar = this.f323284a;
            C86842bk bkVar2 = this.f323286c;
            C86842bk bkVar3 = this.f323287d;
            C86842bk bkVar4 = this.f323288e;
            C86842bk bkVar5 = this.f323289f;
            C116836z zVar2 = (C116836z) bkVar.mo80533a();
            C116572aj ajVar2 = (C116572aj) bkVar2.mo80533a();
            C116735gk gkVar2 = (C116735gk) bkVar5.mo80533a();
            if (bkVar4.f234552a) {
                C86792g gVar = (C86792g) bkVar4.mo80533a();
                long c = gVar.mo80445c();
                ClientConfig e = gVar.mo80446e();
                boolean h = gVar.mo80449h();
                boolean g = gVar.mo80448g();
                if (!gVar.mo80447f().mo81992b().equals("search")) {
                    e = ClientConfig.f236948a;
                    c = 0;
                    h = false;
                    g = false;
                }
                if (e == agVar.f323267a) {
                    zVar = zVar2;
                    ajVar = ajVar2;
                    if (c == agVar.f323268b) {
                        if (h != agVar.f323270d) {
                            agVar.f323270d = h;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (g != agVar.f323269c) {
                            agVar.f323269c = g;
                            gkVar = gkVar2;
                            z = true;
                        } else {
                            gkVar = gkVar2;
                        }
                    }
                } else {
                    zVar = zVar2;
                    ajVar = ajVar2;
                }
                C58976aa aaVar = C58975e.f156826a;
                long j = agVar.f323268b;
                ClientConfig clientConfig = agVar.f323267a;
                if (j != 0) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 221;
                    gkVar = gkVar2;
                    String b = C39191a.m68623b(((C116735gk) agVar.f323275i.mo27525b()).f323784p.f252749G);
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    b.getClass();
                    ufVar2.f164093a |= 4;
                    ufVar2.f164259n = b;
                    amo a = C89949q.m146517a(agVar.f323267a.f236951d);
                    tzVar.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar.instance;
                    ufVar3.f164070D = a.f159234au;
                    ufVar3.f164146b |= 8;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                } else {
                    gkVar = gkVar2;
                }
                if (c != 0) {
                    C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar2.copyOnWrite();
                    C60555uf ufVar4 = (C60555uf) tzVar2.instance;
                    ufVar4.f164093a |= 2;
                    ufVar4.f164258m = 222;
                    String b2 = C39191a.m68623b(((C116735gk) agVar.f323275i.mo27525b()).f323784p.f252749G);
                    tzVar2.copyOnWrite();
                    C60555uf ufVar5 = (C60555uf) tzVar2.instance;
                    b2.getClass();
                    ufVar5.f164093a |= 4;
                    ufVar5.f164259n = b2;
                    amo a2 = C89949q.m146517a(e.f236951d);
                    tzVar2.copyOnWrite();
                    C60555uf ufVar6 = (C60555uf) tzVar2.instance;
                    ufVar6.f164070D = a2.f159234au;
                    ufVar6.f164146b |= 8;
                    C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
                }
                agVar.f323267a = e;
                agVar.f323268b = c;
                agVar.f323270d = h;
                agVar.f323269c = g;
                agVar.mo102775k();
                agVar.mo102776m((C116836z) agVar.f323273g.mo27525b(), (C116579aq) agVar.f323274h.mo27525b(), (C116735gk) agVar.f323275i.mo27525b(), ((C116572aj) agVar.f323276j.mo27525b()).mo102779e());
                z = true;
                agVar.mo102772g((C116836z) agVar.f323273g.mo27525b(), true);
            } else {
                zVar = zVar2;
                ajVar = ajVar2;
                gkVar = gkVar2;
                z = false;
            }
            if (bkVar5.f234552a) {
                z |= agVar.mo102775k();
            }
            if (bkVar.f234552a || bkVar3.f234552a || bkVar5.f234552a || bkVar2.f234552a) {
                z |= agVar.mo102776m(zVar, (C116579aq) bkVar3.mo80533a(), gkVar, ajVar.mo102779e());
            }
            if (bkVar.f234552a) {
                agVar.mo102772g(zVar, false);
            }
            if (z) {
                this.f323284a.mo80591ar();
            }
        }
    }
}
