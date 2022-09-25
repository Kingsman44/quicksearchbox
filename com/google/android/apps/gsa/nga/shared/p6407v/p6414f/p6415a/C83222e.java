package com.google.android.apps.gsa.nga.shared.p6407v.p6414f.p6415a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6414f.C83217a;
import com.google.assistant.p3745ab.p3771w.C48418e;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.common.p4552o.ahi;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.f.a.e */
/* compiled from: PG */
public final /* synthetic */ class C83222e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C83222e f226844a = new C83222e();

    private /* synthetic */ C83222e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C48420g gVar = (C48420g) obj;
        ahi a = ahi.m92401a(gVar.f125131b);
        if (a == null) {
            a = ahi.UNKNOWN;
        }
        if (!a.equals(ahi.ELIGIBLE)) {
            return C83217a.OPA;
        }
        C83223f fVar = C83224g.f226845a;
        C48418e a2 = C48418e.m85225a(gVar.f125132c);
        if (a2 == null) {
            a2 = C48418e.ON_DEVICE_STACK_STATUS_UNKNOWN;
        }
        return (C83217a) fVar.mo56070hd(a2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
