package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8059d;

import androidx.work.C4410f;
import androidx.work.C4634o;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82486gz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82716pm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82717pn;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103041b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.d.j */
/* compiled from: PG */
public final class C103108j implements C103041b, C86091a {

    /* renamed from: a */
    public static final C58974d f287752a = C58974d.m91136j();

    /* renamed from: b */
    public final C83305i f287753b;

    /* renamed from: c */
    private final C46578l f287754c;

    /* renamed from: d */
    private final C86124t f287755d;

    public C103108j(C46578l lVar, C83305i iVar, C86124t tVar) {
        this.f287754c = lVar;
        this.f287753b = iVar;
        this.f287755d = tVar;
    }

    /* renamed from: a */
    public final void mo93583a() {
        C83305i iVar = this.f287753b;
        C82716pm c = C82717pn.m132233c();
        ((C82486gz) c).f225387b = "ENQUEUEING_PERIODIC_TIKTOK_WORKERS";
        iVar.mo75579d(c.mo76438a());
        C46578l lVar = this.f287754c;
        C46582p j = C46586t.m83063j(C103099a.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("PIE_ELIGIBILITY_EXPORT_WORKER", C4634o.KEEP));
        dVar.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(24, TimeUnit.HOURS)));
        C4410f fVar = new C4410f();
        fVar.f14072b = true;
        fVar.f14073c = true;
        dVar.f121753b = fVar.mo9349a();
        C46459k.m82829b(lVar.mo50546b(j.mo50561a()), "Failed to enqueue Pie Eligibility Export worker", new Object[0]);
        ((C58970a) ((C58970a) f287752a.mo56224b()).mo56372aa(21475)).mo56386p("Trying to enqueue PieTriggeringWorker");
        C46578l lVar2 = this.f287754c;
        C86124t tVar = this.f287755d;
        C46582p j2 = C46586t.m83063j(C103103e.class);
        C46570d dVar2 = (C46570d) j2;
        dVar2.f121756e = C58833ax.m90834k(C46583q.m83055c(new C46573g(tVar.mo79743a(C90126fx.f251633mW), TimeUnit.HOURS)));
        dVar2.f121757f = C58833ax.m90834k(new C46574h("PIE_TRIGGERING_WORKER", tVar.mo79746e(C90126fx.f251634mX) ? C4634o.REPLACE : C4634o.KEEP));
        Long valueOf = Long.valueOf(tVar.mo79743a(C90126fx.f251632mV));
        if (valueOf.longValue() != 0) {
            dVar2.f121754c = new C46573g(valueOf.longValue(), TimeUnit.MINUTES);
        }
        if (tVar.mo79746e(C90126fx.f251635mY)) {
            C4410f fVar2 = new C4410f();
            fVar2.f14072b = true;
            dVar2.f121753b = fVar2.mo9349a();
        }
        C60856cj.m92911t(lVar2.mo50546b(j2.mo50561a()), new C103107i(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (this.f287755d.mo79746e(C90126fx.f251691nb)) {
            C83305i iVar = this.f287753b;
            C82716pm c = C82717pn.m132233c();
            ((C82486gz) c).f225387b = "ENQUEUEING_PERIODIC_TIKTOK_WORKERS_ON_BOOT";
            iVar.mo75579d(c.mo76438a());
            mo93583a();
        }
    }
}
