package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.slicecard;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129025a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.aju;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.slicecard.i */
/* compiled from: PG */
public final class C129284i implements C129146c {

    /* renamed from: b */
    private static final C33480d f355096b = C33480d.m62053a("show_slice_card_args", "assistant.api.client_op.ShowSliceCardArgs", aju.f135238i);

    /* renamed from: a */
    public final AccountId f355097a;

    public C129284i(AccountId accountId) {
        this.f355097a = accountId;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        return C129025a.m210612a(dyVar, f355096b, new C129283h(this));
    }
}
