package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7459aa.C94785f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.at */
/* compiled from: PG */
public final /* synthetic */ class C94689at implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C86232bo f264804a;

    /* renamed from: b */
    public final /* synthetic */ C22871g f264805b;

    /* renamed from: c */
    public final /* synthetic */ C94785f f264806c;

    /* renamed from: d */
    public final /* synthetic */ SettableFuture f264807d;

    public /* synthetic */ C94689at(C86232bo boVar, C22871g gVar, C94785f fVar, SettableFuture settableFuture) {
        this.f264804a = boVar;
        this.f264805b = gVar;
        this.f264806c = fVar;
        this.f264807d = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C86232bo boVar = this.f264804a;
        C22871g gVar = this.f264805b;
        C94785f fVar = this.f264806c;
        SettableFuture settableFuture = this.f264807d;
        C58833ax axVar = (C58833ax) obj;
        if (!boVar.mo79882R() || (axVar != null && axVar.mo56113h() && !((ActionData) axVar.mo56107c()).equals(ActionData.f235991b))) {
            settableFuture.mo57356n(axVar);
        } else {
            gVar.mo28212l("failed", new C94675af(fVar));
        }
    }
}
