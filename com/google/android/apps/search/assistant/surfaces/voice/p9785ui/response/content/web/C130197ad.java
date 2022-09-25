package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129025a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.ad */
/* compiled from: PG */
public final class C130197ad implements C129146c {

    /* renamed from: c */
    private static final C33480d f356952c = C33480d.m62053a("show_search_results_page_args", "assistant.api.client_op.ShowSearchResultsPageArgs", C51971fx.f136380g);

    /* renamed from: a */
    public final AccountId f356953a;

    /* renamed from: b */
    public final C130219n f356954b;

    public C130197ad(AccountId accountId, C130219n nVar) {
        this.f356953a = accountId;
        this.f356954b = nVar;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        return C129025a.m210612a(dyVar, f356952c, new C130196ac(this));
    }
}
