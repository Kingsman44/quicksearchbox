package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.C15838a;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C15822h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C15830p f47049a;

    /* renamed from: b */
    public final /* synthetic */ List f47050b;

    public /* synthetic */ C15822h(C15830p pVar, List list) {
        this.f47049a = pVar;
        this.f47050b = list;
    }

    public final void accept(Object obj) {
        C15838a aVar = (C15838a) obj;
        this.f47050b.add(aVar.mo22585b(new C15829o(this.f47049a, aVar)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
