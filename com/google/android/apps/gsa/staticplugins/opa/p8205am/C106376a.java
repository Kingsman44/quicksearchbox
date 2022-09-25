package com.google.android.apps.gsa.staticplugins.opa.p8205am;

import com.google.android.apps.gsa.assistant.shared.k.a.a;
import com.google.android.apps.gsa.assistant.shared.k.a.g;
import com.google.android.apps.gsa.assistant.shared.k.a.h;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.am.a */
/* compiled from: PG */
public final /* synthetic */ class C106376a implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ a f296728a;

    public /* synthetic */ C106376a(a aVar) {
        this.f296728a = aVar;
    }

    public final void accept(Object obj, Object obj2) {
        g builder = ((h) obj2).toBuilder();
        builder.copyOnWrite();
        h hVar = builder.instance;
        hVar.a |= 1;
        hVar.b = 0;
        this.f296728a.d((String) obj, builder.build());
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
