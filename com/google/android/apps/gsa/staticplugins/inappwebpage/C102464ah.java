package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6513aj.C84563w;
import com.google.android.apps.gsa.search.core.service.C86776s;
import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.util.p1935a.C23336a;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.ah */
/* compiled from: PG */
public final class C102464ah {

    /* renamed from: a */
    public static final C59071e f285948a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.inappwebpage.ah");

    /* renamed from: b */
    public final C102488n f285949b;

    /* renamed from: c */
    public final Context f285950c;

    /* renamed from: d */
    public final C85929cw f285951d;

    /* renamed from: e */
    public final C102469am f285952e;

    /* renamed from: f */
    public final C102481g f285953f;

    /* renamed from: g */
    public final C86054o f285954g;

    /* renamed from: h */
    public final C90465g f285955h;

    /* renamed from: i */
    public final C90929bz f285956i;

    /* renamed from: j */
    public boolean f285957j = false;

    /* renamed from: k */
    public C102495u f285958k;

    /* renamed from: l */
    public RequestStack f285959l;

    /* renamed from: m */
    public int f285960m = 0;

    /* renamed from: n */
    public final C102463ag f285961n = new C102463ag();

    /* renamed from: o */
    public C84563w f285962o = null;

    /* renamed from: p */
    public C90936cf f285963p = null;

    /* renamed from: q */
    private final C68214a f285964q;

    /* renamed from: r */
    private final C102480f f285965r;

    /* renamed from: s */
    private final C86776s f285966s;

    public C102464ah(C68214a aVar, C85929cw cwVar, Context context, C102469am amVar, C102480f fVar, C102481g gVar, C102488n nVar, C86054o oVar, C90465g gVar2, C90929bz bzVar, C86776s sVar) {
        this.f285949b = nVar;
        this.f285950c = context;
        this.f285964q = aVar;
        this.f285951d = cwVar;
        this.f285952e = amVar;
        this.f285965r = fVar;
        this.f285953f = gVar;
        this.f285954g = oVar;
        this.f285955h = gVar2;
        this.f285956i = bzVar;
        this.f285966s = sVar;
    }

    /* renamed from: a */
    public final void mo93270a() {
        C90936cf cfVar = this.f285963p;
        if (cfVar != null) {
            this.f285956i.mo85149n(cfVar);
            this.f285963p = null;
        }
    }

    /* renamed from: b */
    public final void mo93271b(String str, Query query) {
        try {
            Query o = this.f285951d.mo79574o(query, str);
            if (o != null) {
                this.f285949b.f54539k.startActivity(C89429a.m145446d(this.f285950c, o.mo84277aN()));
                return;
            }
            Intent a = C23336a.m43768a(Uri.parse(str).toString());
            C88489j jVar = new C88489j(C87739bu.BROWSABLE_INTENT_LAUNCHED_IN_CLIENT);
            jVar.mo82015c(a);
            this.f285966s.mo80221b(jVar.mo82013a());
        } catch (ActivityNotFoundException unused) {
            ((C59052c) ((C59052c) f285948a.mo56225c()).mo56372aa(20808)).mo56389s("No activity found to open: %s", str);
            this.f285949b.mo93309t();
        } catch (URISyntaxException unused2) {
            ((C59052c) ((C59052c) f285948a.mo56225c()).mo56372aa(20809)).mo56389s("Invalid URL %s", str);
            this.f285949b.mo93309t();
        }
    }

