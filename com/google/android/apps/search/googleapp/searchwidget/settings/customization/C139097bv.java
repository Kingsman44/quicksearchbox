package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.apps.search.googleapp.searchwidget.C139135z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.bv */
/* compiled from: PG */
class C139097bv implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C139099bx f378302a;

    public C139097bv(C139099bx bxVar) {
        this.f378302a = bxVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C139099bx.f378303a.mo56225c()).mo56382g(th)).mo56372aa(41339)).mo56386p("Failed to fetch SearchWidgetCustomization data.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C139080be beVar = (C139080be) obj;
        C139099bx bxVar = this.f378302a;
        bxVar.f378313k = beVar;
        View requireView = bxVar.f378304b.requireView();
        C139099bx bxVar2 = this.f378302a;
        ImageView imageView = (ImageView) requireView.findViewById(R.id.googleapp_search_widget_background);
        ImageView imageView2 = (ImageView) requireView.findViewById(R.id.googleapp_search_widget_background_protection);
        Optional f = C139135z.m226020f(bxVar2.f378305c, beVar);
        if (f.isPresent()) {
            int intValue = ((Integer) f.get()).intValue();
            imageView.setColorFilter(intValue, PorterDuff.Mode.SRC_IN);
            imageView2.setColorFilter(intValue, PorterDuff.Mode.SRC_IN);
        } else {
            imageView.setColorFilter((ColorFilter) null);
            imageView2.setColorFilter((ColorFilter) null);
        }
        int a = C139072ax.m225890a(beVar.f378254e);
        ImageButton imageButton = (ImageButton) requireView.findViewById((a != 0 && a == 3) ? R.id.googleapp_search_widget_google_logo_full : R.id.googleapp_search_widget_google_logo);
        ImageButton imageButton2 = (ImageButton) requireView.findViewById(R.id.googleapp_search_widget_voice_btn);
        ImageButton imageButton3 = (ImageButton) requireView.findViewById(R.id.googleapp_search_widget_lens_btn);
        Optional e = C139135z.m226019e(bxVar2.f378305c, beVar);
        if (e.isPresent()) {
            int intValue2 = ((Integer) e.get()).intValue();
            imageButton.getDrawable().setColorFilter(intValue2, PorterDuff.Mode.SRC_ATOP);
            imageButton2.getDrawable().setColorFilter(intValue2, PorterDuff.Mode.SRC_ATOP);
            imageButton3.getDrawable().setColorFilter(intValue2, PorterDuff.Mode.SRC_ATOP);
        } else {
            imageButton.getDrawable().setColorFilter((ColorFilter) null);
            imageButton2.getDrawable().setColorFilter((ColorFilter) null);
            imageButton3.getDrawable().setColorFilter((ColorFilter) null);
        }
        ImageButton imageButton4 = (ImageButton) requireView.findViewById(R.id.googleapp_search_widget_google_logo_full);
        ImageButton imageButton5 = (ImageButton) requireView.findViewById(R.id.googleapp_search_widget_google_logo);
        int a2 = C139072ax.m225890a(beVar.f378254e);
        int i = 0;
        if (a2 != 0 && a2 == 3) {
            imageButton5.setVisibility(8);
            imageButton4.setVisibility(0);
        } else {
            imageButton4.setVisibility(8);
            imageButton5.setVisibility(0);
        }
        imageView.setImageDrawable(bxVar2.f378305c.getResources().getDrawable(C139135z.m226016b(beVar)));
        imageView2.setImageDrawable(bxVar2.f378305c.getResources().getDrawable(C139135z.m226015a(beVar)));
        requireView.findViewById(R.id.googleapp_search_widget_two_right_icons).setBackground(bxVar2.f378305c.getResources().getDrawable(C139135z.m226017c(beVar)));
        imageView.setAlpha(beVar.f378252c);
        imageView2.setAlpha(beVar.f378252c);
        MaterialButton materialButton = (MaterialButton) requireView.findViewById(R.id.googleapp_reset_style_button);
        if (true == beVar.equals(C139135z.m226018d())) {
            i = 4;
        }
        materialButton.setVisibility(i);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
