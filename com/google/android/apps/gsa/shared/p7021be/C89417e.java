package com.google.android.apps.gsa.shared.p7021be;

import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.shared.be.e */
/* compiled from: PG */
public final /* synthetic */ class C89417e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C89417e f242402a = new C89417e();

    private /* synthetic */ C89417e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (C46675m) ((Map.Entry) obj).getValue();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
