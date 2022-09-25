package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.assistant.p3994s.p3995a.C53306j;
import java.util.Collection;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.stream.Collectors;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69238d;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.o */
/* compiled from: PG */
public final /* synthetic */ class C124129o implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Set f342817a;

    public /* synthetic */ C124129o(Set set) {
        this.f342817a = set;
    }

    public final void accept(Object obj, Object obj2) {
        C53306j jVar = (C53306j) obj;
        this.f342817a.addAll((Collection) Collection.EL.stream(((C69238d) obj2).f185338b).map(C124130p.f342818a).collect(Collectors.toCollection(C124047ac.f342626a)));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
