package com.google.android.apps.gsa.staticplugins.messages.monet.p8035b;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102721b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60572uw;
import com.google.common.p4552o.C60586vj;
import com.google.common.p4552o.C60587vk;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.b.k */
/* compiled from: PG */
final class C102742k implements C102746o {

    /* renamed from: a */
    final /* synthetic */ C102743l f286828a;

    public C102742k(C102743l lVar) {
        this.f286828a = lVar;
    }

    /* renamed from: e */
    private final void m170345e(C87544b bVar) {
        C87544b[] values = C87544b.values();
        C87544b bVar2 = values[(Arrays.asList(values).indexOf(bVar) + 1) % values.length];
        if (bVar2 == C87544b.UNKNOWN_MESSAGE) {
            m170345e(bVar2);
        } else {
            this.f286828a.mo93410f(C58485gu.m89846n(bVar2));
        }
    }

    /* renamed from: f */
    private static final void m170346f(C60572uw uwVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1075;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164149bC = uwVar.f164316f;
        ufVar2.f164253h |= 4096;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: a */
    public final void mo93405a(C87544b bVar, C102721b bVar2) {
        C58976aa aaVar = C58975e.f156826a;
        C60586vj vjVar = (C60586vj) C60587vk.f164357e.createBuilder();
        int i = bVar2.f286769o;
        vjVar.copyOnWrite();
        C60587vk vkVar = (C60587vk) vjVar.instance;
        vkVar.f164359a |= 1;
        vkVar.f164360b = i;
        int i2 = bVar.f236491v;
        vjVar.copyOnWrite();
        C60587vk vkVar2 = (C60587vk) vjVar.instance;
        vkVar2.f164359a |= 2;
        vkVar2.f164361c = i2;
        SearchError a = this.f286828a.f286834f.mo80993a();
        if (a != null) {
            int N = a.mo81135N();
            vjVar.copyOnWrite();
            C60587vk vkVar3 = (C60587vk) vjVar.instance;
            vkVar3.f164359a |= 4;
            vkVar3.f164362d = N;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1204;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60587vk vkVar4 = (C60587vk) vjVar.build();
        vkVar4.getClass();
        ufVar2.f164169bW = vkVar4;
        ufVar2.f164254i |= 65536;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        Query b = this.f286828a.f286833e.mo81003b();
        switch (bVar2.ordinal()) {
            case 2:
                new C90873ag(this.f286828a.f286830b.mo78524a(), this.f286828a.f286832d, "Handle enqueueLanguagePackDownload future", new C102740i(this)).mo85223a(C102741j.f286827a);
                return;
            case 4:
                this.f286828a.f286830b.mo78526c();
                return;
            case 5:
                this.f286828a.f286830b.mo78527d();
                return;
            case 6:
                this.f286828a.f286830b.mo78528e();
                return;
            case 7:
                this.f286828a.f286830b.mo78529f();
                return;
            case 8:
                this.f286828a.f286830b.mo78530g();
                return;
            case 9:
                C87348a aVar = this.f286828a.f286833e;
                C90498f i3 = b.mo84480i();
                i3.mo84572d(137438953472L, 0);
                i3.mo84577i();
                aVar.mo81004c(i3.mo84568a());
                return;
            case 10:
                this.f286828a.f286830b.mo78532i();
                return;
            case 11:
                this.f286828a.f286830b.mo78531h();
                return;
            case 12:
                m170345e(bVar);
                return;
            case 13:
                this.f286828a.f286830b.mo78532i();
                return;
            default:
                C59104x c = C102743l.f286829a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MCContainerController");
                C59052c cVar = (C59052c) c;
                cVar.mo56378ag(C58975e.f156826a, "MessageCardCallback");
                ((C59052c) cVar.mo56372aa(21030)).mo56389s("Unknown button type %s, do nothing.", bVar2.name());
                return;
        }
    }

    /* renamed from: b */
    public final void mo93406b(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f286828a.f286831c.mo78691a();
        }
    }

    /* renamed from: c */
    public final void mo93407c(C60572uw uwVar) {
        C58976aa aaVar = C58975e.f156826a;
        m170346f(uwVar);
        if (uwVar != C60572uw.STATUS_CONFIRM && uwVar != C60572uw.STATUS_FINISHED) {
            return;
        }
        if (!this.f286828a.f286834f.mo80995c()) {
            m170346f(C60572uw.STATUS_NOT_LAUNCHED);
        } else if (this.f286828a.f286834f.mo80996d()) {
            m170346f(C60572uw.STATUS_NOT_LAUNCHED);
        } else {
            this.f286828a.f286830b.mo78525b(this.f286828a.f286833e.mo81003b());
        }
    }

    /* renamed from: d */
    public final void mo93408d() {
        C58976aa aaVar = C58975e.f156826a;
        C89949q.m146523g(1048);
        this.f286828a.f286830b.mo78533j();
    }
}
