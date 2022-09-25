package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.impl;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130127c;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.fragment.impl.f */
/* compiled from: PG */
public final /* synthetic */ class C130134f implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ FrameLayout f356798a;

    public /* synthetic */ C130134f(FrameLayout frameLayout) {
        this.f356798a = frameLayout;
    }

    public final void accept(Object obj, Object obj2) {
        C130127c cVar = (C130127c) obj;
        this.f356798a.addView((View) obj2);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
