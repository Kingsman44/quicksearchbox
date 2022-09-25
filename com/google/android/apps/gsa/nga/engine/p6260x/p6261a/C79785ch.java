package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.engine.p6260x.C79862j;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82917ff;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82920fi;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.ch */
/* compiled from: PG */
public final class C79785ch implements C79862j {

    /* renamed from: a */
    private static final C58974d f218759a = C58974d.m91134h("LazyPerfStopwatch");

    /* renamed from: b */
    private final Object f218760b = new Object();

    /* renamed from: c */
    private final C58889cz f218761c;

    /* renamed from: d */
    private final C83334w f218762d;

    /* renamed from: e */
    private final C83320io f218763e;

    /* renamed from: f */
    private final C90479a f218764f;

    /* renamed from: g */
    private final long f218765g;

    /* renamed from: h */
    private boolean f218766h = false;

    public C79785ch(C58889cz czVar, C83334w wVar, C83320io ioVar, C90479a aVar) {
        this.f218761c = czVar;
        this.f218762d = wVar;
        this.f218763e = ioVar;
        this.f218764f = aVar;
        this.f218765g = czVar.mo26884a();
    }

    /* renamed from: c */
    private final void m127898c(int i, int i2) {
        if (!this.f218766h) {
            this.f218766h = true;
            long convert = TimeUnit.MILLISECONDS.convert(this.f218761c.mo26884a() - this.f218765g, TimeUnit.NANOSECONDS);
            if (i2 == 2) {
                C83334w wVar = this.f218762d;
                C82887ec ecVar = C82887ec.PERFORMANCE_TIMING;
                C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
                C82917ff ffVar = (C82917ff) C82920fi.f226214c.createBuilder();
                ffVar.copyOnWrite();
                C82920fi fiVar = (C82920fi) ffVar.instance;
                fiVar.f226217b = i - 1;
                fiVar.f226216a |= 1;
                C82920fi fiVar2 = (C82920fi) ffVar.build();
                dzVar.copyOnWrite();
                C82885ea eaVar = (C82885ea) dzVar.instance;
                fiVar2.getClass();
                eaVar.f225980b = fiVar2;
                eaVar.f225979a = 3;
                wVar.mo75548f(ecVar, (C82885ea) dzVar.build(), this.f218763e, convert, 2);
            }
        } else if (!this.f218764f.mo84227b()) {
            C58970a aVar = (C58970a) f218759a.mo56225c();
            aVar.mo56380ai(C58979ad.SMALL);
            ((C58970a) aVar.mo56372aa(4005)).mo56386p("Stopwatch has already been stopped");
        } else {
            throw new IllegalStateException("Stopwatch has already been stopped.");
        }
    }

    /* renamed from: a */
    public final void mo74233a(int i) {
        synchronized (this.f218760b) {
            m127898c(i, 3);
        }
    }

    /* renamed from: b */
    public final void mo74234b(int i) {
        synchronized (this.f218760b) {
            m127898c(i, 2);
        }
    }
}
