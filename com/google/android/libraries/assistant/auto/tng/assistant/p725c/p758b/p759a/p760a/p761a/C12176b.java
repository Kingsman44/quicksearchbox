package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a;

import com.google.common.base.C58833ax;
import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.a.a.b */
/* compiled from: PG */
final class C12176b extends C12180f {

    /* renamed from: a */
    private final C57981b f38880a;

    /* renamed from: b */
    private final C58833ax f38881b;

    public C12176b(C57981b bVar, C58833ax axVar) {
        this.f38880a = bVar;
        this.f38881b = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo20468a() {
        return this.f38881b;
    }

    /* renamed from: b */
    public final C57981b mo20469b() {
        return this.f38880a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12180f) {
            C12180f fVar = (C12180f) obj;
            return this.f38880a.equals(fVar.mo20469b()) && this.f38881b.equals(fVar.mo20468a());
        }
    }

    public final int hashCode() {
        return ((this.f38880a.hashCode() ^ 1000003) * 1000003) ^ this.f38881b.hashCode();
    }

    public final String toString() {
        String obj = this.f38880a.toString();
        String valueOf = String.valueOf(this.f38881b);
        return "ConversationDeltaResponse{conversationDeltaStream=" + obj + ", offlineLoggingMetadata=" + valueOf + "}";
    }
}
