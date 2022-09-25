package com.google.android.apps.gsa.staticplugins.customtabs;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p1703d.C20660p;
import com.google.android.libraries.p1703d.C20665u;
import com.google.android.libraries.p1703d.C20670z;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.an */
/* compiled from: PG */
final class C98589an extends C20660p {

    /* renamed from: a */
    public final SettableFuture f275352a = new SettableFuture();

    /* renamed from: b */
    final /* synthetic */ C98590ao f275353b;

    /* renamed from: c */
    private final C20670z f275354c;

    public C98589an(C98590ao aoVar, C20670z zVar) {
        this.f275353b = aoVar;
        this.f275354c = zVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo25640e(String str) {
        C59104x d = C98590ao.f275355a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "IsGoogleDefaultTask");
        ((C59052c) ((C59052c) d).mo56372aa(19099)).mo56389s("Browser failed to return isGoogleDefaultSearchProvider with error: %s", str);
        int i = C90755l.f253831a;
        this.f275352a.mo57356n(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo25641f(boolean z) {
        this.f275353b.f275356b.edit().putBoolean("custom_tabs_is_google_default_search_provider", z).apply();
        this.f275352a.mo57356n(C118826c.f331422a);
    }

    /* renamed from: g */
    public final void mo25642g() {
        if (this.f275354c.mo25667f()) {
            C20670z zVar = this.f275354c;
            if (zVar.mo25667f()) {
                C20665u uVar = zVar.f57938a;
                uVar.f57933b.mo3580a("isGoogleDefaultSearchProvider", zVar.mo25662a());
                return;
            }
            throw new UnsupportedOperationException();
        }
        C59104x d = C98590ao.f275355a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "IsGoogleDefaultTask");
        ((C59052c) ((C59052c) d).mo56372aa(19100)).mo56386p("Requesting isGoogleDefaultSearchProvider is not supported");
        this.f275352a.mo57356n(C118826c.f331422a);
    }
}
