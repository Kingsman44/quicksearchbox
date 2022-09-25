package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import com.google.android.googlequicksearchbox.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.cb */
/* compiled from: PG */
final class C139104cb implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139099bx f378319a;

    public C139104cb(C139099bx bxVar) {
        this.f378319a = bxVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139099bx bxVar = this.f378319a;
        String a = ((C139088bm) bVar).mo114715a();
        MaterialToolbar materialToolbar = (MaterialToolbar) bxVar.f378304b.requireView().findViewById(R.id.googleapp_action_bar);
        if (a.equals("color_picker_tag")) {
            materialToolbar.mo2422w(R.string.googleapp_bar_color_title);
        } else if (a.equals("google_logo_tag")) {
            materialToolbar.mo2422w(R.string.googleapp_bar_logo_title);
        } else if (a.equals("search_bar_shape_tag")) {
            materialToolbar.mo2422w(R.string.googleapp_bar_shape_title);
        } else if (a.equals("opacity_slider_tag")) {
            materialToolbar.mo2422w(R.string.googleapp_bar_shading_title);
        }
        return C47392e.f123115a;
    }
}
