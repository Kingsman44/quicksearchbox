package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1024f;

import com.google.assistant.p3897e.p3921j.C51715bm;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.f.a */
/* compiled from: PG */
final class C13691a extends C13692b {

    /* renamed from: a */
    private final C51715bm f41777a;

    /* renamed from: b */
    private final C51715bm f41778b;

    public C13691a(C51715bm bmVar, C51715bm bmVar2) {
        this.f41777a = bmVar;
        this.f41778b = bmVar2;
    }

    /* renamed from: a */
    public final C51715bm mo21222a() {
        return this.f41778b;
    }

    /* renamed from: b */
    public final C51715bm mo21223b() {
        return this.f41777a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13692b) {
            C13692b bVar = (C13692b) obj;
            return this.f41777a.equals(bVar.mo21223b()) && this.f41778b.equals(bVar.mo21222a());
        }
    }

    public final int hashCode() {
        return ((this.f41777a.hashCode() ^ 1000003) * 1000003) ^ this.f41778b.hashCode();
    }

    public final String toString() {
        String obj = this.f41777a.toString();
        String obj2 = this.f41778b.toString();
        return "UnifiedAssistantRequestConfig{localAssistantDeviceCapabilities=" + obj + ", connectedAssistantDeviceCapabilities=" + obj2 + "}";
    }
}
