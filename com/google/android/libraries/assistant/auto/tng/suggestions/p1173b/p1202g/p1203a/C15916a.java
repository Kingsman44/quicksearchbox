package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.a.a */
/* compiled from: PG */
public final class C15916a extends C15936f {

    /* renamed from: a */
    public C58833ax f47258a = C58836b.f156633a;

    /* renamed from: b */
    private C15937g f47259b;

    /* renamed from: c */
    private boolean f47260c;

    /* renamed from: d */
    private byte f47261d;

    /* renamed from: a */
    public final C15938h mo22602a() {
        C15937g gVar;
        if (this.f47261d == 1 && (gVar = this.f47259b) != null) {
            return new C15918b(gVar, this.f47258a, this.f47260c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f47259b == null) {
            sb.append(" triggerType");
        }
        if (this.f47261d == 0) {
            sb.append(" ignoreVisibilitySignals");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo22603b(boolean z) {
        this.f47260c = z;
        this.f47261d = 1;
    }

    /* renamed from: c */
    public final void mo22604c(C15937g gVar) {
        if (gVar != null) {
            this.f47259b = gVar;
            return;
        }
        throw new NullPointerException("Null triggerType");
    }
}
