package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87250s;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113177ch;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.al */
/* compiled from: PG */
public final class C111485al {

    /* renamed from: a */
    public static final C121537f f310121a = C121537f.m200840b("TapasCompleteServerResponseFetcher", C111510r.f310175c);

    /* renamed from: b */
    public static final C59071e f310122b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.al");

    /* renamed from: c */
    public final C68214a f310123c;

    /* renamed from: d */
    public final C87250s f310124d;

    /* renamed from: e */
    public final C84466a f310125e;

    /* renamed from: f */
    private final C22871g f310126f;

    /* renamed from: g */
    private final C22871g f310127g;

    /* renamed from: h */
    private final C21370a f310128h;

    /* renamed from: i */
    private final C111497e f310129i;

    /* renamed from: j */
    private final C86124t f310130j;

    /* renamed from: k */
    private final Object f310131k = new Object();

    /* renamed from: l */
    private final ArrayDeque f310132l = new ArrayDeque();

    public C111485al(C68214a aVar, C84466a aVar2, C87250s sVar, C22871g gVar, C22871g gVar2, C21370a aVar3, C111497e eVar, C86124t tVar) {
        aVar.getClass();
        this.f310123c = aVar;
        this.f310125e = aVar2;
        this.f310124d = sVar;
        this.f310126f = gVar;
        this.f310127g = gVar2;
        this.f310128h = aVar3;
        this.f310129i = eVar;
        this.f310130j = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo99158a(C113405ep epVar) {
        C60870cx e;
        synchronized (this.f310131k) {
            while (this.f310132l.size() > 0) {
                C58976aa aaVar = C58975e.f156826a;
                C60870cx cxVar = (C60870cx) this.f310132l.pollFirst();
                cxVar.getClass();
                cxVar.cancel(true);
            }
            C121537f fVar = f310121a;
            C121509q l = fVar.mo105243l("sendRequest");
            try {
                C111497e eVar = this.f310129i;
                String p = epVar.mo100033p();
                if (eVar.f310151a.mo79745c(C90063do.f249595gW).contains(C48672ag.CALCULATOR.name()) && Pattern.matches("([(0-9.]+%*[)\\+\\-\\*/])+[0-9).]+%*=*", p)) {
                    String replace = p.replace(" ", BuildConfig.FLAVOR);
                    StringBuilder sb = new StringBuilder();
                    for (char c : replace.toCharArray()) {
                        if (!(c == '+' || c == '-' || c == '*')) {
                            if (c != '/') {
                                sb.append(c);
                            }
                        }
                        sb.append(" ");
                        sb.append(c);
                        sb.append(" ");
                    }
                    p = sb.toString();
                }
                C58976aa aaVar2 = C58975e.f156826a;
                Query aE = Query.f252741b.mo84268aE(p, false);
                if (this.f310130j.mo79746e(C90063do.f249329bV)) {
                    aE = aE.mo84244G(true);
                } else if (this.f310130j.mo79746e(C90063do.f249330bW)) {
                    C90498f i = aE.mo84480i();
                    i.mo84573e(0, 1048576);
                    aE = i.mo84568a();
                }
                C88616t tVar = new C88616t(aE, 1, "web", (Query) null, this.f310128h);
                Map f = tVar.f239562g.mo55427f(false);
                if (this.f310130j.mo79746e(C90063do.f249493ea)) {
                    Map hashMap = new HashMap(f);
                    hashMap.put("sugdeb", "sxs=1");
                    f = hashMap;
                }
                if (this.f310130j.mo79746e(C90063do.f249323bP)) {
                    e = C60856cj.m92900i(C54229ar.f142352d);
                } else {
                    Query aS = tVar.f239556a.mo84282aS(f);
                    C22871g gVar = this.f310127g;
                    aS.mo84352bk();
                    e = this.f310127g.mo28205e(gVar.mo28209i(this.f310127g.mo28210j(this.f310126f.mo28201a("get uri request in background", new C111482ai(this, aS)), "get completed http response for uri request", new C111483aj(this)), "getCompletedHttpResponse", C111480ag.f310117a), "Catching unexpected URI parsing exception", MalformedURLException.class, new C111481ah());
                }
                l.close();
                fVar.mo105244m("sendRequest", e);
                this.f310132l.addLast(e);
            } catch (Throwable th) {
                C111479af.m185241a(th, th);
            }
        }
        C60856cj.m92911t(e, new C113177ch(this.f310131k, this.f310132l, e), C60826bg.f164896a);
        return e;
        throw th;
    }
}
