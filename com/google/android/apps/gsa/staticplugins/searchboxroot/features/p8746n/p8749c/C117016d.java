package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8749c;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.p1373a.C17013j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4440ca.p4442b.p4443a.C57928d;
import dagger.C68214a;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.c.d */
/* compiled from: PG */
public final class C117016d extends C88582c implements C89196a {

    /* renamed from: a */
    public static final C59071e f324846a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.c.d");

    /* renamed from: b */
    public final C86124t f324847b;

    /* renamed from: c */
    public C90931ca f324848c;

    /* renamed from: d */
    public C57928d f324849d = null;

    /* renamed from: e */
    public final C68214a f324850e;

    /* renamed from: f */
    public final C68214a f324851f;

    /* renamed from: g */
    public final C17013j f324852g;

    /* renamed from: h */
    private final Object f324853h = new Object();

    /* renamed from: i */
    private final C84474e f324854i;

    /* renamed from: j */
    private C60870cx f324855j = null;

    /* renamed from: k */
    private C60870cx f324856k = null;

    public C117016d(C86124t tVar, C84474e eVar, C68214a aVar, C68214a aVar2, C17013j jVar) {
        this.f324847b = tVar;
        this.f324854i = eVar;
        this.f324850e = aVar;
        this.f324851f = aVar2;
        this.f324852g = jVar;
    }

    /* renamed from: a */
    public static C41626a m194484a(List list, List list2) {
        C58480gp gpVar = new C58480gp(4);
        HashSet hashSet = new HashSet();
        int i = 10;
        if (list != null) {
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                String substring = ((String) listIterator.next()).substring(6);
                C58976aa aaVar = C58975e.f156826a;
                hashSet.add(substring);
                gpVar.mo55395g(m194485b(substring, i));
                i--;
            }
        }
        ListIterator listIterator2 = list2.listIterator();
        while (listIterator2.hasNext()) {
            String str = (String) listIterator2.next();
            C58976aa aaVar2 = C58975e.f156826a;
            if (!hashSet.contains(str)) {
                gpVar.mo55395g(m194485b(str, i));
                i--;
                if (i <= 0) {
                    break;
                }
            }
        }
        return new C41626a(gpVar.mo55394f());
    }

    /* renamed from: b */
    private static RootSuggestion m194485b(String str, int i) {
        return new RootSuggestion(str, 22, 0, C58485gu.m89846n(271), C58890d.m90988c(str), C41669ai.f108954c, i, (C54228aq) null, C41679e.f109005p);
    }

    /* renamed from: f */
    public final void mo82222f(C90931ca caVar) {
        this.f324848c = caVar;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
        if (this.f324847b.mo79746e(C90085ej.f250199ba) && this.f324854i.mo78069N() && this.f324849d == null) {
            this.f324855j = this.f324848c.mo85139d(new C117013a(this));
        }
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }

    /* renamed from: m */
    public final C60870cx mo82236m(C41642a aVar) {
        C60870cx c;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f324853h) {
            C60870cx cxVar = this.f324856k;
            if (cxVar != null && !cxVar.isDone()) {
                this.f324856k.cancel(true);
            }
            c = this.f324848c.mo85138c(new C117014b(this, aVar));
            this.f324856k = c;
        }
        return c;
    }

    /* renamed from: o */
    public final boolean mo82238o(C41642a aVar) {
        C60870cx cxVar;
        if (this.f324854i.mo78069N() && (cxVar = this.f324855j) != null && cxVar.isDone() && this.f324849d != null) {
            C88616t tVar = (C88616t) aVar;
            if ((!tVar.f239556a.mo84405cl() || this.f324847b.mo79746e(C90085ej.f250200bb)) && !tVar.f239556a.mo84352bk().isEmpty() && tVar.f239557b == 1) {
                return true;
            }
        }
        return false;
    }
}
