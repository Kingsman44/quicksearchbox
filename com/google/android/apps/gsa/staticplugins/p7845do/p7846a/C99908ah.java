package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C86074p;
import com.google.android.apps.gsa.search.core.p6512ai.C84510a;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85454d;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6906n.p6907a.C87358b;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6910b.C87366a;
import com.google.android.apps.gsa.search.core.webview.C87259e;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.monet.p7070b.p7072aa.C90173a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7830e.C99777j;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7831f.C99786d;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7833h.C99796h;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7839n.C99832f;
import com.google.android.apps.gsa.staticplugins.p7825dm.p7840o.C99842d;
import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99935a;
import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99938d;
import com.google.android.apps.gsa.staticplugins.p7845do.p7847b.C99939e;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.ah */
/* compiled from: PG */
public final class C99908ah extends C23056g implements C90173a, C99935a {

    /* renamed from: a */
    public static final C59071e f279479a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.do.a.ah");

    /* renamed from: A */
    private final C86074p f279480A;

    /* renamed from: b */
    public final C99939e f279481b;

    /* renamed from: c */
    public final Context f279482c;

    /* renamed from: d */
    public final C22871g f279483d;

    /* renamed from: e */
    public final C22871g f279484e;

    /* renamed from: f */
    public final C85923cq f279485f;

    /* renamed from: g */
    public final C58833ax f279486g;

    /* renamed from: h */
    public final C86130z f279487h;

    /* renamed from: i */
    public final C85929cw f279488i;

    /* renamed from: j */
    public final C84510a f279489j;

    /* renamed from: k */
    public final C84515a f279490k;

    /* renamed from: l */
    public final C91097g f279491l;

    /* renamed from: m */
    public final C90021c f279492m;

    /* renamed from: n */
    public final C68214a f279493n;

    /* renamed from: o */
    public final C89859i f279494o;

    /* renamed from: p */
    public final C85142a f279495p;

    /* renamed from: q */
    public final boolean f279496q;

    /* renamed from: r */
    public final C68214a f279497r;

    /* renamed from: s */
    public final C99796h f279498s;

    /* renamed from: t */
    public final C99786d f279499t;

    /* renamed from: u */
    public final C99832f f279500u;

    /* renamed from: v */
    public final C99777j f279501v;

    /* renamed from: w */
    public final C99842d f279502w;

    /* renamed from: x */
    private final C23149a f279503x;

    /* renamed from: y */
    private final C58833ax f279504y;

    /* renamed from: z */
    private final C85454d f279505z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99908ah(C23052c cVar, C99939e eVar, C23149a aVar, C58833ax axVar, Context context, C22871g gVar, C22871g gVar2, C85454d dVar, C99796h hVar, C99786d dVar2, C99832f fVar, C99777j jVar, C99842d dVar3, C85923cq cqVar, C58833ax axVar2, C86130z zVar, C85929cw cwVar, C84510a aVar2, C84515a aVar3, C90021c cVar2, C91097g gVar3, C86074p pVar, C68214a aVar4, C89859i iVar, C85142a aVar5, boolean z, C68214a aVar6) {
        super(cVar);
        this.f279481b = eVar;
        this.f279503x = aVar;
        this.f279504y = axVar;
        this.f279482c = context;
        this.f279483d = gVar;
        this.f279484e = gVar2;
        this.f279505z = dVar;
        this.f279498s = hVar;
        this.f279499t = dVar2;
        this.f279500u = fVar;
        this.f279501v = jVar;
        this.f279502w = dVar3;
        this.f279485f = cqVar;
        this.f279486g = axVar2;
        this.f279487h = zVar;
        this.f279488i = cwVar;
        this.f279489j = aVar2;
        this.f279490k = aVar3;
        this.f279492m = cVar2;
        this.f279491l = gVar3;
        this.f279480A = pVar;
        this.f279493n = aVar4;
        this.f279494o = iVar;
        this.f279495p = aVar5;
        this.f279496q = z;
        this.f279497r = aVar6;
    }

