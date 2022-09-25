package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86268w;
import com.google.android.apps.gsa.search.core.service.C86776s;
import com.google.android.apps.gsa.search.core.webview.C87278x;
import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C87690b;
import com.google.android.apps.gsa.search.shared.service.C88393c;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.C90779c;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1646ay.C19599a;
import com.google.android.libraries.p1646ay.C19600b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.amo;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.n */
/* compiled from: PG */
public final class C102488n extends C19600b {

    /* renamed from: h */
    private static final C59071e f286040h = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.inappwebpage.n");

    /* renamed from: a */
    C91090a f286041a;

    /* renamed from: b */
    C102464ah f286042b;

    /* renamed from: c */
    FrameLayout f286043c;

    /* renamed from: d */
    public final C85757cq f286044d;

    /* renamed from: e */
    public View f286045e;

    /* renamed from: f */
    public View f286046f;

    /* renamed from: g */
    public int f286047g;

    /* renamed from: i */
    private final C102491q f286048i;

    /* renamed from: j */
    private final C88393c f286049j;

    /* renamed from: l */
    private TextView f286050l;

    /* renamed from: m */
    private C86776s f286051m;

    /* renamed from: n */
    private C87690b f286052n;

    public C102488n(C85757cq cqVar, C102491q qVar, C88393c cVar) {
        this.f286044d = cqVar;
        this.f286048i = qVar;
        this.f286049j = cVar;
    }

    /* renamed from: b */
    public final void mo24895b(Bundle bundle) {
        Bundle bundle2 = bundle;
        C74504a.m120462a(f.bc);
        this.f54539k.mo24861h(bundle2);
        this.f54539k.getWindow().setSoftInputMode(16);
        C19599a aVar = this.f54539k;
        this.f286041a = new C91090a(aVar, aVar, 0);
        this.f286047g = this.f54539k.getResources().getInteger(17694720);
        this.f54539k.setContentView(R.layout.in_app_web_page_activity);
        this.f286043c = (FrameLayout) this.f54539k.mo24854d(R.id.in_app_web_view_container);
        View d = this.f54539k.mo24854d(R.id.in_app_error_card);
        this.f286045e = d;
        this.f286050l = (TextView) d.findViewById(R.id.web_search_error_message);
        Button button = (Button) this.f286045e.findViewById(R.id.try_again_button);
        button.setText(R.string.network_error_try_again);
        button.setOnClickListener(new C102487m(this));
        this.f286046f = this.f54539k.mo24854d(R.id.in_app_loading);
        C88393c cVar = this.f286049j;
        C102486l lVar = new C102486l(this);
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.DYNAMIC_ACTIVITY;
        gVar.f239199a = 32768;
        gVar.f239204f = "search";
        C87690b a = cVar.mo81990a(lVar, new ClientConfig(gVar));
        this.f286052n = a;
        a.mo81784Q(this.f54539k.mo24853b(), bundle2);
        this.f286051m = new C102482h(new C87680ah(this.f286052n.f237037a));
        C102491q qVar = this.f286048i;
        C19599a aVar2 = this.f54539k;
        C91090a aVar3 = this.f286041a;
        C86776s sVar = this.f286051m;
        C68214a aVar4 = qVar.f286056c;
        C85929cw cwVar = qVar.f286057d;
        C85923cq cqVar = qVar.f286060g;
        C86124t tVar = qVar.f286061h;
        C102469am amVar = new C102469am(aVar3, cqVar, cwVar, tVar, sVar, qVar.f286054a);
        C90929bz bzVar = qVar.f286059f;
        C89061q a2 = ((C89037bh) aVar4.mo27525b()).mo27376a(15, C89066v.f241382a);
        C86124t tVar2 = tVar;
        C85923cq cqVar2 = cqVar;
        C85929cw cwVar2 = cwVar;
        C102480f fVar = new C102480f(bzVar, tVar2, cqVar2, cwVar2, new C86268w(qVar.f286059f, qVar.f286063j, a2, (int) qVar.f286061h.mo79743a(C90120fr.f250766F), qVar.f286064k), qVar.f286062i, aVar2);
        C102481g gVar2 = new C102481g(this);
        C86054o oVar = qVar.f286058e;
        C90465g gVar3 = qVar.f286055b;
        C90465g gVar4 = gVar3;
        this.f286042b = new C102464ah(aVar4, cwVar, aVar2, amVar, fVar, gVar2, this, oVar, gVar4, qVar.f286059f, sVar);
        ActionBar actionBar = this.f54539k.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        Intent b = this.f54539k.mo24853b();
        if (b != null && b.hasExtra("screen_orientation")) {
            C90779c.m148334a(this.f54539k, b.getIntExtra("screen_orientation", -1));
        }
        if (bundle2 != null) {
            C102464ah ahVar = this.f286042b;
            C58838bb.m90883r(!ahVar.f285957j);
            ahVar.f285959l = (RequestStack) bundle2.getParcelable("InAppWebPage.RequestStack");
            if (ahVar.f285959l != null) {
                ahVar.mo93272c();
                ahVar.f285957j = true;
            }
        }
    }

    /* renamed from: d */
    public final void mo24897d() {
        ActionBar actionBar;
        this.f54539k.mo24866m();
        Intent b = this.f54539k.mo24853b();
        if (b == null) {
            this.f286042b.mo93273d((Request) null);
        } else {
            if (b.getBooleanExtra("full_screen", false) && (actionBar = this.f54539k.getActionBar()) != null) {
                actionBar.hide();
            }
            this.f286042b.mo93273d(Request.m142363a(b));
        }
        this.f286052n.mo81790W();
        ((C102482h) this.f286051m).f286033a.mo81961c(new C88489j(C87739bu.PREPARE_CCT_SESSION).mo82013a());
    }

