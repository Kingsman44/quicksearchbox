package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55064en;
import java.util.concurrent.ExecutionException;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C34955i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C34955i f92638a = new C34955i();

    private /* synthetic */ C34955i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar = (C60870cx) obj;
        C59071e eVar = C34942ap.f92610a;
        try {
            return (C55064en) C60856cj.m92909r(cxVar);
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C34942ap.f92610a.mo56226d()).mo56382g(e)).mo56372aa(51207)).mo56386p("Failed to build AppSpecificEndpointId!");
            return C55064en.f144858f;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
