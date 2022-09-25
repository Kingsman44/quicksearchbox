package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import android.net.Uri;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gu */
/* compiled from: PG */
public final /* synthetic */ class C112592gu implements Function {

    /* renamed from: a */
    public final /* synthetic */ List f312190a;

    public /* synthetic */ C112592gu(List list) {
        this.f312190a = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Uri.Builder builder = (Uri.Builder) obj;
        Collection.EL.stream(this.f312190a).findFirst().ifPresent(new C112589gr(builder));
        return builder.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
