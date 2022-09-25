package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.graphics.Rect;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.p7148ui.header.LogoHeaderView;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.n */
/* compiled from: PG */
public final /* synthetic */ class C93990n implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ C94001y f262513a;

    public /* synthetic */ C93990n(C94001y yVar) {
        this.f262513a = yVar;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        C94001y yVar = this.f262513a;
        Rect rect2 = yVar.f262534j;
        if (rect2 == null || !rect.equals(rect2)) {
            yVar.f262534j = rect;
            if (yVar.f262533i) {
                LogoHeaderView logoHeaderView = yVar.f262531g;
                Rect rect3 = yVar.f262534j;
                rect3.getClass();
                logoHeaderView.mo84997c(rect3);
            }
            yVar.mo88270g();
        }
    }
}
