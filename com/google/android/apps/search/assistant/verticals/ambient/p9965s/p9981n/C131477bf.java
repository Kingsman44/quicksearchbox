package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83774q;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83781x;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62947c;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.bf */
/* compiled from: PG */
public final /* synthetic */ class C131477bf implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131481bj f359314a;

    /* renamed from: b */
    public final /* synthetic */ Instant f359315b;

    public /* synthetic */ C131477bf(C131481bj bjVar, Instant instant) {
        this.f359314a = bjVar;
        this.f359315b = instant;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C131481bj bjVar = this.f359314a;
        C83781x xVar = (C83781x) obj;
        C58485gu guVar = (C58485gu) Collection.EL.stream(xVar.f228358a).filter(new C131466az(this.f359315b)).collect(C58370cn.f155946a);
        if (guVar.size() < xVar.f228358a.size()) {
            ((C58970a) ((C58970a) bjVar.f359319a.mo56224b()).mo56372aa(39286)).mo56387q("Filtered out %d old shopping lists.", xVar.f228358a.size() - guVar.size());
        }
        C83774q qVar = (C83774q) xVar.toBuilder();
        qVar.copyOnWrite();
        ((C83781x) qVar.instance).f228358a = C83781x.emptyProtobufList();
        qVar.copyOnWrite();
        C83781x xVar2 = (C83781x) qVar.instance;
        xVar2.mo77099a();
        C62947c.addAll((Iterable) guVar, (List) xVar2.f228358a);
        return (C83781x) qVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
