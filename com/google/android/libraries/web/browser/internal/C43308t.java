package com.google.android.libraries.web.browser.internal;

import android.net.Uri;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.p3348b.p3351c.C43250f;
import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.browser.C43314j;
import com.google.android.libraries.web.browser.internal.p3352a.C43285d;
import com.google.android.libraries.web.browser.internal.p3352a.C43287f;
import com.google.android.libraries.web.browser.internal.p3352a.C43289h;
import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3423l.C43873a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.p3428m.p3429a.C43920i;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43911f;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43912g;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.browser.internal.t */
/* compiled from: PG */
public final class C43308t implements C43314j {

    /* renamed from: a */
    public static final C59071e f113151a = C59071e.m91331h();

    /* renamed from: b */
    public final C43272a f113152b;

    /* renamed from: c */
    public final C60887da f113153c;

    /* renamed from: d */
    public C69626l f113154d = C43307s.f113150a;

    /* renamed from: e */
    public final C43920i f113155e;

    /* renamed from: f */
    public final C43250f f113156f;

    /* renamed from: g */
    public final boolean f113157g;

    /* renamed from: h */
    public C60870cx f113158h;

    /* renamed from: i */
    private final C43873a f113159i;

    /* renamed from: j */
    private final C43269t f113160j;

    public C43308t(C43272a aVar, C43873a aVar2, C60887da daVar, C43269t tVar, WebModelProvider webModelProvider) {
        C69664n.m101061g(aVar, "browser");
        C69664n.m101061g(aVar2, "urlChecker");
        C69664n.m101061g(daVar, "uiThreadExecutor");
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(webModelProvider, "coordinatorModelProvider");
        this.f113152b = aVar;
        this.f113159i = aVar2;
        this.f113153c = daVar;
        this.f113160j = tVar;
        C43891f d = aVar.mo46411d(C43920i.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        this.f113155e = (C43920i) ((C43314j) d);
        this.f113156f = (C43250f) webModelProvider.mo47072a(C43250f.class);
        this.f113157g = tVar.mo46384b().f112975n;
        aVar.mo46410c().mo46896b(new C43281a(this));
    }

    /* renamed from: a */
    public final void mo46402a(C60870cx cxVar, C69626l lVar) {
        this.f113158h = cxVar;
        C43295g gVar = new C43295g(new C43292d(this, cxVar, lVar), this);
        C60856cj.m92911t(cxVar, C47810es.m84974n(gVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo46403b() {
        C60870cx cxVar = this.f113158h;
        if (cxVar != null) {
            this.f113158h = null;
            cxVar.cancel(false);
        }
    }

    /* renamed from: c */
    public final void mo46404c() {
        C43272a aVar = this.f113152b;
        C69664n.m101061g(aVar, "<this>");
        C43891f d = aVar.mo46411d(C43289h.class);
        C69664n.m101060f(d, "getPlugin(T::class.java)");
        C43314j jVar = (C43314j) d;
        C69664n.m101059e(jVar, "null cannot be cast to non-null type com.google.android.libraries.web.browser.internal.api.BrowserVisibilityApi");
        ((C43285d) jVar).mo46397e();
    }

    /* renamed from: d */
    public final void mo46405d(C43257h hVar, C43366k kVar) {
        C69664n.m101061g(hVar, "loadUrlParams");
        C69664n.m101061g(kVar, "customTriggerType");
        mo46406e(hVar, kVar, (C60870cx) null);
    }

    /* renamed from: e */
    public final void mo46406e(C43257h hVar, C43366k kVar, C60870cx cxVar) {
        mo46403b();
        C43873a aVar = this.f113159i;
        Uri parse = Uri.parse(hVar.mo46356f());
        C69664n.m101060f(parse, "parse(loadUrlParams.url())");
        if (aVar.mo46765a(parse)) {
            C43287f.m76385a(this.f113152b).mo46399g();
            this.f113155e.mo46944k(new C43303o(this, hVar, kVar, cxVar));
            return;
        }
        throw new IllegalArgumentException("Tried to load a URL which this client does not have permission for (go/webx-thirdparty).");
    }

    /* renamed from: f */
    public final boolean mo46407f(C69626l lVar) {
        String str;
        mo46403b();
        if (!this.f113155e.mo46945l()) {
            return false;
        }
        C43914c i = this.f113155e.mo46769c();
        C69664n.m101058d(i);
        C43911f a = C43912g.m77530a(i);
        int c = a.mo46928c();
        C43914c i2 = this.f113155e.mo46769c();
        C69664n.m101058d(i2);
        C43911f a2 = C43912g.m77530a(i2);
        int c2 = a2.mo46928c();
        int b = a2.mo46927b(lVar);
        if (b != c2) {
            c2 = b;
        } else {
            int a3 = this.f113155e.mo46936a() - 1;
            int i3 = a3 - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                String e = C43912g.m77530a(this.f113155e.mo46941h(i3)).mo46929e();
                if (e == null) {
                    i3--;
                } else if (((Boolean) lVar.mo5761a(e)).booleanValue()) {
                    c2 = i3 - a3;
                }
            }
        }
        if (c2 == c) {
            return false;
        }
        C43945v b2 = i.mo46411d(C43331ag.class);
        C69664n.m101060f(b2, "getPlugin(T::class.java)");
        C43331ag agVar = (C43331ag) b2;
        C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
        if (c2 < 0) {
            C43920i iVar2 = this.f113155e;
            str = C43912g.m77530a(iVar2.mo46941h((iVar2.mo46936a() - 1) + c2)).mo46929e();
            C69664n.m101058d(str);
        } else {
            str = a.mo46930f(c2);
        }
        iVar.copyOnWrite();
        C43367l lVar2 = (C43367l) iVar.instance;
        str.getClass();
        lVar2.f113295a |= 2;
        lVar2.f113297c = str;
        C43366k kVar = C43366k.GO_BACK;
        iVar.copyOnWrite();
        C43367l lVar3 = (C43367l) iVar.instance;
        lVar3.f113299e = kVar.f113292i;
        lVar3.f113295a |= 8;
        agVar.mo46449k((C43367l) iVar.build());
        if (c2 < 0) {
            int i4 = -c2;
            for (int i5 = 0; i5 < i4; i5++) {
                C43287f.m76385a(this.f113152b).mo46398f();
            }
            return true;
        }
        a.mo46931h(c2);
        return true;
    }
}
