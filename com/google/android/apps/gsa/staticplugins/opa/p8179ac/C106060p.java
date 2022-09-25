package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.content.res.Resources;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.p */
/* compiled from: PG */
final class C106060p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C106061q f296097a;

    public C106060p(C106061q qVar) {
        this.f296097a = qVar;
    }

    public final void onGlobalLayout() {
        Resources resources = this.f296097a.f296098a.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        int i = 0;
        int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        C106061q qVar = this.f296097a;
        Resources resources2 = qVar.f296098a.getResources();
        int identifier2 = resources2.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier2 > 0 && resources2.getBoolean(identifier2)) {
            Resources resources3 = qVar.f296098a.getResources();
            int identifier3 = resources3.getIdentifier(resources3.getConfiguration().orientation == 1 ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
            if (identifier3 > 0) {
                i = resources3.getDimensionPixelSize(identifier3);
            }
        }
        int i2 = dimensionPixelSize + i;
        C106061q qVar2 = this.f296097a;
        if (!qVar2.f296100c || qVar2.mo95279a() <= i2) {
            C106061q qVar3 = this.f296097a;
            if (!qVar3.f296100c && qVar3.mo95279a() <= i2) {
                this.f296097a.mo95280b();
                return;
            }
            return;
        }
        this.f296097a.mo95281c();
    }
}
