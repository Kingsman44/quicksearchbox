package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C34933ag implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58480gp f92599a;

    public /* synthetic */ C34933ag(C58480gp gpVar) {
        this.f92599a = gpVar;
    }

    public final void accept(Object obj, Object obj2) {
        Collection.EL.stream((C58485gu) obj2).forEach(new C34927aa(this.f92599a, (String) obj));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
