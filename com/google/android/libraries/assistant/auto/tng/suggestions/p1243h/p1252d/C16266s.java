package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import java.util.List;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.s */
/* compiled from: PG */
public final /* synthetic */ class C16266s implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ List f47886a;

    /* renamed from: b */
    public final /* synthetic */ String f47887b;

    public /* synthetic */ C16266s(List list, String str) {
        this.f47886a = list;
        this.f47887b = str;
    }

    public final void accept(Object obj) {
        C123728av avVar = (C123728av) obj;
        this.f47886a.addAll(C16267t.m33300b(avVar.f341758d, Optional.m71637of(Long.valueOf(avVar.f341759e)), this.f47887b));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
