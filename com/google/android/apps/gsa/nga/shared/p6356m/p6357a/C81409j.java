package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.a.g;
import com.google.android.apps.gsa.nga.api.a.h;
import com.google.android.apps.gsa.nga.api.a.i;
import com.google.android.apps.gsa.nga.engine.ay.p;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.j */
/* compiled from: PG */
public final /* synthetic */ class C81409j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81412m f222792a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222793b;

    /* renamed from: c */
    public final /* synthetic */ p f222794c;

    public /* synthetic */ C81409j(C81412m mVar, C37672hs hsVar, p pVar) {
        this.f222792a = mVar;
        this.f222793b = hsVar;
        this.f222794c = pVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81412m mVar = this.f222792a;
        C37672hs hsVar = this.f222793b;
        p pVar = this.f222794c;
        mVar.f222804f.mo74833c(h.r);
        g createBuilder = i.c.createBuilder();
        h hVar = h.r;
        createBuilder.copyOnWrite();
        createBuilder.instance.a = hVar.getNumber();
        mVar.mo75061c(C81412m.m129498a(createBuilder.build(), hsVar));
        ((C58970a) ((C58970a) ((C58970a) C81412m.f222799a.mo56224b()).mo56382g((Exception) obj)).mo56372aa(5879)).mo56389s("Second stage hotword verification for %s invocation failed.", C81062c.m129010a(Optional.m71637of(hsVar)));
        mVar.f222805g.mo75059g(hsVar);
        pVar.a();
    }
}
