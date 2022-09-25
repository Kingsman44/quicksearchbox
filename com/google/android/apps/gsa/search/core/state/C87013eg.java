package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87722bd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87723be;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87724bf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.search.core.state.eg */
/* compiled from: PG */
public final /* synthetic */ class C87013eg implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87023eq f235003a;

    public /* synthetic */ C87013eg(C87023eq eqVar) {
        this.f235003a = eqVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87023eq eqVar = this.f235003a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && axVar.mo56107c() != null && ((Boolean) axVar.mo56107c()).equals(Boolean.TRUE)) {
            C85005h hVar = eqVar.f235043h;
            C87684al alVar = new C87684al(C88244um.CAR_ASSISTANT_NETWORK_STATE);
            C62940bt btVar = C87722bd.f237197a;
            C87723be beVar = (C87723be) C87724bf.f237198c.createBuilder();
            C16730ar arVar = C16730ar.OFFLINE;
            beVar.copyOnWrite();
            C87724bf bfVar = (C87724bf) beVar.instance;
            bfVar.f237201b = arVar.f48937e;
            bfVar.f237200a |= 1;
            alVar.mo81965b(btVar, (C87724bf) beVar.build());
            hVar.mo78609E(alVar.mo81964a());
        }
    }
}
