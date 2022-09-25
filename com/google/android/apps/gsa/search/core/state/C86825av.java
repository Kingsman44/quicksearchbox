package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6739j.C85501a;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.av */
/* compiled from: PG */
final class C86825av implements C85501a {

    /* renamed from: a */
    public final C68214a f234511a;

    /* renamed from: b */
    private final C22871g f234512b;

    public C86825av(C68214a aVar, C22871g gVar) {
        this.f234511a = aVar;
        this.f234512b = gVar;
    }

    /* renamed from: a */
    public final void mo79021a(Query query, SearchError searchError) {
        this.f234512b.mo28212l("AssistantTextSearchListener#onNetworkLoadError", new C86821ar(this, query, searchError));
    }

    /* renamed from: b */
    public final void mo79022b(Query query, C86232bo boVar) {
        this.f234512b.mo28212l("AssistantTextSearchListener#onNetworkSearchResult", new C86823at(this, query, boVar));
    }

    /* renamed from: c */
    public final void mo79023c(Query query, C90606n nVar) {
        this.f234512b.mo28212l("AssistantTextSearchListener#onNetworkTtsAvailable", new C86822as(this, query, nVar));
    }

    /* renamed from: d */
    public final void mo79024d(Query query) {
        this.f234512b.mo28212l("AssistantTextSearchListener#onVoiceSearchResultsDone", new C86824au(this, query));
    }
}
