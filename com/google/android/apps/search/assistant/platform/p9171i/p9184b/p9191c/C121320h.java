package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9191c;

import android.net.Uri;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.c.h */
/* compiled from: PG */
public final /* synthetic */ class C121320h implements Function {

    /* renamed from: a */
    public final /* synthetic */ C121324l f336909a;

    public /* synthetic */ C121320h(C121324l lVar) {
        this.f336909a = lVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C121324l lVar = this.f336909a;
        String str = (String) obj;
        if (!str.contains("resource_name_obfuscated")) {
            return str;
        }
        Optional ofNullable = Optional.ofNullable(Uri.parse(str).getHost());
        return (String) ofNullable.map(new C121315c(lVar)).filter(C121316d.f336905a).map(new C121317e(ofNullable)).orElse(str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