    /* renamed from: e */
    public final void mo24898e(int i, int i2, Intent intent) {
        C91090a aVar = this.f286041a;
        aVar.mo85356g(i, i2, intent, aVar.f254379a);
    }

    /* renamed from: g */
    public final void mo24900g() {
        C102464ah ahVar = this.f286042b;
        C102495u uVar = ahVar.f285958k;
        if (uVar != null) {
            uVar.mo93313c();
        }
        ahVar.f285953f.mo93297a();
        C87690b bVar = this.f286052n;
        this.f54539k.isChangingConfigurations();
        bVar.mo81809ap();
        this.f54539k.mo24862i();
    }

    /* renamed from: h */
    public final void mo93305h() {
        this.f286046f.animate().cancel();
        this.f286046f.animate().alpha(0.0f).setDuration((long) this.f286047g).setListener(new C102484j(this.f286046f));
    }

    /* renamed from: ih */
    public final void mo24903ih(Bundle bundle) {
        bundle.putParcelable("InAppWebPage.RequestStack", this.f286042b.f285959l);
        this.f286052n.f237037a.mo81942n(bundle);
        this.f54539k.mo24865l(bundle);
    }

    /* renamed from: in */
    public final void mo24904in() {
        int childCount = this.f286043c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((WebView) this.f286043c.getChildAt(i)).onPause();
        }
        this.f54539k.isChangingConfigurations();
        this.f54539k.mo24863j();
    }

    /* renamed from: j */
    public final void mo24905j() {
        this.f54539k.mo24864k();
        int childCount = this.f286043c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((WebView) this.f286043c.getChildAt(i)).onResume();
        }
        this.f286052n.mo81788U();
    }

    /* renamed from: k */
    public final void mo24906k() {
        C102481g gVar = this.f286042b.f285953f;
        gVar.f286032d = false;
        gVar.mo93299c();
        this.f286052n.mo81791X(this.f54539k.isChangingConfigurations());
        this.f54539k.mo24867n();
    }

    /* renamed from: l */
    public final void mo24907l(boolean z) {
        this.f286052n.f237037a.mo81938j(z);
    }

    /* renamed from: m */
    public final void mo24908m(boolean z) {
        Intent b = this.f54539k.mo24853b();
        if (z && b != null && b.getBooleanExtra("hide_status_bar", false)) {
            View decorView = this.f54539k.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1028);
        }
        this.f286052n.mo81792Y(z);
    }

    /* renamed from: n */
    public final void mo93306n(C87278x xVar) {
        WebView webView = xVar.f235736a;
        webView.setFocusable(false);
        webView.setFocusableInTouchMode(false);
        webView.animate().cancel();
        webView.animate().alpha(0.0f).setDuration((long) this.f286047g).setListener(new C102485k(this, webView));
    }

    /* renamed from: o */
    public final void mo93307o(int i) {
        this.f286045e.animate().cancel();
        this.f286050l.setText(i);
        this.f286045e.setVisibility(0);
        this.f286045e.animate().alpha(1.0f).setDuration((long) this.f286047g);
    }

    /* renamed from: p */
    public final void mo93308p(C87278x xVar) {
        WebView webView = xVar.f235736a;
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.setVisibility(0);
        webView.setAlpha(0.0f);
        webView.animate().alpha(1.0f).setDuration((long) this.f286047g);
    }

    /* renamed from: q */
    public final boolean mo24909q(Menu menu) {
        C102464ah ahVar = this.f286042b;
        menu.add(0, R.id.in_app_web_page_refresh_option_id, 196608, ahVar.f285950c.getResources().getString(R.string.menu_refresh)).setOnMenuItemClickListener(new C102492r(ahVar));
        menu.add(0, 0, 196608, ahVar.f285950c.getResources().getString(R.string.help_and_feedback)).setOnMenuItemClickListener(new C102493s(ahVar));
        return true;
    }

    /* renamed from: r */
    public final boolean mo24910r(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return this.f54539k.mo24891s(menuItem);
        }
        ((C59052c) ((C59052c) f286040h.mo56224b()).mo56372aa(20803)).mo56386p("Passing home options item to presenter");
        this.f286042b.f285949b.f54539k.mo24855e();
        return true;
    }

    /* renamed from: s */
    public final boolean mo24911s(Menu menu) {
        C102475as asVar;
        C102481g gVar = this.f286042b.f285953f;
        menu.removeGroup(1);
        if (gVar.f286030b == 1 && (asVar = gVar.f286031c) != null) {
            synchronized (asVar.f286000l) {
                for (C102468al alVar : asVar.f286000l) {
                    MenuItem add = menu.add(1, 0, alVar.f285972b, alVar.f285971a);
                    if (!alVar.f285974d) {
                        add.setIntent(alVar.f285975e);
                    } else {
                        add.setOnMenuItemClickListener(new C102467ak(alVar));
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: t */
    public final void mo93309t() {
        Toast.makeText(this.f54539k, R.string.no_url_handler, 0).show();
    }

    /* renamed from: f */
    public final void mo24899f() {
        C102475as asVar;
        C102464ah ahVar = this.f286042b;
        if (ahVar.f285959l != null) {
            C102481g gVar = ahVar.f285953f;
            if (gVar.f286030b == 1 && (asVar = gVar.f286031c) != null && asVar.f285991c.f235736a.canGoBack()) {
                asVar.f285991c.mo80924c();
                return;
            } else if (ahVar.f285959l.f285932a.size() > 1) {
                ahVar.f285959l.f285932a.removeFirst();
                ahVar.mo93272c();
                return;
            }
        }
        this.f54539k.setResult(-1, new Intent());
        this.f54539k.mo24858g();
    }
}
