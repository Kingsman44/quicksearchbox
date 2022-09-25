package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import com.google.android.apps.gsa.nga.engine.understanding.C79007bd;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.cg */
/* compiled from: PG */
final class C76989cg implements C22868d {

    /* renamed from: a */
    private final C83305i f212511a;

    /* renamed from: b */
    private final C58974d f212512b;

    public C76989cg(C83305i iVar, C58974d dVar) {
        this.f212511a = iVar;
        this.f212512b = dVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f212512b.mo56225c()).mo56382g(th)).mo56372aa(3705)).mo56386p("Cannot log UnderstandingStreamzEvents.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C79007bd bdVar = (C79007bd) obj;
        Stream flatMap = Stream.CC.m71936of((T[]) new Stream[]{Collection.EL.stream(bdVar.mo73769c()).map(C76939bu.f212430a), Collection.EL.stream(bdVar.mo73768b()).map(C76944bz.f212435a), Collection.EL.stream(bdVar.mo73767a()).map(C76983ca.f212505a), Collection.EL.stream(bdVar.mo73772f()).map(C76984cb.f212506a), Collection.EL.stream(bdVar.mo73771e()).map(C76985cc.f212507a), Collection.EL.stream(bdVar.mo73770d()).map(C76986cd.f212508a), Collection.EL.stream(bdVar.mo73775i()).map(C76987ce.f212509a), Collection.EL.stream(bdVar.mo73774h()).map(C76988cf.f212510a), Collection.EL.stream(bdVar.mo73773g()).map(C76940bv.f212431a)}).flatMap(C76941bw.f212432a);
        C83305i iVar = this.f212511a;
        Objects.requireNonNull(iVar);
        flatMap.forEach(new C76942bx(iVar));
        Optional j = bdVar.mo73776j();
        C83305i iVar2 = this.f212511a;
        Objects.requireNonNull(iVar2);
        j.ifPresent(new C76943by(iVar2));
        if (bdVar.mo73776j().isEmpty()) {
            ((C58970a) ((C58970a) this.f212512b.mo56225c()).mo56372aa(3706)).mo56386p("LockscreenArbitrationEvent is missing");
        }
    }
}
