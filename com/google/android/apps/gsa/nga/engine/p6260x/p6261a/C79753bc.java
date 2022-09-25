package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.logging.C28260b;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60219s;
import com.google.common.p4552o.p4566l.C60220t;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bc */
/* compiled from: PG */
final class C79753bc {

    /* renamed from: a */
    public final long f218651a;

    /* renamed from: b */
    final String f218652b = C39191a.m68623b(C90719ac.f253778a.mo85083a());

    /* renamed from: c */
    final C60218r f218653c;

    /* renamed from: d */
    boolean f218654d;

    /* renamed from: e */
    boolean f218655e;

    /* renamed from: f */
    boolean f218656f;

    /* renamed from: g */
    boolean f218657g;

    /* renamed from: h */
    String f218658h;

    /* renamed from: i */
    boolean f218659i;

    /* renamed from: j */
    C79814dj f218660j;

    /* renamed from: k */
    boolean f218661k;

    /* renamed from: l */
    String f218662l;

    /* renamed from: m */
    final /* synthetic */ C79754bd f218663m;

    public C79753bc(C79754bd bdVar, C83320io ioVar, String str) {
        this.f218663m = bdVar;
        this.f218651a = bdVar.f218666a.mo26871c();
        C60217q qVar = (C60217q) C28260b.m52825a().toBuilder();
        C60219s sVar = (C60219s) C60220t.f162931e.createBuilder();
        long b = bdVar.f218666a.mo26870b();
        int incrementAndGet = bdVar.f218667b.incrementAndGet();
        sVar.copyOnWrite();
        C60220t tVar = (C60220t) sVar.instance;
        tVar.f162933a |= 1;
        tVar.f162934b = (b * 1000) + ((long) ((incrementAndGet % 999) + 1));
        sVar.copyOnWrite();
        C60220t tVar2 = (C60220t) sVar.instance;
        tVar2.f162933a |= 4;
        tVar2.f162936d = 0;
        sVar.copyOnWrite();
        C60220t tVar3 = (C60220t) sVar.instance;
        tVar3.f162933a |= 2;
        tVar3.f162935c = 0;
        qVar.copyOnWrite();
        C60218r rVar = (C60218r) qVar.instance;
        C60220t tVar4 = (C60220t) sVar.build();
        tVar4.getClass();
        rVar.f162928b = tVar4;
        rVar.f162927a |= 1;
        this.f218653c = (C60218r) qVar.build();
        this.f218655e = false;
        this.f218656f = false;
        this.f218661k = true;
        C58838bb.m90868c(!ioVar.f227136c.isEmpty());
        C79813di diVar = (C79813di) C79814dj.f218834O.createBuilder();
        String str2 = ioVar.f227136c;
        diVar.copyOnWrite();
        C79814dj djVar = (C79814dj) diVar.instance;
        str2.getClass();
        djVar.f218851a |= 16384;
        djVar.f218842G = str2;
        if (bdVar.f218668c.isPresent()) {
            C58976aa aaVar = C58975e.f156826a;
            bdVar.f218668c.get();
            long longValue = ((Long) bdVar.f218668c.get()).longValue();
            diVar.copyOnWrite();
            C79814dj djVar2 = (C79814dj) diVar.instance;
            djVar2.f218851a |= 65536;
            djVar2.f218848M = longValue;
        }
        this.f218660j = (C79814dj) diVar.build();
        this.f218662l = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo74216a(Consumer consumer) {
        C79813di diVar = (C79813di) this.f218660j.toBuilder();
        consumer.accept(diVar);
        this.f218660j = (C79814dj) diVar.build();
    }
}
