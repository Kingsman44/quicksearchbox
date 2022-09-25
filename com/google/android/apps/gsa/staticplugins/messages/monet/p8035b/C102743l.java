package com.google.android.apps.gsa.staticplugins.messages.monet.p8035b;

import com.google.android.apps.gsa.search.core.p6519al.p6590bh.C84842a;
import com.google.android.apps.gsa.search.core.p6519al.p6640cd.C85077a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6898h.C87346a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.core.p6884y.p6917i.C87388b;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8035b.p8036a.C102731b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8035b.p8036a.C102732c;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102753e;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23193m;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60588vl;
import com.google.common.p4552o.C60589vm;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.b.l */
/* compiled from: PG */
public final class C102743l extends C23056g {

    /* renamed from: a */
    public static final C59071e f286829a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.messages.monet.b.l");

    /* renamed from: b */
    public final C84842a f286830b;

    /* renamed from: c */
    public final C85077a f286831c;

    /* renamed from: d */
    public final C22871g f286832d;

    /* renamed from: e */
    public final C87348a f286833e;

    /* renamed from: f */
    public final C87346a f286834f;

    /* renamed from: g */
    private final C102753e f286835g;

    /* renamed from: h */
    private final C87388b f286836h;

    /* renamed from: i */
    private final C102732c f286837i;

    /* renamed from: j */
    private C102731b f286838j;

    public C102743l(C23052c cVar, C102753e eVar, C87388b bVar, C102732c cVar2, C84842a aVar, C85077a aVar2, C22871g gVar, C87348a aVar3, C87346a aVar4) {
        super(cVar);
        this.f286835g = eVar;
        this.f286836h = bVar;
        this.f286837i = cVar2;
        this.f286830b = aVar;
        this.f286831c = aVar2;
        this.f286832d = gVar;
        this.f286833e = aVar3;
        this.f286834f = aVar4;
        cVar.mo28433w(C102746o.class, new C102742k(this));
    }

    /* renamed from: e */
    public final void mo93409e() {
        mo93410f(this.f286834f.mo80994b());
    }

    /* renamed from: f */
    public final void mo93410f(List list) {
        if (!this.f63405W.mo28420E()) {
            C58976aa aaVar = C58975e.f156826a;
            if (this.f286838j == null) {
                C59104x d = f286829a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MCContainerController");
                ((C59052c) ((C59052c) d).mo56372aa(21035)).mo56386p("Message card data factory is null. This should never happen.");
                int i = C90755l.f253831a;
                return;
            }
            ((C23193m) this.f286835g.mo93403b()).mo28652f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C87544b bVar = (C87544b) it.next();
                if (bVar != C87544b.UNKNOWN_MESSAGE) {
                    C102731b bVar2 = this.f286838j;
                    bVar2.getClass();
                    ((C23193m) this.f286835g.mo93403b()).mo28647a("message_card", C23245b.m43556a(bVar2.mo93402a(bVar)));
                    C60588vl vlVar = (C60588vl) C60589vm.f164363d.createBuilder();
                    int i2 = bVar.f236491v;
                    vlVar.copyOnWrite();
                    C60589vm vmVar = (C60589vm) vlVar.instance;
                    vmVar.f164365a |= 1;
                    vmVar.f164366b = i2;
                    SearchError a = this.f286834f.mo80993a();
                    if (a != null) {
                        int N = a.mo81135N();
                        vlVar.copyOnWrite();
                        C60589vm vmVar2 = (C60589vm) vlVar.instance;
                        vmVar2.f164365a |= 2;
                        vmVar2.f164367c = N;
                    }
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 1205;
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    C60589vm vmVar3 = (C60589vm) vlVar.build();
                    vmVar3.getClass();
                    ufVar2.f164168bV = vmVar3;
                    ufVar2.f164254i |= 32768;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                }
            }
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        C102732c cVar = this.f286837i;
        C87346a aVar = this.f286834f;
        ((C90476a) cVar.f286806a.mo17428b()).getClass();
        C68214a a = C68219e.m98518a(((C68226l) cVar.f286807b).f184585a);
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) cVar.f286808c).f184585a);
        a2.getClass();
        C90743b bVar = (C90743b) cVar.f286809d.mo17428b();
        bVar.getClass();
        aVar.getClass();
        this.f286838j = new C102731b(a, a2, bVar, aVar);
        mo93409e();
        this.f286836h.mo81046a(this.f63405W, C88244um.SHOW_MESSAGE_UI, new C102738g(this));
        this.f286836h.mo81046a(this.f63405W, C88244um.HIDE_MESSAGE_UI, new C102739h(this));
    }
}
