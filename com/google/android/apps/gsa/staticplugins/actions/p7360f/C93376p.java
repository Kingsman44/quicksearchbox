package com.google.android.apps.gsa.staticplugins.actions.p7360f;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.actions.p7353a.C93271c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.f.p */
/* compiled from: PG */
public final /* synthetic */ class C93376p implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f260431a;

    /* renamed from: b */
    public final /* synthetic */ C68214a f260432b;

    /* renamed from: c */
    public final /* synthetic */ Query f260433c;

    public /* synthetic */ C93376p(C58833ax axVar, C68214a aVar, Query query) {
        this.f260431a = axVar;
        this.f260432b = aVar;
        this.f260433c = query;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58833ax axVar = this.f260431a;
        C68214a aVar = this.f260432b;
        Query query = this.f260433c;
        VoiceAction voiceAction = (VoiceAction) axVar.mo56111f();
        return voiceAction != null ? C58833ax.m90834k(((C93271c) aVar.mo27525b()).mo87602a(voiceAction, C58836b.f156633a).mo87581b(voiceAction, query.mo84337bV())) : C58836b.f156633a;
    }
}
