package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6948b;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84420ab;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84447n;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a.C116994c;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8747a.C117002k;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21462j;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21465m;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21467o;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.b.b */
/* compiled from: PG */
public final /* synthetic */ class C88570b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C88572d f239382a;

    /* renamed from: b */
    public final /* synthetic */ String f239383b;

    /* renamed from: c */
    public final /* synthetic */ C88616t f239384c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f239385d;

    /* renamed from: e */
    public final /* synthetic */ int f239386e;

    /* renamed from: f */
    public final /* synthetic */ String f239387f;

    public /* synthetic */ C88570b(C88572d dVar, String str, C88616t tVar, C58485gu guVar, int i, String str2) {
        this.f239382a = dVar;
        this.f239383b = str;
        this.f239384c = tVar;
        this.f239385d = guVar;
        this.f239386e = i;
        this.f239387f = str2;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        boolean z;
        String str;
        C58833ax axVar;
        String str2;
        Iterator it;
        C88572d dVar = this.f239382a;
        String str3 = this.f239383b;
        C88616t tVar = this.f239384c;
        C58485gu guVar = this.f239385d;
        int i = this.f239386e;
        String str4 = this.f239387f;
        C117002k kVar = dVar.f239395d;
        C58976aa aaVar = C58975e.f156826a;
        if (guVar.isEmpty()) {
            return C60866ct.f164955a;
        }
        C116994c cVar = kVar.f324808b;
        int i2 = tVar.f239557b;
        boolean cm = tVar.f239556a.mo84406cm();
        boolean cl = tVar.f239556a.mo84405cl();
        C142826w wVar = new C142826w();
        wVar.f387614g = "agsa_suggest";
        ArrayList arrayList = new ArrayList(guVar);
        synchronized (cVar.f324787b) {
            Iterator it2 = arrayList.iterator();
            z = false;
            while (it2.hasNext()) {
                C21462j jVar = (C21462j) it2.next();
                String str5 = jVar.f59908a.f387418b;
                if (!TextUtils.isEmpty(str5)) {
                    it = it2;
                    int intValue = cVar.f324789d.mo82252d(jVar, cVar.f324791f).intValue();
                    str2 = str3;
                    int intValue2 = cVar.f324790e.mo82252d(jVar, cVar.f324792g).intValue();
                    if ((!str5.equals("apps") && !str5.equals("internal.3p:MobileApplication")) || !cm || cVar.f324788c.mo79746e(C90085ej.f250159aj) || (cVar.f324788c.mo79746e(C89995ba.f246767o) && cl)) {
                        if (intValue <= 0 || intValue2 <= 0) {
                            CorpusId corpusId = jVar.f59908a;
                            ((C59052c) ((C59052c) C116994c.f324786a.mo56226d()).mo56372aa(32563)).mo56354G("corpus (%s, %s) is blacklisted", corpusId.f387417a, corpusId.f387418b);
                        } else {
                            wVar.mo117756b(jVar.f59908a);
                            wVar.mo117757c(jVar.f59908a, intValue, intValue2);
                            CorpusId corpusId2 = jVar.f59908a;
                            ((C59052c) ((C59052c) C116994c.f324786a.mo56224b()).mo56372aa(32564)).mo56354G("corpus (%s, %s) is added", corpusId2.f387417a, corpusId2.f387418b);
                            it2 = it;
                            str3 = str2;
                            z = true;
                        }
                    }
                } else {
                    str2 = str3;
                    it = it2;
                }
                it2 = it;
                str3 = str2;
            }
            str = str3;
        }
        if (!z) {
            axVar = C58836b.f156633a;
        } else {
            boolean z2 = true;
            if (((C58724pq) guVar).f156474d > 1) {
                wVar.f387612e = false;
            }
            if (i != 1) {
                if (i == 2) {
                    wVar.f387609b = 2;
                } else if (i == 3) {
                    throw new UnsupportedOperationException("Ranking Strategy CHROME_OMNIBOX is removed in v12 (go/icing-deprecate-omnibox)");
                } else if (i != 4) {
                    wVar.f387609b = 5;
                } else {
                    throw new UnsupportedOperationException("Ranking Strategy APPINDEXING_DEBUGGING_UI not supported until later versions");
                }
                z2 = true;
            } else {
                wVar.f387609b = 1;
            }
            if (!TextUtils.isEmpty(str4)) {
                wVar.f387613f = new STSortSpec(str4);
            }
            if (i2 == z2) {
                wVar.f387611d = z2;
            }
            if (cVar.f324788c.mo79746e(C90085ej.f250112P)) {
                wVar.f387610c = 3;
            }
            axVar = C58833ax.m90834k(C21465m.m40577a(wVar));
        }
        C84425ag c = ((C84418a) kVar.f324807a.mo27525b()).mo77986c();
        if (c == null) {
            return C60866ct.f164955a;
        }
        if (!axVar.mo56113h()) {
            return C60866ct.f164955a;
        }
        String format = kVar.f324809c.mo79746e(C90085ej.f250112P) ? String.format("(Q_PREFIX \"%s\")", new Object[]{str}) : str;
        C21467o oVar = (C21467o) axVar.mo56107c();
        boolean isEmpty = guVar.isEmpty();
        boolean z3 = c.f229723f.get();
        if (!z3 || isEmpty) {
            String str6 = true != z3 ? "queryGlobalSearch when not waiting for queries." : "queryGlobalSearch with no enabled sources";
            C59104x d = C84425ag.f229718a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
            ((C59052c) ((C59052c) d).mo56372aa(9300)).mo56389s("%s", str6);
            return C60866ct.f164955a;
        }
        c.f229720c.mo77989a();
        C60870cx c2 = c.f229720c.mo77991c(format, 10, oVar);
        C90875ai.m148465b(new C84420ab(c), c2, c.f229721d, "GCoreSearchResults").mo85223a(C84447n.f229812a);
        return c2;
    }
}
