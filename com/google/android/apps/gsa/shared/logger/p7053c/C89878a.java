package com.google.android.apps.gsa.shared.logger.p7053c;

import com.google.android.apps.gsa.shared.p6968aa.C89059o;

/* renamed from: com.google.android.apps.gsa.shared.logger.c.a */
/* compiled from: PG */
public final class C89878a extends C89881d {

    /* renamed from: a */
    public C89059o f246244a;

    /* renamed from: b */
    public byte f246245b;

    /* renamed from: c */
    private boolean f246246c;

    /* renamed from: a */
    public final C89882e mo83713a() {
        if (this.f246245b == 3) {
            return new C89879b(this.f246244a, this.f246246c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f246245b & 1) == 0) {
            sb.append(" isPrefetched");
        }
        if ((this.f246245b & 2) == 0) {
            sb.append(" isPrerendered");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo83714b(boolean z) {
        this.f246246c = z;
        this.f246245b = (byte) (this.f246245b | 1);
    }
}
