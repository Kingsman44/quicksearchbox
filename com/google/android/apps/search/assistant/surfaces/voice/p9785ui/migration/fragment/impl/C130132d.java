package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130127c;
import com.google.apps.tiktok.inject.C47274n;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.impl.d */
/* compiled from: PG */
public final /* synthetic */ class C130132d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C47274n f356796a;

    public /* synthetic */ C130132d(C47274n nVar) {
        this.f356796a = nVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C130127c cVar = (C130127c) obj;
        FrameLayout frameLayout = new FrameLayout(this.f356796a);
        frameLayout.setId(View.generateViewId());
        return frameLayout;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
