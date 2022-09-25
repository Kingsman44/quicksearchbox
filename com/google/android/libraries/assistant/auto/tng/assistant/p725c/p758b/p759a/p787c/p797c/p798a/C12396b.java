package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a;

import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.c.a.b */
/* compiled from: PG */
public final class C12396b extends C12393a {

    /* renamed from: a */
    private final C60870cx f39248a;

    /* renamed from: b */
    private final C60870cx f39249b;

    /* renamed from: c */
    private final C58833ax f39250c;

    /* renamed from: d */
    private final C58833ax f39251d;

    public C12396b(C60870cx cxVar, C60870cx cxVar2, C58833ax axVar, C58833ax axVar2) {
        this.f39248a = cxVar;
        this.f39249b = cxVar2;
        this.f39250c = axVar;
        this.f39251d = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo20571a() {
        return this.f39250c;
    }

    /* renamed from: b */
    public final C58833ax mo20572b() {
        return this.f39251d;
    }

    /* renamed from: c */
    public final C60870cx mo20573c() {
        return this.f39249b;
    }

    /* renamed from: d */
    public final C60870cx mo20574d() {
        return this.f39248a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12393a) {
            C12393a aVar = (C12393a) obj;
            return this.f39248a.equals(aVar.mo20574d()) && this.f39249b.equals(aVar.mo20573c()) && this.f39250c.equals(aVar.mo20571a()) && this.f39251d.equals(aVar.mo20572b());
        }
    }

    public final int hashCode() {
        return ((((((this.f39248a.hashCode() ^ 1000003) * 1000003) ^ this.f39249b.hashCode()) * 1000003) ^ this.f39250c.hashCode()) * 1000003) ^ this.f39251d.hashCode();
    }

    public final String toString() {
        String obj = this.f39248a.toString();
        String obj2 = this.f39249b.toString();
        String obj3 = this.f39250c.toString();
        String obj4 = this.f39251d.toString();
        return "AudioInputData{audioStreamChunkSource=" + obj + ", audioInputParams=" + obj2 + ", hotwordTrigger=" + obj3 + ", micOpenTime=" + obj4 + "}";
    }
}
