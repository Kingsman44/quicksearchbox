package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.ay */
/* compiled from: PG */
public final /* synthetic */ class C107256ay implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C107256ay f298539a = new C107256ay();

    private /* synthetic */ C107256ay() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((View) obj).findViewById(R.id.shortcut_phrase_input);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
