package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.graphics.Rect;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.at */
/* compiled from: PG */
public final /* synthetic */ class C82065at implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C82071az f224299a;

    public /* synthetic */ C82065at(C82071az azVar) {
        this.f224299a = azVar;
    }

    public final Object get() {
        C82071az azVar = this.f224299a;
        Rect rect = new Rect();
        azVar.f224328e.getGlobalVisibleRect(rect);
        return rect;
    }
}
