package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79477b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79485j;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79553k;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79617a;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79630m;
import com.google.android.apps.gsa.nga.engine.warmactions.p6259k.C79720c;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.bj */
/* compiled from: PG */
public final class C79681bj implements C79649ae {

    /* renamed from: f */
    private static final C58974d f218526f = C58974d.m91136j();

    /* renamed from: a */
    public final C22871g f218527a;

    /* renamed from: b */
    public final C79617a f218528b;

    /* renamed from: c */
    public final C79630m f218529c;

    /* renamed from: d */
    public final C79553k f218530d;

    /* renamed from: e */
    public final C81013d f218531e;

    /* renamed from: g */
    private final C22871g f218532g;

    /* renamed from: h */
    private final C68214a f218533h;

    public C79681bj(C22871g gVar, C79617a aVar, C22871g gVar2, C79630m mVar, C79553k kVar, C81013d dVar, C68214a aVar2) {
        this.f218527a = gVar;
        this.f218528b = aVar;
        this.f218532g = gVar2;
        this.f218529c = mVar;
        this.f218530d = kVar;
        this.f218531e = dVar;
        this.f218533h = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo74179a() {
        return this.f218532g.mo28201a("[NGA][WA] SodaRecognitionHandler.initialize", new C79676be(this));
    }

    /* renamed from: b */
    public final C60870cx mo74180b(C79485j jVar) {
        return this.f218532g.mo28207g("[NGA][WA] SodaRecognitionHandler.startRecognition", new C79674bc(this, jVar));
    }

    /* renamed from: c */
    public final C60870cx mo74181c() {
        C22871g gVar = this.f218532g;
        C79630m mVar = this.f218529c;
        Objects.requireNonNull(mVar);
        return gVar.mo28207g("[NGA][WA] SodaRecognitionHandler.uninitialize", new C79675bd(mVar));
    }

    /* renamed from: d */
    public final void mo74187d(C79569ab abVar, Exception exc) {
        ((C58970a) ((C58970a) ((C58970a) f218526f.mo56225c()).mo56382g(exc)).mo56372aa(5772)).mo56389s("#MWW recognition for %s failed.", C79720c.m127813a(abVar));
        this.f218531e.mo74789e(C79720c.m127814b(abVar), 2);
        ((C79477b) this.f218533h.mo27525b()).mo74087b();
    }
}
