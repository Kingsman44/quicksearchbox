package com.google.android.apps.gsa.nga.shared.p6356m.p6357a;

import com.google.android.apps.gsa.nga.api.a.ab;
import com.google.android.apps.gsa.nga.api.a.ad;
import com.google.android.apps.gsa.nga.api.a.cp;
import com.google.android.apps.gsa.nga.api.a.cr;
import com.google.android.apps.gsa.nga.api.a.de;
import com.google.android.apps.gsa.nga.api.a.df;
import com.google.android.apps.gsa.nga.api.a.di;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.m.a.f */
/* compiled from: PG */
public final /* synthetic */ class C81405f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81412m f222783a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f222784b;

    public /* synthetic */ C81405f(C81412m mVar, C37672hs hsVar) {
        this.f222783a = mVar;
        this.f222784b = hsVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81412m mVar = this.f222783a;
        C37672hs hsVar = this.f222784b;
        ((C58970a) ((C58970a) ((C58970a) C81412m.f222799a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(5887)).mo56389s("Transcription invocation for %s had unexpected failure", C81062c.m129010a(Optional.m71637of(hsVar)));
        cr createBuilder = df.c.createBuilder();
        de deVar = de.a;
        createBuilder.copyOnWrite();
        df dfVar = createBuilder.instance;
        deVar.getClass();
        dfVar.b = deVar;
        dfVar.a = 6;
        df build = createBuilder.build();
        cp createBuilder2 = di.c.createBuilder();
        createBuilder2.copyOnWrite();
        di diVar = createBuilder2.instance;
        build.getClass();
        diVar.b = build;
        diVar.a = 2;
        ab createBuilder3 = ad.d.createBuilder();
        createBuilder3.copyOnWrite();
        hsVar.getClass();
        createBuilder3.instance.c = hsVar;
        createBuilder3.copyOnWrite();
        ad adVar = createBuilder3.instance;
        build.getClass();
        adVar.b = build;
        adVar.a = 4;
        mVar.mo75061c(createBuilder3.build());
        mVar.f222804f.mo74835e(createBuilder2.build());
    }
}
