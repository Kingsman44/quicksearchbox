package com.google.android.apps.gsa.staticplugins.p8793w;

import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.av */
/* compiled from: PG */
public final class C117734av {

    /* renamed from: a */
    private final C117730ar f326799a;

    /* renamed from: b */
    private final Query f326800b;

    /* renamed from: c */
    private final Resources f326801c;

    public C117734av(C117730ar arVar, Query query, Resources resources) {
        this.f326799a = arVar;
        this.f326800b = query;
        this.f326801c = resources;
    }

    /* renamed from: a */
    public final void mo103447a(int i) {
        String string = this.f326801c.getString(i);
        C58976aa aaVar = C58975e.f156826a;
        this.f326799a.mo103443a(this.f326800b.mo84444dY(0, BuildConfig.FLAVOR, QueryTriggerType.USER).mo84256S(new TtsRequest(string, false)));
    }
}
