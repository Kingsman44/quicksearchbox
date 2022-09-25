package com.google.android.apps.gsa.search.core.preferences;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137940a;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.aa */
/* compiled from: PG */
public final /* synthetic */ class C86285aa implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ boolean f233324a;

    public /* synthetic */ C86285aa(boolean z) {
        this.f233324a = z;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        boolean z = this.f233324a;
        Optional optional = (Optional) obj;
        C59071e eVar = SignedOutPersonalizationFragment.f233314a;
        if (optional.isPresent()) {
            ((C137940a) optional.get()).mo114054c(z);
        }
    }
}
