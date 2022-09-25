package com.google.android.apps.gsa.sidekick.shared;

import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7722hn;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.a */
/* compiled from: PG */
public final class C91642a extends C91712d {

    /* renamed from: a */
    public C7722hn f255593a;

    /* renamed from: b */
    public CardRenderingContext f255594b;

    /* renamed from: c */
    public C60220t f255595c;

    /* renamed from: d */
    private long f255596d;

    /* renamed from: e */
    private byte f255597e;

    public C91642a() {
    }

    public C91642a(C91716e eVar) {
        C91646b bVar = (C91646b) eVar;
        this.f255593a = bVar.f255600a;
        this.f255594b = bVar.f255601b;
        this.f255596d = bVar.f255602c;
        this.f255595c = bVar.f255603d;
        this.f255597e = 1;
    }

    /* renamed from: a */
    public final C91716e mo86016a() {
        CardRenderingContext cardRenderingContext;
        if (this.f255597e == 1 && (cardRenderingContext = this.f255594b) != null) {
            return new C91646b(this.f255593a, cardRenderingContext, this.f255596d, this.f255595c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f255594b == null) {
            sb.append(" cardRenderingContext");
        }
        if (this.f255597e == 0) {
            sb.append(" cacheAgeMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo86017b(long j) {
        this.f255596d = j;
        this.f255597e = 1;
    }

    /* renamed from: c */
    public final void mo86018c(CardRenderingContext cardRenderingContext) {
        if (cardRenderingContext != null) {
            this.f255594b = cardRenderingContext;
            return;
        }
        throw new NullPointerException("Null cardRenderingContext");
    }

    /* renamed from: d */
    public final void mo86019d(C7722hn hnVar) {
        this.f255593a = hnVar;
    }

    /* renamed from: e */
    public final void mo86020e(C60220t tVar) {
        this.f255595c = tVar;
    }
}
