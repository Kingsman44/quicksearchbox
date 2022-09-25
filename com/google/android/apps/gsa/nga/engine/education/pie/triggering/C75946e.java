package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.as.k;
import com.google.android.apps.gsa.nga.engine.education.pie.C75871f;
import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81376j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.e */
/* compiled from: PG */
public final class C75946e implements C75864b, k {

    /* renamed from: a */
    public static final C58974d f210712a = C58974d.m91136j();

    /* renamed from: i */
    private static final Duration f210713i = Duration.ofMinutes(30);

    /* renamed from: b */
    public final C81376j f210714b;

    /* renamed from: c */
    public final C75911l f210715c;

    /* renamed from: d */
    public final C81315k f210716d;

    /* renamed from: e */
    public final C91142g f210717e;

    /* renamed from: f */
    public final C21370a f210718f;

    /* renamed from: g */
    public final C75871f f210719g;

    /* renamed from: h */
    public final C58881cr f210720h = C58886cw.m90973a(C75941b.f210694a);

    /* renamed from: j */
    private final C22871g f210721j;

    /* renamed from: k */
    private final AtomicReference f210722k = new AtomicReference(C118826c.f331423b);

    public C75946e(C22871g gVar, C81376j jVar, C75911l lVar, C81315k kVar, C91142g gVar2, C21370a aVar, C75871f fVar) {
        this.f210721j = gVar;
        this.f210714b = jVar;
        this.f210715c = lVar;
        this.f210716d = kVar;
        this.f210717e = gVar2;
        this.f210718f = aVar;
        this.f210719g = fVar;
    }

    /* renamed from: e */
    private final void m122486e(C60870cx cxVar) {
        ((C60870cx) this.f210722k.getAndSet(cxVar)).cancel(false);
    }

    /* renamed from: c */
    public final void mo71974c() {
        if (!mo71975d()) {
            m122486e(C118826c.f331423b);
        } else {
            m122486e(this.f210721j.mo28204d("[NGA] AggressiveTrigger.trySchedule", f210713i.toMillis(), new C75944c(this)));
        }
    }

    /* renamed from: d */
    public final boolean mo71975d() {
        return this.f210717e.mo85405j(C90126fx.f251378hg);
    }

    /* renamed from: gE */
    public final void mo71976gE(C58528ij ijVar) {
        if (ijVar.contains(Integer.valueOf(C90126fx.f251378hg.f248757a))) {
            mo71974c();
        }
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        mo71974c();
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        m122486e(C118826c.f331423b);
    }
}
