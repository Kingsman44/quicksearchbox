package com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.p1340a;

import com.google.assistant.p3897e.p3921j.C51756ci;
import com.google.protos.p5129p.p5131b.C65798cb;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.e.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C16880k implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C16880k f49371a = new C16880k();

    private /* synthetic */ C16880k() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51756ci ciVar;
        C65798cb cbVar = (C65798cb) obj;
        if (cbVar.f178857b == 2) {
            ciVar = C51756ci.m86372a(((Integer) cbVar.f178858c).intValue());
            if (ciVar == null) {
                ciVar = C51756ci.PERSONAL_DATA_OUTPUT_UNKNOWN;
            }
        } else {
            ciVar = C51756ci.PERSONAL_DATA_OUTPUT_UNKNOWN;
        }
        return Boolean.valueOf(ciVar.equals(C51756ci.ALL_PERSONAL_DATA));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
