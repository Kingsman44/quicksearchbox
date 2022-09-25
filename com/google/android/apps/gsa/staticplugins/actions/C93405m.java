package com.google.android.apps.gsa.staticplugins.actions;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.util.p7159c.C90905bb;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.m */
/* compiled from: PG */
final class C93405m implements C90905bb {

    /* renamed from: a */
    final /* synthetic */ VoiceAction f260511a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f260512b;

    /* renamed from: c */
    final /* synthetic */ C93421q f260513c;

    public C93405m(C93421q qVar, VoiceAction voiceAction, C58833ax axVar) {
        this.f260513c = qVar;
        this.f260511a = voiceAction;
        this.f260512b = axVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        this.f260511a.mo81076o((MatchingProviderInfo) obj);
        return this.f260513c.mo87697L(this.f260511a, this.f260512b);
    }

    /* renamed from: hh */
    public final int mo84768hh() {
        return 0;
    }

    /* renamed from: hi */
    public final int mo84769hi() {
        return 1;
    }
}
