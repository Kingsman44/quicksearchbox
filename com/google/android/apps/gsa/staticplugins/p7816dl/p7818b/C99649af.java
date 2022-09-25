package com.google.android.apps.gsa.staticplugins.p7816dl.p7818b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6519al.p6620bu.C85022a;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85492i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.state.p6872d.C86906a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90276e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7108y.C90300a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90326d;
import com.google.android.apps.gsa.shared.p6999at.C89289a;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91782af;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91808o;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91809p;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91816w;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91817x;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99684i;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99687l;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99688m;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99689n;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7821e.p7822a.C99719a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.b.af */
/* compiled from: PG */
public final class C99649af extends C23056g implements C99684i {

    /* renamed from: a */
    public final C99689n f278843a;

    /* renamed from: b */
    public final Context f278844b;

    /* renamed from: c */
    public final C86338r f278845c;

    /* renamed from: d */
    public final C22871g f278846d;

    /* renamed from: e */
    public final C85022a f278847e;

    /* renamed from: f */
    public final C86124t f278848f;

    /* renamed from: g */
    public final C85492i f278849g;

    /* renamed from: h */
    public final C68214a f278850h;

    /* renamed from: i */
    public final C86906a f278851i;

    /* renamed from: j */
    public final C89289a f278852j;

    /* renamed from: k */
    public final C21370a f278853k;

    /* renamed from: l */
    public boolean f278854l;

    /* renamed from: m */
    private final C99648ae f278855m = new C99648ae(this);

    /* renamed from: n */
    private final C99719a f278856n;

    /* renamed from: o */
    private final C22871g f278857o;

    /* renamed from: p */
    private final C90326d f278858p;

    /* renamed from: q */
    private final C42876ab f278859q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99649af(C23052c cVar, C99689n nVar, Context context, C86338r rVar, C99719a aVar, C22871g gVar, C22871g gVar2, C90326d dVar, C85022a aVar2, C86124t tVar, C85492i iVar, C68214a aVar3, C86906a aVar4, C89289a aVar5, C42876ab abVar, C21370a aVar6) {
        super(cVar);
        this.f278843a = nVar;
        this.f278844b = context;
        this.f278845c = rVar;
        this.f278856n = aVar;
        this.f278857o = gVar;
        this.f278846d = gVar2;
        this.f278858p = dVar;
        this.f278847e = aVar2;
        this.f278848f = tVar;
        this.f278849g = iVar;
        this.f278850h = aVar3;
        this.f278851i = aVar4;
        this.f278852j = aVar5;
        this.f278859q = abVar;
        this.f278853k = aVar6;
        ((C23015k) cVar).f63315j.mo28430t(C87348a.class);
    }

    /* renamed from: q */
    private final void m165257q(C99688m mVar) {
        if (((C99652c) this.f278843a).f278889i.mo28631l()) {
            C90276e eVar = (C90276e) ((C99652c) this.f278843a).f278889i.mo28620a();
            eVar.getClass();
            eVar.mo83980a(mVar == C99688m.GOOGLE_TAB);
        }
    }

    /* renamed from: r */
    private final synchronized boolean m165258r() {
        return ((Boolean) ((C99652c) this.f278843a).f278885e.f63720e).booleanValue();
    }

    /* renamed from: e */
    public final void mo91546e() {
        C91808o oVar = (C91808o) C91809p.f256048e.createBuilder();
        boolean booleanValue = ((Boolean) ((C99652c) this.f278843a).f278884d.f63720e).booleanValue();
        oVar.copyOnWrite();
        C91809p pVar = (C91809p) oVar.instance;
        pVar.f256050a |= 1;
        pVar.f256051b = booleanValue;
        boolean booleanValue2 = ((Boolean) ((C99652c) this.f278843a).f278886f.f63720e).booleanValue();
        oVar.copyOnWrite();
        C91809p pVar2 = (C91809p) oVar.instance;
        pVar2.f256050a |= 2;
        pVar2.f256052c = booleanValue2;
        boolean booleanValue3 = ((Boolean) ((C99652c) this.f278843a).f278887g.f63720e).booleanValue();
        oVar.copyOnWrite();
        C91809p pVar3 = (C91809p) oVar.instance;
        pVar3.f256050a |= 4;
        pVar3.f256053d = booleanValue3;
        ((C99652c) this.f278843a).f278889i.mo28623d(new C23129y("now_stream", "TYPE_MINUS_ONE"), C23245b.m43556a((C91809p) oVar.build()));
    }

