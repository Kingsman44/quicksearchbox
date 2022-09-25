package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e;

import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.assistant.p3897e.p3921j.C52091ex;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.e.a */
/* compiled from: PG */
public final class C33105a extends C33107c {

    /* renamed from: a */
    public C33144e f88629a;

    /* renamed from: b */
    private C32951d f88630b;

    /* renamed from: c */
    private C52091ex f88631c;

    /* renamed from: a */
    public final C33108d mo38529a() {
        C33144e eVar;
        C52091ex exVar;
        C32951d dVar = this.f88630b;
        if (dVar != null && (eVar = this.f88629a) != null && (exVar = this.f88631c) != null) {
            return new C33106b(dVar, eVar, exVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f88630b == null) {
            sb.append(" fluidActionsConfig");
        }
        if (this.f88629a == null) {
            sb.append(" fluidActionsAppFlowLogger");
        }
        if (this.f88631c == null) {
            sb.append(" conversationParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo38530b(C52091ex exVar) {
        if (exVar != null) {
            this.f88631c = exVar;
            return;
        }
        throw new NullPointerException("Null conversationParams");
    }

    /* renamed from: c */
    public final void mo38531c(C32951d dVar) {
        if (dVar != null) {
            this.f88630b = dVar;
            return;
        }
        throw new NullPointerException("Null fluidActionsConfig");
    }
}
