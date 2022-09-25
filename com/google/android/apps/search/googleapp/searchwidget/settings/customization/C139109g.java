package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.widget.ImageButton;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.g */
/* compiled from: PG */
final class C139109g implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139108f f378333a;

    public C139109g(C139108f fVar) {
        this.f378333a = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139115m mVar = (C139115m) bVar;
        C139108f fVar = this.f378333a;
        FragmentManager childFragmentManager = fVar.f378325a.getChildFragmentManager();
        Fragment c = childFragmentManager.f634a.mo671c("custom_color_slider_tag");
        if (c != null && !c.isRemoving()) {
            C0154a aVar = new C0154a(childFragmentManager);
            aVar.mo516m(c);
            aVar.mo509f();
        }
        C139080be beVar = fVar.f378330f;
        beVar.getClass();
        C139074az azVar = beVar.f378255f;
        if (azVar == null) {
            azVar = C139074az.f378227d;
        }
        C139070av avVar = (C139070av) fVar.f378330f.toBuilder();
        C139073ay ayVar = (C139073ay) azVar.toBuilder();
        int a = mVar.mo114670a();
        ayVar.copyOnWrite();
        C139074az azVar2 = (C139074az) ayVar.instance;
        azVar2.f378229a |= 2;
        azVar2.f378231c = a;
        avVar.copyOnWrite();
        C139080be beVar2 = (C139080be) avVar.instance;
        C139074az azVar3 = (C139074az) ayVar.build();
        azVar3.getClass();
        beVar2.f378255f = azVar3;
        beVar2.f378250a |= 16;
        fVar.f378330f = (C139080be) avVar.build();
        ImageButton a2 = C139108f.m225966a(fVar.f378325a.requireView());
        C139074az azVar4 = fVar.f378330f.f378255f;
        if (azVar4 == null) {
            azVar4 = C139074az.f378227d;
        }
        fVar.mo114728d(a2, azVar4.f378231c);
        fVar.f378325a.requireView().findViewById(R.id.googleapp_color_theme_picker).setVisibility(0);
        return C47392e.f123115a;
    }
}
