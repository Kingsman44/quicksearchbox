package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.support.p031v4.app.Fragment;
import p3186j$.util.function.ToIntFunction;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.f */
/* compiled from: PG */
public final /* synthetic */ class C136088f implements ToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ C136091i f370634a;

    public /* synthetic */ C136088f(C136091i iVar) {
        this.f370634a = iVar;
    }

    public final int applyAsInt(Object obj) {
        return this.f370634a.f370641e.indexOf(((Fragment) obj).getClass());
    }
}