    /* renamed from: f */
    public final void mo91547f() {
        C58976aa aaVar = C58975e.f156826a;
        C91816w wVar = (C91816w) C91817x.f256076d.createBuilder();
        String str = (String) ((C99652c) this.f278843a).f278891k.f63720e;
        wVar.copyOnWrite();
        C91817x xVar = (C91817x) wVar.instance;
        str.getClass();
        xVar.f256078a |= 1;
        xVar.f256079b = str;
        int intValue = ((Integer) ((C99652c) this.f278843a).f278882b.f63720e).intValue();
        if (intValue == 0) {
            intValue = this.f278844b.getResources().getDimensionPixelSize(R.dimen.parent_tabs_height);
        }
        wVar.copyOnWrite();
        C91817x xVar2 = (C91817x) wVar.instance;
        xVar2.f256078a |= 2;
        xVar2.f256080c = intValue;
        ((C99652c) this.f278843a).f278890j.mo28623d(C90300a.f252221a, C23245b.m43556a((C91817x) wVar.build()));
    }

    /* renamed from: h */
    public final void mo91548h(String str) {
        C58976aa aaVar = C58975e.f156826a;
        ((C99652c) this.f278843a).f278883c.mo28730f(C58833ax.m90834k(C99687l.LOADING), false);
        new C90873ag(C90877ak.m148471e(this.f278856n.mo91574a(str), this.f278848f.mo79743a(C90138q.f251844r), TimeUnit.SECONDS, this.f278857o), this.f278846d, "On pomo icon loaded.", new C99645ab(this)).mo85223a(new C99646ac(this));
    }

