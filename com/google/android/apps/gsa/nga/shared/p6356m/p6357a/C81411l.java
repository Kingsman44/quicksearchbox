package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.a.bo;
import com.google.android.apps.gsa.nga.api.a.bt;
import com.google.android.apps.gsa.nga.api.p5883a.C74672br;
import com.google.android.apps.gsa.nga.shared.p6339f.C81042c;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.l */
/* compiled from: PG */
public final /* synthetic */ class C81411l implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81412m f222797a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222798b;

    public /* synthetic */ C81411l(C81412m mVar, C37672hs hsVar) {
        this.f222797a = mVar;
        this.f222798b = hsVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81412m mVar = this.f222797a;
        C37672hs hsVar = this.f222798b;
        ((C58970a) ((C58970a) ((C58970a) C81412m.f222799a.mo56224b()).mo56382g((Exception) obj)).mo56372aa(5883)).mo56389s("Push-to-talk invocation  for %s got rejected.", C81062c.m129010a(Optional.m71637of(hsVar)));
        mVar.mo75061c(C81412m.m129499d(5, hsVar));
        mVar.f222805g.mo75059g(hsVar);
        C81042c cVar = mVar.f222804f;
        bo createBuilder = bt.c.createBuilder();
        createBuilder.copyOnWrite();
        bt btVar = createBuilder.instance;
        btVar.b = Integer.valueOf(C74672br.m120740b(5));
        btVar.a = 2;
        cVar.mo74834d(createBuilder.build());
    }
}
