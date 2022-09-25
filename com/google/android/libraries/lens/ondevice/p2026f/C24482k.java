package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.p4522b.C58532in;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Collection;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.ondevice.f.k */
/* compiled from: PG */
public final /* synthetic */ class C24482k implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C58532in f66999a;

    public /* synthetic */ C24482k(C58532in inVar) {
        this.f66999a = inVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C58532in inVar = this.f66999a;
        C24803n nVar = (C24803n) obj;
        C24803n nVar2 = (C24803n) obj2;
        C58974d dVar = C24491t.f67010a;
        ((C58970a) ((C58970a) C24491t.f67010a.mo56226d()).mo56372aa(48791)).mo56389s("buildDependencyStatusMap duplicate key found for %s", (String) Collection.EL.stream(inVar.map.entrySet()).filter(new C24478g(nVar)).map(C24479h.f66995a).findFirst().get());
        return nVar;
    }
}
