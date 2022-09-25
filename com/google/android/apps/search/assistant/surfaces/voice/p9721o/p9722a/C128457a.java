package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.a.a */
/* compiled from: PG */
final class C128457a extends C128459c {

    /* renamed from: a */
    private long f353307a;

    /* renamed from: b */
    private C128460d f353308b;

    /* renamed from: c */
    private C79570b f353309c;

    /* renamed from: d */
    private Optional f353310d = Optional.empty();

    /* renamed from: e */
    private byte f353311e;

    public C128457a() {
    }

    /* renamed from: a */
    public final C128461e mo108443a() {
        C128460d dVar;
        C79570b bVar;
        if (this.f353311e == 1 && (dVar = this.f353308b) != null && (bVar = this.f353309c) != null) {
            return new C128458b(this.f353307a, dVar, bVar, this.f353310d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f353311e == 0) {
            sb.append(" id");
        }
        if (this.f353308b == null) {
            sb.append(" status");
        }
        if (this.f353309c == null) {
            sb.append(" type");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo108444b(long j) {
        this.f353307a = j;
        this.f353311e = 1;
    }

    /* renamed from: c */
    public final void mo108445c(C128460d dVar) {
        if (dVar != null) {
            this.f353308b = dVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: d */
    public final void mo108446d(C79570b bVar) {
        if (bVar != null) {
            this.f353309c = bVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public C128457a(C128461e eVar) {
        C128458b bVar = (C128458b) eVar;
        this.f353307a = bVar.f353312a;
        this.f353308b = bVar.f353313b;
        this.f353309c = bVar.f353314c;
        this.f353310d = bVar.f353315d;
        this.f353311e = 1;
    }
}
