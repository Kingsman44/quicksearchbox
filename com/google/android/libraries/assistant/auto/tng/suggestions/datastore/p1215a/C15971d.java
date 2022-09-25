package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a;

import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.a.d */
/* compiled from: PG */
public final /* synthetic */ class C15971d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C15973f f47357a;

    public /* synthetic */ C15971d(C15973f fVar) {
        this.f47357a = fVar;
    }

    public final void accept(Object obj) {
        this.f47357a.f47361b.remove(((Map.Entry) obj).getKey());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
