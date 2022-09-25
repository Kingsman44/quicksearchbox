package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9234c;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121494b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121495c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121496d;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121501i;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121502j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4001w.p4002a.C53495b;
import com.google.assistant.p4001w.p4002a.C53496c;
import com.google.assistant.p4001w.p4002a.C53497d;
import com.google.assistant.p4001w.p4002a.C53501h;
import com.google.assistant.p4001w.p4002a.C53503j;
import com.google.assistant.p4001w.p4002a.C53505l;
import com.google.assistant.p4001w.p4002a.C53506m;
import com.google.assistant.p4001w.p4002a.C53507n;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.c.e */
/* compiled from: PG */
final class C121516e implements C121496d {

    /* renamed from: a */
    public static final C59071e f337220a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.e.a.c.e");

    /* renamed from: d */
    private static final long f337221d = new Random().nextLong();

    /* renamed from: b */
    public final OutputStream f337222b;

    /* renamed from: c */
    public boolean f337223c;

    /* renamed from: e */
    private final Executor f337224e;

    /* renamed from: f */
    private final BlockingQueue f337225f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final AtomicInteger f337226g = new AtomicInteger(0);

    public C121516e(OutputStream outputStream, Executor executor) {
        this.f337224e = executor;
        this.f337222b = outputStream;
    }

