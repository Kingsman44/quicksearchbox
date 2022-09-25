package com.google.android.apps.search.assistant.surfaces.voice.growth.p9634c.p9636b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129020f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129021g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129023i;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9735b.C128569b;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.c.b.c */
/* compiled from: PG */
public final class C127734c implements C129023i {

    /* renamed from: a */
    private final C129020f f351620a;

    /* renamed from: b */
    private final AccountId f351621b;

    /* renamed from: c */
    private final C36624a f351622c;

    public C127734c(C129020f fVar, AccountId accountId, C36624a aVar) {
        this.f351620a = fVar;
        this.f351621b = accountId;
        this.f351622c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo108195a() {
        return this.f351622c.mo40259w();
    }

    /* renamed from: b */
    public final Optional mo108196b() {
        C128569b d = C128569b.m209824d(this.f351621b);
        if (((C127732a) this.f351620a).f351618a == C129021g.POSITION_ABOVE_HEADER) {
            return Optional.m71637of(d);
        }
        return Optional.empty();
    }
}
