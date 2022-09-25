package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e;

import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.assistant.p3897e.p3921j.C52091ex;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.e.b */
/* compiled from: PG */
final class C33106b extends C33108d {

    /* renamed from: a */
    private final C32951d f88632a;

    /* renamed from: b */
    private final C33144e f88633b;

    /* renamed from: c */
    private final C52091ex f88634c;

    public C33106b(C32951d dVar, C33144e eVar, C52091ex exVar) {
        this.f88632a = dVar;
        this.f88633b = eVar;
        this.f88634c = exVar;
    }

    /* renamed from: a */
    public final C32951d mo38532a() {
        return this.f88632a;
    }

    /* renamed from: b */
    public final C33144e mo38533b() {
        return this.f88633b;
    }

    /* renamed from: c */
    public final C52091ex mo38534c() {
        return this.f88634c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C33108d) {
            C33108d dVar = (C33108d) obj;
            return this.f88632a.equals(dVar.mo38532a()) && this.f88633b.equals(dVar.mo38533b()) && this.f88634c.equals(dVar.mo38534c());
        }
    }

    public final int hashCode() {
        return ((((this.f88632a.hashCode() ^ 1000003) * 1000003) ^ this.f88633b.hashCode()) * 1000003) ^ this.f88634c.hashCode();
    }

    public final String toString() {
        String obj = this.f88632a.toString();
        String obj2 = this.f88633b.toString();
        String obj3 = this.f88634c.toString();
        return "CommonRequestParamsHolder{fluidActionsConfig=" + obj + ", fluidActionsAppFlowLogger=" + obj2 + ", conversationParams=" + obj3 + "}";
    }
}
