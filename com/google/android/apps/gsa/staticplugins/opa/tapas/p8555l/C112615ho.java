package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import android.net.Uri;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ho */
/* compiled from: PG */
public final /* synthetic */ class C112615ho implements Function {

    /* renamed from: a */
    public final /* synthetic */ List f312217a;

    public /* synthetic */ C112615ho(List list) {
        this.f312217a = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Uri.Builder builder = (Uri.Builder) obj;
        Collection.EL.stream(this.f312217a).forEach(new C112619hs(builder));
        return builder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
