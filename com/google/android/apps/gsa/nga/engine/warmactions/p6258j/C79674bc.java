package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77828d;
import com.google.android.apps.gsa.nga.engine.warmactions.C79403a;
import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79476a;
import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79485j;
import com.google.android.apps.gsa.nga.engine.warmactions.p6253e.C79562t;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79580l;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79621d;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79630m;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79634q;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79635r;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79636s;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79637t;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79638u;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79639v;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79640w;
import com.google.android.apps.gsa.nga.engine.warmactions.p6257i.C79641x;
import com.google.android.apps.gsa.nga.engine.warmactions.p6259k.C79720c;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81014e;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.C66860cf;
import com.google.speech.p5218j.C66861cg;
import com.google.speech.p5218j.C67110lk;
import com.google.speech.p5218j.C67111ll;
import com.google.speech.p5218j.p5219a.C66714ar;
import com.google.speech.p5218j.p5219a.C66716at;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.bc */
/* compiled from: PG */
public final /* synthetic */ class C79674bc implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C79681bj f218514a;

    /* renamed from: b */
    public final /* synthetic */ C79485j f218515b;

    public /* synthetic */ C79674bc(C79681bj bjVar, C79485j jVar) {
        this.f218514a = bjVar;
        this.f218515b = jVar;
    }

    public final void run() {
        Optional optional;
        C79681bj bjVar = this.f218514a;
        C79485j jVar = this.f218515b;
        bjVar.f218528b.mo74167f(jVar);
        bjVar.f218530d.mo74135a(C79562t.SODA_START_CAPTURE);
        C79630m mVar = bjVar.f218529c;
        C79641x xVar = mVar.f218434e;
        C79476a aVar = (C79476a) jVar;
        C66751r rVar = (C66751r) ((C77828d) xVar.f218454b.mo27525b()).mo72813a(aVar.f218156a).toBuilder();
        rVar.copyOnWrite();
        C66752s sVar = (C66752s) rVar.instance;
        sVar.f181546a |= 2;
        sVar.f181548c = true;
        C58485gu b = C79720c.m127814b(((C79403a) aVar.f218157b).f218040a);
        C58495hd hdVar = (C58495hd) Collection.EL.stream(Collections.unmodifiableMap(((C79403a) aVar.f218157b).f218040a.f218319b).values()).map(C79636s.f218448a).filter(C79637t.f218449a).collect(C58370cn.m89403c(C79638u.f218450a, C79639v.f218451a, C79640w.f218452a));
        if (hdVar.isEmpty()) {
            xVar.mo74172c(b, 1);
            optional = Optional.empty();
        } else {
            xVar.mo74172c(b, 2);
            C66721ay ayVar = (C66721ay) C66722az.f181493f.createBuilder();
            C66714ar arVar = (C66714ar) C66716at.f181484b.createBuilder();
            C79580l lVar = C79641x.f218453a;
            arVar.mo59713b(lVar.f218355b, C79641x.m127706b(lVar));
            arVar.mo59712a(hdVar);
            ayVar.copyOnWrite();
            C66722az azVar = (C66722az) ayVar.instance;
            C66716at atVar = (C66716at) arVar.build();
            atVar.getClass();
            azVar.f181497c = atVar;
            azVar.f181495a |= 1;
            optional = Optional.m71637of((C66722az) ayVar.build());
        }
        Objects.requireNonNull(rVar);
        optional.ifPresent(new C79635r(rVar));
        C67110lk lkVar = (C67110lk) C67111ll.f182440c.createBuilder();
        C66860cf cfVar = (C66860cf) C66861cg.f181783b.createBuilder();
        cfVar.mo59745a((C58485gu) Collection.EL.stream(Collections.unmodifiableMap(((C79403a) aVar.f218157b).f218040a.f218319b).values()).flatMap(C79634q.f218446a).collect(C58370cn.f155946a));
        lkVar.copyOnWrite();
        C67111ll llVar = (C67111ll) lkVar.instance;
        C66861cg cgVar = (C66861cg) cfVar.build();
        cgVar.getClass();
        llVar.f182443b = cgVar;
        llVar.f182442a = 10;
        C60870cx b2 = mVar.mo74169b(new C79621d(mVar, (C67111ll) lkVar.build(), (C66752s) rVar.build()));
        ((C81014e) bjVar.f218531e).mo74792h(aVar.f218157b.mo74138d(), true);
        C79569ab abVar = ((C79403a) aVar.f218157b).f218040a;
        C90873ag agVar = new C90873ag(b2, bjVar.f218527a, "[NGA][WA] WarmActionsSoda.sodaCapture.callback", new C79677bf(bjVar, abVar));
        agVar.mo85224b(CancellationException.class, new C79678bg(bjVar, abVar));
        agVar.mo85224b(RuntimeException.class, new C79679bh(bjVar, abVar));
        agVar.mo85223a(new C79680bi(bjVar, abVar));
    }
}
