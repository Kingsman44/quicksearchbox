package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3917i.p3918a.C51566ml;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.b */
/* compiled from: PG */
final class C36878b extends C36885i {

    /* renamed from: a */
    private final C51527l f96037a;

    /* renamed from: b */
    private final C51594nm f96038b;

    /* renamed from: c */
    private final C51566ml f96039c;

    public C36878b(C51527l lVar, C51594nm nmVar, C51566ml mlVar) {
        this.f96037a = lVar;
        this.f96038b = nmVar;
        this.f96039c = mlVar;
    }

    /* renamed from: a */
    public final C51527l mo40435a() {
        return this.f96037a;
    }

    /* renamed from: b */
    public final C51566ml mo40436b() {
        return this.f96039c;
    }

    /* renamed from: c */
    public final C51594nm mo40437c() {
        return this.f96038b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36885i) {
            C36885i iVar = (C36885i) obj;
            return this.f96037a.equals(iVar.mo40435a()) && this.f96038b.equals(iVar.mo40437c()) && this.f96039c.equals(iVar.mo40436b());
        }
    }

    public final int hashCode() {
        return ((((this.f96037a.hashCode() ^ 1000003) * 1000003) ^ this.f96038b.hashCode()) * 1000003) ^ this.f96039c.hashCode();
    }

    public final String toString() {
        String obj = this.f96037a.toString();
        String obj2 = this.f96038b.toString();
        String obj3 = this.f96039c.toString();
        return "ClockContextParamsHolder{alarmParams=" + obj + ", timerParams=" + obj2 + ", stopwatchParams=" + obj3 + "}";
    }
}
