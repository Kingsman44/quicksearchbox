package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C99387ad implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99403at f278054a;

    public /* synthetic */ C99387ad(C99403at atVar) {
        this.f278054a = atVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99403at atVar = this.f278054a;
        ((C59052c) ((C59052c) ((C59052c) C99403at.f278080a.mo56226d()).mo56382g((Exception) obj)).mo56372aa(32614)).mo56386p("Failed to get intent with TikTok account for TNG Search.");
        Intent intent = new Intent();
        if (!atVar.f278084D) {
            intent.putExtra("navigate_to_existing_search_tab", true);
        }
        atVar.mo91420h(intent, C139779t.SEARCH);
    }
}
