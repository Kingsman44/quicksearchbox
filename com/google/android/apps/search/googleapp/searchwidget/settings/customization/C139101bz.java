package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.bz */
/* compiled from: PG */
final class C139101bz implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139099bx f378316a;

    public C139101bz(C139099bx bxVar) {
        this.f378316a = bxVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139062an anVar = (C139062an) bVar;
        C139099bx bxVar = this.f378316a;
        FragmentManager childFragmentManager = bxVar.f378304b.getChildFragmentManager();
        Fragment c = childFragmentManager.f634a.mo671c("menu_item_fragment_tag");
        if (c != null && !c.isRemoving()) {
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo516m(c);
            aVar.mo509f();
        }
        View requireView = bxVar.f378304b.requireView();
        requireView.findViewById(R.id.googleapp_main_menu_container).setVisibility(0);
        ((MaterialToolbar) requireView.findViewById(R.id.googleapp_action_bar)).mo2422w(R.string.googleapp_customize_text);
        return C47392e.f123115a;
    }
}
