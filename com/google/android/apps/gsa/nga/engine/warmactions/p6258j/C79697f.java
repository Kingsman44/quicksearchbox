package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79485j;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.f */
/* compiled from: PG */
final class C79697f extends C79689br {

    /* renamed from: a */
    public j f218557a;

    /* renamed from: b */
    public C79485j f218558b;

    /* renamed from: c */
    public Optional f218559c = Optional.empty();

    /* renamed from: d */
    public Duration f218560d;

    /* renamed from: e */
    private String f218561e;

    /* renamed from: f */
    private C79574f f218562f;

    /* renamed from: g */
    private String f218563g;

    /* renamed from: a */
    public final C79690bs mo74189a() {
        String str;
        C79574f fVar;
        String str2;
        C79485j jVar;
        Duration duration;
        j jVar2 = this.f218557a;
        if (jVar2 != null && (str = this.f218561e) != null && (fVar = this.f218562f) != null && (str2 = this.f218563g) != null && (jVar = this.f218558b) != null && (duration = this.f218560d) != null) {
            return new C79698g(jVar2, str, fVar, str2, jVar, this.f218559c, duration);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f218557a == null) {
            sb.append(" candidateIdentifier");
        }
        if (this.f218561e == null) {
            sb.append(" query");
        }
        if (this.f218562f == null) {
            sb.append(" recognitionParams");
        }
        if (this.f218563g == null) {
            sb.append(" command");
        }
        if (this.f218558b == null) {
            sb.append(" triggeringContext");
        }
        if (this.f218560d == null) {
            sb.append(" endOfSpeechElapsedRealtime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74190b(String str) {
        if (str != null) {
            this.f218563g = str;
            return;
        }
        throw new NullPointerException("Null command");
    }

    /* renamed from: c */
    public final void mo74191c(String str) {
        if (str != null) {
            this.f218561e = str;
            return;
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: d */
    public final void mo74192d(C79574f fVar) {
        if (fVar != null) {
            this.f218562f = fVar;
            return;
        }
        throw new NullPointerException("Null recognitionParams");
    }
}
