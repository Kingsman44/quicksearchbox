package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.p6260x.C79856d;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.p6101a.C77496a;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.C77732a;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82496hi;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82952gn;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82954gp;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4541l.C59337t;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.bn */
/* compiled from: PG */
final class C77787bn {

    /* renamed from: a */
    public static final C58974d f214280a = C58974d.m91136j();

    /* renamed from: b */
    public final C77817v f214281b;

    /* renamed from: c */
    public final C77566as f214282c;

    /* renamed from: d */
    public final C68214a f214283d;

    /* renamed from: e */
    public final C77788bo f214284e;

    /* renamed from: f */
    public final C77782bi f214285f;

    /* renamed from: g */
    public final C22871g f214286g;

    /* renamed from: h */
    public final C77732a f214287h;

    /* renamed from: i */
    public final C79863k f214288i;

    /* renamed from: j */
    public final C77772az f214289j;

    /* renamed from: k */
    public final C77496a f214290k;

    /* renamed from: l */
    public final C79856d f214291l;

    /* renamed from: m */
    public final String f214292m;

    /* renamed from: n */
    public C60870cx f214293n;

    /* renamed from: o */
    public InputStream f214294o;

    /* renamed from: p */
    private final C58872ci f214295p;

    /* renamed from: q */
    private final C81459h f214296q;

    public C77787bn(C77566as asVar, C79856d dVar, Optional optional, Optional optional2, C77817v vVar, C68214a aVar, C77788bo boVar, C77782bi biVar, C22871g gVar, C77732a aVar2, C79863k kVar, C58889cz czVar, C77772az azVar, C81465n nVar, C22871g gVar2, C77496a aVar3) {
        C79856d dVar2 = dVar;
        this.f214281b = vVar;
        Optional optional3 = optional;
        this.f214293n = (C60870cx) optional.orElseGet(C77783bj.f214274a);
        Optional optional4 = optional2;
        this.f214294o = (InputStream) optional2.orElse(null);
        this.f214282c = asVar;
        this.f214291l = dVar2;
        this.f214283d = aVar;
        this.f214284e = boVar;
        this.f214285f = biVar;
        this.f214286g = gVar;
        this.f214287h = aVar2;
        this.f214288i = kVar;
        this.f214289j = azVar;
        this.f214290k = aVar3;
        this.f214295p = C58872ci.m90947d(czVar);
        this.f214296q = nVar.mo75095b(gVar2, C77784bk.f214275a);
        this.f214292m = dVar2.f218924a.c();
    }

    /* renamed from: c */
    private final void m124794c() {
        this.f214285f.f214264d.mo75579d(new C82496hi("SODA_SESSION_DURATION", Double.valueOf((double) this.f214295p.mo56158a(TimeUnit.MILLISECONDS))));
    }

    /* renamed from: a */
    public final void mo72824a() {
        this.f214296q.mo75090a(this.f214291l.f218924a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo72825b() {
        C60870cx cxVar;
        Lock readLock;
        try {
            C77817v vVar = this.f214281b;
            readLock = vVar.f214367k.readLock();
            readLock.lock();
            vVar.mo72833a().mo24349p();
            readLock.unlock();
            ((C58970a) ((C58970a) f214280a.mo56224b()).mo56372aa(4470)).mo56389s("Stopped capturing for utteranceid %s", this.f214292m);
            C77782bi biVar = this.f214285f;
            int m = this.f214282c.mo72690m();
            C79856d dVar = this.f214291l;
            C83334w wVar = biVar.f214262b;
            C82887ec ecVar = C82887ec.SODA_SESSION_EVENT;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            C82952gn gnVar = (C82952gn) C82954gp.f226321e.createBuilder();
            gnVar.copyOnWrite();
            C82954gp gpVar = (C82954gp) gnVar.instance;
            if (m != 0) {
                gpVar.f226325c = m;
                gpVar.f226323a |= 2;
                gnVar.copyOnWrite();
                C82954gp gpVar2 = (C82954gp) gnVar.instance;
                gpVar2.f226324b = 2;
                gpVar2.f226323a |= 1;
                C82954gp gpVar3 = (C82954gp) gnVar.build();
                dzVar.copyOnWrite();
                C82885ea eaVar = (C82885ea) dzVar.instance;
                gpVar3.getClass();
                eaVar.f225980b = gpVar3;
                eaVar.f225979a = 82;
                wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), dVar.f218924a.b());
                this.f214288i.mo74271b(C89849ae.NGA_AUDIO_CAPTURE_EXITED);
                cxVar = this.f214293n;
                cxVar.cancel(false);
                C59337t.m92221a(this.f214294o);
                m124794c();
                return;
            }
            throw null;
        } catch (C77816u e) {
            try {
                this.f214287h.mo72795j(7);
                ((C58970a) ((C58970a) ((C58970a) f214280a.mo56226d()).mo56382g(e)).mo56372aa(4472)).mo56386p("Error when stopping SODA");
                cxVar = this.f214293n;
            } catch (Throwable th) {
                this.f214293n.cancel(false);
                C59337t.m92221a(this.f214294o);
                m124794c();
                throw th;
            }
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }
}
