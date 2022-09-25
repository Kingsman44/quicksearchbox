package com.google.android.apps.gsa.staticplugins.actionsui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7065j.C89932c;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.n */
/* compiled from: PG */
final class C93689n implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ClassicActionView f261493a;

    public C93689n(ClassicActionView classicActionView) {
        this.f261493a = classicActionView;
    }

    public final void onClick(View view) {
        ClassicActionView classicActionView = this.f261493a;
        C93505k kVar = classicActionView.f260733a;
        if (kVar != null) {
            ((C93503i) kVar.f260975a.f239232a).mo82045h();
        }
        classicActionView.mo87712n().mo87723a();
        C89932c.f246391b.mo83778h(classicActionView, 5);
    }
}
