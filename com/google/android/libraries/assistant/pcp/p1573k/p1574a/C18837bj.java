package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60744a;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bj */
/* compiled from: PG */
public final /* synthetic */ class C18837bj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f53059a;

    public /* synthetic */ C18837bj(C58485gu guVar) {
        this.f53059a = guVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        Stream stream = Collection.EL.stream(this.f53059a);
        Objects.requireNonNull(componentName);
        return (C58485gu) stream.sorted(Comparator.CC.comparing(new C18842bo(componentName), C60744a.TRUE_FIRST)).collect(C58370cn.f155946a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
