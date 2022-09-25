package com.google.android.apps.gsa.staticplugins.search.session.p8710b;

import com.google.android.apps.gsa.search.core.corpora.C85753b;
import com.google.android.apps.gsa.search.core.corpora.C85755d;
import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.staticplugins.p7377ah.p7378a.C93848b;
import com.google.android.apps.gsa.staticplugins.p7377ah.p7378a.C93849c;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116780ib;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p417d.C8600b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.b.a */
/* compiled from: PG */
final class C116529a implements C87138if {

    /* renamed from: a */
    final /* synthetic */ C93849c f323127a;

    public C116529a(C93849c cVar) {
        this.f323127a = cVar;
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return C116780ib.m193928ay(188);
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        C58485gu guVar;
        if (icVar.mo80754a(188)) {
            C93849c cVar = this.f323127a;
            if (cVar.f262116b.mo80987c() != ((Boolean) ((C93848b) cVar.f262115a).f262112c.f63720e).booleanValue()) {
                ((C93848b) cVar.f262115a).f262112c.mo28730f(Boolean.valueOf(cVar.f262116b.mo80987c()), false);
            }
            C85753b bVar = (C85753b) cVar.f262117c.mo27525b();
            if (cVar.f262116b.mo80987c()) {
                if (cVar.f262116b.mo80988d()) {
                    ArrayList b = C58597ky.m90211b(bVar.f231875b.f231871a.values());
                    ArrayList arrayList = new ArrayList();
                    int size = b.size();
                    for (int i = 0; i < size; i++) {
                        Corpus corpus = (Corpus) b.get(i);
                        if (corpus.mo79406b()) {
                            C8600b bVar2 = corpus.f252915f;
                            if (C8600b.WEB == bVar2) {
                                arrayList.add(0, corpus);
                            } else if (C8600b.IN_APPS == bVar2) {
                                arrayList.add(corpus);
                            }
                        }
                    }
                    C58976aa aaVar = C58975e.f156826a;
                    guVar = C58485gu.m89842j(arrayList);
                } else {
                    List b2 = cVar.f262116b.mo80986b();
                    C58471gg<Corpus> g = bVar.f231875b.f231871a.values();
                    EnumMap enumMap = null;
                    if (b2 != null && !b2.isEmpty()) {
                        enumMap = new EnumMap(C8600b.class);
                        int i2 = 0;
                        while (i2 < b2.size()) {
                            int i3 = i2 + 1;
                            enumMap.put((C8600b) b2.get(i2), Integer.valueOf(i3));
                            i2 = i3;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (enumMap != null) {
                        EnumSet<E> noneOf = EnumSet.noneOf(C8600b.class);
                        for (Corpus corpus2 : g) {
                            noneOf.add(corpus2.f252915f);
                        }
                        Iterator it = enumMap.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C8600b bVar3 = (C8600b) it.next();
                            if (bVar3 != C8600b.WEB && bVar3 != C8600b.APPLICATIONS && bVar3 != C8600b.IN_APPS && bVar3 != C8600b.FLIGHTS && noneOf.contains(bVar3)) {
                                for (Corpus corpus3 : g) {
                                    if (corpus3.mo79406b() && enumMap.get(corpus3.f252915f) != null) {
                                        arrayList2.add(corpus3);
                                    }
                                }
                            }
                        }
                    }
                    for (Corpus corpus4 : g) {
                        if (corpus4.mo79406b()) {
                            arrayList2.add(corpus4);
                        }
                    }
                    if (enumMap != null) {
                        Collections.sort(arrayList2, new C85755d(enumMap));
                    }
                    C58976aa aaVar2 = C58975e.f156826a;
                    guVar = C58485gu.m89842j(arrayList2);
                }
                if (!cVar.f262120f || (!cVar.f262119e.mo81003b().mo84452df() && !C58832aw.m90831a(guVar, ((C93848b) cVar.f262115a).f262110a.f63720e))) {
                    ((C93848b) cVar.f262115a).f262110a.mo28730f(guVar, false);
                    cVar.f262120f = true;
                }
                if (bVar.f231875b.mo79409d()) {
                    ((C93848b) cVar.f262115a).f262111b.mo28730f(C58833ax.m90834k(bVar.f231875b.mo79408b(cVar.f262116b.mo80985a())), false);
                }
            }
        }
    }
}
