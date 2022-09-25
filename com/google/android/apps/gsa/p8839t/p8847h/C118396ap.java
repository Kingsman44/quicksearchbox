package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58487gw;
import java.util.LinkedHashSet;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.t.h.ap */
/* compiled from: PG */
public final /* synthetic */ class C118396ap implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f328627a;

    public /* synthetic */ C118396ap(Map map) {
        this.f328627a = map;
    }

    public final Object apply(Object obj) {
        Map map = this.f328627a;
        C58487gw gwVar = C118426bs.f328679a;
        return (LinkedHashSet) Collection.EL.stream(((C123726at) obj).f341747b).flatMap(new C118394an(map)).collect(Collectors.toCollection(C118395ao.f328626a));
    }
}
