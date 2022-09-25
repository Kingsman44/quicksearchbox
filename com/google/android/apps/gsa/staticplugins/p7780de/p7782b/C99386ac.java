package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.googleapp.p10527u.C139779t;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C99386ac implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99403at f278053a;

    public /* synthetic */ C99386ac(C99403at atVar) {
        this.f278053a = atVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99403at atVar = this.f278053a;
        Intent intent = (Intent) obj;
        if (!atVar.f278084D) {
            intent.putExtra("navigate_to_existing_search_tab", true);
        }
        atVar.mo91420h(intent, C139779t.SEARCH);
    }
}
