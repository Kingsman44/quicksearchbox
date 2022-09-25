package com.google.android.apps.gsa.shared.monet;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87987kz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87991lc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87994lf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87995lg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87996lh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87999lk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.monet.p7112d.C90313a;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.shared.monet.p7114f.C90328f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22960ac;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22963af;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22987k;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22990n;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22994r;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22996t;
import com.google.android.libraries.gsa.monet.internal.p1887a.C22997u;
import com.google.android.libraries.gsa.monet.p1886a.C22937b;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22940e;
import com.google.android.libraries.gsa.monet.p1886a.C22943h;
import com.google.android.libraries.gsa.monet.p1886a.C22951p;
import com.google.android.libraries.gsa.monet.shared.C23127w;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.InitializationData;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23100c;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23101d;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23106i;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23107j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.monet.r */
/* compiled from: PG */
public final class C90347r implements C90991b {

    /* renamed from: u */
    private static final C59071e f252305u = C59071e.m91332i("com.google.android.apps.gsa.shared.monet.r");

    /* renamed from: A */
    private final C68214a f252306A;

    /* renamed from: a */
    public final C22937b f252307a;

    /* renamed from: b */
    public final C87680ah f252308b;

    /* renamed from: c */
    public final C90354y f252309c;

    /* renamed from: d */
    public final C90328f f252310d;

    /* renamed from: e */
    public final C90348s f252311e;

    /* renamed from: f */
    public final boolean f252312f;

    /* renamed from: g */
    public final C68214a f252313g;

    /* renamed from: h */
    public final C68214a f252314h;

    /* renamed from: i */
    public final C68214a f252315i;

    /* renamed from: j */
    public final C68214a f252316j;

    /* renamed from: k */
    public final C68214a f252317k;

    /* renamed from: l */
    public final C68214a f252318l;

    /* renamed from: m */
    public final C68214a f252319m;

    /* renamed from: n */
    public final C68214a f252320n;

    /* renamed from: o */
    public final SettableFuture f252321o;

    /* renamed from: p */
    public InitializationData f252322p;

    /* renamed from: q */
    public int f252323q;

    /* renamed from: r */
    public C58833ax f252324r;

    /* renamed from: s */
    public C90346q f252325s = C90346q.STOPPED;

    /* renamed from: t */
    public boolean f252326t;

    /* renamed from: v */
    private final boolean f252327v;

    /* renamed from: w */
    private final C68214a f252328w;

    /* renamed from: x */
    private final C68214a f252329x;

    /* renamed from: y */
    private final C68214a f252330y;

    /* renamed from: z */
    private final C68214a f252331z;

    public C90347r(C22937b bVar, C87680ah ahVar, C90354y yVar, C90328f fVar, C90348s sVar, InitializationData initializationData, C58833ax axVar, boolean z, boolean z2, C22963af afVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13) {
        C87680ah ahVar2 = ahVar;
        C90354y yVar2 = yVar;
        boolean z3 = z;
        C58838bb.m90869d(z3 || !axVar.mo56113h(), "Can't provide a restore bundle if restore is not supported.");
        this.f252307a = bVar;
        this.f252308b = ahVar2;
        this.f252309c = yVar2;
        this.f252310d = fVar;
        this.f252311e = sVar;
        this.f252322p = initializationData;
        this.f252324r = axVar;
        this.f252312f = z3;
        this.f252327v = z2;
        this.f252313g = aVar2;
        this.f252328w = aVar3;
        this.f252314h = aVar4;
        this.f252315i = aVar5;
        this.f252329x = aVar6;
        this.f252330y = aVar7;
        this.f252331z = aVar8;
        this.f252316j = aVar9;
        this.f252317k = aVar10;
        this.f252318l = aVar11;
        this.f252319m = aVar12;
        this.f252321o = new SettableFuture();
        this.f252306A = aVar13;
        ahVar.mo81959a(new C90340k(this), C88244um.MONET_SERVICE_EVENT);
        afVar.f63168a.add(new C90345p(this, yVar));
        this.f252320n = aVar;
    }

