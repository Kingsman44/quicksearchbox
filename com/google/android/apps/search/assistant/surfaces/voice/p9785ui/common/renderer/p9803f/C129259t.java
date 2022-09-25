package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129025a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9870a.C130150a;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.t */
/* compiled from: PG */
public final class C129259t implements C129146c {

    /* renamed from: c */
    private static final C33480d f355042c = C33480d.m62053a("show_text_args", "assistant.api.client_op.ShowTextArgs", C52003hb.f136476i);

    /* renamed from: a */
    public final AccountId f355043a;

    /* renamed from: b */
    public final C130150a f355044b;

    public C129259t(AccountId accountId, C130150a aVar) {
        this.f355043a = accountId;
        this.f355044b = aVar;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        return C129025a.m210612a(dyVar, f355042c, new C129258s(this, dyVar));
    }
}
