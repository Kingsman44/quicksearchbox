package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.support.p031v4.app.Fragment;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.e */
/* compiled from: PG */
public final /* synthetic */ class C136087e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C136087e f370633a = new C136087e();

    private /* synthetic */ C136087e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (Fragment) ((Optional) obj).get();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
