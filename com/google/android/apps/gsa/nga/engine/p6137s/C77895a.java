package com.google.android.apps.gsa.nga.engine.p6137s;

import com.google.assistant.p3897e.p3921j.C52091ex;

/* renamed from: com.google.android.apps.gsa.nga.engine.s.a */
/* compiled from: PG */
public final class C77895a extends C77905c {

    /* renamed from: a */
    public int f214599a;

    /* renamed from: b */
    private C52091ex f214600b;

    /* renamed from: a */
    public final C77906d mo72871a() {
        int i;
        C52091ex exVar = this.f214600b;
        if (exVar != null && (i = this.f214599a) != 0) {
            return new C77904b(exVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f214600b == null) {
            sb.append(" conversationParams");
        }
        if (this.f214599a == 0) {
            sb.append(" conversationParamsSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72872b(C52091ex exVar) {
        if (exVar != null) {
            this.f214600b = exVar;
            return;
        }
        throw new NullPointerException("Null conversationParams");
    }
}
