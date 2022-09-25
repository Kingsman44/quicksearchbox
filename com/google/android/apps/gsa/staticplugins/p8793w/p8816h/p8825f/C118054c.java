package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8825f;

import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87722bd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87723be;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87724bf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.f.c */
/* compiled from: PG */
public final class C118054c implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C118055d f327637a;

    public C118054c(C118055d dVar) {
        this.f327637a = dVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C118055d.f327638a.mo56225c()).mo56382g(th)).mo56372aa(18942)).mo56386p("Failed to get connectivity info; not showing offline UI");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118055d dVar = this.f327637a;
        if (!((C89062r) obj).mo83040a()) {
            C16730ar arVar = C16730ar.OFFLINE;
            C118056e eVar = dVar.f327641d;
            C87684al alVar = new C87684al(C88244um.CAR_ASSISTANT_NETWORK_STATE);
            C62940bt btVar = C87722bd.f237197a;
            C87723be beVar = (C87723be) C87724bf.f237198c.createBuilder();
            beVar.copyOnWrite();
            C87724bf bfVar = (C87724bf) beVar.instance;
            bfVar.f237201b = arVar.f48937e;
            bfVar.f237200a |= 1;
            alVar.mo81965b(btVar, (C87724bf) beVar.build());
            ServiceEventData a = alVar.mo81964a();
            C87682aj ajVar = eVar.f327642a.f234157a;
            if (ajVar != null) {
                ((C86771n) ajVar).mo80379b(a);
            }
        }
    }
}
