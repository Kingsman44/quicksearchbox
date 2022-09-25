package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15763a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16345as;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16347au;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.r */
/* compiled from: PG */
public final /* synthetic */ class C16323r implements C15763a {

    /* renamed from: a */
    public final /* synthetic */ C16325t f48015a;

    /* renamed from: b */
    public final /* synthetic */ int f48016b;

    /* renamed from: c */
    public final /* synthetic */ Consumer f48017c;

    public /* synthetic */ C16323r(C16325t tVar, int i, Consumer consumer) {
        this.f48015a = tVar;
        this.f48016b = i;
        this.f48017c = consumer;
    }

    /* renamed from: a */
    public final void mo21857a(String str) {
        C16325t tVar = this.f48015a;
        int i = this.f48016b;
        Consumer consumer = this.f48017c;
        C16345as asVar = (C16345as) C16347au.f48122b.createBuilder();
        asVar.mo22888a(C58495hd.m89900n(2, Integer.valueOf(i)));
        C60870cx a = tVar.f48021a.mo22915a("coolwalk_suggestion_display_id", (C16347au) asVar.build());
        C16315j jVar = new C16315j(tVar, consumer);
        C46459k.m82829b(C60922j.m93044g(a, C47810es.m84963c(jVar), tVar.f48024d), "Failure getting SuggestionResponse", new Object[0]);
    }
}