    /* renamed from: b */
    public static C121516e m200808b(File file, Executor executor) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        ((C59052c) ((C59052c) f337220a.mo56224b()).mo56372aa(35847)).mo56389s("Opened profile output file %s", file);
        return new C121516e(bufferedOutputStream, executor);
    }

    /* renamed from: i */
    public static C53497d m200809i(C121501i iVar) {
        C53496c cVar = (C53496c) C53497d.f140387d.createBuilder();
        String a = iVar.mo105193a();
        cVar.copyOnWrite();
        C53497d dVar = (C53497d) cVar.instance;
        a.getClass();
        dVar.f140389a |= 1;
        dVar.f140390b = a;
        String b = iVar.mo105194b();
        cVar.copyOnWrite();
        C53497d dVar2 = (C53497d) cVar.instance;
        b.getClass();
        dVar2.f140389a |= 2;
        dVar2.f140391c = b;
        return (C53497d) cVar.build();
    }

    /* renamed from: m */
    private static C53506m m200810m(C121502j jVar) {
        C53506m mVar = (C53506m) C53507n.f140428l.createBuilder();
        C121494b bVar = (C121494b) jVar;
        C53497d i = m200809i(bVar.f337167a);
        mVar.copyOnWrite();
        C53507n nVar = (C53507n) mVar.instance;
        i.getClass();
        nVar.f140432c = i;
        nVar.f140430a |= 2;
        String str = bVar.f337168b;
        mVar.copyOnWrite();
        C53507n nVar2 = (C53507n) mVar.instance;
        nVar2.f140430a |= 4;
        nVar2.f140433d = str;
        long j = f337221d;
        mVar.copyOnWrite();
        C53507n nVar3 = (C53507n) mVar.instance;
        nVar3.f140430a |= 256;
        nVar3.f140440k = j;
        long id = Thread.currentThread().getId();
        mVar.copyOnWrite();
        C53507n nVar4 = (C53507n) mVar.instance;
        nVar4.f140430a |= 128;
        nVar4.f140439j = id;
        mVar.mo53987a((Iterable) Collection.EL.stream(bVar.f337169c).map(C121515d.f337219a).collect(Collectors.toList()));
        return mVar;
    }

    /* renamed from: n */
    private final void m200811n(C53506m mVar) {
        this.f337225f.offer(new C121512a(this, mVar));
        if (this.f337226g.incrementAndGet() % 100 == 0) {
            this.f337224e.execute(C47810es.m84977q(new C121513b(this)));
        }
    }

    /* renamed from: a */
    public final C121495c mo105181a() {
        return C121495c.FULL;
    }

    /* renamed from: c */
    public final void mo105182c(C121502j jVar, Instant instant, Duration duration, String str) {
        C53506m m = m200810m(jVar);
        m.copyOnWrite();
        C53507n nVar = (C53507n) m.instance;
        C53507n nVar2 = C53507n.f140428l;
        nVar.f140431b = 4;
        nVar.f140430a |= 1;
        C63042fg c = C62950b.m95472c(instant);
        m.copyOnWrite();
        C53507n nVar3 = (C53507n) m.instance;
        c.getClass();
        nVar3.f140435f = c;
        nVar3.f140430a |= 8;
        C62910ar a = C62950b.m95470a(duration);
        m.copyOnWrite();
        C53507n nVar4 = (C53507n) m.instance;
        a.getClass();
        nVar4.f140436g = a;
        nVar4.f140430a |= 16;
        m.copyOnWrite();
        C53507n nVar5 = (C53507n) m.instance;
        nVar5.f140430a |= 64;
        nVar5.f140438i = str;
        m200811n(m);
    }

    /* renamed from: d */
    public final void mo105183d(C121502j jVar, Instant instant) {
        C53506m m = m200810m(jVar);
        m.copyOnWrite();
        C53507n nVar = (C53507n) m.instance;
        C53507n nVar2 = C53507n.f140428l;
        nVar.f140431b = 2;
        nVar.f140430a |= 1;
        C63042fg c = C62950b.m95472c(instant);
        m.copyOnWrite();
        C53507n nVar3 = (C53507n) m.instance;
        c.getClass();
        nVar3.f140435f = c;
        nVar3.f140430a |= 8;
        m200811n(m);
    }

    /* renamed from: e */
    public final void mo105184e(C121502j jVar, long j) {
        C53506m m = m200810m(jVar);
        m.copyOnWrite();
        C53507n nVar = (C53507n) m.instance;
        C53507n nVar2 = C53507n.f140428l;
        nVar.f140431b = 3;
        nVar.f140430a |= 1;
        m.copyOnWrite();
        C53507n nVar3 = (C53507n) m.instance;
        nVar3.f140430a |= 32;
        nVar3.f140437h = j;
        m200811n(m);
    }

    /* renamed from: f */
    public final void mo105185f(C121502j jVar, Instant instant, Duration duration) {
        C53506m m = m200810m(jVar);
        m.copyOnWrite();
        C53507n nVar = (C53507n) m.instance;
        C53507n nVar2 = C53507n.f140428l;
        nVar.f140431b = 1;
        nVar.f140430a = 1 | nVar.f140430a;
        C63042fg c = C62950b.m95472c(instant);
        m.copyOnWrite();
        C53507n nVar3 = (C53507n) m.instance;
        c.getClass();
        nVar3.f140435f = c;
        nVar3.f140430a |= 8;
        C62910ar a = C62950b.m95470a(duration);
        m.copyOnWrite();
        C53507n nVar4 = (C53507n) m.instance;
        a.getClass();
        nVar4.f140436g = a;
        nVar4.f140430a |= 16;
        m200811n(m);
    }

    /* renamed from: g */
    public final boolean mo105186g(C121500h hVar, C121501i iVar) {
        return true;
    }

    /* renamed from: h */
    public final void mo105187h(Instant instant, Duration duration, C53503j jVar) {
        this.f337224e.execute(C47810es.m84977q(new C121514c(this, instant, duration, jVar)));
    }

    /* renamed from: j */
    public final synchronized void mo105212j() {
        while (!this.f337225f.isEmpty()) {
            Runnable runnable = (Runnable) this.f337225f.poll();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: k */
    public final void mo105213k(Instant instant, Duration duration, C53503j jVar) {
        C62910ar arVar = jVar.f140414e;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        Instant plus = instant.plus(duration.minus(C62950b.m95473d(arVar)).dividedBy(2));
        long j = jVar.f140413d;
        C53506m mVar = (C53506m) C53507n.f140428l.createBuilder();
        mVar.copyOnWrite();
        C53507n nVar = (C53507n) mVar.instance;
        nVar.f140431b = 1;
        nVar.f140430a |= 1;
        C53496c cVar = (C53496c) C53497d.f140387d.createBuilder();
        String str = jVar.f140411b;
        cVar.copyOnWrite();
        C53497d dVar = (C53497d) cVar.instance;
        str.getClass();
        dVar.f140389a |= 1;
        dVar.f140390b = str;
        cVar.copyOnWrite();
        C53497d dVar2 = (C53497d) cVar.instance;
        dVar2.f140389a |= 2;
        dVar2.f140391c = "RPC_handler";
        C53497d dVar3 = (C53497d) cVar.build();
        mVar.copyOnWrite();
        C53507n nVar2 = (C53507n) mVar.instance;
        dVar3.getClass();
        nVar2.f140432c = dVar3;
        nVar2.f140430a |= 2;
        C63042fg c = C62950b.m95472c(plus);
        mVar.copyOnWrite();
        C53507n nVar3 = (C53507n) mVar.instance;
        c.getClass();
        nVar3.f140435f = c;
        nVar3.f140430a |= 8;
        C62910ar arVar2 = jVar.f140414e;
        if (arVar2 == null) {
            arVar2 = C62910ar.f169858c;
        }
        mVar.copyOnWrite();
        C53507n nVar4 = (C53507n) mVar.instance;
        arVar2.getClass();
        nVar4.f140436g = arVar2;
        nVar4.f140430a |= 16;
        mVar.copyOnWrite();
        C53507n nVar5 = (C53507n) mVar.instance;
        nVar5.f140430a |= 256;
        nVar5.f140440k = j;
        mVar.copyOnWrite();
        C53507n nVar6 = (C53507n) mVar.instance;
        nVar6.f140430a |= 128;
        nVar6.f140439j = 0;
        m200811n(mVar);
        for (C53505l lVar : jVar.f140415f) {
            C53506m mVar2 = (C53506m) C53507n.f140428l.createBuilder();
            int a = C53495b.m86821a(lVar.f140419a);
            if (a == 0) {
                a = 1;
            }
            mVar2.copyOnWrite();
            C53507n nVar7 = (C53507n) mVar2.instance;
            nVar7.f140431b = a - 1;
            nVar7.f140430a |= 1;
            C53497d dVar4 = lVar.f140420b;
            if (dVar4 == null) {
                dVar4 = C53497d.f140387d;
            }
            mVar2.copyOnWrite();
            C53507n nVar8 = (C53507n) mVar2.instance;
            dVar4.getClass();
            nVar8.f140432c = dVar4;
            nVar8.f140430a |= 2;
            mVar2.mo53987a(lVar.f140421c);
            C62910ar arVar3 = lVar.f140422d;
            if (arVar3 == null) {
                arVar3 = C62910ar.f169858c;
            }
            C63042fg c2 = C62950b.m95472c(plus.plus(C62950b.m95473d(arVar3)));
            mVar2.copyOnWrite();
            C53507n nVar9 = (C53507n) mVar2.instance;
            c2.getClass();
            nVar9.f140435f = c2;
            nVar9.f140430a |= 8;
            C62910ar arVar4 = lVar.f140423e;
            if (arVar4 == null) {
                arVar4 = C62910ar.f169858c;
            }
            mVar2.copyOnWrite();
            C53507n nVar10 = (C53507n) mVar2.instance;
            arVar4.getClass();
            nVar10.f140436g = arVar4;
            nVar10.f140430a |= 16;
            long j2 = lVar.f140424f;
            mVar2.copyOnWrite();
            C53507n nVar11 = (C53507n) mVar2.instance;
            nVar11.f140430a |= 32;
            nVar11.f140437h = j2;
            String str2 = lVar.f140425g;
            mVar2.copyOnWrite();
            C53507n nVar12 = (C53507n) mVar2.instance;
            str2.getClass();
            nVar12.f140430a |= 64;
            nVar12.f140438i = str2;
            mVar2.copyOnWrite();
            C53507n nVar13 = (C53507n) mVar2.instance;
            nVar13.f140430a |= 256;
            nVar13.f140440k = j;
            long j3 = lVar.f140426h;
            mVar2.copyOnWrite();
            C53507n nVar14 = (C53507n) mVar2.instance;
            nVar14.f140430a |= 128;
            nVar14.f140439j = j3;
            m200811n(mVar2);
        }
        for (C53501h hVar : jVar.f140416g) {
            C62910ar arVar5 = hVar.f140406c;
            if (arVar5 == null) {
                arVar5 = C62910ar.f169858c;
            }
            Duration d = C62950b.m95473d(arVar5);
            if (d.isNegative()) {
                d = d.negated();
            }
            C62910ar arVar6 = hVar.f140405b;
            if (arVar6 == null) {
                arVar6 = C62910ar.f169858c;
            }
            Instant plus2 = plus.plus(C62950b.m95473d(arVar6));
            C53503j jVar2 = hVar.f140407d;
            if (jVar2 == null) {
                jVar2 = C53503j.f140408h;
            }
            mo105213k(plus2, d, jVar2);
        }
    }

    /* renamed from: l */
    public final synchronized void mo105214l() {
        mo105212j();
        this.f337223c = true;
        try {
            this.f337222b.close();
            ((C59052c) ((C59052c) f337220a.mo56224b()).mo56372aa(35849)).mo56386p("Closed profile output stream.");
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f337220a.mo56226d()).mo56382g(e)).mo56372aa(35850)).mo56386p("Failed to close profiling output stream.");
        }
    }
}
