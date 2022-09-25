package com.google.android.apps.p471d.p472a.p477b.p478a;

import android.os.Bundle;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.d.a.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C9029b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C9029b f31228a = new C9029b();

    private /* synthetic */ C9029b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C9028a aVar = (C9028a) obj;
        Bundle bundle = new Bundle();
        bundle.putInt("start", aVar.mo17317b());
        bundle.putInt("end", aVar.mo17316a());
        bundle.putStringArrayList("alternatives", aVar.mo17318c());
        return bundle;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