    /* renamed from: c */
    public final void mo93272c() {
        C60870cx cxVar;
        C102495u uVar = this.f285958k;
        if (uVar != null) {
            uVar.mo93313c();
        }
        if (this.f285959l.f285932a.isEmpty()) {
            this.f285949b.f54539k.mo24855e();
            return;
        }
        Request a = this.f285959l.mo93254a();
        mo93270a();
        C102481g gVar = this.f285953f;
        int i = gVar.f286030b;
        if (i == 1) {
            gVar.f286032d = false;
            gVar.mo93299c();
            gVar.f286029a.f54539k.setTitle((CharSequence) null);
            C102475as asVar = gVar.f286031c;
            if (asVar != null) {
                gVar.f286029a.mo93306n(asVar.f285991c);
                gVar.f286031c = null;
            }
        } else if (i == 2) {
            gVar.f286029a.mo93305h();
        } else if (i == 3) {
            C102488n nVar = gVar.f286029a;
            nVar.f286045e.animate().cancel();
            nVar.f286045e.setVisibility(4);
            nVar.f286045e.setAlpha(0.0f);
        }
        gVar.mo93297a();
        gVar.f286030b = 0;
        C102494t tVar = new C102494t(this);
        this.f285963p = tVar;
        this.f285956i.mo85150o(tVar, 3000);
        int i2 = this.f285960m + 1;
        this.f285960m = i2;
        C102496v vVar = new C102496v(this, i2);
        C102480f fVar = this.f285965r;
        Uri uri = a.f236600a;
        SettableFuture settableFuture = new SettableFuture();
        if (C90772bp.m148276C(uri) || ((C58890d.m90990e(uri.getAuthority(), "com.google.android.googlequicksearchbox") || C58890d.m90990e(uri.getAuthority(), "android")) && C58890d.m90990e(uri.getScheme(), "android.resource"))) {
            fVar.f286022b.mo85139d(new C102477c(fVar, settableFuture, uri, vVar));
            cxVar = settableFuture;
        } else if (fVar.f286024d.mo79554e(uri, true)) {
            C102479e eVar = new C102479e(fVar, settableFuture, uri, vVar);
            eVar.f286020g.mo93314a(new C84563w("Loading %s", C85929cw.m138090u(eVar.f286015b)));
            eVar.f286019f.f286022b.mo85139d(new C102478d(eVar, eVar.f286015b));
            cxVar = settableFuture;
        } else {
            vVar.mo93314a(new C84563w("Attempt to load insecure URI %s", C85929cw.m138090u(uri)));
            cxVar = C60856cj.m92899h(new Exception("Attempt to load insecure URI"));
        }
        this.f285958k = new C102495u(this, a, cxVar);
    }

    /* renamed from: d */
    public final void mo93273d(Request request) {
        if (!this.f285957j) {
            RequestStack requestStack = new RequestStack();
            this.f285959l = requestStack;
            if (request != null) {
                requestStack.f285932a.addFirst(request);
            }
            mo93272c();
            this.f285957j = true;
        }
        C102481g gVar = this.f285953f;
        gVar.f286032d = true;
        gVar.mo93299c();
        Intent b = this.f285949b.f54539k.mo24853b();
        if (b != null && b.getBooleanExtra("WEBVIEW_SHOW_PROGRESS_BAR", false)) {
            this.f285953f.mo93298b();
        }
    }

    /* renamed from: e */
    public final void mo93274e() {
        mo93270a();
        int i = true != ((C89037bh) this.f285964q.mo27525b()).mo27377b().mo83040a() ? R.string.connection_error_loading_content : R.string.error_loading_content;
        C102481g gVar = this.f285953f;
        int i2 = gVar.f286030b;
        if (i2 == 0) {
            gVar.f286029a.mo93307o(i);
        } else if (i2 == 2) {
            gVar.f286029a.mo93305h();
            gVar.f286029a.mo93307o(i);
        } else if (i2 == 1) {
            gVar.f286032d = false;
            gVar.mo93299c();
            C102475as asVar = gVar.f286031c;
            if (asVar != null) {
                gVar.f286029a.mo93306n(asVar.f285991c);
            }
            gVar.f286029a.mo93307o(i);
            gVar.f286029a.f54539k.setTitle((CharSequence) null);
        }
        gVar.mo93297a();
        gVar.f286030b = 3;
    }
}
