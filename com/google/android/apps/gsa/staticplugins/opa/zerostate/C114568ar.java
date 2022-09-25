package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.view.View;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114864dg;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.ar */
/* compiled from: PG */
final class C114568ar implements C114864dg {

    /* renamed from: a */
    final /* synthetic */ boolean f317701a;

    /* renamed from: b */
    final /* synthetic */ C53270hr f317702b;

    /* renamed from: c */
    final /* synthetic */ C53287ih f317703c;

    /* renamed from: d */
    final /* synthetic */ C114575ay f317704d;

    public C114568ar(C114575ay ayVar, boolean z, C53270hr hrVar, C53287ih ihVar) {
        this.f317704d = ayVar;
        this.f317701a = z;
        this.f317702b = hrVar;
        this.f317703c = ihVar;
    }

    /* renamed from: a */
    public final void mo101408a(C89062r rVar) {
        if (!rVar.mo83040a()) {
            this.f317704d.mo101415e(false);
            this.f317704d.mo101426p();
            return;
        }
        View view = this.f317704d.f317715D;
        if (view != null) {
            view.setVisibility(8);
        }
        C114575ay ayVar = this.f317704d;
        if (ayVar.f317759s) {
            C59104x d = C114575ay.f317711a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSMainController");
            ((C59052c) ((C59052c) d).mo56372aa(29148)).mo56386p("#maybeShowLoadingAnimationAndRefreshContent(): It's currently refreshing.");
            return;
        }
        ayVar.f317759s = true;
        if (ayVar.f317749i.mo79746e(C90080ee.f249815n)) {
            this.f317704d.f317755o.mo101589a();
        }
        if (this.f317701a) {
            this.f317704d.mo101425o();
        } else {
            C114711cl clVar = this.f317704d.f317713B;
            if (clVar != null) {
                clVar.f318305a = C58485gu.m89845m();
                clVar.mObservable.mo2879a();
            }
            this.f317704d.mo101413c(C60856cj.m92900i(false));
        }
        this.f317704d.mo101436z(this.f317702b, this.f317703c);
    }
}
