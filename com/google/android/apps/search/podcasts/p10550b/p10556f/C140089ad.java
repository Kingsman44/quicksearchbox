package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97886al;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97887am;
import com.google.android.apps.search.podcasts.p10550b.p10554d.C140057g;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.b.f.ad */
/* compiled from: PG */
public final /* synthetic */ class C140089ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140088ac f380711a;

    /* renamed from: b */
    public final /* synthetic */ List f380712b;

    public /* synthetic */ C140089ad(C140088ac acVar, List list) {
        this.f380711a = acVar;
        this.f380712b = list;
    }

    public final C60870cx apply(Object obj) {
        C140088ac acVar = this.f380711a;
        List list = this.f380712b;
        C140057g gVar = (C140057g) obj;
        C97886al alVar = (C97886al) C97887am.f273313e.createBuilder();
        boolean l = acVar.mo115454l();
        alVar.copyOnWrite();
        C97887am amVar = (C97887am) alVar.instance;
        amVar.f273315a |= 2;
        amVar.f273318d = l;
        long a = acVar.mo115443a();
        alVar.copyOnWrite();
        C97887am amVar2 = (C97887am) alVar.instance;
        amVar2.f273315a |= 1;
        amVar2.f273317c = a;
        alVar.copyOnWrite();
        C97887am amVar3 = (C97887am) alVar.instance;
        C62971cq cqVar = amVar3.f273316b;
        if (!cqVar.mo58948c()) {
            amVar3.f273316b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) amVar3.f273316b);
        return gVar.mo115422b(alVar.build());
    }
}
