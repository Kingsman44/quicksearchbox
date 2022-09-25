package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import com.google.android.apps.gsa.languagepack.av;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.p395al.p408c.p414c.p416b.C8476as;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.x */
/* compiled from: PG */
public final class C93292x implements C93249a {

    /* renamed from: a */
    private final av f260175a;

    /* renamed from: b */
    private final C89994f f260176b;

    public C93292x(C89994f fVar, av avVar) {
        this.f260176b = fVar;
        this.f260175a = avVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C87421i mo87580a(VoiceAction voiceAction, int i) {
        SearchError searchError = (SearchError) voiceAction;
        C8476as g = this.f260175a.g(this.f260176b.mo83885ae());
        if (g == null || (g.f29416a & 2) == 0) {
            return C87421i.f236081c;
        }
        this.f260175a.b(g, true);
        return C87421i.f236079a;
    }

    /* renamed from: b */
    public final /* synthetic */ MatchingProviderInfo mo87581b(VoiceAction voiceAction, boolean z) {
        SearchError searchError = (SearchError) voiceAction;
        return C87489k.m142013a();
    }
}
