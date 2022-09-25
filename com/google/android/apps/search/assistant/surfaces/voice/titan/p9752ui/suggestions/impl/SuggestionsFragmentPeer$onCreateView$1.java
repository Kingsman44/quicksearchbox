package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl;

import android.content.Context;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.SuggestionsFragmentPeer$onCreateView$1 */
/* compiled from: PG */
public final class SuggestionsFragmentPeer$onCreateView$1 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ C128973i f354357a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsFragmentPeer$onCreateView$1(C128973i iVar, Context context) {
        super(context, 0, false);
        this.f354357a = iVar;
    }

    public final void onLayoutCompleted(C0670ge geVar) {
        C69664n.m101061g(geVar, "state");
        super.onLayoutCompleted(geVar);
        this.f354357a.f354390h = geVar.mo3052a() > 0;
        C128973i iVar = this.f354357a;
        iVar.mo108781a(iVar.f354389g, iVar.f354390h);
    }
}
