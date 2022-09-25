package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.search.Query;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ge */
/* compiled from: PG */
final class C108370ge implements Function {

    /* renamed from: a */
    public static final C108370ge f301423a = new C108370ge();

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        boolean z = true;
        if (((Query) obj).mo84263a("android.opa.extra.CLIENT_MODALITY") == 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
