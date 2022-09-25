package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87312ak;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87333p;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90231g;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90232h;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91788al;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91863e;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105416x;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105455y;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7682ga;
import com.google.p375ai.p378b.C7684gc;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.dw */
/* compiled from: PG */
public final class C105282dw extends C23056g implements C90232h, C105416x {

    /* renamed from: e */
    private static final C59071e f293742e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.a.dw");

    /* renamed from: a */
    public final C105455y f293743a;

    /* renamed from: b */
    public final C22871g f293744b;

    /* renamed from: c */
    public final C91863e f293745c;

    /* renamed from: d */
    public final C86106b f293746d;

    /* renamed from: f */
    private final C87333p f293747f;

    public C105282dw(C23052c cVar, C105455y yVar, C22871g gVar, C87333p pVar, C91863e eVar, C86106b bVar) {
        super(cVar);
        this.f293743a = yVar;
        this.f293744b = gVar;
        this.f293747f = pVar;
        this.f293745c = eVar;
        this.f293746d = bVar;
    }

    /* renamed from: e */
    public final void mo94700e() {
        this.f293747f.mo80979a();
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        if ((((C7684gc) this.f293743a.mo94651g().f63720e).f26844a & 8) != 0) {
            C8178yk ykVar = ((C7684gc) this.f293743a.mo94651g().f63720e).f26848e;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            this.f293745c.mo86385b(ykVar, this.f293746d.mo79727b(), (C57057b) this.f293743a.mo94650f().f63720e, true);
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: iv */
    public final void mo83943iv(C90231g gVar) {
        if (!(gVar instanceof C87312ak)) {
            C59104x c = f293742e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SSSurveyController");
            ((C59052c) ((C59052c) c).mo56372aa(22288)).mo56386p("Did not receive correct type of params");
            return;
        }
        C87312ak akVar = (C87312ak) gVar;
        C7682ga gaVar = ((C91788al) akVar.f235801a.f252077a).f255960b;
        if (gaVar == null) {
            gaVar = C7682ga.f26836d;
        }
        C7684gc gcVar = gaVar.f26840c;
        if (gcVar == null) {
            gcVar = C7684gc.f26842l;
        }
        C57057b bVar = ((C91788al) akVar.f235801a.f252077a).f255961c;
        if (bVar == null) {
            bVar = C57057b.f152311e;
        }
        if ((gcVar.f26844a & 1) != 0) {
            ((C23251a) this.f293743a.mo94648d()).mo28730f(gcVar.f26845b, false);
        }
        if ((gcVar.f26844a & 2) != 0) {
            ((C23251a) this.f293743a.mo94647c()).mo28730f(gcVar.f26846c, false);
        }
        if ((gcVar.f26844a & 4) != 0) {
            ((C23251a) this.f293743a.mo94646b()).mo28730f(gcVar.f26847d, false);
        }
        this.f293743a.mo94651g().mo28730f(gcVar, false);
        this.f293743a.mo94650f().mo28730f(bVar, false);
        ((C23251a) this.f293743a.mo94649e()).mo28730f((Boolean) akVar.f235802b.f252077a, false);
    }
}
