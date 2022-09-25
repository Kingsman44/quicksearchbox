package com.google.android.apps.gsa.nga.engine.p6137s;

import com.google.assistant.p3897e.p3921j.C52091ex;

/* renamed from: com.google.android.apps.gsa.nga.engine.s.b */
/* compiled from: PG */
final class C77904b extends C77906d {

    /* renamed from: a */
    private final C52091ex f214624a;

    /* renamed from: b */
    private final int f214625b;

    public C77904b(C52091ex exVar, int i) {
        this.f214624a = exVar;
        this.f214625b = i;
    }

    /* renamed from: a */
    public final C52091ex mo72888a() {
        return this.f214624a;
    }

    /* renamed from: b */
    public final int mo72889b() {
        return this.f214625b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77906d) {
            C77906d dVar = (C77906d) obj;
            return this.f214624a.equals(dVar.mo72888a()) && this.f214625b == dVar.mo72889b();
        }
    }

    public final int hashCode() {
        return ((this.f214624a.hashCode() ^ 1000003) * 1000003) ^ this.f214625b;
    }

    public final String toString() {
        String obj = this.f214624a.toString();
        int i = this.f214625b;
        String str = i != 1 ? i != 2 ? "FLUID_ACTIONS" : "ON_DEVICE_POP" : "CLOUD_HANDOVER";
        return "ConversationParamsEntry{conversationParams=" + obj + ", conversationParamsSource=" + str + "}";
    }
}
