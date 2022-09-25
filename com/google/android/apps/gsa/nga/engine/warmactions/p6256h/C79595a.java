package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import android.net.Uri;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.a */
/* compiled from: PG */
final class C79595a extends C79613s {

    /* renamed from: a */
    public C79606l f218382a;

    /* renamed from: b */
    private Optional f218383b = Optional.empty();

    public C79595a() {
    }

    /* renamed from: a */
    public final C79614t mo74141a() {
        C79606l lVar = this.f218382a;
        if (lVar != null) {
            return new C79596b(lVar, this.f218383b);
        }
        throw new IllegalStateException("Missing required properties: resource");
    }

    /* renamed from: b */
    public final void mo74142b(Uri uri) {
        this.f218383b = Optional.m71637of(uri);
    }

    public C79595a(C79614t tVar) {
        C79596b bVar = (C79596b) tVar;
        this.f218382a = bVar.f218384a;
        this.f218383b = bVar.f218385b;
    }
}
