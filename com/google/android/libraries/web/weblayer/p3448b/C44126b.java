package com.google.android.libraries.web.weblayer.p3448b;

import com.google.android.libraries.web.weblayer.p3448b.p3449a.C44123a;
import com.google.android.libraries.web.weblayer.p3448b.p3449a.C44124b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.web.weblayer.b.b */
/* compiled from: PG */
public final /* synthetic */ class C44126b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C44126b f114847a = new C44126b();

    private /* synthetic */ C44126b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C44124b bVar = (C44124b) obj;
        boolean z = true;
        if (bVar.f114845b != 1) {
            if (bVar.f114845b != 2) {
                z = false;
            }
            return C60856cj.m92900i(Boolean.valueOf(z));
        }
        C44123a aVar = new C44123a(bVar);
        return C60856cj.m92904m(C47810es.m84978r(aVar), bVar.f114844a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
