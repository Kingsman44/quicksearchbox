package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8736i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88556g;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.common.p4522b.C58597ky;
import com.google.p395al.p417d.p418a.C8574bb;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.i.b */
/* compiled from: PG */
public final class C116917b implements C88556g {

    /* renamed from: a */
    private final C86124t f324613a;

    /* renamed from: b */
    private final C116920e f324614b;

    public C116917b(C86124t tVar, C116920e eVar) {
        this.f324613a = tVar;
        this.f324614b = eVar;
    }

    /* renamed from: a */
    public final int mo82218a() {
        return 7;
    }

    /* renamed from: b */
    public final C41626a mo82219b(C88616t tVar, C41626a aVar) {
        C8575bc a;
        C88616t tVar2 = tVar;
        C41626a aVar2 = aVar;
        if (!tVar2.f239561f.getBoolean("cs::on_focus") || tVar2.f239561f.getBoolean("cs::on_focus_prefetch") || ((!this.f324613a.mo79746e(C90085ej.f250102F) && !aVar2.f108836a.isEmpty()) || (a = this.f324614b.mo103057a(tVar2.f239556a)) == null || ((long) aVar2.f108836a.size()) >= this.f324613a.mo79743a(C90085ej.f250202bd))) {
            return aVar2;
        }
        C62971cq<C8574bb> cqVar = a.f29694c;
        if (cqVar.isEmpty()) {
            return aVar2;
        }
        ArrayList arrayList = new ArrayList();
        int size = cqVar.size() + 1;
        HashSet hashSet = new HashSet();
        for (RootSuggestion rootSuggestion : aVar2.f108836a) {
            arrayList.add(rootSuggestion);
            hashSet.add(rootSuggestion.mo44269v());
            size = Math.max(Math.min(rootSuggestion.f108917r - 1, size), 0);
        }
        for (C8574bb bbVar : cqVar) {
            ArrayList c = C58597ky.m90212c(Integer.valueOf(bbVar.f29689c));
            c.add(432);
            if (!hashSet.contains(bbVar.f29688b)) {
                arrayList.add(new RootSuggestion(bbVar.f29688b, 1, 0, c, BuildConfig.FLAVOR, C41669ai.f108954c, size, (C54228aq) null, C41679e.f109005p));
                size = Math.max(size - 1, 0);
            }
            if (this.f324613a.mo79746e(C90085ej.f250102F) && ((long) arrayList.size()) >= this.f324613a.mo79743a(C90085ej.f250202bd)) {
                break;
            }
        }
        return new C41626a(arrayList, aVar2.f108837b, false, true, aVar2.f108840e);
    }
}
