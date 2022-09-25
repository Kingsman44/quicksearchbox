package com.google.android.libraries.search.assistant.p2868z.p2869a;

import com.google.assistant.p3861at.acv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.z.a.f */
/* compiled from: PG */
public final class C37168f extends C37150a {

    /* renamed from: a */
    private acv f96763a;

    /* renamed from: b */
    private final Optional f96764b = Optional.empty();

    /* renamed from: c */
    private final Optional f96765c = Optional.empty();

    /* renamed from: d */
    private String f96766d;

    /* renamed from: e */
    private final Optional f96767e = Optional.empty();

    /* renamed from: a */
    public final C37164b mo40665a() {
        String str;
        acv acv = this.f96763a;
        if (acv != null && (str = this.f96766d) != null) {
            return new C37169g(acv, this.f96764b, this.f96765c, str, this.f96767e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f96763a == null) {
            sb.append(" settingsUiSelector");
        }
        if (this.f96766d == null) {
            sb.append(" sourceId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo40666b(acv acv) {
        if (acv != null) {
            this.f96763a = acv;
            return;
        }
        throw new NullPointerException("Null settingsUiSelector");
    }

    /* renamed from: c */
    public final void mo40667c(String str) {
        if (str != null) {
            this.f96766d = str;
            return;
        }
        throw new NullPointerException("Null sourceId");
    }
}
