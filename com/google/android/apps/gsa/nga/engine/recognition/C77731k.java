package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.k */
/* compiled from: PG */
public final class C77731k extends C77550ac {

    /* renamed from: a */
    public String f214124a;

    /* renamed from: b */
    public Optional f214125b = Optional.empty();

    /* renamed from: c */
    private C77551ad f214126c;

    /* renamed from: d */
    private Optional f214127d = Optional.empty();

    /* renamed from: e */
    private Optional f214128e = Optional.empty();

    /* renamed from: f */
    private Optional f214129f = Optional.empty();

    /* renamed from: g */
    private Optional f214130g = Optional.empty();

    public C77731k() {
    }

    /* renamed from: a */
    public final C77552ae mo72603a() {
        C77551ad adVar;
        String str = this.f214124a;
        if (str != null && (adVar = this.f214126c) != null) {
            return new C77744l(str, adVar, this.f214127d, this.f214128e, this.f214129f, this.f214125b, this.f214130g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f214124a == null) {
            sb.append(" text");
        }
        if (this.f214126c == null) {
            sb.append(" sourceType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72604b(Optional optional) {
        if (optional != null) {
            this.f214125b = optional;
            return;
        }
        throw new NullPointerException("Null hypothesisScore");
    }

    /* renamed from: c */
    public final void mo72605c(Double d) {
        this.f214125b = Optional.m71637of(d);
    }

    /* renamed from: d */
    public final void mo72606d(int i) {
        this.f214129f = Optional.m71637of(Integer.valueOf(i));
    }

    /* renamed from: e */
    public final void mo72607e(Optional optional) {
        if (optional != null) {
            this.f214128e = optional;
            return;
        }
        throw new NullPointerException("Null originalHypothesis");
    }

    /* renamed from: f */
    public final void mo72608f(C77551ad adVar) {
        if (adVar != null) {
            this.f214126c = adVar;
            return;
        }
        throw new NullPointerException("Null sourceType");
    }

    /* renamed from: g */
    public final void mo72609g(C80581o oVar) {
        this.f214130g = Optional.m71637of(oVar);
    }

    /* renamed from: h */
    public final void mo72610h(String str) {
        if (str != null) {
            this.f214124a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public C77731k(C77552ae aeVar) {
        C77744l lVar = (C77744l) aeVar;
        this.f214124a = lVar.f214166a;
        this.f214126c = lVar.f214167b;
        this.f214127d = lVar.f214168c;
        this.f214128e = lVar.f214169d;
        this.f214129f = lVar.f214170e;
        this.f214125b = lVar.f214171f;
        this.f214130g = lVar.f214172g;
    }
}
