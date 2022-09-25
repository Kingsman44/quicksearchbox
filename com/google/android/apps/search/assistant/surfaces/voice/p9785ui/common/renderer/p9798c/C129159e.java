package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9798c;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129025a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C51809dy;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c.e */
/* compiled from: PG */
public final class C129159e implements C129146c {

    /* renamed from: a */
    public final AccountId f354803a;

    public C129159e(AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        this.f354803a = accountId;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C129228e a = C129025a.m210612a(dyVar, C129160f.f354804a, new C129158d(this));
        C69664n.m101060f(a, "override fun perform(cli…ate(accountId, it))\n    }");
        return a;
    }
}