    /* renamed from: e */
    public static Intent m165565e(Optional optional) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        if (!TextUtils.isEmpty((CharSequence) optional.orElse(BuildConfig.FLAVOR))) {
            String queryParameter = Uri.parse((String) optional.get()).getQueryParameter("q");
            if (!TextUtils.isEmpty(queryParameter)) {
                eVar.copyOnWrite();
                C137418g gVar = (C137418g) eVar.instance;
                queryParameter.getClass();
                gVar.f373769a |= 1;
                gVar.f373770b = queryParameter;
            }
        }
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
        C136127h.m221196a(intent, l.mo112766a());
        intent.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2);
        intent.putExtra("SKIP_EXIT_ANIMATION", true);
        return intent;
    }

    /* renamed from: o */
    private final void m165566o() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f279481b.mo91665g()).f63720e;
        this.f279494o.mo83702b(C89849ae.SILKYTAB_WEBVIEW_CREATE_START);
        if (axVar.mo56113h()) {
            new C90873ag(this.f279505z.mo78962d(((GsaWebViewContainer) axVar.mo56107c()).mo80859b()), this.f279483d, "onRestore callback", new C99934z(this)).mo85223a(new C99911c(this));
            return;
        }
        mo91674h();
    }

    /* renamed from: a */
    public final void mo83919a() {
        this.f279484e.mo28212l("invalidateWebView", new C99919k((C58833ax) ((C23251a) this.f279481b.mo91665g()).f63720e));
    }

    /* renamed from: b */
    public final void mo83920b(Uri uri) {
        this.f279484e.mo28212l("loadUrl", new C99928t(this, (C58833ax) ((C23251a) this.f279481b.mo91665g()).f63720e, uri));
    }

    /* renamed from: c */
    public final void mo83921c(Uri uri) {
        this.f279484e.mo28212l("loadUrlOnlyIfCurrentlyInvalidated", new C99930v(this, (C58833ax) ((C23251a) this.f279481b.mo91665g()).f63720e, uri));
    }

    /* renamed from: d */
    public final void mo83922d() {
        this.f279484e.mo28212l("reloadUrlInWebView", new C99912d(this, (C58833ax) ((C23251a) this.f279481b.mo91665g()).f63720e, (String) ((C23251a) this.f279481b.mo91664f()).f63720e));
    }

    /* renamed from: f */
    public final Map mo91673f() {
        C86074p pVar = this.f279480A;
        C58495hd n = C58495hd.m89900n("X-Client-Data", pVar.mo79713a(false, pVar.mo79714b()).toByteArray());
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : n.entrySet()) {
            gzVar.mo55429h((String) entry.getKey(), Base64.encodeToString((byte[]) entry.getValue(), 11));
        }
        return new HashMap(gzVar.mo55427f(false));
    }

    /* renamed from: h */
    public final void mo91674h() {
        new C90873ag(this.f279484e.mo28209i(this.f279505z.mo78961c(new C87259e("SilkyTab")), "setupWebView", new C99926r(this, (String) ((C23251a) this.f279481b.mo91664f()).f63720e)), this.f279483d, "createAndSetupNewWebView callback", new C99913e(this)).mo85223a(new C99914f(this));
    }

    /* renamed from: i */
    public final void mo91675i(boolean z) {
        this.f279503x.mo28600c();
        if (this.f279504y.mo56113h()) {
            ((C87366a) this.f279504y.mo56107c()).mo81035b(z);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        m165566o();
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        this.f279494o.mo83702b(C89849ae.SILKYTAB_INITIALIZE_START);
        C87358b bVar = (C87358b) C23245b.m43557b(protoParcelable, C87358b.f235922c.getParserForType(), C62921ba.m95368a(), true);
        bVar.getClass();
        C58838bb.m90884s(!bVar.f235925b.isEmpty(), "Cannot start a silkytab with empty URL.");
        ((C23251a) this.f279481b.mo91664f()).mo28730f(bVar.f235925b, false);
        this.f279481b.mo91667i().mo28730f(Boolean.valueOf(this.f279496q), false);
        m165566o();
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        this.f279503x.mo28592a(new C99918j(this));
    }

    /* renamed from: j */
    public final void mo91676j() {
        C58833ax axVar = (C58833ax) ((C23251a) this.f279481b.mo91665g()).f63720e;
        if (axVar.mo56113h()) {
            this.f279505z.mo78969k(((GsaWebViewContainer) axVar.mo56107c()).mo80859b());
        }
        mo91675i(false);
    }

    /* renamed from: k */
    public final void mo91677k() {
        boolean z = true;
        boolean z2 = this.f279496q != ((Boolean) this.f279481b.mo91667i().f63720e).booleanValue();
        if (((Boolean) this.f279481b.mo91666h().f63720e).booleanValue()) {
            z = z2;
        } else if (!z2) {
            return;
        }
        this.f279481b.mo91666h().mo28730f(false, false);
        this.f279481b.mo91667i().mo28730f(Boolean.valueOf(this.f279496q), false);
        this.f279484e.mo28212l("reloadCurrentUrlInWebView", new C99927s(this, (C58833ax) ((C23251a) this.f279481b.mo91665g()).f63720e, z));
    }

    /* renamed from: l */
    public final void mo91678l(C99938d dVar) {
        ((C23251a) this.f279481b.mo91661c()).mo28730f(C58833ax.m90834k(dVar), false);
        ((C23251a) this.f279481b.mo91660b()).mo28730f(false, false);
    }

    /* renamed from: m */
    public final void mo91679m(WebView webView) {
        webView.setWebChromeClient(new C99902ab(this));
    }

    /* renamed from: n */
    public final void mo91680n(WebView webView) {
        webView.setWebViewClient(new C99906af(this));
    }
}
