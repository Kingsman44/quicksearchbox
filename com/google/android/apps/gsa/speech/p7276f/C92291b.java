package com.google.android.apps.gsa.speech.p7276f;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92517c;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.speech.f.b */
/* compiled from: PG */
final class C92291b implements C92515a {

    /* renamed from: a */
    final /* synthetic */ C92518d f257353a;

    /* renamed from: b */
    final /* synthetic */ C89994f f257354b;

    /* renamed from: c */
    final /* synthetic */ C92292c f257355c;

    public C92291b(C92292c cVar, C92518d dVar, C89994f fVar) {
        this.f257355c = cVar;
        this.f257353a = dVar;
        this.f257354b = fVar;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        if (!z) {
            C59104x d = C92292c.f257356a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CfgFlagsChangeBroadcast");
            ((C59052c) ((C59052c) d).mo56372aa(12422)).mo56386p("Cannot connect to GSA VIS");
        } else if (!this.f257353a.mo87279g() || this.f257353a.mo87280h()) {
            C59104x b = C92292c.f257356a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CfgFlagsChangeBroadcast");
            ((C59052c) ((C59052c) b).mo56372aa(12423)).mo56386p("Hardware not available or user identification happens at DSP level");
            this.f257354b.mo83900at();
        } else {
            C58976aa aaVar = C58975e.f156826a;
            this.f257353a.mo87282j();
            if (this.f257353a.mo87282j()) {
                this.f257353a.mo87285m(new C91093c(this.f257355c.f257357b), (C92517c) null);
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1138;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                ((C90929bz) this.f257355c.f257358c.mo27525b()).mo85137b(new C92290a(this), 1000);
            }
            this.f257354b.mo83900at();
        }
    }

    /* renamed from: b */
    public final void mo49376b() {
    }
}
