package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7974b;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C50070jl;
import com.google.assistant.p3861at.C50071jm;
import com.google.assistant.p3861at.C50074jp;
import com.google.assistant.p3861at.C50075jq;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66595bu;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.b.v */
/* compiled from: PG */
public final class C101568v implements C101561o {

    /* renamed from: a */
    private final C101560n f283419a;

    /* renamed from: b */
    private final C101547aa f283420b;

    /* renamed from: c */
    private final C22871g f283421c;

    public C101568v(C101560n nVar, C101547aa aaVar, C22871g gVar) {
        this.f283419a = nVar;
        this.f283420b = aaVar;
        this.f283421c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo92398a(Collection collection) {
        C60870cx cxVar;
        C101560n nVar = this.f283419a;
        Collection<C89824t> collection2 = (Collection) Collection.EL.stream(collection).filter(C101562p.f283413a).map(C101563q.f283414a).collect(C58370cn.f155946a);
        if (collection2.isEmpty()) {
            cxVar = C60856cj.m92900i(C101548b.LINK_ACCOUNT_SUCCEEDED_CHECK_ACCOUNT_IS_LINKED_SUCCEEDED);
        } else {
            l lVar = nVar.f283412i;
            Account w = nVar.f283405b.mo79689w(nVar.f283410g);
            C66595bu buVar = (C66595bu) nVar.f283411h.mo87020a().mo56111f();
            C50074jp jpVar = (C50074jp) C50075jq.f130193b.createBuilder();
            for (C89824t tVar : collection2) {
                String str = tVar.mo83664b().f243148a;
                C50070jl jlVar = (C50070jl) C50071jm.f130181f.createBuilder();
                String str2 = tVar.mo83664b().f243148a;
                jlVar.copyOnWrite();
                C50071jm jmVar = (C50071jm) jlVar.instance;
                str2.getClass();
                jmVar.f130183a |= 1;
                jmVar.f130184b = str2;
                String str3 = tVar.mo83664b().f243149b;
                jlVar.copyOnWrite();
                C50071jm jmVar2 = (C50071jm) jlVar.instance;
                str3.getClass();
                jmVar2.f130183a |= 2;
                jmVar2.f130185c = str3;
                jlVar.copyOnWrite();
                C50071jm jmVar3 = (C50071jm) jlVar.instance;
                jmVar3.f130183a |= 8;
                jmVar3.f130186d = true;
                jpVar.mo53378a(jlVar);
            }
            acw acw = (acw) acx.f128971H.createBuilder();
            acw.copyOnWrite();
            acx acx = (acx) acw.instance;
            C50075jq jqVar = (C50075jq) jpVar.build();
            jqVar.getClass();
            acx.f128988e = jqVar;
            acx.f128984a |= 4;
            cxVar = nVar.f283408e.mo28210j(lVar.k(w, buVar, (acx) acw.build(), 25, TimeUnit.SECONDS, nVar.getClass().getSimpleName()), "Parsing the link account result", new C101558l(nVar, collection2));
        }
        C101547aa aaVar = this.f283420b;
        C22871g gVar = aaVar.f283382d;
        Stream map = Collection.EL.stream((List) Collection.EL.stream(collection).filter(C101564r.f283415a).map(C101565s.f283416a).collect(C58370cn.f155946a)).map(new C101569w(aaVar));
        l lVar2 = aaVar.f283380b;
        Objects.requireNonNull(lVar2);
        return this.f283421c.mo28209i(this.f283421c.mo28210j(cxVar, "Handle cast devices' link results", new C101566t(gVar.mo28209i(C60856cj.m92896e((Iterable) map.map(new C101570x(lVar2)).collect(C58370cn.f155946a)), "merge AccountLinkStates", C101571y.f283424a))), "Convert AccountLinkingState to AccountLinkingResult", C101567u.f283418a);
    }
}
