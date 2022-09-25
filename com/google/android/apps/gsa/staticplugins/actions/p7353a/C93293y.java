package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.y */
/* compiled from: PG */
public final class C93293y implements C93249a {

    /* renamed from: a */
    private final Context f260177a;

    /* renamed from: b */
    private final String f260178b;

    public C93293y(Context context, String str) {
        this.f260177a = context;
        this.f260178b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C87421i mo87580a(VoiceAction voiceAction, int i) {
        SearchError searchError = (SearchError) voiceAction;
        this.f260177a.startActivity(new Intent(this.f260178b).setFlags(268435456));
        return C87421i.f236079a;
    }

    /* renamed from: b */
    public final /* synthetic */ MatchingProviderInfo mo87581b(VoiceAction voiceAction, boolean z) {
        SearchError searchError = (SearchError) voiceAction;
        return C87489k.m142013a();
    }
}
