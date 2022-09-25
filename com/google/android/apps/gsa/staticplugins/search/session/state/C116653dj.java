package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.p6927e.C87544b;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.dj */
/* compiled from: PG */
final class C116653dj implements C116647dd {

    /* renamed from: a */
    final /* synthetic */ C116666dw f323517a;

    public C116653dj(C116666dw dwVar) {
        this.f323517a = dwVar;
    }

    /* renamed from: a */
    public final C87544b mo102820a() {
        return C87544b.LANGUAGE_PACK_DOWNLOAD_QUEUED;
    }

    /* renamed from: b */
    public final boolean mo102821b(SearchError searchError) {
        return this.f323517a.mo102822b(searchError) && this.f323517a.f323521d.f232790a.mo79722a().getString("g3_active_downloads", BuildConfig.FLAVOR).contains(this.f323517a.f323522e);
    }
}
