package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8323d;

import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8320a.C107733l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.d.g */
/* compiled from: PG */
public final class C107781g {

    /* renamed from: a */
    public static final C59071e f299911a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.d.g");

    /* renamed from: b */
    public final C107733l f299912b;

    /* renamed from: c */
    public final C68214a f299913c;

    /* renamed from: d */
    public C58833ax f299914d = C58836b.f156633a;

    /* renamed from: e */
    private final C107932g f299915e;

    public C107781g(C107733l lVar, C107932g gVar, C68214a aVar) {
        this.f299912b = lVar;
        this.f299915e = gVar;
        this.f299913c = aVar;
    }

    /* renamed from: a */
    public final void mo96282a(SearchError searchError) {
        C87684al alVar = new C87684al(C88244um.SHOW_ERROR);
        alVar.mo81966c(new ParcelableVoiceAction(searchError));
        this.f299915e.mo96337a(alVar.mo81964a());
    }
}
