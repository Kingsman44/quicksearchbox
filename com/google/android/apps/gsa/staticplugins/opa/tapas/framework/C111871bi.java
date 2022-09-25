package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.common.p4552o.p4553a.C59494br;
import com.google.common.p4552o.p4553a.C59496bt;
import com.google.protobuf.C62947c;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.bi */
/* compiled from: PG */
public final /* synthetic */ class C111871bi implements Function {

    /* renamed from: a */
    public final /* synthetic */ Map f310866a;

    public /* synthetic */ C111871bi(Map map) {
        this.f310866a = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        int intValue = ((Integer) Map.EL.getOrDefault(this.f310866a, entry.getKey(), 0)).intValue();
        C59494br brVar = (C59494br) ((C59496bt) entry.getValue()).toBuilder();
        if (intValue > 0) {
            brVar.copyOnWrite();
            ((C59496bt) brVar.instance).f157865d = C59496bt.emptyProtobufList();
            List subList = ((C59496bt) entry.getValue()).f157865d.subList(0, ((C59496bt) entry.getValue()).f157865d.size() - intValue);
            brVar.copyOnWrite();
            C59496bt btVar = (C59496bt) brVar.instance;
            btVar.mo56969a();
            C62947c.addAll((Iterable) subList, (List) btVar.f157865d);
        }
        return (C59496bt) brVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
