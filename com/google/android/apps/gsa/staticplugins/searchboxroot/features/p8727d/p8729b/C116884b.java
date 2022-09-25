package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8729b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.C88582c;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88550a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.b.b */
/* compiled from: PG */
public final class C116884b extends C88582c {

    /* renamed from: a */
    private final C88550a f324399a;

    public C116884b(C88550a aVar) {
        this.f324399a = aVar;
    }

    /* renamed from: k */
    public final int mo82234k(Suggestion suggestion) {
        if (suggestion.f108910k == 78) {
            return this.f324399a.mo82213a(suggestion) ? 2 : 1;
        }
        return 0;
    }

    /* renamed from: o */
    public final boolean mo82238o(C41642a aVar) {
        C88616t tVar = (C88616t) aVar;
        Query query = tVar.f239556a;
        Query query2 = tVar.f239559d;
        return query.mo84382cO() && query2 != null && !Query.m147223bv(query2, query) && query2.f252780s <= query.f252780s && tVar.f239557b == 1;
    }

    /* renamed from: l */
    public final C41626a mo82235l(C41642a aVar) {
        Query query = ((C88616t) aVar).f239559d;
        query.getClass();
        RootSuggestion rootSuggestion = new RootSuggestion(query.mo84352bk(), 6, 78, Suggestion.f108905h, BuildConfig.FLAVOR, C41669ai.f108954c, 0, (C54228aq) null, C41679e.f109005p);
        rootSuggestion.mo44210j();
        return new C41626a(C58485gu.m89846n(rootSuggestion));
    }
}
