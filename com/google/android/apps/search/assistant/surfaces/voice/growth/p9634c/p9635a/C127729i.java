package com.google.android.apps.search.assistant.surfaces.voice.growth.p9634c.p9635a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129020f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129021g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129023i;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36657a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.util.concurrent.C60870cx;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.i */
/* compiled from: PG */
public final class C127729i implements C129023i {

    /* renamed from: a */
    private final C129020f f351610a;

    /* renamed from: b */
    private final AccountId f351611b;

    /* renamed from: c */
    private final C36657a f351612c;

    public C127729i(C129020f fVar, AccountId accountId, C36657a aVar) {
        this.f351610a = fVar;
        this.f351611b = accountId;
        this.f351612c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo108195a() {
        return this.f351612c.mo40302e();
    }

    /* renamed from: b */
    public final Optional mo108196b() {
        AccountId accountId = this.f351611b;
        C127722c cVar = new C127722c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        C47243l.m84040b(cVar, "BluePillFragmentTag");
        C129021g gVar = C129021g.POSITION_UNDEFINED;
        if (((C127720a) this.f351610a).f351597a.ordinal() != 1) {
            return Optional.empty();
        }
        return Optional.m71637of(cVar);
    }
}
