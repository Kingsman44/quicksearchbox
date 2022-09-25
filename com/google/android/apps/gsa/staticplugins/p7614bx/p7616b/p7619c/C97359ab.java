package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0359at;
import android.support.p033v7.app.C0395p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.content.C1877c;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.shared.monet.p7116h.C90337f;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7615a.C97311a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7615a.C97312b;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97349a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97350b;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97352d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.C30282k;
import com.google.android.libraries.onegoogle.accountmenu.AccountMenu;
import com.google.android.libraries.onegoogle.accountmenu.AccountMenuDiscBinder;
import com.google.android.libraries.onegoogle.accountmenu.C30784k;
import com.google.android.libraries.onegoogle.accountmenu.C30785l;
import com.google.android.libraries.onegoogle.accountmenu.C30787n;
import com.google.android.libraries.onegoogle.accountmenu.C30788o;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30304m;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30495a;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.features.p2375i.C30624c;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import com.google.android.libraries.onegoogle.accountmenu.internal.C30733bd;
import com.google.android.libraries.onegoogle.accountmenu.internal.C30746bq;
import com.google.android.libraries.onegoogle.accountmenu.internal.C30759cc;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30460a;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30473n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30476q;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30478s;
import com.google.android.libraries.onegoogle.accountmenu.p2358f.C30492e;
import com.google.android.libraries.onegoogle.common.C30914an;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60888db;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.ab */
/* compiled from: PG */
public final class C97359ab extends C22939d implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final Context f271887a;

    /* renamed from: b */
    public final C97352d f271888b;

    /* renamed from: c */
    public final C58833ax f271889c;

    /* renamed from: d */
    public final C58833ax f271890d;

    /* renamed from: e */
    public final C97349a f271891e;

    /* renamed from: f */
    public final C22871g f271892f;

    /* renamed from: g */
    public C30305n f271893g;

    /* renamed from: h */
    public C97376e f271894h;

    /* renamed from: i */
    private final C60888db f271895i;

    /* renamed from: j */
    private final GmsheadAccountsModelUpdater f271896j;

    /* renamed from: k */
    private final C90337f f271897k;

    /* renamed from: l */
    private final C90323a f271898l;

    /* renamed from: m */
    private final C90314b f271899m;

    /* renamed from: n */
    private final C90324b f271900n = new C97391t(this);

    /* renamed from: o */
    private final C30282k f271901o = new C97393v(this);

    /* renamed from: p */
    private final C97357a f271902p;

    /* renamed from: q */
    private final boolean f271903q;

    /* renamed from: r */
    private int[] f271904r = new int[0];

    /* renamed from: s */
    private C90315c f271905s;

    public C97359ab(C22945j jVar, Context context, C97352d dVar, C97349a aVar, C90314b bVar, C90323a aVar2, C90851k kVar, C58833ax axVar, C97312b bVar2, C97357a aVar3, C22871g gVar) {
        super(jVar);
        this.f271887a = context;
        this.f271888b = dVar;
        this.f271891e = aVar;
        this.f271889c = axVar;
        this.f271890d = axVar.mo56106b(C97380i.f271954a);
        this.f271898l = aVar2;
        this.f271892f = gVar;
        this.f271897k = new C90337f(jVar, aVar2, new C90324b());
        this.f271895i = kVar.mo85209b("ParticleDiscExecutor");
        this.f271899m = bVar;
        this.f271903q = axVar.mo56113h();
        C97311a a = bVar2.mo90628a();
        this.f271893g = a.f271758a;
        this.f271896j = a.f271759b;
        this.f271902p = aVar3;
    }

    /* renamed from: f */
    public static void m161115f(C58833ax axVar, C30305n nVar) {
        if (axVar.mo56113h()) {
            C58485gu b = nVar.mo35858i().f81934a.mo35794b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                C30492e eVar = (C30492e) b.get(i);
                if (eVar.mo36114a().equals(axVar.mo56107c())) {
                    nVar.mo35858i().f81934a.mo35796e(eVar);
                }
            }
            return;
        }
        nVar.mo35858i().f81934a.mo35796e((Object) null);
    }

    /* renamed from: g */
    private final void m161116g() {
        View a;
        if (this.f63126Q.mo28316z() && (a = this.f271902p.mo90660a()) != null) {
            int[] iArr = new int[2];
            a.getLocationOnScreen(iArr);
            if (!Arrays.equals(this.f271904r, iArr)) {
                this.f271904r = iArr;
                int width = a.getWidth();
                int height = a.getHeight();
                int i = iArr[0];
                int i2 = iArr[1];
                Rect rect = new Rect(i, i2, width + i, height + i2);
                C97349a aVar = this.f271891e;
                Bundle bundle = new Bundle();
                bundle.putParcelable("bounds", new LazyParcelable((Parcelable) rect));
                ((C97350b) aVar).f271880a.mo28345s("onParticleDiscBoundsChanged_android.graphics.Rect", "ParticleDiscEventsDispatcher", bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C0359at mo90661e() {
        if (!this.f271890d.mo56113h()) {
            return null;
        }
        return (C0359at) ((FragmentManager) this.f271890d.mo56107c()).f634a.mo671c(AccountMenu.f81888a);
    }

    /* renamed from: im */
    public final void mo28298im() {
        View a = this.f271902p.mo90660a();
        if (a != null) {
            a.getViewTreeObserver().removeOnScrollChangedListener(this);
            a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        C30306o i = this.f271893g.mo35858i();
        i.f81934a.f81880a.remove(this.f271901o);
        if (this.f271903q) {
            C90314b bVar = this.f271899m;
            C90315c cVar = this.f271905s;
            cVar.getClass();
            bVar.mo83995b(cVar);
            this.f271905s = null;
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        this.f271897k.mo84024a();
        this.f271897k.f252288a.mo5790b(this.f271896j);
        this.f271898l.mo84004a(this.f271900n);
        C97357a aVar = this.f271902p;
        Context context = this.f271887a;
        boolean h = aVar.f271884a.mo56113h();
        View inflate = LayoutInflater.from(context).inflate(h ? R.layout.account_disc : R.layout.particle_disc, (ViewGroup) null);
        if (h) {
            aVar.f271886c = C58833ax.m90834k((SelectedAccountDisc) inflate.findViewById(R.id.account_disc));
        } else {
            aVar.f271885b = C58833ax.m90834k((AccountParticleDisc) inflate.findViewById(R.id.particle_disc));
        }
        mo28295iC(inflate);
        ((C97369al) this.f271888b).f271932c.mo28726b(new C97389r(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C30518b bVar;
        C30305n nVar = this.f271893g;
        Context applicationContext = this.f271887a.getApplicationContext();
        C2384o oVar = this.f271897k.f252289b;
        C30304m g = nVar.mo35856g(applicationContext);
        g.mo35842p(this.f271895i);
        C30473n a = C30476q.m56832a().mo36089a();
        C58480gp b = a.mo36085b();
        Context context = this.f271887a;
        C97390s sVar = new C97390s(this);
        C30306o i = this.f271893g.mo35858i();
        C30462c g2 = C30464e.m56760g();
        g2.mo36052e(C1877c.m5125a(context, R.drawable.quantum_gm_ic_history_black_24));
        g2.mo36054g(context.getString(R.string.search_history));
        C30466g gVar = (C30466g) g2;
        gVar.f82288b = sVar;
        gVar.f82289c = new C30478s(i);
        b.mo55395g(g2.mo36048a());
        C97358aa aaVar = new C97358aa();
        C23251a aVar = ((C97369al) this.f271888b).f271938i;
        aaVar.mo36077c(((Boolean) aVar.f63720e).booleanValue());
        aVar.mo28726b(new C97397z(aaVar));
        Context context2 = this.f271887a;
        C97378g gVar2 = new C97378g(this);
        C30462c g3 = C30464e.m56760g();
        g3.mo36052e(C1877c.m5125a(context2, R.drawable.quantum_ic_incognito_black_24));
        g3.mo36054g(context2.getString(R.string.search_in_chrome_incognito));
        C30466g gVar3 = (C30466g) g3;
        gVar3.f82288b = gVar2;
        gVar3.f82289c = aaVar;
        C30464e a2 = g3.mo36048a();
        Context context3 = this.f271887a;
        C97379h hVar = new C97379h(this);
        String string = context3.getString(R.string.og_highlight_new);
        C30462c h = a2.mo36067h();
        h.mo36051d(new C30460a(hVar, string));
        b.mo55395g(h.mo36048a());
        C97396y yVar = new C97396y();
        C23251a aVar2 = ((C97369al) this.f271888b).f271939j;
        yVar.mo36077c(((Boolean) aVar2.f63720e).booleanValue());
        aVar2.mo28726b(new C97395x(yVar));
        Context context4 = this.f271887a;
        C97387p pVar = new C97387p(this);
        C30462c g4 = C30464e.m56760g();
        g4.mo36052e(C1877c.m5125a(context4, R.drawable.quantum_ic_incognito_black_24));
        g4.mo36054g(context4.getString(R.string.turn_on_incognito_mode));
        C30466g gVar4 = (C30466g) g4;
        gVar4.f82288b = pVar;
        gVar4.f82289c = yVar;
        b.mo55395g(g4.mo36048a());
        g.mo35844r(a.mo36084a());
        boolean z = true;
        if (((Boolean) ((C97369al) this.f271888b).f271931b.f63720e).booleanValue()) {
            C30495a b2 = this.f271893g.mo35860k().mo36169b();
            b2.mo36137i(new C30624c(true));
            bVar = b2.mo36129a();
        } else {
            bVar = this.f271893g.mo35860k();
        }
        g.mo35845s(bVar);
        C30305n d = g.mo35830d();
        this.f271893g = d;
        C97357a aVar3 = this.f271902p;
        C90337f fVar = this.f271897k;
        C97382k kVar = new C97382k(this);
        C58838bb.m90884s(aVar3.f271886c.mo56113h() || aVar3.f271885b.mo56113h(), "AccountDiscWrapper has not been initialized");
        if (aVar3.f271886c.mo56113h()) {
            C0395p pVar2 = (C0395p) aVar3.f271884a.mo56107c();
            pVar2.getClass();
            C30788o oVar2 = new C30788o(pVar2, d, (SelectedAccountDisc) aVar3.f271886c.mo56107c());
            AccountMenu h2 = AccountMenu.m56332h(oVar2.f83088a, oVar2.f83089b);
            oVar2.f83091d.mo36482a((C2391v) null);
            if (oVar2.f83090c.getId() == -1 || oVar2.f83090c.getId() == 0) {
                z = false;
            }
            C58838bb.m90869d(z, "SelectedAccountDisc must have an id set.");
            C30306o i2 = oVar2.f83089b.mo35858i();
            C30787n nVar2 = new C30787n(oVar2, i2);
            C30281j jVar = i2.f81934a;
            if (!jVar.f81882c) {
                jVar.f81880a.add(nVar2);
                C30281j jVar2 = i2.f81934a;
                if (jVar2.f81882c) {
                    jVar2.f81880a.remove(nVar2);
                }
            }
            C30914an.m57706a(new C30784k(oVar2, i2));
            oVar2.f83090c.setOnClickListener(new C30785l(oVar2, i2, h2));
            SelectedAccountDisc selectedAccountDisc = oVar2.f83090c;
            C30759cc j = AccountMenu.m56334j(h2.f81890c);
            if (j != null) {
                j.f83022g = selectedAccountDisc;
                C30746bq bqVar = (C30746bq) j.getDialog();
                if (bqVar != null) {
                    bqVar.mo36447i(selectedAccountDisc);
                }
            }
            C30733bd i3 = AccountMenu.m56333i(h2.f81890c);
            if (i3 != null) {
                i3.f82957a = selectedAccountDisc;
                C30746bq bqVar2 = (C30746bq) i3.getDialog();
                if (bqVar2 != null) {
                    bqVar2.mo36447i(selectedAccountDisc);
                }
            }
            ((SelectedAccountDisc) aVar3.f271886c.mo56107c()).setOnClickListener(kVar);
            C28295m.m52919e((View) aVar3.f271886c.mo56107c(), new C28292j(65238));
        } else {
            AccountMenuDiscBinder.m56343c(fVar, d, (AccountParticleDisc) aVar3.f271885b.mo56107c());
            ((AccountParticleDisc) aVar3.f271885b.mo56107c()).setOnClickListener(kVar);
            C28295m.m52919e((View) aVar3.f271885b.mo56107c(), new C28292j(65238));
        }
        if (((Boolean) ((C97369al) this.f271888b).f271937h.f63720e).booleanValue()) {
            mo28297il().setVisibility(8);
        }
        ((C97369al) this.f271888b).f271930a.mo28726b(new C97383l(this));
        this.f271893g.mo35858i().f81934a.f81880a.add(this.f271901o);
        View a3 = this.f271902p.mo90660a();
        if (a3 != null) {
            a3.getViewTreeObserver().addOnScrollChangedListener(this);
            a3.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
        ((C97369al) this.f271888b).f271935f.mo28726b(new C97384m(this));
        ((C97369al) this.f271888b).f271933d.mo28726b(new C97385n(this));
        if (this.f271903q) {
            C97386o oVar3 = new C97386o(this);
            this.f271905s = oVar3;
            this.f271899m.mo83994a(oVar3);
        }
    }

    /* renamed from: js */
    public final void mo28301js() {
        this.f271898l.mo84005b(this.f271900n);
    }

    public final void onGlobalLayout() {
        m161116g();
    }

    public final void onScrollChanged() {
        m161116g();
    }
}
