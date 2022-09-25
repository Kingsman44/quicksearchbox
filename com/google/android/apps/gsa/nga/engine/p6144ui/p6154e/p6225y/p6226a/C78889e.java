package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6225y.p6226a;

import com.google.common.p4526f.C59071e;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.y.a.e */
/* compiled from: PG */
public final /* synthetic */ class C78889e implements Function {

    /* renamed from: a */
    public final /* synthetic */ Locale f217084a;

    public /* synthetic */ C78889e(Locale locale) {
        this.f217084a = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Locale locale = this.f217084a;
        C59071e eVar = C78892h.f217087a;
        return ((String) obj).toLowerCase(locale);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
