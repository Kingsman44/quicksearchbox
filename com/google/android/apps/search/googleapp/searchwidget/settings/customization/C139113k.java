package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.support.p031v4.app.C0154a;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.k */
/* compiled from: PG */
final class C139113k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C139108f f378337a;

    public C139113k(C139108f fVar) {
        this.f378337a = fVar;
    }

    public final void onClick(View view) {
        C139108f fVar = this.f378337a;
        fVar.mo114727c(C139079bd.CUSTOM_COLOR);
        fVar.f378325a.requireView().findViewById(R.id.googleapp_color_theme_picker).setVisibility(8);
        fVar.f378330f.getClass();
        C0154a aVar = new C0154a(fVar.f378325a.getChildFragmentManager());
        AccountId accountId = fVar.f378326b;
        C139080be beVar = fVar.f378330f;
        C139117o oVar = new C139117o();
        C68324h.m98669f(oVar);
        C47247a.m84047b(oVar, accountId);
        C47243l.m84039a(oVar, beVar);
        aVar.mo689v(R.id.googleapp_custom_color_slider_container, oVar, "custom_color_slider_tag");
        aVar.mo509f();
    }
}
