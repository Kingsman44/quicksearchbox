package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9769h;

import android.content.res.ColorStateList;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p299c.p302c.C5889g;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.C5593j;
import com.bumptech.glide.p287f.p289b.C5577a;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128807a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128827b;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128828c;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128829d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.p3616e.p3618b.C46336b;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.apps.tiktok.media.C47449e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.h.ai */
/* compiled from: PG */
final class C128889ai implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128893am f354219a;

    public C128889ai(C128893am amVar) {
        this.f354219a = amVar;
    }

    /* renamed from: c */
    public final void mo108727c() {
        C128895an.m210376a(this.f354219a.f354225c).setImageTintList((ColorStateList) null);
    }

    /* renamed from: d */
    public final void mo108728d() {
        ColorStateList valueOf = ColorStateList.valueOf(C19391a.m36980a(this.f354219a.f354225c.requireContext(), R.attr.colorOnSurface));
        C69664n.m101060f(valueOf, "valueOf(AssistantColors.…agment.requireContext()))");
        C128895an.m210376a(this.f354219a.f354225c).setImageTintList(valueOf);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C128827b bVar = (C128827b) obj;
        C69664n.m101061g(bVar, "data");
        if (bVar instanceof C128829d) {
            C128895an.m210376a(this.f354219a.f354225c).setImageResource(R.drawable.product_logo_assistant_color_48);
            mo108728d();
        } else if (bVar instanceof C128828c) {
            C128895an.m210376a(this.f354219a.f354225c).setImageResource(R.drawable.gs_account_circle_fill1_vd_theme_24);
            mo108727c();
        } else if (bVar instanceof C128807a) {
            C46215j jVar = ((C128807a) bVar).f354070a;
            C47449e eVar = this.f354219a.f354228f;
            C6007z zVar = (C6007z) ((C6007z) eVar.mo51286a().mo11872j(new C46336b(jVar)).mo11982o(C5593j.m14518b()).mo12452n(C5889g.m15222c(new C5577a(200, true))).mo11963P(R.drawable.product_logo_assistant_color_48)).mo11952E(R.drawable.gs_account_circle_fill1_vd_theme_24);
            zVar.mo12455s(new C128888ah(this, C128895an.m210376a(this.f354219a.f354225c)), (C5592i) null, zVar, C5622i.f16959a);
        }
    }
}
