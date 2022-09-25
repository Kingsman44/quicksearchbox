package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.libraries.assistant.pcp.p1555f.C18677a;
import com.google.android.libraries.assistant.pcp.p1555f.p1556a.C18697t;
import com.google.android.libraries.assistant.pcp.p1555f.p1556a.C18700w;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1578m.C18981k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import java.util.Set;
import p3186j$.util.Optional;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.assistant.pcp.b.a */
/* compiled from: PG */
public final /* synthetic */ class C18529a implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C18551v f52504a;

    /* renamed from: b */
    public final /* synthetic */ List f52505b;

    /* renamed from: c */
    public final /* synthetic */ C18718c f52506c;

    /* renamed from: d */
    public final /* synthetic */ C53306j f52507d;

    public /* synthetic */ C18529a(C18551v vVar, List list, C18718c cVar, C53306j jVar) {
        this.f52504a = vVar;
        this.f52505b = list;
        this.f52506c = cVar;
        this.f52507d = jVar;
    }

    public final void accept(Object obj, Object obj2) {
        Object obj3;
        C18551v vVar = this.f52504a;
        List list = this.f52505b;
        C18718c cVar = this.f52506c;
        C53306j jVar = this.f52507d;
        C18981k kVar = (C18981k) obj;
        Set set = (Set) obj2;
        C18677a aVar = vVar.f52558b;
        Optional of = Optional.m71637of(jVar);
        C18700w wVar = (C18700w) aVar;
        if (!wVar.f52760a.containsKey(kVar)) {
            obj3 = C60856cj.m92899h(new IllegalArgumentException(String.format("ProactiveDataSource [%s] is NOT registered.", new Object[]{kVar.name()})));
        } else {
            kVar.name();
            obj3 = C47633f.m84733g(wVar.f52762c.mo24052a(set)).mo51516i(new C18697t(wVar, kVar, of, cVar), wVar.f52764e);
        }
        list.add(obj3);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
