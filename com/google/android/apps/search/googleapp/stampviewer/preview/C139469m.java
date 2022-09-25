package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.m */
/* compiled from: PG */
public final /* synthetic */ class C139469m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C139469m f379237a = new C139469m();

    private /* synthetic */ C139469m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return ((View) obj).findViewById(R.id.googleapp_inline_stamp_viewer_container);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
