package com.google.android.apps.search.googleapp.search.suggest.p10449b;

import com.google.common.p4552o.anc;
import com.google.common.p4552o.ane;
import com.google.common.p4552o.anf;
import java.util.List;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.b */
/* compiled from: PG */
public final /* synthetic */ class C138045b implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ List f375613a;

    public /* synthetic */ C138045b(List list) {
        this.f375613a = list;
    }

    public final void accept(Object obj, Object obj2) {
        List list = this.f375613a;
        anc anc = (anc) anf.f159355f.createBuilder();
        anc.copyOnWrite();
        anf anf = (anf) anc.instance;
        anf.f159358b = ((ane) obj).f159354aE;
        anf.f159357a |= 1;
        int intValue = ((Integer) obj2).intValue();
        anc.copyOnWrite();
        anf anf2 = (anf) anc.instance;
        anf2.f159357a |= 8;
        anf2.f159361e = intValue;
        list.add((anf) anc.build());
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
