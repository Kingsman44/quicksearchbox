package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import com.google.common.p4522b.C58487gw;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.t.h.an */
/* compiled from: PG */
public final /* synthetic */ class C118394an implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f328625a;

    public /* synthetic */ C118394an(Map map) {
        this.f328625a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map map = this.f328625a;
        C123723aq aqVar = (C123723aq) obj;
        C58487gw gwVar = C118426bs.f328679a;
        List list = (List) map.get(aqVar.f341740b);
        if (list == null) {
            return Stream.CC.empty();
        }
        if (aqVar.f341741c.isEmpty()) {
            return Collection.EL.stream(list);
        }
        return Collection.EL.stream(list).filter(new C118403aw(aqVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
