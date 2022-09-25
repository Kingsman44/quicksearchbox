package com.google.android.apps.search.googleapp.search.suggest.p10449b;

import com.google.common.p4552o.anc;
import com.google.common.p4552o.ane;
import com.google.common.p4552o.anf;
import java.util.List;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.c */
/* compiled from: PG */
public final /* synthetic */ class C138046c implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ List f375614a;

    public /* synthetic */ C138046c(List list) {
        this.f375614a = list;
    }

    public final void accept(Object obj, Object obj2) {
        List list = this.f375614a;
        String str = (String) obj2;
        anc anc = (anc) anf.f159355f.createBuilder();
        anc.copyOnWrite();
        anf anf = (anf) anc.instance;
        anf.f159358b = ((ane) obj).f159354aE;
        anf.f159357a |= 1;
        anc.copyOnWrite();
        anf anf2 = (anf) anc.instance;
        str.getClass();
        anf2.f159357a |= 4;
        anf2.f159360d = str;
        list.add((anf) anc.build());
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
