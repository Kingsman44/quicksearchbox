package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.engine.b.c.j;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.s */
/* compiled from: PG */
public final class C77887s extends C77569av {

    /* renamed from: a */
    public j f214571a;

    /* renamed from: b */
    private String f214572b;

    /* renamed from: c */
    private Instant f214573c;

    /* renamed from: d */
    private boolean f214574d;

    /* renamed from: e */
    private C77563ap f214575e;

    /* renamed from: f */
    private byte f214576f;

    /* renamed from: a */
    public final C77570aw mo72699a() {
        String str;
        Instant instant;
        j jVar;
        C77563ap apVar;
        if (this.f214576f == 1 && (str = this.f214572b) != null && (instant = this.f214573c) != null && (jVar = this.f214571a) != null && (apVar = this.f214575e) != null) {
            return new C77888t(str, instant, this.f214574d, jVar, apVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f214572b == null) {
            sb.append(" transcript");
        }
        if (this.f214573c == null) {
            sb.append(" instant");
        }
        if (this.f214576f == 0) {
            sb.append(" initial");
        }
        if (this.f214571a == null) {
            sb.append(" candidateIdentifier");
        }
        if (this.f214575e == null) {
            sb.append(" speakerInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72700b(boolean z) {
        this.f214574d = z;
        this.f214576f = 1;
    }

    /* renamed from: c */
    public final void mo72701c(Instant instant) {
        if (instant != null) {
            this.f214573c = instant;
            return;
        }
        throw new NullPointerException("Null instant");
    }

    /* renamed from: d */
    public final void mo72702d(C77563ap apVar) {
        if (apVar != null) {
            this.f214575e = apVar;
            return;
        }
        throw new NullPointerException("Null speakerInfo");
    }

    /* renamed from: e */
    public final void mo72703e(String str) {
        if (str != null) {
            this.f214572b = str;
            return;
        }
        throw new NullPointerException("Null transcript");
    }
}
