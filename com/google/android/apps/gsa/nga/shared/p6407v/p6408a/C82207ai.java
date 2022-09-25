package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83321j;
import com.google.android.apps.gsa.nga.shared.p6407v.C83331t;
import com.google.android.apps.gsa.nga.shared.p6407v.C83333v;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.C83335x;
import com.google.android.apps.gsa.nga.shared.p6407v.C83336y;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82888ed;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p3186j$.time.Duration;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.ai */
/* compiled from: PG */
public final class C82207ai implements C83334w, C83336y {

    /* renamed from: a */
    public static final C59071e f224674a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.v.a.ai");

    /* renamed from: b */
    public final C58889cz f224675b;

    /* renamed from: c */
    private final C60950i f224676c;

    /* renamed from: d */
    private final C22871g f224677d;

    /* renamed from: e */
    private final C22871g f224678e;

    /* renamed from: f */
    private final C83321j f224679f;

    /* renamed from: g */
    private final Set f224680g = new CopyOnWriteArraySet();

    public C82207ai(C58889cz czVar, C60950i iVar, C22871g gVar, C90821bm bmVar, C83321j jVar, C83331t tVar, C91022f fVar) {
        this.f224675b = czVar;
        this.f224676c = iVar;
        this.f224677d = gVar;
        this.f224678e = bmVar.mo85163a(C82206ah.class);
        this.f224679f = jVar;
        fVar.mo85301a(tVar);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo75543a(C82887ec ecVar, C82885ea eaVar) {
        C83333v.m132625a(this, ecVar, eaVar, C83320io.f227132d);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo75544b(C82887ec ecVar, Supplier supplier) {
        mo75546d(ecVar, supplier, C83320io.f227132d);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo75545c(C82887ec ecVar, C82885ea eaVar, C83320io ioVar) {
        C83333v.m132625a(this, ecVar, eaVar, ioVar);
    }

    /* renamed from: d */
    public final void mo75546d(C82887ec ecVar, Supplier supplier, C83320io ioVar) {
        new C90873ag(this.f224677d.mo28201a("[NGA] produce-log-event", new C82203ae(this, ecVar, ioVar, supplier)), this.f224678e, "[NGA] log-event", new C82204af(this)).mo85223a(C82205ag.f224673a);
    }

    /* renamed from: e */
    public final void mo75547e(C82887ec ecVar, C82885ea eaVar, C83320io ioVar, Duration duration, Duration duration2, int i) {
        C82888ed i2 = mo75551i(ecVar, ioVar, duration2);
        long millis = duration.toMillis();
        i2.copyOnWrite();
        C82889ee eeVar = (C82889ee) i2.instance;
        C82889ee eeVar2 = C82889ee.f226094j;
        eeVar.f226096a |= 8;
        eeVar.f226100e = millis;
        i2.copyOnWrite();
        C82889ee eeVar3 = (C82889ee) i2.instance;
        eeVar3.f226101f = i - 1;
        eeVar3.f226096a |= 16;
        if (eaVar != null) {
            i2.copyOnWrite();
            C82889ee eeVar4 = (C82889ee) i2.instance;
            eeVar4.f226099d = eaVar;
            eeVar4.f226096a |= 4;
        }
        this.f224678e.mo28212l("[NGA] log-event", new C82202ad(this, i2));
    }

    /* renamed from: f */
    public final void mo75548f(C82887ec ecVar, C82885ea eaVar, C83320io ioVar, long j, int i) {
        mo75547e(ecVar, eaVar, ioVar, Duration.ofMillis(j), Duration.ofNanos(this.f224675b.mo26884a()), i);
    }

    /* renamed from: g */
    public final void mo75549g(C83335x xVar) {
        this.f224680g.add(xVar);
    }

    /* renamed from: h */
    public final void mo75550h(C83335x xVar) {
        this.f224680g.remove(xVar);
    }

    /* renamed from: i */
    public final C82888ed mo75551i(C82887ec ecVar, C83320io ioVar, Duration duration) {
        C82888ed edVar = (C82888ed) C82889ee.f226094j.createBuilder();
        long epochMilli = this.f224676c.mo57444a().toEpochMilli();
        edVar.copyOnWrite();
        C82889ee eeVar = (C82889ee) edVar.instance;
        eeVar.f226096a |= 2;
        eeVar.f226098c = epochMilli;
        long millis = duration.toMillis();
        edVar.copyOnWrite();
        C82889ee eeVar2 = (C82889ee) edVar.instance;
        eeVar2.f226096a |= 64;
        eeVar2.f226103h = millis;
        long nanos = duration.toNanos();
        edVar.copyOnWrite();
        C82889ee eeVar3 = (C82889ee) edVar.instance;
        eeVar3.f226096a |= 128;
        eeVar3.f226104i = nanos;
        edVar.copyOnWrite();
        C82889ee eeVar4 = (C82889ee) edVar.instance;
        eeVar4.f226097b = ecVar.f226093bf;
        eeVar4.f226096a |= 1;
        edVar.copyOnWrite();
        C82889ee eeVar5 = (C82889ee) edVar.instance;
        ioVar.getClass();
        eeVar5.f226102g = ioVar;
        eeVar5.f226096a |= 32;
        return edVar;
    }

    /* renamed from: j */
    public final void mo75552j(C82889ee eeVar) {
        for (C83335x a : this.f224680g) {
            a.mo73068a(eeVar);
        }
        this.f224679f.mo75542b(eeVar);
    }
}