    /* renamed from: i */
    public final void mo91549i(C99688m mVar) {
        boolean z = false;
        ((C99652c) this.f278843a).f278893m.mo28730f(C58833ax.m90834k(mVar), false);
        m165257q(mVar);
        C99688m mVar2 = C99688m.PARTNER_TAB;
        if (mVar == mVar2) {
            z = true;
        }
        C86906a aVar = this.f278851i;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f234687a = z;
        String str = mVar == mVar2 ? "PARTNER_TAB" : "GOOGLE_TAB";
        C86337q b = this.f278845c.mo80076b();
        b.mo80073h("partner_tab_last_tab", str);
        b.apply();
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        C58833ax axVar = (C58833ax) ((C99652c) this.f278843a).f278893m.f63720e;
        if (m165258r() && axVar.mo56113h() && axVar.mo56107c() == C99688m.PARTNER_TAB) {
            C99673x xVar2 = (C99673x) ((C99652c) this.f278843a).f278890j.mo28620a();
            xVar2.getClass();
            xVar2.mo91568i();
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91782af afVar = (C91782af) C23245b.m43557b(protoParcelable, C91782af.f255942f.getParserForType(), C62921ba.m95368a(), true);
        if (afVar == null) {
            afVar = C91782af.f255942f;
        }
        mo91550j(false);
        ((C99652c) this.f278843a).f278884d.mo28730f(Boolean.valueOf(afVar.f255945b), false);
        ((C99652c) this.f278843a).f278887g.mo28730f(Boolean.valueOf(afVar.f255948e), false);
        String str = afVar.f255946c;
        String b = this.f278852j.mo83230b(this.f278844b, str);
        if (b == null || !this.f278848f.mo79746e(C90138q.f251839m)) {
            mo91551k();
        } else {
            ((C99652c) this.f278843a).f278891k.mo28730f(str, false);
            mo91548h(b);
        }
        ((C99652c) this.f278843a).f278888h.mo28730f(afVar.f255947d, false);
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        this.f278858p.mo84011c(this.f278855m);
        String string = this.f278845c.getString("minus_one_visibility_state", "HIDDEN");
        boolean z = false;
        if (this.f278845c.getString("partner_tab_last_tab", "GOOGLE_TAB").equals("PARTNER_TAB") && string.equals("HIDDEN")) {
            z = true;
        }
        this.f278854l = z;
        C58976aa aaVar = C58975e.f156826a;
        this.f278859q.mo46039a(new C99675z(this), new C99644aa(this));
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f278858p.mo84018j(this.f278855m);
    }

    /* renamed from: j */
    public final synchronized void mo91550j(boolean z) {
        ((C99652c) this.f278843a).f278885e.mo28730f(Boolean.valueOf(z), false);
    }

    /* renamed from: k */
    public final void mo91551k() {
        ((C99652c) this.f278843a).f278886f.mo28730f(false, false);
        C86906a aVar = this.f278851i;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f234688b = false;
        mo91546e();
        ((C99652c) this.f278843a).f278883c.mo28730f(C58833ax.m90834k(C99687l.READY), false);
        m165257q(C99688m.GOOGLE_TAB);
    }

    /* renamed from: l */
    public final synchronized void mo91552l(C58833ax axVar) {
        ((C99652c) this.f278843a).f278886f.mo28730f(true, false);
        C86906a aVar = this.f278851i;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f234688b = true;
        ((C99652c) this.f278843a).f278892l.mo28730f(axVar, false);
        ((C99652c) this.f278843a).f278883c.mo28730f(C58833ax.m90834k(C99687l.READY), false);
    }

    /* renamed from: m */
    public final void mo91553m() {
        if (((C99652c) this.f278843a).f278890j.mo28631l()) {
            if (!m165258r() || ((C58833ax) ((C99652c) this.f278843a).f278893m.f63720e).mo56111f() != C99688m.PARTNER_TAB) {
                C99673x xVar = (C99673x) ((C99652c) this.f278843a).f278890j.mo28620a();
                xVar.getClass();
                xVar.f278938d.mo28212l("Pause Content", new C99666q(xVar));
            } else {
                C99673x xVar2 = (C99673x) ((C99652c) this.f278843a).f278890j.mo28620a();
                xVar2.getClass();
                xVar2.mo91568i();
            }
        }
        boolean e = this.f278848f.mo79746e(C90138q.f251845s);
        if (((Boolean) ((C99652c) this.f278843a).f278886f.f63720e).booleanValue() && e) {
            boolean z = ((C58833ax) ((C99652c) this.f278843a).f278893m.f63720e).mo56111f() == C99688m.PARTNER_TAB && m165258r();
            if (((Boolean) ((C99652c) this.f278843a).f278894n.f63720e).booleanValue() != z) {
                ((C99652c) this.f278843a).f278894n.mo28730f(Boolean.valueOf(z), false);
                C99719a aVar = this.f278856n;
                String str = (String) ((C99652c) this.f278843a).f278891k.f63720e;
                str.getClass();
                aVar.mo91577d(str, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        return false;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo91554n() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.gsa.staticplugins.dl.c.n r0 = r2.f278843a     // Catch:{ all -> 0x002d }
            com.google.android.apps.gsa.staticplugins.dl.b.c r0 = (com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99652c) r0     // Catch:{ all -> 0x002d }
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = r0.f278892l     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.f63720e     // Catch:{ all -> 0x002d }
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0     // Catch:{ all -> 0x002d }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002a
            com.google.android.apps.gsa.staticplugins.dl.c.n r0 = r2.f278843a     // Catch:{ all -> 0x002d }
            com.google.android.apps.gsa.staticplugins.dl.b.c r0 = (com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99652c) r0     // Catch:{ all -> 0x002d }
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = r0.f278883c     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.f63720e     // Catch:{ all -> 0x002d }
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0     // Catch:{ all -> 0x002d }
            com.google.android.apps.gsa.staticplugins.dl.c.l r1 = com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99687l.READY     // Catch:{ all -> 0x002d }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)     // Catch:{ all -> 0x002d }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002a
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x002a:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99649af.mo91554n():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return false;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo91555o() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m165258r()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0026
            boolean r0 = r1.mo91554n()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0026
            boolean r0 = r1.f278854l     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0026
            com.google.android.apps.gsa.staticplugins.dl.c.n r0 = r1.f278843a     // Catch:{ all -> 0x0029 }
            com.google.android.apps.gsa.staticplugins.dl.b.c r0 = (com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99652c) r0     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.gsa.monet.tools.children.a.f r0 = r0.f278890j     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.mo28631l()     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0026
            r1.mo91547f()     // Catch:{ all -> 0x0029 }
            r1.mo91553m()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x0026:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99649af.mo91555o():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo91556p() {
        C58976aa aaVar = C58975e.f156826a;
        ((C99652c) this.f278843a).f278883c.mo28730f(C58833ax.m90834k(C99687l.ERROR), false);
    }
}
