package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8522c;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88345yf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88347yh;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111727h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111728i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.c.f */
/* compiled from: PG */
public final class C111720f implements C111728i, C87682aj {

    /* renamed from: a */
    final C107698i f310559a;

    /* renamed from: b */
    final C107710u f310560b;

    /* renamed from: c */
    final C22871g f310561c;

    /* renamed from: d */
    boolean f310562d;

    /* renamed from: e */
    C111727h f310563e;

    public C111720f(C107698i iVar, C107710u uVar, C22871g gVar) {
        this.f310559a = iVar;
        this.f310560b = uVar;
        this.f310561c = gVar;
    }

    /* renamed from: a */
    public final void mo99215a(C88344ye yeVar) {
        if (this.f310563e == null) {
            ((C59052c) ((C59052c) C111721g.f310564a.mo56225c()).mo56372aa(27354)).mo56386p("Response listener not set when first search request sent - responses may not be received!");
        }
        if (!this.f310562d) {
            this.f310561c.mo28212l("Register tapas search serviceEvent callback", new C111718d(this));
        }
        this.f310561c.mo28212l("Send tapas search clientEvent", new C111719e(this, yeVar));
    }

    /* renamed from: b */
    public final void mo99216b(C111727h hVar) {
        this.f310563e = hVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C62940bt btVar = C88345yf.f238922a;
        C88246uo uoVar = serviceEventData.f236959a;
        C62940bt r0 = C62942bv.checkIsLite(btVar);
        uoVar.mo58887l(r0);
        if (!uoVar.f169962ag.mo58857o(r0.f169971d)) {
            ((C59052c) ((C59052c) C111721g.f310564a.mo56226d()).mo56372aa(27353)).mo56386p("Invalid response: serviceEventData doesn't contain tapasServiceResponseEventData extension.");
            return;
        }
        C88347yh yhVar = (C88347yh) serviceEventData.mo81918e(C88345yf.f238922a);
        C111727h hVar = this.f310563e;
        if (hVar != null) {
            hVar.mo99219a(yhVar);
        }
    }
}
