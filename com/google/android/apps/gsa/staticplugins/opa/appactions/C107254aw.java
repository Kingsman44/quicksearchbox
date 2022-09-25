package com.google.android.apps.gsa.staticplugins.opa.appactions;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.aw */
/* compiled from: PG */
public final /* synthetic */ class C107254aw implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C107254aw f298537a = new C107254aw();

    private /* synthetic */ C107254aw() {
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
