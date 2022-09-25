package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97919i;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.podcasts.b.f.j */
/* compiled from: PG */
public final /* synthetic */ class C140107j implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f380742a;

    public /* synthetic */ C140107j(Map map) {
        this.f380742a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = this.f380742a;
        C97920j jVar = (C97920j) obj;
        if (!map.containsKey(jVar.f273429b)) {
            return jVar;
        }
        C97919i iVar = (C97919i) jVar.toBuilder();
        String str = (String) map.get(jVar.f273429b);
        iVar.copyOnWrite();
        C97920j jVar2 = (C97920j) iVar.instance;
        str.getClass();
        jVar2.f273428a |= 1;
        jVar2.f273429b = str;
        return (C97920j) iVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
