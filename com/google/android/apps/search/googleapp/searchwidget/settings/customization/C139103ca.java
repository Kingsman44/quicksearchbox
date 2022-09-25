package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.ca */
/* compiled from: PG */
final class C139103ca implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139099bx f378318a;

    public C139103ca(C139099bx bxVar) {
        this.f378318a = bxVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139099bx bxVar = this.f378318a;
        String a = ((C139061am) bVar).mo114684a();
        bxVar.f378304b.requireView().findViewById(R.id.googleapp_main_menu_container).setVisibility(8);
        Optional empty = Optional.empty();
        if (a.equals("color_picker_tag")) {
            AccountId accountId = bxVar.f378309g;
            C139080be beVar = bxVar.f378313k;
            C139107e eVar = new C139107e();
            C68324h.m98669f(eVar);
            C47247a.m84047b(eVar, accountId);
            C47243l.m84039a(eVar, beVar);
            empty = Optional.m71637of(eVar);
        } else if (a.equals("google_logo_tag")) {
            AccountId accountId2 = bxVar.f378309g;
            C139080be beVar2 = bxVar.f378313k;
            C139124v vVar = new C139124v();
            C68324h.m98669f(vVar);
            C47247a.m84047b(vVar, accountId2);
            C47243l.m84039a(vVar, beVar2);
            empty = Optional.m71637of(vVar);
        } else if (a.equals("search_bar_shape_tag")) {
            AccountId accountId3 = bxVar.f378309g;
            C139080be beVar3 = bxVar.f378313k;
            C139064ap apVar = new C139064ap();
            C68324h.m98669f(apVar);
            C47247a.m84047b(apVar, accountId3);
            C47243l.m84039a(apVar, beVar3);
            empty = Optional.m71637of(apVar);
        } else if (a.equals("opacity_slider_tag")) {
            AccountId accountId4 = bxVar.f378309g;
            C139080be beVar4 = bxVar.f378313k;
            C139057ai aiVar = new C139057ai();
            C68324h.m98669f(aiVar);
            C47247a.m84047b(aiVar, accountId4);
            C47243l.m84039a(aiVar, beVar4);
            empty = Optional.m71637of(aiVar);
        }
        if (empty.isPresent()) {
            C0154a aVar = new C0154a(bxVar.f378304b.getChildFragmentManager());
            aVar.mo689v(R.id.googleapp_menu_item_container, (Fragment) empty.get(), "menu_item_fragment_tag");
            aVar.mo509f();
        }
        return C47392e.f123115a;
    }
}
