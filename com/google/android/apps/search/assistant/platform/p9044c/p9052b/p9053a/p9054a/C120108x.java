package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33719m;
import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33721o;
import java.util.Set;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5463a.C69514bd;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.x */
/* compiled from: PG */
final class C120108x implements BiFunction {

    /* renamed from: a */
    final /* synthetic */ C33719m f334333a;

    public C120108x(C33719m mVar) {
        this.f334333a = mVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        Set set = (Set) obj2;
        C69664n.m101061g((C33721o) obj, "<anonymous parameter 0>");
        if (set == null) {
            return null;
        }
        Set d = C69514bd.m100890d(set, this.f334333a);
        if (true != d.isEmpty()) {
            return d;
        }
        return null;
    }
}
