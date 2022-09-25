package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14744n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16349aw;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.v */
/* compiled from: PG */
final class C14933v implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C14934w f44870a;

    public C14933v(C14934w wVar) {
        this.f44870a = wVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C14935x.f44872a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(45508)).mo56386p("Error while getting contextual suggestions on suggestion service callback");
        this.f44870a.f44871a.mo21858f();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C16349aw awVar = (C16349aw) obj;
        if (this.f44870a.f44871a.f44879h.isEmpty()) {
            this.f44870a.f44871a.f44873b.mo19974a(C37182a.f97970dq.mo40805c(C62722b.OK));
        }
        this.f44870a.f44871a.f44879h = Optional.m71637of((C58485gu) Collection.EL.stream(awVar.f48129b).filter(C14930s.f44867a).filter(C14931t.f44868a).map(C14932u.f44869a).collect(C58370cn.f155946a));
        C58976aa aaVar = C58975e.f156826a;
        ((C58485gu) this.f44870a.f44871a.f44879h.get()).size();
        this.f44870a.f44871a.f44876e.mo21875g(C14744n.m31056a());
    }
}
