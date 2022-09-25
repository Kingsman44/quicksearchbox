package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a;

import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.a.c */
/* compiled from: PG */
public final class C12177c extends C12181g {

    /* renamed from: a */
    public C58495hd f38882a;

    /* renamed from: b */
    public Optional f38883b = Optional.empty();

    /* renamed from: c */
    private C52081en f38884c;

    /* renamed from: a */
    public final C12182h mo20473a() {
        C58495hd hdVar;
        C52081en enVar = this.f38884c;
        if (enVar != null && (hdVar = this.f38882a) != null) {
            return new C12178d(enVar, hdVar, this.f38883b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f38884c == null) {
            sb.append(" conversationDelta");
        }
        if (this.f38882a == null) {
            sb.append(" clientOpMetadataMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo20474b(C52081en enVar) {
        if (enVar != null) {
            this.f38884c = enVar;
            return;
        }
        throw new NullPointerException("Null conversationDelta");
    }
}
