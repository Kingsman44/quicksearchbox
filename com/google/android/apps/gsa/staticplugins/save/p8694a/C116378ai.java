package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1880l.C22876d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4570p.C60355ak;
import com.google.common.p4552o.p4570p.C60357am;
import com.google.common.p4552o.p4570p.C60358an;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.ai */
/* compiled from: PG */
final class C116378ai implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C116381al f322710a;

    public C116378ai(C116381al alVar) {
        this.f322710a = alVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C116381al.f322713a.mo56225c()).mo56382g(th)).mo56372aa(31786)).mo56386p("Save cache request failed.");
        this.f322710a.mo102675q(th, 720913);
        this.f322710a.mo102678t();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            this.f322710a.mo102671m();
        } else {
            this.f322710a.mo102680v();
        }
        C22876d dVar = this.f322710a.f322720h;
        if ((dVar.f62946a & 512) == 0 || (i = C60357am.m92571a(dVar.f62954i)) == 0) {
            i = 1;
        }
        boolean booleanValue = bool.booleanValue();
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1082;
        C60355ak akVar = (C60355ak) C60358an.f163360d.createBuilder();
        akVar.copyOnWrite();
        C60358an anVar = (C60358an) akVar.instance;
        anVar.f163362a |= 1;
        anVar.f163363b = !booleanValue;
        akVar.copyOnWrite();
        C60358an anVar2 = (C60358an) akVar.instance;
        anVar2.f163364c = i - 1;
        anVar2.f163362a |= 2;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60358an anVar3 = (C60358an) akVar.build();
        anVar3.getClass();
        ufVar2.f164151bE = anVar3;
        ufVar2.f164253h |= 32768;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
