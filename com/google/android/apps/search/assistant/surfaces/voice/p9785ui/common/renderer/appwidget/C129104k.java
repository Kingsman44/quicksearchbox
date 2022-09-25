package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.appwidget;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129025a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32481n;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.agj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.appwidget.k */
/* compiled from: PG */
public final class C129104k implements C129146c {

    /* renamed from: c */
    private static final C33480d f354673c = C33480d.m62053a("show_app_widget_args", "assistant.api.client_op.ui.ShowAppWidgetArgs", agj.f135054g);

    /* renamed from: a */
    public final AccountId f354674a;

    /* renamed from: b */
    public final C32481n f354675b;

    public C129104k(AccountId accountId, C32481n nVar) {
        this.f354674a = accountId;
        this.f354675b = nVar;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        return C129025a.m210612a(dyVar, f354673c, new C129103j(this));
    }
}
