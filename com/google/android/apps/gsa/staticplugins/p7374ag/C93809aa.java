package com.google.android.apps.gsa.staticplugins.p7374ag;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.C89834a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.shared.util.C91080q;
import com.google.android.apps.gsa.shared.util.p7159c.C90886at;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7159c.C90952r;
import com.google.android.apps.gsa.staticplugins.p7374ag.p7376b.C93817b;
import com.google.android.apps.gsa.staticplugins.p7374ag.p7376b.C93818c;
import com.google.android.apps.gsa.staticplugins.p7374ag.p7376b.C93819d;
import com.google.android.libraries.web.webview.p3471a.C44333q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ag.aa */
/* compiled from: PG */
public final class C93809aa extends C93815b {

    /* renamed from: a */
    public static final C59071e f262034a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ag.aa");

    /* renamed from: o */
    private static final C58528ij f262035o = C58528ij.m90011K("NID", "PREF");

    /* renamed from: b */
    public final C68214a f262036b;

    /* renamed from: c */
    public final Executor f262037c;

    /* renamed from: d */
    public final C68214a f262038d;

    /* renamed from: e */
    public final C69464a f262039e;

    /* renamed from: f */
    public final C68214a f262040f;

    /* renamed from: g */
    public final C68214a f262041g;

    /* renamed from: h */
    public final C68214a f262042h;

    /* renamed from: i */
    public volatile CookieSyncManager f262043i;

    /* renamed from: j */
    public CookieManager f262044j;

    /* renamed from: k */
    public String f262045k;

    /* renamed from: l */
    public volatile C90457d f262046l;

    /* renamed from: m */
    public final Object f262047m = new Object();

    /* renamed from: n */
    public boolean f262048n = false;

    /* renamed from: p */
    private final C60887da f262049p;

    /* renamed from: q */
    private final C68214a f262050q;

    /* renamed from: r */
    private final C68214a f262051r;

    /* renamed from: s */
    private final C68214a f262052s;

    /* renamed from: t */
    private final C68214a f262053t;

    /* renamed from: u */
    private C60870cx f262054u;

    /* renamed from: v */
    private C60870cx f262055v = C118826c.f331423b;

    protected C93809aa(C68214a aVar, C68214a aVar2, C60887da daVar, Executor executor, C68214a aVar3, C68214a aVar4, C69464a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10) {
        this.f262036b = aVar;
        this.f262050q = aVar2;
        this.f262049p = daVar;
        this.f262037c = executor;
        this.f262040f = aVar3;
        this.f262038d = aVar4;
        this.f262039e = aVar5;
        this.f262051r = aVar6;
        this.f262041g = aVar7;
        this.f262042h = aVar8;
        this.f262052s = aVar9;
        this.f262053t = aVar10;
    }

    /* renamed from: i */
    public static boolean m154809i(String str) {
        return str != null && str.contains("SID=");
    }

    /* renamed from: j */
    private final C60870cx m154810j(String str, Callable callable) {
        return C60846c.m92879h(C90886at.m148484a(this.f262049p.mo19399b(new C93836p(this, str, callable)), 30000, (C90931ca) this.f262050q.mo27525b()), Throwable.class, new C93837q(this), C60826bg.f164896a);
    }

    /* renamed from: k */
    private final synchronized void m154811k() {
        if (this.f262054u == null) {
            this.f262054u = m154810j("Init cookies", new C93840t(this));
        }
        C60856cj.m92901j(this.f262054u);
    }

    /* renamed from: a */
    public final C60870cx mo83048a(String str) {
        mo88180g();
        C60870cx e = ((C90931ca) this.f262050q.mo27525b()).mo85140e(mo88179f(str), new C93843w(this, str));
        ((C90931ca) this.f262050q.mo27525b()).mo85142g(e, new C93841u(this, str));
        return e;
    }

    /* renamed from: b */
    public final C60870cx mo83049b(boolean z) {
        synchronized (this.f262047m) {
            if (this.f262048n) {
                C60870cx j = C60856cj.m92901j(this.f262055v);
                return j;
            }
            this.f262048n = true;
            C60870cx e = ((C90931ca) this.f262050q.mo27525b()).mo85140e(C60846c.m92878g(this.f262055v, Throwable.class, C93838r.f262095a, C60826bg.f164896a), new C93845y(this, z));
            this.f262055v = e;
            ((C90931ca) this.f262050q.mo27525b()).mo85142g(e, new C90952r("WebViewCookiesAsync", "Log cookie refresh", "Cookie refresh failed"));
            return C60856cj.m92901j(e);
        }
    }

    /* renamed from: c */
    public final void mo83050c() {
        m154811k();
        mo83049b(false);
    }

    /* renamed from: d */
    public final void mo83051d() {
        m154811k();
        m154810j("Remove cookies", new C93835o(this));
        C93813ae aeVar = (C93813ae) this.f262052s.mo27525b();
        C60870cx b = aeVar.f262060d.mo79697b();
        C44333q qVar = aeVar.f262058b;
        Objects.requireNonNull(qVar);
        C93811ac acVar = new C93811ac(qVar);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(acVar), aeVar.f262061e);
        C93812ad adVar = new C93812ad();
        C60856cj.m92911t(h, C47810es.m84974n(adVar), aeVar.f262061e);
        C86337q b2 = ((C86338r) this.f262051r.mo27525b()).mo80076b();
        b2.mo80072g("refresh_webview_cookies_at", 0);
        b2.apply();
    }

    /* renamed from: e */
    public final void mo83052e(String str, List list) {
        m154811k();
        m154810j("Set cookies", new C93834n(this, list, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C60870cx mo88179f(String str) {
        m154811k();
        return m154810j("Get cookies", new C93839s(this, str));
    }

    /* renamed from: g */
    public final void mo88180g() {
        C60870cx a = ((C93813ae) this.f262052s.mo27525b()).f262059c.mo47223a(((C86338r) this.f262041g.mo27525b()).getString(C90507o.f253011a, (String) null));
        C93846z zVar = new C93846z(this);
        C60856cj.m92911t(a, C47810es.m84974n(zVar), this.f262037c);
    }

    /* renamed from: h */
    public final void mo88181h(String str) {
        String str2;
        C93819d dVar = (C93819d) this.f262053t.mo27525b();
        C58528ij ijVar = f262035o;
        if (str != null) {
            TreeSet treeSet = new TreeSet();
            for (Map.Entry entry : C91080q.m148801a(str).entrySet()) {
                if (ijVar.contains(entry.getKey())) {
                    treeSet.add((String) entry.getValue());
                }
            }
            if (!treeSet.isEmpty()) {
                str2 = TextUtils.join("; ", treeSet);
                C89949q.m146527l(new C89834a(str2, false, (String) null));
                C60856cj.m92911t(C60922j.m93045h(dVar.f262065b.mo79697b(), C47810es.m84966f(new C93817b(dVar, str2)), dVar.f262067d), C47810es.m84974n(new C93818c()), C60826bg.f164896a);
            }
        }
        str2 = null;
        C89949q.m146527l(new C89834a(str2, false, (String) null));
        C60856cj.m92911t(C60922j.m93045h(dVar.f262065b.mo79697b(), C47810es.m84966f(new C93817b(dVar, str2)), dVar.f262067d), C47810es.m84974n(new C93818c()), C60826bg.f164896a);
    }
}
