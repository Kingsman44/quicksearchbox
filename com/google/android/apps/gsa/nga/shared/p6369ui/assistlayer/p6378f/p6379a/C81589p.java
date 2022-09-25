package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6378f.p6379a;

import android.graphics.RectF;
import android.view.View;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.f.a.p */
/* compiled from: PG */
public final /* synthetic */ class C81589p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81589p f223177a = new C81589p();

    private /* synthetic */ C81589p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        View view = (View) obj;
        return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