    /* renamed from: a */
    public final Bundle mo84031a() {
        C58838bb.m90883r(this.f252312f);
        if (!this.f252324r.mo56113h()) {
            C58485gu j = C58485gu.m89842j(this.f252310d.f252253b);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                ((C90324b) j.get(i)).mo84006a();
            }
            try {
                this.f252324r = C58833ax.m90834k(((C22951p) this.f252313g.mo27525b()).mo28323a());
            } catch (C22940e e) {
                ((C59052c) ((C59052c) f252305u.mo56226d()).mo56372aa(10737)).mo56389s("Could not collect restore state: %s", e.getMessage());
                this.f252324r = C58833ax.m90834k(new Bundle());
            }
        }
        return (Bundle) this.f252324r.mo56107c();
    }

    /* renamed from: b */
    public final Bundle mo84032b() {
        C58838bb.m90883r(this.f252312f);
        return mo84031a();
    }

    /* renamed from: c */
    public final View mo84033c() {
        return this.f252307a.mo28285a();
    }

    /* renamed from: e */
    public final void mo84034e(int i, String str, Object... objArr) {
        ((C89911f) this.f252330y.mo27525b()).mo83755a(new IllegalStateException(String.format(Locale.US, str, objArr)), i, 29).mo83721a();
        ((C59052c) ((C59052c) f252305u.mo56226d()).mo56372aa(10745)).mo56368U(str, objArr);
    }

    /* renamed from: f */
    public final void mo84035f(int i, int i2, Intent intent) {
        if (this.f252325s == C90346q.DESTROYED) {
            mo84034e(73059919, "This MonetClient has already been destroyed.", new Object[0]);
            return;
        }
        ((C90329g) this.f252319m.mo27525b()).mo84022b(i, i2, intent);
        C58833ax axVar = (C58833ax) this.f252306A.mo27525b();
        if (axVar.mo56113h()) {
            C91090a aVar = (C91090a) axVar.mo56107c();
            aVar.mo85356g(i, i2, intent, aVar.f254379a);
        }
    }

    /* renamed from: g */
    public final void mo84036g() {
        if (this.f252325s == C90346q.DESTROYED) {
            mo84034e(73059919, "This MonetClient has already been destroyed.", new Object[0]);
            return;
        }
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 15;
        dVar.f63449a |= 1;
        C23101d dVar2 = (C23101d) cVar.build();
        ((C23128x) this.f252331z.mo27525b()).mo28520c(new C90344o(this));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Renderers");
        C22994r rVar = ((C22996t) this.f252328w.mo27525b()).f63256a;
        C23087a aVar = new C23087a();
        ArrayList arrayList = new ArrayList(rVar.f63249b.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            C22960ac acVar = (C22960ac) rVar.f63249b.get(str);
            acVar.getClass();
            C22939d j = acVar.mo28340j();
            acVar.mo28334b().mo28469e();
            rVar.f63250c.mo28377a(str);
            aVar.mo28530a(new C22943h(str, j));
        }
        for (C22943h hVar : new C23088b(aVar.f63434a)) {
            C91006f e2 = e.mo85281e((Object) null);
            e2.mo85291r(hVar.f63130a);
            C22939d dVar = hVar.f63131b;
            if (dVar instanceof C90991b) {
                e2.mo85286m((C90991b) dVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo84037h() {
        if (this.f252325s == C90346q.DESTROYED) {
            mo84034e(73059919, "This MonetClient has already been destroyed.", new Object[0]);
            return;
        }
        C22997u uVar = (C22997u) this.f252314h.mo27525b();
        uVar.mo28394a(false);
        C22990n nVar = uVar.f63257a;
        if (!nVar.f63233e) {
            nVar.f63233e = true;
            nVar.f63230b.mo28390e("DC", new C22987k(nVar));
            nVar.f63230b.mo28392g("DC");
        }
        this.f252325s = C90346q.DESTROYED;
    }

    /* renamed from: i */
    public final void mo84038i() {
        if (this.f252325s == C90346q.DESTROYED) {
            mo84034e(73059919, "This MonetClient has already been destroyed.", new Object[0]);
        } else if (this.f252325s != C90346q.SHOWN) {
            ((C59052c) ((C59052c) f252305u.mo56226d()).mo56372aa(10747)).mo56389s("Ignoring onHide for MonetClient[state: %s].", this.f252325s);
        } else {
            C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
            cVar.copyOnWrite();
            C23101d dVar = (C23101d) cVar.instance;
            dVar.f63452d = 12;
            dVar.f63449a |= 1;
            C23101d dVar2 = (C23101d) cVar.build();
            ((C23128x) this.f252331z.mo27525b()).mo28520c(new C90342m(this));
        }
    }

    /* renamed from: j */
    public final void mo84039j() {
        if (this.f252325s == C90346q.DESTROYED) {
            mo84034e(73059919, "This MonetClient has already been destroyed.", new Object[0]);
            return;
        }
        if (this.f252325s == C90346q.SHOWN) {
            ((C59052c) ((C59052c) f252305u.mo56226d()).mo56372aa(10748)).mo56386p("onShow() called without an onHide()");
            int i = C90755l.f253831a;
            mo84038i();
        }
        C90346q qVar = this.f252325s;
        if (qVar != C90346q.RESUMED) {
            mo84034e(33743312, "Ignoring onPause for MonetClient[state: %s].", qVar.toString());
            return;
        }
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 13;
        dVar.f63449a = 1 | dVar.f63449a;
        C23101d dVar2 = (C23101d) cVar.build();
        ((C23128x) this.f252331z.mo27525b()).mo28520c(new C90339j(this));
    }

    /* renamed from: k */
    public final void mo84040k() {
        if (this.f252325s == C90346q.DESTROYED) {
            mo84034e(73059919, "This MonetClient has already been destroyed.", new Object[0]);
            return;
        }
        C90346q qVar = this.f252325s;
        if (qVar == C90346q.RESUMED) {
            mo84034e(33743408, "onResume called for already resumed MonetClient.", new Object[0]);
            return;
        }
        if (qVar == C90346q.STOPPED) {
            mo84034e(33743361, "onResume called for stopped MonetClient. Starting now.", new Object[0]);
            mo84042m();
        }
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 10;
        dVar.f63449a |= 1;
        C23101d dVar2 = (C23101d) cVar.build();
        ((C23128x) this.f252331z.mo27525b()).mo28520c(new C90343n(this));
    }

    /* renamed from: l */
    public final void mo84041l() {
        if (this.f252325s == C90346q.DESTROYED) {
            mo84034e(73059919, "This MonetClient has already been destroyed.", new Object[0]);
        } else if (this.f252325s == C90346q.SHOWN) {
            ((C59052c) ((C59052c) f252305u.mo56226d()).mo56372aa(10752)).mo56386p("onShow called for already shown MonetClient.");
        } else {
            C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
            cVar.copyOnWrite();
            C23101d dVar = (C23101d) cVar.instance;
            dVar.f63452d = 11;
            dVar.f63449a |= 1;
            C23101d dVar2 = (C23101d) cVar.build();
            ((C23128x) this.f252331z.mo27525b()).mo28520c(new C90338i(this));
        }
    }

    /* renamed from: m */
    public final void mo84042m() {
        if (this.f252325s == C90346q.DESTROYED) {
            mo84034e(73059919, "This MonetClient has already been destroyed.", new Object[0]);
            return;
        }
        C90346q qVar = this.f252325s;
        if (qVar != C90346q.STOPPED) {
            mo84034e(33743402, "onStart called on MonetClient that's not stopped. [state: %s].", qVar.toString());
            return;
        }
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 3;
        dVar.f63449a = 1 | dVar.f63449a;
        C23101d dVar2 = (C23101d) cVar.build();
        ((C23128x) this.f252331z.mo27525b()).mo28520c(new C90341l(this));
    }

    /* renamed from: n */
    public final void mo84043n() {
        if (this.f252325s == C90346q.DESTROYED) {
            mo84034e(73059919, "This MonetClient has already been destroyed.", new Object[0]);
            return;
        }
        C90346q qVar = this.f252325s;
        if (qVar == C90346q.STOPPED) {
            mo84034e(33743368, "onStop called for already stopped MonetClient.", new Object[0]);
            return;
        }
        if (qVar == C90346q.RESUMED) {
            ((C59052c) ((C59052c) f252305u.mo56226d()).mo56372aa(10753)).mo56386p("onStop called on a resumed MonetClient.");
            mo84039j();
        }
        C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
        cVar.copyOnWrite();
        C23101d dVar = (C23101d) cVar.instance;
        dVar.f63452d = 14;
        dVar.f63449a |= 1;
        C23101d dVar2 = (C23101d) cVar.build();
        ((C23128x) this.f252331z.mo27525b()).mo28520c(new C90331h(this));
    }

    /* renamed from: o */
    public final void mo84044o(Rect rect) {
        C90313a aVar = (C90313a) this.f252329x.mo27525b();
        aVar.f252240b = rect;
        C58485gu j = C58485gu.m89842j(aVar.f252239a);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C90315c) j.get(i)).mo83996a(rect);
        }
    }

    /* renamed from: p */
    public final void mo84045p(int i) {
        if (i != 5) {
            this.f252323q++;
        }
        C23127w a = ((C23128x) this.f252331z.mo27525b()).mo28518a();
        C87994lf lfVar = (C87994lf) C87999lk.f237973g.createBuilder();
        lfVar.copyOnWrite();
        C87999lk lkVar = (C87999lk) lfVar.instance;
        lkVar.f237976b = i - 1;
        lkVar.f237975a |= 1;
        boolean z = this.f252327v;
        lfVar.copyOnWrite();
        C87999lk lkVar2 = (C87999lk) lfVar.instance;
        lkVar2.f237975a |= 2;
        lkVar2.f237977c = z;
        int i2 = this.f252323q;
        lfVar.copyOnWrite();
        C87999lk lkVar3 = (C87999lk) lfVar.instance;
        lkVar3.f237975a |= 8;
        lkVar3.f237979e = i2;
        C87995lg lgVar = (C87995lg) C87996lh.f237967d.createBuilder();
        long j = a.f63474a;
        lgVar.copyOnWrite();
        C87996lh lhVar = (C87996lh) lgVar.instance;
        lhVar.f237969a |= 1;
        lhVar.f237970b = j;
        long j2 = a.f63475b;
        lgVar.copyOnWrite();
        C87996lh lhVar2 = (C87996lh) lgVar.instance;
        lhVar2.f237969a |= 2;
        lhVar2.f237971c = j2;
        lfVar.copyOnWrite();
        C87999lk lkVar4 = (C87999lk) lfVar.instance;
        C87996lh lhVar3 = (C87996lh) lgVar.build();
        lhVar3.getClass();
        lkVar4.f237978d = lhVar3;
        lkVar4.f237975a |= 4;
        C88489j jVar = new C88489j(C87739bu.MONET_CLIENT_EVENT);
        if (i == 5) {
            C23106i iVar = (C23106i) C23107j.f63462d.createBuilder();
            String str = this.f252322p.f63418a.f63478c;
            iVar.copyOnWrite();
            C23107j jVar2 = (C23107j) iVar.instance;
            str.getClass();
            jVar2.f63464a |= 1;
            jVar2.f63465b = str;
            C63088z A = C63088z.m96139A(this.f252322p.f63419b.mo28513b());
            iVar.copyOnWrite();
            C23107j jVar3 = (C23107j) iVar.instance;
            jVar3.f63464a |= 2;
            jVar3.f63466c = A;
            lfVar.copyOnWrite();
            C87999lk lkVar5 = (C87999lk) lfVar.instance;
            C23107j jVar4 = (C23107j) iVar.build();
            jVar4.getClass();
            lkVar5.f237980f = jVar4;
            lkVar5.f237975a |= 16;
        }
        C87680ah ahVar = this.f252308b;
        C62940bt btVar = C87987kz.f237952a;
        C87991lc lcVar = (C87991lc) C88012lx.f238010e.createBuilder();
        String str2 = this.f252311e.f252332a;
        lcVar.copyOnWrite();
        C88012lx lxVar = (C88012lx) lcVar.instance;
        str2.getClass();
        lxVar.f238012a |= 512;
        lxVar.f238015d = str2;
        lcVar.copyOnWrite();
        C88012lx lxVar2 = (C88012lx) lcVar.instance;
        C87999lk lkVar6 = (C87999lk) lfVar.build();
        lkVar6.getClass();
        lxVar2.f238014c = lkVar6;
        lxVar2.f238013b = 6;
        jVar.mo82014b(btVar, (C88012lx) lcVar.build());
        ahVar.mo81961c(jVar.mo82013a());
    }
}
