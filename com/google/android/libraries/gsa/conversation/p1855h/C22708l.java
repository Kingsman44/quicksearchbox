package com.google.android.libraries.gsa.conversation.p1855h;

import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.gsa.conversation.h.l */
/* compiled from: PG */
public final class C22708l extends C22688aa {

    /* renamed from: a */
    public final C58833ax f62508a;

    /* renamed from: b */
    public final C52091ex f62509b;

    public C22708l(C58833ax axVar, C52091ex exVar) {
        this.f62508a = axVar;
        if (exVar != null) {
            this.f62509b = exVar;
            return;
        }
        throw new NullPointerException("Null conversationParams");
    }

    /* renamed from: a */
    public final C52091ex mo27790a() {
        return this.f62509b;
    }

    /* renamed from: b */
    public final C58833ax mo27791b() {
        return this.f62508a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22688aa) {
            C22688aa aaVar = (C22688aa) obj;
            return this.f62508a.equals(aaVar.mo27791b()) && this.f62509b.equals(aaVar.mo27790a());
        }
    }

    public final int hashCode() {
        return ((this.f62508a.hashCode() ^ 1000003) * 1000003) ^ this.f62509b.hashCode();
    }

    public final String toString() {
        String obj = this.f62508a.toString();
        String obj2 = this.f62509b.toString();
        return "DeltaReceivedEventData{conversationEventId=" + obj + ", conversationParams=" + obj2 + "}";
    }
}
