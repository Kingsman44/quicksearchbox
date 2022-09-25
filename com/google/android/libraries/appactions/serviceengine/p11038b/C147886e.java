package com.google.android.libraries.appactions.serviceengine.p11038b;

import com.google.android.libraries.appactions.serviceengine.impl.C147914g;
import com.google.assistant.p3944g.p3948b.p3949a.C52932ac;
import com.google.assistant.p3944g.p3948b.p3949a.C52957v;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.appactions.serviceengine.b.e */
/* compiled from: PG */
public final /* synthetic */ class C147886e implements Function {

    /* renamed from: a */
    public final /* synthetic */ C147890i f398933a;

    public /* synthetic */ C147886e(C147890i iVar) {
        this.f398933a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }

    public final Object apply(Object obj) {
        C147890i iVar = this.f398933a;
        C52932ac acVar = (C52932ac) obj;
        if ((acVar.f138783a & 1) == 0) {
            return C58485gu.m89845m();
        }
        C147914g gVar = iVar.f398940d;
        C52957v vVar = acVar.f138784b;
        if (vVar == null) {
            vVar = C52957v.f138849e;
        }
        return C58485gu.m89846n(gVar.f398990a.a(vVar));
    }
}
