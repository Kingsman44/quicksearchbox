package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gm */
/* compiled from: PG */
public final /* synthetic */ class C112584gm implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ StringBuilder f312179a;

    public /* synthetic */ C112584gm(StringBuilder sb) {
        this.f312179a = sb;
    }

    public final void accept(Object obj, Object obj2) {
        StringBuilder sb = this.f312179a;
        Float f = (Float) obj2;
        int i = C112585gn.f312180a;
        sb.append("('");
        sb.append((String) obj);
        sb.append("': ), ");
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
