package com.google.android.apps.gsa.staticplugins.microdetection;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.p7139a.C90515g;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.speech.p7140b.C90531a;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7294j.C92436f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.ab */
/* compiled from: PG */
public final class C102791ab extends C92436f {

    /* renamed from: a */
    final /* synthetic */ C102792ac f287013a;

    public C102791ab(C102792ac acVar) {
        this.f287013a = acVar;
    }

    /* renamed from: a */
    public final void mo87095a(C90528t tVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f287013a.f287015b.mo85091a();
        synchronized (this.f287013a) {
            C102792ac acVar = this.f287013a;
            if (acVar.f287021h) {
                acVar.mo93453a((C90531a) null, true, (tVar instanceof C90515g) && ((C90515g) tVar).f253080a, false, false);
            }
        }
    }

    /* renamed from: l */
    public final void mo87106l(HotwordResult hotwordResult) {
        boolean z;
        C58976aa aaVar = C58975e.f156826a;
        this.f287013a.f287015b.mo85091a();
        synchronized (this.f287013a) {
            C102792ac acVar = this.f287013a;
            if (acVar.f287021h && acVar.f287020g != null) {
                if (!(hotwordResult.mo84692j() == 0 || hotwordResult.mo84692j() == 1)) {
                    if (hotwordResult.mo84692j() == 2 && hotwordResult.mo84676A()) {
                    }
                    z = false;
                    this.f287013a.mo93453a(hotwordResult, false, false, z, false);
                }
                if (((C92486a) acVar.f287016c.mo27525b()).mo87252z(Query.f252741b.mo84296ah())) {
                    z = true;
                    this.f287013a.mo93453a(hotwordResult, false, false, z, false);
                }
                z = false;
                this.f287013a.mo93453a(hotwordResult, false, false, z, false);
            }
        }
    }

    /* renamed from: s */
    public final void mo87113s() {
        C102790aa aaVar;
        C58976aa aaVar2 = C58975e.f156826a;
        this.f287013a.f287015b.mo85091a();
        synchronized (this.f287013a) {
            C102792ac acVar = this.f287013a;
            if (acVar.f287021h && (aaVar = acVar.f287020g) != null) {
                C59104x b = MicroDetectionWorker.f286928a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
                ((C59052c) ((C59052c) b).mo56372aa(21069)).mo56386p("onReady");
                ((C102863s) aaVar).f287292a.f286948T.cancel(false);
                ((C102863s) aaVar).f287292a.f286971b.mo80470h();
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 492;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            }
        }
    }
}
