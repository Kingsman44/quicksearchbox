package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.view.View;
import android.widget.Button;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.h */
/* compiled from: PG */
final class C84013h implements C84012g {

    /* renamed from: a */
    public final FooterLayout f228857a;

    public C84013h(FooterLayout footerLayout) {
        this.f228857a = footerLayout;
    }

    /* renamed from: e */
    private static void m133891e(Button button, C84011f fVar) {
        button.setText(fVar.mo77416b());
        button.setOnClickListener(fVar.mo77415a());
        button.setVisibility(true != fVar.mo77418d() ? 8 : 0);
    }

    /* renamed from: a */
    public final void mo77472a(C84011f fVar) {
        m133891e(this.f228857a.mo77360a(), fVar);
    }

    /* renamed from: b */
    public final void mo77473b(C84011f fVar) {
        this.f228857a.mo77363d(fVar.mo77417c());
        m133891e(this.f228857a.mo77361b(), fVar);
    }

    /* renamed from: c */
    public final void mo77474c(View.OnClickListener onClickListener) {
        ((FloatingActionButton) this.f228857a.findViewById(R.id.scroll_button)).setOnClickListener(onClickListener);
    }

    /* renamed from: d */
    public final void mo77475d(int i) {
        this.f228857a.mo77362c(i);
    }
}
