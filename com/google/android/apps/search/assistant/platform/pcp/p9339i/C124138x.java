package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58526ih;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.stream.Collectors;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69238d;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.x */
/* compiled from: PG */
public final /* synthetic */ class C124138x implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58526ih f342826a;

    public /* synthetic */ C124138x(C58526ih ihVar) {
        this.f342826a = ihVar;
    }

    public final void accept(Object obj, Object obj2) {
        C53306j jVar = (C53306j) obj;
        this.f342826a.mo55489i((List) Collection.EL.stream(((C69238d) obj2).f185338b).map(C124045aa.f342624a).filter(C124046ab.f342625a).collect(Collectors.toCollection(C124047ac.f342626a)));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
