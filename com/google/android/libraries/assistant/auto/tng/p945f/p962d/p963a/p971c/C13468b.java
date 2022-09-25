package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13545u;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.b */
/* compiled from: PG */
final class C13468b extends C13495j {

    /* renamed from: a */
    private final C58833ax f41323a;

    /* renamed from: b */
    private final C58833ax f41324b;

    /* renamed from: c */
    private final C58833ax f41325c;

    /* renamed from: d */
    private final int f41326d;

    public C13468b(int i, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f41326d = i;
        this.f41323a = axVar;
        this.f41324b = axVar2;
        this.f41325c = axVar3;
    }

    /* renamed from: a */
    public final C58833ax mo21104a() {
        return this.f41325c;
    }

    /* renamed from: b */
    public final C58833ax mo21105b() {
        return this.f41323a;
    }

    /* renamed from: c */
    public final C58833ax mo21106c() {
        return this.f41324b;
    }

    /* renamed from: d */
    public final int mo21107d() {
        return this.f41326d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13495j) {
            C13495j jVar = (C13495j) obj;
            return this.f41326d == jVar.mo21107d() && this.f41323a.equals(jVar.mo21105b()) && this.f41324b.equals(jVar.mo21106c()) && this.f41325c.equals(jVar.mo21104a());
        }
    }

    public final int hashCode() {
        return ((((((this.f41326d ^ 1000003) * 1000003) ^ this.f41323a.hashCode()) * 1000003) ^ this.f41324b.hashCode()) * 1000003) ^ this.f41325c.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(C13545u.m29826a(this.f41326d));
        String valueOf = String.valueOf(this.f41323a);
        String valueOf2 = String.valueOf(this.f41324b);
        String valueOf3 = String.valueOf(this.f41325c);
        return "TcLibSmartActionGeneratorDataContainer{status=" + num + ", smartActionResponseOptional=" + valueOf + ", textClassifierLibOptional=" + valueOf2 + ", conversationActionsOptional=" + valueOf3 + "}";
    }
}
