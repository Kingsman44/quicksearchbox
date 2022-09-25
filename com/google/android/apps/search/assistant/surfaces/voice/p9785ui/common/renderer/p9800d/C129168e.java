package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9800d;

import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129163d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129228e;
import com.google.android.apps.search.soundsearch.p10653b.C141640b;
import com.google.android.apps.search.soundsearch.p10653b.C141643e;
import com.google.android.apps.search.soundsearch.p10653b.C141644f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.d.e */
/* compiled from: PG */
public final class C129168e implements C129146c {

    /* renamed from: a */
    private final AccountId f354816a;

    /* renamed from: b */
    private final C126879a f354817b;

    public C129168e(AccountId accountId, C126879a aVar) {
        this.f354816a = accountId;
        this.f354817b = aVar;
    }

    /* renamed from: a */
    public final C129228e mo108791a(C51809dy dyVar) {
        C141640b bVar = (C141640b) C141643e.f384462c.createBuilder();
        bVar.copyOnWrite();
        C141643e eVar = (C141643e) bVar.instance;
        eVar.f384465b = 4;
        eVar.f384464a |= 1;
        this.f354817b.mo20101f(C141644f.m229859a((C141643e) bVar.build()));
        AccountId accountId = this.f354816a;
        C129166c cVar = new C129166c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        C129228e eVar2 = C129228e.f354973a;
        return C129163d.m210837a(cVar, (String) null);
    }
}
