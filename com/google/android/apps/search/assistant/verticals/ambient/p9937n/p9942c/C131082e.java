package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c;

import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.c.e */
/* compiled from: PG */
public final class C131082e extends C131078a {

    /* renamed from: a */
    public String f358534a;

    /* renamed from: b */
    public Optional f358535b = Optional.empty();

    /* renamed from: c */
    public C131079b f358536c;

    /* renamed from: d */
    public Instant f358537d;

    /* renamed from: e */
    private Instant f358538e;

    /* renamed from: a */
    public final C131080c mo110039a() {
        C131079b bVar;
        Instant instant;
        Instant instant2;
        String str = this.f358534a;
        if (str != null && (bVar = this.f358536c) != null && (instant = this.f358537d) != null && (instant2 = this.f358538e) != null) {
            return new C131083f(str, this.f358535b, bVar, instant, instant2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f358534a == null) {
            sb.append(" packageName");
        }
        if (this.f358536c == null) {
            sb.append(" eventType");
        }
        if (this.f358537d == null) {
            sb.append(" eventStart");
        }
        if (this.f358538e == null) {
            sb.append(" eventEnd");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo110040b(Instant instant) {
        if (instant != null) {
            this.f358538e = instant;
            return;
        }
        throw new NullPointerException("Null eventEnd");
    }
}
