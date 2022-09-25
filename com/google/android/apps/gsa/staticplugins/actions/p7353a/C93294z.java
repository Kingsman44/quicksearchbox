package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.z */
/* compiled from: PG */
public final class C93294z implements C93249a {

    /* renamed from: a */
    private final Context f260179a;

    /* renamed from: b */
    private final String f260180b;

    public C93294z(Context context, String str) {
        this.f260179a = context;
        this.f260180b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C87421i mo87580a(VoiceAction voiceAction, int i) {
        SearchError searchError = (SearchError) voiceAction;
        this.f260179a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f260180b)).setFlags(268435456).addCategory("android.intent.category.BROWSABLE"));
        return C87421i.f236079a;
    }

    /* renamed from: b */
    public final /* synthetic */ MatchingProviderInfo mo87581b(VoiceAction voiceAction, boolean z) {
        SearchError searchError = (SearchError) voiceAction;
        return C87489k.m142013a();
    }
}
