package com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a;

import com.google.assistant.p3931f.p3939c.C52825b;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.e.a.o */
/* compiled from: PG */
public final /* synthetic */ class C130373o implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f357294a;

    public /* synthetic */ C130373o(C58495hd hdVar) {
        this.f357294a = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58495hd hdVar = this.f357294a;
        C52825b bVar = (C52825b) obj;
        String c = C58890d.m90988c(bVar.f138597c);
        C58528ij ijVar = (C58528ij) Collection.EL.stream((List) Collection.EL.stream(bVar.f138598d).filter(C130364f.f357285a).findFirst().map(C130365g.f357286a).orElse(C58485gu.m89845m())).map(new C130366h(c)).collect(C58370cn.f155947b);
        if (ijVar.isEmpty()) {
            ijVar = new C58759qy(c);
        }
        C58486gv gvVar = new C58486gv();
        Collection.EL.stream(bVar.f138598d).filter(C130359a.f357279a).forEach(new C130367i(gvVar));
        C58487gw a = gvVar.mo55417a();
        Stream stream = Collection.EL.stream(ijVar);
        Objects.requireNonNull(hdVar);
        return stream.filter(new C130375q(hdVar)).flatMap(new C130360b(hdVar, a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
