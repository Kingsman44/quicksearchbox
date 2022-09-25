package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.android.libraries.lens.p2014e.C24209al;
import com.google.android.libraries.lens.view.p2081au.C25545aa;
import com.google.android.libraries.lens.view.p2081au.C25557g;
import com.google.android.libraries.lens.view.p2081au.C25560j;
import com.google.android.libraries.lens.view.p2081au.C25561k;
import com.google.android.libraries.lens.view.p2081au.C25562l;
import com.google.android.libraries.lens.view.p2081au.C25574x;
import com.google.android.libraries.lens.view.p2153o.C27459a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.lens.view.an.x */
/* compiled from: PG */
final class C25452x implements C24209al {

    /* renamed from: a */
    public final C24201ad f69335a;

    /* renamed from: b */
    final /* synthetic */ C25453y f69336b;

    /* renamed from: c */
    private final C25560j f69337c;

    /* renamed from: d */
    private C24208ak f69338d;

    public C25452x(C25453y yVar, C24201ad adVar, C25560j jVar) {
        this.f69336b = yVar;
        this.f69335a = adVar;
        this.f69337c = jVar;
        this.f69338d = C24208ak.m45056e(adVar);
    }

    /* renamed from: d */
    private final void m46878d() {
        if (m46880f()) {
            this.f69336b.f69344f.mo30602k((C25562l) null);
        }
        if (m46879e()) {
            this.f69336b.f69344f.mo30601j((C25562l) null);
        }
    }

    /* renamed from: e */
    private final boolean m46879e() {
        return ((Boolean) ((C58833ax) this.f69336b.f69344f.f69546e.mo30656d()).mo56106b(new C25450v(this)).mo56109e(false)).booleanValue();
    }

    /* renamed from: f */
    private final boolean m46880f() {
        return ((Boolean) ((C58833ax) this.f69336b.f69344f.f69545d.mo30656d()).mo56106b(new C25451w(this)).mo56109e(false)).booleanValue();
    }

    /* renamed from: a */
    public final void mo29702a(Throwable th) {
        C25387ay.m46760a();
        if (th instanceof CancellationException) {
            ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56372aa(49844)).mo56389s("Query[%s] cancelled", this.f69335a.mo29680c());
            C25454z.m46893a(this.f69336b.f69340b, C62722b.CANCELLED, this.f69335a.mo29681d().mo29692b());
        } else {
            ((C58970a) ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56382g(th)).mo56372aa(49843)).mo56389s("Query[%s] failed", this.f69335a.mo29680c());
            if (m46880f() || m46879e()) {
                C25545aa aaVar = this.f69336b.f69344f;
                int i = 1;
                if (true == (th instanceof TimeoutException)) {
                    i = 2;
                }
                aaVar.mo30598g(new C25557g(i, th));
            }
            C25454z.m46893a(this.f69336b.f69340b, th instanceof TimeoutException ? C62722b.DEADLINE_EXCEEDED : C62722b.UNKNOWN, this.f69335a.mo29681d().mo29692b());
        }
        m46878d();
    }

    /* renamed from: b */
    public final void mo29703b(C24208ak akVar) {
        C62722b bVar;
        C25387ay.m46760a();
        ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56372aa(49845)).mo56389s("Query[%s] complete", this.f69335a.mo29680c());
        if (!akVar.mo29700f() || !akVar.mo29696a().mo29748o()) {
            bVar = C62722b.OK;
        } else {
            bVar = C62722b.UNKNOWN;
        }
        C25454z.m46893a(this.f69336b.f69340b, bVar, this.f69335a.mo29681d().mo29692b());
        m46878d();
    }

    /* renamed from: c */
    public final void mo29704c(C24208ak akVar) {
        C25387ay.m46760a();
        if (m46880f() && !akVar.mo29696a().equals(this.f69338d.mo29696a())) {
            ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56372aa(49847)).mo56355H("Query[%s] image result (complete=%b)", this.f69335a.mo29680c(), akVar.mo29701g());
            C25562l lVar = (C25562l) ((C58833ax) this.f69336b.f69344f.f69545d.mo30656d()).mo56107c();
            this.f69336b.f69344f.mo30600i(C25561k.m47131g(lVar.mo30630a(), this.f69335a, akVar, this.f69337c, (C25574x) null, lVar.mo30633d()));
        }
        if (m46879e() && !akVar.mo29699d().equals(this.f69338d.mo29699d())) {
            ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56372aa(49846)).mo56355H("Query[%s] interaction result (complete=%b)", this.f69335a.mo29680c(), akVar.mo29701g());
            C25562l lVar2 = (C25562l) ((C58833ax) this.f69336b.f69344f.f69546e.mo30656d()).mo56107c();
            this.f69336b.f69344f.mo30599h(C25561k.m47131g(lVar2.mo30630a(), this.f69335a, akVar, this.f69337c, (C25574x) lVar2.mo30634e().mo56111f(), lVar2.mo30633d()));
            C27459a aVar = this.f69336b.f69345g;
            if (aVar != null) {
                aVar.mo32994kT();
            }
        }
        this.f69338d = akVar;
    }
}
