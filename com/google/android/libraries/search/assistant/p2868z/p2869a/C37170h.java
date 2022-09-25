package com.google.android.libraries.search.assistant.p2868z.p2869a;

import com.google.assistant.p3861at.acx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.z.a.h */
/* compiled from: PG */
public final class C37170h extends C37166d {

    /* renamed from: a */
    private acx f96773a;

    /* renamed from: b */
    private final Optional f96774b = Optional.empty();

    /* renamed from: c */
    private String f96775c;

    /* renamed from: d */
    private final Optional f96776d = Optional.empty();

    /* renamed from: a */
    public final C37167e mo40676a() {
        String str;
        acx acx = this.f96773a;
        if (acx != null && (str = this.f96775c) != null) {
            return new C37171i(acx, this.f96774b, str, this.f96776d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f96773a == null) {
            sb.append(" settingsUiUpdate");
        }
        if (this.f96775c == null) {
            sb.append(" sourceId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo40677b(acx acx) {
        if (acx != null) {
            this.f96773a = acx;
            return;
        }
        throw new NullPointerException("Null settingsUiUpdate");
    }

    /* renamed from: c */
    public final void mo40678c(String str) {
        if (str != null) {
            this.f96775c = str;
            return;
        }
        throw new NullPointerException("Null sourceId");
    }
}
