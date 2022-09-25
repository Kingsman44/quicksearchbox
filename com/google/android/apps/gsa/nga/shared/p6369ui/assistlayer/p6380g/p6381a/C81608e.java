package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.graphics.RectF;
import android.widget.ImageView;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.e */
/* compiled from: PG */
public final /* synthetic */ class C81608e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81608e f223258a = new C81608e();

    private /* synthetic */ C81608e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ImageView imageView = (ImageView) obj;
        return new RectF((float) imageView.getLeft(), (float) imageView.getTop(), (float) imageView.getRight(), (float) imageView.getBottom());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
