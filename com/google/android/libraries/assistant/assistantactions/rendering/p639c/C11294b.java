package com.google.android.libraries.assistant.assistantactions.rendering.p639c;

import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.c.b */
/* compiled from: PG */
final class C11294b extends C11298f {

    /* renamed from: a */
    private final C52507uh f36727a;

    /* renamed from: b */
    private final C51953ff f36728b;

    public C11294b(C52507uh uhVar, C51953ff ffVar) {
        this.f36727a = uhVar;
        this.f36728b = ffVar;
    }

    /* renamed from: a */
    public final C52507uh mo19712a() {
        return this.f36727a;
    }

    /* renamed from: b */
    public final C51953ff mo19713b() {
        return this.f36728b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11298f) {
            C11298f fVar = (C11298f) obj;
            return this.f36727a.equals(fVar.mo19712a()) && this.f36728b.equals(fVar.mo19713b());
        }
    }

    public final int hashCode() {
        return ((this.f36727a.hashCode() ^ 1000003) * 1000003) ^ this.f36728b.hashCode();
    }

    public final String toString() {
        String obj = this.f36727a.toString();
        String obj2 = this.f36728b.toString();
        return "FormData{showNativeFormContent=" + obj + ", showNativeFormArgs=" + obj2 + "}";
    }
}
