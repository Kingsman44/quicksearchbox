package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107488n;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107489o;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107494t;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.p */
/* compiled from: PG */
public final /* synthetic */ class C109602p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109578ae f305233a;

    /* renamed from: b */
    public final /* synthetic */ C87768cw f305234b;

    public /* synthetic */ C109602p(C109578ae aeVar, C87768cw cwVar) {
        this.f305233a = aeVar;
        this.f305234b = cwVar;
    }

    public final void run() {
        C109578ae aeVar = this.f305233a;
        String str = this.f305234b.f237530c;
        C52070ec ecVar = C22402a.f61894b;
        C58976aa aaVar = C58975e.f156826a;
        C107489o oVar = (C107489o) C107494t.f299090e.createBuilder();
        oVar.copyOnWrite();
        C107494t tVar = (C107494t) oVar.instance;
        str.getClass();
        tVar.f299092a |= 1;
        tVar.f299095d = str;
        C63088z byteString = ecVar.toByteString();
        oVar.copyOnWrite();
        C107494t tVar2 = (C107494t) oVar.instance;
        byteString.getClass();
        tVar2.f299093b = 2;
        tVar2.f299094c = byteString;
        C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
        C107502c cVar = C107502c.OPA_CLIENT_OP_RESULT;
        dVar.copyOnWrite();
        C107504e eVar = (C107504e) dVar.instance;
        eVar.f299118b = cVar.f299114n;
        eVar.f299117a |= 1;
        dVar.mo58885m(C107488n.f299083a, (C107494t) oVar.build());
        C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
        jVar.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
        ClientEventData a = jVar.mo82013a();
        aeVar.mo97904q();
        aeVar.f305180p.mo81937i(a);
    }
}
