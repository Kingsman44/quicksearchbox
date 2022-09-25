package com.google.android.apps.gsa.staticplugins.opa.p8306at;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.staticplugins.opa.chatui.MessageNotificationCarousel$MessageCarouselLayoutManager;
import com.google.assistant.p3897e.p3921j.C52236kg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.at.h */
/* compiled from: PG */
public final /* synthetic */ class C107565h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C107571n f299228a;

    /* renamed from: b */
    public final /* synthetic */ C107570m f299229b;

    /* renamed from: c */
    public final /* synthetic */ C107572o f299230c;

    /* renamed from: d */
    public final /* synthetic */ int f299231d;

    public /* synthetic */ C107565h(C107571n nVar, C107570m mVar, C107572o oVar, int i) {
        this.f299228a = nVar;
        this.f299229b = mVar;
        this.f299230c = oVar;
        this.f299231d = i;
    }

    public final void onClick(View view) {
        C107571n nVar = this.f299228a;
        C107570m mVar = this.f299229b;
        C107572o oVar = this.f299230c;
        int i = this.f299231d;
        nVar.f299272c.mo96219b(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
        nVar.f299272c.mo96219b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
        nVar.mo96027d(mVar.f299252h);
        MessageNotificationCarousel$MessageCarouselLayoutManager messageNotificationCarousel$MessageCarouselLayoutManager = nVar.f299279j;
        if (messageNotificationCarousel$MessageCarouselLayoutManager != null) {
            messageNotificationCarousel$MessageCarouselLayoutManager.f300894b = false;
        }
        nVar.mo96032i(oVar.mo96033g(), 2, (C52236kg) null, i);
    }
}
