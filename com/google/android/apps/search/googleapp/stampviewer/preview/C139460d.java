package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.d */
/* compiled from: PG */
final class C139460d implements Function {

    /* renamed from: a */
    public static final C139460d f379229a = new C139460d();

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        View view = (View) obj;
        C69664n.m101061g(view, "value");
        return view.findViewById(R.id.googleapp_inline_stamp_viewer_container);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
