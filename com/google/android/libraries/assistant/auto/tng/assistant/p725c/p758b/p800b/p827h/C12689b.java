package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.b */
/* compiled from: PG */
final class C12689b extends C12692e {

    /* renamed from: a */
    private final C12093d f39747a;

    /* renamed from: b */
    private final C58833ax f39748b;

    /* renamed from: c */
    private final C58833ax f39749c;

    /* renamed from: d */
    private final C12991i f39750d;

    /* renamed from: e */
    private final C58833ax f39751e;

    /* renamed from: f */
    private final C60870cx f39752f;

    public C12689b(C12093d dVar, C58833ax axVar, C58833ax axVar2, C12991i iVar, C58833ax axVar3, C60870cx cxVar) {
        this.f39747a = dVar;
        this.f39748b = axVar;
        this.f39749c = axVar2;
        this.f39750d = iVar;
        this.f39751e = axVar3;
        this.f39752f = cxVar;
    }

    /* renamed from: a */
    public final C12093d mo20720a() {
        return this.f39747a;
    }

    /* renamed from: b */
    public final C12991i mo20721b() {
        return this.f39750d;
    }

    /* renamed from: c */
    public final C58833ax mo20722c() {
        return this.f39749c;
    }

    /* renamed from: d */
    public final C58833ax mo20723d() {
        return this.f39751e;
    }

    /* renamed from: e */
    public final C58833ax mo20724e() {
        return this.f39748b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12692e) {
            C12692e eVar = (C12692e) obj;
            return this.f39747a.equals(eVar.mo20720a()) && this.f39748b.equals(eVar.mo20724e()) && this.f39749c.equals(eVar.mo20722c()) && this.f39750d.equals(eVar.mo20721b()) && this.f39751e.equals(eVar.mo20723d()) && this.f39752f.equals(eVar.mo20726f());
        }
    }

    /* renamed from: f */
    public final C60870cx mo20726f() {
        return this.f39752f;
    }

    public final int hashCode() {
        return ((((((((((this.f39747a.hashCode() ^ 1000003) * 1000003) ^ this.f39748b.hashCode()) * 1000003) ^ this.f39749c.hashCode()) * 1000003) ^ this.f39750d.hashCode()) * 1000003) ^ this.f39751e.hashCode()) * 1000003) ^ this.f39752f.hashCode();
    }

    public final String toString() {
        String obj = this.f39747a.toString();
        String valueOf = String.valueOf(this.f39748b);
        String valueOf2 = String.valueOf(this.f39749c);
        String obj2 = this.f39750d.toString();
        String valueOf3 = String.valueOf(this.f39751e);
        String obj3 = this.f39752f.toString();
        return "VoiceInteractionParams{audioClient=" + obj + ", hotwordTrigger=" + valueOf + ", audioInjectionFilePath=" + valueOf2 + ", assistantRequestConfig=" + obj2 + ", audioListeningSessionConfig=" + valueOf3 + ", lastInteractionState=" + obj3 + "}";
    }
}
