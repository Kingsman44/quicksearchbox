package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.o */
/* compiled from: PG */
public final class C77875o extends C77561an {

    /* renamed from: a */
    public Optional f214526a = Optional.empty();

    /* renamed from: b */
    private boolean f214527b;

    /* renamed from: c */
    private C58485gu f214528c;

    /* renamed from: d */
    private Optional f214529d = Optional.empty();

    /* renamed from: e */
    private byte f214530e;

    /* renamed from: a */
    public final C77563ap mo72663a() {
        C58485gu guVar;
        if (this.f214530e == 1 && (guVar = this.f214528c) != null) {
            return new C77884p(this.f214526a, this.f214527b, guVar, this.f214529d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f214530e == 0) {
            sb.append(" isSpeakerEnrolled");
        }
        if (this.f214528c == null) {
            sb.append(" confidences");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72664b(Optional optional) {
        if (optional != null) {
            this.f214529d = optional;
            return;
        }
        throw new NullPointerException("Null accumulatedConfidence");
    }

    /* renamed from: c */
    public final void mo72665c(C58485gu guVar) {
        if (guVar != null) {
            this.f214528c = guVar;
            return;
        }
        throw new NullPointerException("Null confidences");
    }

    /* renamed from: d */
    public final void mo72666d(boolean z) {
        this.f214527b = z;
        this.f214530e = 1;
    }
}
