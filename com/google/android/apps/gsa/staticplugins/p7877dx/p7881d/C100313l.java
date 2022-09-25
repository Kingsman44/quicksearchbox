package com.google.android.apps.gsa.staticplugins.p7877dx.p7881d;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.d.l */
/* compiled from: PG */
public final /* synthetic */ class C100313l implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ C100315n f280508a;

    public /* synthetic */ C100313l(C100315n nVar) {
        this.f280508a = nVar;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        ViewGroup e = this.f280508a.mo91873e();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e.getLayoutParams();
        marginLayoutParams.leftMargin = rect.left;
        marginLayoutParams.rightMargin = rect.right;
        e.setLayoutParams(marginLayoutParams);
    }
}
