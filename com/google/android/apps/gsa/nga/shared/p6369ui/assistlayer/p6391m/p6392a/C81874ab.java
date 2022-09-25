package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6391m.p6392a;

import android.graphics.RectF;
import com.google.android.libraries.search.p6glow.AssistantP6GlowView;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.m.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C81874ab implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81874ab f223891a = new C81874ab();

    private /* synthetic */ C81874ab() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        AssistantP6GlowView assistantP6GlowView = (AssistantP6GlowView) obj;
        return new RectF((float) assistantP6GlowView.getLeft(), (float) assistantP6GlowView.getTop(), (float) assistantP6GlowView.getRight(), (float) assistantP6GlowView.getBottom());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
