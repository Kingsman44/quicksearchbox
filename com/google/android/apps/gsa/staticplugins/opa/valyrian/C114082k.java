package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.k */
/* compiled from: PG */
public final /* synthetic */ class C114082k implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f316087a;

    public /* synthetic */ C114082k(C113926aa aaVar) {
        this.f316087a = aaVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int width;
        C113926aa aaVar = this.f316087a;
        if (!(i == i5 && i3 == i7) && (width = view.getWidth() - ((int) C91115n.m148870b(96.0f, aaVar.f315526o))) > 0) {
            aaVar.f315518g.setMaxWidth(width);
        }
    }
}
