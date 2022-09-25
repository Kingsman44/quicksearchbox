package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63063ga;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.r */
/* compiled from: PG */
public final /* synthetic */ class C111382r implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111382r f309908a = new C111382r();

    private /* synthetic */ C111382r() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59071e eVar = C111346ao.f309833a;
        C63063ga gaVar = (C63063ga) ((Map.Entry) obj).getValue();
        return gaVar.f170181a == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
