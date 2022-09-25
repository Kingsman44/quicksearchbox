package com.google.android.apps.gsa.nga.engine.warmactions.p6257i;

import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79491p;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C66993hb;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66999hh;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.i.m */
/* compiled from: PG */
public final class C79630m implements C90991b {

    /* renamed from: a */
    public static final C58974d f218430a = C58974d.m91136j();

    /* renamed from: b */
    public final C91142g f218431b;

    /* renamed from: c */
    public final C79619b f218432c;

    /* renamed from: d */
    public final C79631n f218433d;

    /* renamed from: e */
    public final C79641x f218434e;

    /* renamed from: f */
    public final Optional f218435f;

    /* renamed from: g */
    public final Optional f218436g;

    /* renamed from: h */
    public final C81459h f218437h;

    /* renamed from: i */
    public final AtomicReference f218438i = new AtomicReference(Optional.empty());

    /* renamed from: j */
    public final ReadWriteLock f218439j = new ReentrantReadWriteLock();

    /* renamed from: k */
    public final C79491p f218440k;

    /* renamed from: l */
    public Optional f218441l = Optional.empty();

    /* renamed from: m */
    public Soda f218442m;

    public C79630m(C91142g gVar, C79619b bVar, C79631n nVar, C79641x xVar, Optional optional, C22871g gVar2, C81465n nVar2, Optional optional2, C79491p pVar) {
        this.f218431b = gVar;
        this.f218432c = bVar;
        this.f218433d = nVar;
        this.f218434e = xVar;
        this.f218435f = optional;
        this.f218436g = optional2;
        this.f218440k = pVar;
        this.f218437h = nVar2.mo75095b(gVar2, C79620c.f218421a);
    }

    /* renamed from: a */
    public final Soda mo74168a() {
        Soda soda = this.f218442m;
        if (soda != null) {
            return soda;
        }
        throw new C79629l();
    }

    /* renamed from: b */
    public final C60870cx mo74169b(Function function) {
        Lock readLock = this.f218439j.readLock();
        readLock.lock();
        try {
            return (C60870cx) function.apply(mo74168a());
        } finally {
            readLock.unlock();
        }
    }

    /* renamed from: c */
    public final void mo74170c() {
        this.f218441l.ifPresent(C79623f.f218426a);
        this.f218441l = Optional.empty();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C66999hh a = this.f218434e.mo74171a();
        C66997hf hfVar = a.f182132d;
        if (hfVar == null) {
            hfVar = C66997hf.f182099z;
        }
        String str = hfVar.f182115n;
        fVar.mo85291r("MWW SODA");
        fVar.mo85278b("LP version").mo85276a(C90752i.m148230d(Integer.valueOf(C19245ah.m36693a(str))));
        fVar.mo85278b("LP locale").mo85276a(C90752i.m148229c(C19245ah.m36701i(str)));
        C91005e b = fVar.mo85278b("ASR mode");
        C66997hf hfVar2 = a.f182132d;
        if (hfVar2 == null) {
            hfVar2 = C66997hf.f182099z;
        }
        int a2 = C66993hb.m97403a(hfVar2.f182104c);
        b.mo85276a(C90752i.m148229c((a2 == 0 || a2 == 1) ? "DEFAULT_OFF" : a2 != 2 ? a2 != 3 ? "HOTQUERY" : "ON_HOTWORD" : "CONTINUOUS"));
        C91005e b2 = fVar.mo85278b("Application domain");
        C66997hf hfVar3 = a.f182132d;
        if (hfVar3 == null) {
            hfVar3 = C66997hf.f182099z;
        }
        C66964g a3 = C66964g.m97396a(hfVar3.f182119r);
        if (a3 == null) {
            a3 = C66964g.UNKNOWN;
        }
        b2.mo85276a(C90752i.m148229c(a3.name()));
    }
}
