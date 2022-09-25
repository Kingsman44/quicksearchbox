package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.x */
/* compiled from: PG */
public final /* synthetic */ class C111074x implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111074x f309300a = new C111074x();

    private /* synthetic */ C111074x() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
        String str = (String) ((Map.Entry) obj).getValue();
        fyVar.copyOnWrite();
        C63063ga gaVar = (C63063ga) fyVar.instance;
        str.getClass();
        gaVar.f170181a = 3;
        gaVar.f170182b = str;
        return (C63063ga) fyVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
